package com.wakeup.common.burypoint.monitor;

import com.blankj.utilcode.util.GsonUtils;
import com.google.gson.Gson;
import com.wakeup.common.burypoint.BiMgr;
import com.wakeup.common.burypoint.BuryPointManager;
import com.wakeup.common.burypoint.EnterBackgroundExtendInfo;
import com.wakeup.common.log.LogUtils;
import com.wakeup.common.storage.AppConfigManager;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppEventReport.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/wakeup/common/burypoint/monitor/AppEventReport;", "", "<init>", "()V", "Companion", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AppEventReport {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String TAG = "AppEventReport";

    @JvmStatic
    public static final void reportAppBackground(long j) {
        INSTANCE.reportAppBackground(j);
    }

    @JvmStatic
    public static final void reportAppForeground() {
        INSTANCE.reportAppForeground();
    }

    /* compiled from: AppEventReport.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/wakeup/common/burypoint/monitor/AppEventReport$Companion;", "", "<init>", "()V", "TAG", "", "reportAppForeground", "", "reportAppBackground", "duration", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final void reportAppForeground() {
            if (!AppConfigManager.getConfig().isAgreePrivacy()) {
                LogUtils.w(AppEventReport.TAG, "AppForeground return");
                return;
            }
            LogUtils.d(AppEventReport.TAG, "AppForeground: ");
            BuryPointManager buryPointManager = BuryPointManager.INSTANCE;
            long currentTimeMillis = System.currentTimeMillis();
            String json = GsonUtils.toJson(BuryPointManager.INSTANCE.getBaseExtendInfo());
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            BuryPointManager.postEvent$default(buryPointManager, "app_foreground", "app_foreground", "", "", currentTimeMillis, json, null, 64, null);
        }

        @JvmStatic
        public final void reportAppBackground(long duration) {
            if (!AppConfigManager.getConfig().isAgreePrivacy()) {
                LogUtils.w(AppEventReport.TAG, "AppBackground return");
                return;
            }
            LogUtils.d(AppEventReport.TAG, "AppBackground: " + duration);
            BiMgr.INSTANCE.postAction();
            EnterBackgroundExtendInfo enterBackgroundExtendInfo = new EnterBackgroundExtendInfo(duration / 1000, BuryPointManager.INSTANCE.getLaunchId(), BuryPointManager.INSTANCE.getSessionId());
            BuryPointManager buryPointManager = BuryPointManager.INSTANCE;
            long currentTimeMillis = System.currentTimeMillis();
            String json = new Gson().toJson(enterBackgroundExtendInfo);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            BuryPointManager.postEvent$default(buryPointManager, "app_background", "app_background", "", "", currentTimeMillis, json, null, 64, null);
            BuryPointManager.INSTANCE.updateSessionId();
        }
    }
}
