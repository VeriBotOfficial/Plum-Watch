package com.baidu.location.indoor;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private String f7781a;
    private int b;
    private int c;

    private enum a {
        UNKNOWN(0),
        NORMAL(1);

        private int c;

        a(int i) {
            this.c = i;
        }

        public int a() {
            return this.c;
        }
    }

    public l(JSONObject jSONObject) {
        this.f7781a = "";
        this.b = 0;
        this.c = 0;
        try {
            if (jSONObject.has("rect_type")) {
                if ((jSONObject.optInt("rect_type") & a.NORMAL.a()) == a.NORMAL.a()) {
                    this.c = 1;
                } else {
                    this.c = 0;
                }
            }
            if (jSONObject.has("is_support_poi_data")) {
                this.b = jSONObject.optInt("is_support_poi_data");
            }
            if (jSONObject.has("city_code")) {
                this.f7781a = jSONObject.optString("city_code");
            }
        } catch (Exception unused) {
        }
    }

    public String toString() {
        return "OutdoorParkingArea{cityCode='" + this.f7781a + "', isSupportPoiData=" + this.b + ", isOutdoorParkingRect=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }
}
