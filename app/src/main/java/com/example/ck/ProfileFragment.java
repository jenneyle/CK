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

import com.bumptech.glide.Glide;

import java.util.List;

public class ProfileFragment extends Fragment {

    private List<User> userList;

    private TextView pro_username;
    private ImageView pro_image;
    private ImageView pro_souvenir;
    private TextView pro_souvenir_name;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        pro_username = view.findViewById(R.id.profile_username);
        pro_image = view.findViewById(R.id.profile_image);
        pro_souvenir = view.findViewById(R.id.profile_souvenir);
        pro_souvenir_name = view.findViewById(R.id.profile_souvenir_name);

        User user = SessionData.currentUser;

        pro_username.setText(user.getUsername());

        if (user.getScore() < 100) {
            pro_souvenir_name.setText(SessionData.mUserDatabase.mSouvenirDao().getIcon(1).getName());
            pro_souvenir.setImageResource(SessionData.mUserDatabase.mSouvenirDao().getIcon(1).getIcon());
            //String iconUrl = SessionData.mUserDatabase.mSouvenirDao().getIcon(1).getIcon();
            System.out.println("hi");

            //Glide.with(getContext()).load(iconUrl).into(pro_souvenir);
        }


        //need to add in a class field
//        pro_image.setText(user.getCost());


//        desTextView.setText(fooditem.getDescription());
//        imageView.setImageResource(fooditem.getImageDrawableId());
        return view;
    }
}