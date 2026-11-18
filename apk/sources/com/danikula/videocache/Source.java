package com.danikula.videocache;

/* JADX INFO: loaded from: classes11.dex */
public interface Source {
    void close() throws ProxyCacheException;

    long length() throws ProxyCacheException;

    void open(long j) throws ProxyCacheException;

    int read(byte[] bArr) throws ProxyCacheException;
}
