package com.qweather.sdk.bean.history;

import com.qweather.sdk.bean.Basic;
import com.qweather.sdk.bean.Refer;
import com.qweather.sdk.bean.base.Code;
import java.util.List;

/* loaded from: classes17.dex */
public class HistoricalWeatherBean {
    private Basic basic;
    private Code code;
    private DailyBean dailyBean;
    private List<HourlyBean> hourlyBeans;
    private Refer refer;

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

    public Refer getRefer() {
        return this.refer;
    }

    public void setRefer(Refer refer) {
        this.refer = refer;
    }

    public DailyBean getDailyBean() {
        return this.dailyBean;
    }

    public void setDailyBean(DailyBean dailyBean) {
        this.dailyBean = dailyBean;
    }

    public List<HourlyBean> getHourlyBeans() {
        return this.hourlyBeans;
    }

    public void setHourlyBeans(List<HourlyBean> list) {
        this.hourlyBeans = list;
    }

    public static class DailyBean {
        String date;
        String humidity;
        String moonPhase;
        String moonRise;
        String moonSet;
        String precip;
        String pressure;
        String sunrise;
        String sunset;
        String tempMax;
        String tempMin;

        public String getDate() {
            return this.date;
        }

        public void setDate(String str) {
            this.date = str;
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
    }

    public static class HourlyBean {
        String humidity;
        String icon;
        String precip;
        String pressure;
        String temp;
        String text;
        String time;
        String wind360;
        String windDir;
        String windScale;
        String windSpeed;

        public String getTime() {
            return this.time;
        }

        public void setTime(String str) {
            this.time = str;
        }

        public String getTemp() {
            return this.temp;
        }

        public void setTemp(String str) {
            this.temp = str;
        }

        public String getIcon() {
            return this.icon;
        }

        public void setIcon(String str) {
            this.icon = str;
        }

        public String getText() {
            return this.text;
        }

        public void setText(String str) {
            this.text = str;
        }

        public String getPrecip() {
            return this.precip;
        }

        public void setPrecip(String str) {
            this.precip = str;
        }

        public String getWind360() {
            return this.wind360;
        }

        public void setWind360(String str) {
            this.wind360 = str;
        }

        public String getWindDir() {
            return this.windDir;
        }

        public void setWindDir(String str) {
            this.windDir = str;
        }

        public String getWindScale() {
            return this.windScale;
        }

        public void setWindScale(String str) {
            this.windScale = str;
        }

        public String getWindSpeed() {
            return this.windSpeed;
        }

        public void setWindSpeed(String str) {
            this.windSpeed = str;
        }

        public String getHumidity() {
            return this.humidity;
        }

        public void setHumidity(String str) {
            this.humidity = str;
        }

        public String getPressure() {
            return this.pressure;
        }

        public void setPressure(String str) {
            this.pressure = str;
        }
    }
}
