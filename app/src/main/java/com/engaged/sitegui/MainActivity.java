package com.engaged.sitegui;


import android.accounts.AccountManager;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class MainActivity extends AppCompatActivity {

    private static String numberInput = "";
    Context context;
    Activity activity;
    CoordinatorLayout coordinatorLayout;
    Button downloadbutton;
    ImageView imageViewLogo;
    ImageView imageViewLeftSide;
    ProgressDialog mProgressDialog;
    URL url;
    AsyncTask mMyTask;
    AsyncTask mTaskTwo;
    Bitmap resizedBM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext();
        activity = MainActivity.this;
        AccountManager accountManager = AccountManager.get(this);
        setContentView(R.layout.activity_main);
        mProgressDialog = new ProgressDialog(activity);
        mProgressDialog.setIndeterminate(true);
        mProgressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        mProgressDialog.setTitle("AsyncTask");
        mProgressDialog.setMessage("Please wait, we are downloading your image file...");
        URL logoURL = logoToUrl();
        URL leftURL = leftSideImageToUrl();
        mMyTask = new DownloadTask().execute(logoURL, leftURL);
        imageViewLogo = findViewById(R.id.logoImage);
        imageViewLeftSide = findViewById(R.id.leftSideImage);

    }


    public void myClickHandler(View target)
    {

        TextView showNumbers = findViewById(R.id.textVinput);
        Toast tooFewNumbersToast = Toast.makeText(this, "Please Enter 10 Numbers", Toast.LENGTH_LONG);
        tooFewNumbersToast.setGravity(Gravity.TOP| Gravity.CENTER_HORIZONTAL, 0, 0);

        View tooFewview = tooFewNumbersToast.getView();
        TextView tooFewTextView = (TextView) tooFewview.findViewById(android.R.id.message);
        tooFewTextView.setTextColor(Color.parseColor("#fc030b"));


        Toast TooManyNumbersToast= Toast.makeText(getApplicationContext(),
                "So Many Numbers!!! Please pick 10", Toast.LENGTH_SHORT);
        TooManyNumbersToast.setGravity(Gravity.TOP| Gravity.CENTER_HORIZONTAL, 0, 0);
        View tooManyview = TooManyNumbersToast.getView();
        TextView tooManyTextView = (TextView) tooManyview.findViewById(android.R.id.message);
        tooManyTextView.setTextColor(Color.parseColor("#fc030b"));

        switch (target.getId())
        {

            case R.id.button0:
                if (numberInput.length() < 16)
                {
                    if (numberInput.length() == 3 || numberInput.length() == 9)
                    {
                        showNumbers.setText(numberInput += " - " + "0");
                    }
                    else
                    {
                        showNumbers.setText(numberInput += "0");
                    }
                }
                else
                {
                    TooManyNumbersToast.show();
                }
                break;
                case R.id.button1:
                    if (numberInput.length() < 16)
                    {
                        if (numberInput.length() == 3 || numberInput.length() == 9)
                        {
                            showNumbers.setText(numberInput += " - " + "1");
                        }
                        else
                        {
                            showNumbers.setText(numberInput += "1");
                        }
                    }
                    else
                    {
                        TooManyNumbersToast.show();
                    }
                    break;
            case R.id.button2:
                if (numberInput.length() < 16)
                {
                    if (numberInput.length() == 3 || numberInput.length() == 9)
                    {
                        showNumbers.setText(numberInput += " - " + "2");
                    }
                    else
                    {
                        showNumbers.setText(numberInput += "2");
                    }
                }
                else
                {
                    TooManyNumbersToast.show();
                }
                break;
            case R.id.button3:
                if (numberInput.length() < 16)
                {
                    if (numberInput.length() == 3 || numberInput.length() == 9)
                    {
                        showNumbers.setText(numberInput += " - " + "3");
                    }
                    else
                    {
                        showNumbers.setText(numberInput += "3");
                    }
                }
                else
                {
                    TooManyNumbersToast.show();
                }
                break;
            case R.id.button4:
                if (numberInput.length() < 16)
                {
                    if (numberInput.length() == 3 || numberInput.length() == 9)
                    {
                        showNumbers.setText(numberInput += " - " + "4");
                    }
                    else
                    {
                        showNumbers.setText(numberInput += "4");
                    }
                }
                else
                {
                    TooManyNumbersToast.show();
                }
                break;
            case R.id.button5:
                if (numberInput.length() < 16)
                {
                    if (numberInput.length() == 3 || numberInput.length() == 9)
                    {
                        showNumbers.setText(numberInput += " - " + "5");
                    }
                    else
                    {
                        showNumbers.setText(numberInput += "5");
                    }
                }
                else
                {
                    TooManyNumbersToast.show();
                }
                break;
            case R.id.button6:
                if (numberInput.length() < 16)
                {
                    if (numberInput.length() == 3 || numberInput.length() == 9)
                    {
                        showNumbers.setText(numberInput += " - " + "6");
                    }
                    else
                    {
                        showNumbers.setText(numberInput += "6");
                    }
                }
                else
                {
                    TooManyNumbersToast.show();
                }
                break;
            case R.id.button7:
                if (numberInput.length() < 16)
                {
                    if (numberInput.length() == 3 || numberInput.length() == 9)
                    {
                        showNumbers.setText(numberInput += " - " + "7");
                    }
                    else
                    {
                        showNumbers.setText(numberInput += "7");
                    }
                }
                else
                {
                    TooManyNumbersToast.show();
                }
                break;
            case R.id.button8:
                if (numberInput.length() < 16)
                {
                    if (numberInput.length() == 3 || numberInput.length() == 9)
                    {
                        showNumbers.setText(numberInput += " - " + "8");
                    }
                    else
                    {
                        showNumbers.setText(numberInput += "8");
                    }
                }
                else
                {
                    TooManyNumbersToast.show();
                }
                break;
            case R.id.button9:
                if (numberInput.length() < 16)
                {
                    if (numberInput.length() == 3 || numberInput.length() == 9)
                    {
                        showNumbers.setText(numberInput += " - " + "9");
                    }
                    else
                    {
                        showNumbers.setText(numberInput += "9");
                    }
                }
                else
                {
                    TooManyNumbersToast.show();
                }
                break;
            case R.id.buttone:
                if (numberInput.length() < 16) {
                    tooFewNumbersToast.show();
                }
                else
                {
                    //postNumber(numberInput);
                }
                break;
            case R.id.buttonr:
                showNumbers.setText(numberInput = "");

        }
    }

    private class DownloadTask extends AsyncTask<URL,Void,Bitmap>{
        protected void onPreExecute(){
            mProgressDialog.show();
        }
        protected Bitmap doInBackground(URL... urls){
            HttpURLConnection connection = null;
            URL logoURL = urls[0];
            URL leftURL = urls[1];
            try{
                connection = (HttpURLConnection) logoURL.openConnection();
                connection.connect();
                InputStream inputStream = connection.getInputStream();
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                Bitmap logoBitmap = BitmapFactory.decodeStream(bufferedInputStream);
                connection = (HttpURLConnection) leftURL.openConnection();
                connection.connect();
                InputStream lInputStream = connection.getInputStream();
                BufferedInputStream lBufferedInputStream = new BufferedInputStream(lInputStream);
                Bitmap leftBitmap = BitmapFactory.decodeStream(lBufferedInputStream);
                List<Bitmap> bitmapList = new ArrayList<>();
                bitmapList.add(logoBitmap);
                bitmapList.add(leftBitmap);
                return bitmapList;
            }catch(IOException e){
                e.printStackTrace();
            }
            return null;
        }
        // When all async task done
        protected void onPostExecute(Bitmap result){
            // Hide the progress dialog
            mProgressDialog.dismiss();
            if(result!=null){
                //resizedBM = getResizedBitmap(result, 40, 40);
                resizedBM = result.createScaledBitmap(result, 150,150, true);
                imageViewLogo.setImageBitmap(resizedBM);
            } else {
                // Notify user that an error occurred while downloading image
                Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
            }
        }
    }
    protected URL logoToUrl() {
        try {
            url = new URL("https://app-images-central.s3.us-east-2.amazonaws.com/logo/engaged_logo_green.png");
            return url;
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }

    protected URL leftSideImageToUrl() {
        try {
            url = new URL("https://app-images-central.s3.us-east-2.amazonaws.com/neighbors.jpg");
            return url;
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }
}