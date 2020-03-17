package com.engaged.sitegui;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import static android.app.ProgressDialog.show;
import static com.engaged.sitegui.HandleHttp.postNumber;

public class MainActivity extends AppCompatActivity {

    private static String numberInput = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        LinearLayout linearLayout =  (LinearLayout) findViewById(R.id.linearlayout);
        GridLayout gl = new GridLayout(this);
        TextView tv = findViewById(R.id.textVinput);

        Button button0 = findViewById(R.id.button0);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button buttone = findViewById(R.id.buttone);






    }


    public void myClickHandler(View target)
    {

        TextView showNumbers = (TextView) findViewById(R.id.textVinput);

        switch (target.getId()) {
            case R.id.button0:
                if (numberInput.length() < 10)
                    showNumbers.setText(numberInput += "0");
                System.out.println(numberInput);
                break;
            case R.id.button1:
                if (numberInput.length() < 10)
                    showNumbers.setText(numberInput += "1");
                break;
            case R.id.button2:
                if (numberInput.length() < 10)
                    showNumbers.setText(numberInput += "2");
                break;
            case R.id.button3:
                if (numberInput.length() < 10)
                    showNumbers.setText(numberInput += "3");
                break;
            case R.id.button4:
                if (numberInput.length() < 10)
                    showNumbers.setText(numberInput += "4");
                break;
            case R.id.button5:
                if (numberInput.length() < 10)
                    showNumbers.setText(numberInput += "5");
                break;
            case R.id.button6:
                if (numberInput.length() < 10)
                    showNumbers.setText(numberInput += "6");
                break;
            case R.id.button7:
                if (numberInput.length() < 10)
                    showNumbers.setText(numberInput += "7");
                break;
            case R.id.button8:
                if (numberInput.length() < 10)
                    showNumbers.setText(numberInput += "8");
                break;
            case R.id.button9:
                if (numberInput.length() < 10)
                    showNumbers.setText(numberInput += "9");
                break;
            case R.id.buttone:
                if (numberInput.length() < 10)
                    Toast.makeText(this, "Please enter 10 digits", Toast.LENGTH_SHORT);
                else
                    postNumber(numberInput);
                break;

        }
    }


}