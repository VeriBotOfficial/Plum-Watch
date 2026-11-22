package com.beken.iot.smartsdk.core.channel;

import android.os.NetworkOnMainThreadException;
import com.beken.iot.smartsdk.core.callback.OnStateChanged;
import com.beken.iot.smartsdk.core.callback.OnTransmissionReceiver;
import com.beken.iot.smartsdk.core.log.BKSmartLog;
import com.beken.iot.smartsdk.core.pack.TransmissionPacked;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

/* loaded from: classes13.dex */
public class TcpChannel {
    private static final int FIFO_SIZE = 2048;
    private static final String TAG = "TcpChannel";
    private String ip;
    private OnStateChanged onStateChanged;
    private OnTransmissionReceiver onTransmissionReceiver;
    private int port;
    private Socket tcpSocket = null;
    private final ArrayBlockingQueue<byte[]> writeQueue = new ArrayBlockingQueue<>(5000);
    private WriteThread mWriteThread = null;
    private ReadThread mReadThread = null;
    private InputStream tcpInputStream = null;
    private OutputStream tcpOutputStream = null;

    public TcpChannel(String str, int i, OnStateChanged onStateChanged, OnTransmissionReceiver onTransmissionReceiver) {
        this.ip = "192.168.0.1";
        this.port = 7150;
        this.ip = str;
        this.port = i;
        this.onStateChanged = onStateChanged;
        this.onTransmissionReceiver = onTransmissionReceiver;
    }

    public void stateChanged(int i, int i2) {
        printD("onStateChanged newState: " + i);
        OnStateChanged onStateChanged = this.onStateChanged;
        if (onStateChanged == null) {
            return;
        }
        onStateChanged.onStateChanged(i, i2);
    }

    public void connect() {
        ConnectThread connectThread = new ConnectThread();
        connectThread.start();
        stateChanged(1, 0);
        try {
            connectThread.join(500L);
        } catch (InterruptedException e) {
            stateChanged(0, 2);
            e.printStackTrace();
        }
    }

    public void write(TransmissionPacked transmissionPacked) {
        byte[] pack = transmissionPacked.pack();
        printD("write transmissionPacker: " + pack.length);
        write(pack);
    }

    public void write(byte[] bArr) {
        if (this.writeQueue.offer(bArr)) {
            return;
        }
        printD("Queue buffer full");
    }

    public int disconnect() {
        printD("close write thread +++");
        stateChanged(3, 0);
        InputStream inputStream = this.tcpInputStream;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.tcpInputStream = null;
        }
        OutputStream outputStream = this.tcpOutputStream;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            this.tcpOutputStream = null;
        }
        Socket socket = this.tcpSocket;
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
            this.tcpSocket = null;
        }
        WriteThread writeThread = this.mWriteThread;
        if (writeThread != null) {
            writeThread.close();
            this.mWriteThread.interrupt();
            try {
                this.mWriteThread.join(500L);
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            this.mWriteThread = null;
        }
        printD("close write thread ---");
        printD("close read thread +++");
        ReadThread readThread = this.mReadThread;
        if (readThread != null) {
            readThread.close();
            this.mReadThread.interrupt();
            try {
                this.mReadThread.join(500L);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            this.mReadThread = null;
        }
        this.writeQueue.clear();
        printD("close read thread ---");
        stateChanged(0, 0);
        return 0;
    }

    class ConnectThread extends Thread {
        boolean ret = false;

        ConnectThread() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            TcpChannel.this.stateChanged(1, 0);
            try {
                if (TcpChannel.this.tcpSocket == null) {
                    TcpChannel.this.printD("IP: " + TcpChannel.this.ip + " Port: " + TcpChannel.this.port);
                    TcpChannel.this.tcpSocket = new Socket(TcpChannel.this.ip, TcpChannel.this.port);
                    TcpChannel tcpChannel = TcpChannel.this;
                    tcpChannel.tcpInputStream = tcpChannel.tcpSocket.getInputStream();
                    TcpChannel tcpChannel2 = TcpChannel.this;
                    tcpChannel2.tcpOutputStream = tcpChannel2.tcpSocket.getOutputStream();
                }
                if (TcpChannel.this.mWriteThread == null) {
                    TcpChannel.this.mWriteThread = TcpChannel.this.new WriteThread();
                    TcpChannel.this.mWriteThread.start();
                }
                if (TcpChannel.this.mReadThread == null) {
                    TcpChannel.this.mReadThread = TcpChannel.this.new ReadThread();
                    TcpChannel.this.mReadThread.start();
                }
                this.ret = true;
            } catch (NetworkOnMainThreadException e) {
                e.printStackTrace();
            } catch (SocketException e2) {
                e2.printStackTrace();
            } catch (UnknownHostException e3) {
                e3.printStackTrace();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
            if (this.ret) {
                TcpChannel.this.stateChanged(2, 0);
            } else {
                TcpChannel.this.stateChanged(0, 2);
            }
        }
    }

    class WriteThread extends Thread {
        private boolean running = true;

        WriteThread() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            TcpChannel.this.printD("Start WriteThread");
            while (this.running) {
                try {
                    byte[] bArr = (byte[]) TcpChannel.this.writeQueue.take();
                    if (bArr == null) {
                        TcpChannel.this.printD("WriteThread unknown data");
                    } else {
                        TcpChannel.this.tcpOutputStream.write(bArr);
                        TcpChannel.this.printD("WriteThread send data complete");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            TcpChannel.this.writeQueue.clear();
            TcpChannel.this.stateChanged(0, 3);
            this.running = false;
        }

        public boolean isRunning() {
            return this.running;
        }

        public void close() {
            this.running = false;
        }
    }

    class ReadThread extends Thread {
        byte[] remain = new byte[0];
        private boolean running = true;

        ReadThread() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            TcpChannel.this.printD("Start ReadThread");
            while (this.running) {
                try {
                    byte[] bArr = new byte[2048];
                    int read = TcpChannel.this.tcpInputStream.read(bArr);
                    byte[] bArr2 = new byte[read];
                    System.arraycopy(bArr, 0, bArr2, 0, read);
                    onDataReceiver(bArr2);
                } catch (Exception e) {
                    e.printStackTrace();
                    TcpChannel.this.stateChanged(0, 3);
                }
            }
            this.running = false;
        }

        public void onDataReceiver(byte[] bArr) {
            if (TcpChannel.this.onTransmissionReceiver == null) {
                TcpChannel.this.printD("onTransmissionReceiver is null");
                return;
            }
            ArrayList arrayList = new ArrayList();
            this.remain = TransmissionUnpacked.unpack(arrayList, this.remain, bArr);
            for (int i = 0; i < arrayList.size(); i++) {
                TcpChannel.this.onTransmissionReceiver.onComplete((TransmissionUnpacked) arrayList.get(i));
            }
        }

        public boolean isRunning() {
            return this.running;
        }

        public void close() {
            this.running = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void printD(String str) {
        BKSmartLog.INSTANCE.d(TAG, str);
    }
}
