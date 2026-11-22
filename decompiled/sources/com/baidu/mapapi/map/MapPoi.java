package com.baidu.mapapi.map;

import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.platform.comapi.map.MapBundleKey;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class MapPoi {

    /* renamed from: a, reason: collision with root package name */
    String f7935a;
    LatLng b;
    String c;
    TrafficUGCType d = TrafficUGCType.NoTrafficUGC;

    public enum TrafficUGCType {
        NoTrafficUGC,
        TrafficConstruction,
        TrafficJam,
        TrafficBlocking,
        TrafficEmergency
    }

    void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return;
        }
        String optString = jSONObject.optString(MapBundleKey.MapObjKey.OBJ_TEXT);
        this.f7935a = optString;
        if (optString != null && !optString.equals("")) {
            this.f7935a = this.f7935a.replaceAll("\\\\", "").replaceAll("/?[a-zA-Z]{1,10};", "").replaceAll("<[^>]*>", "").replaceAll("[(/>)<]", "");
        }
        this.b = CoordUtil.decodeNodeLocation(jSONObject.optString(MapBundleKey.MapObjKey.OBJ_GEO));
        this.c = jSONObject.optString("ud");
        int i = jSONObject.getInt(MapBundleKey.MapObjKey.OBJ_STATISTIC_VALUE);
        if (i == 0) {
            this.d = TrafficUGCType.TrafficConstruction;
            return;
        }
        if (i == 2040) {
            this.d = TrafficUGCType.TrafficJam;
            return;
        }
        if (i == 2041) {
            this.d = TrafficUGCType.TrafficBlocking;
        } else if (i == 2042) {
            this.d = TrafficUGCType.TrafficEmergency;
        } else {
            this.d = TrafficUGCType.NoTrafficUGC;
        }
    }

    public String getName() {
        return this.f7935a;
    }

    public LatLng getPosition() {
        return this.b;
    }

    public TrafficUGCType getTrafficUGCType() {
        return this.d;
    }

    public String getUid() {
        return this.c;
    }
}
