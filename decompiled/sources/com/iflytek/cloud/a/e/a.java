package com.iflytek.cloud.a.e;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.b.c;
import com.iflytek.cloud.msc.util.log.DebugLog;
import com.iflytek.msc.MSC;
import com.iflytek.msc.MSCSessionInfo;
import java.io.UnsupportedEncodingException;

/* loaded from: classes17.dex */
public class a extends com.iflytek.cloud.a.f.b {

    /* renamed from: a, reason: collision with root package name */
    private MSCSessionInfo f11129a = new MSCSessionInfo();
    private MSCSessionInfo b = new MSCSessionInfo();
    private byte[] c = null;

    public synchronized void a(StringBuffer stringBuffer, byte[] bArr, int i, boolean z) throws SpeechError {
        StringBuffer stringBuffer2 = new StringBuffer(stringBuffer.toString());
        stringBuffer2.append(",data_status=");
        if (z) {
            stringBuffer2.append(1);
        } else {
            stringBuffer2.append(2);
        }
        DebugLog.LogS("pushAudioData, param:" + stringBuffer2.toString());
        a(stringBuffer2.toString(), bArr, i);
    }

    public synchronized int getAudioVolume() {
        int i;
        int i2;
        i = 0;
        try {
            i2 = MSC.QMFVGetParam(this.mClientID, SpeechConstant.VOLUME.getBytes(), this.b);
        } catch (Exception unused) {
            i2 = 0;
        }
        try {
            if (i2 == 0) {
                i = Integer.parseInt(new String(new String(this.b.buffer)));
            } else {
                DebugLog.LogI("VAD CHECK FALSE");
            }
        } catch (Exception unused2) {
            DebugLog.LogI("getAudioVolume Exception vadret = " + i2);
            return i;
        }
        return i;
    }

    public synchronized int getIntValue(String str) {
        int i = 0;
        if (this.mClientID == null) {
            return 0;
        }
        try {
            String stringValue = getStringValue(str);
            if (!TextUtils.isEmpty(stringValue)) {
                i = Integer.parseInt(new String(stringValue));
            }
        } catch (Exception e) {
            DebugLog.LogE(e);
        }
        return i;
    }

    protected String getSessionID() {
        if (this.mSessionID == null) {
            this.mSessionID = getStringValue("sid");
        }
        return this.mSessionID;
    }

    public synchronized String getStringValue(String str) {
        char[] cArr = this.mClientID;
        if (cArr == null) {
            return null;
        }
        try {
            if (MSC.QMFVGetParam(cArr, str.getBytes(), this.f11129a) == 0) {
                return new String(this.f11129a.buffer);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Override // com.iflytek.cloud.a.f.b
    public int sessionBegin(Context context, String str, com.iflytek.cloud.a.f.a aVar) throws SpeechError, UnsupportedEncodingException {
        String d = c.d(context, str, aVar);
        DebugLog.LogS("sessionBegin Params:" + d);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        com.iflytek.cloud.msc.util.log.a.a("MSCSessionBegin", null);
        synchronized (a.class) {
            this.mClientID = MSC.QMFVSessionBegin(d.getBytes(aVar.getParamEncoding()), this.f11129a);
        }
        com.iflytek.cloud.msc.util.log.a.a("SessionBeginEnd", null);
        DebugLog.LogD("sessionBegin ErrCode:" + this.f11129a.errorcode + " time:" + (SystemClock.elapsedRealtime() - elapsedRealtime));
        int i = this.f11129a.errorcode;
        if (i == 0 || i == 10129 || i == 10113 || i == 10132) {
            return i;
        }
        throw new SpeechError(i);
    }

    @Override // com.iflytek.cloud.a.f.b
    public void sessionEnd(String str) {
        if (this.mClientID == null) {
            return;
        }
        DebugLog.LogD("sessionEnd enter ");
        DebugLog.LogD("sessionEnd leavel:" + (MSC.QMFVSessionEnd(this.mClientID, str.getBytes()) == 0) + " time:" + (System.currentTimeMillis() - System.currentTimeMillis()));
        this.mClientID = null;
        this.mSessionID = null;
    }

    public synchronized boolean setParam(String str, String str2) {
        char[] cArr;
        int i;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (cArr = this.mClientID) == null) {
            return false;
        }
        try {
            i = MSC.QMFVSetParam(cArr, str.getBytes("utf-8"), str2.getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            DebugLog.LogE(e);
            i = -1;
        }
        return i == 0;
    }

    public synchronized void a(String str) throws SpeechError {
        com.iflytek.cloud.msc.util.log.a.a("LastDataFlag", null);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ssub=" + str);
        stringBuffer.append(",data_status=4");
        DebugLog.LogD("mfv pushEndFlag, param:" + stringBuffer.toString());
        a(stringBuffer.toString(), new byte[0], 0);
    }

    private synchronized void a(String str, byte[] bArr, int i) throws SpeechError {
        int QMFVDataWrite = MSC.QMFVDataWrite(this.mClientID, str.getBytes(), bArr, i, this.b);
        this.f11129a.sesstatus = this.b.sesstatus;
        DebugLog.LogI("QISRAudioWrite length:" + i);
        if (QMFVDataWrite != 0) {
            throw new SpeechError(this.b.errorcode);
        }
    }
}
