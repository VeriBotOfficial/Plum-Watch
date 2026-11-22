package com.iflytek.cloud;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.iflytek.cloud.a.f.d;
import com.iflytek.cloud.c.a.b;
import com.iflytek.cloud.msc.util.log.DebugLog;

/* loaded from: classes17.dex */
public class FaceRequest extends d {

    /* renamed from: a, reason: collision with root package name */
    private b f11071a;
    private Context b;

    protected class a implements RequestListener {

        /* renamed from: a, reason: collision with root package name */
        private RequestListener f11072a;
        private Handler b = new HandlerC0638a(Looper.getMainLooper());

        /* renamed from: com.iflytek.cloud.FaceRequest$a$a, reason: collision with other inner class name */
        class HandlerC0638a extends Handler {
            HandlerC0638a(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (a.this.f11072a == null) {
                    return;
                }
                DebugLog.LogD("SpeechListener onMsg = " + message.what);
                int i = message.what;
                if (i == 0) {
                    a.this.f11072a.onEvent(message.arg1, (Bundle) message.obj);
                } else if (i == 1) {
                    a.this.f11072a.onBufferReceived((byte[]) message.obj);
                } else if (i == 2) {
                    a.this.f11072a.onCompleted((SpeechError) message.obj);
                }
                super.handleMessage(message);
            }
        }

        public a(RequestListener requestListener) {
            this.f11072a = null;
            this.f11072a = requestListener;
        }

        @Override // com.iflytek.cloud.RequestListener
        public void onBufferReceived(byte[] bArr) {
            this.b.sendMessage(this.b.obtainMessage(1, bArr));
        }

        @Override // com.iflytek.cloud.RequestListener
        public void onCompleted(SpeechError speechError) {
            this.b.sendMessage(this.b.obtainMessage(2, speechError));
        }

        @Override // com.iflytek.cloud.RequestListener
        public void onEvent(int i, Bundle bundle) {
            this.b.sendMessage(this.b.obtainMessage(0, i, 0, bundle));
        }
    }

    public FaceRequest(Context context) {
        this.b = context;
    }

    public void cancel() {
        synchronized (this) {
            b bVar = this.f11071a;
            if (bVar != null) {
                bVar.cancel();
                this.f11071a = null;
            }
        }
    }

    @Override // com.iflytek.cloud.a.f.d
    public boolean destroy() {
        boolean destroy = this.f11071a.destroy();
        return destroy ? super.destroy() : destroy;
    }

    @Override // com.iflytek.cloud.a.f.d
    public String getParameter(String str) {
        return super.getParameter(str);
    }

    public int sendRequest(byte[] bArr, RequestListener requestListener) {
        int sendRequest;
        synchronized (this) {
            b bVar = this.f11071a;
            if (bVar != null) {
                bVar.cancel();
                this.f11071a = null;
            }
            b bVar2 = new b(this.b, this.mSessionParams);
            this.f11071a = bVar2;
            sendRequest = bVar2.sendRequest(bArr, new a(requestListener));
        }
        return sendRequest;
    }

    @Override // com.iflytek.cloud.a.f.d
    public boolean setParameter(String str, String str2) {
        return super.setParameter(str, str2);
    }
}
