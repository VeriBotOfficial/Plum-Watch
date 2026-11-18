package com.anythink.basead.exoplayer.k;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes7.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f2696a = 0;
    public static final int b = 1;
    public static final int c = 2;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    private static boolean b(int r3, int r4) {
        if (r3 == 0) {
            return true;
        }
        if (r3 != 1) {
            return r3 == 2 && (r4 & 2) != 0;
        }
        return (r4 & 1) != 0;
    }

    private w() {
    }

    private static int a(int r4, int r5) {
        for (int r1 = 1; r1 <= 2; r1++) {
            int r3 = (r4 + r1) % 3;
            if (r3 != 0) {
                if (r3 != 1) {
                    if (r3 != 2 || (r5 & 2) == 0) {
                    }
                } else if ((r5 & 1) == 0) {
                }
            }
            return r3;
        }
        return r4;
    }
}
