package com.bytedance.adsdk.fxn.fxn;

/* JADX INFO: loaded from: classes15.dex */
public class kg extends RuntimeException {
    public kg(String str, Throwable th) {
        super("Unable to parse expression:".concat(String.valueOf(str)), th);
    }
}
