package com.example.ck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class FlashCardActivity extends AppCompatActivity {
    private TextView countryName;
    private ImageView countryFlag;
    private TextView countryCapital;
    private TextView countryPopulation;
    private TextView countryContinent;
    private TextView countrySubregion;
    private TextView countryArea;

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
        String subregion = intent.getExtras().getString("subregion");
        String area = intent.getExtras().getString("area");



        countryName = findViewById(R.id.country_name);
        countryCapital = findViewById(R.id.country_capital);
        countryPopulation = findViewById(R.id.country_population);
        countryFlag = findViewById(R.id.country_flag);
        countryContinent = findViewById(R.id.country_continent);
        countrySubregion = findViewById(R.id.country_subregion);
        countryArea = findViewById(R.id.country_area);


        countryName.setText("Country: " + name);
        countryCapital.setText("Capital City: " + capital);
        countryPopulation.setText("Population: "+String.valueOf(population));
        countryContinent.setText("Continent: "+continent);
        countrySubregion.setText("Sub Region: "+subregion);
        countryArea.setText("Area "+ area);
        String imageUrl = "https://www.countryflags.io/" + alpha2Code + "/shiny/64.png";
        Glide.with(FlashCardActivity.this).load(imageUrl).into(countryFlag);


    }


}
