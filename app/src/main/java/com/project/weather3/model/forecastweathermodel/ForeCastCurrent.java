package com.project.weather3.model.forecastweathermodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * This class represents the current weather data in the forecast.
 */
public class ForeCastCurrent {

        @SerializedName("temp_c")
        @Expose
        private Double tempC;

        @SerializedName("wind_kph")
        @Expose
        private Double windKph;

        @SerializedName("wind_dir")
        @Expose
        private String windDir;

        @SerializedName("pressure_mb")
        @Expose
        private Double pressureMb;

        @SerializedName("precip_mm")
        @Expose
        private Double precipMm;

        @SerializedName("humidity")
        @Expose
        private Integer humidity;

        @SerializedName("cloud")
        @Expose
        private Integer cloud;

        @SerializedName("feelslike_c")
        @Expose
        private Double feelslikeC;

        @SerializedName("windchill_c")
        @Expose
        private Double windchillC;

        @SerializedName("heatindex_c")
        @Expose
        private Double heatindexC;

        @SerializedName("dewpoint_c")
        @Expose
        private Double dewpointC;

        @SerializedName("vis_km")
        @Expose
        private Double visKm;

        @SerializedName("uv")
        @Expose
        private Double uv;

        @SerializedName("gust_kph")
        @Expose
        private Double gustKph;

        /**
         * Gets the current temperature in Celsius.
         *
         * @return The current temperature in Celsius.
         */
        public Double getTempC() {
                return tempC;
        }

        /**
         * Sets the current temperature in Celsius.
         *
         * @param tempC The current temperature in Celsius.
         */
        public void setTempC(Double tempC) {
                this.tempC = tempC;
        }

        /**
         * Gets the wind speed in kilometers per hour.
         *
         * @return The wind speed in kilometers per hour.
         */
        public Double getWindKph() {
                return windKph;
        }

        /**
         * Sets the wind speed in kilometers per hour.
         *
         * @param windKph The wind speed in kilometers per hour.
         */
        public void setWindKph(Double windKph) {
                this.windKph = windKph;
        }

        /**
         * Gets the wind direction.
         *
         * @return The wind direction.
         */
        public String getWindDir() {
                return windDir;
        }

        /**
         * Sets the wind direction.
         *
         * @param windDir The wind direction.
         */
        public void setWindDir(String windDir) {
                this.windDir = windDir;
        }

        /**
         * Gets the pressure in millibars.
         *
         * @return The pressure in millibars.
         */
        public Double getPressureMb() {
                return pressureMb;
        }

        /**
         * Sets the pressure in millibars.
         *
         * @param pressureMb The pressure in millibars.
         */
        public void setPressureMb(Double pressureMb) {
                this.pressureMb = pressureMb;
        }

        /**
         * Gets the precipitation amount in millimeters.
         *
         * @return The precipitation amount in millimeters.
         */
        public Double getPrecipMm() {
                return precipMm;
        }

        /**
         * Sets the precipitation amount in millimeters.
         *
         * @param precipMm The precipitation amount in millimeters.
         */
        public void setPrecipMm(Double precipMm) {
                this.precipMm = precipMm;
        }

        /**
         * Gets the humidity percentage.
         *
         * @return The humidity percentage.
         */
        public Integer getHumidity() {
                return humidity;
        }

        /**
         * Sets the humidity percentage.
         *
         * @param humidity The humidity percentage.
         */
        public void setHumidity(Integer humidity) {
                this.humidity = humidity;
        }

        /**
         * Gets the cloud cover percentage.
         *
         * @return The cloud cover percentage.
         */
        public Integer getCloud() {
                return cloud;
        }

        /**
         * Sets the cloud cover percentage.
         *
         * @param cloud The cloud cover percentage.
         */
        public void setCloud(Integer cloud) {
                this.cloud = cloud;
        }

        /**
         * Gets the feels-like temperature in Celsius.
         *
         * @return The feels-like temperature in Celsius.
         */
        public Double getFeelslikeC() {
                return feelslikeC;
        }

        /**
         * Sets the feels-like temperature in Celsius.
         *
         * @param feelslikeC The feels-like temperature in Celsius.
         */
        public void setFeelslikeC(Double feelslikeC) {
                this.feelslikeC = feelslikeC;
        }

        /**
         * Gets the wind chill temperature in Celsius.
         *
         * @return The wind chill temperature in Celsius.
         */
        public Double getWindchillC() {
                return windchillC;
        }

        /**
         * Sets the wind chill temperature in Celsius.
         *
         * @param windchillC The wind chill temperature in Celsius.
         */
        public void setWindchillC(Double windchillC) {
                this.windchillC = windchillC;
        }

        /**
         * Gets the heat index temperature in Celsius.
         *
         * @return The heat index temperature in Celsius.
         */
        public Double getHeatindexC() {
                return heatindexC;
        }

        /**
         * Sets the heat index temperature in Celsius.
         *
         * @param heatindexC The heat index temperature in Celsius.
         */
        public void setHeatindexC(Double heatindexC) {
                this.heatindexC = heatindexC;
        }

        /**
         * Gets the dew point temperature in Celsius.
         *
         * @return The dew point temperature in Celsius.
         */
        public Double getDewpointC() {
                return dewpointC;
        }

        /**
         * Sets the dew point temperature in Celsius.
         *
         * @param dewpointC The dew point temperature in Celsius.
         */
        public void setDewpointC(Double dewpointC) {
                this.dewpointC = dewpointC;
        }

        /**
         * Gets the visibility in kilometers.
         *
         * @return The visibility in kilometers.
         */
        public Double getVisKm() {
                return visKm;
        }

        /**
         * Sets the visibility in kilometers.
         *
         * @param visKm The visibility in kilometers.
         */
        public void setVisKm(Double visKm) {
                this.visKm = visKm;
        }

        /**
         * Gets the UV index.
         *
         * @return The UV index.
         */
        public Double getUv() {
                return uv;
        }

        /**
         * Sets the UV index.
         *
         * @param uv The UV index.
         */
        public void setUv(Double uv) {
                this.uv = uv;
        }

        /**
         * Gets the gust speed in kilometers per hour.
         *
         * @return The gust speed in kilometers per hour.
         */
        public Double getGustKph() {
                return gustKph;
        }

        /**
         * Sets the gust speed in kilometers per hour.
         *
         * @param gustKph The gust speed in kilometers per hour.
         */
        public void setGustKph(Double gustKph) {
                this.gustKph = gustKph;
        }
}
