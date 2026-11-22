package com.qweather.sdk.bean.weather;

import com.qweather.sdk.bean.Basic;
import com.qweather.sdk.bean.Refer;
import com.qweather.sdk.bean.base.Code;
import java.util.List;

/* loaded from: classes17.dex */
public class WeatherHourlyBean {
    private Basic basic;
    private Code code;
    private List<HourlyBean> hourly;
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

    public List<HourlyBean> getHourly() {
        return this.hourly;
    }

    public void setHourly(List<HourlyBean> list) {
        this.hourly = list;
    }

    public static class HourlyBean {
        private String cloud;
        private String dew;
        private String fxTime;
        private String humidity;
        private String icon;
        private String pop;
        private String precip;
        private String pressure;
        private String temp;
        private String text;
        private String wind360;
        private String windDir;
        private String windScale;
        private String windSpeed;

        public String getPop() {
            return this.pop;
        }

        public void setPop(String str) {
            this.pop = str;
        }

        public String getTemp() {
            return this.temp;
        }

        public void setTemp(String str) {
            this.temp = str;
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

        public String getCloud() {
            return this.cloud;
        }

        public void setCloud(String str) {
            this.cloud = str;
        }

        public String getDew() {
            return this.dew;
        }

        public void setDew(String str) {
            this.dew = str;
        }

        public String getFxTime() {
            return this.fxTime;
        }

        public void setFxTime(String str) {
            this.fxTime = str;
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
    }
}
