package com.huawei.hms.scankit.p;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: HighLevelEncoder.java */
/* loaded from: classes14.dex */
public final class Ub {

    /* renamed from: a, reason: collision with root package name */
    static final String[] f10605a = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};
    static final int[][] b = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};
    private static final int[][] c;
    static final int[][] d;
    private final byte[] e;

    /* compiled from: HighLevelEncoder.java */
    static class a<State> implements Comparator<Wb> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Wb wb, Wb wb2) {
            return wb.b() - wb2.b();
        }
    }

    static {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 5, 256);
        c = iArr;
        iArr[0][32] = 1;
        for (int i = 65; i <= 90; i++) {
            c[0][i] = i - 63;
        }
        c[1][32] = 1;
        for (int i2 = 97; i2 <= 122; i2++) {
            c[1][i2] = i2 - 95;
        }
        c[2][32] = 1;
        for (int i3 = 48; i3 <= 57; i3++) {
            c[2][i3] = i3 - 46;
        }
        int[] iArr2 = c[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i4 = 0; i4 < 28; i4++) {
            c[3][iArr3[i4]] = i4;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i5 = 0; i5 < 31; i5++) {
            int i6 = iArr4[i5];
            if (i6 > 0) {
                c[4][i6] = i5;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 6, 6);
        d = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = d;
        if (com.huawei.hms.scankit.util.b.a(iArr7, 0) && com.huawei.hms.scankit.util.b.a(iArr7[0], 4)) {
            iArr7[0][4] = 0;
        }
        if (com.huawei.hms.scankit.util.b.a(iArr7, 1) && com.huawei.hms.scankit.util.b.a(iArr7[1], 4)) {
            iArr7[1][4] = 0;
        }
        if (com.huawei.hms.scankit.util.b.a(iArr7, 1) && com.huawei.hms.scankit.util.b.a(iArr7[1], 0)) {
            iArr7[1][0] = 28;
        }
        if (com.huawei.hms.scankit.util.b.a(iArr7, 3) && com.huawei.hms.scankit.util.b.a(iArr7[3], 4)) {
            iArr7[3][4] = 0;
        }
        if (com.huawei.hms.scankit.util.b.a(iArr7, 2) && com.huawei.hms.scankit.util.b.a(iArr7[2], 4)) {
            iArr7[2][4] = 0;
        }
        if (com.huawei.hms.scankit.util.b.a(iArr7, 2) && com.huawei.hms.scankit.util.b.a(iArr7[2], 0)) {
            iArr7[2][0] = 15;
        }
    }

    public Ub(byte[] bArr) {
        this.e = bArr;
    }

    public C3070x a() {
        int i;
        Collection<Wb> singletonList = Collections.singletonList(Wb.f10611a);
        int i2 = 0;
        while (true) {
            byte[] bArr = this.e;
            if (i2 >= bArr.length) {
                return ((Wb) Collections.min(singletonList, new a())).a(this.e);
            }
            int i3 = i2 + 1;
            byte b2 = i3 < bArr.length ? bArr[i3] : (byte) 0;
            byte b3 = bArr[i2];
            if (b3 == 13) {
                if (b2 == 10) {
                    i = 2;
                }
                i = 0;
            } else if (b3 == 44) {
                if (b2 == 32) {
                    i = 4;
                }
                i = 0;
            } else if (b3 != 46) {
                if (b3 == 58 && b2 == 32) {
                    i = 5;
                }
                i = 0;
            } else {
                if (b2 == 32) {
                    i = 3;
                }
                i = 0;
            }
            if (i > 0) {
                singletonList = a(singletonList, i2, i);
                i2 = i3;
            } else {
                singletonList = a(singletonList, i2);
            }
            i2++;
        }
    }

    private Collection<Wb> a(Iterable<Wb> iterable, int i) {
        LinkedList linkedList = new LinkedList();
        Iterator<Wb> it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next(), i, linkedList);
        }
        return a(linkedList);
    }

    private void a(Wb wb, int i, Collection<Wb> collection) {
        if (com.huawei.hms.scankit.util.b.a(this.e, i)) {
            char c2 = (char) (this.e[i] & 255);
            int[][] iArr = c;
            boolean z = com.huawei.hms.scankit.util.b.a(iArr, wb.c()) && com.huawei.hms.scankit.util.b.a(iArr[wb.c()], (int) c2) && iArr[wb.c()][c2] > 0;
            Wb wb2 = null;
            for (int i2 = 0; i2 <= 4; i2++) {
                int[][] iArr2 = c;
                int i3 = (com.huawei.hms.scankit.util.b.a(iArr2, i2) && com.huawei.hms.scankit.util.b.a(iArr2[i2], (int) c2)) ? iArr2[i2][c2] : 0;
                if (i3 > 0) {
                    if (wb2 == null) {
                        wb2 = wb.b(i);
                    }
                    if (!z || i2 == wb.c() || i2 == 2) {
                        collection.add(wb2.a(i2, i3));
                    }
                    if (!z && d[wb.c()][i2] >= 0) {
                        collection.add(wb2.b(i2, i3));
                    }
                }
            }
            int[][] iArr3 = c;
            if (com.huawei.hms.scankit.util.b.a(iArr3, wb.c()) && com.huawei.hms.scankit.util.b.a(iArr3[wb.c()], (int) c2)) {
                if (wb.a() > 0 || iArr3[wb.c()][c2] == 0) {
                    collection.add(wb.a(i));
                }
            }
        }
    }

    private static Collection<Wb> a(Iterable<Wb> iterable, int i, int i2) {
        LinkedList linkedList = new LinkedList();
        Iterator<Wb> it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next(), i, i2, linkedList);
        }
        return a(linkedList);
    }

    private static void a(Wb wb, int i, int i2, Collection<Wb> collection) {
        Wb b2 = wb.b(i);
        collection.add(b2.a(4, i2));
        if (wb.c() != 4) {
            collection.add(b2.b(4, i2));
        }
        if (i2 == 3 || i2 == 4) {
            collection.add(b2.a(2, 16 - i2).a(2, 1));
        }
        if (wb.a() > 0) {
            collection.add(wb.a(i).a(i + 1));
        }
    }

    private static Collection<Wb> a(Iterable<Wb> iterable) {
        LinkedList linkedList = new LinkedList();
        for (Wb wb : iterable) {
            Iterator it = linkedList.iterator();
            while (true) {
                if (it.hasNext()) {
                    Wb wb2 = (Wb) it.next();
                    if (wb2.a(wb)) {
                        break;
                    }
                    if (wb.a(wb2)) {
                        it.remove();
                    }
                } else {
                    linkedList.add(wb);
                    break;
                }
            }
        }
        return linkedList;
    }
}
