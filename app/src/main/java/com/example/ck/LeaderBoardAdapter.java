package com.example.ck;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class LeaderBoardAdapter extends RecyclerView.Adapter<LeaderBoardAdapter.LeaderBoardItemViewHolder> {

    private List<User> mLbList;

    public LeaderBoardAdapter(List<User> lbList){

        mLbList = lbList;


    }


    @NonNull
    @Override
    public LeaderBoardItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.leaderboard_item, parent, false);
        LeaderBoardItemViewHolder lbholder = new LeaderBoardItemViewHolder(v);
        return lbholder;
    }

    @Override
    public void onBindViewHolder(@NonNull LeaderBoardItemViewHolder holder, int position) {

        User currentItem = mLbList.get(position);
        holder.lbUserName.setText("Traveller "+ currentItem.getUsername() + ":");
        holder.lbScore.setText(Integer.toString(currentItem.getScore())+ " points");



    }

    @Override
    public int getItemCount() {
        return mLbList.size();
    }

    public static class LeaderBoardItemViewHolder extends RecyclerView.ViewHolder{
        public TextView lbUserName;
        public TextView lbScore;


        public LeaderBoardItemViewHolder(@NonNull View itemView) {
            super(itemView);
            lbUserName = itemView.findViewById(R.id.lb_userName);
            lbScore = itemView.findViewById(R.id.lb_score);
        }
    }
}