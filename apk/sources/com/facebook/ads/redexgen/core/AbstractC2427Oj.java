package com.facebook.ads.redexgen.core;

import android.view.MotionEvent;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Oj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2427Oj {
    public static boolean A00(MotionEvent motionEvent, int r1) {
        return (motionEvent.getSource() & r1) == r1;
    }
}
