package com.bytedance.sdk.component.tw.fxn;

import android.os.Handler;
import com.bytedance.sdk.component.utils.mve;
import com.bytedance.sdk.component.utils.tw;

/* loaded from: classes13.dex */
public class fxn {
    private final hm<kg> fxn;
    private Handler kg;

    private fxn() {
        this.fxn = hm.fxn(2);
    }

    public static fxn fxn() {
        return C0488fxn.fxn;
    }

    /* renamed from: com.bytedance.sdk.component.tw.fxn.fxn$fxn, reason: collision with other inner class name */
    private static class C0488fxn {
        private static final fxn fxn = new fxn();
    }

    public Handler kg() {
        if (this.kg == null) {
            synchronized (fxn.class) {
                if (this.kg == null) {
                    this.kg = fxn("csj_io_handler");
                }
            }
        }
        return this.kg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fxn(final Handler handler, final Handler handler2) {
        if (handler.getLooper().getQueue().isIdle()) {
            handler.removeCallbacksAndMessages(null);
            handler.getLooper().quit();
        } else {
            handler2.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.tw.fxn.fxn.1
                @Override // java.lang.Runnable
                public void run() {
                    fxn.this.fxn(handler, handler2);
                }
            }, 1000L);
        }
    }

    public mve fxn(mve.fxn fxnVar, final String str) {
        kg fxn = this.fxn.fxn();
        if (fxn != null) {
            fxn.fxn(fxnVar);
            fxn.post(new Runnable() { // from class: com.bytedance.sdk.component.tw.fxn.fxn.2
                @Override // java.lang.Runnable
                public void run() {
                    Thread.currentThread().setName(str);
                }
            });
            return fxn;
        }
        return kg(fxnVar, str);
    }

    public mve fxn(String str) {
        return fxn((mve.fxn) null, str);
    }

    private kg kg(mve.fxn fxnVar, String str) {
        return new kg(tw.fxn(str), fxnVar);
    }

    public boolean fxn(mve mveVar) {
        if (!(mveVar instanceof kg)) {
            return false;
        }
        kg kgVar = (kg) mveVar;
        if (this.fxn.fxn((hm<kg>) kgVar)) {
            return true;
        }
        kgVar.kg();
        return true;
    }
}
