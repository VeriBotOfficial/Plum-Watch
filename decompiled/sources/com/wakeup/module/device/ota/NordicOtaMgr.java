package com.wakeup.module.device.ota;

import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.autonavi.aps.amapapi.config.Const;
import com.wakeup.common.base.BaseApplication;
import com.wakeup.common.base.BaseCallback;
import com.wakeup.common.log.LogUtils;
import java.io.File;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import no.nordicsemi.android.dfu.DfuLogListener;
import no.nordicsemi.android.dfu.DfuServiceInitiator;
import no.nordicsemi.android.dfu.DfuServiceListenerHelper;

/* compiled from: NordicOtaMgr.kt */
@Metadata(d1 = {"\u0000E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u001b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00052\u0018\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\u00110\u0010H\u0007J\b\u0010#\u001a\u00020\u001eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R$\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\b\u0010\u0003\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\u000f\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\u0011\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001c¨\u0006$"}, d2 = {"Lcom/wakeup/module/device/ota/NordicOtaMgr;", "", "<init>", "()V", "TAG", "", "installing", "", "getInstalling$annotations", "getInstalling", "()Z", "setInstalling", "(Z)V", "mHandler", "Landroid/os/Handler;", "mCallback", "Lcom/wakeup/common/base/BaseCallback;", "Lkotlin/Pair;", "", "getMCallback", "()Lcom/wakeup/common/base/BaseCallback;", "setMCallback", "(Lcom/wakeup/common/base/BaseCallback;)V", "progress", "logListener", "Lno/nordicsemi/android/dfu/DfuLogListener;", "listener", "com/wakeup/module/device/ota/NordicOtaMgr$listener$1", "Lcom/wakeup/module/device/ota/NordicOtaMgr$listener$1;", "start", "", Const.JSON_KEY_ADDRESS, "name", "filePath", "callback", "cancelNotification", "module-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NordicOtaMgr {
    private static final String TAG = "NordicOtaMgr";
    private static boolean installing;
    private static BaseCallback<Pair<Integer, String>> mCallback;
    private static int progress;
    public static final NordicOtaMgr INSTANCE = new NordicOtaMgr();
    private static final Handler mHandler = new Handler(Looper.getMainLooper());
    private static final DfuLogListener logListener = new DfuLogListener() { // from class: com.wakeup.module.device.ota.NordicOtaMgr$$ExternalSyntheticLambda2
        @Override // no.nordicsemi.android.dfu.DfuLogListener
        public final void onLogEvent(String str, int i, String str2) {
            NordicOtaMgr.logListener$lambda$0(str, i, str2);
        }
    };
    private static final NordicOtaMgr$listener$1 listener = new NordicOtaMgr$listener$1();

    @JvmStatic
    public static /* synthetic */ void getInstalling$annotations() {
    }

    private NordicOtaMgr() {
    }

    public static final boolean getInstalling() {
        return installing;
    }

    public static final void setInstalling(boolean z) {
        installing = z;
    }

    public final BaseCallback<Pair<Integer, String>> getMCallback() {
        return mCallback;
    }

    public final void setMCallback(BaseCallback<Pair<Integer, String>> baseCallback) {
        mCallback = baseCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logListener$lambda$0(String str, int i, String str2) {
        LogUtils.i(TAG, str + " " + str2);
    }

    @JvmStatic
    public static final void start(String address, String name, String filePath, BaseCallback<Pair<Integer, String>> callback) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(callback, "callback");
        LogUtils.i(TAG, "start");
        if (installing) {
            LogUtils.w(TAG, "start installing");
            return;
        }
        mCallback = callback;
        Context context = BaseApplication.getContext();
        if (context == null) {
            return;
        }
        DfuServiceListenerHelper.registerProgressListener(context, listener);
        DfuServiceListenerHelper.registerLogListener(context, logListener);
        DfuServiceInitiator unsafeExperimentalButtonlessServiceInSecureDfuEnabled = new DfuServiceInitiator(address).setDeviceName(name).setKeepBond(true).setForceDfu(false).setPacketsReceiptNotificationsEnabled(true).setPacketsReceiptNotificationsValue(12).setPrepareDataObjectDelay(400L).setCurrentMtu(512).setUnsafeExperimentalButtonlessServiceInSecureDfuEnabled(true);
        DfuServiceInitiator.createDfuNotificationChannel(context);
        unsafeExperimentalButtonlessServiceInSecureDfuEnabled.setZip(Uri.fromFile(new File(filePath)), filePath);
        unsafeExperimentalButtonlessServiceInSecureDfuEnabled.start(context, NordicDfuService.class);
        installing = true;
        mHandler.post(new Runnable() { // from class: com.wakeup.module.device.ota.NordicOtaMgr$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                NordicOtaMgr.start$lambda$1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$1() {
        BaseCallback<Pair<Integer, String>> baseCallback = mCallback;
        if (baseCallback != null) {
            baseCallback.callback(0, new Pair<>(0, ""));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelNotification() {
        mCallback = null;
        mHandler.postDelayed(new Runnable() { // from class: com.wakeup.module.device.ota.NordicOtaMgr$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                NordicOtaMgr.cancelNotification$lambda$2();
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cancelNotification$lambda$2() {
        Context context = BaseApplication.getContext();
        DfuServiceListenerHelper.unregisterProgressListener(context, listener);
        Object systemService = context != null ? context.getSystemService("notification") : null;
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).cancel(283);
    }
}
