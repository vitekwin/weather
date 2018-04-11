package com.example.lib;

public class WeatherClass {

    public Integer city_id;
    public String city_name;
    public Integer code;
    public Integer timestamp;
    public String base;

    public Coord coord;
    public Weather weather;
    public WeatherData weatherdata;
    public Wind wind;
    public Clouds clouds;
    public SysData sysdata;


    public void setCity_id(Integer city_id){
        this.city_id = city_id;
    }

    public Integer getCity_id(){
        return city_id;
    }

    public void setCity_name(String city_name){
        this.city_name = city_name;
    }

    public String getCity_name(){
        return city_name;
    }

    public void setCode(Integer code){
        this.code = code;
    }

    public Integer getCode(){
        return code;
    }

    public void setTimestamp(Integer timestamp){
        this.timestamp = timestamp;
    }

    public Integer getTimestamp(){
        return timestamp;
    }

    public void setBase(String base){
        this.base = base;
    }

    public String getBase(){
        return base;
    }

}


