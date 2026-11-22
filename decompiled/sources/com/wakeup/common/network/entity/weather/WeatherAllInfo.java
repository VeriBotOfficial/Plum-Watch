package com.wakeup.common.network.entity.weather;

import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes2.dex */
public class WeatherAllInfo {
    private List<WeatherDayModel> dailyVoList;
    private String locationId;
    private NowWeather nowWeathers;
    private String updateTime;

    public String getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public List<WeatherDayModel> getDailyVoList() {
        return this.dailyVoList;
    }

    public void setDailyVoList(List<WeatherDayModel> dailyVoList) {
        this.dailyVoList = dailyVoList;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getLocationId() {
        return this.locationId;
    }

    public NowWeather getNowWeathers() {
        return this.nowWeathers;
    }

    public void setNowWeathers(NowWeather nowWeathers) {
        this.nowWeathers = nowWeathers;
    }

    public String toString() {
        return "WeatherAllInfo{updateTime='" + this.updateTime + "', locationId='" + this.locationId + "', dailyVoList=" + this.dailyVoList + ", nowWeathers=" + this.nowWeathers + AbstractJsonLexerKt.END_OBJ;
    }
}
