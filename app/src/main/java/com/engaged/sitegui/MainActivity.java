package com.engaged.sitegui;


import com.bumptech.glide.Glide;
import com.engaged.sitegui.ImageAdapter;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import static com.engaged.sitegui.HandleHttp.postNumber;

public class MainActivity extends AppCompatActivity {

    private static String numberInput = "";
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ImageView imageView = findViewById(R.id.logoImage);
        setContentView(R.layout.activity_main);

        //ImageView backgroundImage = null;
        try{
            //ImageAdapter.ResizeImage(backgroundImage, "arn:aws:s3:us-east-2:864435084730:accesspoint/get-images/background/cafe2.jpg");
            ImageAdapter.ResizeImage(imageView, "arn:aws:s3:us-east-2:864435084730:accesspoint/get-images/logo/engaged_logo_green.png");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }


    }


    public void myClickHandler(View target)
    {

        TextView showNumbers = findViewById(R.id.textVinput);


        Toast tooFewNumbersToast = Toast.makeText(this, "Please Enter 10 Numbers", Toast.LENGTH_LONG);
        tooFewNumbersToast.setGravity(Gravity.TOP| Gravity.CENTER_HORIZONTAL, 0, 0);

        View tooFewview = tooFewNumbersToast.getView();
        //view.setBackgroundResource(R.drawable.custom_background);
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