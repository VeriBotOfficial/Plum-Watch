package com.wakeup.commponent.module.h5;

import android.content.Context;
import com.wakeup.commponent.Navigator;
import com.wakeup.commponent.constant.PagePath;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HealthDashboardHelper.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/wakeup/commponent/module/h5/HealthDashboardHelper;", "", "<init>", "()V", "open", "", "context", "Landroid/content/Context;", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HealthDashboardHelper {
    public static final HealthDashboardHelper INSTANCE = new HealthDashboardHelper();

    private HealthDashboardHelper() {
    }

    @JvmStatic
    public static final void open(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Navigator.start(context, PagePath.PAGE_HEALTH_DASHBOARD);
    }
}
