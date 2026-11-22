package com.iflytek.cloud.a.d;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.msc.util.log.DebugLog;
import com.iflytek.msc.MSC;
import com.iflytek.msc.MSCSessionInfo;
import java.io.UnsupportedEncodingException;

/* loaded from: classes17.dex */
public class b extends com.iflytek.cloud.a.f.b {

    /* renamed from: a, reason: collision with root package name */
    private MSCSessionInfo f11111a = new MSCSessionInfo();
    private MSCSessionInfo b = new MSCSessionInfo();

    private synchronized void writeData(byte[] bArr, int i, int i2) throws SpeechError {
        int QIVWAudioWrite = MSC.QIVWAudioWrite(this.mClientID, bArr, i, i2, this.b);
        this.f11111a.sesstatus = this.b.sesstatus;
        DebugLog.LogI("QIVWAudioWrite length:" + i);
        if (QIVWAudioWrite != 0) {
            throw new SpeechError(this.b.errorcode);
        }
    }

    public synchronized void pushAudioData(byte[] bArr, int i) throws SpeechError {
        writeData(bArr, i, 2);
    }

    public synchronized void pushEndFlag() throws SpeechError {
        com.iflytek.cloud.msc.util.log.a.a("LastDataFlag", null);
        DebugLog.LogD("ivw session pushEndFlag");
        writeData(new byte[0], 0, 4);
    }

    @Override // com.iflytek.cloud.a.f.b
    public int sessionBegin(Context context, String str, com.iflytek.cloud.a.f.a aVar) throws SpeechError, UnsupportedEncodingException {
        String c = com.iflytek.cloud.b.c.c(context, str, aVar);
        String a2 = aVar.getParam().a(SpeechConstant.CLOUD_GRAMMAR);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        DebugLog.LogD("ivw sessionbegin begin");
        com.iflytek.cloud.msc.util.log.a.a("MSCSessionBegin", null);
        if (TextUtils.isEmpty(a2)) {
            this.mClientID = MSC.QIVWSessionBegin(null, c.getBytes(aVar.getParamEncoding()), this.f11111a);
        } else {
            this.mClientID = MSC.QIVWSessionBegin(a2.getBytes(aVar.getParamEncoding()), c.getBytes(aVar.getParamEncoding()), this.f11111a);
        }
        com.iflytek.cloud.msc.util.log.a.a("SessionBeginEnd", null);
        DebugLog.LogD("ivw sessionBegin ErrCode:" + this.f11111a.errorcode + " time:" + (SystemClock.elapsedRealtime() - elapsedRealtime));
        int i = this.f11111a.errorcode;
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
        DebugLog.LogD("sessionEnd leave: " + (MSC.QIVWSessionEnd(this.mClientID, str.getBytes()) == 0) + " time:" + (System.currentTimeMillis() - System.currentTimeMillis()));
        this.mClientID = null;
        this.mSessionID = null;
    }
}
