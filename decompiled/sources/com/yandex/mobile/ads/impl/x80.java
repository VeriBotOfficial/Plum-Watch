package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x80 {
    public static boolean a(Context context, w80 toggle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(toggle, "toggle");
        int i = rs0.b;
        Intrinsics.checkNotNullParameter(context, "context");
        return rs0.a(context, "YadPreferenceFile").a(toggle.a(), false);
    }
}
