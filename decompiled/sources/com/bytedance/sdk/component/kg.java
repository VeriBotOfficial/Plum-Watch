package com.bytedance.sdk.component;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes13.dex */
public class kg {
    private static final Object fxn = new Object();
    private static final LinkedList<Runnable> gff = new LinkedList<>();
    private static Object hm = new Object();
    private static volatile Handler kg;

    public static void fxn(Runnable runnable, boolean z) {
        try {
            Handler kg2 = kg();
            synchronized (fxn) {
                gff.add(runnable);
                if (z) {
                    kg2.sendEmptyMessageDelayed(1, 100L);
                } else {
                    kg2.sendEmptyMessage(1);
                }
            }
        } catch (OutOfMemoryError unused) {
        }
    }

    private static Handler kg() {
        Handler handler;
        if (kg == null) {
            synchronized (fxn) {
                if (kg == null) {
                    HandlerThread safeHandlerThread = com.bytedance.sdk.component.fxn.fxn != null ? com.bytedance.sdk.component.fxn.fxn.getSafeHandlerThread("queued-work-looper", -2) : null;
                    if (safeHandlerThread == null) {
                        safeHandlerThread = new HandlerThread("queued-work-looper", -2);
                        safeHandlerThread.start();
                    }
                    kg = new fxn(safeHandlerThread.getLooper());
                }
                handler = kg;
            }
            return handler;
        }
        return kg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void gff() {
        LinkedList linkedList;
        synchronized (hm) {
            synchronized (fxn) {
                LinkedList<Runnable> linkedList2 = gff;
                linkedList = (LinkedList) linkedList2.clone();
                linkedList2.clear();
                kg().removeMessages(1);
            }
            if (linkedList.size() > 0) {
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
        }
    }

    private static class fxn extends Handler {
        fxn(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                try {
                    kg.gff();
                } catch (OutOfMemoryError unused) {
                }
            }
        }
    }
}
