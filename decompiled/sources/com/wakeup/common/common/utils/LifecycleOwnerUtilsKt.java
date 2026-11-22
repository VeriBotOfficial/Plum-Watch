package com.wakeup.common.common.utils;

import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LifecycleOwnerUtils.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¨\u0006\u0005"}, d2 = {"safeLaunch", "", "Landroidx/lifecycle/LifecycleOwner;", "block", "Lkotlin/Function0;", "common_overseasRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LifecycleOwnerUtilsKt {
    public static final void safeLaunch(LifecycleOwner lifecycleOwner, Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
    }
}
