package com.sifli.siflicore.btbr;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.sifli.siflicore.blecore.queue.GBDevice;
import com.sifli.siflicore.error.SFError;
import com.sifli.siflicore.log.SFLog;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes14.dex */
public final class BtBRQueue {
    public static final int HANDLER_SUBJECT_CONNECT = 0;
    public static final int HANDLER_SUBJECT_PERFORM_TRANSACTION = 1;
    public static final char[] HEX_CHARS = "0123456789ABCDEF".toCharArray();
    private static final String TAG = "BtBRQueue";
    private BluetoothAdapter mBtAdapter;
    private BluetoothSocket mBtSocket = null;
    private final int mBufferSize;
    private final SocketCallback mCallback;
    private final Context mContext;
    private volatile boolean mDisposed;
    private final GBDevice mGbDevice;
    private final UUID mService;
    private final Handler mWriteHandler;
    private final HandlerThread mWriteHandlerThread;
    private Thread readThread;

    public static String hexdump(byte[] bArr, int i, int i2) {
        if (i2 == -1) {
            i2 = bArr.length - i;
        }
        char[] cArr = new char[i2 * 2];
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = bArr[i3 + i];
            int i4 = i3 * 2;
            char[] cArr2 = HEX_CHARS;
            cArr[i4] = cArr2[(b & 255) >>> 4];
            cArr[i4 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public static String hexdump(byte[] bArr) {
        return hexdump(bArr, 0, bArr.length);
    }

    public BtBRQueue(BluetoothAdapter bluetoothAdapter, GBDevice gBDevice, Context context, SocketCallback socketCallback, UUID uuid, int i) {
        this.mBtAdapter = null;
        HandlerThread handlerThread = new HandlerThread("Write Thread", 10);
        this.mWriteHandlerThread = handlerThread;
        this.readThread = new Thread("Read Thread") { // from class: com.sifli.siflicore.btbr.BtBRQueue.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                byte[] bArr = new byte[BtBRQueue.this.mBufferSize];
                SFLog.d(BtBRQueue.TAG, "Read thread started, entering loop");
                while (!BtBRQueue.this.mDisposed) {
                    try {
                        if (BtBRQueue.this.mBtSocket.getInputStream() != null) {
                            int read = BtBRQueue.this.mBtSocket.getInputStream().read(bArr);
                            if (read == -1) {
                                throw new IOException("End of stream");
                            }
                            SFLog.d(BtBRQueue.TAG, "Received {} bytes: {}", Integer.valueOf(read), BtBRQueue.hexdump(bArr, 0, read));
                            try {
                                BtBRQueue.this.mCallback.onSocketRead(Arrays.copyOf(bArr, read));
                            } catch (Throwable th) {
                                th.printStackTrace();
                                SFLog.e(BtBRQueue.TAG, "Failed to process received bytes in onSocketRead callback: %s", th.toString());
                            }
                        }
                    } catch (IOException e) {
                        if (!BtBRQueue.this.mDisposed) {
                            e.printStackTrace();
                            SFLog.e(BtBRQueue.TAG, "IO exception while reading message from socket, breaking out of read thread: %s", e.toString());
                            BtBRQueue.this.onReadFail(new SFError(21, "SPP 读取失败"));
                        } else {
                            SFLog.w(BtBRQueue.TAG, "IO exception while reading message from socket,BTBRQueue has been disposed.ignore.%s", e.getMessage());
                        }
                    }
                }
                SFLog.d(BtBRQueue.TAG, "Exited read thread loop, disconnecting");
                BtBRQueue.this.mGbDevice.setState(GBDevice.State.NOT_CONNECTED);
            }
        };
        this.mBtAdapter = bluetoothAdapter;
        this.mGbDevice = gBDevice;
        this.mContext = context;
        this.mCallback = socketCallback;
        this.mService = uuid;
        this.mBufferSize = i;
        handlerThread.start();
        SFLog.d(TAG, "Write handler thread is prepared, creating write handler");
        this.mWriteHandler = new Handler(handlerThread.getLooper()) { // from class: com.sifli.siflicore.btbr.BtBRQueue.2
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i2 = message.what;
                if (i2 == 0) {
                    try {
                        BtBRQueue.this.mBtSocket.connect();
                        SFLog.i(BtBRQueue.TAG, "Connected to RFCOMM socket for {}", BtBRQueue.this.mGbDevice.getAddress());
                        BtBRQueue.this.setDeviceConnectionState(GBDevice.State.CONNECTED);
                        BtBRQueue.this.readThread.setName(String.format(Locale.ENGLISH, "Read Thread for %s", BtBRQueue.this.mGbDevice.getAddress()));
                        BtBRQueue.this.mWriteHandlerThread.setName(String.format(Locale.ENGLISH, "Write Thread for %s", BtBRQueue.this.mGbDevice.getAddress()));
                        BtBRQueue.this.readThread.start();
                        BtBRQueue.this.onConnectionEstablished();
                        return;
                    } catch (IOException e) {
                        SFError sFError = new SFError(20, "create spp socket io fail." + e.getMessage());
                        SFLog.e(BtBRQueue.TAG, "IO exception while establishing socket connection: %s", e);
                        BtBRQueue.this.setDeviceConnectionState(GBDevice.State.NOT_CONNECTED);
                        BtBRQueue.this.onConnectionFail(sFError);
                        return;
                    } catch (SecurityException e2) {
                        SFError sFError2 = new SFError(20, "create spp socket SecurityException fail." + e2.getMessage());
                        SFLog.e(BtBRQueue.TAG, "Security exception while establishing socket connection: %s", e2);
                        BtBRQueue.this.setDeviceConnectionState(GBDevice.State.NOT_CONNECTED);
                        BtBRQueue.this.onConnectionFail(sFError2);
                        return;
                    }
                }
                if (i2 == 1) {
                    try {
                        if (!BtBRQueue.this.isConnected()) {
                            SFLog.d(BtBRQueue.TAG, "Not connected, updating device state to WAITING_FOR_RECONNECT");
                            BtBRQueue.this.setDeviceConnectionState(GBDevice.State.WAITING_FOR_RECONNECT);
                            return;
                        } else {
                            if (!(message.obj instanceof Transaction)) {
                                SFLog.e(BtBRQueue.TAG, "msg.obj is not an instance of Transaction");
                                return;
                            }
                            Iterator<BtBRAction> it = ((Transaction) message.obj).getActions().iterator();
                            while (it.hasNext()) {
                                if (!it.next().run(BtBRQueue.this.mBtSocket)) {
                                    SFLog.e(BtBRQueue.TAG, "Action returned false, cancelling further actions in transaction");
                                    BtBRQueue.this.onWriteFail(new SFError(19, "写入失败"));
                                    return;
                                }
                            }
                            return;
                        }
                    } catch (Throwable th) {
                        SFLog.e(BtBRQueue.TAG, "IO Write Thread died: " + th.getMessage(), th);
                        return;
                    }
                }
                SFLog.w(BtBRQueue.TAG, "Unhandled write handler message {}", Integer.valueOf(message.what));
            }
        };
    }

