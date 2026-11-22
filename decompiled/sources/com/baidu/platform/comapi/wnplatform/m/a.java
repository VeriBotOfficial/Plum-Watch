package com.baidu.platform.comapi.wnplatform.m;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WNaviStatistics.java */
/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static JSONObject f8925a;
    private static a b;

    private a() {
    }

    public static a a() {
        if (b == null) {
            b = new a();
        }
        if (f8925a == null) {
            f8925a = new JSONObject();
        }
        return b;
    }

    public boolean a(String str) {
        return false;
    }

    public void a(String str, String str2) {
        try {
            f8925a.put(str, str2);
        } catch (JSONException unused) {
        }
    }

    public void a(String str, int i) {
        try {
            f8925a.put(str, Integer.toString(i));
        } catch (JSONException unused) {
        }
    }
}
