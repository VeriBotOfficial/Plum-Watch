package com.wakeup.common.network.entity.weather;

/* loaded from: classes2.dex */
public class NowWeather {
    private String cloud;
    private Integer code;
    private String fxTime;
    private String humidity;
    private String pop;
    private String pressure;
    private String temp;
    private String wind360;
    private String windDir;
    private String windScale;
    private String windSpeed;

    public String getFxTime() {
        return this.fxTime;
    }

    public void setFxTime(String fxTime) {
        this.fxTime = fxTime;
    }

    public String getTemp() {
        return this.temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getPop() {
        return this.pop;
    }

    public void setPop(String pop) {
        this.pop = pop;
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

    public String getCloud() {
        return this.cloud;
    }

    public void setCloud(String cloud) {
        this.cloud = cloud;
    }

    public String getWind360() {
        return this.wind360;
    }

    public void setWind360(String wind360) {
        this.wind360 = wind360;
    }

    public String getWindDir() {
        return this.windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public String getWindScale() {
        return this.windScale;
    }

    public void setWindScale(String windScale) {
        this.windScale = windScale;
    }

    public String getWindSpeed() {
        return this.windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }
}
