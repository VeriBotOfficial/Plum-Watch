package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes13.dex */
public class mve extends Handler {
    protected WeakReference<fxn> fxn;

    public interface fxn {
        void fxn(Message message);
    }

    public mve(fxn fxnVar) {
        if (fxnVar != null) {
            this.fxn = new WeakReference<>(fxnVar);
        }
    }

    public mve(Looper looper, fxn fxnVar) {
        super(looper);
        if (fxnVar != null) {
            this.fxn = new WeakReference<>(fxnVar);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        fxn fxnVar;
        WeakReference<fxn> weakReference = this.fxn;
        if (weakReference == null || (fxnVar = weakReference.get()) == null || message == null) {
            return;
        }
        fxnVar.fxn(message);
    }
}
