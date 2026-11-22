package com.twilio.audioswitch.bluetooth;

import kotlin.Metadata;

/* compiled from: BluetoothHeadsetConnectionListener.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0014\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/twilio/audioswitch/bluetooth/BluetoothHeadsetConnectionListener;", "", "onBluetoothHeadsetActivationError", "", "onBluetoothHeadsetStateChanged", "headsetName", "", "audioswitch_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public interface BluetoothHeadsetConnectionListener {
    void onBluetoothHeadsetActivationError();

    void onBluetoothHeadsetStateChanged(String headsetName);

    /* compiled from: BluetoothHeadsetConnectionListener.kt */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ void onBluetoothHeadsetStateChanged$default(BluetoothHeadsetConnectionListener bluetoothHeadsetConnectionListener, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onBluetoothHeadsetStateChanged");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            bluetoothHeadsetConnectionListener.onBluetoothHeadsetStateChanged(str);
        }
    }
}
