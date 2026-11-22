package com.applovin.impl;

import java.util.Map;

/* loaded from: classes12.dex */
public class l4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f6322a;
    private Map b;

    private l4(String str, Map map) {
        this.f6322a = str;
        this.b = map;
    }

    public static l4 a(String str) {
        return a(str, null);
    }

    public String b() {
        return this.f6322a;
    }

    public String toString() {
        return "PendingReward{result='" + this.f6322a + "'params='" + this.b + "'}";
    }

    public static l4 a(String str, Map map) {
        return new l4(str, map);
    }

    public Map a() {
        return this.b;
    }
}
