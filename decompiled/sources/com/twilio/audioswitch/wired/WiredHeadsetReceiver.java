package com.twilio.audioswitch.wired;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.twilio.audioswitch.android.Logger;
import com.yandex.div.core.timer.TimerController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WiredHeadsetReceiver.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\u0012\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/twilio/audioswitch/wired/WiredHeadsetReceiver;", "Landroid/content/BroadcastReceiver;", "context", "Landroid/content/Context;", "logger", "Lcom/twilio/audioswitch/android/Logger;", "(Landroid/content/Context;Lcom/twilio/audioswitch/android/Logger;)V", "deviceListener", "Lcom/twilio/audioswitch/wired/WiredDeviceConnectionListener;", "getDeviceListener$audioswitch_release", "()Lcom/twilio/audioswitch/wired/WiredDeviceConnectionListener;", "setDeviceListener$audioswitch_release", "(Lcom/twilio/audioswitch/wired/WiredDeviceConnectionListener;)V", "onReceive", "", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/content/Intent;", "start", TimerController.STOP_COMMAND, "audioswitch_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class WiredHeadsetReceiver extends BroadcastReceiver {
    private final Context context;
    private WiredDeviceConnectionListener deviceListener;
    private final Logger logger;

    public WiredHeadsetReceiver(Context context, Logger logger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.context = context;
        this.logger = logger;
    }

    /* renamed from: getDeviceListener$audioswitch_release, reason: from getter */
    public final WiredDeviceConnectionListener getDeviceListener() {
        return this.deviceListener;
    }

    public final void setDeviceListener$audioswitch_release(WiredDeviceConnectionListener wiredDeviceConnectionListener) {
        this.deviceListener = wiredDeviceConnectionListener;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (intent.getIntExtra("state", 0) == 1) {
            String stringExtra = intent.getStringExtra("name");
            this.logger.d("WiredHeadsetReceiver", "Wired headset device " + (stringExtra != null ? stringExtra : "") + " connected");
            WiredDeviceConnectionListener wiredDeviceConnectionListener = this.deviceListener;
            if (wiredDeviceConnectionListener != null) {
                wiredDeviceConnectionListener.onDeviceConnected();
                return;
            }
            return;
        }
        String stringExtra2 = intent.getStringExtra("name");
        this.logger.d("WiredHeadsetReceiver", "Wired headset device " + (stringExtra2 != null ? stringExtra2 : "") + " disconnected");
        WiredDeviceConnectionListener wiredDeviceConnectionListener2 = this.deviceListener;
        if (wiredDeviceConnectionListener2 != null) {
            wiredDeviceConnectionListener2.onDeviceDisconnected();
        }
    }

    public final void start(WiredDeviceConnectionListener deviceListener) {
        Intrinsics.checkNotNullParameter(deviceListener, "deviceListener");
        this.deviceListener = deviceListener;
        this.context.registerReceiver(this, new IntentFilter("android.intent.action.HEADSET_PLUG"));
    }

    public final void stop() {
        this.deviceListener = null;
        this.context.unregisterReceiver(this);
    }
}
