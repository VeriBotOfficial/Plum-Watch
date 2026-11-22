package com.qweather.sdk.bean.tropical;

import com.qweather.sdk.bean.Basic;
import com.qweather.sdk.bean.Refer;
import com.qweather.sdk.bean.base.Code;
import java.util.List;

/* loaded from: classes17.dex */
public class StormForecastBean {
    private Basic basic;
    private Code code;
    private List<StormForecastBaseBean> forecastList;
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

    public List<StormForecastBaseBean> getForecastList() {
        return this.forecastList;
    }

    public void setForecastList(List<StormForecastBaseBean> list) {
        this.forecastList = list;
    }

    public static class StormForecastBaseBean {
        private String fxTime;
        private String lat;
        private String lon;
        private String move360;
        private String moveDir;
        private String moveSpeed;
        private String pressure;
        private String type;
        private String windSpeed;

        public String getFxTime() {
            return this.fxTime;
        }

        public void setFxTime(String str) {
            this.fxTime = str;
        }

        public String getLon() {
            return this.lon;
        }

        public void setLon(String str) {
            this.lon = str;
        }

        public String getLat() {
            return this.lat;
        }

        public void setLat(String str) {
            this.lat = str;
        }

        public String getType() {
            return this.type;
        }

        public void setType(String str) {
            this.type = str;
        }

        public String getPressure() {
            return this.pressure;
        }

        public void setPressure(String str) {
            this.pressure = str;
        }

        public String getWindSpeed() {
            return this.windSpeed;
        }

        public void setWindSpeed(String str) {
            this.windSpeed = str;
        }

        public String getMoveSpeed() {
            return this.moveSpeed;
        }

        public void setMoveSpeed(String str) {
            this.moveSpeed = str;
        }

        public String getMoveDir() {
            return this.moveDir;
        }

        public void setMoveDir(String str) {
            this.moveDir = str;
        }

        public String getMove360() {
            return this.move360;
        }

        public void setMove360(String str) {
            this.move360 = str;
        }
    }
}
