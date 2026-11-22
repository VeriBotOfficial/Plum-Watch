package com.bytedance.sdk.component.tw.fxn;

import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.mve;
import java.lang.ref.WeakReference;

/* loaded from: classes13.dex */
public class kg extends mve implements gff {
    private final HandlerThread kg;

    kg(HandlerThread handlerThread, mve.fxn fxnVar) {
        super(handlerThread.getLooper(), fxnVar);
        this.kg = handlerThread;
    }

    @Override // com.bytedance.sdk.component.tw.fxn.gff
    public void fxn() {
        removeCallbacksAndMessages(null);
        if (this.fxn != null) {
            this.fxn.clear();
            this.fxn = null;
        }
    }

    public void fxn(mve.fxn fxnVar) {
        this.fxn = new WeakReference<>(fxnVar);
    }

    public void kg() {
        HandlerThread handlerThread = this.kg;
        if (handlerThread != null) {
            handlerThread.quit();
        }
    }
}
