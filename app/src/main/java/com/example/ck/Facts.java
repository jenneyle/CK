package com.example.ck;

public class Facts {
    private String dash_country_name;
    private int dash_country_image;
    private String dash_country_fact;


    public Facts(String dash_country_name, int dash_country_image, String dash_country_fact) {
        this.dash_country_name = dash_country_name;
        this.dash_country_image = dash_country_image;
        this.dash_country_fact = dash_country_fact;

    }

    public String getDash_country_name() {
        return dash_country_name;
    }

    public int getDash_country_image() {
        return dash_country_image;
    }

    public String getDash_country_fact() {
        return dash_country_fact;
    }
}
