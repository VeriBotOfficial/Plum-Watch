package com.sifli.siflireadersdk.blecore;

import com.clj.fastble.data.BleDevice;
import com.sifli.siflireadersdk.error.SFError;
import java.util.List;

/* loaded from: classes16.dex */
public interface SFBLEManagerCallback {
    void onDeviceConnectFail(SFError sFError);

    void onDeviceConnected(BleDevice bleDevice);

    void onDeviceDisconnected(SFError sFError);

    void onHandShake(int i);

    void onHandShakeFail(SFError sFError);

    void onNotifyData(byte[] bArr);

    void onScanBegin();

    void onScanFinish(List<BleDevice> list);

    void onScanTimeout();

    void onScaningDevice(BleDevice bleDevice);

    void onWriteFail(SFError sFError);
}
