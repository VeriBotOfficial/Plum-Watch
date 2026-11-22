package com.qweather.sdk.bean.grid;

import com.qweather.sdk.bean.Basic;
import com.qweather.sdk.bean.Refer;
import com.qweather.sdk.bean.base.Code;

/* loaded from: classes17.dex */
public class GridWeatherNowBean {
    private Basic basic;
    private Code code;
    private NowBean now;
    private Refer refer;

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

    public Code getCode() {
        return this.code;
    }

    public void setCode(Code code) {
        this.code = code;
    }

    public NowBean getNow() {
        return this.now;
    }

    public void setNow(NowBean nowBean) {
        this.now = nowBean;
    }

    public static class NowBean {
        private String cloud;
        private String dew;
        private String feelsLike;
        private String humidity;
        private String icon;
        private String obsTime;
        private String precip;
        private String pressure;
        private String temp;
        private String text;
        private String wind360;
        private String windDir;
        private String windScale;
        private String windSpeed;

        public String getFeelsLike() {
            return this.feelsLike;
        }

        public void setFeelsLike(String str) {
            this.feelsLike = str;
        }

        public String getObsTime() {
            return this.obsTime;
        }

        public void setObsTime(String str) {
            this.obsTime = str;
        }

        public String getPrecip() {
            return this.precip;
        }

        public void setPrecip(String str) {
            this.precip = str;
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

        public String getWind360() {
            return this.wind360;
        }

        public void setWind360(String str) {
            this.wind360 = str;
        }

        public String getWindSpeed() {
            return this.windSpeed;
        }

        public void setWindSpeed(String str) {
            this.windSpeed = str;
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
    }
}
