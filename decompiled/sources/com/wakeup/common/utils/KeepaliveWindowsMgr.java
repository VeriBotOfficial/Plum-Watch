package com.wakeup.common.utils;

import android.content.Context;
import android.provider.Settings;
import android.view.View;
import android.view.WindowManager;
import com.wakeup.common.base.BaseApplication;
import com.wakeup.common.log.LogUtils;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: KeepaliveWindowsMgr.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u0010\u001a\u00020\u0007H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/wakeup/common/utils/KeepaliveWindowsMgr;", "", "<init>", "()V", "TAG", "", "isShowWindow", "", "windowManager", "Landroid/view/WindowManager;", "getWindowManager", "()Landroid/view/WindowManager;", "windowManager$delegate", "Lkotlin/Lazy;", "showWindows", "", "checkWindowPermission", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class KeepaliveWindowsMgr {
    private static boolean isShowWindow;
    public static final KeepaliveWindowsMgr INSTANCE = new KeepaliveWindowsMgr();
    private static final String TAG = "KeepaliveWindowsMgr";

    /* renamed from: windowManager$delegate, reason: from kotlin metadata */
    private static final Lazy windowManager = LazyKt.lazy(new Function0() { // from class: com.wakeup.common.utils.KeepaliveWindowsMgr$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            WindowManager windowManager_delegate$lambda$0;
            windowManager_delegate$lambda$0 = KeepaliveWindowsMgr.windowManager_delegate$lambda$0();
            return windowManager_delegate$lambda$0;
        }
    });

    private KeepaliveWindowsMgr() {
    }

    private final WindowManager getWindowManager() {
        return (WindowManager) windowManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowManager windowManager_delegate$lambda$0() {
        Object systemService = BaseApplication.getContext().getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        return (WindowManager) systemService;
    }

    @JvmStatic
    public static final void showWindows() {
        if (isShowWindow) {
            return;
        }
        LogUtils.i(TAG, "showWindows");
        Context context = BaseApplication.getContext();
        try {
            INSTANCE.getWindowManager().addView(new View(context), new WindowManager.LayoutParams(1, 1, 2038, 8, -3));
            isShowWindow = true;
        } catch (Exception e) {
            LogUtils.e(TAG, "showWindows error: ", e);
        }
    }

    @JvmStatic
    public static final boolean checkWindowPermission() {
        boolean canDrawOverlays = Settings.canDrawOverlays(BaseApplication.getContext());
        if (!canDrawOverlays) {
            isShowWindow = false;
        }
        return canDrawOverlays;
    }
}
