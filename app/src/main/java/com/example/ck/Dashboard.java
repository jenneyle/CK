package com.example.ck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class Dashboard extends AppCompatActivity {
    private TextView d_countryname;
    private TextView d_countryfact;
    private ImageView d_countryimage;
    private Button factsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        //TODO: slider for random fact
        //TODO: add images and facts data
        d_countryname = findViewById(R.id.dash_country_name);
        d_countryimage = findViewById(R.id.dash_country_image);
        d_countryfact = findViewById(R.id.dash_country_fact);
        factsBtn = findViewById(R.id.factsBtn);

        //Button to generate random fact
        factsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showRandomFact();
            }
        });

    }

    public void showRandomFact(){
        shuffleFacts();
        d_countryname.setText(factArray[1].getDash_country_name());
        d_countryfact.setText(factArray[1].getDash_country_fact());
    }

    Facts f01 = new Facts("France", 1, "No pig is allowed to be called Napolean in France!");
    Facts f02 = new Facts("Greenland", 2, "Greenland is actually the world's biggest island - by area - that is not a continent");
    Facts f03 = new Facts("Egypt", 3, "The Pyramid of Giza is the oldest of the wonders of the Ancient world, that is still in existence");
    Facts f04 = new Facts("Papua New Guinea", 4, "Papua New Guinea is the most linguistically diverse country in the world with 851 individual languages listed ");
    Facts f05 = new Facts("Greece", 5, "The official name of Greece is the Hellenic Republic");
    Facts f06 = new Facts("China", 6, "More than 10million people visit the Great Wall of China every year");
    Facts f07 = new Facts("India", 7, "The national symbol of India is the endangered Benegal Tiger");
    Facts f08 = new Facts("Mexico", 8, "Mexico is hoe to over 30 UNESCO Wolrd Heritage Sites");
    Facts f09 = new Facts("Venezuela", 4, "Venezuela is home to the world's tallest waterfall - Angel Falls");
    Facts f10 = new Facts("Chile", 4, "The national sport of Chile is Rodeo which is still very popular in rural areas of the country");



    Facts [] factArray = new Facts[]{
            f01, f02, f03, f04, f05, f06, f07, f08, f09,f10
    };

    public void shuffleFacts(){
        Collections.shuffle(Arrays.asList(factArray));
    }

}
