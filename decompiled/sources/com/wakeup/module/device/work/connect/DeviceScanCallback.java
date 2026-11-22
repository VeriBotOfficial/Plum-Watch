package com.wakeup.module.device.work.connect;

import android.text.TextUtils;
import com.blankj.utilcode.util.CollectionUtils;
import com.wakeup.common.log.LogUtils;
import com.wakeup.common.utils.LTVUtils;
import com.wakeup.commponent.module.device.BleDevice;
import com.wakeup.commponent.module.device.DeviceState;
import com.wakeup.commponent.module.device.EventType;
import com.wakeup.commponent.module.device.ScanDevice;
import com.wakeup.module.device.lib.callback.BleScanCallback;
import com.wakeup.module.device.work.DeviceEventMgr;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class DeviceScanCallback extends BleScanCallback {
    private static final String TAG = "Ble_Log";
    private final List<String> mBleNameList = new ArrayList();

    @Override // com.wakeup.module.device.lib.callback.BleScanPresenterImp
    public void onScanStarted(boolean z) {
        LogUtils.i(TAG, "scanDevice start：" + z);
        DeviceEventMgr.sendState(DeviceState.STATE_SEARCHING);
        if (z) {
            return;
        }
        DeviceEventMgr.send(EventType.TYPE_DEVICE_SCAN, 1);
    }

    @Override // com.wakeup.module.device.lib.callback.BleScanPresenterImp
    public void onScanning(BleDevice bleDevice) {
        if (TextUtils.isEmpty(bleDevice.getName()) || TextUtils.isEmpty(bleDevice.getMac()) || !this.mBleNameList.contains(bleDevice.getName())) {
            return;
        }
        DeviceEventMgr.send(EventType.TYPE_DEVICE_SCAN, 0, new ScanDevice(bleDevice.getMac(), bleDevice.getName(), bleDevice.getRssi(), LTVUtils.getDeviceType(bleDevice.getScanRecord())));
    }

    @Override // com.wakeup.module.device.lib.callback.BleScanCallback
    public void onScanFinished(List<BleDevice> list) {
        LogUtils.i(TAG, "scanDevice finish size: " + (CollectionUtils.isEmpty(list) ? 0 : list.size()));
        DeviceEventMgr.send(EventType.TYPE_DEVICE_SCAN, 1);
    }

    public void setBleNameList(List<String> list) {
        this.mBleNameList.clear();
        this.mBleNameList.addAll(list);
    }
}
