package com.bytedance.adsdk.ugeno.sg;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes13.dex */
public class jq extends Handler {
    private final WeakReference<fxn> fxn;

    public interface fxn {
        void fxn(Message message);
    }

    public jq(Looper looper, fxn fxnVar) {
        super(looper);
        this.fxn = new WeakReference<>(fxnVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        fxn fxnVar = this.fxn.get();
        if (fxnVar == null || message == null) {
            return;
        }
        fxnVar.fxn(message);
    }
}
