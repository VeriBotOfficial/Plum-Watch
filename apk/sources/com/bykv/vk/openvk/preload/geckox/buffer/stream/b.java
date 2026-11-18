package com.bykv.vk.openvk.preload.geckox.buffer.stream;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: RandomOutputStream.java */
/* JADX INFO: loaded from: classes15.dex */
public abstract class b extends OutputStream {
    public abstract void write(long j, int r3) throws IOException;

    public abstract void write(long j, byte[] bArr) throws IOException;

    public abstract void write(long j, byte[] bArr, int r4, int r5) throws IOException;
}
