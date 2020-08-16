package com.engaged.sitegui;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Console;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.AuthFailureError;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.RequestFuture;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.squareup.picasso.*;

import org.json.JSONException;
import org.json.JSONObject;

import static com.android.volley.Request.Method.POST;

public class MainActivity extends AppCompatActivity {

    private static String numberInput = "";
    private String token = "";


    private String logoStr = "";
    private String leftSideStr = "https://host.engagedapps.com/friends1.jpg";
    String url = "https://api.engagedapps.com/auth";
    Context context;
    Activity activity;
    private String email = null;
    private String password = null;
    private String storeId = null;
    SavePreference mSavePreference = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("starting on create.......");
        mSavePreference = new SavePreference();

        Set<String> set = new HashSet<>();
        set = mSavePreference.getSavedPrefSet(MainActivity.this);
        for(String each: set)
        {
            JSONObject json = null;
            try {
               json = new JSONObject(each);
               if(json.has("email"))
               {
                   email = json.getString("email");
               }
               else if(json.has("password"))
               {
                   password = json.getString("password");
               }
               else if(json.has("storeID"))
               {
                   storeId = json.getString("storeID");
               }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        logoStr = "https://host.engagedapps.com/" + email + ".jpg";
        setContentView(R.layout.activity_main);
        context = getApplicationContext();
        activity = MainActivity.this;
        setContentView(R.layout.activity_main);
        ImageView imageViewLogo = findViewById(R.id.logoImage);
        ImageView imageViewLeftSide = findViewById(R.id.leftSideImage);
        Picasso.get().load(logoStr).resize(200,200).centerCrop().into(imageViewLogo);
        Picasso.get().load(leftSideStr).resize(550,400).centerCrop().into(imageViewLeftSide);
    }


    public void myClickHandler(View target) throws JSONException {
        final TextView showNumbers = findViewById(R.id.textVinput);
        Toast tooFewNumbersToast = Toast.makeText(this, "Please Enter 10 Numbers", Toast.LENGTH_LONG);
        tooFewNumbersToast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 0);

        View tooFewview = tooFewNumbersToast.getView();
        TextView tooFewTextView = (TextView) tooFewview.findViewById(android.R.id.message);
        tooFewTextView.setTextColor(Color.parseColor("#fc030b"));


        Toast TooManyNumbersToast = Toast.makeText(getApplicationContext(),
                "So Many Numbers!!! Please pick 10", Toast.LENGTH_SHORT);
        TooManyNumbersToast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 0);
        View tooManyview = TooManyNumbersToast.getView();
        TextView tooManyTextView = (TextView) tooManyview.findViewById(android.R.id.message);
        tooManyTextView.setTextColor(Color.parseColor("#fc030b"));

