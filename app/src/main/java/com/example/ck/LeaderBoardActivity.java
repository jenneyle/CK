package com.example.ck;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class LeaderBoardActivity extends AppCompatActivity {
RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leader_board);

        List<User> lbList = new ArrayList<>();
        lbList = SessionData.mUserDatabase.mUserDao().getAllScore();

        mRecyclerView = findViewById(R.id.leaderboard_recycler_view);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new LeaderBoardAdapter(lbList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);





    }
}