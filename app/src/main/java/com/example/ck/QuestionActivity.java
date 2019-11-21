//package com.example.ck;
//
//import android.os.Bundle;
//import android.os.PersistableBundle;
//import android.widget.Button;
//import android.widget.ImageView;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import androidx.annotation.Nullable;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.lifecycle.Observer;
//import androidx.lifecycle.ViewModelProvider;
//import androidx.recyclerview.widget.GridLayoutManager;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class QuestionActivity extends AppCompatActivity {
//    private RecyclerView recyclerView;
//    private List<Question> questionList = new ArrayList<>();
//    private QuestionAdapter adapter = new QuestionAdapter(questionList);
//
//    //private QuestionViewModel questionViewModel;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.question_activity);
//        CreateData.populateQuestions();
//        questionList.addAll(CreateData.preparedQuestions);
//        recyclerView = findViewById(R.id.question_recycler_view);
//
//        setUpRecyclerView(questionList);
//
///*        //final QuestionAdapter qAdapter = new QuestionAdapter(questionList);
//        recyclerView.setAdapter(adapter);*/
//
///*
//        questionViewModel = ViewModelProviders.of(this).get(QuestionViewModel.class);
//        questionViewModel.getAllQuestions().observe(this, new Observer<List<Question>>() {
//            @Override
//            public void onChanged(List<Question> questions) {
//                qAdapter.setQuesitons(questions);
//            }
//        });
//*/
//    }
//
//    public void setUpRecyclerView(List<Question> questionList) {
//        adapter = new QuestionAdapter(questionList);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView.setAdapter(adapter);
//
//    }
//}