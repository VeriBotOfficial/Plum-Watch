package com.bytedance.sdk.openadsdk.core.tw;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.openadsdk.core.rmu;
import com.bytedance.sdk.openadsdk.core.settings.bh;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes14.dex */
public class fxn {
    private static volatile fxn fxn;
    private static volatile long gff;
    private static volatile boolean kg;
    private Handler rb;
    private final Queue<C0529fxn> hm = new LinkedList();
    private final bh bh = rmu.hm();

    private fxn() {
    }

    public static fxn fxn() {
        if (fxn == null) {
            synchronized (fxn.class) {
                if (fxn == null) {
                    fxn = new fxn();
                }
            }
        }
        return fxn;
    }

    private synchronized boolean kg(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        int ums = this.bh.ums();
        long dx = this.bh.dx();
        if (this.hm.size() > 0 && this.hm.size() >= ums) {
            long abs = Math.abs(currentTimeMillis - this.hm.peek().fxn);
            if (abs <= dx) {
                kg(dx - abs);
                return true;
            }
            this.hm.poll();
            this.hm.offer(new C0529fxn(currentTimeMillis, str));
        } else {
            this.hm.offer(new C0529fxn(currentTimeMillis, str));
        }
        return false;
    }

    public synchronized boolean fxn(String str) {
        if (kg(str)) {
            fxn(true);
            fxn(gff);
        } else {
            fxn(false);
        }
        return kg;
    }

    private synchronized void fxn(long j) {
        if (this.rb == null) {
            this.rb = new Handler(Looper.getMainLooper());
        }
        this.rb.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.tw.fxn.1
            @Override // java.lang.Runnable
            public void run() {
                fxn.this.fxn(false);
            }
        }, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void fxn(boolean z) {
        kg = z;
    }

    public synchronized boolean kg() {
        return kg;
    }

    private synchronized void kg(long j) {
        gff = j;
    }

    public synchronized String gff() {
        String str;
        HashMap hashMap = new HashMap();
        for (C0529fxn c0529fxn : this.hm) {
            if (hashMap.containsKey(c0529fxn.kg)) {
                hashMap.put(c0529fxn.kg, Integer.valueOf(((Integer) hashMap.get(c0529fxn.kg)).intValue() + 1));
            } else {
                hashMap.put(c0529fxn.kg, 1);
            }
        }
        str = "";
        int i = Integer.MIN_VALUE;
        for (String str2 : hashMap.keySet()) {
            int intValue = ((Integer) hashMap.get(str2)).intValue();
            if (i < intValue) {
                str = str2;
                i = intValue;
            }
        }
        return str;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.tw.fxn$fxn, reason: collision with other inner class name */
    private static class C0529fxn {
        private final long fxn;
        private final String kg;

        private C0529fxn(long j, String str) {
            this.fxn = j;
            this.kg = str;
        }
    }
}
