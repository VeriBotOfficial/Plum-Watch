package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.C2967a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: FinderPatternFinder.java */
/* loaded from: classes14.dex */
public class Sa {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f10598a = {1, 3, 1, 1};
    private static final int[] b = {1, 1, 3, 1};
    private static boolean c = false;
    private static boolean d = false;
    private static final b e = new b();
    private final C3074y f;
    private final com.huawei.hms.scankit.aiscan.common.A j;
    private final List<Qa> g = new ArrayList();
    private final int[] i = new int[5];
    private final List<Qa> h = new ArrayList();

    /* compiled from: FinderPatternFinder.java */
    private static final class a implements Comparator<Qa>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final float f10599a;

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Qa qa, Qa qa2) {
            int compare = Integer.compare(qa2.a(), qa.a());
            return compare == 0 ? Float.compare(Math.abs(qa.e() - this.f10599a), Math.abs(qa2.e() - this.f10599a)) : compare;
        }

        private a(float f) {
            this.f10599a = f;
        }
    }

    /* compiled from: FinderPatternFinder.java */
    private static final class b implements Comparator<Qa>, Serializable {
        private b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Qa qa, Qa qa2) {
            return Float.compare(qa.e(), qa2.e());
        }
    }

    /* compiled from: FinderPatternFinder.java */
    private static final class c implements Comparator<Qa>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final float f10600a;

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Qa qa, Qa qa2) {
            return Float.compare(Math.abs(qa2.e() - this.f10600a), Math.abs(qa.e() - this.f10600a));
        }

        private c(float f) {
            this.f10600a = f;
        }
    }

    public Sa(C3074y c3074y, com.huawei.hms.scankit.aiscan.common.A a2) {
        this.f = c3074y;
        this.j = a2;
    }

    protected static float a(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = i;
        float f3 = f2 / i2;
        float f4 = f * f3;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            float f6 = iArr2[i4] * f3;
            float f7 = iArr[i4];
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }

    private boolean b(int[] iArr, int[] iArr2) {
        int i = iArr2[0];
        if ((i & 1) != 0) {
            iArr[i] = iArr[i] + 1;
        } else if (i == 4) {
            if (a(iArr, false)) {
                boolean a2 = a(iArr, iArr2[1], iArr2[2], false);
                if (a2) {
                    iArr2[4] = 2;
                }
                if (!a2) {
                    a2 = a(iArr, iArr2[1], iArr2[2]);
                }
                if (a2) {
                    iArr2[0] = 0;
                    a(iArr);
                    return true;
                }
            }
            if (b(iArr)) {
                int i2 = iArr2[2];
                for (int i3 = iArr2[0]; i3 > 2; i3--) {
                    i2 -= iArr[i3];
                }
                if (b(iArr, iArr2[1], i2)) {
                    d(iArr);
                    iArr2[0] = 3;
                    return true;
                }
            }
            if (_a.d && a(iArr, true) && a(iArr, iArr2[1], iArr2[2], true)) {
                iArr2[0] = 0;
                a(iArr);
                return true;
            }
            d(iArr);
            iArr2[0] = 3;
        } else {
            int i4 = i + 1;
            iArr2[0] = i4;
            iArr[i4] = iArr[i4] + 1;
        }
        return false;
    }

    private Qa[] c() throws C2967a {
        Qa[] a2 = this.g.size() > 2 ? a(true) : null;
        if (this.g.size() == 2) {
            int i = this.g.get(0).e() > this.g.get(1).e() ? 0 : 1;
            if (Math.max(this.g.get(0).e(), this.g.get(1).e()) / Math.min(this.g.get(0).e(), this.g.get(1).e()) > 1.5d) {
                Qa qa = this.g.get(i);
                this.g.clear();
                this.g.add(qa);
            }
        }
        if (this.g.size() == 1 && this.h.size() > 1) {
            a2 = g();
        }
        if (this.g.size() == 1 && this.h.size() == 1) {
            this.g.addAll(this.h);
            this.h.clear();
        }
        if (this.g.size() == 2) {
            try {
                a2 = h();
            } catch (C2967a unused) {
                a2 = b();
            }
        }
        if (this.g.size() != 0) {
            return a2;
        }
        this.g.addAll(this.h);
        return this.g.size() < 20 ? a(false) : f();
    }

    private int[] d() {
        a(this.i);
        return this.i;
    }

    private static void e() {
        c = false;
        d = false;
    }

    private Qa[] f() throws C2967a {
        int size = this.g.size();
        if (size < 3) {
            throw C2967a.a();
        }
        float f = 0.0f;
        if (size > 3) {
            Iterator<Qa> it = this.g.iterator();
            float f2 = 0.0f;
            float f3 = 0.0f;
            while (it.hasNext()) {
                float e2 = it.next().e();
                f2 += e2;
                f3 += e2 * e2;
            }
            float f4 = f2 / size;
            float sqrt = (float) Math.sqrt((f3 / r0) - (f4 * f4));
            Collections.sort(this.g, new c(f4));
            float max = Math.max(0.2f * f4, sqrt);
            int i = 0;
            while (i < this.g.size() && this.g.size() > 3) {
                if (Math.abs(this.g.get(i).e() - f4) > max) {
                    this.g.remove(i);
                    i--;
                }
                i++;
            }
        }
        if (this.g.size() > 3) {
            Iterator<Qa> it2 = this.g.iterator();
            while (it2.hasNext()) {
                f += it2.next().e();
            }
            Collections.sort(this.g, new a(f / this.g.size()));
            List<Qa> list = this.g;
            list.subList(3, list.size()).clear();
        }
        double[] dArr = {a(this.g.get(0), this.g.get(1)), a(this.g.get(1), this.g.get(2)), a(this.g.get(0), this.g.get(2))};
        Arrays.sort(dArr);
        double d2 = dArr[1];
        double d3 = dArr[0];
        if (Math.abs(((d2 + d3) - dArr[2]) / ((Math.sqrt(d3) * 2.0d) * Math.sqrt(dArr[1]))) <= 0.25d) {
            return new Qa[]{this.g.get(0), this.g.get(1), this.g.get(2)};
        }
        throw C2967a.a();
    }

    private Qa[] g() throws C2967a {
        Collections.sort(this.h, e);
        Qa[] qaArr = new Qa[3];
        double d2 = Double.MAX_VALUE;
        for (int i = 0; i < this.g.size(); i++) {
            Qa qa = this.g.get(i);
            float e2 = qa.e();
            int i2 = 0;
            while (true) {
                boolean z = true;
                if (i2 < this.h.size() - 1) {
                    Qa qa2 = this.h.get(i2);
                    double e3 = qa2.e() / e2;
                    if (e3 <= 1.25d && e3 >= 0.75d) {
                        double a2 = a(qa, qa2);
                        if (Math.sqrt(a2) >= e2 * 13.0f) {
                            int i3 = i2 + 1;
                            while (i3 < this.h.size()) {
                                Qa qa3 = this.h.get(i3);
                                boolean z2 = z;
                                double d3 = a2;
                                double e4 = qa3.e() / e2;
                                if (e4 <= 1.25d && e4 >= 0.75d) {
                                    double a3 = a(qa2, qa3);
                                    double a4 = a(qa, qa3);
                                    double[] dArr = new double[3];
                                    dArr[0] = d3;
                                    dArr[z2 ? 1 : 0] = a3;
                                    dArr[2] = a4;
                                    Arrays.sort(dArr);
                                    double abs = Math.abs(dArr[2] - (dArr[z2 ? 1 : 0] * 2.0d)) + Math.abs(dArr[2] - (dArr[0] * 2.0d));
                                    double d4 = dArr[2];
                                    double d5 = abs / d4;
                                    double d6 = dArr[z2 ? 1 : 0];
                                    double d7 = dArr[0];
                                    double sqrt = ((d6 + d7) - d4) / ((Math.sqrt(d7) * 2.0d) * Math.sqrt(dArr[z2 ? 1 : 0]));
                                    if (d5 < d2 && Math.abs(sqrt) < 0.2d) {
                                        qaArr[0] = qa;
                                        qaArr[z2 ? 1 : 0] = qa2;
                                        qaArr[2] = qa3;
                                        d2 = d5;
                                    }
                                }
                                i3++;
                                z = z2 ? 1 : 0;
                                a2 = d3;
                            }
                        }
                    }
                    i2++;
                }
            }
        }
        if (d2 != Double.MAX_VALUE) {
            return qaArr;
        }
        throw C2967a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x01d7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.huawei.hms.scankit.p.Qa[] h() throws com.huawei.hms.scankit.aiscan.common.C2967a {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.Sa.h():com.huawei.hms.scankit.p.Qa[]");
    }

    protected final void d(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }

    final Ta a() throws C2967a {
        int b2 = this.f.b();
        int d2 = this.f.d();
        int i = (b2 * 3) / 388;
        if (i < 3) {
            i = 3;
        }
        if (_a.i) {
            i = 2;
        }
        a(i, b2, d2);
        Qa[] c2 = c();
        if (c2 != null) {
            com.huawei.hms.scankit.aiscan.common.z.a(c2);
            if ((this.f.b() * this.f.d()) / (Math.sqrt(a(c2[0], c2[1])) * Math.sqrt(a(c2[1], c2[2]))) <= 900.0d) {
                return new Ta(c2);
            }
            throw C2967a.a();
        }
        throw C2967a.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0036, code lost:
    
        if (r8[2] <= r7) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0039, code lost:
    
        if (r5 < 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        if (r0.b(r6, r5) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0041, code lost:
    
        r1 = r8[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0043, code lost:
    
        if (r1 > r7) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0045, code lost:
    
        r8[1] = r1 + 1;
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004c, code lost:
    
        if (r5 < 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0050, code lost:
    
        if (r8[1] <= r7) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0054, code lost:
    
        if (r5 < 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005a, code lost:
    
        if (r0.b(r6, r5) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005c, code lost:
    
        r3 = r8[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005e, code lost:
    
        if (r3 > r7) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0060, code lost:
    
        r8[0] = r3 + 1;
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0069, code lost:
    
        if (r8[0] <= r7) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x006c, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean d(int r5, int r6, int r7, int[] r8) {
        /*
            r4 = this;
            com.huawei.hms.scankit.p.y r0 = r4.f
        L2:
            r1 = 3
            if (r5 < 0) goto L16
            boolean r2 = r0.b(r6, r5)
            if (r2 != 0) goto L16
            r2 = r8[r1]
            if (r2 > r7) goto L16
            int r2 = r2 + 1
            r8[r1] = r2
            int r5 = r5 + (-1)
            goto L2
        L16:
            r2 = 1
            if (r5 < 0) goto L6d
            r1 = r8[r1]
            if (r1 <= r7) goto L1e
            goto L6d
        L1e:
            r1 = 2
            if (r5 < 0) goto L32
            boolean r3 = r0.b(r6, r5)
            if (r3 == 0) goto L32
            r3 = r8[r1]
            if (r3 > r7) goto L32
            int r3 = r3 + 1
            r8[r1] = r3
            int r5 = r5 + (-1)
            goto L1e
        L32:
            if (r5 < 0) goto L6d
            r1 = r8[r1]
            if (r1 <= r7) goto L39
            goto L6d
        L39:
            if (r5 < 0) goto L4c
            boolean r1 = r0.b(r6, r5)
            if (r1 != 0) goto L4c
            r1 = r8[r2]
            if (r1 > r7) goto L4c
            int r1 = r1 + 1
            r8[r2] = r1
            int r5 = r5 + (-1)
            goto L39
        L4c:
            if (r5 < 0) goto L6d
            r1 = r8[r2]
            if (r1 <= r7) goto L53
            goto L6d
        L53:
            r1 = 0
            if (r5 < 0) goto L67
            boolean r3 = r0.b(r6, r5)
            if (r3 == 0) goto L67
            r3 = r8[r1]
            if (r3 > r7) goto L67
            int r3 = r3 + 1
            r8[r1] = r3
            int r5 = r5 + (-1)
            goto L53
        L67:
            r5 = r8[r1]
            if (r5 <= r7) goto L6c
            return r2
        L6c:
            return r1
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.Sa.d(int, int, int, int[]):boolean");
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private void a(int r11, int r12, int r13) {
        /*
            r10 = this;
            r0 = 5
            int[] r1 = new int[r0]
            int r2 = r11 + (-1)
        L5:
            if (r2 >= r12) goto L5e
            r10.a(r1)
            int[] r3 = new int[r0]
            r4 = 0
            r3[r4] = r4
            r5 = 1
            r3[r5] = r2
            r6 = 2
            r3[r6] = r4
            r7 = 3
            r3[r7] = r13
            r7 = 4
            r3[r7] = r11
            r8 = r4
        L1c:
            if (r8 >= r13) goto L39
            r3[r6] = r8
            com.huawei.hms.scankit.p.y r9 = r10.f
            boolean r9 = r9.b(r8, r2)
            if (r9 == 0) goto L2c
            r10.a(r1, r3)
            goto L33
        L2c:
            boolean r9 = r10.b(r1, r3)
            if (r9 == 0) goto L33
            goto L37
        L33:
            r8 = r3[r6]
            r11 = r3[r7]
        L37:
            int r8 = r8 + r5
            goto L1c
        L39:
            boolean r5 = b(r1)
            if (r5 == 0) goto L4e
            r3 = r3[r4]
            r5 = r13
        L42:
            if (r3 <= r6) goto L4a
            r7 = r1[r3]
            int r5 = r5 - r7
            int r3 = r3 + (-1)
            goto L42
        L4a:
            r10.b(r1, r2, r5)
            goto L4f
        L4e:
            r5 = r13
        L4f:
            boolean r3 = a(r1, r4)
            if (r3 == 0) goto L5c
            boolean r3 = r10.a(r1, r2, r5, r4)
            if (r3 == 0) goto L5c
            r11 = r6
        L5c:
            int r2 = r2 + r11
            goto L5
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.Sa.a(int, int, int):void");
    }

    protected static boolean c(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = i / 7.0f;
        float f2 = 0.75f * f;
        return Math.abs(f - ((float) iArr[0])) < f2 && Math.abs(f - ((float) iArr[1])) < f2 && Math.abs((f * 3.0f) - ((float) iArr[2])) < 3.0f * f2 && Math.abs(f - ((float) iArr[3])) < f2 && Math.abs(f - ((float) iArr[4])) < f2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:
    
        if (r2[3] < r12) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0045, code lost:
    
        if (r10 >= r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
    
        if (r0.b(r11, r10) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004d, code lost:
    
        r8 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004f, code lost:
    
        if (r8 >= r12) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0051, code lost:
    
        r2[4] = r8 + 1;
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
    
        r11 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005a, code lost:
    
        if (r11 < r12) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
    
        if (com.huawei.hms.scankit.p.Sa.d != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0062, code lost:
    
        if (com.huawei.hms.scankit.p.Sa.c != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0065, code lost:
    
        r12 = (((r2[0] + r2[1]) + r2[2]) + r2[3]) + r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0072, code lost:
    
        if (r14 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
    
        if ((java.lang.Math.abs(r12 - r13) * 5) < (r13 * 3)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0080, code lost:
    
        if (com.huawei.hms.scankit.p.Sa.d != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0084, code lost:
    
        if (com.huawei.hms.scankit.p.Sa.c != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0086, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0093, code lost:
    
        if (a(r2, r14) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0099, code lost:
    
        return a(r2, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0089, code lost:
    
        if (r12 >= (r13 * 3)) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008c, code lost:
    
        if ((r12 * 3) > r13) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private float b(int r10, int r11, int r12, int r13, boolean r14) {
        /*
            r9 = this;
            com.huawei.hms.scankit.p.y r0 = r9.f
            int r1 = r0.b()
            int[] r2 = r9.d()
            boolean r3 = r9.b(r10, r11, r12, r2)
            r4 = 2143289344(0x7fc00000, float:NaN)
            if (r3 == 0) goto L13
            return r4
        L13:
            r3 = 1
            int r10 = r10 + r3
        L15:
            r5 = 2
            if (r10 >= r1) goto L26
            boolean r6 = r0.b(r11, r10)
            if (r6 == 0) goto L26
            r6 = r2[r5]
            int r6 = r6 + r3
            r2[r5] = r6
            int r10 = r10 + 1
            goto L15
        L26:
            if (r10 != r1) goto L29
            return r4
        L29:
            r6 = 3
            if (r10 >= r1) goto L3d
            boolean r7 = r0.b(r11, r10)
            if (r7 != 0) goto L3d
            r7 = r2[r6]
            if (r7 >= r12) goto L3d
            int r7 = r7 + 1
            r2[r6] = r7
            int r10 = r10 + 1
            goto L29
        L3d:
            if (r10 == r1) goto L9a
            r7 = r2[r6]
            if (r7 < r12) goto L44
            goto L9a
        L44:
            r7 = 4
            if (r10 >= r1) goto L58
            boolean r8 = r0.b(r11, r10)
            if (r8 == 0) goto L58
            r8 = r2[r7]
            if (r8 >= r12) goto L58
            int r8 = r8 + 1
            r2[r7] = r8
            int r10 = r10 + 1
            goto L44
        L58:
            r11 = r2[r7]
            if (r11 < r12) goto L65
            boolean r12 = com.huawei.hms.scankit.p.Sa.d
            if (r12 != 0) goto L65
            boolean r12 = com.huawei.hms.scankit.p.Sa.c
            if (r12 != 0) goto L65
            return r4
        L65:
            r12 = 0
            r12 = r2[r12]
            r0 = r2[r3]
            int r12 = r12 + r0
            r0 = r2[r5]
            int r12 = r12 + r0
            r0 = r2[r6]
            int r12 = r12 + r0
            int r12 = r12 + r11
            if (r14 == 0) goto L87
            int r12 = r12 - r13
            int r11 = java.lang.Math.abs(r12)
            int r11 = r11 * 5
            int r13 = r13 * r6
            if (r11 < r13) goto L8f
            boolean r11 = com.huawei.hms.scankit.p.Sa.d
            if (r11 != 0) goto L8f
            boolean r11 = com.huawei.hms.scankit.p.Sa.c
            if (r11 != 0) goto L8f
            return r4
        L87:
            int r11 = r13 * 3
            if (r12 >= r11) goto L9a
            int r12 = r12 * r6
            if (r12 > r13) goto L8f
            goto L9a
        L8f:
            boolean r11 = a(r2, r14)
            if (r11 == 0) goto L9a
            float r10 = a(r2, r10)
            return r10
        L9a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.Sa.b(int, int, int, int, boolean):float");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
    
        if (r8[1] <= r7) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (r5 < 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0024, code lost:
    
        if (r0.b(r6, r5) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0026, code lost:
    
        r3 = r8[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
    
        if (r3 > r7) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002a, code lost:
    
        r8[0] = r3 + 1;
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        if (r8[0] <= r7) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0035, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0036, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean c(int r5, int r6, int r7, int[] r8) {
        /*
            r4 = this;
            com.huawei.hms.scankit.p.y r0 = r4.f
        L2:
            r1 = 1
            if (r5 < 0) goto L16
            boolean r2 = r0.b(r6, r5)
            if (r2 != 0) goto L16
            r2 = r8[r1]
            if (r2 > r7) goto L16
            int r2 = r2 + 1
            r8[r1] = r2
            int r5 = r5 + (-1)
            goto L2
        L16:
            if (r5 < 0) goto L37
            r2 = r8[r1]
            if (r2 <= r7) goto L1d
            goto L37
        L1d:
            r2 = 0
            if (r5 < 0) goto L31
            boolean r3 = r0.b(r6, r5)
            if (r3 == 0) goto L31
            r3 = r8[r2]
            if (r3 > r7) goto L31
            int r3 = r3 + 1
            r8[r2] = r3
            int r5 = r5 + (-1)
            goto L1d
        L31:
            r5 = r8[r2]
            if (r5 <= r7) goto L36
            return r1
        L36:
            return r2
        L37:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.Sa.c(int, int, int, int[]):boolean");
    }

    private void a(int[] iArr, int[] iArr2) {
        int i = iArr2[0];
        if ((i & 1) == 1) {
            iArr2[0] = i + 1;
        }
        int i2 = iArr2[0];
        if (i2 >= 0 && i2 < iArr.length) {
            iArr[i2] = iArr[i2] + 1;
        }
        if (iArr2[2] == iArr2[3] - 1 && iArr2[0] == 4) {
            if (a(iArr, false)) {
                boolean a2 = a(iArr, iArr2[1], iArr2[2], false);
                if (a2) {
                    iArr2[4] = 2;
                }
                if (!a2) {
                    a2 = a(iArr, iArr2[1], iArr2[2]);
                }
                if (a2) {
                    iArr2[0] = 0;
                    a(iArr);
                    while (iArr2[2] < this.f.d() && !this.f.b(iArr2[2], iArr2[1])) {
                        iArr2[2] = iArr2[2] + 1;
                    }
                }
            }
            if (_a.d && a(iArr, true) && a(iArr, iArr2[1], iArr2[2], true)) {
                iArr2[0] = 0;
                a(iArr);
            }
        }
    }

    private boolean b(int i, int i2, int i3, int[] iArr) {
        int i4;
        C3074y c3074y = this.f;
        while (i >= 0 && c3074y.b(i2, i)) {
            iArr[2] = iArr[2] + 1;
            i--;
        }
        if (i < 0) {
            return true;
        }
        while (i >= 0 && !c3074y.b(i2, i)) {
            int i5 = iArr[1];
            if (i5 > i3) {
                break;
            }
            iArr[1] = i5 + 1;
            i--;
        }
        if (i < 0 || iArr[1] > i3) {
            return true;
        }
        while (i >= 0 && c3074y.b(i2, i) && (i4 = iArr[0]) <= i3) {
            iArr[0] = i4 + 1;
            i--;
        }
        return (iArr[0] <= i3 || d || c) ? false : true;
    }

    protected static boolean b(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = i / 7.0f;
        float f2 = 0.5f * f;
        return Math.abs(f - ((float) iArr[0])) < f2 && Math.abs((5.0f * f) - ((float) iArr[1])) < f2 && Math.abs(f - ((float) iArr[2])) < f2;
    }

    private static float a(int[] iArr, int i) {
        return ((i - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    protected static boolean a(int[] iArr, boolean z) {
        float f;
        float f2;
        e();
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        if (z && _a.d) {
            f2 = 0.75f;
            f = 1.0f;
        } else {
            f = 3.0f;
            f2 = 0.5f;
        }
        float f3 = i / 7.0f;
        float f4 = f2 * f3;
        if (Math.abs(f3 - iArr[0]) < f4 && Math.abs(f3 - iArr[1]) < f4 && Math.abs((3.0f * f3) - iArr[2]) < f * f4 && Math.abs(f3 - iArr[3]) < f4 && Math.abs(f3 - iArr[4]) < f4) {
            return true;
        }
        if (!z) {
            return false;
        }
        int[] iArr2 = new int[iArr.length - 1];
        int i4 = 0;
        while (i4 < iArr.length - 1) {
            int i5 = i4 + 1;
            iArr2[i4] = iArr[i5];
            i4 = i5;
        }
        int[] iArr3 = new int[iArr.length - 1];
        for (int i6 = 0; i6 < iArr.length - 1; i6++) {
            iArr3[i6] = iArr[i6];
        }
        float a2 = a(iArr2, f10598a, 0.5f);
        float a3 = a(iArr3, b, 0.5f);
        boolean z2 = a2 < 0.3f;
        c = z2;
        boolean z3 = a3 < 0.3f;
        d = z3;
        return z2 || z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r2[3] <= r11) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        if (r9 >= r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
    
        if (r0.b(r10, r9) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
    
        r2[4] = r2[4] + 1;
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
    
        r10 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if (r10 <= r11) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        if ((java.lang.Math.abs(((((r2[0] + r2[1]) + r2[2]) + r2[3]) + r10) - r12) * 5) < (r12 * 2)) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
    
        if (a(r2, true) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0069, code lost:
    
        return a(r2, r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private float b(int r9, int r10, int r11, int r12) {
        /*
            r8 = this;
            com.huawei.hms.scankit.p.y r0 = r8.f
            int r1 = r0.b()
            int[] r2 = r8.d()
            boolean r3 = r8.d(r9, r10, r11, r2)
            r4 = 2143289344(0x7fc00000, float:NaN)
            if (r3 == 0) goto L13
            return r4
        L13:
            r3 = 1
            int r9 = r9 + r3
        L15:
            r5 = 3
            if (r9 >= r1) goto L29
            boolean r6 = r0.b(r10, r9)
            if (r6 != 0) goto L29
            r6 = r2[r5]
            if (r6 > r11) goto L29
            int r6 = r6 + 1
            r2[r5] = r6
            int r9 = r9 + 1
            goto L15
        L29:
            if (r9 < 0) goto L6a
            r6 = r2[r5]
            if (r6 <= r11) goto L30
            goto L6a
        L30:
            r6 = 4
            if (r9 >= r1) goto L41
            boolean r7 = r0.b(r10, r9)
            if (r7 == 0) goto L41
            r7 = r2[r6]
            int r7 = r7 + r3
            r2[r6] = r7
            int r9 = r9 + 1
            goto L30
        L41:
            r10 = r2[r6]
            if (r10 <= r11) goto L46
            return r4
        L46:
            r11 = 0
            r11 = r2[r11]
            r0 = r2[r3]
            int r11 = r11 + r0
            r0 = 2
            r1 = r2[r0]
            int r11 = r11 + r1
            r1 = r2[r5]
            int r11 = r11 + r1
            int r11 = r11 + r10
            int r11 = r11 - r12
            int r10 = java.lang.Math.abs(r11)
            int r10 = r10 * 5
            int r12 = r12 * r0
            if (r10 < r12) goto L5f
            return r4
        L5f:
            boolean r10 = a(r2, r3)
            if (r10 == 0) goto L6a
            float r9 = a(r2, r9)
            return r9
        L6a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.Sa.b(int, int, int, int):float");
    }

    protected final boolean b(int[] iArr, int i, int i2) {
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = i3 + i4 + iArr[2];
        float f = i2 - (i5 / 2);
        int i6 = (int) f;
        float a2 = a(i, i6, i4, i5);
        if (Float.isNaN(a2)) {
            a2 = a(i, (int) (f - ((r9 * 2) / 5)), (int) (((r9 * 2) / 5) + f), iArr[1], i5);
            if (Float.isNaN(a2) && _a.d) {
                a2 = b(i, i6, iArr[1], i5);
            }
        }
        if (Float.isNaN(a2)) {
            return false;
        }
        return a(false, a2, f, i5 / 7.0f);
    }

    protected final void a(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = 0;
        }
    }

    private boolean a(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int[] d2 = d();
        int i6 = 0;
        while (i >= i6 && i2 >= i6 && this.f.b(i2 - i6, i - i6)) {
            d2[2] = d2[2] + 1;
            i6++;
        }
        if (d2[2] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && !this.f.b(i2 - i6, i - i6)) {
            d2[1] = d2[1] + 1;
            i6++;
        }
        if (d2[1] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && this.f.b(i2 - i6, i - i6)) {
            d2[0] = d2[0] + 1;
            i6++;
        }
        if (d2[0] == 0) {
            return false;
        }
        int b2 = this.f.b();
        int d3 = this.f.d();
        int i7 = 1;
        while (true) {
            int i8 = i + i7;
            if (i8 >= b2 || (i5 = i2 + i7) >= d3 || !this.f.b(i5, i8)) {
                break;
            }
            d2[2] = d2[2] + 1;
            i7++;
        }
        while (true) {
            int i9 = i + i7;
            if (i9 >= b2 || (i4 = i2 + i7) >= d3 || this.f.b(i4, i9)) {
                break;
            }
            d2[3] = d2[3] + 1;
            i7++;
        }
        if (d2[3] == 0) {
            return false;
        }
        while (true) {
            int i10 = i + i7;
            if (i10 >= b2 || (i3 = i2 + i7) >= d3 || !this.f.b(i3, i10)) {
                break;
            }
            d2[4] = d2[4] + 1;
            i7++;
        }
        if (d2[4] == 0) {
            return false;
        }
        return c(d2);
    }

    private Qa[] b() throws C2967a {
        Qa qa = this.g.get(0);
        Qa qa2 = this.g.get(1);
        float[] fArr = qa.b() < qa2.b() ? new float[]{qa.b(), qa2.b()} : new float[]{qa2.b(), qa.b()};
        float[] fArr2 = qa.b() < qa2.b() ? new float[]{qa.c(), qa2.c()} : new float[]{qa2.c(), qa.c()};
        float e2 = (qa.e() + qa2.e()) / 2.0f;
        float e3 = ((qa.e() + qa2.e()) * 7.0f) / 1.5f;
        if (Math.abs(fArr[0] - fArr[1]) > e3 && Math.abs(fArr2[0] - fArr2[1]) <= e3) {
            float f = fArr[0];
            float f2 = fArr2[0];
            this.g.add(new Qa((f + f2) - fArr2[1], (f2 + fArr[1]) - f, e2, false, 0));
        } else if (Math.abs(fArr[0] - fArr[1]) <= e3 && Math.abs(fArr2[0] - fArr2[1]) > e3) {
            float f3 = fArr[0];
            float f4 = fArr[1];
            if (f3 < f4) {
                float f5 = fArr2[0] + f4;
                float f6 = fArr2[1];
                this.g.add(new Qa(f5 - f6, (f6 + f4) - f3, e2, false, 0));
            } else {
                float f7 = fArr2[1] + f3;
                float f8 = fArr2[0];
                this.g.add(new Qa(f7 - f8, (f8 + f3) - f4, e2, false, 0));
            }
        } else if (Math.abs(fArr[0] - fArr[1]) > e3 && Math.abs(fArr2[0] - fArr2[1]) > e3) {
            float f9 = fArr[0];
            float f10 = fArr[1];
            float f11 = fArr2[1];
            float f12 = fArr2[0];
            this.g.add(new Qa((((f9 + f10) + f11) - f12) / 2.0f, (((f12 + f11) + f9) - f10) / 2.0f, e2, false, 0));
        }
        if (this.g.size() == 3) {
            return new Qa[]{this.g.get(0), this.g.get(1), this.g.get(2)};
        }
        throw C2967a.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:
    
        if (r2[3] < r12) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0045, code lost:
    
        if (r10 >= r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
    
        if (r0.b(r10, r11) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004d, code lost:
    
        r8 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004f, code lost:
    
        if (r8 >= r12) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0051, code lost:
    
        r2[4] = r8 + 1;
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
    
        r11 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005a, code lost:
    
        if (r11 < r12) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
    
        if (com.huawei.hms.scankit.p.Sa.d != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0062, code lost:
    
        if (com.huawei.hms.scankit.p.Sa.c != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0079, code lost:
    
        if ((java.lang.Math.abs(((((r2[0] + r2[1]) + r2[2]) + r2[3]) + r11) - r13) * 5) < r13) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007d, code lost:
    
        if (com.huawei.hms.scankit.p.Sa.d != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
    
        if (com.huawei.hms.scankit.p.Sa.c != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0083, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0088, code lost:
    
        if (a(r2, r14) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008e, code lost:
    
        return a(r2, r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private float a(int r10, int r11, int r12, int r13, boolean r14) {
        /*
            r9 = this;
            com.huawei.hms.scankit.p.y r0 = r9.f
            int r1 = r0.d()
            int[] r2 = r9.d()
            boolean r3 = r9.a(r10, r11, r12, r2)
            r4 = 2143289344(0x7fc00000, float:NaN)
            if (r3 == 0) goto L13
            return r4
        L13:
            r3 = 1
            int r10 = r10 + r3
        L15:
            r5 = 2
            if (r10 >= r1) goto L26
            boolean r6 = r0.b(r10, r11)
            if (r6 == 0) goto L26
            r6 = r2[r5]
            int r6 = r6 + r3
            r2[r5] = r6
            int r10 = r10 + 1
            goto L15
        L26:
            if (r10 != r1) goto L29
            return r4
        L29:
            r6 = 3
            if (r10 >= r1) goto L3d
            boolean r7 = r0.b(r10, r11)
            if (r7 != 0) goto L3d
            r7 = r2[r6]
            if (r7 >= r12) goto L3d
            int r7 = r7 + 1
            r2[r6] = r7
            int r10 = r10 + 1
            goto L29
        L3d:
            if (r10 == r1) goto L8f
            r7 = r2[r6]
            if (r7 < r12) goto L44
            goto L8f
        L44:
            r7 = 4
            if (r10 >= r1) goto L58
            boolean r8 = r0.b(r10, r11)
            if (r8 == 0) goto L58
            r8 = r2[r7]
            if (r8 >= r12) goto L58
            int r8 = r8 + 1
            r2[r7] = r8
            int r10 = r10 + 1
            goto L44
        L58:
            r11 = r2[r7]
            if (r11 < r12) goto L65
            boolean r12 = com.huawei.hms.scankit.p.Sa.d
            if (r12 != 0) goto L65
            boolean r12 = com.huawei.hms.scankit.p.Sa.c
            if (r12 != 0) goto L65
            return r4
        L65:
            r12 = 0
            r12 = r2[r12]
            r0 = r2[r3]
            int r12 = r12 + r0
            r0 = r2[r5]
            int r12 = r12 + r0
            r0 = r2[r6]
            int r12 = r12 + r0
            int r12 = r12 + r11
            int r12 = r12 - r13
            int r11 = java.lang.Math.abs(r12)
            int r11 = r11 * 5
            if (r11 < r13) goto L84
            boolean r11 = com.huawei.hms.scankit.p.Sa.d
            if (r11 != 0) goto L84
            boolean r11 = com.huawei.hms.scankit.p.Sa.c
            if (r11 != 0) goto L84
            return r4
        L84:
            boolean r11 = a(r2, r14)
            if (r11 == 0) goto L8f
            float r10 = a(r2, r10)
            return r10
        L8f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.Sa.a(int, int, int, int, boolean):float");
    }

    private boolean a(int i, int i2, int i3, int[] iArr) {
        int i4;
        C3074y c3074y = this.f;
        while (i >= 0 && c3074y.b(i, i2)) {
            iArr[2] = iArr[2] + 1;
            i--;
        }
        if (i < 0) {
            return true;
        }
        while (i >= 0 && !c3074y.b(i, i2)) {
            int i5 = iArr[1];
            if (i5 > i3) {
                break;
            }
            iArr[1] = i5 + 1;
            i--;
        }
        if (i < 0 || iArr[1] > i3) {
            return true;
        }
        while (i >= 0 && c3074y.b(i, i2) && (i4 = iArr[0]) <= i3) {
            iArr[0] = i4 + 1;
            i--;
        }
        return (iArr[0] <= i3 || d || c) ? false : true;
    }

    protected final boolean a(int[] iArr, int i, int i2, boolean z) {
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = i4 + i5 + i6 + i7 + i8;
        if (c) {
            i9 = i5 + i5 + i6 + i7 + i8;
        } else if (d) {
            i9 = i4 + i5 + i6 + i7 + i7;
        }
        int i10 = i9;
        int a2 = (int) a(iArr, i2);
        float b2 = b(i, a2, iArr[2], i10, z);
        if (!Float.isNaN(b2)) {
            float f = i10 / 7.0f;
            int i11 = (int) b2;
            float a3 = a(a2, i11, iArr[2], i10, z);
            if (!Float.isNaN(a3) && (a(i11, (int) a3) || (z && (d || c)))) {
                if (z) {
                    return a(false, b2, a3, f);
                }
                while (true) {
                    if (i3 < this.g.size()) {
                        Qa qa = this.g.get(i3);
                        if (qa.a(f, b2, a3)) {
                            this.g.set(i3, qa.a(b2, a3, f, true));
                            break;
                        }
                        i3++;
                    } else {
                        Qa qa2 = new Qa(a3, b2, f, true);
                        this.g.add(qa2);
                        com.huawei.hms.scankit.aiscan.common.A a4 = this.j;
                        if (a4 != null) {
                            a4.a(qa2);
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    private static double a(Qa qa, Qa qa2) {
        double b2 = qa.b() - qa2.b();
        double c2 = qa.c() - qa2.c();
        return (b2 * b2) + (c2 * c2);
    }

    private Qa[] a(boolean z) throws C2967a {
        Qa[] qaArr;
        Collections.sort(this.g, e);
        float f = z ? 0.4f : 0.25f;
        int i = 3;
        Qa[] qaArr2 = new Qa[3];
        int i2 = 0;
        double d2 = Double.MAX_VALUE;
        while (i2 < this.g.size() - 2) {
            Qa qa = this.g.get(i2);
            float e2 = qa.e();
            i2++;
            int i3 = i2;
            while (i3 < this.g.size() - 1) {
                Qa qa2 = this.g.get(i3);
                double a2 = a(qa, qa2);
                i3++;
                int i4 = i3;
                while (i4 < this.g.size()) {
                    Qa qa3 = this.g.get(i4);
                    if (qa3.e() > 1.4f * e2) {
                        qaArr = qaArr2;
                    } else {
                        double a3 = a(qa2, qa3);
                        double a4 = a(qa, qa3);
                        double[] dArr = new double[i];
                        dArr[0] = a2;
                        dArr[1] = a3;
                        dArr[2] = a4;
                        Arrays.sort(dArr);
                        double abs = Math.abs(dArr[2] - (dArr[1] * 2.0d)) + Math.abs(dArr[2] - (dArr[0] * 2.0d));
                        double d3 = dArr[2];
                        double d4 = abs / d3;
                        double d5 = dArr[1];
                        double d6 = dArr[0];
                        double sqrt = ((d5 + d6) - d3) / ((Math.sqrt(d6) * 2.0d) * Math.sqrt(dArr[1]));
                        if (d4 < d2) {
                            qaArr = qaArr2;
                            if (Math.abs(sqrt) < f) {
                                qaArr[0] = qa;
                                qaArr[1] = qa2;
                                qaArr[2] = qa3;
                                d2 = d4;
                            }
                        } else {
                            qaArr = qaArr2;
                        }
                    }
                    i4++;
                    qaArr2 = qaArr;
                    i = 3;
                }
            }
        }
        Qa[] qaArr3 = qaArr2;
        if (Double.MAX_VALUE != d2) {
            return qaArr3;
        }
        throw C2967a.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x005c, code lost:
    
        if (r2[3] < r12) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0060, code lost:
    
        if (r10 >= r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0066, code lost:
    
        if (r0.b(r11, r10) == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0068, code lost:
    
        r8 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006a, code lost:
    
        if (r8 >= r12) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006c, code lost:
    
        r2[4] = r8 + 1;
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0073, code lost:
    
        r11 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0075, code lost:
    
        if (r11 < r12) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0077, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008d, code lost:
    
        if ((java.lang.Math.abs(((((r2[0] + r2[1]) + r2[2]) + r2[3]) + r11) - r13) * 5) < (r13 * 2)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008f, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0092, code lost:
    
        if (com.huawei.hms.scankit.p._a.d == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0098, code lost:
    
        if (a(r2, true) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x009e, code lost:
    
        return a(r2, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009f, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a4, code lost:
    
        if (a(r2, false) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00aa, code lost:
    
        return a(r2, r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private float a(int r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            com.huawei.hms.scankit.p.y r0 = r9.f
            int r1 = r0.b()
            int[] r2 = r9.d()
            boolean r3 = r9.c(r10, r11, r12, r2)
            r4 = 2143289344(0x7fc00000, float:NaN)
            if (r3 == 0) goto L13
            return r4
        L13:
            r3 = 1
            int r10 = r10 + r3
        L15:
            if (r10 >= r1) goto L28
            boolean r5 = r0.b(r11, r10)
            if (r5 != 0) goto L28
            r5 = r2[r3]
            if (r5 > r12) goto L28
            int r5 = r5 + 1
            r2[r3] = r5
            int r10 = r10 + 1
            goto L15
        L28:
            if (r10 < 0) goto Lab
            r5 = r2[r3]
            if (r5 <= r12) goto L30
            goto Lab
        L30:
            r5 = 2
            if (r10 >= r1) goto L41
            boolean r6 = r0.b(r11, r10)
            if (r6 == 0) goto L41
            r6 = r2[r5]
            int r6 = r6 + r3
            r2[r5] = r6
            int r10 = r10 + 1
            goto L30
        L41:
            if (r10 != r1) goto L44
            return r4
        L44:
            r6 = 3
            if (r10 >= r1) goto L58
            boolean r7 = r0.b(r11, r10)
            if (r7 != 0) goto L58
            r7 = r2[r6]
            if (r7 >= r12) goto L58
            int r7 = r7 + 1
            r2[r6] = r7
            int r10 = r10 + 1
            goto L44
        L58:
            if (r10 == r1) goto Lab
            r7 = r2[r6]
            if (r7 < r12) goto L5f
            goto Lab
        L5f:
            r7 = 4
            if (r10 >= r1) goto L73
            boolean r8 = r0.b(r11, r10)
            if (r8 == 0) goto L73
            r8 = r2[r7]
            if (r8 >= r12) goto L73
            int r8 = r8 + 1
            r2[r7] = r8
            int r10 = r10 + 1
            goto L5f
        L73:
            r11 = r2[r7]
            if (r11 < r12) goto L78
            return r4
        L78:
            r12 = 0
            r0 = r2[r12]
            r1 = r2[r3]
            int r0 = r0 + r1
            r1 = r2[r5]
            int r0 = r0 + r1
            r1 = r2[r6]
            int r0 = r0 + r1
            int r0 = r0 + r11
            int r0 = r0 - r13
            int r11 = java.lang.Math.abs(r0)
            int r11 = r11 * 5
            int r13 = r13 * r5
            if (r11 < r13) goto L90
            return r4
        L90:
            boolean r11 = com.huawei.hms.scankit.p._a.d
            if (r11 == 0) goto La0
            boolean r11 = a(r2, r3)
            if (r11 == 0) goto L9f
            float r10 = a(r2, r10)
            return r10
        L9f:
            return r4
        La0:
            boolean r11 = a(r2, r12)
            if (r11 == 0) goto Lab
            float r10 = a(r2, r10)
            return r10
        Lab:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.Sa.a(int, int, int, int):float");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r10 = r18 * 1.5d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r5[1] <= r10) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        if (r6 < 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (r2.b(r4, r6) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        r9 = r5[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        if (r9 > r18) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        r5[0] = r9 + 1;
        r6 = r6 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        if (r5[0] <= (r18 / 2)) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        r6 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        if (r6 >= r3) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        if (r2.b(r4, r6) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        r9 = r5[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r9 > r18) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        r5[1] = r9 + 1;
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
    
        if (r6 < 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006d, code lost:
    
        if (r5[1] <= r10) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0071, code lost:
    
        if (r6 >= r3) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0077, code lost:
    
        if (r2.b(r4, r6) == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0079, code lost:
    
        r5[2] = r5[2] + 1;
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0093, code lost:
    
        if ((java.lang.Math.abs(((r5[0] + r5[1]) + r5[2]) - r19) * 5) < (r19 * 2)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009a, code lost:
    
        if (b(r5) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a4, code lost:
    
        return (r6 - (r5[1] / 2)) - r5[2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a5, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a5, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a5, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a5, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a5, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private float a(int r15, int r16, int r17, int r18, int r19) {
        /*
            r14 = this;
            r0 = r17
            r1 = r18
            com.huawei.hms.scankit.p.y r2 = r14.f
            int r3 = r2.b()
            r4 = r16
        Lc:
            if (r4 > r0) goto Laa
            int[] r5 = r14.d()
            r6 = r15
        L13:
            r7 = 1
            if (r6 < 0) goto L27
            boolean r8 = r2.b(r4, r6)
            if (r8 != 0) goto L27
            r8 = r5[r7]
            if (r8 > r1) goto L27
            int r8 = r8 + 1
            r5[r7] = r8
            int r6 = r6 + (-1)
            goto L13
        L27:
            if (r6 < 0) goto La5
            r8 = r5[r7]
            double r8 = (double) r8
            double r10 = (double) r1
            r12 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r10 = r10 * r12
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 <= 0) goto L36
            goto La5
        L36:
            r8 = 0
            if (r6 < 0) goto L4a
            boolean r9 = r2.b(r4, r6)
            if (r9 == 0) goto L4a
            r9 = r5[r8]
            if (r9 > r1) goto L4a
            int r9 = r9 + 1
            r5[r8] = r9
            int r6 = r6 + (-1)
            goto L36
        L4a:
            r6 = r5[r8]
            int r9 = r1 / 2
            if (r6 <= r9) goto L51
            goto La5
        L51:
            int r6 = r15 + 1
        L53:
            if (r6 >= r3) goto L66
            boolean r9 = r2.b(r4, r6)
            if (r9 != 0) goto L66
            r9 = r5[r7]
            if (r9 > r1) goto L66
            int r9 = r9 + 1
            r5[r7] = r9
            int r6 = r6 + 1
            goto L53
        L66:
            if (r6 < 0) goto La5
            r9 = r5[r7]
            double r12 = (double) r9
            int r9 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r9 <= 0) goto L70
            goto La5
        L70:
            r9 = 2
            if (r6 >= r3) goto L81
            boolean r10 = r2.b(r4, r6)
            if (r10 == 0) goto L81
            r10 = r5[r9]
            int r10 = r10 + r7
            r5[r9] = r10
            int r6 = r6 + 1
            goto L70
        L81:
            r8 = r5[r8]
            r10 = r5[r7]
            int r8 = r8 + r10
            r10 = r5[r9]
            int r8 = r8 + r10
            int r8 = r8 - r19
            int r8 = java.lang.Math.abs(r8)
            int r8 = r8 * 5
            int r10 = r19 * 2
            if (r8 < r10) goto L96
            goto La5
        L96:
            boolean r8 = b(r5)
            if (r8 == 0) goto La5
            r15 = r5[r7]
            int r15 = r15 / r9
            int r6 = r6 - r15
            r15 = r5[r9]
            int r6 = r6 - r15
            float r15 = (float) r6
            return r15
        La5:
            int r5 = r0 - r16
            int r4 = r4 + r5
            goto Lc
        Laa:
            r15 = 2143289344(0x7fc00000, float:NaN)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.Sa.a(int, int, int, int, int):float");
    }

    protected final boolean a(int[] iArr, int i, int i2) {
        int i3 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        float a2 = a(iArr, i2);
        float b2 = b(i, (int) a2, iArr[2], i3, false);
        if (Float.isNaN(b2)) {
            int i4 = iArr[2];
            int i5 = iArr[1];
            b2 = a(i, (int) ((a2 - (i4 / 2)) - (i5 / 2)), (int) ((i4 / 2) + a2 + (r13 / 2)), i5 + i4 + iArr[3], i3);
            i3 = i3;
        }
        if (Float.isNaN(b2)) {
            return false;
        }
        return a(false, b2, a2, i3 / 7.0f);
    }

    private boolean a(boolean z, float f, float f2, float f3) {
        int i = 0;
        while (true) {
            if (i >= this.h.size()) {
                break;
            }
            Qa qa = this.h.get(i);
            if (qa.a(f3, f, f2)) {
                this.h.set(i, qa.a(f, f2, f3, false));
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            Qa qa2 = new Qa(f2, f, f3, false);
            this.h.add(qa2);
            com.huawei.hms.scankit.aiscan.common.A a2 = this.j;
            if (a2 != null) {
                a2.a(qa2);
            }
        }
        return true;
    }
}
