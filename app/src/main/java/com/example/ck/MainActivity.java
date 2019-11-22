package com.example.ck;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity{
    public boolean usrExist = false;

    private EditText username;
    private EditText password;
    private TextView info;
    private Button login;
    private Button register;
    private User testUser;


    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SessionData.createDB(this.getApplicationContext());

        username = findViewById(R.id.etUsername);
        password = findViewById(R.id.etPassword);
        login = findViewById(R.id.buttonLogin);
        register = findViewById(R.id.buttonRegister);
        // final UserDatabase db = UserDatabase.getInstance(getApplicationContext());

        CreateData.populateSouvenirTable();
        //play once then can comment out
        CreateData.populateUsers();
        CreateData.populateQuestions();


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User testUser = SessionData.mUserDatabase.mUserDao().fetchOneUserByUserName(username.getText().toString());
             /*   FetchOneUserByUserNameAsyncTask fetchOneUserByUserNameAsyncTask = new FetchOneUserByUserNameAsyncTask();
                fetchOneUserByUserNameAsyncTask.setDb(db);
                fetchOneUserByUserNameAsyncTask.setDelegate(MainActivity.this);
                fetchOneUserByUserNameAsyncTask.execute();*/


                if (username.getText().toString().equals("")) {
                    // Missing Username Field
                    Toast.makeText(getApplicationContext(), "Please fill out the username field", Toast.LENGTH_LONG).show();
                } else if (password.getText().toString().equals("")) {
                    // Missing Password Field
                    Toast.makeText(getApplicationContext(), "Please fill out the password field", Toast.LENGTH_LONG).show();
                } else if (testUser == null) {
                    // Username not found
                    Toast.makeText(getApplicationContext(), "User does not exist!", Toast.LENGTH_LONG).show();
                } else if (password.getText().toString().equals(testUser.getPassword().toString())) {
                    startActivity(new Intent(MainActivity.this, Dashboard.class));
                    // Login successful, creating user
                    SessionData.currentUser = testUser;
                    Toast.makeText(getApplicationContext(), "Your details are correct!", Toast.LENGTH_LONG).show();
                } else {
                    // Incorrect credentials
                    Toast.makeText(getApplicationContext(), "Your details are incorrect!", Toast.LENGTH_LONG).show();


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

        //cool background theme
        ConstraintLayout constraintLayout = findViewById(R.id.layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();


    }

    public void fetchOneUserByUserName(User u) {

        testUser = u;

    }


}
