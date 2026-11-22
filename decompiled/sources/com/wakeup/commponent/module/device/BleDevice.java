package com.wakeup.commponent.module.device;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public class BleDevice implements Parcelable {
    public static final Parcelable.Creator<BleDevice> CREATOR = new Parcelable.Creator<BleDevice>() { // from class: com.wakeup.commponent.module.device.BleDevice.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BleDevice createFromParcel(Parcel parcel) {
            return new BleDevice(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BleDevice[] newArray(int i) {
            return new BleDevice[i];
        }
    };
    private BluetoothDevice mDevice;
    private int mRssi;
    private byte[] mScanRecord;
    private long mTimestampNanos;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public BleDevice(BluetoothDevice bluetoothDevice) {
        this.mDevice = bluetoothDevice;
    }

    public BleDevice(BluetoothDevice bluetoothDevice, int i, byte[] bArr, long j) {
        this.mDevice = bluetoothDevice;
        this.mScanRecord = bArr;
        this.mRssi = i;
        this.mTimestampNanos = j;
    }

    protected BleDevice(Parcel parcel) {
        this.mDevice = (BluetoothDevice) parcel.readParcelable(BluetoothDevice.class.getClassLoader());
        this.mScanRecord = parcel.createByteArray();
        this.mRssi = parcel.readInt();
        this.mTimestampNanos = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mDevice, i);
        parcel.writeByteArray(this.mScanRecord);
        parcel.writeInt(this.mRssi);
        parcel.writeLong(this.mTimestampNanos);
    }

    public String getName() {
        byte[] bArr;
        BluetoothDevice bluetoothDevice = this.mDevice;
        if (bluetoothDevice == null) {
            return "";
        }
        try {
            String name = bluetoothDevice.getName();
            if (TextUtils.isEmpty(name) && (bArr = this.mScanRecord) != null) {
                name = analysisBleName(bArr);
            }
            return name == null ? "" : name;
        } catch (Exception unused) {
            return "";
        }
    }

    private String analysisBleName(byte[] bArr) {
        byte b;
        try {
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            while (order.remaining() > 2 && (b = order.get()) != 0) {
                if (order.get() == 9) {
                    byte[] bArr2 = new byte[b - 1];
                    order.get(bArr2);
                    return new String(bArr2, "utf-8");
                }
                order.position((order.position() + b) - 1);
            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public String getMac() {
        BluetoothDevice bluetoothDevice = this.mDevice;
        if (bluetoothDevice != null) {
            return bluetoothDevice.getAddress();
        }
        return null;
    }

    public String getKey() {
        BluetoothDevice bluetoothDevice = this.mDevice;
        if (bluetoothDevice != null) {
            return bluetoothDevice.getAddress();
        }
        return "";
    }

    public BluetoothDevice getDevice() {
        return this.mDevice;
    }

    public void setDevice(BluetoothDevice bluetoothDevice) {
        this.mDevice = bluetoothDevice;
    }

    public byte[] getScanRecord() {
        return this.mScanRecord;
    }

    public void setScanRecord(byte[] bArr) {
        this.mScanRecord = bArr;
    }

    public int getRssi() {
        return this.mRssi;
    }

    public void setRssi(int i) {
        this.mRssi = i;
    }

    public long getTimestampNanos() {
        return this.mTimestampNanos;
    }

    public void setTimestampNanos(long j) {
        this.mTimestampNanos = j;
    }
}
