package com.bytedance.sdk.component.bh.fxn.kg;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.bh.fxn.fxn.rb;
import com.bytedance.sdk.component.bh.fxn.tw;

/* loaded from: classes13.dex */
public class fxn {
    public static long fxn(int i, Context context) {
        return kg(i, context);
    }

    private static long kg(int i, Context context) {
        if (context == null) {
            return i;
        }
        Runtime runtime = Runtime.getRuntime();
        long freeMemory = runtime.freeMemory() / 1048576;
        long maxMemory = (runtime.maxMemory() / 1048576) - (runtime.totalMemory() / 1048576);
        if (maxMemory <= 0) {
            if (freeMemory <= 2) {
                return 1L;
            }
            if (freeMemory <= 10) {
                return Math.min(i, 10);
            }
            return Math.min((freeMemory / 2) * 10, i);
        }
        long j = ((freeMemory + maxMemory) - 10) / 2;
        if (j <= 2) {
            return 1L;
        }
        if (j <= 10) {
            return Math.min(i, 10);
        }
        return Math.min(j * 10, i);
    }

    public static boolean fxn() {
        rb hm = tw.sg().hm();
        return (hm == null || TextUtils.isEmpty(hm.fxn())) ? false : true;
    }

    public static boolean kg() {
        rb hm = tw.sg().hm();
        return (hm == null || TextUtils.isEmpty(hm.kg())) ? false : true;
    }

    public static boolean gff() {
        rb hm = tw.sg().hm();
        return (hm == null || TextUtils.isEmpty(hm.hm())) ? false : true;
    }

    public static boolean hm() {
        rb hm = tw.sg().hm();
        return (hm == null || TextUtils.isEmpty(hm.rb())) ? false : true;
    }

    public static boolean rb() {
        rb hm = tw.sg().hm();
        return (hm == null || TextUtils.isEmpty(hm.gff())) ? false : true;
    }

    public static boolean bh() {
        rb hm = tw.sg().hm();
        return (hm == null || TextUtils.isEmpty(hm.bh())) ? false : true;
    }
}
