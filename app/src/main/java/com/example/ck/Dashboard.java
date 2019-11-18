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
        d_countryname.setText(factArray[0].getDash_country_name());
        d_countryfact.setText(factArray[0].getDash_country_fact());
    }

    Facts f01 = new Facts("Freeya", 1, "is cool");
    Facts f02 = new Facts("Korea", 2, "is fun");
    Facts f03 = new Facts("ko", 3, "is ");
    Facts f04 = new Facts("sghs", 4, "isighsdg");

    Facts [] factArray = new Facts[]{
            f01, f02, f03, f04
    };

    public void shuffleFacts(){
        Collections.shuffle(Arrays.asList(factArray));
    }

}
