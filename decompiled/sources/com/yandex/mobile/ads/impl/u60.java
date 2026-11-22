package com.yandex.mobile.ads.impl;

import java.util.HashSet;

/* loaded from: classes5.dex */
public final class u60 {

    /* renamed from: a, reason: collision with root package name */
    private static final HashSet<String> f17021a = new HashSet<>();
    private static String b = "goog.exo.core";

    public static synchronized String a() {
        String str;
        synchronized (u60.class) {
            str = b;
        }
        return str;
    }

    public static synchronized void a(String str) {
        synchronized (u60.class) {
            if (f17021a.add(str)) {
                b += ", " + str;
            }
        }
    }
}
