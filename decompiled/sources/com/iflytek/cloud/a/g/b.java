package com.iflytek.cloud.a.g;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechListener;
import com.iflytek.cloud.SpeechUtility;
import com.iflytek.cloud.a.f.a;
import com.iflytek.cloud.msc.util.log.DebugLog;
import java.io.IOException;

/* loaded from: classes17.dex */
public class b extends com.iflytek.cloud.a.f.a {

    /* renamed from: a, reason: collision with root package name */
    private SpeechListener f11141a;
    private com.iflytek.cloud.a.g.a b;
    private String c;

    private class a {

        /* renamed from: a, reason: collision with root package name */
        private byte[] f11142a;
        private String b;

        public a(byte[] bArr, String str) {
            this.f11142a = bArr;
            this.b = str;
        }

        public String a() {
            return this.b;
        }

        public byte[] b() {
            return this.f11142a;
        }
    }

    public b(Context context, com.iflytek.cloud.b.a aVar, HandlerThread handlerThread) {
        super(context, handlerThread);
        this.f11141a = null;
        this.b = new com.iflytek.cloud.a.g.a();
        this.c = null;
        setParams(aVar);
    }

    public void a(SpeechListener speechListener) {
        this.f11141a = speechListener;
        sendMsg(11);
    }

    @Override // com.iflytek.cloud.a.f.a
    public String getClientID() {
        return null;
    }

    @Override // com.iflytek.cloud.a.f.a
    public String getSessionID() {
        return null;
    }

    @Override // com.iflytek.cloud.a.f.a
    protected void onEnd(SpeechError speechError) {
        super.onEnd(speechError);
        if (this.f11141a == null || this.mUserCancel) {
            return;
        }
        this.f11141a.onCompleted(speechError);
    }

    @Override // com.iflytek.cloud.a.f.a
    protected void onMsgProcess(Message message) throws Throwable, SpeechError {
        byte[] a2;
        super.onMsgProcess(message);
        if (SpeechUtility.getUtility() == null) {
            DebugLog.LogE("MscCommon process while utility is null!");
            exit(new SpeechError(20015));
            return;
        }
        switch (message.what) {
            case 10:
                a aVar = (a) message.obj;
                if (aVar.b() != null && aVar.b().length > 0) {
                    a2 = this.b.a(this.mContext, aVar.a(), aVar.b(), this);
                    break;
                } else {
                    throw new SpeechError(20009);
                }
                break;
            case 11:
                a2 = this.b.a(this.mContext, this);
                break;
            case 12:
                String str = (String) message.obj;
                if (!TextUtils.isEmpty(str)) {
                    setStatus(a.b.waitresult);
                    a2 = this.b.a(this.mContext, this, str);
                    break;
                } else {
                    throw new SpeechError(20009);
                }
            default:
                a2 = null;
                break;
        }
        if (a2 == null) {
            throw new SpeechError(20004);
        }
        if (this.f11141a != null && !this.mUserCancel) {
            this.f11141a.onBufferReceived(a2);
        }
        exit(null);
    }

    public void a(SpeechListener speechListener, String str) {
        setStatus(a.b.start);
        this.c = "sch";
        this.f11141a = speechListener;
        sendMsg(obtainMessage(12, str));
    }

    public b(Context context, com.iflytek.cloud.b.a aVar) {
        super(context);
        this.f11141a = null;
        this.b = new com.iflytek.cloud.a.g.a();
        this.c = null;
        setParams(aVar);
    }

    public void a(SpeechListener speechListener, String str, byte[] bArr) {
        this.c = "uup";
        this.f11141a = speechListener;
        sendMsg(obtainMessage(10, new a(bArr, str)));
    }

    public SpeechError a(String str, String str2) {
        this.c = "auth";
        try {
            com.iflytek.cloud.a.g.a.a(this.mContext, str, str2, this);
            return null;
        } catch (SpeechError e) {
            DebugLog.LogE(e);
            DebugLog.LogD(getTag() + " occur Error = " + e.toString());
            return e;
        } catch (IOException e2) {
            DebugLog.LogE(e2);
            SpeechError speechError = new SpeechError(20010);
            DebugLog.LogD(getTag() + " occur Error = " + speechError.toString());
            return speechError;
        } catch (Exception e3) {
            DebugLog.LogE(e3);
            SpeechError speechError2 = new SpeechError(21003);
            DebugLog.LogD(getTag() + " occur Error = " + speechError2.toString());
            return speechError2;
        }
    }
}
