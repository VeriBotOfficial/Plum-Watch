package com.yandex.div.core.view2;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccessibilityListDelegate.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class AccessibilityListDelegate$firstChild$2 extends FunctionReferenceImpl implements Function1<View, Integer> {
    public static final AccessibilityListDelegate$firstChild$2 INSTANCE = new AccessibilityListDelegate$firstChild$2();

    AccessibilityListDelegate$firstChild$2() {
        super(1, View.class, "getLeft", "getLeft()I", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Integer.valueOf(p0.getLeft());
    }
}
