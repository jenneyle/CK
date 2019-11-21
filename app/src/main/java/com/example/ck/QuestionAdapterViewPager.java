package com.example.ck;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.List;

public class QuestionAdapterViewPager extends PagerAdapter {

    private List<Question> questionList;
    private LayoutInflater layoutInflater;
    private Context context;
    private User currentUser;


    public QuestionAdapterViewPager(List<Question> questionList, Context context, User currentUser) {
        this.questionList = questionList;
        this.currentUser = currentUser;
        this.context = context;
    }

    @Override
    public int getCount() {
        return questionList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return "Q" + (position + 1);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.question_item, container, false);
        TextView questionText;
        final ImageView questionImage;
        Button optionA;
        Button optionB;
        Button optionC;
        Button optionD;
        final TextView score;
        questionImage = view.findViewById(R.id.question_image);
        questionText = view.findViewById(R.id.question);
        optionA = view.findViewById(R.id.answer_a);
        optionB = view.findViewById(R.id.answer_b);
        optionC = view.findViewById(R.id.answer_c);
        optionD = view.findViewById(R.id.answer_d);
        score = view.findViewById(R.id.score);

        questionText.setText(questionList.get(position).getQuestion());
        optionA.setText(questionList.get(position).getAnswerA());
        optionB.setText(questionList.get(position).getAnswerB());
        optionC.setText(questionList.get(position).getAnswerC());
        optionD.setText(questionList.get(position).getAnswerD());
        score.setText("Score: " + currentUser.getScore());

        optionA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (questionList.get(position).getCorrectAnswer().equals("A")) {
                    Toast.makeText(context, "Correct!", Toast.LENGTH_SHORT).show();
                    SessionData.mUserDatabase.mUserDao().updateScore(currentUser.getScore() + 10, currentUser.getUsername());
                    score.setText("Score: " + currentUser.getScore());
                } else {
                    Toast.makeText(context, "Incorrect!", Toast.LENGTH_SHORT).show();
                }


            }
        });

        optionB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (questionList.get(position).getCorrectAnswer().equals("B")) {
                    Toast.makeText(context, "Correct!", Toast.LENGTH_SHORT).show();
                    SessionData.mUserDatabase.mUserDao().updateScore(currentUser.getScore() + 10, currentUser.getUsername());
                    score.setText("Score: " + currentUser.getScore());
                } else {
                    Toast.makeText(context, "Incorrect!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        optionC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (questionList.get(position).getCorrectAnswer().equals("C")) {
                    Toast.makeText(context, "Correct!", Toast.LENGTH_SHORT).show();
                    SessionData.mUserDatabase.mUserDao().updateScore(currentUser.getScore() + 10, currentUser.getUsername());
                    score.setText("Score: " + currentUser.getScore());
                } else {
                    Toast.makeText(context, "Incorrect!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        optionD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (questionList.get(position).getCorrectAnswer().equals("D")) {
                    Toast.makeText(context, "Correct!", Toast.LENGTH_SHORT).show();
                    SessionData.mUserDatabase.mUserDao().updateScore(currentUser.getScore() + 10, currentUser.getUsername());
                    score.setText("Score: " + currentUser.getScore());
                } else {
                    Toast.makeText(context, "Incorrect!", Toast.LENGTH_SHORT).show();
                }
            }
        });


        container.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}