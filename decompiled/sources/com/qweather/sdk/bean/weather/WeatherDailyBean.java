package com.qweather.sdk.bean.weather;

import com.qweather.sdk.bean.Basic;
import com.qweather.sdk.bean.Refer;
import com.qweather.sdk.bean.base.Code;
import java.util.List;

/* loaded from: classes17.dex */
public class WeatherDailyBean {
    private Basic basic;
    private Code code;
    private List<DailyBean> daily;
    private Refer refer;

    public Refer getRefer() {
        return this.refer;
    }

    public void setRefer(Refer refer) {
        this.refer = refer;
    }

    public Code getCode() {
        return this.code;
    }

    public void setCode(Code code) {
        this.code = code;
    }

    public Basic getBasic() {
        return this.basic;
    }

    public void setBasic(Basic basic) {
        this.basic = basic;
    }

    public List<DailyBean> getDaily() {
        return this.daily;
    }

    public void setDaily(List<DailyBean> list) {
        this.daily = list;
    }

    public static class DailyBean {
        String fxDate = "";
        String sunrise = "";
        String sunset = "";
        String moonRise = "";
        String moonSet = "";
        String moonPhase = "";
        String tempMax = "";
        String tempMin = "";
        String iconDay = "";
        String textDay = "";
        String iconNight = "";
        String textNight = "";
        String wind360Day = "";
        String windDirDay = "";
        String windScaleDay = "";
        String windSpeedDay = "";
        String wind360Night = "";
        String windDirNight = "";
        String windScaleNight = "";
        String windSpeedNight = "";
        String humidity = "";
        String precip = "";
        String pressure = "";
        String vis = "";
        String cloud = "";
        String uvIndex = "";
        String moonPhaseIcon = "";

        public String getFxDate() {
            return this.fxDate;
        }

        public void setFxDate(String str) {
            this.fxDate = str;
        }

        public String getSunrise() {
            return this.sunrise;
        }

        public void setSunrise(String str) {
            this.sunrise = str;
        }

        public String getSunset() {
            return this.sunset;
        }

        public void setSunset(String str) {
            this.sunset = str;
        }

        public String getMoonRise() {
            return this.moonRise;
        }

        public void setMoonRise(String str) {
            this.moonRise = str;
        }

        public String getMoonSet() {
            return this.moonSet;
        }

        public void setMoonSet(String str) {
            this.moonSet = str;
        }

        public String getMoonPhase() {
            return this.moonPhase;
        }

        public void setMoonPhase(String str) {
            this.moonPhase = str;
        }

        public String getTempMax() {
            return this.tempMax;
        }

        public void setTempMax(String str) {
            this.tempMax = str;
        }

        public String getTempMin() {
            return this.tempMin;
        }

        public void setTempMin(String str) {
            this.tempMin = str;
        }

        public String getIconDay() {
            return this.iconDay;
        }

        public void setIconDay(String str) {
            this.iconDay = str;
        }

        public String getTextDay() {
            return this.textDay;
        }

        public void setTextDay(String str) {
            this.textDay = str;
        }

        public String getIconNight() {
            return this.iconNight;
        }

        public void setIconNight(String str) {
            this.iconNight = str;
        }

        public String getTextNight() {
            return this.textNight;
        }

        public void setTextNight(String str) {
            this.textNight = str;
        }

        public String getWind360Day() {
            return this.wind360Day;
        }

        public void setWind360Day(String str) {
            this.wind360Day = str;
        }

        public String getWindDirDay() {
            return this.windDirDay;
        }

        public void setWindDirDay(String str) {
            this.windDirDay = str;
        }

        public String getWindScaleDay() {
            return this.windScaleDay;
        }

        public void setWindScaleDay(String str) {
            this.windScaleDay = str;
        }

        public String getWindSpeedDay() {
            return this.windSpeedDay;
        }

        public void setWindSpeedDay(String str) {
            this.windSpeedDay = str;
        }

        public String getWind360Night() {
            return this.wind360Night;
        }

        public void setWind360Night(String str) {
            this.wind360Night = str;
        }

        public String getWindDirNight() {
            return this.windDirNight;
        }

        public void setWindDirNight(String str) {
            this.windDirNight = str;
        }

        public String getWindScaleNight() {
            return this.windScaleNight;
        }

        public void setWindScaleNight(String str) {
            this.windScaleNight = str;
        }

        public String getWindSpeedNight() {
            return this.windSpeedNight;
        }

        public void setWindSpeedNight(String str) {
            this.windSpeedNight = str;
        }

        public String getHumidity() {
            return this.humidity;
        }

        public void setHumidity(String str) {
            this.humidity = str;
        }

        public String getPrecip() {
            return this.precip;
        }

        public void setPrecip(String str) {
            this.precip = str;
        }

        public String getPressure() {
            return this.pressure;
        }

        public void setPressure(String str) {
            this.pressure = str;
        }

        public String getVis() {
            return this.vis;
        }

        public void setVis(String str) {
            this.vis = str;
        }

        public String getCloud() {
            return this.cloud;
        }

        public void setCloud(String str) {
            this.cloud = str;
        }

        public String getUvIndex() {
            return this.uvIndex;
        }

        public void setUvIndex(String str) {
            this.uvIndex = str;
        }

        public String getMoonPhaseIcon() {
            return this.moonPhaseIcon;
        }

        public void setMoonPhaseIcon(String str) {
            this.moonPhaseIcon = str;
        }
    }
}
