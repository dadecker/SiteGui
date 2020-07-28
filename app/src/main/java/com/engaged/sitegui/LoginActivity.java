package com.engaged.sitegui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;

import androidx.appcompat.app.AppCompatActivity;


public class LoginActivity extends AppCompatActivity  {

    Button login;
    EditText email,password,storeID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        storeID = (EditText) findViewById(R.id.storeID);
        login = (Button) findViewById(R.id.login);



    }

    @Override
    public void onStart() {
        super.onStart();
        SavePreference mSavePreference = new SavePreference();
        if(mSavePreference.getSavedPrefSet(LoginActivity.this) != null){
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
        }
    }



    public void loginUser(View view) throws JSONException {
        String email_string = email.getText().toString().trim();
        String password_string = password.getText().toString().trim();
        String storeID_string = storeID.getText().toString().trim();
        SavePreference savePreference = new SavePreference();
        if(TextUtils.isEmpty(email_string)){
            Toast.makeText(this, "Please enter email", Toast.LENGTH_SHORT).show();
            return;
        }
        else
        {
            savePreference.setUserName(email_string);
        }

        if(TextUtils.isEmpty(password_string)){
            Toast.makeText(this, "Please enter password", Toast.LENGTH_SHORT).show();
            return;
        }
        else
        {
            savePreference.setPrefPassword( password_string);
        }

        if(TextUtils.isEmpty(storeID_string)){
            Toast.makeText(this, "Please enter StoreID", Toast.LENGTH_SHORT).show();
            return;
        }
        else
        {
            savePreference.setPrefStoreNumber(this, storeID_string);
        }

        startActivity(new Intent(getApplicationContext(), MainActivity.class));

    }


}