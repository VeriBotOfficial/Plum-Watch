package com.yandex.div.core.view2;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccessibilityListDelegate.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class AccessibilityListDelegate$firstChild$1 extends FunctionReferenceImpl implements Function1<View, Integer> {
    public static final AccessibilityListDelegate$firstChild$1 INSTANCE = new AccessibilityListDelegate$firstChild$1();

    AccessibilityListDelegate$firstChild$1() {
        super(1, View.class, "getTop", "getTop()I", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Integer.valueOf(p0.getTop());
    }
}
