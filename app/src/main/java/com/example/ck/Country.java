package com.example.ck;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class Country {

    public String name;
    public String alpha2Code;
    public String capital;
    public String region;
    public String subregion;
    public String area;
    public int population;
    public String flag;
    @SerializedName("region")
    public String continent;
    public ArrayList<String> borders;
    public static List<Country> countryList = new ArrayList<>();

    public Currency[] currencies;
    public Languages[] languages;
//TODO: currency and languages are arrays within the object.


    public Country() {

    }


    public Country(String name, String alpha2Code, String capital, String region, String subregion, String area, int population, String flag, String continent) {
        this.name = name;
        this.alpha2Code = alpha2Code;
        this.capital = capital;
        this.region = region;
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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
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


    public Currency[] getCurrencies() {
        return currencies;
    }

    public class Currency {
        private String code;
        private String name;
        private String symbol;


        public Currency(String code, String name, String symbol) {
            this.code = code;
            this.name = name;
            this.symbol = symbol;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSymbol() {
            return symbol;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

    }


    public Languages[] getLanguages() {
        return languages;
    }
    public class Languages{
        //do not know if ths will be used
    }



}
//https://www.printful.com/docs/countries
//https://restcountries.eu/rest/v2/all
//https://www.countryflags.io/