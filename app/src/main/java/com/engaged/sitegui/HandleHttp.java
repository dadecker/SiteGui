package com.engaged.sitegui;

import android.app.Activity;
import android.media.Image;
import android.os.Environment;


import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class HandleHttp extends Activity
{
    private static String STORE_NUMBER = "";

    public static void getImageForLocation()
    {



    }


    public static void postNumber(String strnumber)
    {
        Integer number = Integer.valueOf(strnumber);
        JSONObject json = new JSONObject();
        java.io.BufferedReader reader = null;
        String strResponse = null;
        try
        {
            json.put("location", STORE_NUMBER);
            json.put("phoneNumber", number);
            // Defined URL  where to send data
            URL url = new URL("our endpoint");


        }
        catch(Exception ex)
        {

        }
        finally
        {
            try
            {
                reader.close();
            }

            catch(Exception ex) {}
        }
    }

    public static void getLogoFromServer() throws IOException  {
        URL obj = new URL("server url");
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User", STORE_NUMBER);
        StringBuffer response = new StringBuffer();
        int responseCode = con.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;


            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // print result
            System.out.println(response.toString());
        } else {
            System.out.println("GET request failed");
        }
        JSONObject json = null;
        Image img = null;
        try {
            json = new JSONObject(response.toString());
            if(json.has("body"))
            {
                json.get("body");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }


}
