package com.twilio.audioswitch.android;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import com.huawei.hms.support.api.entity.core.CommonCode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BluetoothIntentProcessorImpl.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/twilio/audioswitch/android/BluetoothIntentProcessorImpl;", "Lcom/twilio/audioswitch/android/BluetoothIntentProcessor;", "()V", "getBluetoothDevice", "Lcom/twilio/audioswitch/android/BluetoothDeviceWrapper;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/content/Intent;", "audioswitch_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class BluetoothIntentProcessorImpl implements BluetoothIntentProcessor {
    @Override // com.twilio.audioswitch.android.BluetoothIntentProcessor
    public BluetoothDeviceWrapper getBluetoothDevice(Intent intent) {
        BluetoothDeviceWrapperImpl bluetoothDeviceWrapperImpl;
        Intrinsics.checkNotNullParameter(intent, "intent");
        BluetoothDevice device = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (device != null) {
            Intrinsics.checkNotNullExpressionValue(device, "device");
            bluetoothDeviceWrapperImpl = new BluetoothDeviceWrapperImpl(device, null, null, 6, null);
        } else {
            bluetoothDeviceWrapperImpl = null;
        }
        return bluetoothDeviceWrapperImpl;
    }
}
