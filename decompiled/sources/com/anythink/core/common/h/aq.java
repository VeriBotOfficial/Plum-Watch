package com.anythink.core.common.h;

import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class aq {
    public static final String h = "business_type";
    public static final int i = 1000;
    public static final int j = 1001;

    /* renamed from: a, reason: collision with root package name */
    public String f3852a;
    public int b;
    public String c;
    public String d;
    public String e;
    public long f;
    public String g;

    public static String a(int i2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(h, i2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject.toString();
    }

    public final String a() {
        return this.d + "--extra: " + this.g + "--requestType: " + this.b + "--content:" + this.e;
    }
}
