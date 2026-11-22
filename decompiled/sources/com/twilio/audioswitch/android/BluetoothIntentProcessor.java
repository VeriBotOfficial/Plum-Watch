package com.twilio.audioswitch.android;

import android.content.Intent;
import com.huawei.hms.support.api.entity.core.CommonCode;
import kotlin.Metadata;

/* compiled from: BluetoothIntentProcessor.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/twilio/audioswitch/android/BluetoothIntentProcessor;", "", "getBluetoothDevice", "Lcom/twilio/audioswitch/android/BluetoothDeviceWrapper;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/content/Intent;", "audioswitch_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public interface BluetoothIntentProcessor {
    BluetoothDeviceWrapper getBluetoothDevice(Intent intent);
}
