package com.beken.iot.smartsdk.core.pack;

import com.beken.iot.smartsdk.core.callback.OnEventReceiver;
import com.beken.iot.smartsdk.core.callback.OnTimeout;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes13.dex */
public class CommandTransferConst extends TransmissionPacked {
    public static final int OP_GET_AUDIO_STATUS = 12;
    public static final int OP_GET_CAMERA_STATUS = 9;
    public static final int OP_GET_DISPLAY_STATUS = 15;
    public static final int OP_GET_SUPPORTED_CAMERA_DEVICES = 3;
    public static final int OP_GET_SUPPORTED_LCD_DEVICES = 4;
    public static final int OP_GET_SUPPORTED_MIC_DEVICES = 5;
    public static final int OP_GET_SUPPORTED_SPEAKER_DEVICES = 6;
    public static final int OP_INVALID = -1;
    public static final int OP_PING = 100;
    public static final int OP_SET_ACOUSTICS = 16;
    public static final int OP_SET_AUDIO_TURN_OFF = 11;
    public static final int OP_SET_AUDIO_TURN_ON = 10;
    public static final int OP_SET_CAMERA_TURN_OFF = 8;
    public static final int OP_SET_CAMERA_TURN_ON = 7;
    public static final int OP_SET_DISPLAY_TURN_OFF = 14;
    public static final int OP_SET_DISPLAY_TURN_ON = 13;
    public static final int OP_SET_KEEP_ALIVE = 2;
    public static final int OP_SET_SERVICE_TYPE = 1;
    private static final String TAG = "CommandTransferConst";
    private final List<EventTransferConst> evtList;
    private boolean isWait;
    private final Object lock;
    private OnEventReceiver onEventReceiver;
    private OnTimeout onTimeout;
    private int opcode;
    private Timer timeout;
    private TimeoutTask timeoutTask;

    public CommandTransferConst(int i, int i2, byte[] bArr) {
        super(null);
        this.evtList = new ArrayList();
        this.opcode = -1;
        this.lock = new Object();
        this.isWait = false;
        this.onEventReceiver = null;
        this.timeout = null;
        this.timeoutTask = null;
        this.onTimeout = null;
        this.opcode = i;
        this.payload = build(i, i2, bArr);
    }

    public CommandTransferConst(int i) {
        super(null);
        this.evtList = new ArrayList();
        this.opcode = -1;
        this.lock = new Object();
        this.isWait = false;
        this.onEventReceiver = null;
        this.timeout = null;
        this.timeoutTask = null;
        this.onTimeout = null;
        this.opcode = i;
        this.payload = build(i, 0, null);
    }

    private byte[] build(int i, int i2, byte[] bArr) {
        byte[] byteArrayMerge = TransmissionConstructor.byteArrayMerge(int2bytes(i), int2bytes(i2));
        if (bArr == null || bArr.length == 0) {
            return TransmissionConstructor.byteArrayMerge(byteArrayMerge, short2bytes(0));
        }
        return TransmissionConstructor.byteArrayMerge(TransmissionConstructor.byteArrayMerge(byteArrayMerge, short2bytes(bArr.length)), bArr);
    }

    @Override // com.beken.iot.smartsdk.core.pack.TransmissionPacked
    public byte[] pack() {
        return super.pack();
    }

    @Override // com.beken.iot.smartsdk.core.pack.TransmissionPacked
    public byte[] packExpand() {
        return super.packExpand();
    }

    public int getOpcode() {
        return this.opcode;
    }

    public void addEvt(EventTransferConst eventTransferConst) {
        this.evtList.add(eventTransferConst);
        if (eventTransferConst.isComplete()) {
            notifyEvt();
            OnEventReceiver onEventReceiver = this.onEventReceiver;
            if (onEventReceiver != null) {
                onEventReceiver.onComplete(this);
            }
        }
    }

    public void setOnEventComplete(OnEventReceiver onEventReceiver) {
        this.onEventReceiver = onEventReceiver;
    }

    public List<EventTransferConst> getEvtList() {
        return this.evtList;
    }

    public synchronized void waitEvt(int i) throws InterruptedException {
        this.isWait = true;
        try {
            synchronized (this.lock) {
                this.lock.wait(i);
            }
        } catch (InterruptedException e) {
            this.isWait = false;
            e.printStackTrace();
            throw e;
        }
    }

    public synchronized void notifyEvt() {
        if (this.isWait) {
            synchronized (this.lock) {
                this.lock.notify();
            }
        }
    }

    public int getEventStatus() {
        if (this.evtList.size() == 0) {
            return 11;
        }
        if (this.evtList.size() > 1) {
            return 12;
        }
        return this.evtList.get(0).getStatus();
    }

    public EventTransferConst getEvent() {
        EventTransferConst eventTransferConst = null;
        for (int i = 0; i < this.evtList.size(); i++) {
            eventTransferConst = this.evtList.get(i);
            if (eventTransferConst.isComplete()) {
                return eventTransferConst;
            }
        }
        return eventTransferConst;
    }

    public void startTimeout() {
        this.timeout = new Timer();
        TimeoutTask timeoutTask = new TimeoutTask();
        this.timeoutTask = timeoutTask;
        try {
            this.timeout.schedule(timeoutTask, 0L, 15000L);
        } catch (Exception unused) {
        }
    }

    public void cancelTimeout() {
        Timer timer = this.timeout;
        if (timer != null) {
            timer.cancel();
            this.timeout = null;
        }
    }

    public void startTimeout(OnTimeout onTimeout) {
        this.timeout = new Timer();
        TimeoutTask timeoutTask = new TimeoutTask();
        this.timeoutTask = timeoutTask;
        this.onTimeout = onTimeout;
        try {
            this.timeout.schedule(timeoutTask, 10000L, 10000L);
        } catch (Exception unused) {
        }
    }

    private class TimeoutTask extends TimerTask {
        private TimeoutTask() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (CommandTransferConst.this.onTimeout != null) {
                CommandTransferConst.this.onTimeout.onTimeout();
                CommandTransferConst.this.timeout.cancel();
                CommandTransferConst.this.timeout = null;
            }
        }
    }
}
