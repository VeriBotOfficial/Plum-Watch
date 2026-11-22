package com.anythink.basead.exoplayer.k;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes11.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final int f2696a = 0;
    public static final int b = 1;
    public static final int c = 2;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    private static boolean b(int i, int i2) {
        if (i != 0) {
            return i != 1 ? i == 2 && (i2 & 2) != 0 : (i2 & 1) != 0;
        }
        return true;
    }

    private w() {
    }

    private static int a(int i, int i2) {
        for (int i3 = 1; i3 <= 2; i3++) {
            int i4 = (i + i3) % 3;
            if (i4 == 0) {
                return i4;
            }
            if (i4 == 1) {
                if ((i2 & 1) != 0) {
                    return i4;
                }
            } else if (i4 == 2 && (i2 & 2) != 0) {
                return i4;
            }
        }
        return i;
    }
}
