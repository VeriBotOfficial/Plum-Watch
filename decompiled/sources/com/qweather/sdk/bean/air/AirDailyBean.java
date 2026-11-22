package com.qweather.sdk.bean.air;

import com.qweather.sdk.bean.Basic;
import com.qweather.sdk.bean.Refer;
import com.qweather.sdk.bean.base.Code;
import java.util.List;

/* loaded from: classes17.dex */
public class AirDailyBean {
    private List<DailyBean> airDailyBeans;
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

    public List<DailyBean> getAirDaily() {
        return this.airDailyBeans;
    }

    public void setAirDaily(List<DailyBean> list) {
        this.airDailyBeans = list;
    }

    public static class DailyBean {
        private String aqi;
        private String category;
        private String fxDate;
        private String level;
        private String primary;

        public String getFxDate() {
            return this.fxDate;
        }

        public void setFxDate(String str) {
            this.fxDate = str;
        }

        public String getAqi() {
            return this.aqi;
        }

        public void setAqi(String str) {
            this.aqi = str;
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

        public String getPrimary() {
            return this.primary;
        }

        public void setPrimary(String str) {
            this.primary = str;
        }
    }
}
