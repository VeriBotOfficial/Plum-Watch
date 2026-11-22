package com.bytedance.sdk.component.bh.fxn.sg;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.bh.fxn.rb;
import com.bytedance.sdk.component.bh.fxn.tw;

/* loaded from: classes13.dex */
public class fxn {
    private static volatile HandlerThread fxn = null;
    private static int gff = 3000;
    private static volatile Handler kg;

    static {
        gff();
    }

    private static void gff() {
        HandlerThread fxn2;
        rb xdg = tw.sg().xdg();
        if (xdg != null && (fxn2 = xdg.fxn("csj_ad_log", 10)) != null) {
            fxn = fxn2;
            return;
        }
        HandlerThread handlerThread = new HandlerThread("csj_ad_log", 10);
        fxn = handlerThread;
        handlerThread.start();
    }

    public static Handler fxn() {
        if (fxn == null || !fxn.isAlive()) {
            synchronized (fxn.class) {
                if (fxn == null || !fxn.isAlive()) {
                    gff();
                    kg = new Handler(fxn.getLooper());
                }
            }
        } else if (kg == null) {
            synchronized (fxn.class) {
                if (kg == null) {
                    kg = new Handler(fxn.getLooper());
                }
            }
        }
        return kg;
    }

    public static int kg() {
        if (gff <= 0) {
            gff = 3000;
        }
        return gff;
    }
}
