package com.qumeng.overseas.advlib.__remote__.utils.network;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes17.dex */
public class b {
    public static final String h = "GET";
    public static final String i = "POST";

    /* renamed from: a, reason: collision with root package name */
    public String f13238a;
    public String b;
    public String c;
    public Map<String, String> d;
    public boolean e;
    public Map<String, Object> f;
    public a g;

    public b() {
        this.f13238a = "";
        this.b = "";
        this.c = "GET";
        this.d = new HashMap();
        this.f = new HashMap();
        this.g = c.c;
    }

    public <T> void a(String str, T t) {
        this.f.put(str, t);
    }

    public <T> T a(String str) {
        T t = (T) this.f.get(str);
        if (t != null) {
            return t;
        }
        return null;
    }

    public b(String str) {
        this.f13238a = "";
        this.b = "";
        this.c = "GET";
        this.d = new HashMap();
        this.f = new HashMap();
        this.g = c.c;
        this.f13238a = str;
    }
}
