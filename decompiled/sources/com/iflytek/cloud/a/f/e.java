package com.iflytek.cloud.a.f;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechListener;
import com.iflytek.cloud.msc.util.log.DebugLog;

/* loaded from: classes17.dex */
public abstract class e extends d {

    /* renamed from: a, reason: collision with root package name */
    protected Context f11137a;
    protected Object b = new Object();
    protected volatile com.iflytek.cloud.a.f.a c = null;
    protected volatile HandlerThread d = null;

    protected class a implements SpeechListener {

        /* renamed from: a, reason: collision with root package name */
        private SpeechListener f11138a;
        private Handler b = new HandlerC0647a(Looper.getMainLooper());

        /* renamed from: com.iflytek.cloud.a.f.e$a$a, reason: collision with other inner class name */
        class HandlerC0647a extends Handler {
            HandlerC0647a(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (a.this.f11138a == null) {
                    return;
                }
                DebugLog.LogD("SpeechListener onMsg = " + message.what);
                int i = message.what;
                if (i == 0) {
                    a.this.f11138a.onEvent(message.arg1, (Bundle) message.obj);
                } else if (i == 1) {
                    a.this.f11138a.onBufferReceived((byte[]) message.obj);
                } else if (i == 2) {
                    a.this.f11138a.onCompleted((SpeechError) message.obj);
                }
                super.handleMessage(message);
            }
        }

        public a(SpeechListener speechListener) {
            this.f11138a = null;
            this.f11138a = speechListener;
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

    protected e(Context context) {
        this.f11137a = null;
        if (context == null) {
            this.f11137a = null;
            return;
        }
        com.iflytek.cloud.msc.util.b.a(context.getApplicationContext());
        this.f11137a = context.getApplicationContext();
        try {
            e();
        } catch (Exception e) {
            DebugLog.LogE(e);
        }
    }

    protected HandlerThread a(String str) throws Throwable {
        this.d = new HandlerThread(str);
        this.d.start();
        return this.d;
    }

    protected String b() {
        return getClass().toString();
    }

    protected boolean c() {
        return this.c != null && this.c.isRunning();
    }

    public void cancel(boolean z) {
        if (this.c != null) {
            this.c.cancel(z);
        }
    }

    protected boolean d() {
        if (this.d == null || !this.d.isAlive()) {
            return true;
        }
        HandlerThread handlerThread = this.d;
        this.d = null;
        handlerThread.interrupt();
        return true;
    }

    @Override // com.iflytek.cloud.a.f.d
    public boolean destroy() {
        boolean d;
        synchronized (this.b) {
            if (c()) {
                d = false;
                this.c.cancel(false);
            } else {
                d = d();
                DebugLog.LogS(b() + "destory =" + d);
            }
        }
        return d ? super.destroy() : d;
    }

    protected void e() throws Exception {
    }

    protected void finalize() throws Throwable {
        DebugLog.LogD(b() + " finalize called");
        super.finalize();
    }

    public int getSampleRate() {
        return this.mSessionParams.a("sample_rate", 16000);
    }
}
