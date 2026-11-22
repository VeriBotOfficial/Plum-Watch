package com.anythink.core.common.n.c;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes12.dex */
public final class o extends AbstractList<f> implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    final f[] f4234a;
    final int[] b;

    private o(f[] fVarArr, int[] iArr) {
        this.f4234a = fVarArr;
        this.b = iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a3, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.anythink.core.common.n.c.o a(com.anythink.core.common.n.c.f... r10) {
        /*
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.List r0 = java.util.Arrays.asList(r10)
            r4.<init>(r0)
            java.util.Collections.sort(r4)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r8 = 0
            r0 = r8
        L13:
            int r1 = r4.size()
            if (r0 >= r1) goto L24
            r1 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r7.add(r1)
            int r0 = r0 + 1
            goto L13
        L24:
            r0 = r8
        L25:
            int r1 = r4.size()
            if (r0 >= r1) goto L3b
            r1 = r10[r0]
            int r1 = java.util.Collections.binarySearch(r4, r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r7.set(r1, r2)
            int r0 = r0 + 1
            goto L25
        L3b:
            java.lang.Object r0 = r4.get(r8)
            com.anythink.core.common.n.c.f r0 = (com.anythink.core.common.n.c.f) r0
            int r0 = r0.j()
            if (r0 == 0) goto Lde
            r0 = r8
        L48:
            int r1 = r4.size()
            if (r0 >= r1) goto La5
            java.lang.Object r1 = r4.get(r0)
            com.anythink.core.common.n.c.f r1 = (com.anythink.core.common.n.c.f) r1
            int r2 = r0 + 1
            r3 = r2
        L57:
            int r5 = r4.size()
            if (r3 >= r5) goto La3
            java.lang.Object r5 = r4.get(r3)
            com.anythink.core.common.n.c.f r5 = (com.anythink.core.common.n.c.f) r5
            boolean r6 = r5.c(r1)
            if (r6 == 0) goto La3
            int r6 = r5.j()
            int r9 = r1.j()
            if (r6 == r9) goto L93
            java.lang.Object r5 = r7.get(r3)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.Object r6 = r7.get(r0)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r5 <= r6) goto L90
            r4.remove(r3)
            r7.remove(r3)
            goto L57
        L90:
            int r3 = r3 + 1
            goto L57
        L93:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "duplicate option: "
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r0 = r0.concat(r1)
            r10.<init>(r0)
            throw r10
        La3:
            r0 = r2
            goto L48
        La5:
            com.anythink.core.common.n.c.c r2 = new com.anythink.core.common.n.c.c
            r2.<init>()
            r5 = 0
            int r6 = r4.size()
            r0 = 0
            r3 = 0
            a(r0, r2, r3, r4, r5, r6, r7)
            int r0 = a(r2)
            int[] r1 = new int[r0]
        Lbb:
            if (r8 >= r0) goto Lc6
            int r3 = r2.m()
            r1[r8] = r3
            int r8 = r8 + 1
            goto Lbb
        Lc6:
            boolean r0 = r2.g()
            if (r0 == 0) goto Ld8
            com.anythink.core.common.n.c.o r0 = new com.anythink.core.common.n.c.o
            java.lang.Object r10 = r10.clone()
            com.anythink.core.common.n.c.f[] r10 = (com.anythink.core.common.n.c.f[]) r10
            r0.<init>(r10, r1)
            return r0
        Ld8:
            java.lang.AssertionError r10 = new java.lang.AssertionError
            r10.<init>()
            throw r10
        Lde:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "the empty byte string is not a supported option"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.n.c.o.a(com.anythink.core.common.n.c.f[]):com.anythink.core.common.n.c.o");
    }

    private static void a(long j, c cVar, int i, List<f> list, int i2, int i3, List<Integer> list2) {
        int i4;
        int i5;
        long j2;
        int i6;
        List<Integer> list3;
        long j3;
        int i7;
        List<f> list4 = list;
        List<Integer> list5 = list2;
        if (i2 >= i3) {
            throw new AssertionError();
        }
        for (int i8 = i2; i8 < i3; i8++) {
            if (list4.get(i8).j() < i) {
                throw new AssertionError();
            }
        }
        f fVar = list.get(i2);
        f fVar2 = list4.get(i3 - 1);
        if (i == fVar.j()) {
            int intValue = list5.get(i2).intValue();
            int i9 = i2 + 1;
            f fVar3 = list4.get(i9);
            i4 = i9;
            i5 = intValue;
            fVar = fVar3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        long j4 = 2;
        if (fVar.b(i) != fVar2.b(i)) {
            int i10 = 1;
            for (int i11 = i4 + 1; i11 < i3; i11++) {
                if (list4.get(i11 - 1).b(i) != list4.get(i11).b(i)) {
                    i10++;
                }
            }
            long a2 = j + a(cVar) + 2 + (i10 * 2);
            cVar.i(i10);
            cVar.i(i5);
            for (int i12 = i4; i12 < i3; i12++) {
                byte b = list4.get(i12).b(i);
                if (i12 == i4 || b != list4.get(i12 - 1).b(i)) {
                    cVar.i(b & 255);
                }
            }
            c cVar2 = new c();
            int i13 = i4;
            while (i13 < i3) {
                byte b2 = list4.get(i13).b(i);
                int i14 = i13 + 1;
                int i15 = i14;
                while (true) {
                    if (i15 >= i3) {
                        i15 = i3;
                        break;
                    } else if (b2 != list4.get(i15).b(i)) {
                        break;
                    } else {
                        i15++;
                    }
                }
                if (i14 == i15 && i + 1 == list4.get(i13).j()) {
                    cVar.i(list5.get(i13).intValue());
                    list3 = list5;
                    j3 = a2;
                    i7 = i15;
                } else {
                    cVar.i((int) ((a(cVar2) + a2) * (-1)));
                    list3 = list5;
                    j3 = a2;
                    i7 = i15;
                    a(j3, cVar2, i + 1, list, i13, i7, list3);
                    list4 = list;
                }
                a2 = j3;
                i13 = i7;
                list5 = list3;
            }
            cVar.a(cVar2, cVar2.c);
            return;
        }
        int min = Math.min(fVar.j(), fVar2.j());
        int i16 = 0;
        int i17 = i;
        while (true) {
            if (i17 >= min) {
                j2 = j4;
                break;
            }
            j2 = j4;
            if (fVar.b(i17) != fVar2.b(i17)) {
                break;
            }
            i16++;
            i17++;
            j4 = j2;
        }
        long a3 = j + a(cVar) + j2 + i16 + 1;
        cVar.i(-i16);
        cVar.i(i5);
        int i18 = i;
        while (true) {
            i6 = i + i16;
            if (i18 >= i6) {
                break;
            }
            cVar.i(fVar.b(i18) & 255);
            i18++;
        }
        if (i4 + 1 == i3) {
            if (i6 != list4.get(i4).j()) {
                throw new AssertionError();
            }
            cVar.i(list5.get(i4).intValue());
        } else {
            c cVar3 = new c();
            cVar.i((int) ((a(cVar3) + a3) * (-1)));
            a(a3, cVar3, i6, list4, i4, i3, list5);
            cVar.a(cVar3, cVar3.c);
        }
    }

    private f a(int i) {
        return this.f4234a[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4234a.length;
    }

    private static int a(c cVar) {
        return (int) (cVar.c / 4);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.f4234a[i];
    }
}
