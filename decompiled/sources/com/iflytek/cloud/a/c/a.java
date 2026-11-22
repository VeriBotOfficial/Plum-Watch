package com.iflytek.cloud.a.c;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechListener;

/* loaded from: classes17.dex */
public class a extends com.iflytek.cloud.a.f.a {

    /* renamed from: a, reason: collision with root package name */
    private c f11104a;
    private SpeechListener b;

    /* renamed from: com.iflytek.cloud.a.c.a$a, reason: collision with other inner class name */
    public static final class C0639a implements SpeechListener {

        /* renamed from: a, reason: collision with root package name */
        private SpeechListener f11105a;
        private Handler b = new HandlerC0640a(Looper.getMainLooper());

        /* renamed from: com.iflytek.cloud.a.c.a$a$a, reason: collision with other inner class name */
        class HandlerC0640a extends Handler {
            HandlerC0640a(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (C0639a.this.f11105a == null) {
                    return;
                }
                int i = message.what;
                if (i == 0) {
                    C0639a.this.f11105a.onEvent(message.arg1, (Bundle) message.obj);
                } else if (i == 1) {
                    C0639a.this.f11105a.onBufferReceived((byte[]) message.obj);
                } else {
                    if (i != 2) {
                        return;
                    }
                    C0639a.this.f11105a.onCompleted((SpeechError) message.obj);
                }
            }
        }

        public C0639a(SpeechListener speechListener) {
            this.f11105a = null;
            this.f11105a = speechListener;
        }

        @Override // com.iflytek.cloud.SpeechListener
        public void onBufferReceived(byte[] bArr) {
            this.b.sendMessage(this.b.obtainMessage(1, bArr));
        }

        @Override // com.iflytek.cloud.SpeechListener
        public void onCompleted(SpeechError speechError) {
            this.b.sendMessage(this.b.obtainMessage(2, speechError));
        }

        @Override // com.iflytek.cloud.SpeechListener
        public void onEvent(int i, Bundle bundle) {
            this.b.sendMessage(this.b.obtainMessage(0, i, 0, bundle));
        }
    }

    public a(Context context, HandlerThread handlerThread) {
        super(context, handlerThread);
        this.f11104a = new c();
    }

    public void a(com.iflytek.cloud.b.a aVar, C0639a c0639a) {
        this.b = c0639a;
        setParams(aVar);
        Message obtain = Message.obtain();
        obtain.what = 13;
        sendMsg(obtain);
    }

    @Override // com.iflytek.cloud.a.f.a
    public String getClientID() {
        return this.f11104a.getClientID();
    }

    @Override // com.iflytek.cloud.a.f.a
    public String getSessionID() {
        return this.f11104a.getSessionID();
    }

    @Override // com.iflytek.cloud.a.f.a
    protected void onEnd(SpeechError speechError) {
        super.onEnd(speechError);
        SpeechListener speechListener = this.b;
        if (speechListener != null) {
            speechListener.onCompleted(speechError);
        }
    }

    @Override // com.iflytek.cloud.a.f.a
    protected void onMsgProcess(Message message) throws Throwable, SpeechError {
        if (message.what != 13) {
            return;
        }
        synchronized (a.class) {
            String format = String.format("{'ret':%d,'cmd':%s}", Integer.valueOf(this.f11104a.a(this.mContext, this)), getParam().a(SpeechConstant.ISV_CMD));
            SpeechListener speechListener = this.b;
            if (speechListener != null) {
                speechListener.onBufferReceived(format.getBytes(getParamEncoding()));
            }
            sendMsg(21);
        }
    }
}
