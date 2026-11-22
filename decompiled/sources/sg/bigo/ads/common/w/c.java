package sg.bigo.ads.common.w;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.ArrayMap;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class c {
    static final b b = new b() { // from class: sg.bigo.ads.common.w.c.1
        @Override // sg.bigo.ads.common.w.c.b
        public final boolean a(float[] fArr) {
            float f = fArr[2];
            if (f < 0.95f && f > 0.05f) {
                float f2 = fArr[1];
                if ((f2 > 0.1f || f < 0.55f) && ((f2 > 0.5f || f < 0.75f) && (f2 > 0.2f || f < 0.7f))) {
                    float f3 = fArr[0];
                    if (f3 < 10.0f || f3 > 37.0f || f2 > 0.82f) {
                        return true;
                    }
                }
            }
            return false;
        }
    };
    private final List<C1091c> c;
    private final List<d> d;
    private final SparseBooleanArray f = new SparseBooleanArray();
    private final Map<d, C1091c> e = new ArrayMap();

    /* renamed from: a, reason: collision with root package name */
    final C1091c f19790a = b();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final Bitmap f19791a;
        final List<d> b;
        int c;
        int d;
        int e;
        final List<b> f;

        public a(Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.b = arrayList;
            this.c = 16;
            this.d = 12544;
            this.e = -1;
            ArrayList arrayList2 = new ArrayList();
            this.f = arrayList2;
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            arrayList2.add(c.b);
            this.f19791a = bitmap;
            arrayList.add(d.f19793a);
        }
    }

    interface b {
        boolean a(float[] fArr);
    }

    /* renamed from: sg.bigo.ads.common.w.c$c, reason: collision with other inner class name */
    public static final class C1091c {

        /* renamed from: a, reason: collision with root package name */
        final int f19792a;
        final int b;
        private final int c;
        private final int d;
        private final int e;
        private float[] f;

        public C1091c(int i, int i2) {
            this.c = Color.red(i);
            this.d = Color.green(i);
            this.e = Color.blue(i);
            this.f19792a = i;
            this.b = i2;
        }

        public final float[] a() {
            if (this.f == null) {
                this.f = new float[3];
            }
            sg.bigo.ads.common.w.b.a(this.c, this.d, this.e, this.f);
            return this.f;
        }
    }

    c(List<C1091c> list, List<d> list2) {
        this.c = list;
        this.d = list2;
    }

    public static a a(Bitmap bitmap) {
        return new a(bitmap);
    }

    private C1091c b() {
        int size = this.c.size();
        int i = Integer.MIN_VALUE;
        C1091c c1091c = null;
        for (int i2 = 0; i2 < size; i2++) {
            C1091c c1091c2 = this.c.get(i2);
            if (c1091c2.b > i) {
                i = c1091c2.b;
                c1091c = c1091c2;
            }
        }
        return c1091c;
    }

    final void a() {
        float f;
        float f2;
        int size = this.d.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            d dVar = this.d.get(i2);
            int length = dVar.d.length;
            float f3 = 0.0f;
            float f4 = 0.0f;
            for (int i3 = i; i3 < length; i3++) {
                float f5 = dVar.d[i3];
                if (f5 > 0.0f) {
                    f4 += f5;
                }
            }
            if (f4 != 0.0f) {
                int length2 = dVar.d.length;
                for (int i4 = i; i4 < length2; i4++) {
                    if (dVar.d[i4] > 0.0f) {
                        float[] fArr = dVar.d;
                        fArr[i4] = fArr[i4] / f4;
                    }
                }
            }
            Map<d, C1091c> map = this.e;
            int size2 = this.c.size();
            C1091c c1091c = null;
            int i5 = i;
            float f6 = 0.0f;
            while (i5 < size2) {
                C1091c c1091c2 = this.c.get(i5);
                float[] a2 = c1091c2.a();
                if (a2[1] < dVar.b[i] || a2[1] > dVar.b[2] || a2[2] < dVar.c[i] || a2[2] > dVar.c[2] || this.f.get(c1091c2.f19792a)) {
                    f = f3;
                } else {
                    float[] a3 = c1091c2.a();
                    C1091c c1091c3 = this.f19790a;
                    int i6 = c1091c3 != null ? c1091c3.b : 1;
                    float abs = dVar.d[i] > f3 ? dVar.d[i] * (1.0f - Math.abs(a3[1] - dVar.b[1])) : f3;
                    if (dVar.d[1] > f3) {
                        f = f3;
                        f2 = dVar.d[1] * (1.0f - Math.abs(a3[2] - dVar.c[1]));
                    } else {
                        f = f3;
                        f2 = f;
                    }
                    float f7 = abs + f2 + (dVar.d[2] > f ? dVar.d[2] * (c1091c2.b / i6) : f);
                    if (c1091c == null || f7 > f6) {
                        c1091c = c1091c2;
                        f6 = f7;
                    }
                }
                i5++;
                f3 = f;
                i = 0;
            }
            if (c1091c != null && dVar.e) {
                this.f.append(c1091c.f19792a, true);
            }
            map.put(dVar, c1091c);
            i2++;
            i = 0;
        }
        this.f.clear();
    }
}
