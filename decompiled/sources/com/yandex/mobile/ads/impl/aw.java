package com.yandex.mobile.ads.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class aw {

    /* renamed from: a, reason: collision with root package name */
    private static final a f15044a = new a();

    static {
        String[] strArr = new String[15];
        DateFormat[] dateFormatArr = new DateFormat[15];
    }

    public static final String a(Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        String format = f15044a.get().format(date);
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static final class a extends ThreadLocal<DateFormat> {
        @Override // java.lang.ThreadLocal
        public final DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(g92.d);
            return simpleDateFormat;
        }

        a() {
        }
    }
}
