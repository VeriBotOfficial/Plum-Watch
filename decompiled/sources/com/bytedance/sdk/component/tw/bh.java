package com.bytedance.sdk.component.tw;

import com.bytedance.sdk.component.tw.fxn;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes13.dex */
public class bh extends rb {
    private static volatile ThreadPoolExecutor bh;
    private static volatile ScheduledExecutorService dgx;
    private static volatile ThreadPoolExecutor hie;
    private static volatile ThreadPoolExecutor jq;
    public static gff kg;
    private static volatile ThreadPoolExecutor rb;

    /* renamed from: sg, reason: collision with root package name */
    private static volatile ThreadPoolExecutor f9398sg;
    private static volatile ThreadPoolExecutor tw;
    public static final int fxn = Runtime.getRuntime().availableProcessors();
    public static int gff = 120;
    public static boolean hm = true;

    public static ExecutorService kg() {
        if (rb == null) {
            synchronized (bh.class) {
                if (rb == null) {
                    rb = new fxn.C0487fxn().fxn("init").fxn(0).kg(10).fxn(5L).fxn(TimeUnit.SECONDS).fxn(new SynchronousQueue()).fxn(tw()).fxn(fxn().createThreadFactory(10, "init")).fxn();
                }
            }
        }
        return rb;
    }

    public static void fxn(tw twVar) {
        if (rb == null) {
            kg();
        }
        if (twVar == null || rb == null) {
            return;
        }
        rb.execute(twVar);
    }

    public static ExecutorService gff() {
        return fxn(10);
    }

    public static ExecutorService fxn(int i) {
        if (bh == null) {
            synchronized (bh.class) {
                if (bh == null) {
                    fxn fxn2 = new fxn.C0487fxn().fxn("io").fxn(2).kg(i).fxn(20L).fxn(TimeUnit.SECONDS).fxn(new LinkedBlockingQueue()).fxn(tw()).fxn(fxn().createThreadFactory(i, "io")).fxn();
                    bh = fxn2;
                    fxn2.allowCoreThreadTimeOut(true);
                }
            }
        }
        return bh;
    }

    public static void kg(tw twVar) {
        if (bh == null) {
            gff();
        }
        if (bh != null) {
            bh.execute(twVar);
        }
    }

    public static void fxn(tw twVar, int i) {
        kg(twVar);
    }

    public static void fxn(tw twVar, int i, int i2) {
        if (bh == null) {
            fxn(i2);
        }
        if (twVar == null || bh == null) {
            return;
        }
        twVar.setPriority(i);
        bh.execute(twVar);
    }

    public static ExecutorService hm() {
        if (tw == null) {
            synchronized (bh.class) {
                if (tw == null) {
                    fxn fxn2 = new fxn.C0487fxn().fxn("log").kg(10).fxn(4).fxn(20L).fxn(TimeUnit.SECONDS).fxn(new PriorityBlockingQueue()).fxn(tw()).fxn(fxn().createThreadFactory(10, "log")).fxn();
                    tw = fxn2;
                    fxn2.allowCoreThreadTimeOut(true);
                }
            }
        }
        return tw;
    }

    public static void gff(tw twVar) {
        if (tw == null) {
            hm();
        }
        if (twVar == null || tw == null) {
            return;
        }
        tw.execute(twVar);
    }

    public static void kg(tw twVar, int i) {
        if (twVar != null) {
            twVar.setPriority(i);
        }
        gff(twVar);
    }

    public static ExecutorService rb() {
        if (hie == null) {
            synchronized (bh.class) {
                if (hie == null) {
                    fxn fxn2 = new fxn.C0487fxn().fxn("aidl").kg(10).fxn(2).fxn(30L).fxn(TimeUnit.SECONDS).fxn(new PriorityBlockingQueue()).fxn(tw()).fxn(fxn().createThreadFactory(10, "aidl")).fxn();
                    hie = fxn2;
                    fxn2.allowCoreThreadTimeOut(true);
                }
            }
        }
        return hie;
    }

    public static void hm(tw twVar) {
        if (hie == null) {
            rb();
        }
        if (twVar == null || hie == null) {
            return;
        }
        hie.execute(twVar);
    }

    public static void gff(tw twVar, int i) {
        if (twVar != null) {
            twVar.setPriority(i);
        }
        hm(twVar);
    }

    public static ScheduledExecutorService bh() {
        if (dgx == null) {
            synchronized (bh.class) {
                if (dgx == null) {
                    dgx = Executors.newSingleThreadScheduledExecutor(fxn().createThreadFactory(5, "scheduled"));
                }
            }
        }
        return dgx;
    }

    public static boolean sg() {
        return hm;
    }

    public static void fxn(boolean z) {
        hm = z;
    }

    public static RejectedExecutionHandler tw() {
        return new RejectedExecutionHandler() { // from class: com.bytedance.sdk.component.tw.bh.1
            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            }
        };
    }

    public static gff jq() {
        return kg;
    }

    public static void fxn(gff gffVar) {
        kg = gffVar;
    }

    public static ExecutorService kg(int i) {
        if (f9398sg == null) {
            synchronized (bh.class) {
                if (f9398sg == null) {
                    fxn fxn2 = new fxn.C0487fxn().fxn("ad").fxn(2).kg(i).fxn(20L).fxn(TimeUnit.SECONDS).fxn(new LinkedBlockingQueue()).fxn(tw()).fxn(fxn().createThreadFactory(i, "ad")).fxn();
                    f9398sg = fxn2;
                    fxn2.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f9398sg;
    }

    public static void rb(tw twVar) {
        if (f9398sg == null) {
            kg(5);
        }
        if (twVar == null || f9398sg == null) {
            return;
        }
        f9398sg.execute(twVar);
    }

    public static ExecutorService hie() {
        if (jq == null) {
            synchronized (bh.class) {
                if (jq == null) {
                    fxn fxn2 = new fxn.C0487fxn().fxn("computation").fxn(3).kg(10).fxn(20L).fxn(TimeUnit.SECONDS).fxn(new PriorityBlockingQueue()).fxn(tw()).fxn(fxn().createThreadFactory(10, "computation")).fxn();
                    jq = fxn2;
                    fxn2.allowCoreThreadTimeOut(true);
                }
            }
        }
        return jq;
    }

    public static void gff(int i) {
        gff = i;
    }
}
