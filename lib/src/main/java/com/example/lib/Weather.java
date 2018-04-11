package com.example.lib;

public class Weather {
    public Integer weatherid;
    public String weathermain;
    public String weatherdiscription;
    public String weathericon;

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
