package com.beken.iot.smartsdk.core.channel;

import com.beken.iot.smartsdk.core.callback.OnEventReceiver;
import com.beken.iot.smartsdk.core.callback.OnNotifyReceiver;
import com.beken.iot.smartsdk.core.callback.OnStateChanged;
import com.beken.iot.smartsdk.core.callback.OnTimeout;
import com.beken.iot.smartsdk.core.log.BKSmartLog;
import com.beken.iot.smartsdk.core.pack.CommandTransferConst;
import com.beken.iot.smartsdk.core.pack.EventTransferConst;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

/* loaded from: classes13.dex */
public class CmdTcpChannel {
    private static final int FIFO_SIZE = 2048;
    private static final String TAG = "CmdTcpChannel";
    private String ip;
    private OnStateChanged onStateChanged;
    private int port;
    private final ArrayBlockingQueue<CommandTransferConst> writeQueue = new ArrayBlockingQueue<>(5000);
    private final List<CommandTransferConst> ackList = new ArrayList();
    private Socket tcpSocket = null;
    private WriteThread mWriteThread = null;
    private ReadThread mReadThread = null;
    private InputStream tcpInputStream = null;
    private OutputStream tcpOutputStream = null;
    public OnTimeout onTimeout = new OnTimeout() { // from class: com.beken.iot.smartsdk.core.channel.CmdTcpChannel.1
        @Override // com.beken.iot.smartsdk.core.callback.OnTimeout
        public void onTimeout() {
            CmdTcpChannel.printD("cmd timeout");
            CmdTcpChannel.this.stateChanged(0, 3);
        }
    };
    private OnNotifyReceiver onNotifyReceiver = null;

    public CmdTcpChannel(String str, int i, OnStateChanged onStateChanged) {
        this.ip = "192.168.0.1";
        this.port = 7150;
        this.onStateChanged = null;
        this.ip = str;
        this.port = i;
        this.onStateChanged = onStateChanged;
    }

    public void stateChanged(int i, int i2) {
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

    public void write(CommandTransferConst commandTransferConst) {
        if (this.writeQueue.offer(commandTransferConst)) {
            return;
        }
        printD("Queue buffer full");
    }

    public CommandTransferConst getAckCmd(int i) {
        for (int i2 = 0; i2 < this.ackList.size(); i2++) {
            CommandTransferConst commandTransferConst = this.ackList.get(i2);
            if (commandTransferConst.getOpcode() == i) {
                return commandTransferConst;
            }
        }
        return null;
    }

    public void RemoveAckCmd(CommandTransferConst commandTransferConst) {
        this.ackList.remove(commandTransferConst);
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
        this.ackList.clear();
        printD("close read thread ---");
        stateChanged(0, 0);
        return 0;
    }

    public void keepAlive(final int i) {
        CommandTransferConst commandTransferConst = new CommandTransferConst(2, i, null);
        commandTransferConst.setOnEventComplete(new OnEventReceiver() { // from class: com.beken.iot.smartsdk.core.channel.CmdTcpChannel.2
            @Override // com.beken.iot.smartsdk.core.callback.OnEventReceiver
            public void onComplete(CommandTransferConst commandTransferConst2) {
                if (commandTransferConst2.getEventStatus() != 0) {
                    CmdTcpChannel.printD("keep alive set failed, error: " + commandTransferConst2.getEventStatus());
                    return;
                }
                CmdTcpChannel.printD("keep alive set success");
                if (CmdTcpChannel.this.tcpSocket == null) {
                    CmdTcpChannel.printD("tcpSocket is null");
                    return;
                }
                try {
                    CmdTcpChannel.printD("set timeout: " + (i * 2));
                    CmdTcpChannel.this.tcpSocket.setSoTimeout(i * 2);
                } catch (SocketException e) {
                    e.printStackTrace();
                }
            }
        });
        write(commandTransferConst);
    }

    public void setOnNotifyReceiver(OnNotifyReceiver onNotifyReceiver) {
        this.onNotifyReceiver = onNotifyReceiver;
    }

    class ConnectThread extends Thread {
        boolean ret = false;

        ConnectThread() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            CmdTcpChannel.this.stateChanged(1, 0);
            try {
                if (CmdTcpChannel.this.tcpSocket == null) {
                    for (int i = 0; i < 10; i++) {
                        CmdTcpChannel.printD("IP: " + CmdTcpChannel.this.ip + " Port: " + CmdTcpChannel.this.port + " Index: " + i);
                        try {
                            CmdTcpChannel.this.tcpSocket = new Socket(CmdTcpChannel.this.ip, CmdTcpChannel.this.port);
                            break;
                        } catch (Exception e) {
                            CmdTcpChannel.printD(e.getMessage());
                        }
                    }
                    CmdTcpChannel cmdTcpChannel = CmdTcpChannel.this;
                    cmdTcpChannel.tcpInputStream = cmdTcpChannel.tcpSocket.getInputStream();
                    CmdTcpChannel cmdTcpChannel2 = CmdTcpChannel.this;
                    cmdTcpChannel2.tcpOutputStream = cmdTcpChannel2.tcpSocket.getOutputStream();
                }
                if (CmdTcpChannel.this.mWriteThread == null) {
                    CmdTcpChannel.this.mWriteThread = CmdTcpChannel.this.new WriteThread();
                    CmdTcpChannel.this.mWriteThread.start();
                }
                if (CmdTcpChannel.this.mReadThread == null) {
                    CmdTcpChannel.this.mReadThread = CmdTcpChannel.this.new ReadThread();
                    CmdTcpChannel.this.mReadThread.start();
                }
                this.ret = true;
            } catch (Exception e2) {
                CmdTcpChannel.printD(e2.getMessage());
            }
            if (this.ret) {
                CmdTcpChannel.this.stateChanged(2, 0);
            } else {
                CmdTcpChannel.this.stateChanged(0, 2);
            }
        }
    }

