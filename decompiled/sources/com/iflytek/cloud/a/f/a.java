package com.iflytek.cloud.a.f;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.iflytek.cloud.ErrorCode;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechUtility;
import com.iflytek.cloud.msc.util.log.DebugLog;
import java.io.IOException;
import java.util.HashSet;

/* loaded from: classes17.dex */
public abstract class a extends Handler {
    protected static final int MSG_CLEAR = 20;
    protected static final int MSG_DOWNLOAD = 11;
    protected static final int MSG_END = 21;
    protected static final int MSG_ISV_REQUEST = 13;
    protected static final int MSG_NET_PERF = 7;
    protected static final int MSG_NET_TIMEOUT = 8;
    protected static final int MSG_RECORD_AUDIO = 2;
    protected static final int MSG_RECORD_STOPD = 3;
    protected static final int MSG_REQUEST_RESULT = 22;
    protected static final int MSG_RESULT = 4;
    protected static final int MSG_SEARCH = 12;
    protected static final int MSG_SESSION_BEGIN = 1;
    protected static final int MSG_SPEECH_TIMEOUT = 9;
    protected static final int MSG_START = 0;
    protected static final int MSG_TTS_AUDIO = 5;
    protected static final int MSG_UPLOAD = 10;
    public static final String TAG_DOWNFLOW = "downflow";
    public static final String TAG_LOGIN_ID = "loginid";
    public static final String TAG_NETPERF = "netperf";
    public static final String TAG_UPFLOW = "upflow";
    protected static final HashSet<a> sInstances = new HashSet<>();
    protected Context mContext;
    protected int mNetTimeOut;
    private com.iflytek.cloud.b.a mParam;
    public int mSampleRate;
    protected int mSpeechTimeOut;
    private volatile b mStatus;
    protected long mStatusBegin;
    private HandlerThread mThread;
    protected volatile boolean mUserCancel;

    /* renamed from: com.iflytek.cloud.a.f.a$a, reason: collision with other inner class name */
    protected enum EnumC0646a {
        max,
        normal
    }

    protected enum b {
        init,
        start,
        recording,
        waitresult,
        exiting,
        exited
    }

    public a(Context context, HandlerThread handlerThread) {
        super(handlerThread.getLooper());
        this.mSpeechTimeOut = 60000;
        this.mSampleRate = 16000;
        this.mContext = null;
        this.mParam = new com.iflytek.cloud.b.a();
        this.mUserCancel = false;
        this.mStatus = b.init;
        this.mStatusBegin = 0L;
        this.mNetTimeOut = 20000;
        this.mThread = handlerThread;
        this.mContext = context;
        this.mUserCancel = false;
        sInstances.add(this);
    }

    private void destroyThread() {
        Looper mainLooper;
        HandlerThread handlerThread = this.mThread;
        if (handlerThread != null && handlerThread.isAlive()) {
            clearAllMsg();
            Context context = this.mContext;
            Thread thread = (context == null || (mainLooper = context.getMainLooper()) == null) ? null : mainLooper.getThread();
            if (this.mContext == null || !this.mThread.equals(thread)) {
                this.mThread.quit();
                DebugLog.LogD("quit current Msc Handler thread");
            }
            this.mThread = null;
        }
        sInstances.remove(this);
    }

    public static boolean isEmpty() {
        return sInstances.isEmpty();
    }

    public static void timeOutCheck(long j, int i) throws SpeechError {
        if (SystemClock.elapsedRealtime() - j > i) {
            throw new SpeechError(20002);
        }
    }

    public void cancel(boolean z) {
        this.mUserCancel = true;
        clearAllMsg();
        exit(null);
    }

    protected void clearAllMsg() {
        DebugLog.LogD("clear all message");
        for (int i = 0; i < 20; i++) {
            removeMessages(i);
        }
    }

    protected synchronized void exit(SpeechError speechError) {
        if (speechError != null) {
            clearAllMsg();
        }
        sendMsg(obtainMessage(21, speechError));
    }

    public abstract String getClientID();

    public com.iflytek.cloud.b.a getParam() {
        return this.mParam;
    }

    public String getParamEncoding() {
        return this.mParam.a("pte", "utf-8");
    }

    public String getResultEncoding() {
        return this.mParam.a("rse", "utf-8");
    }

    public int getSampleRate() {
        return this.mSampleRate;
    }

    public abstract String getSessionID();

    protected synchronized b getStatus() {
        return this.mStatus;
    }

    protected String getTag() {
        return getClass().toString();
    }

