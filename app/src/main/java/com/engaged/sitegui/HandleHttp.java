package com.engaged.sitegui;

import android.app.Activity;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;

public class HandleHttp extends Activity
{





    public static void postNumber(String strnumber)
    {

        Integer number = Integer.valueOf(strnumber);
        JSONObject json = new JSONObject();
        java.io.BufferedReader reader = null;
        String strResponse = null;
        try
        {
            json.put("location", 24446);
            json.put("phoneNumber", number);
            // Defined URL  where to send data
            URL url = new URL("our endpoint");

            // Send POST data request

            URLConnection conn = url.openConnection();
            conn.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(json.toString());
            wr.flush();

            // Get the server response

            reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line = null;

            // Read Server Response
            while((line = reader.readLine()) != null)
            {
                // Append server response in string
                sb.append(line + "\n");
            }


            strResponse = sb.toString();
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




}
