package com.bytedance.sdk.component.bh.fxn.gff;

import com.bytedance.sdk.component.bh.fxn.rb;
import com.bytedance.sdk.component.bh.fxn.tw;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes13.dex */
public class kg {
    public static void fxn(AtomicLong atomicLong, int i) {
        rb xdg = tw.sg().xdg();
        if (xdg == null || !xdg.sg() || atomicLong == null) {
            return;
        }
        atomicLong.getAndAdd(i);
    }
}
