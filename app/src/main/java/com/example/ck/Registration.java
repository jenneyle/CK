package com.example.ck;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.se.omapi.Session;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.example.ck.SessionData;

public class Registration extends AppCompatActivity {

   public final static String NEW_USERNAME = "com.example.ck.new_username";
    public final static String NEW_PASSWORD = "com.example.ck.new_password";

    EditText etUser;
    EditText etPass;
    EditText etConfirmPass;
    public Button button;



    //TODO: error message

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);


        SessionData.createDB(this.getApplicationContext());

        etUser = findViewById(R.id.rego_username);
        etPass = findViewById(R.id.rego_pass);
        etConfirmPass = findViewById(R.id.rego_pass_confirm);
        button =  (Button) findViewById(R.id.rego_button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "clicked rego", Toast.LENGTH_LONG).show();

                if (SessionData.mUserDatabase.mUserDao().fetchOneUserByUserName(etUser.getText().toString()) != null) {
                } else {

                    User user = new User(etUser.getText().toString(), etPass.getText().toString(), 0);


                    SessionData.mUserDatabase.mUserDao().insertNewUser(user);


                    System.out.println(String.format("LOGIN DETAILS PASSED \nUsername: %s \nPassword: %s \nPasswrod: %s",
                            etUser.getText(), etPass.getText(), etConfirmPass.getText()));


                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
//
                }
            }
        });

        ConstraintLayout linearLayout = findViewById(R.id.Regolayout);
        AnimationDrawable animationDrawable = (AnimationDrawable) linearLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(2000);
        animationDrawable.start();


    }




}
