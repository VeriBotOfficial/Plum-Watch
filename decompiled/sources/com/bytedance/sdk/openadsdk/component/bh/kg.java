package com.bytedance.sdk.openadsdk.component.bh;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes14.dex */
public class kg implements Handler.Callback {
    private long dgx;
    private fxn gff;
    private long hie;
    private final com.bytedance.sdk.openadsdk.component.tw.fxn kg;
    private boolean mvp;

    /* renamed from: sg, reason: collision with root package name */
    private boolean f9439sg;
    private Handler fxn = new Handler(Looper.myLooper(), this);
    private int hm = 0;
    private int rb = 5;
    private int bh = 0;
    private final int tw = 1000;
    private int jq = 1000;

    public kg(com.bytedance.sdk.openadsdk.component.tw.fxn fxnVar) {
        this.kg = fxnVar;
    }

    public void fxn(int i) {
        this.hm = i;
        int i2 = this.rb - i;
        this.kg.kg(i2);
        boolean z = true;
        if (i <= 0) {
            fxn fxnVar = this.gff;
            if (fxnVar != null && !this.f9439sg) {
                fxnVar.kg();
                this.f9439sg = true;
            }
            i = 0;
        }
        fxn fxnVar2 = this.gff;
        if (fxnVar2 != null) {
            int i3 = this.bh;
            int i4 = i3 - i2;
            if (i != 0 && i2 < i3) {
                z = false;
            }
            fxnVar2.fxn(i4, z);
        }
    }

    public void fxn(float f) {
        int i = (int) f;
        this.rb = i;
        if (i <= 0) {
            this.rb = 5;
        }
    }

    public void fxn(fxn fxnVar) {
        this.gff = fxnVar;
    }

    public int fxn() {
        return this.bh;
    }

    public void kg(int i) {
        this.bh = Math.min(i, this.rb);
    }

    public void kg() {
        Handler handler = this.fxn;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(100, this.rb, 0));
        }
    }

    public void gff() {
        if (this.fxn != null) {
            Message obtain = Message.obtain();
            obtain.what = 100;
            obtain.arg1 = this.hm;
            this.fxn.sendMessage(obtain);
        }
    }

    public void hm() {
        Handler handler = this.fxn;
        if (handler != null) {
            handler.removeMessages(100);
        }
    }

    public void rb() {
        this.fxn.removeCallbacksAndMessages(null);
        this.fxn = null;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 100 && this.fxn != null) {
            int i = message.arg1;
            fxn(i);
            if (i > 0) {
                Message obtain = Message.obtain();
                obtain.what = 100;
                obtain.arg1 = i - 1;
                this.fxn.sendMessageDelayed(obtain, this.jq);
            }
        }
        return true;
    }

    public void fxn(int i, float f, boolean z) {
        com.bytedance.sdk.openadsdk.component.tw.fxn fxnVar;
        if ((i == 1 || i == 2) && this.mvp != z) {
            this.mvp = z;
            if (i == 1 && (fxnVar = this.kg) != null) {
                fxnVar.fxn(z);
            }
            if (z) {
                try {
                    this.jq = (int) (1000.0f / f);
                    this.dgx = System.currentTimeMillis();
                    return;
                } catch (Throwable unused) {
                }
            } else {
                long currentTimeMillis = this.hie + (System.currentTimeMillis() - this.dgx);
                this.hie = currentTimeMillis;
                com.bytedance.sdk.openadsdk.component.tw.fxn fxnVar2 = this.kg;
                if (fxnVar2 != null) {
                    fxnVar2.fxn(currentTimeMillis);
                }
            }
            this.jq = 1000;
        }
    }
}
