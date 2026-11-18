package com.amap.api.col.p0003sl;

import android.text.TextUtils;

/* JADX INFO: compiled from: EngineStyleKeyItem.java */
/* JADX INFO: loaded from: classes7.dex */
public class t3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f1884a;
    int[] b;
    int c;
    int d;
    String e;
    String f;

    public t3(int r1, int[] r2, String str, String str2, String str3) {
        this.f1884a = r1;
        this.b = r2;
        this.e = str;
        this.f = str2;
        str = TextUtils.isEmpty(str) ? str2 : str;
        this.c = -1000;
        if ("regions".equals(str)) {
            this.c = 1001;
        } else if ("water".equals(str)) {
            this.c = 1002;
        } else if ("buildings".equals(str)) {
            this.c = 1003;
        } else if ("roads".equals(str)) {
            this.c = 1004;
        } else if ("labels".equals(str)) {
            this.c = 1005;
        } else if ("borders".equals(str)) {
            this.c = 1006;
        }
        this.d = (r1 * 1000) + r2.hashCode();
    }
}
