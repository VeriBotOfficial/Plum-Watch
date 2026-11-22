package com.twilio.audioswitch.android;

import android.bluetooth.BluetoothDevice;
import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BluetoothDeviceWrapperImpl.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\fJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/twilio/audioswitch/android/BluetoothDeviceWrapperImpl;", "Lcom/twilio/audioswitch/android/BluetoothDeviceWrapper;", "device", "Landroid/bluetooth/BluetoothDevice;", "name", "", "deviceClass", "", "(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;Ljava/lang/Integer;)V", "getDevice", "()Landroid/bluetooth/BluetoothDevice;", "getDeviceClass", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;Ljava/lang/Integer;)Lcom/twilio/audioswitch/android/BluetoothDeviceWrapperImpl;", "equals", "", "other", "", "hashCode", "toString", "audioswitch_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final /* data */ class BluetoothDeviceWrapperImpl implements BluetoothDeviceWrapper {
    private final BluetoothDevice device;
    private final Integer deviceClass;
    private final String name;

    public static /* synthetic */ BluetoothDeviceWrapperImpl copy$default(BluetoothDeviceWrapperImpl bluetoothDeviceWrapperImpl, BluetoothDevice bluetoothDevice, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            bluetoothDevice = bluetoothDeviceWrapperImpl.device;
        }
        if ((i & 2) != 0) {
            str = bluetoothDeviceWrapperImpl.getName();
        }
        if ((i & 4) != 0) {
            num = bluetoothDeviceWrapperImpl.getDeviceClass();
        }
        return bluetoothDeviceWrapperImpl.copy(bluetoothDevice, str, num);
    }

    /* renamed from: component1, reason: from getter */
    public final BluetoothDevice getDevice() {
        return this.device;
    }

    public final String component2() {
        return getName();
    }

    public final Integer component3() {
        return getDeviceClass();
    }

    public final BluetoothDeviceWrapperImpl copy(BluetoothDevice device, String name, Integer deviceClass) {
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(name, "name");
        return new BluetoothDeviceWrapperImpl(device, name, deviceClass);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BluetoothDeviceWrapperImpl)) {
            return false;
        }
        BluetoothDeviceWrapperImpl bluetoothDeviceWrapperImpl = (BluetoothDeviceWrapperImpl) other;
        return Intrinsics.areEqual(this.device, bluetoothDeviceWrapperImpl.device) && Intrinsics.areEqual(getName(), bluetoothDeviceWrapperImpl.getName()) && Intrinsics.areEqual(getDeviceClass(), bluetoothDeviceWrapperImpl.getDeviceClass());
    }

    public int hashCode() {
        BluetoothDevice bluetoothDevice = this.device;
        int hashCode = (bluetoothDevice != null ? bluetoothDevice.hashCode() : 0) * 31;
        String name = getName();
        int hashCode2 = (hashCode + (name != null ? name.hashCode() : 0)) * 31;
        Integer deviceClass = getDeviceClass();
        return hashCode2 + (deviceClass != null ? deviceClass.hashCode() : 0);
    }

    public String toString() {
        return "BluetoothDeviceWrapperImpl(device=" + this.device + ", name=" + getName() + ", deviceClass=" + getDeviceClass() + Separators.RPAREN;
    }

    public BluetoothDeviceWrapperImpl(BluetoothDevice device, String name, Integer num) {
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(name, "name");
        this.device = device;
        this.name = name;
        this.deviceClass = num;
    }

    public final BluetoothDevice getDevice() {
        return this.device;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ BluetoothDeviceWrapperImpl(android.bluetooth.BluetoothDevice r1, java.lang.String r2, java.lang.Integer r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto Ld
            java.lang.String r2 = r1.getName()
            if (r2 == 0) goto Lb
            goto Ld
        Lb:
            java.lang.String r2 = "Bluetooth"
        Ld:
            r4 = r4 & 4
            if (r4 == 0) goto L21
            android.bluetooth.BluetoothClass r3 = r1.getBluetoothClass()
            if (r3 == 0) goto L20
            int r3 = r3.getDeviceClass()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L21
        L20:
            r3 = 0
        L21:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.twilio.audioswitch.android.BluetoothDeviceWrapperImpl.<init>(android.bluetooth.BluetoothDevice, java.lang.String, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Override // com.twilio.audioswitch.android.BluetoothDeviceWrapper
    public String getName() {
        return this.name;
    }

    @Override // com.twilio.audioswitch.android.BluetoothDeviceWrapper
    public Integer getDeviceClass() {
        return this.deviceClass;
    }
}
