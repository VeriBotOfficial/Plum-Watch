package com.xiaomi.push;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class at {

    /* renamed from: a, reason: collision with root package name */
    public int f14440a;

    /* renamed from: a, reason: collision with other field name */
    public String f212a;

    /* renamed from: a, reason: collision with other field name */
    public Map<String, String> f213a = new HashMap();

    public String toString() {
        return String.format("resCode = %1$d, headers = %2$s, response = %3$s", Integer.valueOf(this.f14440a), this.f213a.toString(), this.f212a);
    }

    public String a() {
        return this.f212a;
    }
}
