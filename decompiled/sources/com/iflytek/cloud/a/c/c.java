package com.iflytek.cloud.a.c;

import android.content.Context;
import android.os.SystemClock;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.msc.util.log.DebugLog;
import com.iflytek.msc.MSC;
import com.iflytek.msc.MSCSessionInfo;
import io.livekit.android.room.util.MediaConstraintKeys;
import java.io.UnsupportedEncodingException;

/* loaded from: classes17.dex */
public class c extends com.iflytek.cloud.a.f.b {

    /* renamed from: a, reason: collision with root package name */
    private MSCSessionInfo f11109a = new MSCSessionInfo();
    private MSCSessionInfo b = new MSCSessionInfo();
    private MSCSessionInfo c = new MSCSessionInfo();
    private byte[] d = null;

    private synchronized void writeData(byte[] bArr, int i, int i2) throws SpeechError {
        int QISVAudioWrite = MSC.QISVAudioWrite(this.mClientID, null, bArr, i, i2, this.f11109a);
        DebugLog.LogI("QISVAudioWrite error:" + QISVAudioWrite);
        if (QISVAudioWrite != 0) {
            throw new SpeechError(QISVAudioWrite);
        }
    }

    public synchronized boolean a() {
        return this.f11109a.epstatues >= 3;
    }

