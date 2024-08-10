package com.project.weather3.model.forecastweathermodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * This class represents a single day's forecast in the weather data.
 */
public class ForeCastDay {

    @SerializedName("maxtemp_c")
    @Expose
    private Double maxtempC;

    @SerializedName("mintemp_c")
    @Expose
    private Double mintempC;

    @SerializedName("avgtemp_c")
    @Expose
    private Double avgtempC;

    @SerializedName("maxwind_kph")
    @Expose
    private Double maxwindKph;

    @SerializedName("totalprecip_mm")
    @Expose
    private Double totalprecipMm;

    @SerializedName("totalsnow_cm")
    @Expose
    private Double totalsnowCm;

    @SerializedName("avgvis_km")
    @Expose
    private Double avgvisKm;

    @SerializedName("avghumidity")
    @Expose
    private Integer avghumidity;

    @SerializedName("daily_will_it_rain")
    @Expose
    private Integer dailyWillItRain;

    @SerializedName("daily_chance_of_rain")
    @Expose
    private Integer dailyChanceOfRain;

    @SerializedName("daily_will_it_snow")
    @Expose
    private Integer dailyWillItSnow;

    @SerializedName("daily_chance_of_snow")
    @Expose
    private Integer dailyChanceOfSnow;

    // Getters and setters for all the fields go here

    public Double getMaxtempC() {
        return maxtempC;
    }

    public void setMaxtempC(Double maxtempC) {
        this.maxtempC = maxtempC;
    }

    public Double getMintempC() {
        return mintempC;
    }

    public void setMintempC(Double mintempC) {
        this.mintempC = mintempC;
    }

    public Double getAvgtempC() {
        return avgtempC;
    }

    public void setAvgtempC(Double avgtempC) {
        this.avgtempC = avgtempC;
    }

    public Double getMaxwindKph() {
        return maxwindKph;
    }

    public void setMaxwindKph(Double maxwindKph) {
        this.maxwindKph = maxwindKph;
    }

    public Double getTotalprecipMm() {
        return totalprecipMm;
    }

    public void setTotalprecipMm(Double totalprecipMm) {
        this.totalprecipMm = totalprecipMm;
    }

    public Double getTotalsnowCm() {
        return totalsnowCm;
    }

    public void setTotalsnowCm(Double totalsnowCm) {
        this.totalsnowCm = totalsnowCm;
    }

    public Double getAvgvisKm() {
        return avgvisKm;
    }

    public void setAvgvisKm(Double avgvisKm) {
        this.avgvisKm = avgvisKm;
    }

    public Integer getAvghumidity() {
        return avghumidity;
    }

    public void setAvghumidity(Integer avghumidity) {
        this.avghumidity = avghumidity;
    }

    public Integer getDailyWillItRain() {
        return dailyWillItRain;
    }

    public void setDailyWillItRain(Integer dailyWillItRain) {
        this.dailyWillItRain = dailyWillItRain;
    }

    public Integer getDailyChanceOfRain() {
        return dailyChanceOfRain;
    }

    public void setDailyChanceOfRain(Integer dailyChanceOfRain) {
        this.dailyChanceOfRain = dailyChanceOfRain;
    }

    public Integer getDailyWillItSnow() {
        return dailyWillItSnow;
    }

    public void setDailyWillItSnow(Integer dailyWillItSnow) {
        this.dailyWillItSnow = dailyWillItSnow;
    }

    public Integer getDailyChanceOfSnow() {
        return dailyChanceOfSnow;
    }

    public void setDailyChanceOfSnow(Integer dailyChanceOfSnow) {
        this.dailyChanceOfSnow = dailyChanceOfSnow;
    }
}
