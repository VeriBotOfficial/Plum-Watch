package com.anythink.basead.exoplayer.h.a;

import android.net.Uri;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f2515a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final a f = new a(new long[0]);
    public final int g;
    public final long[] h;
    public final C0142a[] i;
    public final long j;
    public final long k;

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* renamed from: com.anythink.basead.exoplayer.h.a.a$a, reason: collision with other inner class name */
    public static final class C0142a {

        /* renamed from: a, reason: collision with root package name */
        public final int f2516a;
        public final Uri[] b;
        public final int[] c;
        public final long[] d;

        public C0142a() {
            this(-1, new int[0], new Uri[0], new long[0]);
        }

        private C0142a(int i, int[] iArr, Uri[] uriArr, long[] jArr) {
            com.anythink.basead.exoplayer.k.a.a(iArr.length == uriArr.length);
            this.f2516a = i;
            this.c = iArr;
            this.b = uriArr;
            this.d = jArr;
        }

        private int c() {
            return a(-1);
        }

        public final int a(int i) {
            int i2;
            int i3 = i + 1;
            while (true) {
                int[] iArr = this.c;
                if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                    break;
                }
                i3++;
            }
            return i3;
        }

        public final boolean a() {
            return this.f2516a == -1 || a(-1) < this.f2516a;
        }

        public final C0142a b(int i) {
            com.anythink.basead.exoplayer.k.a.a(this.f2516a == -1 && this.c.length <= i);
            return new C0142a(i, a(this.c, i), (Uri[]) Arrays.copyOf(this.b, i), a(this.d, i));
        }

        public final C0142a a(Uri uri, int i) {
            int i2 = this.f2516a;
            com.anythink.basead.exoplayer.k.a.a(i2 == -1 || i < i2);
            int[] a2 = a(this.c, i + 1);
            com.anythink.basead.exoplayer.k.a.a(a2[i] == 0);
            long[] jArr = this.d;
            if (jArr.length != a2.length) {
                jArr = a(jArr, a2.length);
            }
            Uri[] uriArr = (Uri[]) Arrays.copyOf(this.b, a2.length);
            uriArr[i] = uri;
            a2[i] = 1;
            return new C0142a(this.f2516a, a2, uriArr, jArr);
        }

        public final C0142a a(int i, int i2) {
            int i3 = this.f2516a;
            com.anythink.basead.exoplayer.k.a.a(i3 == -1 || i2 < i3);
            int[] a2 = a(this.c, i2 + 1);
            int i4 = a2[i2];
            com.anythink.basead.exoplayer.k.a.a(i4 == 0 || i4 == 1 || i4 == i);
            long[] jArr = this.d;
            if (jArr.length != a2.length) {
                jArr = a(jArr, a2.length);
            }
            Uri[] uriArr = this.b;
            if (uriArr.length != a2.length) {
                uriArr = (Uri[]) Arrays.copyOf(uriArr, a2.length);
            }
            a2[i2] = i;
            return new C0142a(this.f2516a, a2, uriArr, jArr);
        }

        public final C0142a a(long[] jArr) {
            com.anythink.basead.exoplayer.k.a.a(this.f2516a == -1 || jArr.length <= this.b.length);
            int length = jArr.length;
            Uri[] uriArr = this.b;
            if (length < uriArr.length) {
                jArr = a(jArr, uriArr.length);
            }
            return new C0142a(this.f2516a, this.c, this.b, jArr);
        }

        public final C0142a b() {
            if (this.f2516a == -1) {
                return new C0142a(0, new int[0], new Uri[0], new long[0]);
            }
            int[] iArr = this.c;
            int length = iArr.length;
            int[] copyOf = Arrays.copyOf(iArr, length);
            for (int i = 0; i < length; i++) {
                int i2 = copyOf[i];
                if (i2 == 1 || i2 == 0) {
                    copyOf[i] = 2;
                }
            }
            return new C0142a(length, copyOf, this.b, this.d);
        }

        private static int[] a(int[] iArr, int i) {
            int length = iArr.length;
            int max = Math.max(i, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        private static long[] a(long[] jArr, int i) {
            int length = jArr.length;
            int max = Math.max(i, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, -9223372036854775807L);
            return copyOf;
        }
    }

    private a(long... jArr) {
        this.g = 0;
        this.h = Arrays.copyOf(jArr, 0);
        this.i = new C0142a[0];
        this.j = 0L;
        this.k = -9223372036854775807L;
    }

    private a(long[] jArr, C0142a[] c0142aArr, long j, long j2) {
        this.g = c0142aArr.length;
        this.h = jArr;
        this.i = c0142aArr;
        this.j = j;
        this.k = j2;
    }

    private int a(long j) {
        int length = this.h.length - 1;
        while (length >= 0) {
            long j2 = this.h[length];
            if (j2 != Long.MIN_VALUE && j2 <= j) {
                break;
            }
            length--;
        }
        if (length < 0 || !this.i[length].a()) {
            return -1;
        }
        return length;
    }

    private int b(long j) {
        int i = 0;
        while (true) {
            long[] jArr = this.h;
            if (i >= jArr.length) {
                break;
            }
            long j2 = jArr[i];
            if (j2 == Long.MIN_VALUE || (j < j2 && this.i[i].a())) {
                break;
            }
            i++;
        }
        if (i < this.h.length) {
            return i;
        }
        return -1;
    }

    private a a(int i, int i2) {
        com.anythink.basead.exoplayer.k.a.a(i2 > 0);
        if (this.i[i].f2516a == i2) {
            return this;
        }
        C0142a[] c0142aArr = this.i;
        C0142a[] c0142aArr2 = (C0142a[]) Arrays.copyOf(c0142aArr, c0142aArr.length);
        c0142aArr2[i] = this.i[i].b(i2);
        return new a(this.h, c0142aArr2, this.j, this.k);
    }

    private a a(int i, int i2, Uri uri) {
        C0142a[] c0142aArr = this.i;
        C0142a[] c0142aArr2 = (C0142a[]) Arrays.copyOf(c0142aArr, c0142aArr.length);
        c0142aArr2[i] = c0142aArr2[i].a(uri, i2);
        return new a(this.h, c0142aArr2, this.j, this.k);
    }

    private a b(int i, int i2) {
        C0142a[] c0142aArr = this.i;
        C0142a[] c0142aArr2 = (C0142a[]) Arrays.copyOf(c0142aArr, c0142aArr.length);
        c0142aArr2[i] = c0142aArr2[i].a(3, i2);
        return new a(this.h, c0142aArr2, this.j, this.k);
    }

    private a c(int i, int i2) {
        C0142a[] c0142aArr = this.i;
        C0142a[] c0142aArr2 = (C0142a[]) Arrays.copyOf(c0142aArr, c0142aArr.length);
        c0142aArr2[i] = c0142aArr2[i].a(2, i2);
        return new a(this.h, c0142aArr2, this.j, this.k);
    }

    private a d(int i, int i2) {
        C0142a[] c0142aArr = this.i;
        C0142a[] c0142aArr2 = (C0142a[]) Arrays.copyOf(c0142aArr, c0142aArr.length);
        c0142aArr2[i] = c0142aArr2[i].a(4, i2);
        return new a(this.h, c0142aArr2, this.j, this.k);
    }

    private a a(int i) {
        C0142a[] c0142aArr = this.i;
        C0142a[] c0142aArr2 = (C0142a[]) Arrays.copyOf(c0142aArr, c0142aArr.length);
        c0142aArr2[i] = c0142aArr2[i].b();
        return new a(this.h, c0142aArr2, this.j, this.k);
    }

    public final a a(long[][] jArr) {
        C0142a[] c0142aArr = this.i;
        C0142a[] c0142aArr2 = (C0142a[]) Arrays.copyOf(c0142aArr, c0142aArr.length);
        for (int i = 0; i < this.g; i++) {
            c0142aArr2[i] = c0142aArr2[i].a(jArr[i]);
        }
        return new a(this.h, c0142aArr2, this.j, this.k);
    }

    private a c(long j) {
        return this.j == j ? this : new a(this.h, this.i, j, this.k);
    }

    private a d(long j) {
        return this.k == j ? this : new a(this.h, this.i, this.j, j);
    }
}
