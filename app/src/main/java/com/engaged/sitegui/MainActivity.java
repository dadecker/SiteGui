package com.engaged.sitegui;


import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.net.URL;
import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.*;

public class MainActivity extends AppCompatActivity {

    private static String numberInput = "";
    private String logoStr = "https://app-images-central.s3.us-east-2.amazonaws.com/logo1.png";
    private String leftSideStr = "https://app-images-central.s3.us-east-2.amazonaws.com/friends1.jpg";
    Context context;
    Activity activity;
    URL url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext();
        activity = MainActivity.this;
        setContentView(R.layout.activity_main);
        ImageView imageViewLogo = findViewById(R.id.logoImage);
        ImageView imageViewLeftSide = findViewById(R.id.leftSideImage);
        Picasso.get().load(logoStr).resize(200,200).centerCrop().into(imageViewLogo);
        Picasso.get().load(leftSideStr).resize(550,400).centerCrop().into(imageViewLeftSide);

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

}