        final Toast SendSuccesToast = Toast.makeText(getApplicationContext(),
                "Sucess!! Prepare for wonderfulness!!", Toast.LENGTH_SHORT);
        SendSuccesToast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 0);
        View SendSuccesview = SendSuccesToast.getView();
        TextView SendSuccesTextView = (TextView) SendSuccesview.findViewById(android.R.id.message);
        SendSuccesTextView .setTextColor(Color.parseColor("#fc030b"));

        switch (target.getId()) {

            case R.id.button0:
                if (numberInput.length() < 16) {
                    if (numberInput.length() == 3 || numberInput.length() == 9) {
                        showNumbers.setText(numberInput += " - " + "0");
                    } else {
                        showNumbers.setText(numberInput += "0");
                    }
                } else {
                    String inputShort = numberInput.replace("-", "").replace(" ", "");
                    if(inputShort.equals("9189419189") ||inputShort.equals("91894191894") || inputShort.equals("918941918941"))
                    {
                        //do nothing
                    }
                    else
                    {
                        TooManyNumbersToast.show();
                    }
                }
                break;
            case R.id.button1:
                if (numberInput.length() < 16) {
                    if (numberInput.length() == 3 || numberInput.length() == 9) {
                        showNumbers.setText(numberInput += " - " + "1");
                    } else {
                        showNumbers.setText(numberInput += "1");
                    }
                } else {
                    String inputShort = numberInput.replace("-", "").replace(" ", "");
                    if(inputShort.equals("9189419189") ||inputShort.equals("91894191894") || inputShort.equals("918941918941"))
                    {
                        if(inputShort.equals("91894191894"))
                            showNumbers.setText(numberInput += "1");
                    }
                    else
                    {
                        TooManyNumbersToast.show();
                    }
                }
                break;
            case R.id.button2:
                if (numberInput.length() < 16) {
                    if (numberInput.length() == 3 || numberInput.length() == 9) {
                        showNumbers.setText(numberInput += " - " + "2");
                    } else {
                        showNumbers.setText(numberInput += "2");
                    }
                } else {
                    String inputShort = numberInput.replace("-", "").replace(" ", "");
                    if(inputShort.equals("9189419189") ||inputShort.equals("91894191894") || inputShort.equals("918941918941"))
                    {
                        //do nothing
                    }
                    else
                    {
                        TooManyNumbersToast.show();
                    }
                }
                break;
            case R.id.button3:
                if (numberInput.length() < 16) {
                    if (numberInput.length() == 3 || numberInput.length() == 9) {
                        showNumbers.setText(numberInput += " - " + "3");
                    } else {
                        showNumbers.setText(numberInput += "3");
                    }
                } else {
                    String inputShort = numberInput.replace("-", "").replace(" ", "");
                    if(inputShort.equals("9189419189") ||inputShort.equals("91894191894") || inputShort.equals("918941918941"))
                    {
                        //do nothing
                    }
                    else
                    {
                        TooManyNumbersToast.show();
                    }
                }
                break;
            case R.id.button4:
                if (numberInput.length() < 16) {
                    if (numberInput.length() == 3 || numberInput.length() == 9) {
                        showNumbers.setText(numberInput += " - " + "4");
                    } else {
                        showNumbers.setText(numberInput += "4");
                    }
                } else {
                    String inputShort = numberInput.replace("-", "").replace(" ", "");
                    if(inputShort.equals("9189419189") ||inputShort.equals("91894191894") || inputShort.equals("918941918941"))
                    {
                       if(inputShort.equals("9189419189"))
                           showNumbers.setText(numberInput += "4");
                    }
                    else
                    {
                        TooManyNumbersToast.show();
                    }
                }
                break;
            case R.id.button5:
                if (numberInput.length() < 16) {
                    if (numberInput.length() == 3 || numberInput.length() == 9) {
                        showNumbers.setText(numberInput += " - " + "5");
                    } else {
                        showNumbers.setText(numberInput += "5");
                    }
                } else {
                    String inputShort = numberInput.replace("-", "").replace(" ", "");
                    if(inputShort.equals("9189419189") ||inputShort.equals("91894191894") || inputShort.equals("918941918941"))
                    {

                        //do nothing
                    } else {
                        TooManyNumbersToast.show();
                    }
                }
                break;
            case R.id.button6:
                if (numberInput.length() < 16) {
                    if (numberInput.length() == 3 || numberInput.length() == 9) {
                        showNumbers.setText(numberInput += " - " + "6");
                    } else {
                        showNumbers.setText(numberInput += "6");
                    }
                } else {
                    String inputShort = numberInput.replace("-", "").replace(" ", "");
                    if(inputShort.equals("9189419189") ||inputShort.equals("91894191894") || inputShort.equals("918941918941"))
                    {
                        //do nothing
                    }
                    else
                    {
                        TooManyNumbersToast.show();
                    }
                }
                break;
            case R.id.button7:
                if (numberInput.length() < 16) {
                    if (numberInput.length() == 3 || numberInput.length() == 9) {
                        showNumbers.setText(numberInput += " - " + "7");
                    } else {
                        showNumbers.setText(numberInput += "7");
                    }
                } else {
                    String inputShort = numberInput.replace("-", "").replace(" ", "");
                    if(inputShort.equals("9189419189") ||inputShort.equals("91894191894") || inputShort.equals("918941918941"))
                    {
                        //do nothing
                    }
                    else
                    {
                        TooManyNumbersToast.show();
                    }
                }
                break;
            case R.id.button8:
                if (numberInput.length() < 16) {
                    if (numberInput.length() == 3 || numberInput.length() == 9) {
                        showNumbers.setText(numberInput += " - " + "8");
                    } else {
                        showNumbers.setText(numberInput += "8");
                    }
                } else {
                    String inputShort = numberInput.replace("-", "").replace(" ", "");
                    if(inputShort.equals("9189419189") ||inputShort.equals("91894191894") || inputShort.equals("918941918941"))
                    {
                        //do nothing
                    }
                    else
                    {
                        TooManyNumbersToast.show();
                    }

                }
                break;
            case R.id.button9:
                if (numberInput.length() < 16) {
                    if (numberInput.length() == 3 || numberInput.length() == 9) {
                        showNumbers.setText(numberInput += " - " + "9");
                    } else {
                        showNumbers.setText(numberInput += "9");
                    }
                } else
                    {
                        String inputShort = numberInput.replace("-", "").replace(" ", "");
                        if(inputShort.equals("9189419189") ||inputShort.equals("91894191894") || inputShort.equals("918941918941"))
                        {
                            //do nothing
                        }
                        else
                        {
                            TooManyNumbersToast.show();
                        }
                }
                break;
            case R.id.buttonr:
                showNumbers.setText(numberInput = "");
                break;
            case R.id.buttone:
                String inputShort = numberInput.replace("-", "").replace(" ", "");
                if (numberInput.length() < 16) {
                    tooFewNumbersToast.show();
                }
                else  if(inputShort.equals("9189419189") ||inputShort.equals("91894191894") || inputShort.equals("918941918941")  )
                {
                   if(inputShort.equals("918941918941"))
                   {
                       LoginActivity.setReset(true);
                       startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                   }
                }
                else {
                    try
                    {
                        final RequestQueue mRequestQueue = Volley.newRequestQueue(MainActivity.this);
                        StringRequest postRequest = new StringRequest(POST, url,
                                new Response.Listener<String>()
                                {
                                    @Override
                                    public void onResponse(String response) {
                                        // response
                                        System.out.println("response is.....: " + response);
                                        try {
                                            JSONObject json = new JSONObject(response);
                                            token = json.getString("token");
                                            System.out.println("token is....." + token);
                                            String numToSend = numberInput.replace(" ", "").replace("-","");
                                            String custURL = "https://api.engagedapps.com/customer/addCustomer/" + storeId + "/+" + numToSend;
                                            StringRequest newRequest = new StringRequest(POST, custURL, new Response.Listener<String>() {
                                                @Override
                                                public void onResponse(String response) {
                                                    if (!response.equals(null)) {
                                                        SendSuccesToast.show();
                                                        showNumbers.setText(numberInput = "");
                                                    } else {
                                                    }
                                                }
                                            }, new Response.ErrorListener() {
                                                @Override
                                                public void onErrorResponse(VolleyError error) {
                                                    System.out.println("error sending customer: " + error.toString());
                                                }
                                            }) {
                                                @Override
                                                public Map<String, String> getHeaders() throws AuthFailureError {
                                                    Map<String, String> params = new HashMap<String, String>();
                                                    params.put("Authorization", "Bearer "+ token);
                                                    return params;
                                                }
                                            };
                                            mRequestQueue.add(newRequest);
                                        } catch (JSONException e) {
                                            e.printStackTrace();
                                        }

                                    }
                                },
                                new Response.ErrorListener()
                                {
                                    @Override
                                    public void onErrorResponse(VolleyError error) {
                                        // error

                                    }
                                }
                        ) {
                            @Override
                            protected Map<String, String> getParams()
                            {
                                Map<String, String>  params = new HashMap<String, String>();
                                params.put("email", email);
                                params.put("password", password);

                                return params;
                            }
                        };
                        mRequestQueue.add(postRequest);
                    }
                    catch(Exception e)
                    {
                        System.out.println("exception: " + e.getMessage());
                    }

                    break;
                }
        }
    }
}