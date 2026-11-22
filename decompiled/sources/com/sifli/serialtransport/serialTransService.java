package com.sifli.serialtransport;

import android.app.Service;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.ActivityCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.hjq.permissions.Permission;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.UUID;

/* loaded from: classes12.dex */
public class serialTransService extends Service {
    public static final String BROADCAST_SERIAL_TRANS = "Sifli.serialTrans.broadcast.BROADCAST_SERIAL_TRANS";
    public static final int ERROR_BLUETOOTH_OFF = 108;
    public static final int ERROR_CONNECTION_STATE = 105;
    public static final int ERROR_DISCOVERY = 106;
    public static final int ERROR_DISCOVERY_TIMEOUT = 102;
    public static final int ERROR_SERVICE_DISCOVERY_NOT_STARTED = 107;
    public static final int ERROR_TIME_OUT = 101;
    public static final int ERROR_WRITE_CCCD_ERROR = 133;
    public static final int ERROR_WRITE_CCCD_TIMEOUT = 103;
    public static final int ERROR_WRITE_COMMAND_TIMEOUT = 104;
    public static final int ERROR_WRITE_FAIL = 100;
    public static final String EXTRA_DEVICE_ADDRESS = "Sifli.serialTrans.EXTRA_DEVICE_ADDRESS";
    public static final String EXTRA_SERIAL_TRANS_MSG = "Sifli.serialTrans.broadcast.EXTRA_SERIAL_TRANS_MSG";
    public static final String EXTRA_SERIAL_TRANS_STATUS = "Sifli.serialTrans.broadcast.EXTRA_SERIAL_TRANS_STATUS";
    private static final int MESSAGE_TYPE_DATA = 1;
    private static final int MESSAGE_TYPE_NORMAL = 0;
    private static final int MTU_MAX = 247;
    private static final int MTU_MIN = 23;
    public static final int SEND_NO_ERROR = 0;
    public static final int SERIAL_BLE_CONNECT_FAIL = 132;
    public static final int SERIAL_BLE_CONNECT_SUCCESS = 131;
    public static final int SERIAL_BLE_DISCONNECT = 130;
    private static final int SERIAL_FLAG_COMPLETE = 0;
    private static final int SERIAL_FLAG_CONTINUE = 2;
    private static final int SERIAL_FLAG_FIRST = 1;
    private static final int SERIAL_FLAG_LAST = 3;
    private static final int SERIAL_HEADER_LEN = 4;
    public static final int SERIAL_MISS_HEADER = 121;
    public static final int SERIAL_OVER_LENGTH = 120;
    private static final String SERIAL_TRAM_CONFIGURE = "00000000-0000-0100-6473-5f696c666973";
    public static final String SERIAL_TRAM_DATA = "00000000-0000-0200-6473-5f696c666973";
    private static final String SERIAL_TRAM_SERVICE = "00000000-0000-0000-6473-5f696c666973";
    private static final int SIFLI_DFU_WRITE_CCCD_TIMEOUT = 7000;
    private static final int SIFLI_DISCOVERY_TIMEOUT = 40000;
    public static final int SIFLI_ERROR_PERMISSIONS = 112;
    public static final int SIFLI_GATT_CONNECT_FAIL = 111;
    public static final int SIFLI_GATT_DISCOVERY_FAILED = 109;
    public static final int SIFLI_GATT_DISCOVERY_NOT_FOUND = 110;
    private static final int SIFLI_WRITE_TIMEOUT = 5000;
    protected static final int STATE_CLOSED = 5;
    protected static final int STATE_CONNECTED = 2;
    protected static final int STATE_CONNECTED_AND_READY = 3;
    protected static final int STATE_CONNECTING = 1;
    protected static final int STATE_DISCONNECTED = 0;
    protected static final int STATE_DISCONNECTING = 4;
    private static final String TAG = "sifli-serial";
    public static final String UUID_CCC = "00002902-0000-1000-8000-00805f9b34fb";
    private static boolean mShouldUpdate = true;
    String deviceAddress;
    boolean isServiceSearch;
    private serialTransBinder mBinder;
    private Handler mBleHandler;
    private BluetoothAdapter mBluetoothAdapter;
    private BluetoothDevice mBluetoothDevice;
    private BluetoothGatt mBluetoothGatt;
    protected int mConnectionState;
    private int mConnectionStatus;
    private int mCurrentMtu;
    private int mError;
    private boolean mIsDescriptorWrite;
    private int mMessageSendLen;
    private int mMessageTotalLen;
    private boolean mSendAvailable;
    private int mSerialIndex;
    private int mSerialLen;
    private int mTotalLen;
    private BluetoothGattCharacteristic mWriteCharacteristic;
    private OnSerialTransListener onSerialTransListener;
    private boolean debugProgress = false;
    private final Object mLock = new Object();
    private int currentLenMax = 0;
    private Handler mTimerHandler = new Handler();
    private byte[] mSerialData = new byte[0];
    private final ByteOrder order = ByteOrder.LITTLE_ENDIAN;
    private final String BLE_DATA = "Sifli.serial.BLE_DATA";
    private String VersionStr = "1.2.19D";
    ArrayList<String> MTUIssueArrayList = new ArrayList<>();
    private BluetoothGattCallback mGattCallback = new BluetoothGattCallback() { // from class: com.sifli.serialtransport.serialTransService.1
        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            super.onConnectionStateChange(bluetoothGatt, i, i2);
            Log.d(serialTransService.TAG, "serial onConnectionStateChange status " + i + ", newState " + i2);
            Log.d(serialTransService.TAG, "serial state " + serialTransService.this.mConnectionState);
            if (i2 == 2) {
                serialTransService.this.mConnectionState = 2;
                serialTransService.this.waitFor(500L);
                if (Build.VERSION.SDK_INT >= 31 && ActivityCompat.checkSelfPermission(serialTransService.this, Permission.BLUETOOTH_CONNECT) != 0) {
                    Log.e(serialTransService.TAG, "no Permission");
                    serialTransService.this.mError = 112;
                    synchronized (serialTransService.this.mLock) {
                        serialTransService.this.mLock.notifyAll();
                    }
                    return;
                }
                bluetoothGatt.requestMtu(247);
                if (serialTransService.mShouldUpdate) {
                    Log.i(serialTransService.TAG, "wait more after mtu change");
                    serialTransService.this.waitFor(1500L);
                    bluetoothGatt.requestConnectionPriority(1);
                    serialTransService.this.waitFor(500L);
                    bluetoothGatt.setPreferredPhy(2, 2, 0);
                }
                serialTransService.this.waitFor(1000L);
                Log.i(serialTransService.TAG, "Connected to GATT server.");
            } else if (i2 == 0) {
                Log.d(serialTransService.TAG, "Bluetooth disconnect with: " + i + ", new state: " + i2);
                serialTransService.this.mError = 105;
                serialTransService.this.mConnectionStatus = i;
                serialTransService.this.mConnectionState = 0;
                serialTransService.this.onSerialTransListener.onSerialTransSend(130);
                serialTransService.this.onSerialTransListener.onSerialTransBLEStateChanged(0);
            }
            synchronized (serialTransService.this.mLock) {
                serialTransService.this.mLock.notifyAll();
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
            Log.d(serialTransService.TAG, "status " + i2 + ", mtu " + i);
            serialTransService.this.mCurrentMtu = i;
            String str = Build.MODEL;
            if (str.length() > 3) {
                str = str.substring(0, 3);
            }
            if (serialTransService.this.MTUIssueArrayList.contains(str)) {
                Log.w(serialTransService.TAG, "mtu issue " + str);
                serialTransService.this.mCurrentMtu = 23;
                serialTransService serialtransservice = serialTransService.this;
                serialtransservice.currentLenMax = serialtransservice.mCurrentMtu - 3;
            } else if (i > 247) {
                serialTransService.this.currentLenMax = 244;
            } else {
                serialTransService.this.currentLenMax = i - 3;
            }
            serialTransService.this.onSerialTransListener.onSerialMTUChangeResult(i);
            if (serialTransService.this.isServiceSearch) {
                return;
            }
            serialTransService.this.isServiceSearch = true;
            if (Build.VERSION.SDK_INT >= 31 && ActivityCompat.checkSelfPermission(serialTransService.this, Permission.BLUETOOTH_CONNECT) != 0) {
                Log.e(serialTransService.TAG, "no Permission");
                serialTransService.this.mError = 112;
                synchronized (serialTransService.this.mLock) {
                    serialTransService.this.mLock.notifyAll();
                }
                return;
            }
            bluetoothGatt.discoverServices();
            serialTransService.this.mTimerHandler.postDelayed(serialTransService.this.mDiscoveryTimerRunnable, 40000L);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            Log.i(serialTransService.TAG, "onDescriptorWrite");
            serialTransService.this.mIsDescriptorWrite = true;
            synchronized (serialTransService.this.mLock) {
                serialTransService.this.mLock.notifyAll();
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            if (i != 0) {
                Log.e(serialTransService.TAG, "Write fail: " + i);
                serialTransService.this.mError = i;
            }
            serialTransService.this.mSendAvailable = true;
            synchronized (serialTransService.this.mLock) {
                serialTransService.this.mLock.notifyAll();
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            if (bluetoothGattCharacteristic.getUuid().toString().equals("00000000-0000-0200-6473-5f696c666973")) {
                byte[] value = bluetoothGattCharacteristic.getValue();
                byte b = value[0];
                byte b2 = value[1];
                if (b2 == 0) {
                    int shortFromByteArray = serialTransService.this.getShortFromByteArray(value, 2);
                    byte[] bArr = new byte[shortFromByteArray];
                    System.arraycopy(value, 4, bArr, 0, shortFromByteArray);
                    serialTransService.this.onSerialTransListener.onSerialDataReceive(b, bArr);
                    return;
                }
                if (b2 == 1) {
                    int shortFromByteArray2 = serialTransService.this.getShortFromByteArray(value, 2);
                    serialTransService.this.mSerialLen = shortFromByteArray2;
                    serialTransService.this.mSerialIndex = 0;
                    serialTransService.this.mSerialData = new byte[shortFromByteArray2];
                    int length = value.length - 4;
                    System.arraycopy(value, 4, serialTransService.this.mSerialData, serialTransService.this.mSerialIndex, length);
                    serialTransService.access$2612(serialTransService.this, length);
                    return;
                }
                if (b2 != 2) {
                    if (b2 == 3) {
                        int length2 = value.length - 2;
                        if (serialTransService.this.mSerialIndex + length2 == serialTransService.this.mSerialLen) {
                            System.arraycopy(value, 2, serialTransService.this.mSerialData, serialTransService.this.mSerialIndex, length2);
                            serialTransService.access$2612(serialTransService.this, length2);
                            serialTransService.this.onSerialTransListener.onSerialDataReceive(b, serialTransService.this.mSerialData);
                            return;
                        } else {
                            Log.e(serialTransService.TAG, "last packet len error, dataLen: " + length2 + ", serial index: " + serialTransService.this.mSerialIndex + ", serial len: " + serialTransService.this.mSerialLen);
                            serialTransService.this.onSerialTransListener.onSerialTransSend(120);
                            return;
                        }
                    }
                    return;
                }
                int length3 = value.length - 2;
                if (serialTransService.this.mSerialLen != 0) {
                    if (serialTransService.this.mSerialIndex + length3 <= serialTransService.this.mSerialLen) {
                        System.arraycopy(value, 2, serialTransService.this.mSerialData, serialTransService.this.mSerialIndex, length3);
                        serialTransService.access$2612(serialTransService.this, length3);
                        return;
                    } else {
                        Log.e(serialTransService.TAG, "continue packet len error, dataLen: " + length3 + ", serial index: " + serialTransService.this.mSerialIndex + ", serial len: " + serialTransService.this.mSerialLen);
                        serialTransService.this.onSerialTransListener.onSerialTransSend(120);
                        return;
                    }
                }
                Log.e(serialTransService.TAG, "not receive first packet!");
                serialTransService.this.onSerialTransListener.onSerialTransSend(121);
                return;
            }
            Log.d(serialTransService.TAG, "other notify");
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            serialTransService.this.mTimerHandler.removeCallbacks(serialTransService.this.mDiscoveryTimerRunnable);
            int i2 = 0;
            if (i == 0) {
                Log.d(serialTransService.TAG, "onServicesDiscovered");
                int i3 = 0;
                while (i2 < bluetoothGatt.getServices().size()) {
                    for (BluetoothGattCharacteristic bluetoothGattCharacteristic : bluetoothGatt.getServices().get(i2).getCharacteristics()) {
                        Log.e(serialTransService.TAG, "find uuid: " + bluetoothGattCharacteristic.getUuid().toString() + ", expect: 00000000-0000-0200-6473-5f696c666973");
                        if (bluetoothGattCharacteristic.getUuid().toString().equals("00000000-0000-0200-6473-5f696c666973")) {
                            Log.i(serialTransService.TAG, "find serial trans UUID");
                            serialTransService.this.mWriteCharacteristic = bluetoothGattCharacteristic;
                            serialTransService.this.mConnectionState = 3;
                            i3 = 1;
                        }
                    }
                    i2++;
                }
                i2 = i3;
            } else {
                Log.w(serialTransService.TAG, "onServicesDiscovered received: " + i);
                serialTransService.this.mError = 106;
                serialTransService.this.mConnectionStatus = i;
                serialTransService.this.sendSerialTransBroadcast(109, i);
            }
            if (i2 == 0) {
                Log.e(serialTransService.TAG, "fail to find target uuid");
                serialTransService.this.sendSerialTransBroadcast(110);
                serialTransService.this.mConnectionState = 4;
            }
            synchronized (serialTransService.this.mLock) {
                serialTransService.this.mLock.notifyAll();
            }
        }
    };
    private final Runnable mDiscoveryTimerRunnable = new Runnable() { // from class: com.sifli.serialtransport.serialTransService.2
        @Override // java.lang.Runnable
        public void run() {
            Log.e(serialTransService.TAG, "discovery timeout");
            serialTransService.this.mError = 102;
            synchronized (serialTransService.this.mLock) {
                serialTransService.this.mLock.notifyAll();
            }
        }
    };
    private final Runnable mSendTimerRunnable = new Runnable() { // from class: com.sifli.serialtransport.serialTransService.3
        @Override // java.lang.Runnable
        public void run() {
            Log.e(serialTransService.TAG, "write time out");
            serialTransService.this.mError = 104;
            synchronized (serialTransService.this.mLock) {
                serialTransService.this.mLock.notifyAll();
            }
        }
    };
    private final Runnable mWriteDescriptorTimerRunnable = new Runnable() { // from class: com.sifli.serialtransport.serialTransService.4
        @Override // java.lang.Runnable
        public void run() {
            Log.e(serialTransService.TAG, "write descriptor timeout");
            serialTransService.this.mError = 103;
            synchronized (serialTransService.this.mLock) {
                serialTransService.this.mLock.notifyAll();
            }
        }
    };

    static /* synthetic */ int access$2612(serialTransService serialtransservice, int i) {
        int i2 = serialtransservice.mSerialIndex + i;
        serialtransservice.mSerialIndex = i2;
        return i2;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "version " + this.VersionStr);
        mShouldUpdate = true;
        this.mBinder = new serialTransBinder();
        this.MTUIssueArrayList.clear();
        this.MTUIssueArrayList.add("V23");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        Log.d(TAG, "onStartCommand");
        if (intent == null) {
            return 2;
        }
        this.deviceAddress = intent.getStringExtra(EXTRA_DEVICE_ADDRESS);
        this.mCurrentMtu = 23;
        this.isServiceSearch = false;
        HandlerThread handlerThread = new HandlerThread("BleWrite");
        handlerThread.start();
        this.mBleHandler = new Handler(handlerThread.getLooper(), new bleHandlerCallback());
        return 2;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        BluetoothGatt bluetoothGatt = this.mBluetoothGatt;
        if (bluetoothGatt != null) {
            close(bluetoothGatt);
        }
        Log.d(TAG, "on destroy");
        this.mTimerHandler.removeCallbacks(this.mDiscoveryTimerRunnable);
        this.mTimerHandler.removeCallbacks(this.mSendTimerRunnable);
        this.mTimerHandler.removeCallbacks(this.mWriteDescriptorTimerRunnable);
    }

    public void setOnSerialTransListener(OnSerialTransListener onSerialTransListener) {
        this.onSerialTransListener = onSerialTransListener;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        serialTransBinder serialtransbinder = this.mBinder;
        if (serialtransbinder != null) {
            return serialtransbinder;
        }
        return null;
    }

    public class Binder extends android.os.Binder {
        public Binder() {
        }

        public serialTransService getService() {
            return serialTransService.this;
        }
    }

    public class serialTransBinder extends Binder {
        public serialTransBinder() {
            super();
        }

        public void serialTransSend(byte[] bArr, int i) {
            serialTransService.this.sendToSerial(bArr, bArr.length, i, 0);
        }

        public void serialTransSendProgress(byte[] bArr, int i) {
            serialTransService.this.sendToSerial(bArr, bArr.length, i, 1);
        }

        public void serialTransSendBlank() {
            int i = serialTransService.this.currentLenMax - 4;
            serialTransService.this.sendToSerial(new byte[i], i, 0, 0);
        }

        public void doTask() {
            Log.e(serialTransService.TAG, "do task");
            serialTransService.this.onSerialTransListener.onSerialTransSend(0);
        }

        public void serialTransDebugProgress() {
            serialTransService.this.debugProgress = true;
        }

        public void serialTransSetMtu(int i) {
            Log.i(serialTransService.TAG, "serialTransSetMtu " + i);
            if (i < 23) {
                i = 23;
            }
            serialTransService.this.currentLenMax = i - 3;
        }

        public void connectBluetoothWithUpdate(Boolean bool) {
            boolean unused = serialTransService.mShouldUpdate = bool.booleanValue();
            connectBluetooth();
        }

        /* JADX WARN: Code restructure failed: missing block: B:96:0x01f0, code lost:
        
            if (r11.this$0.mError == 0) goto L87;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void connectBluetooth() {
            /*
                Method dump skipped, instructions count: 513
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sifli.serialtransport.serialTransService.serialTransBinder.connectBluetooth():void");
        }

        public void updateConnectionHigh() {
            if (serialTransService.this.mConnectionState == 2 && serialTransService.this.mConnectionState == 3) {
                BluetoothGatt unused = serialTransService.this.mBluetoothGatt;
            } else {
                Log.w(serialTransService.TAG, "connection state error");
            }
        }
    }

    void sendToBleHandler(byte[] bArr, int i) {
        Message message = new Message();
        message.what = i;
        Bundle bundle = new Bundle();
        bundle.putByteArray("Sifli.serial.BLE_DATA", bArr);
        message.setData(bundle);
        this.mBleHandler.sendMessage(message);
    }

    class bleHandlerCallback implements Handler.Callback {
        bleHandlerCallback() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int length;
            int i = message.what;
            if (i == 0 || i == 1) {
                byte[] byteArray = message.getData().getByteArray("Sifli.serial.BLE_DATA");
                if (serialTransService.this.mWriteCharacteristic == null) {
                    return false;
                }
                byte b = byteArray[1];
                if (b == 0 || b == 1) {
                    length = byteArray.length - 4;
                } else {
                    length = byteArray.length - 2;
                }
                if (serialTransService.this.debugProgress) {
                    Log.d(serialTransService.TAG, "message type " + message.what);
                }
                if (message.what == 1) {
                    serialTransService.this.onSerialTransListener.onSerialTransProgress(length);
                }
                serialTransService.this.mWriteCharacteristic.setValue(byteArray);
                serialTransService.this.mWriteCharacteristic.setWriteType(1);
                serialTransService.this.mSendAvailable = false;
                if (serialTransService.this.mBluetoothGatt == null) {
                    return false;
                }
                if (Build.VERSION.SDK_INT < 31 || ActivityCompat.checkSelfPermission(serialTransService.this, Permission.BLUETOOTH_CONNECT) == 0) {
                    serialTransService.this.mBluetoothGatt.writeCharacteristic(serialTransService.this.mWriteCharacteristic);
                    serialTransService.this.mTimerHandler.postDelayed(serialTransService.this.mSendTimerRunnable, 5000L);
                    synchronized (serialTransService.this.mLock) {
                        while (!serialTransService.this.mSendAvailable && serialTransService.this.mError == 0) {
                            try {
                                serialTransService.this.mLock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        serialTransService.this.mTimerHandler.removeCallbacks(serialTransService.this.mSendTimerRunnable);
                    }
                    serialTransService.this.onSerialTransListener.onSerialTransSend(serialTransService.this.mError);
                } else {
                    Log.e(serialTransService.TAG, "no Permission");
                    serialTransService.this.mError = 112;
                    synchronized (serialTransService.this.mLock) {
                        serialTransService.this.mLock.notifyAll();
                    }
                    return false;
                }
            }
            if (!serialTransService.this.mBleHandler.hasMessages(0) && !serialTransService.this.mBleHandler.hasMessages(1)) {
                serialTransService.this.onSerialTransListener.onSerialTranSendFinish();
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendToSerial(byte[] bArr, int i, int i2, int i3) {
        this.mMessageTotalLen = i;
        this.mMessageSendLen = 0;
        int i4 = this.mCurrentMtu;
        int i5 = i4 - 3;
        if (i4 > 247) {
            i5 = 244;
        }
        int i6 = this.currentLenMax;
        if (i6 != 0 && i5 > i6) {
            i5 = i6;
        }
        int i7 = i + 4;
        if (i7 > 65535) {
            Log.e(TAG, "serial length over");
            return;
        }
        if (i7 <= i5) {
            byte[] bArr2 = new byte[i7];
            bArr2[0] = (byte) i2;
            bArr2[1] = 0;
            byte[] addShortToByteArray = addShortToByteArray(i, bArr2, 2);
            System.arraycopy(bArr, 0, addShortToByteArray, 4, i);
            sendToBleHandler(addShortToByteArray, i3);
            return;
        }
        byte[] bArr3 = new byte[i5];
        byte b = (byte) i2;
        bArr3[0] = b;
        bArr3[1] = 1;
        byte[] addShortToByteArray2 = addShortToByteArray(i, bArr3, 2);
        int i8 = i5 - 4;
        System.arraycopy(bArr, 0, addShortToByteArray2, 4, i8);
        sendToBleHandler(addShortToByteArray2, i3);
        while (i8 < i) {
            int i9 = i - i8;
            int i10 = i5 - 2;
            if (i9 > i10) {
                byte[] bArr4 = new byte[i5];
                bArr4[0] = b;
                bArr4[1] = 2;
                System.arraycopy(bArr, i8, bArr4, 2, i10);
                i8 += i10;
                sendToBleHandler(bArr4, i3);
            } else {
                byte[] bArr5 = new byte[i9 + 2];
                bArr5[0] = b;
                bArr5[1] = 3;
                System.arraycopy(bArr, i8, bArr5, 2, i9);
                sendToBleHandler(bArr5, i3);
                i8 = i;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int writeCCCD(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (Build.VERSION.SDK_INT >= 31 && ActivityCompat.checkSelfPermission(this, Permission.BLUETOOTH_CONNECT) != 0) {
            Log.e(TAG, "no Permission");
            this.mError = 112;
            synchronized (this.mLock) {
                this.mLock.notifyAll();
            }
            return 1;
        }
        if (bluetoothGattCharacteristic == null) {
            Log.e(TAG, "writeCCCD gattCharacteristic null");
            return 1;
        }
        bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, true);
        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(UUID.fromString("00002902-0000-1000-8000-00805f9b34fb"));
        if (descriptor == null) {
            Log.e(TAG, "desc null!!!");
            return 1;
        }
        this.mIsDescriptorWrite = false;
        descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
        Log.d(TAG, "Write descriptor");
        this.mTimerHandler.postDelayed(this.mWriteDescriptorTimerRunnable, 7000L);
        if (bluetoothGatt.writeDescriptor(descriptor)) {
            return 0;
        }
        this.mTimerHandler.removeCallbacks(this.mWriteDescriptorTimerRunnable);
        Log.e(TAG, "writeDescriptor fail");
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int writeCCCDDisable(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (Build.VERSION.SDK_INT >= 31 && ActivityCompat.checkSelfPermission(this, Permission.BLUETOOTH_CONNECT) != 0) {
            Log.e(TAG, "no Permission");
            this.mError = 112;
            synchronized (this.mLock) {
                this.mLock.notifyAll();
            }
            return 1;
        }
        bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, false);
        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(UUID.fromString("00002902-0000-1000-8000-00805f9b34fb"));
        if (descriptor == null) {
            Log.e(TAG, "desc null!!!");
            return 1;
        }
        this.mIsDescriptorWrite = false;
        descriptor.setValue(BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
        Log.d(TAG, "Write descriptor disable");
        this.mTimerHandler.postDelayed(this.mWriteDescriptorTimerRunnable, 7000L);
        if (bluetoothGatt.writeDescriptor(descriptor)) {
            return 0;
        }
        this.mTimerHandler.removeCallbacks(this.mWriteDescriptorTimerRunnable);
        Log.e(TAG, "writeDescriptor fail");
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean checkBluetoothAddr(String str) {
        if (str == null || str.length() != 17) {
            return false;
        }
        for (int i = 0; i < 17; i++) {
            char charAt = str.charAt(i);
            int i2 = i % 3;
            if (i2 == 0 || i2 == 1) {
                if ((charAt < '0' || charAt > '9') && (charAt < 'A' || charAt > 'F')) {
                    return false;
                }
            } else if (i2 == 2 && charAt != ':') {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean connectDevice(String str, BluetoothGattCallback bluetoothGattCallback) {
        this.mBluetoothDevice = this.mBluetoothAdapter.getRemoteDevice(str);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.mBluetoothGatt = connect(this.mBluetoothDevice, bluetoothGattCallback);
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        int i = this.mError;
        if (i > 0) {
            int i2 = this.mConnectionStatus;
            if (i == 105) {
                Log.i(TAG, "Connection error after: " + (elapsedRealtime2 - elapsedRealtime) + " ms");
                if (i2 == 133 && elapsedRealtime2 > elapsedRealtime + 25000) {
                    Log.e(TAG, "Device not reachable. Check if the device with address " + str + " is in range, is advertising and is connectable");
                } else {
                    Log.e(TAG, "An error occurred while connecting to the device:" + i2);
                }
            } else if (i == 107) {
                Log.e(TAG, "error discovery not start");
            } else if (i == 102) {
                Log.e(TAG, "discovery time out");
            } else {
                Log.e(TAG, "An error occurred during discovering services:" + i2);
            }
            terminateConnection(this.mBluetoothGatt);
            return false;
        }
        if (this.mConnectionState != 0) {
            return true;
        }
        this.mError = 105;
        Log.e(TAG, "Disconnect due to state disconnect");
        terminateConnection(this.mBluetoothGatt);
        return false;
    }

    private BluetoothGatt connect(BluetoothDevice bluetoothDevice, BluetoothGattCallback bluetoothGattCallback) {
        if (!this.mBluetoothAdapter.isEnabled()) {
            return null;
        }
        this.mConnectionState = 1;
        Log.i(TAG, "connecting to " + bluetoothDevice);
        if (Build.VERSION.SDK_INT >= 31 && ActivityCompat.checkSelfPermission(this, Permission.BLUETOOTH_CONNECT) != 0) {
            Log.e(TAG, "no Permission");
            this.mError = 112;
            synchronized (this.mLock) {
                this.mLock.notifyAll();
            }
            return null;
        }
        Log.d(TAG, "gatt = device.connectGatt(autoConnect = false, TRANSPORT_LE, preferredPhy = LE_1M | LE_2M)");
        BluetoothGatt connectGatt = this.mBluetoothDevice.connectGatt(this, false, bluetoothGattCallback, 2, 3);
        try {
            synchronized (this.mLock) {
                while (true) {
                    int i = this.mConnectionState;
                    if ((i == 1 || i == 2) && this.mError == 0) {
                        this.mLock.wait();
                    }
                }
            }
            return connectGatt;
        } catch (InterruptedException unused) {
            Log.e(TAG, "Sleeping interrupted");
            return connectGatt;
        }
    }

    protected void refreshDeviceCache(BluetoothGatt bluetoothGatt) {
        try {
            Log.i(TAG, "Refreshing result: " + ((Boolean) bluetoothGatt.getClass().getMethod("refresh", new Class[0]).invoke(bluetoothGatt, new Object[0])).booleanValue());
        } catch (Exception e) {
            Log.e(TAG, "An exception occurred while refreshing device", e);
        }
    }

    protected void close(BluetoothGatt bluetoothGatt) {
        if (bluetoothGatt == null) {
            return;
        }
        if (mShouldUpdate) {
            if (bluetoothGatt != null && Build.VERSION.SDK_INT >= 31 && ActivityCompat.checkSelfPermission(this, Permission.BLUETOOTH_CONNECT) != 0) {
                Log.e(TAG, "no Permission");
                this.mError = 112;
                synchronized (this.mLock) {
                    this.mLock.notifyAll();
                }
                return;
            }
            bluetoothGatt.requestConnectionPriority(2);
        }
        Log.d(TAG, "Cleaning up...");
        Log.d(TAG, "gatt.disconnect()");
        bluetoothGatt.disconnect();
        Log.d(TAG, "gatt.close()");
        bluetoothGatt.close();
        this.mConnectionState = 5;
    }

    protected void disconnect(BluetoothGatt bluetoothGatt) {
        if (this.mConnectionState == 0) {
            return;
        }
        Log.d(TAG, "Disconnecting");
        this.mConnectionState = 4;
        if (Build.VERSION.SDK_INT >= 31 && ActivityCompat.checkSelfPermission(this, Permission.BLUETOOTH_CONNECT) != 0) {
            Log.e(TAG, "no Permission");
            this.mError = 112;
            synchronized (this.mLock) {
                this.mLock.notifyAll();
            }
            return;
        }
        bluetoothGatt.disconnect();
        waitUntilDisconnected();
    }

    protected void waitUntilDisconnected() {
        try {
            synchronized (this.mLock) {
                while (this.mConnectionState != 0) {
                    this.mLock.wait();
                }
            }
        } catch (InterruptedException unused) {
            Log.e(TAG, "Sleeping interrupted");
        }
    }

    protected void terminateConnection(BluetoothGatt bluetoothGatt) {
        if (this.mConnectionState != 0) {
            disconnect(bluetoothGatt);
        }
        close(bluetoothGatt);
        waitFor(600L);
    }

    protected void waitFor(long j) {
        synchronized (this.mLock) {
            try {
                Log.d(TAG, "wait(" + j + Separators.RPAREN);
                this.mLock.wait(j);
            } catch (InterruptedException unused) {
                Log.e(TAG, "Sleeping interrupted");
            }
        }
    }

    void sendSerialTransBroadcast(int i) {
        Intent intent = new Intent(BROADCAST_SERIAL_TRANS);
        intent.putExtra(EXTRA_SERIAL_TRANS_MSG, i);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    void sendSerialTransBroadcast(int i, int i2) {
        Intent intent = new Intent(BROADCAST_SERIAL_TRANS);
        intent.putExtra(EXTRA_SERIAL_TRANS_MSG, i);
        intent.putExtra(EXTRA_SERIAL_TRANS_STATUS, i2);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    private byte[] addShortToByteArray(int i, byte[] bArr, int i2) {
        System.arraycopy(ByteBuffer.allocate(2).order(this.order).putShort((short) i).array(), 0, bArr, i2, 2);
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getShortFromByteArray(byte[] bArr, int i) {
        byte[] bArr2 = new byte[2];
        System.arraycopy(bArr, i, bArr2, 0, 2);
        return ByteBuffer.wrap(bArr2, 0, 2).order(this.order).getShort();
    }
}
