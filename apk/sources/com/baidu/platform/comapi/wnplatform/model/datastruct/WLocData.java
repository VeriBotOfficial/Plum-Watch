package com.baidu.platform.comapi.wnplatform.model.datastruct;

import com.autonavi.aps.amapapi.config.Const;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public class WLocData implements Cloneable {
    public static final int TypeGpsLocation = 61;
    public static final int TypeNetWorkLocation = 161;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f8929a;
    public float accuracy;
    public String addr;
    public double altitude;
    private String b;
    public String city;
    public String cityCode;
    public int coordType;
    public float direction;
    public String district;
    public int indoorState;
    public int isIbeacon;
    public boolean isIndoorMode;
    public String networkLocType;
    public String province;
    public int satellitesNum;
    public float speed;
    public int type;
    public double latitude = -1.0d;
    public double longitude = -1.0d;
    public String buildingId = "";
    public String floorId = "";

    public int getLocType() {
        return this.isIndoorMode ? 2 : 1;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lng", new BigDecimal(this.longitude).setScale(5, RoundingMode.UP));
            jSONObject.put("lat", new BigDecimal(this.latitude).setScale(5, RoundingMode.UP));
            jSONObject.put("speed", new BigDecimal(this.speed).setScale(2, RoundingMode.UP));
            jSONObject.put("dir", new BigDecimal(this.direction).setScale(2, RoundingMode.UP));
            jSONObject.put(Const.JSON_KEY_ACC, new BigDecimal(this.accuracy).setScale(2, RoundingMode.UP));
            jSONObject.put("alt", new BigDecimal(this.altitude).setScale(1, RoundingMode.UP));
            jSONObject.put("bui", this.buildingId);
            jSONObject.put(Const.JSON_KEY_FLOOR, this.floorId);
            jSONObject.put("locType", getLocType());
            jSONObject.put("timestamp", this.f8929a);
            jSONObject.put("tag", this.b);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public WLocData m7231clone() {
        WLocData wLocData = new WLocData();
        synchronized (this) {
            wLocData.accuracy = this.accuracy;
            wLocData.direction = this.direction;
            wLocData.latitude = this.latitude;
            wLocData.longitude = this.longitude;
            wLocData.satellitesNum = this.satellitesNum;
            wLocData.speed = this.speed;
            wLocData.altitude = this.altitude;
            wLocData.coordType = this.coordType;
            wLocData.buildingId = this.buildingId;
            String str = this.floorId;
            if (str == null || str.isEmpty()) {
                wLocData.floorId = this.floorId;
            } else {
                wLocData.floorId = this.floorId.toUpperCase();
            }
            wLocData.networkLocType = this.networkLocType;
            wLocData.isIbeacon = this.isIbeacon;
            wLocData.isIndoorMode = this.isIndoorMode;
            wLocData.indoorState = this.indoorState;
        }
        return wLocData;
    }
}
