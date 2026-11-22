package com.sifli.siflicore.blecore.queue;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.iflytek.cloud.SpeechConstant;
import com.sifli.siflicore.blecore.actions.WriteAction;
import com.sifli.siflicore.blecore.queue.GBDevice;
import com.sifli.siflicore.log.SFLog;
import com.wakeup.module.device.work.BleFailStage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes14.dex */
public final class BtLEQueue {
    private static final String TAG = "BtLEQueue";
    private final InternalGattCallback internalGattCallback;
    private volatile boolean mAbortServerTransaction;
    private volatile boolean mAbortTransaction;
    private boolean mAutoReconnect;
    private final BluetoothAdapter mBluetoothAdapter;
    private BluetoothGatt mBluetoothGatt;
    private BluetoothGattServer mBluetoothGattServer;
    private CountDownLatch mConnectionLatch;
    private final Context mContext;
    private volatile boolean mCrashed;
    private volatile boolean mDisposed;
    private final GBDevice mGbDevice;
    private final Set<BluetoothGattService> mSupportedServerServices;
    private BluetoothGattCharacteristic mWaitCharacteristic;
    private CountDownLatch mWaitForActionResultLatch;
    private CountDownLatch mWaitForServerActionResultLatch;
    private boolean scanReconnect;
    private final Object mGattMonitor = new Object();
    private final BlockingQueue<AbstractTransaction> mTransactions = new LinkedBlockingQueue();
    private volatile boolean mPauseTransaction = false;
    private boolean mImplicitGattCallbackModify = true;
    private boolean mSendWriteRequestResponse = false;
    private Thread dispatchThread = new Thread("Gadgetbridge GATT Dispatcher") { // from class: com.sifli.siflicore.blecore.queue.BtLEQueue.1
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(-2);
            while (!BtLEQueue.this.mDisposed && !BtLEQueue.this.mCrashed) {
                try {
                    try {
                        AbstractTransaction abstractTransaction = (AbstractTransaction) BtLEQueue.this.mTransactions.take();
                        if (!BtLEQueue.this.isConnected()) {
                            BtLEQueue.this.internalGattCallback.reset();
                            BtLEQueue.this.mConnectionLatch = new CountDownLatch(1);
                            BtLEQueue.this.mConnectionLatch.await();
                            BtLEQueue.this.mConnectionLatch = null;
                        }
                        if (abstractTransaction instanceof Transaction) {
                            Transaction transaction = (Transaction) abstractTransaction;
                            if (BtLEQueue.this.mImplicitGattCallbackModify || transaction.isModifyGattCallback()) {
                                BtLEQueue.this.internalGattCallback.setTransactionGattCallback(transaction.getGattCallback());
                            }
                            BtLEQueue.this.mAbortTransaction = false;
                            Iterator<BtLEAction> it = transaction.getActions().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    BtLEAction next = it.next();
                                    if (!BtLEQueue.this.mAbortTransaction) {
                                        while ((next instanceof WriteAction) && BtLEQueue.this.mPauseTransaction && !BtLEQueue.this.mAbortTransaction) {
                                            try {
                                                Thread.sleep(100L);
                                            } catch (Exception unused) {
                                            }
                                        }
                                        BtLEQueue.this.mWaitCharacteristic = next.getCharacteristic();
                                        BtLEQueue.this.mWaitForActionResultLatch = new CountDownLatch(1);
                                        if (!next.run(BtLEQueue.this.mBluetoothGatt)) {
                                            BtLEQueue.this.internalGattCallback.onWriteFail();
                                            break;
                                        } else if (next.expectsResult()) {
                                            BtLEQueue.this.mWaitForActionResultLatch.await();
                                            BtLEQueue.this.mWaitForActionResultLatch = null;
                                            if (BtLEQueue.this.mAbortTransaction) {
                                                break;
                                            }
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                        }
                    } finally {
                        BtLEQueue.this.mWaitForActionResultLatch = null;
                        BtLEQueue.this.mWaitCharacteristic = null;
                    }
                } catch (InterruptedException unused2) {
                    BtLEQueue.this.mConnectionLatch = null;
                } catch (Throwable unused3) {
                    BtLEQueue.this.mCrashed = true;
                    BtLEQueue.this.mConnectionLatch = null;
                }
            }
        }
    };

    public void abortNextTransaction() {
        this.mTransactions.clear();
    }

    public BtLEQueue(BluetoothAdapter bluetoothAdapter, GBDevice gBDevice, GattCallback gattCallback, Context context, Set<BluetoothGattService> set) {
        this.mBluetoothAdapter = bluetoothAdapter;
        this.mGbDevice = gBDevice;
        this.internalGattCallback = new InternalGattCallback(gattCallback);
        this.mContext = context;
        this.mSupportedServerServices = set;
        this.dispatchThread.start();
    }

    public void setAutoReconnect(boolean z) {
        this.mAutoReconnect = z;
    }

    public void setScanReconnect(boolean z) {
        this.scanReconnect = z;
    }

    public void setImplicitGattCallbackModify(boolean z) {
        this.mImplicitGattCallbackModify = z;
    }

    public void setSendWriteRequestResponse(boolean z) {
        this.mSendWriteRequestResponse = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isConnected() {
        return this.mGbDevice.isConnected();
    }

    public boolean connect() {
        BluetoothGatt connectGatt;
        SFLog.i(TAG, BleFailStage.CONNECT);
        this.mPauseTransaction = false;
        if (isConnected()) {
            return false;
        }
        synchronized (this.mGattMonitor) {
            if (this.mBluetoothGatt != null) {
                disconnect();
            }
        }
        this.mBluetoothAdapter.cancelDiscovery();
        BluetoothDevice remoteDevice = this.mBluetoothAdapter.getRemoteDevice(this.mGbDevice.getAddress());
        if (!this.mSupportedServerServices.isEmpty()) {
            if (((BluetoothManager) this.mContext.getSystemService(SpeechConstant.BLUETOOTH)) == null) {
                return false;
            }
            Iterator<BluetoothGattService> it = this.mSupportedServerServices.iterator();
            while (it.hasNext()) {
                this.mBluetoothGattServer.addService(it.next());
            }
        }
        synchronized (this.mGattMonitor) {
            connectGatt = remoteDevice.connectGatt(this.mContext, false, this.internalGattCallback, 2, 3);
            this.mBluetoothGatt = connectGatt;
        }
        boolean z = connectGatt != null;
        if (z) {
            setDeviceConnectionState(GBDevice.State.CONNECTING);
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceConnectionState(final GBDevice.State state) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.sifli.siflicore.blecore.queue.BtLEQueue$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                BtLEQueue.this.m8368xb65e552a(state);
            }
        });
    }

