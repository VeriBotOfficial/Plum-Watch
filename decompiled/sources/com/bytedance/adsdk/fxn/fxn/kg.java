package com.bytedance.adsdk.fxn.fxn;

/* loaded from: classes13.dex */
public class kg extends RuntimeException {
    public kg(String str, Throwable th) {
        super("Unable to parse expression:".concat(String.valueOf(str)), th);
    }
}
