package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection;
import com.yandex.mobile.ads.impl.hv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes5.dex */
final class v40 {
    private static final byte[] h = {0, 7, 8, 15};
    private static final byte[] i = {0, BuiltinOptions.UnsortedSegmentMaxOptions, -120, -1};
    private static final byte[] j = {0, 17, 34, BuiltinOptions.TileOptions, BuiltinOptions.FillOptions, BuiltinOptions.WhereOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.UnsortedSegmentMaxOptions, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a, reason: collision with root package name */
    private final Paint f17114a;
    private final Paint b;
    private final Canvas c;
    private final b d;
    private final a e;
    private final h f;
    private Bitmap g;

    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f17118a;
        public final int b;
        public final SparseArray<e> c;

        public d(int i, int i2, SparseArray sparseArray) {
            this.f17118a = i;
            this.b = i2;
            this.c = sparseArray;
        }
    }

    private static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f17120a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final SparseArray<g> j;

        public f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, SparseArray sparseArray) {
            this.f17120a = i;
            this.b = z;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
            this.h = i7;
            this.i = i8;
            this.j = sparseArray;
        }
    }

    private static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final int f17121a;
        public final int b;

        public g(int i, int i2) {
            this.f17121a = i;
            this.b = i2;
        }
    }

    private static int a(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    public v40(int i2, int i3) {
        Paint paint = new Paint();
        this.f17114a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.c = new Canvas();
        this.d = new b(AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, 575, 0, AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, 0, 575);
        this.e = new a(0, a(), b(), c());
        this.f = new h(i2, i3);
    }

    public final void d() {
        h hVar = this.f;
        hVar.c.clear();
        hVar.d.clear();
        hVar.e.clear();
        hVar.f.clear();
        hVar.g.clear();
        hVar.h = null;
        hVar.i = null;
    }

    private static int[] a() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = a(255, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i2] = a(255, (i2 & 1) != 0 ? 127 : 0, (i2 & 2) != 0 ? 127 : 0, (i2 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = a(63, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & 136;
                if (i3 == 0) {
                    iArr[i2] = a(255, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 8) {
                    iArr[i2] = a(127, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 128) {
                    iArr[i2] = a(255, ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = a(255, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final int f17122a;
        public final int b;
        public final SparseArray<f> c = new SparseArray<>();
        public final SparseArray<a> d = new SparseArray<>();
        public final SparseArray<c> e = new SparseArray<>();
        public final SparseArray<a> f = new SparseArray<>();
        public final SparseArray<c> g = new SparseArray<>();
        public b h;
        public d i;

        public h(int i, int i2) {
            this.f17122a = i;
            this.b = i2;
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f17116a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f17116a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
        }
    }

    private static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f17119a;
        public final int b;

        public e(int i, int i2) {
            this.f17119a = i;
            this.b = i2;
        }
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f17115a;
        public final int[] b;
        public final int[] c;
        public final int[] d;

        public a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f17115a = i;
            this.b = iArr;
            this.c = iArr2;
            this.d = iArr3;
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f17117a;
        public final boolean b;
        public final byte[] c;
        public final byte[] d;

        public c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.f17117a = i;
            this.b = z;
            this.c = bArr;
            this.d = bArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x021a A[LOOP:3: B:83:0x0181->B:95:0x021a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0216 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte[] r22, int[] r23, int r24, int r25, int r26, android.graphics.Paint r27, android.graphics.Canvas r28) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.v40.a(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    private static a a(zf1 zf1Var, int i2) {
        int b2;
        int i3;
        int b3;
        int i4;
        int i5;
        int i6 = 8;
        int b4 = zf1Var.b(8);
        zf1Var.d(8);
        int i7 = 2;
        int i8 = i2 - 2;
        int[] a2 = a();
        int[] b5 = b();
        int[] c2 = c();
        while (i8 > 0) {
            int b6 = zf1Var.b(i6);
            int b7 = zf1Var.b(i6);
            int[] iArr = (b7 & 128) != 0 ? a2 : (b7 & 64) != 0 ? b5 : c2;
            if ((b7 & 1) != 0) {
                i4 = zf1Var.b(i6);
                i5 = zf1Var.b(i6);
                b2 = zf1Var.b(i6);
                b3 = zf1Var.b(i6);
                i3 = i8 - 6;
            } else {
                int b8 = zf1Var.b(6) << i7;
                int b9 = zf1Var.b(4) << 4;
                b2 = zf1Var.b(4) << 4;
                i3 = i8 - 4;
                b3 = zf1Var.b(i7) << 6;
                i4 = b8;
                i5 = b9;
            }
            if (i4 == 0) {
                b3 = 255;
                i5 = 0;
                b2 = 0;
            }
            double d2 = i4;
            int i9 = b4;
            double d3 = i5 + com.alipay.sdk.m.p.a.g;
            int i10 = (int) ((1.402d * d3) + d2);
            double d4 = b2 + com.alipay.sdk.m.p.a.g;
            int i11 = (int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d));
            int i12 = (int) ((d4 * 1.772d) + d2);
            int i13 = f92.f15466a;
            iArr[b6] = a((byte) (255 - (b3 & 255)), Math.max(0, Math.min(i10, 255)), Math.max(0, Math.min(i11, 255)), Math.max(0, Math.min(i12, 255)));
            i8 = i3;
            b4 = i9;
            i6 = 8;
            i7 = 2;
        }
        return new a(b4, a2, b5, c2);
    }

    private static c a(zf1 zf1Var) {
        byte[] bArr;
        int b2 = zf1Var.b(16);
        zf1Var.d(4);
        int b3 = zf1Var.b(2);
        boolean f2 = zf1Var.f();
        zf1Var.d(1);
        byte[] bArr2 = f92.f;
        if (b3 == 1) {
            zf1Var.d(zf1Var.b(8) * 16);
        } else if (b3 == 0) {
            int b4 = zf1Var.b(16);
            int b5 = zf1Var.b(16);
            if (b4 > 0) {
                bArr2 = new byte[b4];
                zf1Var.b(bArr2, b4);
            }
            if (b5 > 0) {
                bArr = new byte[b5];
                zf1Var.b(bArr, b5);
                return new c(b2, f2, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(b2, f2, bArr2, bArr);
    }

    public final List a(int i2, byte[] bArr) {
        boolean z;
        char c2;
        int i3;
        int[] iArr;
        f fVar;
        int i4;
        int i5;
        int i6;
        int i7;
        zf1 zf1Var = new zf1(i2, bArr);
        while (true) {
            z = true;
            if (zf1Var.b() >= 48 && zf1Var.b(8) == 15) {
                h hVar = this.f;
                int b2 = zf1Var.b(8);
                int b3 = zf1Var.b(16);
                int b4 = zf1Var.b(16);
                int d2 = zf1Var.d() + b4;
                if (b4 * 8 > zf1Var.b()) {
                    et0.d("DvbParser", "Data field length exceeds limit");
                    zf1Var.d(zf1Var.b());
                } else {
                    switch (b2) {
                        case 16:
                            if (b3 == hVar.f17122a) {
                                d dVar = hVar.i;
                                zf1Var.b(8);
                                int b5 = zf1Var.b(4);
                                int b6 = zf1Var.b(2);
                                zf1Var.d(2);
                                int i8 = b4 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i8 > 0) {
                                    int b7 = zf1Var.b(8);
                                    zf1Var.d(8);
                                    i8 -= 6;
                                    sparseArray.put(b7, new e(zf1Var.b(16), zf1Var.b(16)));
                                }
                                d dVar2 = new d(b5, b6, sparseArray);
                                if (b6 != 0) {
                                    hVar.i = dVar2;
                                    hVar.c.clear();
                                    hVar.d.clear();
                                    hVar.e.clear();
                                    break;
                                } else if (dVar != null && dVar.f17118a != b5) {
                                    hVar.i = dVar2;
                                    break;
                                }
                            }
                            break;
                        case 17:
                            d dVar3 = hVar.i;
                            if (b3 == hVar.f17122a && dVar3 != null) {
                                int b8 = zf1Var.b(8);
                                zf1Var.d(4);
                                boolean f2 = zf1Var.f();
                                zf1Var.d(3);
                                int b9 = zf1Var.b(16);
                                int b10 = zf1Var.b(16);
                                zf1Var.b(3);
                                int b11 = zf1Var.b(3);
                                zf1Var.d(2);
                                int b12 = zf1Var.b(8);
                                int b13 = zf1Var.b(8);
                                int b14 = zf1Var.b(4);
                                int b15 = zf1Var.b(2);
                                zf1Var.d(2);
                                int i9 = b4 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i9 > 0) {
                                    int b16 = zf1Var.b(16);
                                    int b17 = zf1Var.b(2);
                                    zf1Var.b(2);
                                    int b18 = zf1Var.b(12);
                                    zf1Var.d(4);
                                    int b19 = zf1Var.b(12);
                                    int i10 = i9 - 6;
                                    if (b17 == 1 || b17 == 2) {
                                        zf1Var.b(8);
                                        zf1Var.b(8);
                                        i9 -= 8;
                                    } else {
                                        i9 = i10;
                                    }
                                    sparseArray2.put(b16, new g(b18, b19));
                                }
                                f fVar2 = new f(b8, f2, b9, b10, b11, b12, b13, b14, b15, sparseArray2);
                                if (dVar3.b == 0 && (fVar = hVar.c.get(b8)) != null) {
                                    SparseArray<g> sparseArray3 = fVar.j;
                                    for (int i11 = 0; i11 < sparseArray3.size(); i11++) {
                                        fVar2.j.put(sparseArray3.keyAt(i11), sparseArray3.valueAt(i11));
                                    }
                                }
                                hVar.c.put(fVar2.f17120a, fVar2);
                                break;
                            }
                            break;
                        case 18:
                            if (b3 == hVar.f17122a) {
                                a a2 = a(zf1Var, b4);
                                hVar.d.put(a2.f17115a, a2);
                                break;
                            } else if (b3 == hVar.b) {
                                a a3 = a(zf1Var, b4);
                                hVar.f.put(a3.f17115a, a3);
                                break;
                            }
                            break;
                        case 19:
                            if (b3 == hVar.f17122a) {
                                c a4 = a(zf1Var);
                                hVar.e.put(a4.f17117a, a4);
                                break;
                            } else if (b3 == hVar.b) {
                                c a5 = a(zf1Var);
                                hVar.g.put(a5.f17117a, a5);
                                break;
                            }
                            break;
                        case 20:
                            if (b3 == hVar.f17122a) {
                                zf1Var.d(4);
                                boolean f3 = zf1Var.f();
                                zf1Var.d(3);
                                int b20 = zf1Var.b(16);
                                int b21 = zf1Var.b(16);
                                if (f3) {
                                    int b22 = zf1Var.b(16);
                                    i4 = zf1Var.b(16);
                                    i7 = zf1Var.b(16);
                                    i6 = b22;
                                    i5 = zf1Var.b(16);
                                } else {
                                    i4 = b20;
                                    i5 = b21;
                                    i6 = 0;
                                    i7 = 0;
                                }
                                hVar.h = new b(b20, b21, i6, i4, i7, i5);
                                break;
                            }
                            break;
                    }
                    zf1Var.e(d2 - zf1Var.d());
                }
            }
        }
        h hVar2 = this.f;
        d dVar4 = hVar2.i;
        if (dVar4 == null) {
            return Collections.emptyList();
        }
        b bVar = hVar2.h;
        if (bVar == null) {
            bVar = this.d;
        }
        Bitmap bitmap = this.g;
        if (bitmap == null || bVar.f17116a + 1 != bitmap.getWidth() || bVar.b + 1 != this.g.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(bVar.f17116a + 1, bVar.b + 1, Bitmap.Config.ARGB_8888);
            this.g = createBitmap;
            this.c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray4 = dVar4.c;
        int i12 = 0;
        while (i12 < sparseArray4.size()) {
            this.c.save();
            e valueAt = sparseArray4.valueAt(i12);
            f fVar3 = this.f.c.get(sparseArray4.keyAt(i12));
            int i13 = valueAt.f17119a + bVar.c;
            int i14 = valueAt.b + bVar.e;
            this.c.clipRect(i13, i14, Math.min(fVar3.c + i13, bVar.d), Math.min(fVar3.d + i14, bVar.f));
            a aVar = this.f.d.get(fVar3.f);
            if (aVar == null && (aVar = this.f.f.get(fVar3.f)) == null) {
                aVar = this.e;
            }
            SparseArray<g> sparseArray5 = fVar3.j;
            int i15 = 0;
            while (i15 < sparseArray5.size()) {
                int keyAt = sparseArray5.keyAt(i15);
                g valueAt2 = sparseArray5.valueAt(i15);
                boolean z2 = z;
                c cVar = this.f.e.get(keyAt);
                if (cVar == null) {
                    cVar = this.f.g.get(keyAt);
                }
                if (cVar != null) {
                    Paint paint = cVar.b ? null : this.f17114a;
                    int i16 = fVar3.e;
                    int i17 = i13 + valueAt2.f17121a;
                    int i18 = i14 + valueAt2.b;
                    Canvas canvas = this.c;
                    if (i16 == 3) {
                        iArr = aVar.d;
                    } else if (i16 == 2) {
                        iArr = aVar.c;
                    } else {
                        iArr = aVar.b;
                    }
                    int[] iArr2 = iArr;
                    a(cVar.c, iArr2, i16, i17, i18, paint, canvas);
                    a(cVar.d, iArr2, i16, i17, i18 + 1, paint, canvas);
                }
                i15++;
                z = z2;
            }
            boolean z3 = z;
            if (fVar3.b) {
                int i19 = fVar3.e;
                if (i19 == 3) {
                    i3 = aVar.d[fVar3.g];
                    c2 = 2;
                } else {
                    c2 = 2;
                    if (i19 == 2) {
                        i3 = aVar.c[fVar3.h];
                    } else {
                        i3 = aVar.b[fVar3.i];
                    }
                }
                this.b.setColor(i3);
                this.c.drawRect(i13, i14, fVar3.c + i13, fVar3.d + i14, this.b);
            } else {
                c2 = 2;
            }
            arrayList.add(new hv.a().a(Bitmap.createBitmap(this.g, i13, i14, fVar3.c, fVar3.d)).b(i13 / bVar.f17116a).b(0).a(0, i14 / bVar.b).a(0).d(fVar3.c / bVar.f17116a).a(fVar3.d / bVar.b).a());
            this.c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.c.restore();
            i12++;
            z = z3;
        }
        return Collections.unmodifiableList(arrayList);
    }
}
