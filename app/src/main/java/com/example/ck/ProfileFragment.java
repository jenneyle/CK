package com.example.ck;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class ProfileFragment extends Fragment {

    private List<User> userList;

    TextView pro_username;
    ImageView pro_image;
    TextView pro_score;
    ViewPager viewPager;
    private List<Badge> userBadgeList = new ArrayList<>();


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        pro_username = view.findViewById(R.id.profile_username);
        pro_image = view.findViewById(R.id.profile_image);
        pro_score = view.findViewById(R.id.profile_score);

        User user = SessionData.currentUser;

        pro_username.setText("Traveller " + user.getUsername());
        pro_score.setText("Score: " + user.getScore());
        if (user.getScore() > 2000) {
            userBadgeList.add(SessionData.mUserDatabase.mBadgeDao().getSingleBadge(7));
        }
        if (user.getScore() > 1000) {
            userBadgeList.add(SessionData.mUserDatabase.mBadgeDao().getSingleBadge(6));
        }
        if (user.getScore() > 500) {
            userBadgeList.add(SessionData.mUserDatabase.mBadgeDao().getSingleBadge(5));
        }
        if (user.getScore() > 300) {
            userBadgeList.add(SessionData.mUserDatabase.mBadgeDao().getSingleBadge(4));
        }
        if (user.getScore() >= 200) {
            userBadgeList.add(SessionData.mUserDatabase.mBadgeDao().getSingleBadge(3));
        }
        if (user.getScore() >= 100) {
            userBadgeList.add(SessionData.mUserDatabase.mBadgeDao().getSingleBadge(2));
        }
        if (user.getScore() >= 0) {
            userBadgeList.add(SessionData.mUserDatabase.mBadgeDao().getSingleBadge(1));
        }

        viewPager = view.findViewById(R.id.view_pager);
        BadgeAdapterViewPager adapter = new BadgeAdapterViewPager(userBadgeList, getContext(), SessionData.currentUser);
        viewPager.setAdapter(adapter);

        return view;
    }
}