package com.amap.api.services.weather;

/* loaded from: classes11.dex */
public class LocalWeatherLiveResult {

    /* renamed from: a, reason: collision with root package name */
    private WeatherSearchQuery f2223a;
    private LocalWeatherLive b;

    private LocalWeatherLiveResult(WeatherSearchQuery weatherSearchQuery, LocalWeatherLive localWeatherLive) {
        this.f2223a = weatherSearchQuery;
        this.b = localWeatherLive;
    }

    public static LocalWeatherLiveResult createPagedResult(WeatherSearchQuery weatherSearchQuery, LocalWeatherLive localWeatherLive) {
        return new LocalWeatherLiveResult(weatherSearchQuery, localWeatherLive);
    }

    public LocalWeatherLive getLiveResult() {
        return this.b;
    }

    public WeatherSearchQuery getWeatherLiveQuery() {
        return this.f2223a;
    }
}
