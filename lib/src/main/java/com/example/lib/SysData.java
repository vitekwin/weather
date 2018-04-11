package com.example.lib;

public class SysData {
    private Double sysmessage = 0.0021;
    private String country = "RU";
    private Integer sunrise = 1523412576;
    private Integer sunset = 1523462008;

    public void setSysmessage(Double sysmessage){
        this.sysmessage = sysmessage;
    }

    public Double getSysmessage(){
        return sysmessage;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public String getCountry(){
        return country;
    }

    public void setSunrise(Integer sunrise){
        this.sunrise = sunrise;
    }

    public Integer getSunrise(){
        return sunrise;
    }

    public void setSunset(Integer sunset){
        this.sunset = sunset;
    }

    public Integer getSunset(){
        return sunset;
    }
}
