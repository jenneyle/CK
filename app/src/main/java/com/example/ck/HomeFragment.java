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

import java.util.Arrays;
import java.util.Collections;

public class HomeFragment extends Fragment {

    private TextView d_countryname;
    private TextView d_countryfact;
    private ImageView d_countryimage;
    private Button factsBtn;
    private Button flashCardsBtn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        //TODO: slider for random fact
        //TODO: add images and facts data
        d_countryname = view.findViewById(R.id.dash_country_name);
        d_countryimage = view.findViewById(R.id.dash_country_image);
        d_countryfact = view.findViewById(R.id.dash_country_fact);
        factsBtn = view.findViewById(R.id.factsBtn);
        flashCardsBtn = view.findViewById(R.id.flashCardBtn);


        //Button to generate random fact
        factsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showRandomFact();
            }
        });

        flashCardsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), SearchByFlagActivity.class);
                startActivity(intent);

            }
        });

        return view;
    }

    public void showRandomFact() {
        shuffleFacts();
        d_countryname.setText(factArray[1].getDash_country_name());
        d_countryfact.setText(factArray[1].getDash_country_fact());
    }

    Facts f01 = new Facts("France", 1, "No pig is allowed to be called Napolean in France!");
    Facts f02 = new Facts("Greenland", 2, "Greenland is actually the world's biggest island - by area - that is not a continent");
    Facts f03 = new Facts("Egypt", 3, "The Pyramid of Giza is the oldest of the wonders of the Ancient world, that is still in existence");
    Facts f04 = new Facts("Japan", 4, "In Japan, the name Japan is Nihon or Nippon whichh means Land of the rising sun ");
    Facts f05 = new Facts("Greece", 5, "The official name of Greece is the Hellenic Republic");
    Facts f06 = new Facts("China", 6, "More than 10million people visit the Great Wall of China every year");
    Facts f07 = new Facts("India", 7, "The national symbol of India is the endangered Benegal Tiger");
    Facts f08 = new Facts("Mexico", 8, "Mexico is home to over 30 UNESCO World Heritage Sites");
    Facts f09 = new Facts("Venezuela", 9, "Venezuela is home to the world's tallest waterfall - Angel Falls");
    Facts f10 = new Facts("Australia", 10, "Australia's the only continent covered by a single country");


    Facts[] factArray = new Facts[]{
            f01, f02, f03, f04, f05, f06, f07, f08, f09, f10
    };

    public void shuffleFacts() {
        Collections.shuffle(Arrays.asList(factArray));
    }

}