package com.example.ck;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class QuizActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView scoreView;
    private TextView questionText;
    private ImageView questionImage;
    private Button optionA;
    private Button optionB;
    private Button optionC;
    private Button optionD;
    private Question currentQuestion;
    private User currentUser = SessionData.currentUser;
    private int questionNumber = 0;
    private List<Question> questionsToDisplay = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        questionText = findViewById(R.id.question);
        questionImage = findViewById(R.id.question_image);
        optionA = findViewById(R.id.answer_a);
        optionB = findViewById(R.id.answer_b);
        optionC = findViewById(R.id.answer_c);
        optionD = findViewById(R.id.answer_d);
        scoreView = findViewById(R.id.score);

        optionA.setOnClickListener(this);
        optionB.setOnClickListener(this);
        optionC.setOnClickListener(this);
        optionD.setOnClickListener(this);

        Intent intent = getIntent();
        //remember difficulty = point allocation
        int difficulty = intent.getExtras().getInt("difficulty");
        questionsToDisplay = SessionData.mUserDatabase.mQuestionDao().findQuestionByCategory(difficulty);
        currentQuestion = questionsToDisplay.get(questionNumber);
        scoreView.setText("Score:" + currentUser.getScore());
        updateQuestion(questionNumber);


    }


    @Override
    public void onClick(View v) {
        Button clickedButton = (Button) v;
        if (clickedButton.getText().equals(currentQuestion.getCorrectAnswer())) {
            Toast.makeText(QuizActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
            currentUser.setScore(currentUser.getScore() + currentQuestion.getPointAllocation());
            SessionData.mUserDatabase.mUserDao().updateScore(currentUser.getScore(), currentUser.getUsername());
            scoreView.setText("Score:" + currentUser.getScore());
            updateQuestion(questionNumber);

        } else {
            Toast.makeText(QuizActivity.this, "Incorrect!", Toast.LENGTH_SHORT).show();
            updateQuestion(questionNumber);

        }

    }

    private void updateQuestion(int q) {
        if (q == questionsToDisplay.size()) {
            Intent intent = new Intent(QuizActivity.this, FinishQuizActivity.class);
            startActivity(intent);
        } else {
            currentQuestion = questionsToDisplay.get(q);
            questionText.setText(currentQuestion.getQuestion());

            if(currentQuestion.isImageQuestion() == false){
                questionImage.setVisibility(View.GONE);
            }else {
                questionImage.setVisibility(View.VISIBLE);
                Glide.with(QuizActivity.this).load(currentQuestion.getImageq()).into(questionImage);
            }

            optionA.setText(currentQuestion.getAnswerA());
            optionB.setText(currentQuestion.getAnswerB());
            optionC.setText(currentQuestion.getAnswerC());
            optionD.setText(currentQuestion.getAnswerD());
            questionNumber = q + 1;
        }
    }
}