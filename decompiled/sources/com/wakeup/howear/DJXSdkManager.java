package com.wakeup.howear;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DJXSdkManager.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/wakeup/howear/DJXSdkManager;", "", "<init>", "()V", "initDJXSdk", "", "app", "Landroid/app/Application;", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DJXSdkManager {
    public static final DJXSdkManager INSTANCE = new DJXSdkManager();

    public final void initDJXSdk(Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
    }

    private DJXSdkManager() {
    }
}
