package io.appmetrica.analytics.impl;

import android.app.Activity;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final WeakHashMap f18471a = new WeakHashMap();

    public final boolean a(Activity activity, EnumC3483q enumC3483q) {
        if (activity != null && this.f18471a.get(activity) == enumC3483q) {
            return false;
        }
        if (activity == null) {
            return true;
        }
        this.f18471a.put(activity, enumC3483q);
        return true;
    }
}
