package com.engaged.sitegui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    Button login;
    EditText email,password;
    TextView goBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);




        goBack= (TextView) findViewById(R.id.goBack);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);

        goBack.setOnClickListener(this);
        login.setOnClickListener(this);

    }

    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(this, "starting onStart()", Toast.LENGTH_SHORT).show();
        String currentUser = SavePreference.getUserName(LoginActivity.this);
        if(currentUser != null){
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
        }
    }

    private void loginUser() {
        String email_string = email.getText().toString().trim();
        SavePreference.setUserName(LoginActivity.this, email_string);
        String password_string = password.getText().toString().trim();

        if(TextUtils.isEmpty(email_string)){
            Toast.makeText(this, "Please enter email", Toast.LENGTH_SHORT).show();
            return;
        }

        if(TextUtils.isEmpty(password_string)){
            Toast.makeText(this, "Please enter password", Toast.LENGTH_SHORT).show();
            return;
        }

    }

    @Override
    public void onClick(View view) {
        if(view == login){
            loginUser();
        }

        if(view == goBack){
            finish();
            startActivity(new Intent(this, MainActivity.class));
        }
    }
}