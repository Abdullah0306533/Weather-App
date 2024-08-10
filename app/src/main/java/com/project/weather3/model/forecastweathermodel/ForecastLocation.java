package com.project.weather3.model.forecastweathermodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * This class represents the location details in the weather forecast.
 */
public class ForecastLocation {

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("region")
    @Expose
    private String region;

    @SerializedName("country")
    @Expose
    private String country;

    @SerializedName("lat")
    @Expose
    private Double lat;

    @SerializedName("lon")
    @Expose
    private Double lon;

    @SerializedName("tz_id")
    @Expose
    private String tzId;

    @SerializedName("localtime_epoch")
    @Expose
    private Integer localtimeEpoch;

    @SerializedName("localtime")
    @Expose
    private String localtime;

    /**
     * Gets the name of the location.
     *
     * @return The name of the location.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the location.
     *
     * @param name The name of the location.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the region of the location.
     *
     * @return The region of the location.
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the region of the location.
     *
     * @param region The region of the location.
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Gets the country of the location.
     *
     * @return The country of the location.
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the country of the location.
     *
     * @param country The country of the location.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Gets the latitude of the location.
     *
     * @return The latitude of the location.
     */
    public Double getLat() {
        return lat;
    }

    /**
     * Sets the latitude of the location.
     *
     * @param lat The latitude of the location.
     */
    public void setLat(Double lat) {
        this.lat = lat;
    }

    /**
     * Gets the longitude of the location.
     *
     * @return The longitude of the location.
     */
    public Double getLon() {
        return lon;
    }

    /**
     * Sets the longitude of the location.
     *
     * @param lon The longitude of the location.
     */
    public void setLon(Double lon) {
        this.lon = lon;
    }

    /**
     * Gets the timezone ID of the location.
     *
     * @return The timezone ID of the location.
     */
    public String getTzId() {
        return tzId;
    }

    /**
     * Sets the timezone ID of the location.
     *
     * @param tzId The timezone ID of the location.
     */
    public void setTzId(String tzId) {
        this.tzId = tzId;
    }

    /**
     * Gets the local time in epoch format.
     *
     * @return The local time in epoch format.
     */
    public Integer getLocaltimeEpoch() {
        return localtimeEpoch;
    }

    /**
     * Sets the local time in epoch format.
     *
     * @param localtimeEpoch The local time in epoch format.
     */
    public void setLocaltimeEpoch(Integer localtimeEpoch) {
        this.localtimeEpoch = localtimeEpoch;
    }

    /**
     * Gets the local time as a string.
     *
     * @return The local time as a string.
     */
    public String getLocaltime() {
        return localtime;
    }

    /**
     * Sets the local time as a string.
     *
     * @param localtime The local time as a string.
     */
    public void setLocaltime(String localtime) {
        this.localtime = localtime;
    }
}
