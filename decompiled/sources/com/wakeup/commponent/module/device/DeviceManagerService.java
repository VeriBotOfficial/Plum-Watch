package com.wakeup.commponent.module.device;

import android.bluetooth.BluetoothDevice;
import android.graphics.Bitmap;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.wakeup.common.storage.model.DeviceModel;
import com.wakeup.commponent.module.ble.BleOrderModel;
import com.wakeup.commponent.module.tts.record.RecordListener;
import java.util.List;

/* loaded from: classes2.dex */
public interface DeviceManagerService extends IProvider {
    void addAnalyzer(BleOrderAnalyzer bleOrderAnalyzer);

    void addIgnore(String str);

    void autoConnect(String str, boolean z);

    void beginAliPayCode();

    void cancelConnect();

    void connectDevice(String str);

    void disconnectDevice();

    void disconnectDevice(String str);

    void dispatchMockDeviceEvent(EventType eventType, int i, Object obj);

    int getBatteryByMac(String str);

    BleDevice getConnectedDevice();

    String getConnectingMac();

    String getCurrentDeviceMac();

    int getDeviceState();

    int getRecordType();

    void getSicheLog();

    void init();

    boolean isConnected();

    boolean isConnected(String str);

    void openFileTransNotify();

    boolean recordIsPause();

    boolean recordIsWorking();

    void refreshBle(BluetoothDevice bluetoothDevice);

    void registerListener(OnEventListener onEventListener, EventType... eventTypeArr);

    void removeIgnore(String str);

    void resetRecord();

    void scanAndConnectDevice(String str);

    void scanDevice(List<String> list);

    void scanHeadset();

    void scanHeadset(int i);

    void sendAliPayCodeData(byte[] bArr);

    void sendData(BleOrderModel bleOrderModel);

    void sendData(BleOrderModel bleOrderModel, boolean z);

    void sendData(BleOrderModel... bleOrderModelArr);

    void sendWeather(boolean z);

    void sendWeatherSwitch(boolean z);

    void setPauseAutoConnect(boolean z);

    void setRecordPause(boolean z);

    void startRecord(int i, String str, RecordListener recordListener);

    void startSendNucleicAcidCode(Bitmap bitmap);

    void startWechatSocket();

    void stopRecord();

    void stopScanDevice();

    void switchLastDevice(String str);

    void syncData();

    void unbind(DeviceModel deviceModel);

    void unregisterListener(OnEventListener onEventListener);
}
