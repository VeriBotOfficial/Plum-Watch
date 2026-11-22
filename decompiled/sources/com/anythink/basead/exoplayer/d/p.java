package com.anythink.basead.exoplayer.d;

import android.util.Pair;
import java.util.Map;

/* loaded from: classes11.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2440a = "LicenseDurationRemaining";
    public static final String b = "PlaybackDurationRemaining";

    private p() {
    }

    public static Pair<Long, Long> a(f<?> fVar) {
        Map<String, String> h = fVar.h();
        if (h == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(a(h, "LicenseDurationRemaining")), Long.valueOf(a(h, "PlaybackDurationRemaining")));
    }

    private static long a(Map<String, String> map, String str) {
        if (map == null) {
            return -9223372036854775807L;
        }
        try {
            String str2 = map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }
}