    class WriteThread extends Thread {
        private boolean running = true;

        WriteThread() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            CmdTcpChannel.printD("Start WriteThread");
            while (this.running) {
                try {
                    CommandTransferConst commandTransferConst = (CommandTransferConst) CmdTcpChannel.this.writeQueue.take();
                    byte[] pack = commandTransferConst.pack();
                    if (pack == null) {
                        CmdTcpChannel.printD("WriteThread unknown data");
                    } else {
                        CmdTcpChannel.printD("WriteThread: " + pack.length + " opcode: " + commandTransferConst.getOpcode());
                        CmdTcpChannel.this.ackList.add(commandTransferConst);
                        CmdTcpChannel.printD("write +++");
                        CmdTcpChannel.this.tcpOutputStream.write(pack);
                        commandTransferConst.startTimeout(CmdTcpChannel.this.onTimeout);
                        CmdTcpChannel.printD("write ---");
                        CmdTcpChannel.printD("WriteThread send data complete");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            CmdTcpChannel.this.writeQueue.clear();
            CmdTcpChannel.this.ackList.clear();
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
        private boolean running = true;
        private byte[] remain = new byte[0];

        ReadThread() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            CmdTcpChannel.printD("Start ReadThread");
            while (this.running) {
                try {
                    byte[] bArr = new byte[2048];
                    int read = CmdTcpChannel.this.tcpInputStream.read(bArr);
                    CmdTcpChannel.printD("GET SIZE: " + read);
                    byte[] bArr2 = new byte[read];
                    System.arraycopy(bArr, 0, bArr2, 0, read);
                    eventDataHandle(bArr2);
                } catch (Exception e) {
                    e.printStackTrace();
                    CmdTcpChannel.this.stateChanged(0, 3);
                }
            }
            this.running = false;
        }

        public boolean isRunning() {
            return this.running;
        }

        public void eventDataHandle(byte[] bArr) {
            ArrayList arrayList = new ArrayList();
            this.remain = EventTransferConst.unpackEvt(arrayList, this.remain, bArr);
            for (int i = 0; i < arrayList.size(); i++) {
                EventTransferConst eventTransferConst = (EventTransferConst) arrayList.get(i);
                CmdTcpChannel.printD("opcode: " + eventTransferConst.getOpcode() + " seq: " + eventTransferConst.getSequence() + " complete: " + eventTransferConst.isComplete());
                if ((eventTransferConst.getOpcode() & (-16777216)) == -16777216) {
                    if (CmdTcpChannel.this.onNotifyReceiver != null) {
                        CmdTcpChannel.this.onNotifyReceiver.onComplete(eventTransferConst);
                        return;
                    }
                    return;
                }
                CommandTransferConst ackCmd = CmdTcpChannel.this.getAckCmd(eventTransferConst.getOpcode());
                if (ackCmd == null) {
                    CmdTcpChannel.printD("unknown evt, opcode: " + eventTransferConst.getOpcode() + " complete: " + eventTransferConst.isComplete() + " seq: " + eventTransferConst.getSequence());
                    return;
                }
                ackCmd.addEvt(eventTransferConst);
                ackCmd.cancelTimeout();
                if (eventTransferConst.isComplete()) {
                    CmdTcpChannel.this.RemoveAckCmd(ackCmd);
                }
            }
        }

        public void close() {
            this.running = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void printD(String str) {
        BKSmartLog.INSTANCE.d(TAG, str);
    }
}
