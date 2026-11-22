package com.wakeup.module.device.stack;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGatt;
import android.content.Context;
import com.autonavi.aps.amapapi.config.Const;
import com.umeng.analytics.pro.ak;
import com.wakeup.commponent.module.device.BleDevice;
import com.wakeup.module.device.lib.callback.BleGattCallback;
import com.wakeup.module.device.lib.callback.BleMtuChangedCallback;
import com.wakeup.module.device.lib.callback.BleNotifyCallback;
import com.wakeup.module.device.lib.callback.BleScanAndConnectCallback;
import com.wakeup.module.device.lib.callback.BleScanCallback;
import com.wakeup.module.device.lib.callback.BleWriteCallback;
import com.wakeup.module.device.lib.data.BleScanState;
import com.wakeup.module.device.lib.scan.BleScanRuleConfig;
import com.wakeup.module.device.work.BleConnectErrorMapper;
import com.wakeup.module.device.work.BleFailStage;
import java.util.List;
import kotlin.Metadata;

/* compiled from: IBleStack.kt */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\rH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0017H&J\b\u0010\u0018\u001a\u00020\u0003H&J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u001cH&J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u001cH&J\b\u0010\u001f\u001a\u00020\u0003H&J*\u0010 \u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020#H&JD\u0010$\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u001b2\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020*H&J\"\u0010+\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010,\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020-H&J\b\u0010.\u001a\u00020\u0003H&J\u0012\u0010/\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH&J\u0012\u00100\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH&J\b\u00101\u001a\u00020\u0003H&J\u0012\u00102\u001a\u00020\b2\b\u00103\u001a\u0004\u0018\u00010\u001eH&J\u0012\u00104\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH&J\u0012\u00105\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH&J\b\u00105\u001a\u00020\bH&J\u0014\u00109\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH&J\u0010\u0010:\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010;H&J\u0014\u0010<\u001a\u0004\u0018\u00010=2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH&J\n\u0010>\u001a\u0004\u0018\u00010?H&J\u0012\u0010@\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH&J\b\u0010A\u001a\u00020BH&J\b\u0010C\u001a\u00020\u000bH&J\u0010\u0010D\u001a\u00020\u001b2\u0006\u0010E\u001a\u00020\u000bH&R\u0014\u00106\u001a\u0004\u0018\u00010\u001eX¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006F"}, d2 = {"Lcom/wakeup/module/device/stack/IBleStack;", "", "init", "", "context", "Landroid/content/Context;", "enableLog", "enable", "", "setReConnectCount", Const.SP_KEY_CALL_LOC_COUNT, "", ak.aT, "", "setConnectOverTime", "time", "initScanRule", "config", "Lcom/wakeup/module/device/lib/scan/BleScanRuleConfig;", BleFailStage.SCAN, "callback", "Lcom/wakeup/module/device/lib/callback/BleScanCallback;", "scanAndConnect", "Lcom/wakeup/module/device/lib/callback/BleScanAndConnectCallback;", "cancelScan", BleFailStage.CONNECT, "mac", "", "Lcom/wakeup/module/device/lib/callback/BleGattCallback;", "bleDevice", "Lcom/wakeup/commponent/module/device/BleDevice;", "cancelConnect", BleConnectErrorMapper.CODE_NOTIFY, "uuidService", "uuidNotify", "Lcom/wakeup/module/device/lib/callback/BleNotifyCallback;", BleFailStage.WRITE, "uuidWrite", "data", "", "split", "splitNum", "Lcom/wakeup/module/device/lib/callback/BleWriteCallback;", "setMtu", "mtu", "Lcom/wakeup/module/device/lib/callback/BleMtuChangedCallback;", "setPhy2M", "disconnect", "disconnectDevice", "disconnectAllDevice", "refreshBle", "device", "isConnecting", "isConnected", "connectedDevice", "getConnectedDevice", "()Lcom/wakeup/commponent/module/device/BleDevice;", "getConnectedDeviceByMac", "getAllConnectedDevice", "", "getBluetoothGatt", "Landroid/bluetooth/BluetoothGatt;", "getBluetoothAdapter", "Landroid/bluetooth/BluetoothAdapter;", "getBleName", "getScanState", "Lcom/wakeup/module/device/lib/data/BleScanState;", "getAutoConnectState", "analysisAutoState", "state", "module-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface IBleStack {
    String analysisAutoState(int state);

    void cancelConnect();

    void cancelScan();

    void connect(BleDevice bleDevice, BleGattCallback callback);

    void connect(String mac, BleGattCallback callback);

    void disconnect(BleDevice bleDevice);

    void disconnectAllDevice();

    void disconnectDevice(String mac);

    void enableLog(boolean enable);

    List<BleDevice> getAllConnectedDevice();

    int getAutoConnectState();

    String getBleName(String mac);

    BluetoothAdapter getBluetoothAdapter();

    BluetoothGatt getBluetoothGatt(BleDevice bleDevice);

    BleDevice getConnectedDevice();

    BleDevice getConnectedDeviceByMac(String mac);

    BleScanState getScanState();

    void init(Context context);

    void initScanRule(BleScanRuleConfig config);

    boolean isConnected();

    boolean isConnected(String mac);

    boolean isConnecting(String mac);

    void notify(BleDevice bleDevice, String uuidService, String uuidNotify, BleNotifyCallback callback);

    boolean refreshBle(BleDevice device);

    void scan(BleScanCallback callback);

    void scanAndConnect(BleScanAndConnectCallback callback);

    void setConnectOverTime(long time);

    void setMtu(BleDevice bleDevice, int mtu, BleMtuChangedCallback callback);

    void setPhy2M();

    void setReConnectCount(int count, long interval);

    void write(BleDevice bleDevice, String uuidService, String uuidWrite, byte[] data, boolean split, int splitNum, BleWriteCallback callback);
}
