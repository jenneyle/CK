package com.example.ck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FinishQuizActivity extends AppCompatActivity {
    Button backBtn;
    TextView finalScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish_quiz);

        finalScore = findViewById(R.id.finalScore);
        backBtn = findViewById(R.id.back_btn);

        finalScore.setText("Score:" + SessionData.currentUser.getScore());

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FinishQuizActivity.this, Dashboard.class));
            }
        });

    }
}