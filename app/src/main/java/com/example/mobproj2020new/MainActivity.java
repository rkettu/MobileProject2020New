package com.example.mobproj2020new;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.graphics.Color;

import android.widget.EditText;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    EditText userEdit;
    EditText passEdit;

    String userNameStr = "";
    String passwordStr = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      
      Button dbTestButton = (Button) findViewById(R.id.myDbBtn);
        dbTestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DbTestActivity.class);
                startActivity(intent);
            }
        });
      
        userEdit = findViewById(R.id.usernameEdit);
        passEdit = findViewById(R.id.passwordEdit);
    }

    //Login button press
    public void login(View V){
        if (userEdit != null && userEdit.length() > 0){

        }else {
            noEntry(userEdit);
        }
        if(passEdit != null && passEdit.length() > 0){

        }else {
            noEntry(passEdit);
        }
    }

    //SignUp button press
    public void signUp(View v){
        Intent signUpIntent = new Intent(this, SignUp.class);
        startActivity(signUpIntent);
    }

    //execute if username or password is empty
    public void noEntry(EditText et){
        et.setText("");
        et.setHintTextColor(Color.parseColor("#B75252"));
        if (et.getId() == R.id.usernameEdit) userEdit.setHint("Username*");
        else passEdit.setHint("Password*");
    }

    //Exit app with pressing back putton on your phone
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        return;
    }
}
