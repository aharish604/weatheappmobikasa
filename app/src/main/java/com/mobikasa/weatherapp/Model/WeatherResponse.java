package com.mobikasa.weatherapp.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class WeatherResponse implements Serializable {
        @SerializedName("lat")
        @Expose
        private Double lat;
        @SerializedName("lon")
        @Expose
        private Double lon;
        @SerializedName("timezone")
        @Expose
        private String timezone;

        @SerializedName("daily")
        @Expose
        private List<Daily> daily = null;

        public Double getLat() {
            return lat;
        }

        public void setLat(Double lat) {
            this.lat = lat;
        }

        public Double getLon() {
            return lon;
        }

        public void setLon(Double lon) {
            this.lon = lon;
        }

        public String getTimezone() {
            return timezone;
        }

        public void setTimezone(String timezone) {
            this.timezone = timezone;
        }


        public List<Daily> getDaily() {
            return daily;
        }

        public void setDaily(List<Daily> daily) {
            this.daily = daily;
        }



    public class Current {

        @SerializedName("dt")
        @Expose
        private Integer dt;
        @SerializedName("sunrise")
        @Expose
        private Integer sunrise;
        @SerializedName("sunset")
        @Expose
        private Integer sunset;
        @SerializedName("temp")
        @Expose
        private Double temp;
        @SerializedName("feels_like")
        @Expose
        private Double feelsLike;
        @SerializedName("pressure")
        @Expose
        private Integer pressure;
        @SerializedName("humidity")
        @Expose
        private Integer humidity;
        @SerializedName("dew_point")
        @Expose
        private Double dewPoint;
        @SerializedName("uvi")
        @Expose
        private Double uvi;
        @SerializedName("clouds")
        @Expose
        private Integer clouds;
        @SerializedName("visibility")
        @Expose
        private Integer visibility;
        @SerializedName("wind_speed")
        @Expose
        private Double windSpeed;
        @SerializedName("wind_deg")
        @Expose
        private Integer windDeg;
        @SerializedName("wind_gust")
        @Expose
        private Double windGust;
        @SerializedName("weather")
        @Expose
        private List<Weather> weather = null;
        @SerializedName("rain")
        @Expose
        private Rain rain;

        public Integer getDt() {
            return dt;
        }

        public void setDt(Integer dt) {
            this.dt = dt;
        }

        public Integer getSunrise() {
            return sunrise;
        }

        public void setSunrise(Integer sunrise) {
            this.sunrise = sunrise;
        }

        public Integer getSunset() {
            return sunset;
        }

        public void setSunset(Integer sunset) {
            this.sunset = sunset;
        }

        public Double getTemp() {
            return temp;
        }

        public void setTemp(Double temp) {
            this.temp = temp;
        }

        public Double getFeelsLike() {
            return feelsLike;
        }

        public void setFeelsLike(Double feelsLike) {
            this.feelsLike = feelsLike;
        }

        public Integer getPressure() {
            return pressure;
        }

        public void setPressure(Integer pressure) {
            this.pressure = pressure;
        }

        public Integer getHumidity() {
            return humidity;
        }

        public void setHumidity(Integer humidity) {
            this.humidity = humidity;
        }

        public Double getDewPoint() {
            return dewPoint;
        }

        public void setDewPoint(Double dewPoint) {
            this.dewPoint = dewPoint;
        }

        public Double getUvi() {
            return uvi;
        }

        public void setUvi(Double uvi) {
            this.uvi = uvi;
        }

        public Integer getClouds() {
            return clouds;
        }

        public void setClouds(Integer clouds) {
            this.clouds = clouds;
        }

        public Integer getVisibility() {
            return visibility;
        }

        public void setVisibility(Integer visibility) {
            this.visibility = visibility;
        }

        public Double getWindSpeed() {
            return windSpeed;
        }

        public void setWindSpeed(Double windSpeed) {
            this.windSpeed = windSpeed;
        }

        public Integer getWindDeg() {
            return windDeg;
        }

        public void setWindDeg(Integer windDeg) {
            this.windDeg = windDeg;
        }

        public Double getWindGust() {
            return windGust;
        }

        public void setWindGust(Double windGust) {
            this.windGust = windGust;
        }

        public List<Weather> getWeather() {
            return weather;
        }

        public void setWeather(List<Weather> weather) {
            this.weather = weather;
        }

        public Rain getRain() {
            return rain;
        }

        public void setRain(Rain rain) {
            this.rain = rain;
        }

    }

    public class Weather {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("main")
        @Expose
        private String main;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("icon")
        @Expose
        private String icon;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getMain() {
            return main;
        }

        public void setMain(String main) {
            this.main = main;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

    }

    public class Weather__1 {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("main")
        @Expose
        private String main;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("icon")
        @Expose
        private String icon;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getMain() {
            return main;
        }

        public void setMain(String main) {
            this.main = main;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

    }

    public class Weather__2 implements Serializable {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("main")
        @Expose
        private String main;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("icon")
        @Expose
        private String icon;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getMain() {
            return main;
        }

        public void setMain(String main) {
            this.main = main;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

    }

    public class Alert implements Serializable {

        @SerializedName("sender_name")
        @Expose
        private String senderName;
        @SerializedName("event")
        @Expose
        private String event;
        @SerializedName("start")
        @Expose
        private Integer start;
        @SerializedName("end")
        @Expose
        private Integer end;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("tags")
        @Expose
        private List<String> tags = null;

        public String getSenderName() {
            return senderName;
        }

        public void setSenderName(String senderName) {
            this.senderName = senderName;
        }

        public String getEvent() {
            return event;
        }

        public void setEvent(String event) {
            this.event = event;
        }

        public Integer getStart() {
            return start;
        }

        public void setStart(Integer start) {
            this.start = start;
        }

        public Integer getEnd() {
            return end;
        }

        public void setEnd(Integer end) {
            this.end = end;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public List<String> getTags() {
            return tags;
        }

        public void setTags(List<String> tags) {
            this.tags = tags;
        }

    }


    public class Daily implements Serializable {

        @SerializedName("dt")
        @Expose
        private Integer dt;
        @SerializedName("sunrise")
        @Expose
        private Integer sunrise;
        @SerializedName("sunset")
        @Expose
        private Integer sunset;
        @SerializedName("moonrise")
        @Expose
        private Integer moonrise;
        @SerializedName("moonset")
        @Expose
        private Integer moonset;
        @SerializedName("moon_phase")
        @Expose
        private Double moonPhase;
        @SerializedName("temp")
        @Expose
        private Temp temp;
        @SerializedName("feels_like")
        @Expose
        private FeelsLike feelsLike;
        @SerializedName("pressure")
        @Expose
        private Integer pressure;
        @SerializedName("humidity")
        @Expose
        private Integer humidity;
        @SerializedName("dew_point")
        @Expose
        private Double dewPoint;
        @SerializedName("wind_speed")
        @Expose
        private Double windSpeed;
        @SerializedName("wind_deg")
        @Expose
        private Integer windDeg;
        @SerializedName("wind_gust")
        @Expose
        private Double windGust;
        @SerializedName("weather")
        @Expose
        private List<Weather__2> weather = null;
        @SerializedName("clouds")
        @Expose
        private Integer clouds;
        @SerializedName("pop")
        @Expose
        private Double pop;
        @SerializedName("rain")
        @Expose
        private Double rain;

        public Integer getDt() {
            return dt;
        }

        public void setDt(Integer dt) {
            this.dt = dt;
        }

        public Integer getSunrise() {
            return sunrise;
        }

        public void setSunrise(Integer sunrise) {
            this.sunrise = sunrise;
        }

        public Integer getSunset() {
            return sunset;
        }

        public void setSunset(Integer sunset) {
            this.sunset = sunset;
        }

        public Integer getMoonrise() {
            return moonrise;
        }

        public void setMoonrise(Integer moonrise) {
            this.moonrise = moonrise;
        }

        public Integer getMoonset() {
            return moonset;
        }

        public void setMoonset(Integer moonset) {
            this.moonset = moonset;
        }

        public Double getMoonPhase() {
            return moonPhase;
        }

        public void setMoonPhase(Double moonPhase) {
            this.moonPhase = moonPhase;
        }

        public Temp getTemp() {
            return temp;
        }

        public void setTemp(Temp temp) {
            this.temp = temp;
        }

        public FeelsLike getFeelsLike() {
            return feelsLike;
        }

        public void setFeelsLike(FeelsLike feelsLike) {
            this.feelsLike = feelsLike;
        }

        public Integer getPressure() {
            return pressure;
        }

        public void setPressure(Integer pressure) {
            this.pressure = pressure;
        }

        public Integer getHumidity() {
            return humidity;
        }

        public void setHumidity(Integer humidity) {
            this.humidity = humidity;
        }

        public Double getDewPoint() {
            return dewPoint;
        }

        public void setDewPoint(Double dewPoint) {
            this.dewPoint = dewPoint;
        }

        public Double getWindSpeed() {
            return windSpeed;
        }

        public void setWindSpeed(Double windSpeed) {
            this.windSpeed = windSpeed;
        }

        public Integer getWindDeg() {
            return windDeg;
        }

        public void setWindDeg(Integer windDeg) {
            this.windDeg = windDeg;
        }

        public Double getWindGust() {
            return windGust;
        }

        public void setWindGust(Double windGust) {
            this.windGust = windGust;
        }

        public List<Weather__2> getWeather() {
            return weather;
        }

        public void setWeather(List<Weather__2> weather) {
            this.weather = weather;
        }

        public Integer getClouds() {
            return clouds;
        }

        public void setClouds(Integer clouds) {
            this.clouds = clouds;
        }

        public Double getPop() {
            return pop;
        }

        public void setPop(Double pop) {
            this.pop = pop;
        }

        public Double getRain() {
            return rain;
        }

        public void setRain(Double rain) {
            this.rain = rain;
        }

    }
    public class FeelsLike implements Serializable {

        @SerializedName("day")
        @Expose
        private Double day;
        @SerializedName("night")
        @Expose
        private Double night;
        @SerializedName("eve")
        @Expose
        private Double eve;
        @SerializedName("morn")
        @Expose
        private Double morn;

        public Double getDay() {
            return day;
        }

        public void setDay(Double day) {
            this.day = day;
        }

        public Double getNight() {
            return night;
        }

        public void setNight(Double night) {
            this.night = night;
        }

        public Double getEve() {
            return eve;
        }

        public void setEve(Double eve) {
            this.eve = eve;
        }

        public Double getMorn() {
            return morn;
        }

        public void setMorn(Double morn) {
            this.morn = morn;
        }

    }

    public class Hourly {

        @SerializedName("dt")
        @Expose
        private Integer dt;
        @SerializedName("temp")
        @Expose
        private Double temp;
        @SerializedName("feels_like")
        @Expose
        private Double feelsLike;
        @SerializedName("pressure")
        @Expose
        private Integer pressure;
        @SerializedName("humidity")
        @Expose
        private Integer humidity;
        @SerializedName("dew_point")
        @Expose
        private Double dewPoint;
        @SerializedName("uvi")
        @Expose
        private Double uvi;
        @SerializedName("clouds")
        @Expose
        private Integer clouds;
        @SerializedName("visibility")
        @Expose
        private Integer visibility;
        @SerializedName("wind_speed")
        @Expose
        private Double windSpeed;
        @SerializedName("wind_deg")
        @Expose
        private Integer windDeg;
        @SerializedName("wind_gust")
        @Expose
        private Double windGust;
        @SerializedName("weather")
        @Expose
        private List<Weather__1> weather = null;
        @SerializedName("pop")
        @Expose
        private Integer pop;
        @SerializedName("rain")
        @Expose
        private Rain__1 rain;

        public Integer getDt() {
            return dt;
        }

        public void setDt(Integer dt) {
            this.dt = dt;
        }

        public Double getTemp() {
            return temp;
        }

        public void setTemp(Double temp) {
            this.temp = temp;
        }

        public Double getFeelsLike() {
            return feelsLike;
        }

        public void setFeelsLike(Double feelsLike) {
            this.feelsLike = feelsLike;
        }

        public Integer getPressure() {
            return pressure;
        }

        public void setPressure(Integer pressure) {
            this.pressure = pressure;
        }

        public Integer getHumidity() {
            return humidity;
        }

        public void setHumidity(Integer humidity) {
            this.humidity = humidity;
        }

        public Double getDewPoint() {
            return dewPoint;
        }

        public void setDewPoint(Double dewPoint) {
            this.dewPoint = dewPoint;
        }

        public Double getUvi() {
            return uvi;
        }

        public void setUvi(Double uvi) {
            this.uvi = uvi;
        }

        public Integer getClouds() {
            return clouds;
        }

        public void setClouds(Integer clouds) {
            this.clouds = clouds;
        }

        public Integer getVisibility() {
            return visibility;
        }

        public void setVisibility(Integer visibility) {
            this.visibility = visibility;
        }

        public Double getWindSpeed() {
            return windSpeed;
        }

        public void setWindSpeed(Double windSpeed) {
            this.windSpeed = windSpeed;
        }

        public Integer getWindDeg() {
            return windDeg;
        }

        public void setWindDeg(Integer windDeg) {
            this.windDeg = windDeg;
        }

        public Double getWindGust() {
            return windGust;
        }

        public void setWindGust(Double windGust) {
            this.windGust = windGust;
        }

        public List<Weather__1> getWeather() {
            return weather;
        }

        public void setWeather(List<Weather__1> weather) {
            this.weather = weather;
        }

        public Integer getPop() {
            return pop;
        }

        public void setPop(Integer pop) {
            this.pop = pop;
        }

        public Rain__1 getRain() {
            return rain;
        }

        public void setRain(Rain__1 rain) {
            this.rain = rain;
        }

    }
    public class Minutely {

        @SerializedName("dt")
        @Expose
        private Integer dt;
        @SerializedName("precipitation")
        @Expose
        private Integer precipitation;

        public Integer getDt() {
            return dt;
        }

        public void setDt(Integer dt) {
            this.dt = dt;
        }

        public Integer getPrecipitation() {
            return precipitation;
        }

        public void setPrecipitation(Integer precipitation) {
            this.precipitation = precipitation;
        }

    }

    public class Rain {

        @SerializedName("1h")
        @Expose
        private Double _1h;

        public Double get1h() {
            return _1h;
        }

        public void set1h(Double _1h) {
            this._1h = _1h;
        }

    }

    public class Rain__1 {

        @SerializedName("1h")
        @Expose
        private Double _1h;

        public Double get1h() {
            return _1h;
        }

        public void set1h(Double _1h) {
            this._1h = _1h;
        }

    }

    public class Temp implements Serializable {

        @SerializedName("day")
        @Expose
        private Double day;
        @SerializedName("min")
        @Expose
        private Double min;
        @SerializedName("max")
        @Expose
        private Double max;
        @SerializedName("night")
        @Expose
        private Double night;
        @SerializedName("eve")
        @Expose
        private Double eve;
        @SerializedName("morn")
        @Expose
        private Double morn;

        public Double getDay() {
            return day;
        }

        public void setDay(Double day) {
            this.day = day;
        }

        public Double getMin() {
            return min;
        }

        public void setMin(Double min) {
            this.min = min;
        }

        public Double getMax() {
            return max;
        }

        public void setMax(Double max) {
            this.max = max;
        }

        public Double getNight() {
            return night;
        }

        public void setNight(Double night) {
            this.night = night;
        }

        public Double getEve() {
            return eve;
        }

        public void setEve(Double eve) {
            this.eve = eve;
        }

        public Double getMorn() {
            return morn;
        }

        public void setMorn(Double morn) {
            this.morn = morn;
        }

    }
}


