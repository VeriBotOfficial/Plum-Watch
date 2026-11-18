package com.qumeng.overseas.advlib.__remote__.framework.imageloader;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a<T> {
    public void onLoadFailed(Throwable th) {
    }

    public void onPreLoad(T t, byte[] bArr) {
    }

    public abstract void onResourceReady(T t);

    public void onResourceReady(T t, int r2) {
        onResourceReady(t);
    }
}
