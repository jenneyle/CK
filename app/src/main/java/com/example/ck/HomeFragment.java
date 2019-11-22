package com.example.ck;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import java.util.Arrays;
import java.util.Collections;

public class HomeFragment extends Fragment {

    Facts f01 = new Facts("France", R.drawable.france, "no pig is allowed to be called Napolean in France!");
    Facts f02 = new Facts("Greenland", R.drawable.greenland, "Greenland is actually the world's biggest island - by area - that is not a continent");
    Facts f03 = new Facts("Egypt", R.drawable.egypt, "the Pyramid of Giza is the oldest of the wonders of the Ancient world, that is still in existence");
    Facts f04 = new Facts("Japan", R.drawable.japan, "in Japan, the name Japan is Nihon or Nippon whichh means Land of the rising sun ");
    Facts f05 = new Facts("Greece", R.drawable.greece, "the official name of Greece is the Hellenic Republic");
    Facts f06 = new Facts("China", R.drawable.china, "more than 10million people visit the Great Wall of China every year");
    Facts f07 = new Facts("India", R.drawable.india, "the national symbol of India is the endangered Benegal Tiger");
    Facts f09 = new Facts("Venezuela", R.drawable.venezuela, "Venezuela is home to the world's tallest waterfall - Angel Falls");
    Facts f10 = new Facts("Australia", R.drawable.sydney, "Australia's the only continent covered by a single country");


    Facts[] factArray = new Facts[]{
            f01, f02, f03, f04, f05, f06, f07, f09, f10
    };
    private Button flashCardsBtn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        flashCardsBtn = view.findViewById(R.id.flashCardBtn);

       Button logOffbtn = view.findViewById(R.id.logOutButton);


        logOffbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), MainActivity.class);
                startActivity(intent);

            }
        });

        flashCardsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), SearchByFlagActivity.class);
                startActivity(intent);

            }
        });

        ViewPager viewPager = view.findViewById(R.id.view_pager_facts);
        FactAdapterViewPager factAdapterViewPager = new FactAdapterViewPager(getContext(),factArray);
        viewPager.setAdapter(factAdapterViewPager);


        return view;
    }



}