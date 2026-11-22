package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* loaded from: classes6.dex */
public final class T9 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f18080a;
    public final C3680xm b;
    public final C3487q3 c;
    public final SafePackageManager d;

    public T9(Context context, C3680xm c3680xm, C3487q3 c3487q3, SafePackageManager safePackageManager) {
        this.f18080a = context;
        this.b = c3680xm;
        this.c = c3487q3;
        this.d = safePackageManager;
    }

    public T9(Context context) {
        this(context, new C3680xm(context, "io.appmetrica.analytics.build_id"), new C3487q3(context, "io.appmetrica.analytics.is_offline"), new SafePackageManager());
    }
}
