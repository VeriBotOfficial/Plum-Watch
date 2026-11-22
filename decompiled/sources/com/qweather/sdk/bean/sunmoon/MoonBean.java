package com.qweather.sdk.bean.sunmoon;

import com.qweather.sdk.bean.Basic;
import com.qweather.sdk.bean.Refer;
import com.qweather.sdk.bean.base.Code;
import java.util.List;

/* loaded from: classes17.dex */
public class MoonBean {
    private Basic basic;
    private Code code;
    private List<MoonPhaseBean> moonPhaseBeanList;
    private String moonrise;
    private String moonset;
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

    public List<MoonPhaseBean> getMoonPhaseBeanList() {
        return this.moonPhaseBeanList;
    }

    public void setMoonPhaseBeanList(List<MoonPhaseBean> list) {
        this.moonPhaseBeanList = list;
    }

    public String getMoonset() {
        return this.moonset;
    }

    public void setMoonset(String str) {
        this.moonset = str;
    }

    public String getMoonrise() {
        return this.moonrise;
    }

    public void setMoonrise(String str) {
        this.moonrise = str;
    }

    public static class MoonPhaseBean {
        private String fxTime;
        private String icon;
        private String illumination;
        private String name;
        private String value;

        public String getFxTime() {
            return this.fxTime;
        }

        public void setFxTime(String str) {
            this.fxTime = str;
        }

        public String getValue() {
            return this.value;
        }

        public void setValue(String str) {
            this.value = str;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String str) {
            this.name = str;
        }

        public String getIllumination() {
            return this.illumination;
        }

        public void setIllumination(String str) {
            this.illumination = str;
        }

        public String getIcon() {
            return this.icon;
        }

        public void setIcon(String str) {
            this.icon = str;
        }
    }
}
