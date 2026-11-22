package com.anythink.basead.exoplayer.k;

import java.nio.ByteBuffer;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes11.dex */
public final class p {
    public static final int b = 255;
    private static final String d = "NalUnitUtil";
    private static final int e = 6;
    private static final int f = 7;
    private static final int g = 39;

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f2688a = {0, 0, 0, 1};
    public static final float[] c = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object h = new Object();
    private static int[] i = new int[10];

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f2690a;
        public final int b;
        public final int c;
        public final float d;
        public final boolean e;
        public final boolean f;
        public final int g;
        public final int h;
        public final int i;
        public final boolean j;

        public b(int i, int i2, int i3, float f, boolean z, boolean z2, int i4, int i5, int i6, boolean z3) {
            this.f2690a = i;
            this.b = i2;
            this.c = i3;
            this.d = f;
            this.e = z;
            this.f = z2;
            this.g = i4;
            this.h = i5;
            this.i = i6;
            this.j = z3;
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f2689a;
        public final int b;
        public final boolean c;

        public a(int i, int i2, boolean z) {
            this.f2689a = i;
            this.b = i2;
            this.c = z;
        }
    }

    public static int a(byte[] bArr, int i2) {
        int i3;
        synchronized (h) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                while (true) {
                    if (i4 >= i2 - 2) {
                        i4 = i2;
                        break;
                    }
                    if (bArr[i4] == 0 && bArr[i4 + 1] == 0 && bArr[i4 + 2] == 3) {
                        break;
                    }
                    i4++;
                }
                if (i4 < i2) {
                    int[] iArr = i;
                    if (iArr.length <= i5) {
                        i = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    i[i5] = i4;
                    i4 += 3;
                    i5++;
                }
            }
            i3 = i2 - i5;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = i[i8] - i7;
                System.arraycopy(bArr, i7, bArr, i6, i9);
                int i10 = i6 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i6 = i10 + 2;
                bArr[i11] = 0;
                i7 += i9 + 3;
            }
            System.arraycopy(bArr, i7, bArr, i6, i3 - i6);
        }
        return i3;
    }

    public static void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i2 + 1;
            if (i4 < position) {
                int i5 = byteBuffer.get(i2) & 255;
                if (i3 == 3) {
                    if (i5 == 1 && (byteBuffer.get(i4) & 31) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i2 - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (i5 == 0) {
                    i3++;
                }
                if (i5 != 0) {
                    i3 = 0;
                }
                i2 = i4;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    public static boolean a(String str, byte b2) {
        return ("video/avc".equals(str) && (b2 & 31) == 6) || ("video/hevc".equals(str) && ((b2 & BuiltinOptions.RightShiftOptions) >> 1) == 39);
    }

    private static int b(byte[] bArr, int i2) {
        return bArr[i2 + 3] & 31;
    }

    private static int c(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & BuiltinOptions.RightShiftOptions) >> 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.anythink.basead.exoplayer.k.p.b a(byte[] r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.exoplayer.k.p.a(byte[], int, int):com.anythink.basead.exoplayer.k.p$b");
    }

    private static a b(byte[] bArr, int i2, int i3) {
        t tVar = new t(bArr, i2, i3);
        tVar.a(8);
        int c2 = tVar.c();
        int c3 = tVar.c();
        tVar.a();
        return new a(c2, c3, tVar.b());
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0095, code lost:
    
        r9 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int a(byte[] r8, int r9, int r10, boolean[] r11) {
        /*
            Method dump skipped, instructions count: 186
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.exoplayer.k.p.a(byte[], int, int, boolean[]):int");
    }

    private static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    private static int c(byte[] bArr, int i2, int i3) {
        while (i2 < i3 - 2) {
            if (bArr[i2] == 0 && bArr[i2 + 1] == 0 && bArr[i2 + 2] == 3) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    private static void a(t tVar, int i2) {
        int i3 = 8;
        int i4 = 8;
        for (int i5 = 0; i5 < i2; i5++) {
            if (i3 != 0) {
                i3 = ((tVar.d() + i4) + 256) % 256;
            }
            if (i3 != 0) {
                i4 = i3;
            }
        }
    }

    private p() {
    }
}
