package com.example.lib;

public class Weather {
    private Integer weatherid = 800;
    private String weathermain = "Clear";
    private String weatherdiscription = "clear sky";
    private String weathericon = "01d";

    public void setWeatherid(Integer weatherid){
        this.weatherid = weatherid;
    }

    public Integer getWeatherid(){
        return weatherid;
    }

    public void setWeathermain(String weathermain){
        this.weathermain = weathermain;
    }

    public String getWeathermain(){
        return weathermain;
    }

    public void setWeatherdiscription(String weatherdiscription){
        this.weatherdiscription = weatherdiscription;
    }

    public String getWeatherdiscription(){
        return weatherdiscription;
    }

    public void setWeathericon(String weathericon){
        this.weathericon = weathericon;
    }

    public String getWeathericon(){
        return weathericon;
    }

}
