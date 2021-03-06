package sda.code.intermediate.part3.answers.rx;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import rx.Observable;
import sda.code.intermediate.part2.answers.json.gson.WeatherGson;

public interface OpenWeatherService {

	@GET("data/2.5/weather")
	Observable<WeatherGson> currentWeather(@QueryMap Map<String, String> query);

	@GET("data/2.5/weather")
	Observable<WeatherGson> currentWeather(@Query("appid") String key, @Query("q") String query);

	@GET("data/2.5/weather")
	Observable<WeatherGson> currentWeather(@Query("appid") String key, @Query("lat") String lat, @Query("lon") String lon);

}
