package com.engaged.touchpad;

import android.content.Context;
import android.os.AsyncTask;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MyAsyncTask extends AsyncTask<Context, Void, String> {
    public String getToken()
    {
        String token = doInBackground();
        return token;
    }

    @Override
    protected String doInBackground(Context... contexts) {
        final String token = "";
        Context context = contexts[0];
        RequestQueue queue = Volley.newRequestQueue(context);
//        String requestBody = "{ 'email':" + email +
//                ", 'password': " + password + "}";

        String url = "https://api.engagedapps.com/api/auth";

        // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        queue.add(stringRequest);

        return null;
    }


}
