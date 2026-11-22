package com.xiaomi.push;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.GZIPInputStream;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes4.dex */
public class ew {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f14574a = {BuiltinOptions.UniqueOptions, BuiltinOptions.WhereOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.FloorModOptions};

    /* renamed from: a, reason: collision with other field name */
    private byte f497a;

    /* renamed from: a, reason: collision with other field name */
    private int f498a;

    /* renamed from: a, reason: collision with other field name */
    private short f499a;
    private byte[] b;

    public interface b {
        byte a();

        byte[] a(byte[] bArr, int i);
    }

    public static final class c {
    }

    protected ew(byte b2, int i, byte[] bArr) {
        this((short) 1, b2, i, bArr);
    }

    protected ew(short s, byte b2, int i, byte[] bArr) {
        this.f499a = s;
        this.f497a = b2;
        this.f498a = i;
        this.b = bArr;
    }

    public static ew a(byte b2, int i, byte[] bArr) {
        return new ew(b2, i, bArr);
    }

    public static ew a(short s, byte b2, int i, byte[] bArr) {
        return new ew(s, b2, i, bArr);
    }

    public static ew a(byte[] bArr) {
        if (m12137a(bArr)) {
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
            order.getInt();
            short s = order.getShort();
            byte b2 = order.get();
            int i = order.getInt();
            byte[] bArr2 = new byte[order.getInt()];
            order.get(bArr2);
            return a(s, b2, i, bArr2);
        }
        return a((byte) 0, bArr.length, bArr);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m12137a(byte[] bArr) {
        byte[] bArr2 = f14574a;
        return a(bArr2, bArr, bArr2.length);
    }

    public static boolean a(byte[] bArr, byte[] bArr2, int i) {
        if (bArr.length < i || bArr2.length < i) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static final class d implements b {
        @Override // com.xiaomi.push.ew.b
        public byte a() {
            return (byte) 2;
        }

        @Override // com.xiaomi.push.ew.b
        public byte[] a(byte[] bArr, int i) {
            GZIPInputStream gZIPInputStream = null;
            try {
                GZIPInputStream gZIPInputStream2 = new GZIPInputStream(new ByteArrayInputStream(bArr), i);
                try {
                    byte[] bArr2 = new byte[i];
                    gZIPInputStream2.read(bArr2);
                    try {
                        gZIPInputStream2.close();
                    } catch (IOException unused) {
                    }
                    return bArr2;
                } catch (IOException unused2) {
                    gZIPInputStream = gZIPInputStream2;
                    if (gZIPInputStream != null) {
                        try {
                            gZIPInputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return bArr;
                } catch (Throwable th) {
                    th = th;
                    gZIPInputStream = gZIPInputStream2;
                    if (gZIPInputStream != null) {
                        try {
                            gZIPInputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused5) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f14575a = new c();

        /* renamed from: a, reason: collision with other field name */
        public static final d f500a = new d();

        public static byte[] a(byte[] bArr) {
            return a(bArr, f500a);
        }

        public static byte[] a(byte[] bArr, b bVar) {
            if (!ew.m12137a(bArr)) {
                return bArr;
            }
            ew a2 = ew.a(bArr);
            return (a2.f497a == 0 || a2.f497a != bVar.a()) ? a2.b : bVar.a(a2.b, a2.f498a);
        }
    }
}
