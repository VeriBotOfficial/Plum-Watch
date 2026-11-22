package com.baidu.platform.comapi.wnplatform.p;

import com.baidu.mapapi.map.MapLanguage;

/* compiled from: WnRemainInfoCache.java */
/* loaded from: classes13.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private static o f8960a;
    private int b;
    private int c;
    private String d;
    private String e;

    private o() {
    }

    public static synchronized o b() {
        o oVar;
        synchronized (o.class) {
            if (f8960a == null) {
                f8960a = new o();
            }
            oVar = f8960a;
        }
        return oVar;
    }

    public void a(int i, int i2, MapLanguage mapLanguage) {
        if (i == 0 && i2 == 0) {
            return;
        }
        if (mapLanguage == null) {
            mapLanguage = MapLanguage.CHINESE;
        }
        this.b = i;
        this.c = i2;
        StringBuffer stringBuffer = new StringBuffer();
        g.a(i2, mapLanguage, stringBuffer);
        this.e = stringBuffer.toString();
        this.d = g.a(i, mapLanguage);
    }

    public String c() {
        return this.e;
    }

    public String d() {
        return this.d;
    }

    public void a() {
        this.e = "";
        this.d = "";
    }
}
