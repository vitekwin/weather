package com.example.lib;

public class WeatherData {
    public Float temperature;
    public Float pressure;
    public Float humidity;
    public Float temperaturemin;
    public Float temperaturemax;
    public Float seapressure;
    public Float groundpressure;

    public void setTemperature(Float temperature){
        this.temperature = temperature;
    }

    public Float getTemperature(){
        return temperature;
    }

    public void setPressure(Float pressure){
        this.pressure = pressure;
    }

    public Float getPressure(){
        return pressure;
    }

    public void setHumidity(Float humidity){
        this.humidity = humidity;
    }

    public Float getHumidity(){
        return humidity;
    }

    public void setTemperaturemin(Float temperaturemin){
        this.temperaturemin = temperaturemin;
    }

    public Float getTemperaturemin(){
        return temperaturemin;
    }

    public void setTemperaturemax(Float temperaturemax){
        this.temperaturemax = temperaturemax;
    }

    public Float getTemperaturemax(){
        return temperaturemax;
    }

    public void setSeapressure(Float seapressure){
        this.seapressure = seapressure;
    }

    public Float getSeapressure(){
        return seapressure;
    }

    public void setGroundpressure(Float groundpressure){
        this.groundpressure = groundpressure;
    }

    public Float getGroundpressure(){
        return groundpressure;
    }

}
