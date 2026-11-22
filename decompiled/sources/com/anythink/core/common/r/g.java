package com.anythink.core.common.r;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private boolean f4273a;
    private long b;
    private int c;
    private long d;
    private int e;
    private long f;
    private int g;
    private long h;
    private int[] i;
    private final List<h> j = Collections.synchronizedList(new ArrayList());
    private final Map<String, h> k = new ConcurrentHashMap();

    private static int b(int i) {
        switch (i) {
            case 1:
                return 10;
            case 2:
                return 12;
            case 3:
                return 6;
            case 4:
                return 11;
            case 5:
                return 15;
            case 6:
                return 16;
            default:
                return 17;
        }
    }

    public static g a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            g gVar = new g();
            gVar.b = jSONObject.optLong("pre_load_time", 30000L);
            gVar.c = jSONObject.optInt("pre_load_num", 1);
            gVar.d = jSONObject.optLong("pre_load_timeout", 30000L);
            gVar.e = jSONObject.optInt("pre_load_mode", 1);
            gVar.f = jSONObject.optLong("shared_delay_time_in_wf", 2000L);
            gVar.h = jSONObject.optLong("shared_retry_time_in_loadfailed", 15000L);
            gVar.g = jSONObject.optInt("shared_retry_count_in_loadfailed", 6);
            gVar.i = b(jSONObject);
            JSONArray optJSONArray = jSONObject.optJSONArray("formats");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    try {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            h hVar = new h();
                            hVar.f4274a = optJSONObject.optInt("format");
                            hVar.b = optJSONObject.optString(com.anythink.core.common.m.e.bk, "");
                            hVar.c = optJSONObject.optInt("req_pacing");
                            hVar.d = optJSONObject.optInt("ad_cache", 1);
                            hVar.e = optJSONObject.optDouble("ad_ecpm", -1.0d);
                            hVar.j = gVar;
                            gVar.j.add(hVar);
                            gVar.k.put(hVar.b, hVar);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
            return gVar;
        } catch (Throwable th) {
            new Object[]{th.getMessage()};
            return null;
        }
    }

    private static int[] b(JSONObject jSONObject) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("pre_load_mode_n");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                int[] iArr = new int[optJSONArray.length()];
                for (int i = 0; i < optJSONArray.length(); i++) {
                    try {
                        iArr[i] = b(optJSONArray.optInt(i));
                    } catch (Throwable unused) {
                        return iArr;
                    }
                }
                return iArr;
            }
            return new int[]{b(jSONObject.optInt("pre_load_mode", 1)), 6, 11};
        } catch (Throwable unused2) {
            return null;
        }
    }

    public final long a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final long c() {
        return this.d;
    }

    private int k() {
        return this.e;
    }

    public final Map<String, h> d() {
        return this.k;
    }

    public final List<h> e() {
        return this.j;
    }

    public final long f() {
        return this.f;
    }

    public final int g() {
        if (this.g <= 0) {
            this.g = 6;
        }
        return this.g;
    }

    public final long h() {
        return this.h;
    }

    public final boolean a(int i) {
        int[] iArr = this.i;
        if (iArr != null) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean i() {
        return this.f4273a;
    }

    public final void j() {
        this.f4273a = true;
    }

    public final String toString() {
        return "SharedPlaceConfig{isPreLocalConfig=" + this.f4273a + ", delayPreloadTime=" + this.b + ", parallelReqNum=" + this.c + ", preLoadTimeout=" + this.d + ", preloadMode=" + this.e + ", loadDelayTimeInWF=" + this.f + ", retryLoadCountInFailed=" + this.g + ", retryLoadDelayTimeInfFailed=" + this.h + ", loadModes=" + Arrays.toString(this.i) + ", sharedPlaceInfoList=" + this.j + ", placementIdToSharedPlaceInfoMap=" + this.k + AbstractJsonLexerKt.END_OBJ;
    }
}
