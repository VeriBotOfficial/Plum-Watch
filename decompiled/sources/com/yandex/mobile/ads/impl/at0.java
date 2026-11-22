package com.yandex.mobile.ads.impl;

import android.location.Location;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class at0 {

    /* renamed from: a, reason: collision with root package name */
    private final ws0 f15040a = new ws0();

    public final Location a(List<? extends Location> locations) {
        Intrinsics.checkNotNullParameter(locations, "locations");
        Location location = null;
        for (Location location2 : locations) {
            this.f15040a.getClass();
            if (ws0.a(location2, location)) {
                location = location2;
            }
        }
        return location;
    }
}
