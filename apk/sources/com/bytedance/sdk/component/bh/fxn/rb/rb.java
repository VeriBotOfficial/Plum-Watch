package com.bytedance.sdk.component.bh.fxn.rb;

import com.xiaomi.mipush.sdk.Constants;
import java.util.UUID;

/* JADX INFO: loaded from: classes15.dex */
public abstract class rb implements Comparable<rb>, Runnable {
    private String gff;
    private int fxn = 5;
    private String kg = UUID.randomUUID().toString() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + String.valueOf(System.nanoTime());

    public rb(String str) {
        this.gff = str;
    }

    public void fxn(int r1) {
        this.fxn = r1;
    }

    public int fxn() {
        return this.fxn;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: fxn, reason: merged with bridge method [inline-methods] */
    public int compareTo(rb rbVar) {
        if (fxn() < rbVar.fxn()) {
            return 1;
        }
        return fxn() >= rbVar.fxn() ? -1 : 0;
    }
}
