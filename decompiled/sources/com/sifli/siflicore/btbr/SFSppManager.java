package com.sifli.siflicore.btbr;

import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothSocket;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.gov.nist.core.Separators;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.sifli.siflicore.blecore.SFCountDownTimer;
import com.sifli.siflicore.blecore.queue.GBDevice;
import com.sifli.siflicore.btbr.actions.PlainAction;
import com.sifli.siflicore.btbr.actions.WriteAction;
import com.sifli.siflicore.error.SFError;
import com.sifli.siflicore.log.SFLog;
import com.sifli.siflicore.util.ByteUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

/* loaded from: classes14.dex */
public class SFSppManager implements SFCountDownTimer.SFCountDownTimerCallback, SocketCallback {
    private static final int SPP_BUFFER_SIZE = 8192;
    private static final UUID SPP_UUID = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");
    private static final String TAG = "SFSppManager";
    private static SFSppManager mInstance;
    private BluetoothAdapter bluetoothAdapter;
    private Context mContext;
    private GBDevice mGBDevice;
    private Handler mHandler;
    private BtBRQueue mQueue;
    private SFSppManagerCallback managerCallback;
    private final Object mLock = new Object();
    private final BroadcastReceiver mBluetoothConnectionReceiver = new BroadcastReceiver() { // from class: com.sifli.siflicore.btbr.SFSppManager.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (bluetoothDevice != null) {
                if ("android.bluetooth.device.action.ACL_CONNECTED".equals(action)) {
                    SFLog.i(SFSppManager.TAG, "蓝牙设备已连接：" + bluetoothDevice.getName() + " MAC：" + bluetoothDevice.getAddress());
                    return;
                }
                if ("android.bluetooth.device.action.ACL_DISCONNECTED".equals(action)) {
                    SFLog.i(SFSppManager.TAG, "蓝牙设备已断开：" + bluetoothDevice.getName() + " MAC：" + bluetoothDevice.getAddress());
                    if (SFSppManager.this.mGBDevice == null || !SFSppManager.this.mGBDevice.getAddress().equals(bluetoothDevice.getAddress())) {
                        return;
                    }
                    SFSppManager.this.countDownTimer.stopTimer();
                    SFSppManager.this.mGBDevice.setState(GBDevice.State.NOT_CONNECTED);
                    SFSppManager.this.disconnect();
                    if (SFSppManager.this.managerCallback != null) {
                        SFSppManager.this.managerCallback.onDeviceDisconnected(new SFError(2, "广播监听 蓝牙断开了"));
                    }
                }
            }
        }
    };
    private SFCountDownTimer countDownTimer = new SFCountDownTimer(this, TAG);

    public static SFSppManager getInstance() {
        if (mInstance == null) {
            mInstance = new SFSppManager();
        }
        return mInstance;
    }

    public void setManagerCallback(SFSppManagerCallback sFSppManagerCallback) {
        this.managerCallback = sFSppManagerCallback;
    }

    public void init(Application application) {
        this.mContext = application;
        this.mHandler = new Handler(Looper.getMainLooper());
        this.bluetoothAdapter = ((BluetoothManager) application.getSystemService(BluetoothManager.class)).getAdapter();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        application.registerReceiver(this.mBluetoothConnectionReceiver, intentFilter);
    }

    public boolean isBtEnable() {
        return this.bluetoothAdapter.isEnabled();
    }

    public void connectToMAC(String str) {
        SFSppManager sFSppManager;
        SFLog.i(TAG, "connectToMAC %s", str);
        if (this.mGBDevice != null) {
            SFLog.e(TAG, "exist old mGBDevice,disconnect it");
            disconnect();
            waitFor(1000L);
        }
        try {
            this.mGBDevice = new GBDevice(str);
            sFSppManager = this;
        } catch (Exception e) {
            e = e;
            sFSppManager = this;
        }
        try {
            sFSppManager.mQueue = new BtBRQueue(this.bluetoothAdapter, this.mGBDevice, this.mContext, sFSppManager, SPP_UUID, 8192);
            sFSppManager.countDownTimer.startTimer(25);
            sFSppManager.mQueue.connect();
        } catch (Exception e2) {
            e = e2;
            Exception exc = e;
            exc.printStackTrace();
            SFLog.e(TAG, "connectToMAC error.ex=" + exc.toString());
            SFError sFError = new SFError(3, "连接失败,请检查蓝牙权限和错误信息", exc.toString());
            sFSppManager.countDownTimer.stopTimer();
            SFSppManagerCallback sFSppManagerCallback = sFSppManager.managerCallback;
            if (sFSppManagerCallback != null) {
                sFSppManagerCallback.onDeviceConnectFail(sFError);
            }
        }
    }

    public void disconnect() {
        Log.i(TAG, "disconnect");
        if (this.mGBDevice != null) {
            this.mGBDevice = null;
        }
        BtBRQueue btBRQueue = this.mQueue;
        if (btBRQueue != null) {
            btBRQueue.dispose();
            this.mQueue = null;
        }
    }

    public boolean getIsHandShake() {
        BtBRQueue btBRQueue;
        GBDevice gBDevice = this.mGBDevice;
        return gBDevice != null && gBDevice.isConnected() && (btBRQueue = this.mQueue) != null && btBRQueue.isConnected();
    }

    public void writeListData(ArrayList<byte[]> arrayList) {
        if (arrayList == null) {
            SFError sFError = new SFError(19, "list is null");
            SFSppManagerCallback sFSppManagerCallback = this.managerCallback;
            if (sFSppManagerCallback != null) {
                sFSppManagerCallback.onWriteFail(sFError);
                return;
            }
            return;
        }
        SFLog.i(TAG, "writeListData %d", Integer.valueOf(arrayList.size()));
        if (this.mQueue == null) {
            SFError sFError2 = new SFError(19, "设备写入队列未建立，可能未连接");
            SFSppManagerCallback sFSppManagerCallback2 = this.managerCallback;
            if (sFSppManagerCallback2 != null) {
                sFSppManagerCallback2.onWriteFail(sFError2);
                return;
            }
            return;
        }
        GBDevice gBDevice = this.mGBDevice;
        if (gBDevice == null || gBDevice.getState() != GBDevice.State.CONNECTED) {
            SFError sFError3 = new SFError(19, "设备未进入连接状态");
            SFSppManagerCallback sFSppManagerCallback3 = this.managerCallback;
            if (sFSppManagerCallback3 != null) {
                sFSppManagerCallback3.onWriteFail(sFError3);
                return;
            }
            return;
        }
        Transaction transaction = new Transaction("spp send data");
        Iterator<byte[]> it = arrayList.iterator();
        while (it.hasNext()) {
            transaction.add(new WriteAction(it.next()));
        }
        transaction.add(new PlainAction() { // from class: com.sifli.siflicore.btbr.SFSppManager.2
            @Override // com.sifli.siflicore.btbr.BtBRAction
            public boolean run(BluetoothSocket bluetoothSocket) {
                if (SFSppManager.this.managerCallback == null) {
                    return true;
                }
                SFSppManager.this.managerCallback.onWriteListDataDone();
                return true;
            }
        });
        this.mQueue.add(transaction);
    }

    protected void waitFor(long j) {
        synchronized (this.mLock) {
            try {
                SFLog.i(TAG, "wait(" + j + Separators.RPAREN);
                this.mLock.wait(j);
                SFLog.i(TAG, "wait end");
            } catch (InterruptedException unused) {
                SFLog.e(TAG, "Sleeping interrupted");
            }
        }
    }

    @Override // com.sifli.siflicore.blecore.SFCountDownTimer.SFCountDownTimerCallback
    public void onTimeOut() {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        if (this.managerCallback != null) {
            this.managerCallback.onDeviceConnectFail(new SFError(18, "蓝牙连接超时"));
        }
    }

    @Override // com.sifli.siflicore.btbr.SocketCallback
    public void onConnectionEstablished() {
        this.countDownTimer.stopTimer();
        SFSppManagerCallback sFSppManagerCallback = this.managerCallback;
        if (sFSppManagerCallback != null) {
            sFSppManagerCallback.onDeviceConnected(this.mGBDevice.getAddress());
        }
    }

    @Override // com.sifli.siflicore.btbr.SocketCallback
    public void onConnectionFail(SFError sFError) {
        this.countDownTimer.stopTimer();
        SFSppManagerCallback sFSppManagerCallback = this.managerCallback;
        if (sFSppManagerCallback != null) {
            sFSppManagerCallback.onDeviceConnectFail(sFError);
        }
    }

    @Override // com.sifli.siflicore.btbr.SocketCallback
    public void onSocketRead(byte[] bArr) {
        SFLog.i(TAG, "onSocketRead:%s", ByteUtil.hexSummary(bArr));
        SFSppManagerCallback sFSppManagerCallback = this.managerCallback;
        if (sFSppManagerCallback != null) {
            sFSppManagerCallback.onNotifyData(bArr);
        }
    }

    @Override // com.sifli.siflicore.btbr.SocketCallback
    public void onReadFail(SFError sFError) {
        SFLog.e(TAG, "onReadFail %s", sFError);
        disconnect();
        SFSppManagerCallback sFSppManagerCallback = this.managerCallback;
        if (sFSppManagerCallback != null) {
            sFSppManagerCallback.onWriteFail(sFError);
        }
    }

    @Override // com.sifli.siflicore.btbr.SocketCallback
    public void onWriteFail(SFError sFError) {
        SFLog.e(TAG, "onWriteFail %s", sFError);
        disconnect();
        SFSppManagerCallback sFSppManagerCallback = this.managerCallback;
        if (sFSppManagerCallback != null) {
            sFSppManagerCallback.onWriteFail(sFError);
        }
    }
}