    public synchronized int getAudioVolume() {
        int i;
        int i2;
        i = 0;
        try {
            i2 = MSC.QISVGetParam(this.mClientID, SpeechConstant.VOLUME.getBytes(), this.b);
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

    public byte[] getResultData() {
        return this.d;
    }

    protected String getSessionID() {
        if (this.mSessionID == null) {
            this.mSessionID = getStringValue("sid");
        }
        return this.mSessionID;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004f, code lost:
    
        if (r0 != 5) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.iflytek.cloud.a.f.b.a getStatus() throws com.iflytek.cloud.SpeechError {
        /*
            r7 = this;
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            char[] r1 = r7.mClientID
            com.iflytek.msc.MSCSessionInfo r2 = r7.f11109a
            r3 = 0
            byte[] r1 = com.iflytek.msc.MSC.QISVGetResult(r1, r3, r2)
            r7.d = r1
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "QISVGetResult leavel:"
            r2.<init>(r3)
            byte[] r3 = r7.d
            r4 = 1
            if (r3 == 0) goto L23
            r3 = r4
            goto L24
        L23:
            r3 = 0
        L24:
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " time:"
            java.lang.StringBuilder r2 = r2.append(r3)
            long r5 = r1.getTime()
            long r0 = r0.getTime()
            long r5 = r5 - r0
            java.lang.StringBuilder r0 = r2.append(r5)
            java.lang.String r0 = r0.toString()
            com.iflytek.cloud.msc.util.log.DebugLog.LogI(r0)
            com.iflytek.msc.MSCSessionInfo r0 = r7.f11109a
            int r1 = r0.errorcode
            if (r1 != 0) goto L88
            int r0 = r0.rsltstatus
            if (r0 == 0) goto L6c
            if (r0 == r4) goto L52
            r1 = 5
            if (r0 == r1) goto L6c
            goto L85
        L52:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "ResultStatus: noResult"
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            com.iflytek.cloud.msc.util.log.DebugLog.LogD(r0)
            com.iflytek.cloud.SpeechError r0 = new com.iflytek.cloud.SpeechError
            r1 = 20005(0x4e25, float:2.8033E-41)
            r0.<init>(r1)
            throw r0
        L6c:
            byte[] r1 = r7.d
            if (r1 == 0) goto L85
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "ResultStatus: hasResult"
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            com.iflytek.cloud.msc.util.log.DebugLog.LogD(r0)
            com.iflytek.cloud.a.f.b$a r0 = com.iflytek.cloud.a.f.b.a.hasResult
            return r0
        L85:
            com.iflytek.cloud.a.f.b$a r0 = com.iflytek.cloud.a.f.b.a.noResult
            return r0
        L88:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Result: error errorcode is "
            r0.<init>(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.iflytek.cloud.msc.util.log.DebugLog.LogE(r0)
            com.iflytek.cloud.SpeechError r0 = new com.iflytek.cloud.SpeechError
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iflytek.cloud.a.c.c.getStatus():com.iflytek.cloud.a.f.b$a");
    }

    public synchronized String getStringValue(String str) {
        char[] cArr = this.mClientID;
        if (cArr == null) {
            return null;
        }
        try {
            if (MSC.QISVGetParam(cArr, str.getBytes(), this.f11109a) == 0) {
                return new String(this.f11109a.buffer);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public synchronized void pushAudioData(byte[] bArr, int i) throws SpeechError {
        writeData(bArr, i, 2);
    }

    public synchronized void pushEndFlag() throws SpeechError {
        com.iflytek.cloud.msc.util.log.a.a("LastDataFlag", null);
        DebugLog.LogD("IsvSession pushEndFlag");
        writeData(new byte[0], 0, 4);
    }

    @Override // com.iflytek.cloud.a.f.b
    public int sessionBegin(Context context, String str, com.iflytek.cloud.a.f.a aVar) throws SpeechError, UnsupportedEncodingException {
        String c = com.iflytek.cloud.b.c.c(context, aVar);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        com.iflytek.cloud.msc.util.log.a.a("MSCSessionBegin", null);
        DebugLog.LogD("QISVSessionBegin begin");
        this.mClientID = MSC.QISVSessionBegin(c.getBytes(aVar.getParamEncoding()), str == null ? null : str.getBytes(aVar.getParamEncoding()), this.f11109a);
        com.iflytek.cloud.msc.util.log.a.a("SessionBeginEnd", null);
        DebugLog.LogD("QISVSessionBegin ret: " + this.f11109a.errorcode + " time:" + (SystemClock.elapsedRealtime() - elapsedRealtime));
        int i = this.f11109a.errorcode;
        if (i == 0 || i == 10129 || i == 10113 || i == 10132) {
            return 0;
        }
        throw new SpeechError(i);
    }

    @Override // com.iflytek.cloud.a.f.b
    public void sessionEnd(String str) {
        if (this.mClientID == null) {
            return;
        }
        DebugLog.LogD("isv sessionEnd enter ");
        DebugLog.LogD("isv sessionEnd leave:" + (MSC.QISVSessionEnd(this.mClientID, str.getBytes()) == 0) + " time:" + (System.currentTimeMillis() - System.currentTimeMillis()));
        this.mClientID = null;
        this.mSessionID = null;
    }

    public int a(Context context, com.iflytek.cloud.a.f.a aVar) throws UnsupportedEncodingException, SpeechError {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String a2 = aVar.getParam().a(SpeechConstant.ISV_VID);
        String c = com.iflytek.cloud.b.c.c(context, aVar);
        DebugLog.LogD("sendRequest enter ");
        com.iflytek.cloud.msc.util.log.a.a("LastDataFlag", null);
        char[] QISVQueDelModel = MSC.QISVQueDelModel(a2 == null ? null : a2.getBytes(aVar.getParamEncoding()), c.getBytes(aVar.getParamEncoding()), this.c);
        com.iflytek.cloud.msc.util.log.a.a("GetNotifyResult", null);
        MSC.QISVQueDelModelRelease(QISVQueDelModel);
        int i = this.c.errorcode;
        if (i == 0) {
            i = MediaConstraintKeys.TRUE.equals(new String(this.c.buffer)) ? 0 : -1;
        }
        DebugLog.LogD("sendRequest leave:" + i + " time:" + (SystemClock.elapsedRealtime() - elapsedRealtime));
        if (i == 0 || -1 == i) {
            return i;
        }
        throw new SpeechError(i);
    }
}
