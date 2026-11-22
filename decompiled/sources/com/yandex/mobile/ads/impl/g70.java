package com.yandex.mobile.ads.impl;

/* loaded from: classes5.dex */
public final class g70 extends RuntimeException {
    public g70(int i) {
        super(a(i));
    }

    private static String a(int i) {
        if (i == 1) {
            return "Player release timed out.";
        }
        if (i == 2) {
            return "Setting foreground mode timed out.";
        }
        if (i != 3) {
            return "Undefined timeout.";
        }
        return "Detaching surface timed out.";
    }
}
