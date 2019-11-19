package com.example.ck;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class QuestionActivity extends AppCompatActivity {

    int index = 0;
    int thisQuestion = 0;
    int totalQuestion;
    int correctAnswer;

    TextView questionText;
    ImageView questionImage;
    Button aBtn;
    Button bBtn;
    Button cBtn;
    Button dBtn;

    UserDatabase db = UserDatabase.getInstance(getApplicationContext());


}
