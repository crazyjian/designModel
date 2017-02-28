package headfirst.designpatterns.observer.weatherobservable;

import headfirst.designpatterns.observer.weather.ForecastDisplay;
import headfirst.designpatterns.observer.weather.HeatIndexDisplay;
import headfirst.designpatterns.observer.weather.StatisticsDisplay;
import headfirst.designpatterns.observer.weather.CurrentConditionsDisplay;
import headfirst.designpatterns.observer.weather.WeatherData;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay =new HeatIndexDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
