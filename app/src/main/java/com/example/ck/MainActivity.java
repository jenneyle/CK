package com.example.ck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ck.R;



public class MainActivity extends AppCompatActivity {
    public boolean usrExist = false;

    private EditText username;
    private EditText password;
    private TextView info;
    private Button login;


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

        CreateData.populateUsers();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User testUser = SessionData.mUserDatabase.mUserDao().fetchOneUserByUserName(username.getText().toString());

                if (password.getText().toString().equals(testUser.getPassword().toString())){
                    // Login successful, creating user
                    Intent intent = new Intent(MainActivity.this, Dashboard.class);
                    startActivity(intent);
                    SessionData.currentUser = testUser;
                    info.setText("Your login details are correct");
                } else {
                    // Incorrect credentials
                    info.setText("Your login details are incorrect");
//


                }

            }
        });

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



