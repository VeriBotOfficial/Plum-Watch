package com.amap.api.services.weather;

import com.amap.api.col.p0003sl.b6;

/* loaded from: classes11.dex */
public class WeatherSearchQuery implements Cloneable {
    public static final int WEATHER_TYPE_FORECAST = 2;
    public static final int WEATHER_TYPE_LIVE = 1;

    /* renamed from: a, reason: collision with root package name */
    private String f2225a;
    private int b;

    public WeatherSearchQuery(String str, int i) {
        this.f2225a = str;
        this.b = i;
    }

    public String getCity() {
        return this.f2225a;
    }

    public int getType() {
        return this.b;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public WeatherSearchQuery m6908clone() {
        try {
            super.clone();
        } catch (CloneNotSupportedException e) {
            b6.a(e, "WeatherSearchQuery", "clone");
        }
        return new WeatherSearchQuery(this.f2225a, this.b);
    }

    public WeatherSearchQuery() {
        this.b = 1;
    }
}