    public String getTextEncoding() {
        return this.mParam.a(SpeechConstant.TEXT_ENCODING, "utf-8");
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i = message.what;
        if (i == 21) {
            onEnd((SpeechError) message.obj);
            destroyThread();
            return;
        }
        try {
            if (i == 8) {
                throw new SpeechError(20002);
            }
            if (SpeechUtility.getUtility() == null && 1 == message.what) {
                DebugLog.LogE("SDK is not init while session begin");
                throw new SpeechError(20015);
            }
            onMsgProcess(message);
        } catch (SpeechError e) {
            DebugLog.LogE(e);
            DebugLog.LogD(getTag() + " occur Error = " + e.toString());
            exit(e);
        } catch (IOException e2) {
            DebugLog.LogE(e2);
            SpeechError speechError = new SpeechError(20010);
            DebugLog.LogD(getTag() + " occur Error = " + speechError.toString());
            exit(speechError);
        } catch (Exception e3) {
            DebugLog.LogE(e3);
            SpeechError speechError2 = new SpeechError(e3);
            DebugLog.LogD(getTag() + " occur Error = " + speechError2.toString());
            exit(speechError2);
        } catch (UnsatisfiedLinkError e4) {
            DebugLog.LogE(e4);
            SpeechError speechError3 = new SpeechError(ErrorCode.ERROR_UNSATISFIED_LINK);
            DebugLog.LogD(getTag() + " occur Error = " + speechError3.toString());
            exit(speechError3);
        } catch (Throwable th) {
            DebugLog.LogE(th);
            SpeechError speechError4 = new SpeechError(ErrorCode.ERROR_UNKNOWN);
            DebugLog.LogD(getTag() + " occur Error = " + speechError4.toString());
            exit(speechError4);
        }
    }

    public boolean isLongInput() {
        return false;
    }

    public boolean isRunning() {
        return (this.mStatus == b.exited || this.mStatus == b.exiting || this.mStatus == b.init) ? false : true;
    }

    protected void onEnd(SpeechError speechError) {
        setStatus(b.exited);
        clearAllMsg();
    }

    protected void onMsgProcess(Message message) throws Throwable, SpeechError {
    }

    protected void onParseParam() {
        this.mNetTimeOut = this.mParam.a("timeout", this.mNetTimeOut);
        this.mSampleRate = this.mParam.a("sample_rate", this.mSampleRate);
    }

    protected void sendMsg(int i) {
        sendMsg(obtainMessage(i), EnumC0646a.normal, false, 0);
    }

    protected void setParams(com.iflytek.cloud.b.a aVar) {
        this.mParam = aVar.clone();
        onParseParam();
    }

    protected synchronized void setStatus(b bVar) {
        DebugLog.LogD("curStatus=" + this.mStatus + ",setStatus=" + bVar);
        b bVar2 = this.mStatus;
        b bVar3 = b.exited;
        if (bVar2 == bVar3) {
            return;
        }
        if (this.mStatus != b.exiting || bVar == bVar3) {
            DebugLog.LogD("setStatus success=" + bVar);
            this.mStatus = bVar;
            this.mStatusBegin = SystemClock.elapsedRealtime();
        }
    }

    protected void start() {
        sendMsg(0, EnumC0646a.max, false, 0);
    }

    public void startBluetooth() throws SecurityException {
        DebugLog.LogD("startBluetooth enter");
        AudioManager audioManager = (AudioManager) this.mContext.getSystemService("audio");
        audioManager.setBluetoothScoOn(true);
        audioManager.startBluetoothSco();
    }

    public void stopBluetooth() {
        DebugLog.LogD("stopBluetooth enter");
        try {
            AudioManager audioManager = (AudioManager) this.mContext.getSystemService("audio");
            audioManager.setBluetoothScoOn(false);
            audioManager.stopBluetoothSco();
        } catch (SecurityException e) {
            DebugLog.LogE(e);
        } catch (Throwable th) {
            DebugLog.LogE(th);
        }
    }

    protected void updateTimeoutMsg() {
        removeMessages(8);
        sendMsg(8, EnumC0646a.normal, false, this.mNetTimeOut);
    }

    protected void sendMsg(Message message) {
        sendMsg(message, EnumC0646a.normal, false, 0);
    }

    protected void sendMsg(int i, EnumC0646a enumC0646a, boolean z, int i2) {
        sendMsg(obtainMessage(i), enumC0646a, z, i2);
    }

    protected void sendMsg(Message message, EnumC0646a enumC0646a, boolean z, int i) {
        if (getStatus() != b.exited) {
            b status = getStatus();
            b bVar = b.exiting;
            if (status != bVar) {
                int i2 = message.what;
                if (i2 == 0) {
                    setStatus(b.start);
                } else if (i2 == 3) {
                    setStatus(b.waitresult);
                } else if (i2 == 21) {
                    setStatus(bVar);
                }
                if (z) {
                    removeMessages(message.what);
                }
                if (enumC0646a == EnumC0646a.max && i <= 0) {
                    sendMessageAtFrontOfQueue(message);
                    return;
                } else {
                    sendMessageDelayed(message, i);
                    return;
                }
            }
        }
        DebugLog.LogD("send msg failed while status is " + getStatus());
    }

    public a(Context context) {
        super(context.getMainLooper());
        this.mSpeechTimeOut = 60000;
        this.mSampleRate = 16000;
        this.mContext = null;
        this.mParam = new com.iflytek.cloud.b.a();
        this.mUserCancel = false;
        this.mStatus = b.init;
        this.mStatusBegin = 0L;
        this.mNetTimeOut = 20000;
        this.mContext = context;
        this.mUserCancel = false;
    }
}
