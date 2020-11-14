package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double averageTemperature(){
        double average = 0 ;
        double result = 0 ;
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
            result = result + temperature.getValue();

        }
        average = result / resultMap.size();
        return average;
    }

    public double medianTemperature(){
        Map<String, Double> resultMap = new HashMap<>();
        List<Double> medianList = new ArrayList<>();
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            //resultMap.put(temperature.getKey(), temperature.getValue();
            medianList.add(temperature.getValue());
        }
        Collections.sort(medianList);
        if(medianList.size() % 2 == 1){
            return medianList.get((medianList.size()+1) / 2 -1);
        } else {
            double lower = medianList.get(medianList.size() /2 -1);
            double upper = medianList.get(medianList.size() /2);
            return (lower + upper) /2 ;
        }

    }
}