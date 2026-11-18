package com.applovin.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes16.dex */
public abstract class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SimpleDateFormat f6258a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f6258a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    public static synchronized String a(long j) {
        return f6258a.format(new Date(j));
    }
}
