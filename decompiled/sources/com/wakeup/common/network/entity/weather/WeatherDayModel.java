package com.wakeup.common.network.entity.weather;

import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes2.dex */
public class WeatherDayModel {
    private String cloud;
    private Integer code;
    private String fxDate;
    private List<WeatherHourModel> hourlyVoList;
    private String humidity;
    private String moonPhase;
    private String moonrise;
    private String moonset;
    private String precip;
    private String pressure;
    private String sunrise;
    private String sunset;
    private String temp;
    private String tempMax;
    private String tempMin;
    private String uvIndex;
    private String vis;
    private String wind360Day;
    private String wind360Night;
    private String windDirDay;
    private String windDirNight;
    private String windScaleDay;
    private String windScaleNight;
    private String windSpeedDay;
    private String windSpeedNight;

    public List<WeatherHourModel> getHourlyVoList() {
        return this.hourlyVoList;
    }

    public void setHourlyVoList(List<WeatherHourModel> hourlyVoList) {
        this.hourlyVoList = hourlyVoList;
    }

    public String getFxDate() {
        return this.fxDate;
    }

    public void setFxDate(String fxDate) {
        this.fxDate = fxDate;
    }

    public String getSunrise() {
        return this.sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return this.sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public String getMoonrise() {
        return this.moonrise;
    }

    public void setMoonrise(String moonrise) {
        this.moonrise = moonrise;
    }

    public String getMoonset() {
        return this.moonset;
    }

    public void setMoonset(String moonset) {
        this.moonset = moonset;
    }

    public String getMoonPhase() {
        return this.moonPhase;
    }

    public void setMoonPhase(String moonPhase) {
        this.moonPhase = moonPhase;
    }

    public String getTempMax() {
        return this.tempMax;
    }

    public void setTempMax(String tempMax) {
        this.tempMax = tempMax;
    }

    public String getTempMin() {
        return this.tempMin;
    }

    public void setTempMin(String tempMin) {
        this.tempMin = tempMin;
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getWind360Day() {
        return this.wind360Day;
    }

    public void setWind360Day(String wind360Day) {
        this.wind360Day = wind360Day;
    }

    public String getWindDirDay() {
        return this.windDirDay;
    }

    public void setWindDirDay(String windDirDay) {
        this.windDirDay = windDirDay;
    }

    public String getWindScaleDay() {
        return this.windScaleDay;
    }

    public void setWindScaleDay(String windScaleDay) {
        this.windScaleDay = windScaleDay;
    }

    public String getWindSpeedDay() {
        return this.windSpeedDay;
    }

    public void setWindSpeedDay(String windSpeedDay) {
        this.windSpeedDay = windSpeedDay;
    }

    public String getWind360Night() {
        return this.wind360Night;
    }

    public void setWind360Night(String wind360Night) {
        this.wind360Night = wind360Night;
    }

    public String getWindDirNight() {
        return this.windDirNight;
    }

    public void setWindDirNight(String windDirNight) {
        this.windDirNight = windDirNight;
    }

    public String getWindScaleNight() {
        return this.windScaleNight;
    }

    public void setWindScaleNight(String windScaleNight) {
        this.windScaleNight = windScaleNight;
    }

    public String getWindSpeedNight() {
        return this.windSpeedNight;
    }

    public void setWindSpeedNight(String windSpeedNight) {
        this.windSpeedNight = windSpeedNight;
    }

    public String getUvIndex() {
        return this.uvIndex;
    }

    public void setUvIndex(String uvIndex) {
        this.uvIndex = uvIndex;
    }

    public String getPrecip() {
        return this.precip;
    }

    public void setPrecip(String precip) {
        this.precip = precip;
    }

    public String getHumidity() {
        return this.humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getPressure() {
        return this.pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getVis() {
        return this.vis;
    }

    public void setVis(String vis) {
        this.vis = vis;
    }

    public String getCloud() {
        return this.cloud;
    }

    public void setCloud(String cloud) {
        this.cloud = cloud;
    }

    public String getTemp() {
        return this.temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String toString() {
        return "WeatherDayModel{fxDate='" + this.fxDate + "', sunrise='" + this.sunrise + "', sunset='" + this.sunset + "', moonrise='" + this.moonrise + "', moonset='" + this.moonset + "', moonPhase='" + this.moonPhase + "', tempMax='" + this.tempMax + "', tempMin='" + this.tempMin + "', code=" + this.code + ", wind360Day='" + this.wind360Day + "', windDirDay='" + this.windDirDay + "', windScaleDay='" + this.windScaleDay + "', windSpeedDay='" + this.windSpeedDay + "', wind360Night='" + this.wind360Night + "', windDirNight='" + this.windDirNight + "', windScaleNight='" + this.windScaleNight + "', windSpeedNight='" + this.windSpeedNight + "', uvIndex='" + this.uvIndex + "', precip='" + this.precip + "', humidity='" + this.humidity + "', pressure='" + this.pressure + "', vis='" + this.vis + "', cloud='" + this.cloud + "', temp='" + this.temp + "', hourlyVoList=" + this.hourlyVoList + AbstractJsonLexerKt.END_OBJ;
    }
}
