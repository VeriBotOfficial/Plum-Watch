package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class tz0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f17003a;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17004a;

        static {
            int[] iArr = new int[sz0.values().length];
            try {
                sz0 sz0Var = sz0.b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f17004a = iArr;
        }
    }

    public tz0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f17003a = context;
    }

    public final String a(sz0 sz0Var) {
        int i = sz0Var == null ? -1 : a.f17004a[sz0Var.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return this.f17003a.getString(R.string.invalid_mediation_adapter_version);
        }
        throw new NoWhenBranchMatchedException();
    }
}