    public boolean connect() {
        if (isConnected()) {
            SFLog.w(TAG, "Ignoring connect() because already connected.");
            return false;
        }
        SFLog.i(TAG, "Attempting to connect to ({})", this.mGbDevice.getAddress());
        this.mBtAdapter.cancelDiscovery();
        GBDevice.State state = this.mGbDevice.getState();
        setDeviceConnectionState(GBDevice.State.CONNECTING);
        try {
            this.mBtSocket = this.mBtAdapter.getRemoteDevice(this.mGbDevice.getAddress()).createRfcommSocketToServiceRecord(this.mService);
            SFLog.d(TAG, "Socket created, connecting in handler");
            Handler handler = this.mWriteHandler;
            handler.sendMessageAtFrontOfQueue(handler.obtainMessage(0));
            return true;
        } catch (IOException e) {
            SFLog.e(TAG, "Unable to connect to RFCOMM endpoint: ", e);
            setDeviceConnectionState(state);
            this.mBtSocket = null;
            return false;
        }
    }

    protected void onConnectionEstablished() {
        this.mCallback.onConnectionEstablished();
    }

    protected void onConnectionFail(SFError sFError) {
        this.mCallback.onConnectionFail(sFError);
    }

    protected void onReadFail(SFError sFError) {
        if (this.mDisposed) {
            return;
        }
        this.mCallback.onReadFail(sFError);
    }

    protected void onWriteFail(SFError sFError) {
        if (this.mDisposed) {
            return;
        }
        this.mCallback.onWriteFail(sFError);
    }

    public void disconnect() {
        if (this.mWriteHandlerThread.isAlive()) {
            this.mWriteHandlerThread.quit();
        }
        BluetoothSocket bluetoothSocket = this.mBtSocket;
        if (bluetoothSocket != null && bluetoothSocket.isConnected()) {
            try {
                this.mBtSocket.close();
            } catch (IOException e) {
                SFLog.e(TAG, "IO exception while closing socket in disconnect(): ", e);
            }
        }
        this.mBtSocket = null;
        setDeviceConnectionState(GBDevice.State.NOT_CONNECTED);
    }

    public boolean isConnected() {
        BluetoothSocket bluetoothSocket;
        return this.mGbDevice.isConnected() && (bluetoothSocket = this.mBtSocket) != null && bluetoothSocket.isConnected();
    }

    public void add(Transaction transaction) {
        SFLog.d(TAG, "Adding transaction to looper message queue: {}", transaction);
        if (transaction.isEmpty()) {
            return;
        }
        this.mWriteHandler.obtainMessage(1, transaction).sendToTarget();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceConnectionState(GBDevice.State state) {
        SFLog.d(TAG, "New device connection state: " + state);
        this.mGbDevice.setState(state);
    }

    public void dispose() {
        SFLog.i(TAG, "dispose");
        if (this.mDisposed) {
            return;
        }
        this.mDisposed = true;
        disconnect();
        Thread thread = this.readThread;
        if (thread == null || !thread.isAlive()) {
            return;
        }
        this.readThread.interrupt();
        this.readThread = null;
    }
}
