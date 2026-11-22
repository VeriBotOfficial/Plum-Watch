package com.yandex.mobile.ads.impl;

import android.util.Pair;
import com.yandex.mobile.ads.impl.b72;
import com.yandex.mobile.ads.impl.kk0;
import com.yandex.mobile.ads.impl.vw0;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class cu0 extends f62 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f15225a;
        private final int[] b;
        private final z52[] c;
        private final int[] d;
        private final int[][][] e;
        private final z52 f;

        a(int[] iArr, z52[] z52VarArr, int[] iArr2, int[][][] iArr3, z52 z52Var) {
            this.b = iArr;
            this.c = z52VarArr;
            this.e = iArr3;
            this.d = iArr2;
            this.f = z52Var;
            this.f15225a = iArr.length;
        }

        public final int a(int i, int i2) {
            int i3 = this.c[i].a(i2).b;
            int[] iArr = new int[i3];
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i3; i6++) {
                if (a(i, i2, i6) == 4) {
                    iArr[i5] = i6;
                    i5++;
                }
            }
            int[] copyOf = Arrays.copyOf(iArr, i5);
            int i7 = 16;
            int i8 = 0;
            String str = null;
            boolean z = false;
            while (i4 < copyOf.length) {
                String str2 = this.c[i].a(i2).a(copyOf[i4]).m;
                int i9 = i8 + 1;
                if (i8 == 0) {
                    str = str2;
                } else {
                    z |= !f92.a(str, str2);
                }
                i7 = Math.min(i7, this.e[i][i2][i4] & 24);
                i4++;
                i8 = i9;
            }
            return z ? Math.min(i7, this.d[i]) : i7;
        }

        public final int a() {
            return this.f15225a;
        }

        public final z52 b(int i) {
            return this.c[i];
        }

        public final int a(int i) {
            return this.b[i];
        }

        public final int a(int i, int i2, int i3) {
            return this.e[i][i2][i3] & 7;
        }

        public final z52 b() {
            return this.f;
        }
    }

    protected abstract Pair<ap1[], h70[]> a(a aVar, int[][][] iArr, int[] iArr2, vw0.b bVar, i52 i52Var) throws m60;

    @Override // com.yandex.mobile.ads.impl.f62
    public final void a(Object obj) {
    }

    @Override // com.yandex.mobile.ads.impl.f62
    public final g62 a(zo1[] zo1VarArr, z52 z52Var, vw0.b bVar, i52 i52Var) throws m60 {
        boolean z;
        int[] iArr;
        z52 z52Var2 = z52Var;
        boolean z2 = true;
        int[] iArr2 = new int[zo1VarArr.length + 1];
        int length = zo1VarArr.length + 1;
        y52[][] y52VarArr = new y52[length][];
        int[][][] iArr3 = new int[zo1VarArr.length + 1][][];
        for (int i = 0; i < length; i++) {
            int i2 = z52Var2.b;
            y52VarArr[i] = new y52[i2];
            iArr3[i] = new int[i2][];
        }
        int length2 = zo1VarArr.length;
        int[] iArr4 = new int[length2];
        for (int i3 = 0; i3 < length2; i3++) {
            iArr4[i3] = zo1VarArr[i3].f();
        }
        int i4 = 0;
        while (i4 < z52Var2.b) {
            y52 a2 = z52Var2.a(i4);
            boolean z3 = a2.d == 5 ? z2 : false;
            int length3 = zo1VarArr.length;
            boolean z4 = z2;
            int i5 = 0;
            int i6 = 0;
            while (i5 < zo1VarArr.length) {
                zo1 zo1Var = zo1VarArr[i5];
                boolean z5 = z2;
                int i7 = 0;
                for (int i8 = 0; i8 < a2.b; i8++) {
                    i7 = Math.max(i7, zo1Var.a(a2.a(i8)) & 7);
                }
                boolean z6 = iArr2[i5] == 0 ? z5 : false;
                if (i7 > i6 || (i7 == i6 && z3 && !z4 && z6)) {
                    z4 = z6;
                    i6 = i7;
                    length3 = i5;
                }
                i5++;
                z2 = z5;
            }
            boolean z7 = z2;
            if (length3 == zo1VarArr.length) {
                iArr = new int[a2.b];
            } else {
                zo1 zo1Var2 = zo1VarArr[length3];
                int[] iArr5 = new int[a2.b];
                for (int i9 = 0; i9 < a2.b; i9++) {
                    iArr5[i9] = zo1Var2.a(a2.a(i9));
                }
                iArr = iArr5;
            }
            int i10 = iArr2[length3];
            y52VarArr[length3][i10] = a2;
            iArr3[length3][i10] = iArr;
            iArr2[length3] = i10 + 1;
            i4++;
            z52Var2 = z52Var;
            z2 = z7;
        }
        boolean z8 = z2;
        z52[] z52VarArr = new z52[zo1VarArr.length];
        String[] strArr = new String[zo1VarArr.length];
        int[] iArr6 = new int[zo1VarArr.length];
        for (int i11 = 0; i11 < zo1VarArr.length; i11++) {
            int i12 = iArr2[i11];
            z52VarArr[i11] = new z52((y52[]) f92.a(i12, y52VarArr[i11]));
            iArr3[i11] = (int[][]) f92.a(i12, iArr3[i11]);
            strArr[i11] = zo1VarArr[i11].getName();
            iArr6[i11] = ((sk) zo1VarArr[i11]).m();
        }
        a aVar = new a(iArr6, z52VarArr, iArr4, iArr3, new z52((y52[]) f92.a(iArr2[zo1VarArr.length], y52VarArr[zo1VarArr.length])));
        Pair<ap1[], h70[]> a3 = a(aVar, iArr3, iArr4, bVar, i52Var);
        c62[] c62VarArr = (c62[]) a3.second;
        List[] listArr = new List[c62VarArr.length];
        for (int i13 = 0; i13 < c62VarArr.length; i13++) {
            c62 c62Var = c62VarArr[i13];
            listArr[i13] = c62Var != null ? kk0.a(c62Var) : kk0.h();
        }
        kk0.a aVar2 = new kk0.a();
        for (int i14 = 0; i14 < aVar.f15225a; i14++) {
            z52 z52Var3 = aVar.c[i14];
            List list = listArr[i14];
            for (int i15 = 0; i15 < z52Var3.b; i15++) {
                y52 a4 = z52Var3.a(i15);
                boolean z9 = aVar.a(i14, i15) != 0 ? z8 : false;
                int i16 = a4.b;
                int[] iArr7 = new int[i16];
                boolean[] zArr = new boolean[i16];
                for (int i17 = 0; i17 < a4.b; i17++) {
                    iArr7[i17] = aVar.a(i14, i15, i17);
                    int i18 = 0;
                    while (true) {
                        if (i18 >= list.size()) {
                            z = false;
                            break;
                        }
                        c62 c62Var2 = (c62) list.get(i18);
                        if (c62Var2.a().equals(a4) && c62Var2.c(i17) != -1) {
                            z = z8;
                            break;
                        }
                        i18++;
                    }
                    zArr[i17] = z;
                }
                aVar2.b(new b72.a(a4, z9, iArr7, zArr));
            }
        }
        z52 z52Var4 = aVar.f;
        for (int i19 = 0; i19 < z52Var4.b; i19++) {
            y52 a5 = z52Var4.a(i19);
            int[] iArr8 = new int[a5.b];
            Arrays.fill(iArr8, 0);
            aVar2.b(new b72.a(a5, false, iArr8, new boolean[a5.b]));
        }
        return new g62((ap1[]) a3.first, (h70[]) a3.second, new b72(aVar2.a()), aVar);
    }
}
