package com.yandex.mobile.ads.impl;

import android.location.Location;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ws0 {

    /* renamed from: a, reason: collision with root package name */
    private static final long f17279a = TimeUnit.MINUTES.toMillis(2);

    public static boolean a(Location updatedLocation, Location location) {
        Intrinsics.checkNotNullParameter(updatedLocation, "updatedLocation");
        if (location != null) {
            long time = updatedLocation.getTime() - location.getTime();
            long j = f17279a;
            boolean z = time > j;
            boolean z2 = time < (-j);
            boolean z3 = time > 0;
            int accuracy = (int) (updatedLocation.getAccuracy() - location.getAccuracy());
            boolean z4 = accuracy > 0;
            boolean z5 = accuracy < 0;
            boolean z6 = ((long) accuracy) > 200;
            boolean areEqual = Intrinsics.areEqual(updatedLocation.getProvider(), location.getProvider());
            if (!z && (z2 || (!z5 && ((!z3 || z4) && (!z3 || z6 || !areEqual))))) {
                return false;
            }
        }
        return true;
    }
}
