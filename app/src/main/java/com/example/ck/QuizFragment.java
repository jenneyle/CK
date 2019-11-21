package com.example.ck;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class QuizFragment extends Fragment {

    private List<Question> questionList = new ArrayList<>();
    ViewPager viewPager;
    TabLayout tabLayout;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_quiz, container, false);

        questionList.addAll(CreateData.preparedQuestions);

        viewPager = view.findViewById(R.id.view_pager);
        tabLayout  = view.findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
        QuestionAdapterViewPager adapter = new QuestionAdapterViewPager(questionList, getContext(), SessionData.currentUser);
        viewPager.setAdapter(adapter);

        return view;
    }
}
