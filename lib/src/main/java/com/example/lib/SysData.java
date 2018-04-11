package com.example.lib;

public class SysData {
    public Float sysmessage;
    public String country;
    public Integer sunrise;
    public Integer sunset;

    public void setSysmessage(Float sysmessage){
        this.sysmessage = sysmessage;
    }

    public Float getSysmessage(){
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
