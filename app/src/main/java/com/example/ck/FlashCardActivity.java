package com.example.ck;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.ck.R;

public class FlashCardActivity extends AppCompatActivity {

    private TextView countryName;
    private ImageView countryFlag;
    private TextView countryCapital;
    private TextView countryPopulation;
    private TextView countryContinent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flashcard);

        Intent intent = getIntent();

        String name = intent.getExtras().getString("name");
        String capital = intent.getExtras().getString("capital");
        int population = intent.getExtras().getInt("population");
        String alpha2Code = intent.getExtras().getString("alpha2Code");
        String flag = intent.getExtras().getString("flag");
        String continent = intent.getExtras().getString("continent");



        countryName = findViewById(R.id.country_name);
        countryCapital = findViewById(R.id.country_capital);
        countryPopulation = findViewById(R.id.country_population);
        countryFlag = findViewById(R.id.country_flag);
        countryContinent = findViewById(R.id.country_continent);

        countryName.setText(name);
        countryCapital.setText(capital);
        countryPopulation.setText(String.valueOf(population));
        countryContinent.setText(continent);
        String imageUrl = "https://www.countryflags.io/" + alpha2Code + "/flat/64.png";
        Glide.with(FlashCardActivity.this).load(imageUrl).into(countryFlag);


    }

}

