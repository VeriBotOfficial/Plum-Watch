package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.LocationManager;

/* loaded from: classes6.dex */
public final class B2 {

    /* renamed from: a, reason: collision with root package name */
    public final LocationManager f17776a;

    public B2(Context context) {
        this((LocationManager) context.getSystemService("location"));
    }

    public B2(LocationManager locationManager) {
        this.f17776a = locationManager;
    }
}
