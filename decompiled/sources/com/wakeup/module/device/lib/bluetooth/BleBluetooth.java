package com.wakeup.module.device.lib.bluetooth;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.wakeup.common.log.LogUtils;
import com.wakeup.commponent.module.device.BleDevice;
import com.wakeup.module.device.lib.BleManager;
import com.wakeup.module.device.lib.callback.BleGattCallback;
import com.wakeup.module.device.lib.callback.BleMtuChangedCallback;
import com.wakeup.module.device.lib.callback.BleNotifyCallback;
import com.wakeup.module.device.lib.callback.BleWriteCallback;
import com.wakeup.module.device.lib.data.BleConnectStateParameter;
import com.wakeup.module.device.lib.exception.ConnectException;
import com.wakeup.module.device.lib.exception.OtherException;
import com.wakeup.module.device.lib.exception.TimeoutException;
import com.wakeup.module.device.lib.utils.BleLog;
import io.livekit.android.room.SignalClient;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public class BleBluetooth {
    private final BleDevice bleDevice;
    private BleGattCallback bleGattCallback;
    private BleMtuChangedCallback bleMtuChangedCallback;
    private BluetoothGatt bluetoothGatt;
    private LastState lastState;
    private final HashMap<String, BleNotifyCallback> bleNotifyCallbackHashMap = new HashMap<>();
    private final HashMap<String, BleWriteCallback> bleWriteCallbackHashMap = new HashMap<>();
    private boolean isActiveDisconnect = false;
    private final MainHandler mainHandler = new MainHandler(Looper.getMainLooper());
    private final HashMap<BluetoothGatt, Integer> gattAttemptMap = new HashMap<>();
    private int connectRetryCount = 0;
    private int connectAttemptId = 0;
    private final BluetoothGattCallback coreGattCallback = new BluetoothGattCallback() { // from class: com.wakeup.module.device.lib.bluetooth.BleBluetooth.1
        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            super.onConnectionStateChange(bluetoothGatt, i, i2);
            int gattAttemptId = BleBluetooth.this.getGattAttemptId(bluetoothGatt);
            LogUtils.i("Ble_Log", "onConnectionStateChange attemptId: " + gattAttemptId + ", status: " + i + ", newState: " + i2 + ", currentThread: " + Thread.currentThread().getName());
            if (BleBluetooth.this.isActiveGatt(bluetoothGatt, gattAttemptId, "onConnectionStateChange")) {
                BleBluetooth.this.mainHandler.removeMessages(7);
                if (i2 == 2) {
                    LogUtils.i("Ble_Log", "onConnectionStateChange 连接成功 attemptId: " + gattAttemptId);
                    Message obtainMessage = BleBluetooth.this.mainHandler.obtainMessage();
                    obtainMessage.what = 4;
                    obtainMessage.arg1 = gattAttemptId;
                    BleBluetooth.this.mainHandler.sendMessageDelayed(obtainMessage, 1000L);
                    return;
                }
                if (i2 == 0) {
                    if (BleBluetooth.this.lastState == LastState.CONNECT_CONNECTING) {
                        LogUtils.i("Ble_Log", "onConnectionStateChange 连接失败 attemptId: " + gattAttemptId);
                        Message obtainMessage2 = BleBluetooth.this.mainHandler.obtainMessage();
                        obtainMessage2.what = 1;
                        obtainMessage2.arg1 = gattAttemptId;
                        obtainMessage2.obj = new BleConnectStateParameter(i);
                        BleBluetooth.this.mainHandler.sendMessage(obtainMessage2);
                        return;
                    }
                    if (BleBluetooth.this.lastState == LastState.CONNECT_CONNECTED) {
                        LogUtils.i("Ble_Log", "onConnectionStateChange 连接断开 attemptId: " + gattAttemptId);
                        Message obtainMessage3 = BleBluetooth.this.mainHandler.obtainMessage();
                        obtainMessage3.what = 2;
                        obtainMessage3.arg1 = gattAttemptId;
                        BleConnectStateParameter bleConnectStateParameter = new BleConnectStateParameter(i);
                        bleConnectStateParameter.setActive(BleBluetooth.this.isActiveDisconnect);
                        obtainMessage3.obj = bleConnectStateParameter;
                        BleBluetooth.this.mainHandler.sendMessage(obtainMessage3);
                    }
                }
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            super.onServicesDiscovered(bluetoothGatt, i);
            int gattAttemptId = BleBluetooth.this.getGattAttemptId(bluetoothGatt);
            LogUtils.i("Ble_Log", "BluetoothGattCallback: onServicesDiscovered attemptId: " + gattAttemptId + ", status: " + i + ", currentThread: " + Thread.currentThread().getName());
            if (BleBluetooth.this.isActiveGatt(bluetoothGatt, gattAttemptId, "onServicesDiscovered")) {
                BleBluetooth bleBluetooth = BleBluetooth.this;
                bleBluetooth.printServices(bleBluetooth.bluetoothGatt);
                BleBluetooth.this.mainHandler.removeMessages(5);
                if (i == 0) {
                    if (BleBluetooth.this.mainHandler.hasMessages(6)) {
                        LogUtils.i("Ble_Log", "已包含GATT_SUCCESS");
                        return;
                    }
                    Message obtainMessage = BleBluetooth.this.mainHandler.obtainMessage();
                    obtainMessage.what = 6;
                    obtainMessage.arg1 = gattAttemptId;
                    obtainMessage.obj = new BleConnectStateParameter(i);
                    BleBluetooth.this.mainHandler.sendMessage(obtainMessage);
                    return;
                }
                LogUtils.i("Ble_Log", "onServicesDiscovered status is fail attemptId: " + gattAttemptId);
                Message obtainMessage2 = BleBluetooth.this.mainHandler.obtainMessage();
                obtainMessage2.what = 5;
                obtainMessage2.arg1 = gattAttemptId;
                BleBluetooth.this.mainHandler.sendMessage(obtainMessage2);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            Handler handler;
            super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
            Iterator it = BleBluetooth.this.bleNotifyCallbackHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Object value = ((Map.Entry) it.next()).getValue();
                if (value instanceof BleNotifyCallback) {
                    BleNotifyCallback bleNotifyCallback = (BleNotifyCallback) value;
                    if (bluetoothGattCharacteristic.getUuid().toString().equalsIgnoreCase(bleNotifyCallback.getKey()) && (handler = bleNotifyCallback.getHandler()) != null) {
                        Message obtainMessage = handler.obtainMessage();
                        obtainMessage.what = 19;
                        obtainMessage.obj = bleNotifyCallback;
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("notify_value", bluetoothGattCharacteristic.getValue());
                        obtainMessage.setData(bundle);
                        handler.sendMessage(obtainMessage);
                    }
                }
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            Handler handler;
            super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
            LogUtils.i("Ble_Log", "BluetoothGattCallback: onDescriptorWrite status: " + (i == 0));
            Iterator it = BleBluetooth.this.bleNotifyCallbackHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Object value = ((Map.Entry) it.next()).getValue();
                if (value instanceof BleNotifyCallback) {
                    BleNotifyCallback bleNotifyCallback = (BleNotifyCallback) value;
                    if (bluetoothGattDescriptor.getCharacteristic().getUuid().toString().equalsIgnoreCase(bleNotifyCallback.getKey()) && (handler = bleNotifyCallback.getHandler()) != null) {
                        Message obtainMessage = handler.obtainMessage();
                        obtainMessage.what = 18;
                        obtainMessage.obj = bleNotifyCallback;
                        Bundle bundle = new Bundle();
                        bundle.putInt("notify_status", i);
                        obtainMessage.setData(bundle);
                        handler.sendMessage(obtainMessage);
                    }
                }
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            Handler handler;
            super.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i);
            Iterator it = BleBluetooth.this.bleWriteCallbackHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Object value = ((Map.Entry) it.next()).getValue();
                if (value instanceof BleWriteCallback) {
                    BleWriteCallback bleWriteCallback = (BleWriteCallback) value;
                    if (bluetoothGattCharacteristic.getUuid().toString().equalsIgnoreCase(bleWriteCallback.getKey()) && (handler = bleWriteCallback.getHandler()) != null) {
                        Message obtainMessage = handler.obtainMessage();
                        obtainMessage.what = 50;
                        obtainMessage.obj = bleWriteCallback;
                        Bundle bundle = new Bundle();
                        bundle.putInt("write_status", i);
                        bundle.putByteArray("write_value", bluetoothGattCharacteristic.getValue());
                        obtainMessage.setData(bundle);
                        handler.sendMessage(obtainMessage);
                    }
                }
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            super.onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i, int i2) {
            super.onReadRemoteRssi(bluetoothGatt, i, i2);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
            Handler handler;
            super.onMtuChanged(bluetoothGatt, i, i2);
            LogUtils.i("Ble_Log", "mtu: " + i + " status :" + i2);
            if (BleBluetooth.this.bleMtuChangedCallback == null || (handler = BleBluetooth.this.bleMtuChangedCallback.getHandler()) == null) {
                return;
            }
            Message obtainMessage = handler.obtainMessage();
            obtainMessage.what = 98;
            obtainMessage.obj = BleBluetooth.this.bleMtuChangedCallback;
            Bundle bundle = new Bundle();
            bundle.putInt("mtu_status", i2);
            bundle.putInt("mtu_value", i);
            obtainMessage.setData(bundle);
            handler.sendMessage(obtainMessage);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onPhyUpdate(BluetoothGatt bluetoothGatt, int i, int i2, int i3) {
            super.onPhyUpdate(bluetoothGatt, i, i2, i3);
            LogUtils.i("Ble_Log", "txPhy: " + i + " rxPhy: " + i2 + " status :" + i3);
        }
    };

    enum LastState {
        CONNECT_IDLE,
        CONNECT_CONNECTING,
        CONNECT_CONNECTED,
        CONNECT_FAILURE,
        CONNECT_DISCONNECT
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void printServices(BluetoothGatt bluetoothGatt) {
        StringBuffer stringBuffer = new StringBuffer("\r\n");
        for (BluetoothGattService bluetoothGattService : bluetoothGatt.getServices()) {
            stringBuffer.append("service: " + bluetoothGattService.getUuid().toString());
            stringBuffer.append("\r\n");
            Iterator<BluetoothGattCharacteristic> it = bluetoothGattService.getCharacteristics().iterator();
            while (it.hasNext()) {
                stringBuffer.append("\t\tcharacteristic: " + it.next().getUuid().toString());
                stringBuffer.append("\r\n");
            }
        }
        LogUtils.i("Ble_Log", "printServices " + bluetoothGatt.getDevice().getAddress() + " : " + stringBuffer.toString());
    }

    public BleBluetooth(BleDevice bleDevice) {
        this.bleDevice = bleDevice;
    }

    public BleConnector newBleConnector() {
        return new BleConnector(this);
    }

    public synchronized void addConnectGattCallback(BleGattCallback bleGattCallback) {
        this.bleGattCallback = bleGattCallback;
    }

    public synchronized void removeConnectGattCallback() {
        this.bleGattCallback = null;
    }

    public synchronized void addNotifyCallback(String str, BleNotifyCallback bleNotifyCallback) {
        this.bleNotifyCallbackHashMap.put(str, bleNotifyCallback);
    }

    public synchronized void addWriteCallback(String str, BleWriteCallback bleWriteCallback) {
        this.bleWriteCallbackHashMap.put(str, bleWriteCallback);
    }

    public synchronized void removeNotifyCallback(String str) {
        this.bleNotifyCallbackHashMap.remove(str);
    }

    public synchronized void removeWriteCallback(String str) {
        this.bleWriteCallbackHashMap.remove(str);
    }

    public synchronized void clearCharacterCallback() {
        HashMap<String, BleNotifyCallback> hashMap = this.bleNotifyCallbackHashMap;
        if (hashMap != null) {
            hashMap.clear();
        }
        HashMap<String, BleWriteCallback> hashMap2 = this.bleWriteCallbackHashMap;
        if (hashMap2 != null) {
            hashMap2.clear();
        }
    }

    public synchronized void addMtuChangedCallback(BleMtuChangedCallback bleMtuChangedCallback) {
        this.bleMtuChangedCallback = bleMtuChangedCallback;
    }

    public synchronized void removeMtuChangedCallback() {
        this.bleMtuChangedCallback = null;
    }

    public String getDeviceKey() {
        return this.bleDevice.getKey();
    }

    public BleDevice getDevice() {
        return this.bleDevice;
    }

    public BluetoothGatt getBluetoothGatt() {
        return this.bluetoothGatt;
    }

    public synchronized void connect(BleDevice bleDevice, BleGattCallback bleGattCallback) {
        connect(bleDevice, bleGattCallback, 0);
    }

    private synchronized int nextConnectAttemptId() {
        int i;
        i = this.connectAttemptId + 1;
        this.connectAttemptId = i;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized int getGattAttemptId(BluetoothGatt bluetoothGatt) {
        Integer num;
        num = this.gattAttemptMap.get(bluetoothGatt);
        return num == null ? -1 : num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean isActiveAttempt(int i, String str) {
        boolean z;
        z = i == this.connectAttemptId;
        if (!z) {
            LogUtils.w("Ble_Log", "ignore stale " + str + " attemptId: " + i + ", activeAttemptId: " + this.connectAttemptId);
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean isActiveGatt(BluetoothGatt bluetoothGatt, int i, String str) {
        boolean z;
        z = i == this.connectAttemptId && bluetoothGatt != null && bluetoothGatt == this.bluetoothGatt;
        if (!z) {
            LogUtils.w("Ble_Log", "ignore stale " + str + " attemptId: " + i + ", activeAttemptId: " + this.connectAttemptId);
        }
        return z;
    }

    private void clearConnectMessages() {
        this.mainHandler.removeMessages(7);
        this.mainHandler.removeMessages(1);
        this.mainHandler.removeMessages(4);
        this.mainHandler.removeMessages(5);
        this.mainHandler.removeMessages(6);
    }

    private void requestConnectionPriority(final int i, final int i2) {
        this.mainHandler.postDelayed(new Runnable() { // from class: com.wakeup.module.device.lib.bluetooth.BleBluetooth$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                BleBluetooth.this.lambda$requestConnectionPriority$0(i2, i);
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestConnectionPriority$0(int i, int i2) {
        BleLog.i("requestConnectionPriority attemptId = " + i + "    count = " + i2);
        if (isActiveAttempt(i, "requestConnectionPriority")) {
            if (this.bluetoothGatt == null) {
                BleLog.i("requestConnectionPriority    bluetoothGatt == null");
                return;
            }
            boolean requestConnectionPriority = this.bluetoothGatt.requestConnectionPriority(1);
            BleLog.i("requestConnectionPriority = " + requestConnectionPriority);
            if (requestConnectionPriority) {
                return;
            }
            int i3 = i2 + 1;
            if (i3 > 3) {
                BleLog.i("requestConnectionPriority    次数拦截：" + i3);
            } else {
                requestConnectionPriority(i3, i);
            }
        }
    }

    public synchronized void connect(BleDevice bleDevice, BleGattCallback bleGattCallback, int i) {
        BluetoothGatt bluetoothGatt;
        int nextConnectAttemptId = nextConnectAttemptId();
        clearConnectMessages();
        BleLog.i("connect device: " + bleDevice.getName() + ", mac: " + bleDevice.getMac() + ", connectCount:" + (i + 1) + ", attemptId:" + nextConnectAttemptId);
        if (i == 0) {
            this.connectRetryCount = 0;
        }
        addConnectGattCallback(bleGattCallback);
        this.lastState = LastState.CONNECT_CONNECTING;
        try {
            bluetoothGatt = bleDevice.getDevice().connectGatt(BleManager.getInstance().getContext(), false, this.coreGattCallback, 2);
        } catch (Exception unused) {
            LogUtils.e("Ble_Log", "connectGatt error");
            bluetoothGatt = null;
        }
        if (bluetoothGatt != null) {
            this.bluetoothGatt = bluetoothGatt;
            this.gattAttemptMap.put(bluetoothGatt, Integer.valueOf(nextConnectAttemptId));
            BleGattCallback bleGattCallback2 = this.bleGattCallback;
            if (bleGattCallback2 != null) {
                bleGattCallback2.onStartConnect(bleDevice);
                requestConnectionPriority(0, nextConnectAttemptId);
            }
            Message obtainMessage = this.mainHandler.obtainMessage();
            obtainMessage.what = 7;
            obtainMessage.arg1 = nextConnectAttemptId;
            this.mainHandler.sendMessageDelayed(obtainMessage, BleManager.getInstance().getConnectOverTime());
        } else {
            disconnectGatt();
            refreshDeviceCache();
            closeBluetoothGatt();
            this.lastState = LastState.CONNECT_FAILURE;
            BleManager.getInstance().getMultipleBluetoothController().removeConnectingBle(this);
            BleGattCallback bleGattCallback3 = this.bleGattCallback;
            if (bleGattCallback3 != null) {
                bleGattCallback3.onConnectFail(bleDevice, new OtherException("GATT connect exception occurred!"));
            }
        }
    }

    public synchronized void disconnect() {
        this.isActiveDisconnect = true;
        disconnectGatt();
    }

    public synchronized void destroy() {
        this.lastState = LastState.CONNECT_IDLE;
        disconnectGatt();
        refreshDeviceCache();
        closeBluetoothGatt();
        removeConnectGattCallback();
        removeMtuChangedCallback();
        clearCharacterCallback();
        this.gattAttemptMap.clear();
        this.mainHandler.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void disconnectGatt() {
        if (this.bluetoothGatt != null) {
            LogUtils.i("Ble_Log", "disconnectGatt: " + this.bluetoothGatt.getDevice().getAddress());
            try {
                this.bluetoothGatt.disconnect();
            } catch (Exception e) {
                LogUtils.i("Ble_Log", "disconnectGatt error" + e.getMessage());
            }
        } else {
            LogUtils.i("Ble_Log", "disconnectGatt bluetoothGatt is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void refreshDeviceCache() {
        BluetoothGatt bluetoothGatt;
        LogUtils.i("Ble_Log", "refreshDeviceCache");
        try {
            Method method = BluetoothGatt.class.getMethod("refresh", new Class[0]);
            if (method != null && (bluetoothGatt = this.bluetoothGatt) != null) {
                LogUtils.i("Ble_Log", "refreshDeviceCache: " + ((Boolean) method.invoke(bluetoothGatt, new Object[0])).booleanValue());
            }
        } catch (Exception e) {
            LogUtils.i("Ble_Log", "refreshDeviceCache exception occur while refreshing device: " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void closeBluetoothGatt() {
        if (this.bluetoothGatt != null) {
            LogUtils.i("Ble_Log", "closeBluetoothGatt: " + this.bluetoothGatt.getDevice().getAddress());
            try {
                this.gattAttemptMap.remove(this.bluetoothGatt);
                this.bluetoothGatt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.bluetoothGatt = null;
        } else {
            LogUtils.i("Ble_Log", "closeBluetoothGatt bluetoothGatt is null");
        }
    }

    public synchronized void setPyh2M() {
        if (this.bluetoothGatt == null) {
            return;
        }
        if (!BleManager.getInstance().getBluetoothAdapter().isLe2MPhySupported()) {
            LogUtils.w("Ble_Log", "setPyh 设备不支持2MPhy");
        } else {
            LogUtils.w("Ble_Log", "setPyh 2M");
            this.bluetoothGatt.setPreferredPhy(2, 2, 0);
        }
    }

    private final class MainHandler extends Handler {
        MainHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    if (BleBluetooth.this.isActiveAttempt(message.arg1, "connect fail")) {
                        LogUtils.i("Ble_Log", "connect fail attemptId: " + message.arg1);
                        BleBluetooth.this.disconnectGatt();
                        BleBluetooth.this.refreshDeviceCache();
                        BleBluetooth.this.closeBluetoothGatt();
                        BleBluetooth.this.mainHandler.removeMessages(5);
                        if (BleBluetooth.this.connectRetryCount < BleManager.getInstance().getReConnectCount()) {
                            BleBluetooth.this.connectRetryCount++;
                            LogUtils.w("Ble_Log", "connectDevice " + ("{name: " + BleBluetooth.this.bleDevice.getName() + ", mac: " + BleBluetooth.this.bleDevice.getMac() + "}") + " fail retry count: " + BleBluetooth.this.connectRetryCount + ", attemptId: " + message.arg1);
                            Message obtainMessage = BleBluetooth.this.mainHandler.obtainMessage();
                            obtainMessage.what = 3;
                            obtainMessage.arg1 = message.arg1;
                            BleBluetooth.this.mainHandler.sendMessageDelayed(obtainMessage, BleManager.getInstance().getReConnectInterval());
                            break;
                        } else {
                            BleBluetooth.this.lastState = LastState.CONNECT_FAILURE;
                            BleManager.getInstance().getMultipleBluetoothController().removeConnectingBle(BleBluetooth.this);
                            int status = ((BleConnectStateParameter) message.obj).getStatus();
                            if (BleBluetooth.this.bleGattCallback != null) {
                                BleBluetooth.this.bleGattCallback.onConnectFail(BleBluetooth.this.bleDevice, new ConnectException(BleBluetooth.this.bluetoothGatt, status));
                                break;
                            }
                        }
                    }
                    break;
                case 2:
                    if (BleBluetooth.this.isActiveAttempt(message.arg1, "disconnect")) {
                        BleBluetooth.this.lastState = LastState.CONNECT_DISCONNECT;
                        BleManager.getInstance().getMultipleBluetoothController().removeBleBluetooth(BleBluetooth.this);
                        BleBluetooth.this.disconnect();
                        BleBluetooth.this.refreshDeviceCache();
                        BleBluetooth.this.closeBluetoothGatt();
                        BleBluetooth.this.removeMtuChangedCallback();
                        BleBluetooth.this.clearCharacterCallback();
                        BleBluetooth.this.mainHandler.removeCallbacksAndMessages(null);
                        BleConnectStateParameter bleConnectStateParameter = (BleConnectStateParameter) message.obj;
                        boolean isActive = bleConnectStateParameter.isActive();
                        int status2 = bleConnectStateParameter.getStatus();
                        if (BleBluetooth.this.bleGattCallback != null) {
                            BleBluetooth.this.bleGattCallback.onDisConnected(isActive, BleBluetooth.this.bleDevice, BleBluetooth.this.bluetoothGatt, status2);
                            break;
                        }
                    }
                    break;
                case 3:
                    if (BleBluetooth.this.isActiveAttempt(message.arg1, SignalClient.CONNECT_QUERY_RECONNECT)) {
                        BleBluetooth bleBluetooth = BleBluetooth.this;
                        bleBluetooth.connect(bleBluetooth.bleDevice, BleBluetooth.this.bleGattCallback, BleBluetooth.this.connectRetryCount);
                        break;
                    }
                    break;
                case 4:
                    if (BleBluetooth.this.isActiveAttempt(message.arg1, "discover services")) {
                        LogUtils.i("Ble_Log", "start discoverServices attemptId: " + message.arg1);
                        if (BleBluetooth.this.bluetoothGatt != null) {
                            boolean discoverServices = BleBluetooth.this.bluetoothGatt.discoverServices();
                            Message obtainMessage2 = BleBluetooth.this.mainHandler.obtainMessage();
                            obtainMessage2.what = 5;
                            obtainMessage2.arg1 = message.arg1;
                            if (!discoverServices) {
                                LogUtils.i("Ble_Log", "discoverServiceResult is false");
                                BleBluetooth.this.mainHandler.sendMessage(obtainMessage2);
                                break;
                            } else {
                                BleBluetooth.this.mainHandler.sendMessageDelayed(obtainMessage2, 10000L);
                                break;
                            }
                        } else {
                            LogUtils.i("Ble_Log", "discoverServiceResult bluetoothGatt is null");
                            Message obtainMessage3 = BleBluetooth.this.mainHandler.obtainMessage();
                            obtainMessage3.what = 5;
                            obtainMessage3.arg1 = message.arg1;
                            BleBluetooth.this.mainHandler.sendMessage(obtainMessage3);
                            break;
                        }
                    }
                    break;
                case 5:
                    if (BleBluetooth.this.isActiveAttempt(message.arg1, "discover fail")) {
                        LogUtils.i("Ble_Log", "discoverService fail attemptId: " + message.arg1);
                        BleBluetooth.this.disconnectGatt();
                        BleBluetooth.this.refreshDeviceCache();
                        BleBluetooth.this.closeBluetoothGatt();
                        BleBluetooth.this.lastState = LastState.CONNECT_FAILURE;
                        BleManager.getInstance().getMultipleBluetoothController().removeConnectingBle(BleBluetooth.this);
                        if (BleBluetooth.this.bleGattCallback != null) {
                            BleBluetooth.this.bleGattCallback.onConnectFail(BleBluetooth.this.bleDevice, new OtherException("GATT discover services exception occurred! 发现服务失败"));
                            break;
                        }
                    }
                    break;
                case 6:
                    if (BleBluetooth.this.isActiveAttempt(message.arg1, "discover success")) {
                        LogUtils.i("Ble_Log", "discoverService success attemptId: " + message.arg1);
                        BleBluetooth.this.lastState = LastState.CONNECT_CONNECTED;
                        BleBluetooth.this.isActiveDisconnect = false;
                        BleManager.getInstance().getMultipleBluetoothController().removeConnectingBle(BleBluetooth.this);
                        BleManager.getInstance().getMultipleBluetoothController().addBleBluetooth(BleBluetooth.this);
                        int status3 = ((BleConnectStateParameter) message.obj).getStatus();
                        if (BleBluetooth.this.bleGattCallback != null) {
                            BleBluetooth.this.bleGattCallback.onConnectSuccess(BleBluetooth.this.bleDevice, BleBluetooth.this.bluetoothGatt, status3);
                            break;
                        }
                    }
                    break;
                case 7:
                    if (BleBluetooth.this.isActiveAttempt(message.arg1, "connect timeout")) {
                        LogUtils.i("Ble_Log", "connectDevice timeout attemptId: " + message.arg1);
                        BleBluetooth.this.disconnectGatt();
                        BleBluetooth.this.refreshDeviceCache();
                        BleBluetooth.this.closeBluetoothGatt();
                        if (BleBluetooth.this.connectRetryCount < BleManager.getInstance().getReConnectCount()) {
                            BleBluetooth.this.connectRetryCount++;
                            LogUtils.w("Ble_Log", "connectDevice " + ("{name: " + BleBluetooth.this.bleDevice.getName() + ", mac: " + BleBluetooth.this.bleDevice.getMac() + "}") + " timeout retry count: " + BleBluetooth.this.connectRetryCount + ", attemptId: " + message.arg1);
                            Message obtainMessage4 = BleBluetooth.this.mainHandler.obtainMessage();
                            obtainMessage4.what = 3;
                            obtainMessage4.arg1 = message.arg1;
                            BleBluetooth.this.mainHandler.sendMessageDelayed(obtainMessage4, 5000L);
                            break;
                        } else {
                            BleBluetooth.this.lastState = LastState.CONNECT_FAILURE;
                            BleManager.getInstance().getMultipleBluetoothController().removeConnectingBle(BleBluetooth.this);
                            if (BleBluetooth.this.bleGattCallback != null) {
                                BleBluetooth.this.bleGattCallback.onConnectFail(BleBluetooth.this.bleDevice, new TimeoutException());
                                break;
                            }
                        }
                    }
                    break;
                default:
                    super.handleMessage(message);
                    break;
            }
        }
    }
}
