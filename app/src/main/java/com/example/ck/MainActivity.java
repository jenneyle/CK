package com.example.ck;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ck.R;



public class MainActivity extends AppCompatActivity {
    public boolean usrExist = false;

    private EditText username;
    private EditText password;
    private TextView info;
    private Button login;
    private Button register;


    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SessionData.createDB(this.getApplicationContext());

        username = findViewById(R.id.etUsername);
        password = findViewById(R.id.etPassword);
        info = findViewById(R.id.etInfo);
        login = findViewById(R.id.buttonLogin);
        register = findViewById(R.id.buttonRegister);

        CreateData.populateUsers();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User testUser = SessionData.mUserDatabase.mUserDao().fetchOneUserByUserName(username.getText().toString());

                if(username.getText().toString().equals("")) {
                    // Missing Username Field
                    info.setText("Please fill out the username field");
                } else if (password.getText().toString().equals("")) {
                    // Missing Password Field
                    info.setText("Please fill out the password field");
                } else if (testUser == null){
                    // Username not found
                    info.setText("User doesn't exist");
                } else if (password.getText().toString().equals(testUser.getPassword().toString())){
                    startActivity(new Intent(MainActivity.this, QuestionActivity.class));
                    // Login successful, creating user
                    SessionData.currentUser = testUser;
                    info.setText("Your login details are correct");
                } else {
                    // Incorrect credentials
                    info.setText("Your login details are incorrect");

                }

            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Registration.class));
                //setContentView(R.layout.activity_registration);
                Toast.makeText(getApplicationContext(), "clicked", Toast.LENGTH_LONG).show();

            }
        });


        ConstraintLayout constraintLayout = findViewById(R.id.layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();


    }



//        button = findViewById(R.id.button);
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, SearchByCountryNameActivity.class));
//            }
//        });
    }



