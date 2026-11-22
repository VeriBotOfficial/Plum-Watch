package com.qweather.sdk.bean.sunmoon;

import com.qweather.sdk.bean.Basic;
import com.qweather.sdk.bean.Refer;
import com.qweather.sdk.bean.base.Code;

/* loaded from: classes17.dex */
public class SunBean {
    private Basic basic;
    private Code code;
    private Refer refer;
    private String sunrise;
    private String sunset;

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
}
