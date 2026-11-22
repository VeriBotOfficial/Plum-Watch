package com.bytedance.sdk.component.bh.fxn.kg;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.component.bh.fxn.rb;
import com.bytedance.sdk.component.bh.fxn.tw;
import java.util.Comparator;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes13.dex */
public class hm {
    private final Comparator<com.bytedance.sdk.component.bh.fxn.hm.fxn> dgx;
    private volatile Handler hie;
    private volatile com.bytedance.sdk.component.bh.fxn.kg.gff.gff jq;
    private final PriorityBlockingQueue<com.bytedance.sdk.component.bh.fxn.hm.fxn> mvp;
    public static final hm fxn = new hm();
    public static final com.bytedance.sdk.component.bh.fxn.kg.fxn.fxn hm = new com.bytedance.sdk.component.bh.fxn.kg.fxn.fxn();
    public static final AtomicLong rb = new AtomicLong(0);
    public static final AtomicLong bh = new AtomicLong(0);

    /* renamed from: sg, reason: collision with root package name */
    public static final long f9359sg = System.currentTimeMillis();
    public static long tw = 0;
    public volatile boolean kg = false;
    public volatile boolean gff = false;

    public PriorityBlockingQueue<com.bytedance.sdk.component.bh.fxn.hm.fxn> fxn() {
        return this.mvp;
    }

    private hm() {
        Comparator<com.bytedance.sdk.component.bh.fxn.hm.fxn> comparator = new Comparator<com.bytedance.sdk.component.bh.fxn.hm.fxn>() { // from class: com.bytedance.sdk.component.bh.fxn.kg.hm.1
            @Override // java.util.Comparator
            /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
            public int compare(com.bytedance.sdk.component.bh.fxn.hm.fxn fxnVar, com.bytedance.sdk.component.bh.fxn.hm.fxn fxnVar2) {
                return hm.this.fxn(fxnVar, fxnVar2);
            }
        };
        this.dgx = comparator;
        this.mvp = new PriorityBlockingQueue<>(8, comparator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int fxn(com.bytedance.sdk.component.bh.fxn.hm.fxn fxnVar, com.bytedance.sdk.component.bh.fxn.hm.fxn fxnVar2) {
        long j;
        long j2;
        long j3;
        long j4;
        if (fxnVar == null) {
            return fxnVar2 == null ? 0 : -1;
        }
        if (fxnVar2 == null) {
            return 1;
        }
        if (fxnVar.rb() == fxnVar2.rb()) {
            if (fxnVar.fxn() != null) {
                j = fxnVar.fxn().fxn();
                j2 = fxnVar.fxn().kg();
            } else {
                j = 0;
                j2 = 0;
            }
            if (fxnVar2.fxn() != null) {
                j4 = fxnVar2.fxn().fxn();
                j3 = fxnVar2.fxn().kg();
            } else {
                j3 = 0;
                j4 = 0;
            }
            if (j == 0 || j4 == 0) {
                return 0;
            }
            long j5 = j - j4;
            if (Math.abs(j5) > 2147483647L) {
                return 0;
            }
            if (j5 != 0) {
                return (int) j5;
            }
            if (j2 == 0 || j3 == 0) {
                return 0;
            }
            return (int) (j2 - j3);
        }
        return fxnVar.rb() - fxnVar2.rb();
    }

    public void kg() {
        hm();
        rb();
    }

    public void fxn(Handler handler) {
        this.hie = handler;
    }

    public void gff() {
        if (this.jq == null || !this.jq.isAlive()) {
            return;
        }
        synchronized (this) {
            if (this.jq != null && this.jq.isAlive()) {
                if (this.hie != null) {
                    this.hie.removeCallbacksAndMessages(null);
                }
                this.jq.fxn(false);
                this.jq.quitSafely();
                this.jq = null;
            }
        }
    }

    public boolean hm() {
        try {
            if (this.jq != null || com.bytedance.sdk.component.bh.fxn.kg.kg()) {
                return false;
            }
            synchronized (this) {
                if (this.jq != null) {
                    return false;
                }
                this.jq = new com.bytedance.sdk.component.bh.fxn.kg.gff.gff(this.mvp);
                this.jq.start();
                return true;
            }
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    public void fxn(com.bytedance.sdk.component.bh.fxn.hm.fxn fxnVar, int i) {
        hm();
        rb xdg = tw.sg().xdg();
        com.bytedance.sdk.component.bh.fxn.kg.gff.gff gffVar = this.jq;
        if (gffVar != null) {
            fxn(xdg, fxnVar);
            gffVar.fxn(fxnVar, fxnVar.rb() == 4);
        }
    }

    private void fxn(final rb rbVar, com.bytedance.sdk.component.bh.fxn.hm.fxn fxnVar) {
        if (rbVar != null) {
            try {
                if (rbVar.sg()) {
                    final long kg = (fxnVar == null || fxnVar.fxn() == null) ? 0L : fxnVar.fxn().kg();
                    if (kg == 1) {
                        tw = System.currentTimeMillis();
                    }
                    AtomicLong hb = hm.hb();
                    com.bytedance.sdk.component.bh.fxn.gff.kg.fxn(hb, 1);
                    if (hb.get() == 200) {
                        try {
                            if (Looper.getMainLooper() == Looper.myLooper()) {
                                Executor hm2 = rbVar.hm();
                                if (hm2 == null) {
                                    hm2 = rbVar.rb();
                                }
                                if (hm2 != null) {
                                    hm2.execute(new com.bytedance.sdk.component.bh.fxn.rb.rb("report") { // from class: com.bytedance.sdk.component.bh.fxn.kg.hm.2
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            hm.this.fxn(rbVar, kg);
                                        }
                                    });
                                }
                            } else {
                                fxn(rbVar, kg);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fxn(rb rbVar, long j) {
        com.bytedance.sdk.component.bh.fxn.kg.gff.gff gffVar = this.jq;
        if (rbVar == null || gffVar == null) {
            return;
        }
        com.bytedance.sdk.component.bh.fxn.kg.fxn.fxn fxnVar = hm;
        gffVar.fxn(rbVar.fxn(fxnVar.kg(j)), true);
        fxnVar.ps();
    }

    public void rb() {
        com.bytedance.sdk.component.bh.fxn.gff.kg.fxn(hm.ij(), 1);
        final com.bytedance.sdk.component.bh.fxn.kg.gff.gff gffVar = this.jq;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (gffVar != null) {
                gffVar.gff(2);
                return;
            }
            return;
        }
        rb xdg = tw.sg().xdg();
        if (xdg != null) {
            Executor hm2 = xdg.hm();
            if (hm2 == null) {
                hm2 = xdg.rb();
            }
            if (hm2 != null) {
                hm2.execute(new com.bytedance.sdk.component.bh.fxn.rb.rb("flush") { // from class: com.bytedance.sdk.component.bh.fxn.kg.hm.3
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.component.bh.fxn.kg.gff.gff gffVar2 = gffVar;
                        if (gffVar2 != null) {
                            gffVar2.gff(2);
                        }
                    }
                });
            }
        }
    }
}
