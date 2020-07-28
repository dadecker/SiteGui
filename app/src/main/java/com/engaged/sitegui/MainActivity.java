package com.engaged.sitegui;


import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.RequestFuture;
import com.android.volley.toolbox.Volley;
import com.squareup.picasso.*;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    private static String numberInput = "";
    private String token = "";

    RequestQueue mRequestQueue = null;
    private String logoStr = "";
    private String leftSideStr = "https://host.engagedapps.com/friends1.jpg";
    String url = "https://api.engagedapps.com/api/auth";
    Context context;
    Activity activity;
    private String email = null;
    private String password = null;
    private String storeId = null;
    SavePreference mSavePreference = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mSavePreference = new SavePreference();
        mRequestQueue = Volley.newRequestQueue(MainActivity.this);
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
        TextView showNumbers = findViewById(R.id.textVinput);
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

        switch (target.getId()) {

            case R.id.button0:
                if (numberInput.length() < 16) {
                    if (numberInput.length() == 3 || numberInput.length() == 9) {
                        showNumbers.setText(numberInput += " - " + "0");
                    } else {
                        showNumbers.setText(numberInput += "0");
                    }
                } else {
                    TooManyNumbersToast.show();
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
                    TooManyNumbersToast.show();
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
                    TooManyNumbersToast.show();
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
                    TooManyNumbersToast.show();
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
                    TooManyNumbersToast.show();
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
                    TooManyNumbersToast.show();
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
                    TooManyNumbersToast.show();
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
                    TooManyNumbersToast.show();
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
                    TooManyNumbersToast.show();
                }
                break;
            case R.id.button9:
                if (numberInput.length() < 16) {
                    if (numberInput.length() == 3 || numberInput.length() == 9) {
                        showNumbers.setText(numberInput += " - " + "9");
                    } else {
                        showNumbers.setText(numberInput += "9");
                    }
                } else {
                    TooManyNumbersToast.show();
                }
                break;
            case R.id.buttonr:
                showNumbers.setText(numberInput = "");
                break;
            case R.id.buttone:
                if (numberInput.length() < 16) {
                    tooFewNumbersToast.show();
                } else {
                    try
                    {
                        JSONObject jsonBody = new JSONObject();
                        jsonBody.put("email", email);
                        jsonBody.put("password", password);

                        //JSONObject jsonRequest = new JSONObject();
                        //jsonRequest.put("body", jsonBody);
                        RequestFuture<JSONObject> fr = RequestFuture.newFuture();
                        JsonObjectRequest request = new JsonObjectRequest(url, new JSONObject(jsonBody.toString()), fr, fr);
                        ApplicationController.getInstance().addToRequestQueue(request);
                        JSONObject response = new JSONObject();
                        try{
                            response = fr.get();
                            System.out.println("response: " + response.toString());
                        }
                        catch(Exception e)
                        {
                            System.out.println("exception: "+ e.getMessage());
                        }

                        if(response.has("token"))
                        {
                            token = response.getJSONObject("body").get("token").toString();
                            String custUrl = url + "https://api.engagedapps.com/api/customer/addCustomer/" + storeId + "/+" + numberInput;
                            RequestFuture<JSONObject> fr2 = RequestFuture.newFuture();
                            JsonObjectRequest request2 = new JsonObjectRequest(url, new JSONObject(response.toString()), fr2, fr2);
                            ApplicationController.getInstance().addToRequestQueue(request2);
                            JSONObject response2 = new JSONObject();
                            try{
                                response2 = fr2.get();
                                System.out.println("response: " + response2.toString());
                            }
                            catch(Exception e)
                            {
                                System.out.println("exception: "+ e.getMessage());
                            }
                        }
                    }
                    catch(Exception e)
                    {
                        System.out.println("exception: " + e.getMessage());
                    }

                    break;
                }
        }
    }


//    private Void getToken() throws JSONException {
//        if (numberInput.length() < 16) {
//            Toast tooFewNumbersToast = Toast.makeText(this, "Please Enter 10 Numbers", Toast.LENGTH_LONG);
//            tooFewNumbersToast.setGravity(Gravity.TOP| Gravity.CENTER_HORIZONTAL, 0, 0);
//            View tooFewview = tooFewNumbersToast.getView();
//            TextView tooFewTextView = (TextView) tooFewview.findViewById(android.R.id.message);
//            tooFewTextView.setTextColor(Color.parseColor("#fc030b"));
//            return null;
//        }
//        JSONObject jsonBody = new JSONObject();
//        jsonBody.put("email", email);
//        jsonBody.put("password", password);
//
//        JSONObject jsonRequest = new JSONObject();
//        jsonRequest.put("body", jsonBody);
//        JsonObjectRequest req = new JsonObjectRequest(url, jsonRequest,
//                new Response.Listener<JSONObject>() {
//                    @Override
//                    public void onResponse(JSONObject response) {
//                        try {
//                            token = response.getJSONObject("body").get("token").toString();
//                            Toast tokenSucces = Toast.makeText(getApplicationContext(),
//                                    response.toString(), Toast.LENGTH_SHORT);
//                            tokenSucces.setGravity(Gravity.TOP| Gravity.CENTER_HORIZONTAL, 0, 0);
//                            View tokenSuccesView = tokenSucces.getView();
//                            TextView tokenSuccesTextView = (TextView) tokenSuccesView.findViewById(android.R.id.message);
//                            tokenSuccesTextView.setTextColor(Color.parseColor("#fc030b"));
//                            tokenSucces.show();
//                            VolleyLog.v("Response:%n %s", response.toString(4));
//                        } catch (JSONException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                VolleyLog.e("Error: ", error.getMessage());
//            }
//        });
//
//        ApplicationController.getInstance().addToRequestQueue(req);
//
//        if(token != null)
//        {
//            String custUrl = url + "https://api.engagedapps.com/api/customer/addCustomer/" + storeId + "/+" + this.numberInput;
//            JsonObjectRequest req2 = new JsonObjectRequest(url, new JSONObject(),
//                    new Response.Listener<JSONObject>() {
//                        @Override
//                        public void onResponse(JSONObject response) {
//                            try {
//
//                                Toast tokenSucces = Toast.makeText(getApplicationContext(),
//                                        response.toString(), Toast.LENGTH_SHORT);
//                                tokenSucces.setGravity(Gravity.TOP| Gravity.CENTER_HORIZONTAL, 0, 0);
//                                View tokenSuccesView = tokenSucces.getView();
//                                TextView tokenSuccesTextView = (TextView) tokenSuccesView.findViewById(android.R.id.message);
//                                tokenSuccesTextView.setTextColor(Color.parseColor("#fc030b"));
//                                tokenSucces.show();
//                                VolleyLog.v("Response:%n %s", response.toString(4));
//                            } catch (JSONException e) {
//                                e.printStackTrace();
//                            }
//                        }
//                    }, new Response.ErrorListener() {
//                @Override
//                public void onErrorResponse(VolleyError error) {
//                    VolleyLog.e("Error: ", error.getMessage());
//                }
//            });
//            ApplicationController.getInstance().addToRequestQueue(req2);
//        }
//
//
//        return null;
//    }



}