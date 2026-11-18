package com.sifli.siflicore.log;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes11.dex */
public final class SFLogManager {
    private static SFLogManager mInstance;
    private boolean logEnable = true;
    private WeakReference<SFLogManagerCallback> weakCallback;

    public interface SFLogManagerCallback {
        void onLog(int r1, String str);
    }

    public static SFLogManager getInstance() {
        if (mInstance == null) {
            mInstance = new SFLogManager();
        }
        return mInstance;
    }

    public boolean isLogEnable() {
        return this.logEnable;
    }

    public void setLogEnable(boolean z) {
        this.logEnable = z;
    }

    public void setCallback(SFLogManagerCallback sFLogManagerCallback) {
        this.weakCallback = new WeakReference<>(sFLogManagerCallback);
    }

    public SFLogManagerCallback getCallback() {
        WeakReference<SFLogManagerCallback> weakReference = this.weakCallback;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }
}
