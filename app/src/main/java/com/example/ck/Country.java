package com.example.ck;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

@Entity
public class Country {
@PrimaryKey @NonNull
    public String name;
    public String alpha2Code;
    public String capital;
    public String subregion;
    public String area;
    public int population;
    public String flag;
    @SerializedName("region")
    public String continent;
    //public ArrayList<String> borders;
    public static List<Country> countryList = new ArrayList<>();

    //public Currency[] currencies;
    //public Languages[] languages;
//TODO: currency and languages are arrays within the object.

@Ignore
    public Country() {

    }

    public Country(String name, String alpha2Code, String capital,  String subregion, String area, int population, String flag, String continent) {
        this.name = name;
        this.alpha2Code = alpha2Code;
        this.capital = capital;
        this.subregion = subregion;
        this.area = area;
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

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
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