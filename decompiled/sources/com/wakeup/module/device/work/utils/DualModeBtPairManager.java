package com.wakeup.module.device.work.utils;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.tencent.open.SocialConstants;
import com.wakeup.common.base.BaseApplication;
import com.wakeup.common.log.LogUtils;
import com.yandex.div.core.timer.TimerController;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DualModeBtPairManager.kt */
@Metadata(d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b*\u0001'\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0005J\u0006\u0010,\u001a\u00020*J\u0006\u0010-\u001a\u00020*J\u0006\u0010.\u001a\u00020*J\u0006\u0010/\u001a\u00020\u001cJ\b\u00100\u001a\u00020*H\u0002J\u0018\u00101\u001a\u00020*2\u0006\u00102\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u0007H\u0002J\u0010\u00104\u001a\u00020*2\u0006\u00105\u001a\u000206H\u0002J\u0010\u00107\u001a\u00020\u001c2\u0006\u00105\u001a\u000206H\u0002J\b\u00108\u001a\u00020*H\u0002J\b\u00109\u001a\u00020*H\u0002J\b\u0010:\u001a\u00020*H\u0002J\u0010\u0010;\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u0005H\u0002J\b\u0010<\u001a\u00020*H\u0002J\u0010\u0010=\u001a\u00020\u001c2\u0006\u00102\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0004\n\u0002\u0010(¨\u0006>"}, d2 = {"Lcom/wakeup/module/device/work/utils/DualModeBtPairManager;", "", "<init>", "()V", "TAG", "", "TRANSPORT_BREDR", "", "DISCOVERY_TIMEOUT_MS", "", "MAX_RETRY", "MAX_SESSION_MS", "MAX_SUSPEND_MS", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context$delegate", "Lkotlin/Lazy;", "adapter", "Landroid/bluetooth/BluetoothAdapter;", "getAdapter", "()Landroid/bluetooth/BluetoothAdapter;", "adapter$delegate", "handler", "Landroid/os/Handler;", "targetMac", "targetFound", "", "bondRequested", "retryCount", "sessionActive", "suspended", "sessionDeadline", "receiverRegistered", "timeoutRunnable", "Ljava/lang/Runnable;", "suspendGuard", SocialConstants.PARAM_RECEIVER, "com/wakeup/module/device/work/utils/DualModeBtPairManager$receiver$1", "Lcom/wakeup/module/device/work/utils/DualModeBtPairManager$receiver$1;", "start", "", "watchBtMac", TimerController.STOP_COMMAND, "suspendForTransfer", "resumeAfterTransfer", "isSuspended", "onDiscoveryTimeout", "startClassicDiscovery", "mac", "nextRetry", "requestClassicBond", "device", "Landroid/bluetooth/BluetoothDevice;", "createBondBredr", "ensureReceiver", "unregisterReceiverIfNeeded", "cancelDiscovery", "currentBondState", "resetSession", "isBrReallyReady", "module-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DualModeBtPairManager {
    private static final long DISCOVERY_TIMEOUT_MS = 12000;
    private static final int MAX_RETRY = 5;
    private static final long MAX_SESSION_MS = 60000;
    private static final long MAX_SUSPEND_MS = 180000;
    private static final String TAG = "DualModeBtPair";
    private static final int TRANSPORT_BREDR = 1;
    private static boolean bondRequested;
    private static boolean receiverRegistered;
    private static int retryCount;
    private static boolean sessionActive;
    private static long sessionDeadline;
    private static boolean suspended;
    private static boolean targetFound;
    private static String targetMac;
    public static final DualModeBtPairManager INSTANCE = new DualModeBtPairManager();

    /* renamed from: context$delegate, reason: from kotlin metadata */
    private static final Lazy context = LazyKt.lazy(new Function0() { // from class: com.wakeup.module.device.work.utils.DualModeBtPairManager$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Context context2;
            context2 = BaseApplication.getContext();
            return context2;
        }
    });

    /* renamed from: adapter$delegate, reason: from kotlin metadata */
    private static final Lazy adapter = LazyKt.lazy(new Function0() { // from class: com.wakeup.module.device.work.utils.DualModeBtPairManager$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            BluetoothAdapter defaultAdapter;
            defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            return defaultAdapter;
        }
    });
    private static final Handler handler = new Handler(Looper.getMainLooper());
    private static final Runnable timeoutRunnable = new Runnable() { // from class: com.wakeup.module.device.work.utils.DualModeBtPairManager$$ExternalSyntheticLambda2
        @Override // java.lang.Runnable
        public final void run() {
            DualModeBtPairManager.timeoutRunnable$lambda$2();
        }
    };
    private static final Runnable suspendGuard = new Runnable() { // from class: com.wakeup.module.device.work.utils.DualModeBtPairManager$$ExternalSyntheticLambda3
        @Override // java.lang.Runnable
        public final void run() {
            DualModeBtPairManager.suspendGuard$lambda$3();
        }
    };
    private static final DualModeBtPairManager$receiver$1 receiver = new BroadcastReceiver() { // from class: com.wakeup.module.device.work.utils.DualModeBtPairManager$receiver$1
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00a9, code lost:
        
            r7 = com.wakeup.module.device.work.utils.DualModeBtPairManager.targetMac;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0118, code lost:
        
            r7 = com.wakeup.module.device.work.utils.DualModeBtPairManager.targetMac;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
        
            r0 = com.wakeup.module.device.work.utils.DualModeBtPairManager.targetMac;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onReceive(android.content.Context r6, android.content.Intent r7) {
            /*
                Method dump skipped, instructions count: 356
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.wakeup.module.device.work.utils.DualModeBtPairManager$receiver$1.onReceive(android.content.Context, android.content.Intent):void");
        }
    };

    private DualModeBtPairManager() {
    }

    private final Context getContext() {
        Object value = context.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Context) value;
    }

    private final BluetoothAdapter getAdapter() {
        return (BluetoothAdapter) adapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void timeoutRunnable$lambda$2() {
        INSTANCE.onDiscoveryTimeout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void suspendGuard$lambda$3() {
        LogUtils.w(TAG, "suspend guard fired, force resume");
        INSTANCE.resumeAfterTransfer();
    }

    public final void start(String watchBtMac) {
        Intrinsics.checkNotNullParameter(watchBtMac, "watchBtMac");
        if (watchBtMac.length() == 0) {
            return;
        }
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String upperCase = watchBtMac.toUpperCase(US);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (suspended) {
            LogUtils.i(TAG, "start deferred, transfer in progress mac=" + upperCase);
            targetMac = upperCase;
            sessionActive = true;
            if (sessionDeadline == 0) {
                sessionDeadline = SystemClock.elapsedRealtime() + 60000;
                return;
            }
            return;
        }
        if (sessionActive && Intrinsics.areEqual(upperCase, targetMac)) {
            LogUtils.i(TAG, "session already running mac=" + upperCase + " retry=" + retryCount);
        } else {
            ensureReceiver();
            sessionActive = true;
            sessionDeadline = SystemClock.elapsedRealtime() + 60000;
            startClassicDiscovery(upperCase, 0);
        }
    }

    public final void stop() {
        Handler handler2 = handler;
        handler2.removeCallbacks(timeoutRunnable);
        handler2.removeCallbacks(suspendGuard);
        suspended = false;
        resetSession();
        cancelDiscovery();
        unregisterReceiverIfNeeded();
    }

    public final void suspendForTransfer() {
        Handler handler2 = handler;
        Runnable runnable = suspendGuard;
        handler2.removeCallbacks(runnable);
        handler2.removeCallbacks(timeoutRunnable);
        cancelDiscovery();
        if (!suspended) {
            LogUtils.i(TAG, "suspend for transfer, sessionActive=" + sessionActive + " retry=" + retryCount);
        }
        suspended = true;
        handler2.postDelayed(runnable, 180000L);
    }

    public final void resumeAfterTransfer() {
        handler.removeCallbacks(suspendGuard);
        if (suspended) {
            suspended = false;
            String str = targetMac;
            LogUtils.i(TAG, "resume after transfer, sessionActive=" + sessionActive + " retry=" + retryCount + " mac=" + str);
            if (!sessionActive || str == null) {
                cancelDiscovery();
                return;
            }
            if (isBrReallyReady(str)) {
                LogUtils.i(TAG, "BR ready, stop retry");
                stop();
            } else {
                if (retryCount >= 5 || SystemClock.elapsedRealtime() > sessionDeadline) {
                    LogUtils.w(TAG, "classic pair give up after transfer, retry=" + retryCount);
                    stop();
                    return;
                }
                startClassicDiscovery(str, retryCount);
            }
        }
    }

    public final boolean isSuspended() {
        return suspended;
    }

    private final void onDiscoveryTimeout() {
        String str = targetMac;
        if (str == null) {
            return;
        }
        if (isBrReallyReady(str)) {
            LogUtils.i(TAG, "BR ready, stop retry");
            stop();
            return;
        }
        if (suspended) {
            LogUtils.i(TAG, "discovery timeout while suspended, skip retry");
            return;
        }
        if (SystemClock.elapsedRealtime() > sessionDeadline) {
            LogUtils.w(TAG, "classic pair give up: session timeout retry=" + retryCount);
            stop();
        } else if (currentBondState(str) == 11) {
            LogUtils.i(TAG, "bonding in progress, keep waiting retry=" + retryCount);
            handler.postDelayed(timeoutRunnable, DISCOVERY_TIMEOUT_MS);
        } else if (retryCount >= 5) {
            LogUtils.w(TAG, "classic pair give up: retry limit 5 reached");
            stop();
        } else {
            LogUtils.i(TAG, "classic pair timeout, retry discovery");
            startClassicDiscovery(str, retryCount + 1);
        }
    }

    private final void startClassicDiscovery(String mac, int nextRetry) {
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String upperCase = mac.toUpperCase(US);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        targetMac = upperCase;
        if (suspended) {
            LogUtils.i(TAG, "start classic discovery skipped, suspended mac=" + upperCase);
            return;
        }
        targetFound = false;
        bondRequested = false;
        retryCount = nextRetry;
        Handler handler2 = handler;
        Runnable runnable = timeoutRunnable;
        handler2.removeCallbacks(runnable);
        cancelDiscovery();
        BluetoothAdapter adapter2 = getAdapter();
        boolean startDiscovery = adapter2 != null ? adapter2.startDiscovery() : false;
        LogUtils.i(TAG, "start classic discovery retry=" + retryCount + " ok=" + startDiscovery + " mac=" + targetMac);
        if (startDiscovery) {
            handler2.postDelayed(runnable, DISCOVERY_TIMEOUT_MS);
            return;
        }
        int i = retryCount;
        if (i < 5) {
            handler2.postDelayed(runnable, DISCOVERY_TIMEOUT_MS);
        } else {
            LogUtils.w(TAG, "start classic discovery failed, give up retry=" + i);
            stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestClassicBond(BluetoothDevice device) {
        if (bondRequested) {
            return;
        }
        boolean z = true;
        bondRequested = true;
        if (!createBondBredr(device) && !device.createBond()) {
            z = false;
        }
        LogUtils.i(TAG, "request classic bond ok=" + z + " type=" + device.getType() + " addr=" + device.getAddress());
    }

    private final boolean createBondBredr(BluetoothDevice device) {
        try {
            Object invoke = BluetoothDevice.class.getMethod("createBond", Integer.TYPE).invoke(device, 1);
            Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.Boolean");
            return ((Boolean) invoke).booleanValue();
        } catch (Throwable th) {
            LogUtils.w(TAG, "createBond(TRANSPORT_BREDR) unavailable: " + th.getMessage());
            return false;
        }
    }

    private final void ensureReceiver() {
        if (receiverRegistered) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.device.action.FOUND");
        intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
        intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        try {
            getContext().registerReceiver(receiver, intentFilter);
            receiverRegistered = true;
        } catch (Throwable th) {
            LogUtils.e(TAG, "registerReceiver failed: " + th.getMessage());
        }
    }

    private final void unregisterReceiverIfNeeded() {
        if (receiverRegistered) {
            receiverRegistered = false;
            handler.post(new Runnable() { // from class: com.wakeup.module.device.work.utils.DualModeBtPairManager$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    DualModeBtPairManager.unregisterReceiverIfNeeded$lambda$5();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void unregisterReceiverIfNeeded$lambda$5() {
        try {
            INSTANCE.getContext().unregisterReceiver(receiver);
        } catch (Throwable th) {
            LogUtils.w(TAG, "unregisterReceiver failed: " + th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelDiscovery() {
        BluetoothAdapter adapter2;
        try {
            BluetoothAdapter adapter3 = getAdapter();
            if (adapter3 == null || !adapter3.isDiscovering() || (adapter2 = getAdapter()) == null) {
                return;
            }
            adapter2.cancelDiscovery();
        } catch (Throwable th) {
            LogUtils.w(TAG, "cancelDiscovery failed: " + th.getMessage());
        }
    }

    private final int currentBondState(String mac) {
        BluetoothDevice remoteDevice;
        try {
            BluetoothAdapter adapter2 = getAdapter();
            if (adapter2 != null && (remoteDevice = adapter2.getRemoteDevice(mac)) != null) {
                return remoteDevice.getBondState();
            }
        } catch (Throwable unused) {
        }
        return Integer.MIN_VALUE;
    }

    private final void resetSession() {
        sessionActive = false;
        sessionDeadline = 0L;
        targetMac = null;
        targetFound = false;
        bondRequested = false;
        retryCount = 0;
    }

    private final boolean isBrReallyReady(String mac) {
        BluetoothDevice bluetoothDevice = null;
        try {
            BluetoothAdapter adapter2 = getAdapter();
            if (adapter2 != null) {
                bluetoothDevice = adapter2.getRemoteDevice(mac);
            }
        } catch (Throwable unused) {
        }
        return bluetoothDevice != null && bluetoothDevice.getBondState() == 12;
    }
}
