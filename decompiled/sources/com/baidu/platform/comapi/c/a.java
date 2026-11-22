package com.baidu.platform.comapi.c;

import com.baidu.platform.comapi.logstatistics.LogStatistics;
import org.json.JSONObject;

/* compiled from: UserdataCollect.java */
/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static JSONObject f8558a;
    public static a b;
    private LogStatistics c = null;

    public static a a() {
        if (b == null) {
            b = new a();
        }
        if (f8558a == null) {
            f8558a = new JSONObject();
        }
        return b;
    }

    private void b() {
        f8558a = null;
        f8558a = new JSONObject();
    }

    public synchronized boolean a(String str) {
        boolean z;
        if (this.c == null) {
            this.c = LogStatistics.getInstance();
        }
        if (this.c != null) {
            JSONObject jSONObject = f8558a;
            if (jSONObject != null && jSONObject.length() > 0) {
                z = this.c.a(1100, 1, str, f8558a.toString());
            } else {
                z = this.c.a(1100, 1, str, (String) null);
            }
            b();
        } else {
            z = false;
        }
        return z;
    }
}
