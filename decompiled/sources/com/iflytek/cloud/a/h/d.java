package com.iflytek.cloud.a.h;

import android.content.Context;
import android.text.TextUtils;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.msc.util.log.DebugLog;
import com.iflytek.msc.MSC;
import com.iflytek.msc.MSCSessionInfo;
import java.io.UnsupportedEncodingException;

/* loaded from: classes17.dex */
public class d extends com.iflytek.cloud.a.f.b {

    /* renamed from: a, reason: collision with root package name */
    private MSCSessionInfo f11151a = new MSCSessionInfo();

    public synchronized void a(byte[] bArr) throws SpeechError {
        DebugLog.LogD("QTTSTextPut enter");
        com.iflytek.cloud.msc.util.log.a.a("LastDataFlag", null);
        int QTTSTextPut = MSC.QTTSTextPut(this.mClientID, bArr);
        DebugLog.LogD("QTTSTextPut leavel:" + QTTSTextPut);
        if (QTTSTextPut != 0) {
            throw new SpeechError(QTTSTextPut);
        }
    }

    public int b() {
        try {
            return Integer.parseInt(getStringValue("ced"));
        } catch (Exception unused) {
            return 0;
        }
    }

    public String c() {
        try {
            char[] QTTSAudioInfo = MSC.QTTSAudioInfo(this.mClientID);
            return (QTTSAudioInfo == null || QTTSAudioInfo.length <= 0) ? "" : new String(QTTSAudioInfo);
        } catch (Exception e) {
            DebugLog.LogE(e);
            return "";
        }
    }

    public synchronized boolean d() {
        return 2 == this.f11151a.sesstatus;
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
        } catch (Exception unused) {
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
            if (MSC.QTTSGetParam(cArr, str.getBytes(), this.f11151a) == 0) {
                return new String(this.f11151a.buffer);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Override // com.iflytek.cloud.a.f.b
    public int sessionBegin(Context context, String str, com.iflytek.cloud.a.f.a aVar) throws SpeechError, UnsupportedEncodingException {
        this.mClientID = null;
        String e = com.iflytek.cloud.b.c.e(context, aVar);
        DebugLog.LogD("QTTSSessionBegin enter");
        long currentTimeMillis = System.currentTimeMillis();
        byte[] bytes = e.getBytes(aVar.getParamEncoding());
        com.iflytek.cloud.msc.util.log.a.a("MSCSessionBegin", null);
        synchronized (d.class) {
            this.mClientID = MSC.QTTSSessionBegin(bytes, this.f11151a);
        }
        com.iflytek.cloud.msc.util.log.a.a("SessionBeginEnd", null);
        DebugLog.LogD("QTTSSessionBegin leave:" + (System.currentTimeMillis() - currentTimeMillis) + " ErrorCode:" + this.f11151a.errorcode);
        int i = this.f11151a.errorcode;
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
        if (TextUtils.isEmpty(str)) {
            str = "unknown";
        }
        DebugLog.LogD("QTTSSessionEnd enter");
        DebugLog.LogD("QTTSSessionEnd leavel:" + MSC.QTTSSessionEnd(this.mClientID, str.getBytes()));
        this.mClientID = null;
        this.mSessionID = null;
    }

    public synchronized byte[] a() throws SpeechError {
        byte[] QTTSAudioGet;
        if (this.mClientID != null) {
            DebugLog.LogI("QTTSAudioGet enter");
            QTTSAudioGet = MSC.QTTSAudioGet(this.mClientID, this.f11151a);
            DebugLog.LogI("QTTSAudioGet leave:" + this.f11151a.errorcode + "value len = " + (QTTSAudioGet == null ? 0 : QTTSAudioGet.length));
            int i = this.f11151a.errorcode;
            if (i != 0) {
                throw new SpeechError(i);
            }
        } else {
            throw new SpeechError(20003);
        }
        return QTTSAudioGet;
    }
}
