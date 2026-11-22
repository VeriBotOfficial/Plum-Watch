package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class jl0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f15925a;

    public jl0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f15925a = context;
    }

    public final File a() {
        File file = new File(this.f15925a.getCacheDir(), "debug_panel");
        file.mkdir();
        return new File(file, "monetization_ads_debug_panel_report.txt");
    }
}
