package com.qweather.sdk.bean.history;

import com.qweather.sdk.bean.Basic;
import com.qweather.sdk.bean.Refer;
import com.qweather.sdk.bean.base.Code;
import java.util.List;

/* loaded from: classes17.dex */
public class HistoricalAirBean {
    private List<AirHourlyBean> airHourlyBeans;
    private Basic basic;
    private Code code;
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

    public List<AirHourlyBean> getAirHourlyBeans() {
        return this.airHourlyBeans;
    }

    public void setAirHourlyBeans(List<AirHourlyBean> list) {
        this.airHourlyBeans = list;
    }

    public static class AirHourlyBean {
        String aqi;
        String category;
        String co;
        String level;
        String no2;
        String o3;
        String pm10;
        String pm2p5;
        String primary;
        String pubTime;
        String so2;

        public String getPubTime() {
            return this.pubTime;
        }

        public void setPubTime(String str) {
            this.pubTime = str;
        }

        public String getAqi() {
            return this.aqi;
        }

        public void setAqi(String str) {
            this.aqi = str;
        }

        public String getPrimary() {
            return this.primary;
        }

        public void setPrimary(String str) {
            this.primary = str;
        }

        public String getLevel() {
            return this.level;
        }

        public void setLevel(String str) {
            this.level = str;
        }

        public String getCategory() {
            return this.category;
        }

        public void setCategory(String str) {
            this.category = str;
        }

        public String getPm10() {
            return this.pm10;
        }

        public void setPm10(String str) {
            this.pm10 = str;
        }

        public String getPm2p5() {
            return this.pm2p5;
        }

        public void setPm2p5(String str) {
            this.pm2p5 = str;
        }

        public String getNo2() {
            return this.no2;
        }

        public void setNo2(String str) {
            this.no2 = str;
        }

        public String getSo2() {
            return this.so2;
        }

        public void setSo2(String str) {
            this.so2 = str;
        }

        public String getCo() {
            return this.co;
        }

        public void setCo(String str) {
            this.co = str;
        }

        public String getO3() {
            return this.o3;
        }

        public void setO3(String str) {
            this.o3 = str;
        }
    }
}
