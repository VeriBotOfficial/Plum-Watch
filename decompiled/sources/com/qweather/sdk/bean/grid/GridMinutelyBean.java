package com.qweather.sdk.bean.grid;

import com.qweather.sdk.bean.Basic;
import com.qweather.sdk.bean.Refer;
import com.qweather.sdk.bean.base.Code;
import java.util.List;

/* loaded from: classes17.dex */
public class GridMinutelyBean {
    private Basic basic;
    private Code code;
    private List<Minutely> minutelyList;
    private Refer refer;
    private String summary;

    public Code getCode() {
        return this.code;
    }

    public void setCode(Code code) {
        this.code = code;
    }

    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String str) {
        this.summary = str;
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

    public List<Minutely> getMinutelyList() {
        return this.minutelyList;
    }

    public void setMinutelyList(List<Minutely> list) {
        this.minutelyList = list;
    }

    public static class Minutely {
        private String fxTime;
        private String precip;
        private String type;

        public String getFxTime() {
            return this.fxTime;
        }

        public void setFxTime(String str) {
            this.fxTime = str;
        }

        public String getPrecip() {
            return this.precip;
        }

        public void setPrecip(String str) {
            this.precip = str;
        }

        public String getType() {
            return this.type;
        }

        public void setType(String str) {
            this.type = str;
        }
    }
}
