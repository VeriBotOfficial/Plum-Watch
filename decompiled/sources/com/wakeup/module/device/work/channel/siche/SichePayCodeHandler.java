package com.wakeup.module.device.work.channel.siche;

import android.os.Handler;
import android.os.Looper;
import com.wakeup.common.log.LogUtils;
import com.wakeup.commponent.module.device.BleDevice;
import com.wakeup.module.device.stack.BleStackFactory;
import com.wakeup.module.device.stack.IBleStack;
import com.wakeup.module.device.work.utils.BleUUID;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: SichePayCodeHandler.kt */
@Metadata(d1 = {"\u0000U\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b*\u0001\u001c\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u0005J\b\u0010!\u001a\u00020\u001fH\u0002J\u0006\u0010\"\u001a\u00020\u001fJ\u0012\u0010#\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005J\u000e\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u0010J\b\u0010&\u001a\u00020\u001fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001d¨\u0006'"}, d2 = {"Lcom/wakeup/module/device/work/channel/siche/SichePayCodeHandler;", "", "<init>", "()V", "TAG", "", "mSichePayCodeNotify", "Lcom/wakeup/module/device/work/channel/siche/SichePayCodeNotify;", "mBleManager", "Lcom/wakeup/module/device/stack/IBleStack;", "getMBleManager", "()Lcom/wakeup/module/device/stack/IBleStack;", "mBleManager$delegate", "Lkotlin/Lazy;", "queue", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "", "isWriting", "", "mHandler", "Landroid/os/Handler;", "tryCount", "", "notifyMac", "unsupportedNotifyMacs", "", "notifyUnsupported", "writeCallback", "com/wakeup/module/device/work/channel/siche/SichePayCodeHandler$writeCallback$1", "Lcom/wakeup/module/device/work/channel/siche/SichePayCodeHandler$writeCallback$1;", "startNotifyPayCode", "", "mac", "notifyPayCode", "retryNotify", "markNotifyUnsupported", "sendAliPayCodeData", "data", "execSend", "module-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SichePayCodeHandler {
    private boolean isWriting;
    private boolean notifyUnsupported;
    private int tryCount;
    private final String TAG = "SichePayCode";
    private final SichePayCodeNotify mSichePayCodeNotify = new SichePayCodeNotify(this);

    /* renamed from: mBleManager$delegate, reason: from kotlin metadata */
    private final Lazy mBleManager = LazyKt.lazy(new Function0() { // from class: com.wakeup.module.device.work.channel.siche.SichePayCodeHandler$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            IBleStack iBleStack;
            iBleStack = BleStackFactory.get();
            return iBleStack;
        }
    });
    private final ConcurrentLinkedQueue<byte[]> queue = new ConcurrentLinkedQueue<>();
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private String notifyMac = "";
    private final Set<String> unsupportedNotifyMacs = new LinkedHashSet();
    private final SichePayCodeHandler$writeCallback$1 writeCallback = new SichePayCodeHandler$writeCallback$1(this);

    private final IBleStack getMBleManager() {
        return (IBleStack) this.mBleManager.getValue();
    }

    public static /* synthetic */ void startNotifyPayCode$default(SichePayCodeHandler sichePayCodeHandler, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        sichePayCodeHandler.startNotifyPayCode(str);
    }

    public final void startNotifyPayCode(String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        LogUtils.i(this.TAG, "notifyPayCode start mac=" + mac);
        this.notifyMac = mac;
        boolean z = false;
        this.tryCount = 0;
        if (mac.length() > 0) {
            Set<String> set = this.unsupportedNotifyMacs;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (StringsKt.equals((String) it.next(), this.notifyMac, true)) {
                        z = true;
                        break;
                    }
                }
            }
        }
        this.notifyUnsupported = z;
        if (z) {
            LogUtils.i(this.TAG, "notifyPayCode skipped for unsupported mac=" + this.notifyMac);
            return;
        }
        notifyPayCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyPayCode() {
        if (this.notifyUnsupported) {
            LogUtils.i(this.TAG, "notifyPayCode skipped because characteristic is unsupported");
            return;
        }
        BleDevice connectedDevice = getMBleManager().getConnectedDevice();
        if (connectedDevice == null) {
            LogUtils.w(this.TAG, "notifyPayCode device is null");
        } else {
            getMBleManager().notify(connectedDevice, BleUUID.PAY_CODE_SERVICE_UUID, "00004a03-0000-1000-8000-00805f9b34fb", this.mSichePayCodeNotify);
        }
    }

    public final void retryNotify() {
        if (this.notifyUnsupported) {
            return;
        }
        int i = this.tryCount;
        if (i >= 1) {
            LogUtils.w(this.TAG, "notifyPayCode tryCount >= 2 fail");
            return;
        }
        int i2 = i + 1;
        this.tryCount = i2;
        LogUtils.w(this.TAG, "retryNotify tryCount: " + i2);
        this.mHandler.postDelayed(new Runnable() { // from class: com.wakeup.module.device.work.channel.siche.SichePayCodeHandler$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                SichePayCodeHandler.this.notifyPayCode();
            }
        }, 5000L);
    }

    public static /* synthetic */ void markNotifyUnsupported$default(SichePayCodeHandler sichePayCodeHandler, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        sichePayCodeHandler.markNotifyUnsupported(str);
    }

    public final void markNotifyUnsupported(String mac) {
        if (mac == null) {
            mac = "";
        }
        String str = mac;
        String str2 = str.length() == 0 ? this.notifyMac : str;
        if (str2.length() > 0) {
            this.unsupportedNotifyMacs.add(str2);
        }
        if (this.notifyMac.length() == 0 || str.length() == 0 || StringsKt.equals(this.notifyMac, mac, true)) {
            this.notifyUnsupported = true;
        }
        LogUtils.w(this.TAG, "notifyPayCode unsupported, stop retry mac=" + str2);
    }

    public final void sendAliPayCodeData(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.queue.add(data);
        if (this.isWriting) {
            return;
        }
        execSend();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void execSend() {
        BleDevice connectedDevice = getMBleManager().getConnectedDevice();
        if (connectedDevice == null) {
            LogUtils.w(this.TAG, "execSend device is null");
            return;
        }
        byte[] poll = this.queue.poll();
        if (poll == null) {
            LogUtils.i(this.TAG, "execSend end");
        } else {
            this.isWriting = true;
            getMBleManager().write(connectedDevice, BleUUID.PAY_CODE_SERVICE_UUID, "00004a03-0000-1000-8000-00805f9b34fb", poll, false, 0, this.writeCallback);
        }
    }
}
