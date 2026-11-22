package com.yandex.mobile.ads.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ce2 {
    @JvmStatic
    public static final Long a(String str) {
        if (str != null) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss", Locale.US);
                return Long.valueOf(simpleDateFormat.parse(str).getTime() - simpleDateFormat.parse("00:00:00").getTime());
            } catch (ParseException unused) {
                sp0.c(new Object[0]);
            }
        }
        return null;
    }

    @JvmStatic
    public static final void a(Object obj) {
        Intrinsics.checkNotNullParameter("AdBreak", "fieldDescription");
        if (obj != null) {
            return;
        }
        a();
        throw null;
    }

    private static void a() {
        throw new IllegalArgumentException("AdBreak not set!");
    }

    @JvmStatic
    public static final Integer b(String str) {
        if (str != null) {
            try {
                return Integer.valueOf(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                sp0.c(new Object[0]);
            }
        }
        return null;
    }
}