    /* renamed from: lambda$setDeviceConnectionState$0$com-sifli-siflicore-blecore-queue-BtLEQueue, reason: not valid java name */
    /* synthetic */ void m8368xb65e552a(GBDevice.State state) {
        this.mGbDevice.setState(state);
    }

    public void disconnect() {
        SFLog.i(TAG, "disconnect");
        synchronized (this.mGattMonitor) {
            BluetoothGatt bluetoothGatt = this.mBluetoothGatt;
            if (bluetoothGatt != null) {
                this.mBluetoothGatt = null;
                bluetoothGatt.disconnect();
                bluetoothGatt.close();
                setDeviceConnectionState(GBDevice.State.NOT_CONNECTED);
            }
            this.mPauseTransaction = false;
            BluetoothGattServer bluetoothGattServer = this.mBluetoothGattServer;
            if (bluetoothGattServer != null) {
                this.mBluetoothGattServer = null;
                bluetoothGattServer.clearServices();
                bluetoothGattServer.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleDisconnected(int i) {
        SFLog.i(TAG, "handleDisconnected %d", Integer.valueOf(i));
        this.internalGattCallback.reset();
        this.mTransactions.clear();
        this.mPauseTransaction = false;
        this.mAbortTransaction = true;
        this.mAbortServerTransaction = true;
        CountDownLatch countDownLatch = this.mWaitForActionResultLatch;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        CountDownLatch countDownLatch2 = this.mWaitForServerActionResultLatch;
        if (countDownLatch2 != null) {
            countDownLatch2.countDown();
        }
        setDeviceConnectionState(GBDevice.State.NOT_CONNECTED);
        if (this.mBluetoothGatt == null || maybeReconnect()) {
            return;
        }
        disconnect();
    }

    private boolean maybeReconnect() {
        BluetoothGatt bluetoothGatt;
        if (!this.mAutoReconnect || (bluetoothGatt = this.mBluetoothGatt) == null) {
            return false;
        }
        if (this.scanReconnect) {
            setDeviceConnectionState(GBDevice.State.WAITING_FOR_SCAN);
            return true;
        }
        boolean connect = bluetoothGatt.connect();
        this.mPauseTransaction = false;
        if (connect) {
            setDeviceConnectionState(GBDevice.State.WAITING_FOR_RECONNECT);
        }
        return connect;
    }

    public void setPaused(boolean z) {
        this.mPauseTransaction = z;
    }

    public void dispose() {
        SFLog.i(TAG, "dispose");
        if (this.mDisposed) {
            return;
        }
        this.mDisposed = true;
        disconnect();
        try {
            Thread thread = this.dispatchThread;
            this.dispatchThread = null;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            SFLog.i(TAG, "dispatchThread is alive,interrupt it");
            thread.interrupt();
        } catch (Exception e) {
            SFLog.e(TAG, "Thread interrupt failed " + e.toString());
        }
    }

    public void add(Transaction transaction) {
        if (transaction.isEmpty()) {
            return;
        }
        this.mTransactions.add(transaction);
    }

    public void abortCurrentTransaction() {
        this.mAbortTransaction = true;
        CountDownLatch countDownLatch = this.mWaitForActionResultLatch;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public void insert(Transaction transaction) {
        if (transaction.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.mTransactions.size() + 2);
        arrayList.addAll(this.mTransactions);
        this.mTransactions.clear();
        this.mTransactions.add(transaction);
        this.mTransactions.addAll(arrayList);
    }

    public void clear() {
        this.mTransactions.clear();
    }

    public List<BluetoothGattService> getSupportedGattServices() {
        BluetoothGatt bluetoothGatt = this.mBluetoothGatt;
        if (bluetoothGatt == null) {
            return Collections.emptyList();
        }
        return bluetoothGatt.getServices();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkCorrectGattInstance(BluetoothGatt bluetoothGatt, String str) {
        BluetoothGatt bluetoothGatt2 = this.mBluetoothGatt;
        return bluetoothGatt == bluetoothGatt2 || bluetoothGatt2 == null;
    }

    private boolean checkCorrectBluetoothDevice(BluetoothDevice bluetoothDevice) {
        return bluetoothDevice.getAddress().equals(this.mGbDevice.getAddress());
    }

    private final class InternalGattCallback extends BluetoothGattCallback {
        private final GattCallback mExternalGattCallback;
        private GattCallback mTransactionGattCallback;

        public InternalGattCallback(GattCallback gattCallback) {
            this.mExternalGattCallback = gattCallback;
        }

        public void setTransactionGattCallback(GattCallback gattCallback) {
            this.mTransactionGattCallback = gattCallback;
        }

        public void onWriteFail() {
            if (getCallbackToUse() != null) {
                getCallbackToUse().onWriteFail();
            }
        }

        private GattCallback getCallbackToUse() {
            GattCallback gattCallback = this.mTransactionGattCallback;
            return gattCallback != null ? gattCallback : this.mExternalGattCallback;
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            SFLog.i(BtLEQueue.TAG, "onConnectionStateChange status=%d,newState=%d", Integer.valueOf(i), Integer.valueOf(i2));
            synchronized (BtLEQueue.this.mGattMonitor) {
                if (BtLEQueue.this.mBluetoothGatt == null) {
                    BtLEQueue.this.mBluetoothGatt = bluetoothGatt;
                }
            }
            if (BtLEQueue.this.checkCorrectGattInstance(bluetoothGatt, "connection state event")) {
                if (i2 == 0) {
                    BtLEQueue.this.handleDisconnected(i);
                } else if (i2 == 1) {
                    BtLEQueue.this.setDeviceConnectionState(GBDevice.State.CONNECTING);
                } else if (i2 == 2) {
                    BtLEQueue.this.setDeviceConnectionState(GBDevice.State.CONNECTED);
                    List<BluetoothGattService> services = bluetoothGatt.getServices();
                    if (services != null && !services.isEmpty()) {
                        onServicesDiscovered(bluetoothGatt, 0);
                    } else {
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.sifli.siflicore.blecore.queue.BtLEQueue.InternalGattCallback.1
                            @Override // java.lang.Runnable
                            public void run() {
                                SFLog.i(BtLEQueue.TAG, "onConnectionStateChange ready discoverServices...");
                                if (BtLEQueue.this.mBluetoothGatt != null) {
                                    SFLog.i(BtLEQueue.TAG, "discoverServices...");
                                    BtLEQueue.this.mBluetoothGatt.discoverServices();
                                }
                            }
                        });
                    }
                }
                GattCallback gattCallback = this.mExternalGattCallback;
                if (gattCallback != null) {
                    gattCallback.onConnectionStateChange(bluetoothGatt, i, i2);
                }
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            SFLog.i(BtLEQueue.TAG, "onServicesDiscovered status=%d", Integer.valueOf(i));
            if (BtLEQueue.this.checkCorrectGattInstance(bluetoothGatt, "services discovered: " + getStatusString(i)) && i == 0) {
                if (getCallbackToUse() != null) {
                    getCallbackToUse().onServicesDiscovered(bluetoothGatt);
                }
                if (BtLEQueue.this.mConnectionLatch != null) {
                    BtLEQueue.this.mConnectionLatch.countDown();
                }
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            if (BtLEQueue.this.checkCorrectGattInstance(bluetoothGatt, "characteristic write")) {
                if (getCallbackToUse() != null) {
                    getCallbackToUse().onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i);
                }
                checkWaitingCharacteristic(bluetoothGattCharacteristic, i);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
            super.onMtuChanged(bluetoothGatt, i, i2);
            SFLog.i(BtLEQueue.TAG, "onMtuChanged mtu=%d,status=%d", Integer.valueOf(i), Integer.valueOf(i2));
            if (getCallbackToUse() != null) {
                getCallbackToUse().onMtuChanged(bluetoothGatt, i, i2);
            }
            if (BtLEQueue.this.mWaitForActionResultLatch != null) {
                BtLEQueue.this.mWaitForActionResultLatch.countDown();
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            if (BtLEQueue.this.checkCorrectGattInstance(bluetoothGatt, "characteristic read")) {
                if (getCallbackToUse() != null) {
                    try {
                        getCallbackToUse().onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i);
                    } catch (Throwable unused) {
                    }
                }
                checkWaitingCharacteristic(bluetoothGattCharacteristic, i);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            if (BtLEQueue.this.checkCorrectGattInstance(bluetoothGatt, "descriptor read")) {
                if (getCallbackToUse() != null) {
                    try {
                        getCallbackToUse().onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i);
                    } catch (Throwable unused) {
                    }
                }
                checkWaitingCharacteristic(bluetoothGattDescriptor.getCharacteristic(), i);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            if (BtLEQueue.this.checkCorrectGattInstance(bluetoothGatt, "descriptor write")) {
                if (getCallbackToUse() != null) {
                    try {
                        getCallbackToUse().onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
                    } catch (Throwable unused) {
                    }
                }
                checkWaitingCharacteristic(bluetoothGattDescriptor.getCharacteristic(), i);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            if (BtLEQueue.this.checkCorrectGattInstance(bluetoothGatt, "characteristic changed") && getCallbackToUse() != null) {
                try {
                    getCallbackToUse().onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
                } catch (Throwable unused) {
                }
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i, int i2) {
            if (BtLEQueue.this.checkCorrectGattInstance(bluetoothGatt, "remote rssi") && getCallbackToUse() != null) {
                try {
                    getCallbackToUse().onReadRemoteRssi(bluetoothGatt, i, i2);
                } catch (Throwable unused) {
                }
            }
        }

        private void checkWaitingCharacteristic(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            if (i != 0) {
                BtLEQueue.this.mAbortTransaction = true;
            }
            if (bluetoothGattCharacteristic == null || BtLEQueue.this.mWaitCharacteristic == null || !bluetoothGattCharacteristic.getUuid().equals(BtLEQueue.this.mWaitCharacteristic.getUuid())) {
                BluetoothGattCharacteristic unused = BtLEQueue.this.mWaitCharacteristic;
            } else if (BtLEQueue.this.mWaitForActionResultLatch != null) {
                BtLEQueue.this.mWaitForActionResultLatch.countDown();
            }
        }

        private String getStatusString(int i) {
            return i == 0 ? " (success)" : " (failed: " + i + Separators.RPAREN;
        }

        public void reset() {
            this.mTransactionGattCallback = null;
        }
    }
}
