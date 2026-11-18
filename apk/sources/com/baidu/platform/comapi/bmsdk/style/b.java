package com.baidu.platform.comapi.bmsdk.style;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: NinePatchChunk.java */
/* JADX INFO: loaded from: classes15.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f8555a = new int[4];
    public int[] b;
    public int[] c;
    public int[] d;

    private static void a(int[] r3, ByteBuffer byteBuffer) {
        int length = r3.length;
        for (int r1 = 0; r1 < length; r1++) {
            r3[r1] = byteBuffer.getInt();
        }
    }

    private static void a(int r3) {
        if (r3 == 0 || (r3 & 1) != 0) {
            throw new RuntimeException("invalid nine-patch: " + r3);
        }
    }

    public static b a(byte[] bArr) {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.nativeOrder());
        if (byteBufferOrder.get() == 0) {
            return null;
        }
        b bVar = new b();
        bVar.b = new int[byteBufferOrder.get()];
        bVar.c = new int[byteBufferOrder.get()];
        bVar.d = new int[byteBufferOrder.get()];
        a(bVar.b.length);
        a(bVar.c.length);
        byteBufferOrder.getInt();
        byteBufferOrder.getInt();
        bVar.f8555a[0] = byteBufferOrder.getInt();
        bVar.f8555a[1] = byteBufferOrder.getInt();
        bVar.f8555a[2] = byteBufferOrder.getInt();
        bVar.f8555a[3] = byteBufferOrder.getInt();
        byteBufferOrder.getInt();
        a(bVar.b, byteBufferOrder);
        a(bVar.c, byteBufferOrder);
        a(bVar.d, byteBufferOrder);
        return bVar;
    }
}
