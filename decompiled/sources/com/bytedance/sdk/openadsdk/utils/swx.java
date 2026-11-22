package com.bytedance.sdk.openadsdk.utils;

import android.os.SystemClock;

/* loaded from: classes14.dex */
public class swx {
    public long fxn;
    private long kg;

    public long fxn() {
        return this.kg;
    }

    private swx(boolean z) {
        if (z) {
            rb();
        }
    }

    public static swx kg() {
        return new swx(true);
    }

    public static swx gff() {
        return new swx(false);
    }

    public long hm() {
        return SystemClock.elapsedRealtime() - this.kg;
    }

    public long fxn(swx swxVar) {
        return Math.abs(swxVar.kg - this.kg);
    }

    public void rb() {
        this.fxn = System.currentTimeMillis();
        this.kg = SystemClock.elapsedRealtime();
    }

    public boolean bh() {
        return this.kg > 0;
    }

    public String toString() {
        return String.valueOf(this.fxn);
    }
}
