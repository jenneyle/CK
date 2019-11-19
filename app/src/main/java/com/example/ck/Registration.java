package com.example.ck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.se.omapi.Session;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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

//        Bundle bundle = getIntent().getExtras();
//        etUser = bundle.getString(Registration.NEW_USERNAME);
//        etPass = bundle.getString(Registration.NEW_PASSWORD);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "clicked rego", Toast.LENGTH_LONG).show();

                if (SessionData.mUserDatabase.mUserDao().fetchOneUserByUserName(etUser.getText().toString()) != null) {
                } else {

                    User user = new User(etUser.getText().toString(), etPass.getText().toString(), 0);


                    SessionData.mUserDatabase.mUserDao().insertNewUser(user);

                    // Correct credentials, passes username and password to page 2 of the registration process
                    System.out.println(String.format("LOGIN DETAILS PASSED \nUsername: %s \nPassword: %s \nPasswrod: %s",
                            etUser.getText(), etPass.getText(), etConfirmPass.getText()));




//
//                    new Thread(new Runnable() {
//                        @Override
//                        public void run() {
//                            Bundle bundle = getIntent().getExtras();
//                            User user = new User(bundle.getString(Registration.NEW_USERNAME), bundle.getString(Registration.NEW_PASSWORD), 0);
//                            SessionData.mUserDatabase.mUserDao().insertOnlySingleUser(user);
//                            // SessionData.mUserDatabase.mUserDao().insertAll(user);
//                            SessionData.currentUser = user;
//                        }
//                    }) .start();

                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
//                    intent.putExtra(NEW_USERNAME, etUser.getText().toString());
//                    intent.putExtra(NEW_PASSWORD, etPass.getText().toString());
                }
            }
        });


//        /*registerUser.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//               Toast.makeText(getApplicationContext(), "clicked", Toast.LENGTH_LONG).show();
////
//                if (SessionData.mUserDatabase.mUserDao().fetchOneUserByUserName(etUser.getText().toString()) != null){
//                } else{
//                    // Correct credentials, passes username and password to page 2 of the registration process
////                    System.out.println(String.format("LOGIN DETAILS PASSED \nUsername: %s \nPassword: %s \nPasswrod: %s",
////                            etUser.getText(), etPass.getText(), etConfirmPass.getText()));
//                    Bundle bundle = getIntent().getExtras();
//                    User user = new User(bundle.getString(Registration.NEW_USERNAME), bundle.getString(Registration.NEW_PASSWORD), 1);
//                    SessionData.mUserDatabase.mUserDao().insertOnlySingleUser(user);
//                    SessionData.currentUser = user;
//                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
//                startActivity(intent);
////                    intent.putExtra(NEW_USERNAME, etUser.getText().toString());
////                    intent.putExtra(NEW_PASSWORD, etPass.getText().toString());
//
//                }
//            }
//        });*/
    }

//    public void onRegister(View view){
//        Toast.makeText(getApplicationContext(), "clicked", Toast.LENGTH_LONG).show();
////
//        if (SessionData.mUserDatabase.mUserDao().fetchOneUserByUserName(etUser.getText().toString()) != null){
//        } else{
//            // Correct credentials, passes username and password to page 2 of the registration process
////                    System.out.println(String.format("LOGIN DETAILS PASSED \nUsername: %s \nPassword: %s \nPasswrod: %s",
////                            etUser.getText(), etPass.getText(), etConfirmPass.getText()));
//            Bundle bundle = getIntent().getExtras();
//            User user = new User(bundle.getString(Registration.NEW_USERNAME), bundle.getString(Registration.NEW_PASSWORD), 1);
//            SessionData.mUserDatabase.mUserDao().insertOnlySingleUser(user);
//            SessionData.currentUser = user;
//            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
//            startActivity(intent);
////                    intent.putExtra(NEW_USERNAME, etUser.getText().toString());
////                    intent.putExtra(NEW_PASSWORD, etPass.getText().toString());
//
//        }
//
//    }


}
