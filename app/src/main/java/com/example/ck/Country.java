package com.example.ck;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Country {

    public String name;
    public String alpha2Code;
    public String capital;
    public int population;
    public String flag;
    @SerializedName("region")
    public String continent;
    public ArrayList<String> borders;
    public static List<Country> countryList = new ArrayList<>();

//TODO: currency and languages are arrays within the object.


    public Country(){

    }

    public Country(String name, String alpha2Code, String capital, int population, String flag, String continent) {
        this.name = name;
        this.alpha2Code = alpha2Code;
        this.capital = capital;
        this.population = population;
        this.flag = flag;
        this.continent = continent;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlpha2Code() {
        return alpha2Code;
    }

    public void setAlpha2Code(String alpha2Code) {
        this.alpha2Code = alpha2Code;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }
}


//https://www.printful.com/docs/countries
//https://restcountries.eu/rest/v2/all
//https://www.countryflags.io/