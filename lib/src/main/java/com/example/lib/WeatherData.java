package com.example.lib;

public class WeatherData {
    private Double temperature = 281.991;
    private Double pressure = 1001.87;
    private Double humidity = 100.0;
    private Double temperaturemin = 281.991;
    private Double temperaturemax = 281.991;
    private Double seapressure = 1027.62;
    private Double groundpressure = 1001.87;

    public void setTemperature(Double temperature){
        this.temperature = temperature;
    }

    public Double getTemperature(){
        return temperature;
    }

    public void setPressure(Double pressure){
        this.pressure = pressure;
    }

    public Double getPressure(){
        return pressure;
    }

    public void setHumidity(Double humidity){
        this.humidity = humidity;
    }

    public Double getHumidity(){
        return humidity;
    }

    public void setTemperaturemin(Double temperaturemin){
        this.temperaturemin = temperaturemin;
    }

    public Double getTemperaturemin(){
        return temperaturemin;
    }

    public void setTemperaturemax(Double temperaturemax){
        this.temperaturemax = temperaturemax;
    }

    public Double getTemperaturemax(){
        return temperaturemax;
    }

    public void setSeapressure(Double seapressure){
        this.seapressure = seapressure;
    }

    public Double getSeapressure(){
        return seapressure;
    }

    public void setGroundpressure(Double groundpressure){
        this.groundpressure = groundpressure;
    }

    public Double getGroundpressure(){
        return groundpressure;
    }

}
