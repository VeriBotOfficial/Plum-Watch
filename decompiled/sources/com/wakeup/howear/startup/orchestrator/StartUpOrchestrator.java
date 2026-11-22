package com.wakeup.howear.startup.orchestrator;

import android.content.Context;
import com.wakeup.common.log.LogUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StartUpOrchestrator.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/wakeup/howear/startup/orchestrator/StartUpOrchestrator;", "", "<init>", "()V", "TAG", "", "startApplicationPhaseTasks", "", "context", "Landroid/content/Context;", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StartUpOrchestrator {
    public static final StartUpOrchestrator INSTANCE = new StartUpOrchestrator();
    public static final String TAG = "StartUpOrchestrator";

    private StartUpOrchestrator() {
    }

    @JvmStatic
    public static final void startApplicationPhaseTasks(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        LogUtils.i(TAG, "app_startup_opt arouter after");
    }
}
