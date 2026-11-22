package com.qweather.sdk.bean.sunmoon;

import com.qweather.sdk.bean.Refer;
import com.qweather.sdk.bean.base.Code;

/* loaded from: classes17.dex */
public class SolarElevationAngleBean {
    private Code code;
    private String hourAngle;
    private Refer refer;
    private String solarAzimuthAngle;
    private String solarElevationAngle;
    private String solarHour;

    public Code getCode() {
        return this.code;
    }

    public void setCode(Code code) {
        this.code = code;
    }

    public Refer getRefer() {
        return this.refer;
    }

    public void setRefer(Refer refer) {
        this.refer = refer;
    }

    public String getSolarElevationAngle() {
        return this.solarElevationAngle;
    }

    public void setSolarElevationAngle(String str) {
        this.solarElevationAngle = str;
    }

    public String getSolarAzimuthAngle() {
        return this.solarAzimuthAngle;
    }

    public void setSolarAzimuthAngle(String str) {
        this.solarAzimuthAngle = str;
    }

    public String getSolarHour() {
        return this.solarHour;
    }

    public void setSolarHour(String str) {
        this.solarHour = str;
    }

    public String getHourAngle() {
        return this.hourAngle;
    }

    public void setHourAngle(String str) {
        this.hourAngle = str;
    }
}
