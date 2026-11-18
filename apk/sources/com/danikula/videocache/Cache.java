package com.danikula.videocache;

/* JADX INFO: loaded from: classes11.dex */
public interface Cache {
    void append(byte[] bArr, int r2) throws ProxyCacheException;

    long available() throws ProxyCacheException;

    void close() throws ProxyCacheException;

    void complete() throws ProxyCacheException;

    boolean isCompleted();

    int read(byte[] bArr, long j, int r4) throws ProxyCacheException;
}
