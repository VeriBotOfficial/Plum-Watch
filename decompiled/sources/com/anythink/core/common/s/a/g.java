package com.anythink.core.common.s.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.anythink.core.common.d.t;
import com.facebook.cache.disk.DefaultDiskStorage;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public final class g extends com.anythink.core.common.s.a.a {
    public static final int S = 0;
    public static final int T = 1;
    public static final int U = 2;
    private static final String W = "g";
    boolean V;
    private FileChannel X;
    private FileChannel Y;
    private MappedByteBuffer Z;
    private MappedByteBuffer aa;
    private int ab;
    private int ac;

    g(String str, String str2, com.anythink.core.common.s.a.a.b[] bVarArr, com.anythink.core.common.s.a.a.a aVar, int i) {
        super(str, str2, bVarArr, aVar);
        this.V = true;
        this.ac = i;
        k();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x01f7 A[Catch: all -> 0x0258, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x000f, B:8:0x0013, B:10:0x004b, B:13:0x0051, B:16:0x0059, B:18:0x007b, B:21:0x008d, B:24:0x00aa, B:25:0x00b9, B:28:0x00ca, B:29:0x00ce, B:31:0x00f8, B:33:0x0101, B:35:0x0112, B:37:0x0124, B:39:0x012a, B:41:0x0130, B:43:0x01f3, B:45:0x01f7, B:46:0x0200, B:48:0x0204, B:49:0x0208, B:51:0x020c, B:52:0x0214, B:54:0x0218, B:59:0x0136, B:61:0x0154, B:63:0x015d, B:65:0x0176, B:66:0x0183, B:68:0x01a0, B:70:0x01a6, B:71:0x01bc, B:81:0x01e7, B:75:0x00a5, B:76:0x0088, B:78:0x01c6, B:79:0x01d2), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0204 A[Catch: all -> 0x0258, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x000f, B:8:0x0013, B:10:0x004b, B:13:0x0051, B:16:0x0059, B:18:0x007b, B:21:0x008d, B:24:0x00aa, B:25:0x00b9, B:28:0x00ca, B:29:0x00ce, B:31:0x00f8, B:33:0x0101, B:35:0x0112, B:37:0x0124, B:39:0x012a, B:41:0x0130, B:43:0x01f3, B:45:0x01f7, B:46:0x0200, B:48:0x0204, B:49:0x0208, B:51:0x020c, B:52:0x0214, B:54:0x0218, B:59:0x0136, B:61:0x0154, B:63:0x015d, B:65:0x0176, B:66:0x0183, B:68:0x01a0, B:70:0x01a6, B:71:0x01bc, B:81:0x01e7, B:75:0x00a5, B:76:0x0088, B:78:0x01c6, B:79:0x01d2), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x020c A[Catch: all -> 0x0258, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x000f, B:8:0x0013, B:10:0x004b, B:13:0x0051, B:16:0x0059, B:18:0x007b, B:21:0x008d, B:24:0x00aa, B:25:0x00b9, B:28:0x00ca, B:29:0x00ce, B:31:0x00f8, B:33:0x0101, B:35:0x0112, B:37:0x0124, B:39:0x012a, B:41:0x0130, B:43:0x01f3, B:45:0x01f7, B:46:0x0200, B:48:0x0204, B:49:0x0208, B:51:0x020c, B:52:0x0214, B:54:0x0218, B:59:0x0136, B:61:0x0154, B:63:0x015d, B:65:0x0176, B:66:0x0183, B:68:0x01a0, B:70:0x01a6, B:71:0x01bc, B:81:0x01e7, B:75:0x00a5, B:76:0x0088, B:78:0x01c6, B:79:0x01d2), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0218 A[Catch: all -> 0x0258, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x000f, B:8:0x0013, B:10:0x004b, B:13:0x0051, B:16:0x0059, B:18:0x007b, B:21:0x008d, B:24:0x00aa, B:25:0x00b9, B:28:0x00ca, B:29:0x00ce, B:31:0x00f8, B:33:0x0101, B:35:0x0112, B:37:0x0124, B:39:0x012a, B:41:0x0130, B:43:0x01f3, B:45:0x01f7, B:46:0x0200, B:48:0x0204, B:49:0x0208, B:51:0x020c, B:52:0x0214, B:54:0x0218, B:59:0x0136, B:61:0x0154, B:63:0x015d, B:65:0x0176, B:66:0x0183, B:68:0x01a0, B:70:0x01a6, B:71:0x01bc, B:81:0x01e7, B:75:0x00a5, B:76:0x0088, B:78:0x01c6, B:79:0x01d2), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void k() {
        /*
            Method dump skipped, instructions count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.s.a.g.k():void");
    }

    @Override // com.anythink.core.common.s.a.a
    protected final void a(g gVar) {
        MappedByteBuffer mappedByteBuffer;
        f fVar = gVar.E;
        if (this.ac == 0) {
            int length = fVar.f4316a.length;
            MappedByteBuffer mappedByteBuffer2 = this.Z;
            if (mappedByteBuffer2 != null && mappedByteBuffer2.capacity() == length && (mappedByteBuffer = this.aa) != null && mappedByteBuffer.capacity() == length) {
                this.Z.position(0);
                this.Z.put(fVar.f4316a, 0, this.A);
                this.aa.position(0);
                this.aa.put(fVar.f4316a, 0, this.A);
            } else if (!a(fVar)) {
                this.ac = 1;
            }
        }
        if (this.ac != 0) {
            s();
        }
    }

    private void l() {
        long j;
        File file = new File(this.v, this.w + ".kva");
        File file2 = new File(this.v, this.w + ".kvb");
        try {
            if (l.a(file) && l.a(file2)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
                long length = randomAccessFile.length();
                long length2 = randomAccessFile2.length();
                this.X = randomAccessFile.getChannel();
                this.Y = randomAccessFile2.getChannel();
                try {
                    MappedByteBuffer map = this.X.map(FileChannel.MapMode.READ_WRITE, 0L, length > 0 ? length : r);
                    this.Z = map;
                    map.order(ByteOrder.LITTLE_ENDIAN);
                    MappedByteBuffer map2 = this.Y.map(FileChannel.MapMode.READ_WRITE, 0L, length2 > 0 ? length2 : r);
                    this.aa = map2;
                    map2.order(ByteOrder.LITTLE_ENDIAN);
                    this.E = new f(this.Z.capacity());
                    if (length == 0 && length2 == 0) {
                        this.A = 12;
                        return;
                    }
                    int i = this.Z.getInt();
                    int i2 = i & (-1073741825);
                    boolean b = b(i);
                    long j2 = this.Z.getLong();
                    int i3 = this.aa.getInt();
                    int i4 = (-1073741825) & i3;
                    boolean b2 = b(i3);
                    long j3 = this.aa.getLong();
                    if (i2 < 0 || i2 > length - 12) {
                        j = 12;
                    } else {
                        this.A = i2 + 12;
                        this.Z.rewind();
                        j = 12;
                        this.Z.get(this.E.f4316a, 0, this.A);
                        if (j2 == this.E.b(12, i2) && a(b)) {
                            this.B = j2;
                            if (length == length2 && m()) {
                                return;
                            }
                            b(new Exception("B file error"));
                            a(this.Z, this.aa, this.A);
                            return;
                        }
                    }
                    if (i4 >= 0 && i4 <= length2 - j) {
                        this.C.clear();
                        e();
                        this.A = i4 + 12;
                        if (this.E.f4316a.length != this.aa.capacity()) {
                            this.E = new f(this.aa.capacity());
                        }
                        this.aa.rewind();
                        this.aa.get(this.E.f4316a, 0, this.A);
                        if (j3 == this.E.b(12, i4) && a(b2)) {
                            b(new Exception("A file error"));
                            a(this.aa, this.Z, this.A);
                            this.B = j3;
                            return;
                        }
                    }
                    b("both files error");
                    v();
                    return;
                } catch (IOException e) {
                    a(e);
                    u();
                    a(file, file2);
                    return;
                }
            }
            a(new Exception("open file failed"));
            u();
        } catch (Exception e2) {
            a(e2);
            c();
            u();
        }
    }

    private boolean m() {
        f fVar = new f(this.A);
        this.aa.rewind();
        this.aa.get(fVar.f4316a, 0, this.A);
        byte[] bArr = this.E.f4316a;
        byte[] bArr2 = fVar.f4316a;
        for (int i = 0; i < this.A; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    private boolean n() {
        File file = new File(this.v, this.w + ".kvc");
        File file2 = new File(this.v, this.w + DefaultDiskStorage.FileType.TEMP);
        boolean z = false;
        try {
            if (!file.exists()) {
                file = file2.exists() ? file2 : null;
            }
            if (file != null) {
                if (a(file)) {
                    if (this.ac == 0) {
                        if (a(this.E)) {
                            c("recover from c file");
                            try {
                                b();
                                return true;
                            } catch (Exception e) {
                                e = e;
                                z = true;
                                a(e);
                                return z;
                            }
                        }
                        this.ac = 1;
                        return false;
                    }
                } else {
                    c();
                    b();
                    return false;
                }
            } else if (this.ac != 0) {
                File file3 = new File(this.v, this.w + ".kva");
                File file4 = new File(this.v, this.w + ".kvb");
                if (file3.exists() && file4.exists()) {
                    a(file3, file4);
                }
            }
            return false;
        } catch (Exception e2) {
            e = e2;
        }
    }

    private boolean a(f fVar) {
        Exception exc;
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2;
        try {
            int length = fVar.f4316a.length;
            File file = new File(this.v, this.w + ".kva");
            File file2 = new File(this.v, this.w + ".kvb");
            if (!l.a(file) || !l.a(file2)) {
                throw new Exception("open file failed");
            }
            randomAccessFile2 = new RandomAccessFile(file, "rw");
            long j = length;
            try {
                randomAccessFile2.setLength(j);
                FileChannel channel = randomAccessFile2.getChannel();
                this.X = channel;
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_WRITE, 0L, j);
                this.Z = map;
                map.order(ByteOrder.LITTLE_ENDIAN);
                this.Z.put(fVar.f4316a, 0, this.A);
                randomAccessFile = new RandomAccessFile(file2, "rw");
            } catch (Exception e) {
                exc = e;
                randomAccessFile = null;
            }
            try {
                randomAccessFile.setLength(j);
                FileChannel channel2 = randomAccessFile.getChannel();
                this.Y = channel2;
                MappedByteBuffer map2 = channel2.map(FileChannel.MapMode.READ_WRITE, 0L, j);
                this.aa = map2;
                map2.order(ByteOrder.LITTLE_ENDIAN);
                this.aa.put(fVar.f4316a, 0, this.A);
                return true;
            } catch (Exception e2) {
                exc = e2;
                l.a(randomAccessFile2);
                l.a(randomAccessFile);
                this.X = null;
                this.Y = null;
                this.Z = null;
                this.aa = null;
                a(exc);
                return false;
            }
        } catch (Exception e3) {
            exc = e3;
            randomAccessFile = null;
            randomAccessFile2 = null;
        }
    }

    private void a(MappedByteBuffer mappedByteBuffer, MappedByteBuffer mappedByteBuffer2, int i) {
        if (mappedByteBuffer.capacity() != mappedByteBuffer2.capacity()) {
            try {
                MappedByteBuffer map = (mappedByteBuffer2 == this.aa ? this.Y : this.X).map(FileChannel.MapMode.READ_WRITE, 0L, mappedByteBuffer.capacity());
                map.order(ByteOrder.LITTLE_ENDIAN);
                if (mappedByteBuffer2 == this.aa) {
                    this.aa = map;
                } else {
                    this.Z = map;
                }
                mappedByteBuffer2 = map;
            } catch (IOException e) {
                a(e);
                u();
                return;
            }
        }
        mappedByteBuffer.rewind();
        mappedByteBuffer2.rewind();
        mappedByteBuffer.limit(i);
        mappedByteBuffer2.put(mappedByteBuffer);
        mappedByteBuffer.limit(mappedByteBuffer.capacity());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[Catch: all -> 0x0097, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0007, B:10:0x0011, B:12:0x0027, B:14:0x0051, B:16:0x0059, B:17:0x007d, B:19:0x0082, B:21:0x0086, B:22:0x008a, B:23:0x008f, B:25:0x0076, B:26:0x003b, B:28:0x004b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0082 A[Catch: all -> 0x0097, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0007, B:10:0x0011, B:12:0x0027, B:14:0x0051, B:16:0x0059, B:17:0x007d, B:19:0x0082, B:21:0x0086, B:22:0x008a, B:23:0x008f, B:25:0x0076, B:26:0x003b, B:28:0x004b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076 A[Catch: all -> 0x0097, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0007, B:10:0x0011, B:12:0x0027, B:14:0x0051, B:16:0x0059, B:17:0x007d, B:19:0x0082, B:21:0x0086, B:22:0x008a, B:23:0x008f, B:25:0x0076, B:26:0x003b, B:28:0x004b), top: B:2:0x0001 }] */
    @Override // android.content.SharedPreferences.Editor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized android.content.SharedPreferences.Editor remove(java.lang.String r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.J     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L7
            monitor-exit(r5)
            return r5
        L7:
            java.util.HashMap<java.lang.String, com.anythink.core.common.s.a.b$b> r0 = r5.C     // Catch: java.lang.Throwable -> L97
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> L97
            com.anythink.core.common.s.a.b$b r0 = (com.anythink.core.common.s.a.b.AbstractC0214b) r0     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L95
            java.util.HashMap<java.lang.String, com.anythink.core.common.s.a.b$b> r1 = r5.C     // Catch: java.lang.Throwable -> L97
            r1.remove(r6)     // Catch: java.lang.Throwable -> L97
            com.anythink.core.common.s.a.m r1 = r5.M     // Catch: java.lang.Throwable -> L97
            r1.b(r6)     // Catch: java.lang.Throwable -> L97
            com.anythink.core.common.s.a.m r1 = r5.L     // Catch: java.lang.Throwable -> L97
            r1.b(r6)     // Catch: java.lang.Throwable -> L97
            byte r1 = r0.a()     // Catch: java.lang.Throwable -> L97
            r2 = 5
            if (r1 > r2) goto L3b
            int r6 = com.anythink.core.common.s.a.f.b(r6)     // Catch: java.lang.Throwable -> L97
            int r2 = r0.f4311a     // Catch: java.lang.Throwable -> L97
            int r6 = r6 + 2
            int r2 = r2 - r6
            int r6 = r0.f4311a     // Catch: java.lang.Throwable -> L97
            int[] r0 = com.anythink.core.common.s.a.g.o     // Catch: java.lang.Throwable -> L97
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L97
            int r6 = r6 + r0
            r5.a(r1, r2, r6)     // Catch: java.lang.Throwable -> L97
            goto L50
        L3b:
            com.anythink.core.common.s.a.b$j r0 = (com.anythink.core.common.s.a.b.j) r0     // Catch: java.lang.Throwable -> L97
            int r6 = r0.d     // Catch: java.lang.Throwable -> L97
            int r2 = r0.f4311a     // Catch: java.lang.Throwable -> L97
            int r3 = r0.e     // Catch: java.lang.Throwable -> L97
            int r2 = r2 + r3
            r5.a(r1, r6, r2)     // Catch: java.lang.Throwable -> L97
            boolean r6 = r0.f     // Catch: java.lang.Throwable -> L97
            if (r6 == 0) goto L50
            java.lang.Object r6 = r0.c     // Catch: java.lang.Throwable -> L97
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L97
            goto L51
        L50:
            r6 = 0
        L51:
            r0 = r1 | (-128(0xffffffffffffff80, float:NaN))
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L97
            int r1 = r5.ac     // Catch: java.lang.Throwable -> L97
            r2 = 4
            if (r1 != 0) goto L76
            java.nio.MappedByteBuffer r1 = r5.Z     // Catch: java.lang.Throwable -> L97
            long r3 = r5.B     // Catch: java.lang.Throwable -> L97
            r1.putLong(r2, r3)     // Catch: java.lang.Throwable -> L97
            java.nio.MappedByteBuffer r1 = r5.Z     // Catch: java.lang.Throwable -> L97
            int r3 = r5.ab     // Catch: java.lang.Throwable -> L97
            r1.put(r3, r0)     // Catch: java.lang.Throwable -> L97
            java.nio.MappedByteBuffer r1 = r5.aa     // Catch: java.lang.Throwable -> L97
            long r3 = r5.B     // Catch: java.lang.Throwable -> L97
            r1.putLong(r2, r3)     // Catch: java.lang.Throwable -> L97
            java.nio.MappedByteBuffer r1 = r5.aa     // Catch: java.lang.Throwable -> L97
            int r2 = r5.ab     // Catch: java.lang.Throwable -> L97
            r1.put(r2, r0)     // Catch: java.lang.Throwable -> L97
            goto L7d
        L76:
            com.anythink.core.common.s.a.f r0 = r5.E     // Catch: java.lang.Throwable -> L97
            long r3 = r5.B     // Catch: java.lang.Throwable -> L97
            r0.a(r2, r3)     // Catch: java.lang.Throwable -> L97
        L7d:
            r0 = 0
            r5.ab = r0     // Catch: java.lang.Throwable -> L97
            if (r6 == 0) goto L8f
            int r0 = r5.ac     // Catch: java.lang.Throwable -> L97
            if (r0 != 0) goto L8a
            r5.a(r6)     // Catch: java.lang.Throwable -> L97
            goto L8f
        L8a:
            java.util.List<java.lang.String> r0 = r5.H     // Catch: java.lang.Throwable -> L97
            r0.add(r6)     // Catch: java.lang.Throwable -> L97
        L8f:
            r5.h()     // Catch: java.lang.Throwable -> L97
            r5.q()     // Catch: java.lang.Throwable -> L97
        L95:
            monitor-exit(r5)
            return r5
        L97:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L97
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.s.a.g.remove(java.lang.String):android.content.SharedPreferences$Editor");
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized SharedPreferences.Editor clear() {
        if (this.J) {
            return this;
        }
        v();
        if (this.ac != 0) {
            b();
        }
        e((String) null);
        return this;
    }

    @Override // com.anythink.core.common.s.a.a
    public final synchronized void a(Map<String, Object> map, Map<Class, com.anythink.core.common.s.a.a.b> map2) {
        if (this.J) {
            return;
        }
        if (this.ac != 0) {
            this.V = false;
        }
        super.a(map, map2);
        if (this.ac != 0) {
            commit();
        }
    }

    private synchronized void o() {
        if (this.J) {
            return;
        }
        if (this.ac == 0) {
            this.Z.force();
            this.aa.force();
        }
    }

    private synchronized void p() {
        this.V = false;
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized boolean commit() {
        if (this.J) {
            return false;
        }
        this.V = true;
        return r();
    }

    @Override // android.content.SharedPreferences.Editor
    public final synchronized void apply() {
        if (this.J) {
            return;
        }
        this.V = true;
        r();
    }

    @Override // com.anythink.core.common.s.a.a
    protected final void f(String str) {
        q();
        e(str);
    }

    private void q() {
        if (this.ac == 0 || !this.V) {
            return;
        }
        r();
    }

    private boolean r() {
        int i = this.ac;
        if (i == 1) {
            this.O.execute(new Runnable() { // from class: com.anythink.core.common.s.a.g$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    g.this.s();
                }
            });
        } else if (i == 2) {
            return s();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean s() {
        try {
            File file = new File(this.v, this.w + DefaultDiskStorage.FileType.TEMP);
            if (l.a(file)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                try {
                    randomAccessFile.setLength(this.A);
                    randomAccessFile.write(this.E.f4316a, 0, this.A);
                    randomAccessFile.getFD().sync();
                    randomAccessFile.close();
                    if (l.a(file, new File(this.v, this.w + ".kvc"))) {
                        t();
                        return true;
                    }
                    b(new Exception("rename failed"));
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (Exception e) {
            a(e);
        }
        return false;
    }

    private void t() {
        if (this.H.isEmpty()) {
            return;
        }
        Iterator<String> it = this.H.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        this.H.clear();
    }

    private void u() {
        this.ac = 1;
        l.a(this.X);
        l.a(this.Y);
        this.X = null;
        this.Y = null;
        this.Z = null;
        this.aa = null;
    }

    private void v() {
        if (this.ac == 0) {
            try {
                a(this.Z);
                a(this.aa);
            } catch (Exception unused) {
                u();
            }
        }
        c();
        l.c(new File(this.v + this.w));
    }

    private void a(MappedByteBuffer mappedByteBuffer) {
        if (mappedByteBuffer.capacity() != r) {
            FileChannel fileChannel = mappedByteBuffer == this.Z ? this.X : this.Y;
            fileChannel.truncate(r);
            MappedByteBuffer map = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0L, r);
            map.order(ByteOrder.LITTLE_ENDIAN);
            if (mappedByteBuffer == this.Z) {
                this.Z = map;
            } else {
                this.aa = map;
            }
            mappedByteBuffer = map;
        }
        mappedByteBuffer.putInt(0, a(0));
        mappedByteBuffer.putLong(4, 0L);
    }

    @Override // com.anythink.core.common.s.a.a
    protected final void i() {
        this.B ^= this.E.b(this.F, this.G);
        int a2 = a(this.A - 12);
        if (this.ac == 0) {
            this.Z.putInt(0, -1);
            b(this.Z);
            this.Z.putInt(0, a2);
            this.aa.putInt(0, a2);
            b(this.aa);
        } else {
            this.E.a(0, a2);
            this.E.a(4, this.B);
        }
        this.ab = 0;
        this.G = 0;
    }

    private void b(MappedByteBuffer mappedByteBuffer) {
        try {
            if (mappedByteBuffer.capacity() < 12) {
                throw new IllegalArgumentException("Buffer capacity too small for checksum");
            }
            mappedByteBuffer.putLong(4, this.B);
            int i = this.ab;
            if (i != 0) {
                if (i < 0 || i >= mappedByteBuffer.capacity()) {
                    throw new IllegalArgumentException("removeStart out of bounds: " + this.ab);
                }
                if (this.ab >= this.E.f4316a.length) {
                    throw new IllegalArgumentException("fastBuffer.hb index out of bounds: " + this.ab);
                }
                mappedByteBuffer.put(this.ab, this.E.f4316a[this.ab]);
            }
            if (this.G != 0) {
                if (this.F < 0 || this.G < 0 || this.F + this.G > this.E.f4316a.length) {
                    throw new IllegalArgumentException("Invalid update range");
                }
                if (this.F > mappedByteBuffer.capacity() || mappedByteBuffer.capacity() - this.F < this.G) {
                    throw new IllegalArgumentException("buffer capacity overflow");
                }
                mappedByteBuffer.position(this.F);
                mappedByteBuffer.put(this.E.f4316a, this.F, this.G);
            }
        } catch (Throwable th) {
            com.anythink.core.common.u.e.b("sp_mmap_error", "spName: " + this.w + " errorMsg: " + th.getMessage(), t.b().r());
        }
    }

    @Override // com.anythink.core.common.s.a.a
    protected final void d(int i) {
        int length = this.E.f4316a.length;
        int i2 = this.A + i;
        if (i2 >= length) {
            if (this.P > i && this.P > f()) {
                c(i);
                return;
            }
            int a2 = a(length, i2);
            byte[] bArr = new byte[a2];
            System.arraycopy(this.E.f4316a, 0, bArr, 0, this.A);
            this.E.f4316a = bArr;
            if (this.ac == 0) {
                try {
                    long j = a2;
                    MappedByteBuffer map = this.X.map(FileChannel.MapMode.READ_WRITE, 0L, j);
                    this.Z = map;
                    map.order(ByteOrder.LITTLE_ENDIAN);
                    MappedByteBuffer map2 = this.Y.map(FileChannel.MapMode.READ_WRITE, 0L, j);
                    this.aa = map2;
                    map2.order(ByteOrder.LITTLE_ENDIAN);
                } catch (IOException e) {
                    a(new Exception("map failed", e));
                    this.E.a(0, a(this.A - 12));
                    this.E.a(4, this.B);
                    u();
                }
            }
        }
    }

    @Override // com.anythink.core.common.s.a.a
    protected final void a(byte b, int i) {
        this.B ^= a(1L, i);
        if (this.ac == 0) {
            this.Z.putLong(4, this.B);
            this.Z.put(i, b);
            this.aa.putLong(4, this.B);
            this.aa.put(i, b);
        } else {
            this.E.a(4, this.B);
        }
        this.E.f4316a[i] = b;
    }

    @Override // com.anythink.core.common.s.a.a
    protected final void a(int i, long j, int i2) {
        this.B = a(j, i2) ^ this.B;
        if (this.ac == 0) {
            this.Z.putLong(4, this.B);
            this.Z.putInt(i2, i);
            this.aa.putLong(4, this.B);
            this.aa.putInt(i2, i);
        } else {
            this.E.a(4, this.B);
        }
        this.E.a(i2, i);
    }

    @Override // com.anythink.core.common.s.a.a
    protected final void a(long j, long j2, int i) {
        this.B = a(j2, i) ^ this.B;
        if (this.ac == 0) {
            this.Z.putLong(4, this.B);
            this.Z.putLong(i, j);
            this.aa.putLong(4, this.B);
            this.aa.putLong(i, j);
        } else {
            this.E.a(4, this.B);
        }
        this.E.a(i, j);
    }

    @Override // com.anythink.core.common.s.a.a
    protected final void a(int i, byte[] bArr) {
        super.a(i, bArr);
        if (this.ac == 0) {
            this.Z.putInt(0, -1);
            this.Z.putLong(4, this.B);
            this.Z.position(i);
            this.Z.put(bArr);
            this.Z.putInt(0, a(this.A - 12));
            this.aa.putLong(4, this.B);
            this.aa.position(i);
            this.aa.put(bArr);
            return;
        }
        this.E.a(4, this.B);
    }

    @Override // com.anythink.core.common.s.a.a
    protected final void g(String str) {
        if (this.ac == 0) {
            a(str);
        } else {
            this.H.add(str);
        }
    }

    @Override // com.anythink.core.common.s.a.a
    protected final void a(byte b, int i, int i2) {
        super.a(b, i, i2);
        this.ab = i;
    }

    @Override // com.anythink.core.common.s.a.a
    protected final void h() {
        if (this.P < (f() << 1)) {
            if (this.Q.size() < (this.A < 16384 ? 80 : 160)) {
                return;
            }
        }
        c(0);
    }

    @Override // com.anythink.core.common.s.a.a
    protected final void a(int i, int i2, int i3) {
        int a2 = a(this.A - 12);
        if (this.ac == 0) {
            this.Z.putInt(0, -1);
            this.Z.putLong(4, this.B);
            this.Z.position(i);
            this.Z.put(this.E.f4316a, i, i3);
            this.Z.putInt(0, a2);
            this.aa.putInt(0, a2);
            this.aa.putLong(4, this.B);
            this.aa.position(i);
            this.aa.put(this.E.f4316a, i, i3);
        } else {
            this.E.a(0, a2);
            this.E.a(4, this.B);
        }
        int i4 = this.A + i2;
        if (this.E.f4316a.length - i4 > s) {
            int i5 = r;
            int a3 = a(i5, i4 + i5);
            if (a3 < this.E.f4316a.length) {
                byte[] bArr = new byte[a3];
                System.arraycopy(this.E.f4316a, 0, bArr, 0, this.A);
                this.E.f4316a = bArr;
                if (this.ac == 0) {
                    try {
                        long j = a3;
                        this.X.truncate(j);
                        MappedByteBuffer map = this.X.map(FileChannel.MapMode.READ_WRITE, 0L, j);
                        this.Z = map;
                        map.order(ByteOrder.LITTLE_ENDIAN);
                        this.Y.truncate(j);
                        MappedByteBuffer map2 = this.Y.map(FileChannel.MapMode.READ_WRITE, 0L, j);
                        this.aa = map2;
                        map2.order(ByteOrder.LITTLE_ENDIAN);
                    } catch (Exception e) {
                        a(new Exception("map failed", e));
                        u();
                    }
                }
                c("truncate finish");
            }
        }
    }

    private void e(int i) {
        int i2 = r;
        int a2 = a(i2, i + i2);
        if (a2 >= this.E.f4316a.length) {
            return;
        }
        byte[] bArr = new byte[a2];
        System.arraycopy(this.E.f4316a, 0, bArr, 0, this.A);
        this.E.f4316a = bArr;
        if (this.ac == 0) {
            try {
                long j = a2;
                this.X.truncate(j);
                MappedByteBuffer map = this.X.map(FileChannel.MapMode.READ_WRITE, 0L, j);
                this.Z = map;
                map.order(ByteOrder.LITTLE_ENDIAN);
                this.Y.truncate(j);
                MappedByteBuffer map2 = this.Y.map(FileChannel.MapMode.READ_WRITE, 0L, j);
                this.aa = map2;
                map2.order(ByteOrder.LITTLE_ENDIAN);
            } catch (Exception e) {
                a(new Exception("map failed", e));
                u();
            }
        }
        c("truncate finish");
    }

    private synchronized void w() {
        if (this.J) {
            return;
        }
        this.J = true;
        if (this.ac == 0) {
            try {
                this.X.force(true);
                this.X.close();
                this.Y.force(true);
                this.Y.close();
            } catch (Exception e) {
                a(e);
            }
        }
        synchronized (a.class) {
            a.f4317a.remove(this.v + this.w);
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final Map<String, g> f4317a = new ConcurrentHashMap();
        private String b;
        private String c;
        private com.anythink.core.common.s.a.a.b[] d;
        private com.anythink.core.common.s.a.a.a e;
        private int f = 0;

        private a(Context context, String str) {
            if (context == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.b = context.getFilesDir().getAbsolutePath() + "/tktp/";
            this.c = str;
        }

        private a(String str, String str2) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            this.b = str.endsWith("/") ? str : str + '/';
            this.c = str2;
        }

        private a a(com.anythink.core.common.s.a.a.b[] bVarArr) {
            this.d = bVarArr;
            return this;
        }

        private a a(com.anythink.core.common.s.a.a.a aVar) {
            this.e = aVar;
            return this;
        }

        private a a() {
            this.f = 2;
            return this;
        }

        private a b() {
            this.f = 1;
            return this;
        }

        private g c() {
            g gVar;
            String str = this.b + this.c;
            Map<String, g> map = f4317a;
            g gVar2 = map.get(str);
            if (gVar2 != null) {
                return gVar2;
            }
            synchronized (a.class) {
                gVar = map.get(str);
                if (gVar == null) {
                    g gVar3 = new g(this.b, this.c, this.d, this.e, this.f);
                    map.put(str, gVar3);
                    gVar = gVar3;
                }
            }
            return gVar;
        }
    }

    public final int j() {
        return this.ac;
    }

    public final String toString() {
        return "FastKV: path:" + this.v + " name:" + this.w;
    }
}
