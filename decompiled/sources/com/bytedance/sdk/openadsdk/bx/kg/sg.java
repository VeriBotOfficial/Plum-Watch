package com.bytedance.sdk.openadsdk.bx.kg;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.sdk.component.utils.dx;

/* loaded from: classes14.dex */
public class sg {
    private static fxn fxn;
    private static HandlerThread kg;

    public static void fxn() {
    }

    public static void fxn(kg kgVar) {
        if (kgVar == null) {
            return;
        }
        kg();
        fxn fxnVar = fxn;
        if (fxnVar != null) {
            fxnVar.fxn(kgVar);
        }
    }

    public static void kg(kg kgVar) {
        if (kgVar == null || fxn == null) {
            return;
        }
        try {
            int intValue = kgVar.dgx().intValue();
            if (fxn.hasMessages(intValue)) {
                fxn.removeMessages(intValue);
            }
        } catch (Exception unused) {
        }
    }

    public static void kg() {
        if (fxn != null) {
            return;
        }
        try {
            HandlerThread handlerThread = kg;
            if (handlerThread != null && handlerThread.isAlive()) {
                return;
            }
            synchronized (sg.class) {
                HandlerThread handlerThread2 = kg;
                if (handlerThread2 == null || !handlerThread2.isAlive()) {
                    kg = com.bytedance.sdk.component.utils.tw.fxn("csj_MRC");
                    fxn = new fxn(kg.getLooper());
                }
            }
        } catch (Throwable th) {
            dx.gff("MRC", th.getMessage());
        }
    }

    private static class fxn extends Handler {
        public fxn(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            kg kgVar = (kg) message.obj;
            if (kgVar == null) {
                return;
            }
            int kg = kgVar.kg();
            if (kg == 1) {
                kgVar.sg();
            } else if (kg == 2) {
                kgVar.tw();
            } else {
                rb.kg(kgVar.dgx());
                return;
            }
            if (kgVar.jq()) {
                rb.kg(kgVar.dgx());
            } else if (kgVar.mvp()) {
                fxn(kgVar);
            }
        }

        public void fxn(kg kgVar) {
            if (kgVar == null) {
                return;
            }
            int intValue = kgVar.dgx().intValue();
            if (hasMessages(intValue)) {
                return;
            }
            Message obtain = Message.obtain();
            obtain.what = intValue;
            obtain.obj = kgVar;
            sendMessageDelayed(obtain, kgVar.bh());
        }
    }
}
