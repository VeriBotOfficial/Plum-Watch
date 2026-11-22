package com.baidu.ar;

import android.content.SharedPreferences;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public class w2 {
    public static int d = 1;
    public static int e = 2;
    public static int f = 3;

    /* renamed from: a, reason: collision with root package name */
    public Map<String, String> f7300a = new HashMap();
    public Map<String, String> b = new HashMap();
    public SharedPreferences c;

    /* JADX WARN: Removed duplicated region for block: B:6:0x002d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(int r3, java.lang.String r4) {
        /*
            r2 = this;
            int r0 = com.baidu.ar.w2.d
            java.lang.String r1 = ""
            if (r3 != r0) goto Lf
            java.util.Map<java.lang.String, java.lang.String> r3 = r2.f7300a
        L8:
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            goto L2b
        Lf:
            int r0 = com.baidu.ar.w2.e
            if (r3 != r0) goto L16
            java.util.Map<java.lang.String, java.lang.String> r3 = r2.b
            goto L8
        L16:
            int r0 = com.baidu.ar.w2.f
            if (r3 != r0) goto L2a
            android.content.SharedPreferences r3 = r2.c
            if (r3 == 0) goto L23
            java.lang.String r3 = r3.getString(r4, r1)
            goto L2b
        L23:
            java.lang.String r3 = "TAG"
            java.lang.String r4 = "prefs data store is null"
            android.util.Log.e(r3, r4)
        L2a:
            r3 = 0
        L2b:
            if (r3 != 0) goto L2e
            return r1
        L2e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.ar.w2.a(int, java.lang.String):java.lang.String");
    }

    public void a() {
        this.f7300a.clear();
    }

    public void a(int i, String str, String str2) {
        if (i == d) {
            this.f7300a.put(str, str2);
            return;
        }
        if (i == e) {
            this.b.put(str, str2);
            return;
        }
        if (i == f) {
            SharedPreferences sharedPreferences = this.c;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString(str, str2).commit();
            } else {
                Log.e("TAG", "prefs data store is null");
            }
        }
    }

    public void a(SharedPreferences sharedPreferences) {
        this.c = sharedPreferences;
    }
}
