package com.baidu.platform.core.weather;

import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.weather.OnGetWeatherResultListener;
import com.baidu.mapapi.search.weather.WeatherLifeIndexes;
import com.baidu.mapapi.search.weather.WeatherResult;
import com.baidu.mapapi.search.weather.WeatherSearchAlerts;
import com.baidu.mapapi.search.weather.WeatherSearchForecastForHours;
import com.baidu.mapapi.search.weather.WeatherSearchLocation;
import com.baidu.mapapi.search.weather.WeatherSearchRealTime;
import com.facebook.hermes.intl.Constants;
import com.wakeup.common.burypoint.BuryPointPageId;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmind.core.IWorkspace;

/* compiled from: WeatherParser.java */
/* loaded from: classes13.dex */
public class a extends com.baidu.platform.base.b {
    private boolean b(JSONObject jSONObject, WeatherResult weatherResult) {
        JSONArray optJSONArray;
        if (jSONObject == null || weatherResult == null || (optJSONArray = jSONObject.optJSONArray("forecast_hours")) == null) {
            return false;
        }
        if (weatherResult.getForecastHours() == null) {
            weatherResult.setForecastHours(new ArrayList());
        }
        JSONObject jSONObject2 = null;
        for (int i = 0; i < optJSONArray.length(); i++) {
            try {
                jSONObject2 = (JSONObject) optJSONArray.get(i);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (jSONObject2 != null) {
                WeatherSearchForecastForHours weatherSearchForecastForHours = new WeatherSearchForecastForHours();
                weatherSearchForecastForHours.setClouds(jSONObject2.optInt("clouds"));
                weatherSearchForecastForHours.setDataTime(jSONObject2.optString("data_time"));
                weatherSearchForecastForHours.setHourlyPrecipitation(jSONObject2.optInt("prec_1h"));
                weatherSearchForecastForHours.setRelativeHumidity(jSONObject2.optInt("rh"));
                weatherSearchForecastForHours.setTemperature(jSONObject2.optInt("temp_fc"));
                weatherSearchForecastForHours.setPhenomenon(jSONObject2.optString("text"));
                weatherSearchForecastForHours.setWindDirection(jSONObject2.optString("wind_dir"));
                weatherSearchForecastForHours.setWindPower(jSONObject2.optString("wind_class"));
                weatherResult.getForecastHours().add(weatherSearchForecastForHours);
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ad A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean c(org.json.JSONObject r6, com.baidu.mapapi.search.weather.WeatherResult r7) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto Lb3
            if (r7 != 0) goto L7
            goto Lb3
        L7:
            java.lang.String r1 = "forecasts"
            org.json.JSONArray r6 = r6.optJSONArray(r1)
            if (r6 != 0) goto L10
            return r0
        L10:
            java.util.List r1 = r7.getForecasts()
            if (r1 != 0) goto L1e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r7.setForecasts(r1)
        L1e:
            r1 = 0
        L1f:
            int r2 = r6.length()
            if (r0 >= r2) goto Lb1
            java.lang.Object r2 = r6.get(r0)     // Catch: org.json.JSONException -> L33
            org.json.JSONObject r2 = (org.json.JSONObject) r2     // Catch: org.json.JSONException -> L33
            com.baidu.mapapi.search.weather.WeatherSearchForecasts r1 = new com.baidu.mapapi.search.weather.WeatherSearchForecasts     // Catch: org.json.JSONException -> L31
            r1.<init>()     // Catch: org.json.JSONException -> L31
            goto L3a
        L31:
            r1 = move-exception
            goto L37
        L33:
            r2 = move-exception
            r4 = r2
            r2 = r1
            r1 = r4
        L37:
            r1.printStackTrace()
        L3a:
            r1 = r2
            if (r1 != 0) goto L3e
            goto Lad
        L3e:
            com.baidu.mapapi.search.weather.WeatherSearchForecasts r2 = new com.baidu.mapapi.search.weather.WeatherSearchForecasts
            r2.<init>()
            java.lang.String r3 = "date"
            java.lang.String r3 = r1.optString(r3)
            r2.setDate(r3)
            java.lang.String r3 = "high"
            int r3 = r1.optInt(r3)
            r2.setHighestTemp(r3)
            java.lang.String r3 = "low"
            int r3 = r1.optInt(r3)
            r2.setLowestTemp(r3)
            java.lang.String r3 = "text_day"
            java.lang.String r3 = r1.optString(r3)
            r2.setPhenomenonDay(r3)
            java.lang.String r3 = "text_night"
            java.lang.String r3 = r1.optString(r3)
            r2.setPhenomenonNight(r3)
            java.lang.String r3 = "week"
            java.lang.String r3 = r1.optString(r3)
            r2.setWeek(r3)
            java.lang.String r3 = "wd_day"
            java.lang.String r3 = r1.optString(r3)
            r2.setWindDirectionDay(r3)
            java.lang.String r3 = "wc_day"
            java.lang.String r3 = r1.optString(r3)
            r2.setWindPowerDay(r3)
            java.lang.String r3 = "wd_night"
            java.lang.String r3 = r1.optString(r3)
            r2.setWindDirectionNight(r3)
            java.lang.String r3 = "wc_night"
            java.lang.String r3 = r1.optString(r3)
            r2.setWindPowerNight(r3)
            java.lang.String r3 = "aqi"
            int r3 = r1.optInt(r3)
            r2.setAirQualityIndex(r3)
            java.util.List r3 = r7.getForecasts()
            r3.add(r2)
        Lad:
            int r0 = r0 + 1
            goto L1f
        Lb1:
            r6 = 1
            return r6
        Lb3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.platform.core.weather.a.c(org.json.JSONObject, com.baidu.mapapi.search.weather.WeatherResult):boolean");
    }

    private boolean d(JSONObject jSONObject, WeatherResult weatherResult) {
        JSONArray optJSONArray;
        if (jSONObject == null || weatherResult == null || (optJSONArray = jSONObject.optJSONArray("indexes")) == null) {
            return false;
        }
        if (weatherResult.getLifeIndexes() == null) {
            weatherResult.setLifeIndexes(new ArrayList());
        }
        JSONObject jSONObject2 = null;
        for (int i = 0; i < optJSONArray.length(); i++) {
            try {
                jSONObject2 = (JSONObject) optJSONArray.get(i);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (jSONObject2 != null) {
                WeatherLifeIndexes weatherLifeIndexes = new WeatherLifeIndexes();
                weatherLifeIndexes.setBrief(jSONObject2.optString("brief"));
                weatherLifeIndexes.setDetail(jSONObject2.optString(BuryPointPageId.PAGE_ID_PLAN_DETAIL));
                weatherLifeIndexes.setName(jSONObject2.optString("name"));
                weatherResult.getLifeIndexes().add(weatherLifeIndexes);
            }
        }
        return true;
    }

    private boolean e(JSONObject jSONObject, WeatherResult weatherResult) {
        JSONObject optJSONObject;
        if (jSONObject == null || weatherResult == null || (optJSONObject = jSONObject.optJSONObject("location")) == null) {
            return false;
        }
        if (weatherResult.getLocation() != null) {
            a(weatherResult.getLocation(), optJSONObject);
            return true;
        }
        WeatherSearchLocation weatherSearchLocation = new WeatherSearchLocation();
        a(weatherSearchLocation, optJSONObject);
        weatherResult.setLocation(weatherSearchLocation);
        return true;
    }

    private boolean f(JSONObject jSONObject, WeatherResult weatherResult) {
        JSONObject optJSONObject;
        if (jSONObject == null || weatherResult == null || (optJSONObject = jSONObject.optJSONObject("now")) == null) {
            return false;
        }
        if (weatherResult.getRealTimeWeather() != null) {
            a(weatherResult.getRealTimeWeather(), optJSONObject);
            return true;
        }
        WeatherSearchRealTime weatherSearchRealTime = new WeatherSearchRealTime();
        a(weatherSearchRealTime, optJSONObject);
        weatherResult.setRealTimeWeather(weatherSearchRealTime);
        return true;
    }

    private boolean g(JSONObject jSONObject, WeatherResult weatherResult) {
        weatherResult.status = jSONObject.optInt("status");
        JSONObject optJSONObject = jSONObject.optJSONObject("result");
        if (optJSONObject == null) {
            return false;
        }
        e(optJSONObject, weatherResult);
        f(optJSONObject, weatherResult);
        a(optJSONObject, weatherResult);
        b(optJSONObject, weatherResult);
        c(optJSONObject, weatherResult);
        d(optJSONObject, weatherResult);
        return true;
    }

    @Override // com.baidu.platform.base.b
    public SearchResult a(String str) {
        JSONObject jSONObject;
        WeatherResult weatherResult = new WeatherResult();
        if (str == null) {
            weatherResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return weatherResult;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        }
        if (jSONObject == null || jSONObject.length() == 0) {
            weatherResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return weatherResult;
        }
        if (jSONObject.has("SDK_InnerError")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("SDK_InnerError");
            if (optJSONObject.has("PermissionCheckError")) {
                weatherResult.error = SearchResult.ERRORNO.PERMISSION_UNFINISHED;
                return weatherResult;
            }
            if (optJSONObject.has("httpStateError")) {
                String optString = optJSONObject.optString("httpStateError");
                optString.hashCode();
                if (optString.equals("NETWORK_ERROR")) {
                    weatherResult.error = SearchResult.ERRORNO.NETWORK_ERROR;
                } else if (optString.equals("REQUEST_ERROR")) {
                    weatherResult.error = SearchResult.ERRORNO.REQUEST_ERROR;
                } else {
                    weatherResult.error = SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
                }
                return weatherResult;
            }
        }
        if (!a(str, weatherResult, true)) {
            g(jSONObject, weatherResult);
        }
        return weatherResult;
    }

    private void a(WeatherSearchLocation weatherSearchLocation, JSONObject jSONObject) {
        weatherSearchLocation.setCountry(jSONObject.optString("country"));
        weatherSearchLocation.setProvince(jSONObject.optString("province"));
        weatherSearchLocation.setCity(jSONObject.optString("city"));
        weatherSearchLocation.setDistrictName(jSONObject.optString("name"));
        weatherSearchLocation.setDistrictID(jSONObject.optString("id"));
    }

    private void a(WeatherSearchRealTime weatherSearchRealTime, JSONObject jSONObject) {
        weatherSearchRealTime.setPhenomenon(jSONObject.optString("text"));
        weatherSearchRealTime.setTemperature(jSONObject.optInt(IWorkspace.DIR_TEMP));
        weatherSearchRealTime.setSensoryTemp(jSONObject.optInt("feels_like"));
        weatherSearchRealTime.setRelativeHumidity(jSONObject.optInt("rh"));
        weatherSearchRealTime.setWindPower(jSONObject.optString("wind_class"));
        weatherSearchRealTime.setWindDirection(jSONObject.optString("wind_dir"));
        weatherSearchRealTime.setUpdateTime(jSONObject.optString("uptime"));
        weatherSearchRealTime.setCO((float) jSONObject.optDouble(Constants.COLLATION_EXTENSION_KEY_SHORT));
        weatherSearchRealTime.setNO2(jSONObject.optInt("no2"));
        weatherSearchRealTime.setPM10(jSONObject.optInt("pm10"));
        weatherSearchRealTime.setPM2_5(jSONObject.optInt("pm25"));
        weatherSearchRealTime.setClouds(jSONObject.optInt("clouds"));
        weatherSearchRealTime.setAirQualityIndex(jSONObject.optInt("aqi"));
        weatherSearchRealTime.setSO2(jSONObject.optInt("so2"));
        weatherSearchRealTime.setVisibility(jSONObject.optInt("vis"));
        weatherSearchRealTime.setO3(jSONObject.optInt("o3"));
        weatherSearchRealTime.setHourlyPrecipitation(jSONObject.optInt("prec_1h"));
    }

    private boolean a(JSONObject jSONObject, WeatherResult weatherResult) {
        JSONArray optJSONArray;
        if (jSONObject == null || weatherResult == null || (optJSONArray = jSONObject.optJSONArray("alerts")) == null) {
            return false;
        }
        if (weatherResult.getWeatherAlerts() == null) {
            weatherResult.setWeatherAlerts(new ArrayList());
        }
        JSONObject jSONObject2 = null;
        for (int i = 0; i < optJSONArray.length(); i++) {
            try {
                jSONObject2 = (JSONObject) optJSONArray.get(i);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (jSONObject2 != null) {
                WeatherSearchAlerts weatherSearchAlerts = new WeatherSearchAlerts();
                weatherSearchAlerts.setDesc(jSONObject2.optString("desc"));
                weatherSearchAlerts.setLevel(jSONObject2.optString("level"));
                weatherSearchAlerts.setTitle(jSONObject2.optString("title"));
                weatherSearchAlerts.setType(jSONObject2.optString("type"));
                weatherResult.getWeatherAlerts().add(weatherSearchAlerts);
            }
        }
        return true;
    }

    @Override // com.baidu.platform.base.b
    public void a(SearchResult searchResult, Object obj) {
        if (obj == null || !(obj instanceof OnGetWeatherResultListener)) {
            return;
        }
        ((OnGetWeatherResultListener) obj).onGetWeatherResultListener((WeatherResult) searchResult);
    }
}
