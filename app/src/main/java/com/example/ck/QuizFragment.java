package com.example.ck;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class QuizFragment extends Fragment {

    Button easyBtn;
    Button mediumBtn;
    Button hardBtn;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_quiz, container, false);

        easyBtn = view.findViewById(R.id.easy_btn);
        mediumBtn = view.findViewById(R.id.med_btn);
        hardBtn = view.findViewById(R.id.hard_btn);

        easyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), QuizActivity.class);
                i.putExtra("difficulty", 10);
                v.getContext().startActivity(i);
            }
        });
        mediumBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), QuizActivity.class);
                i.putExtra("difficulty", 20);
                v.getContext().startActivity(i);
            }
        });
        hardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), QuizActivity.class);
                i.putExtra("difficulty", 30);
                v.getContext().startActivity(i);
            }
        });
        return view;
    }
}