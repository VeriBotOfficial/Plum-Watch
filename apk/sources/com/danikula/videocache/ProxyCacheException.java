package com.danikula.videocache;

/* JADX INFO: loaded from: classes11.dex */
public class ProxyCacheException extends Exception {
    public ProxyCacheException(String str) {
        super(str);
    }

    public ProxyCacheException(String str, Throwable th) {
        super(str, th);
    }

    public ProxyCacheException(Throwable th) {
        super("No explanation error", th);
    }
}
