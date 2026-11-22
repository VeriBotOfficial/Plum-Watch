package com.anythink.basead.exoplayer.i;

import android.util.Pair;
import com.anythink.basead.exoplayer.aa;
import com.anythink.basead.exoplayer.h.ae;
import com.anythink.basead.exoplayer.h.af;
import com.anythink.basead.exoplayer.z;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* loaded from: classes11.dex */
public abstract class e extends h {

    /* renamed from: a, reason: collision with root package name */
    private a f2613a;

    protected abstract Pair<aa[], f[]> a(a aVar, int[][][] iArr, int[] iArr2);

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f2614a = 0;
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;

        @Deprecated
        public final int e;
        private final int f;
        private final int[] g;
        private final af[] h;
        private final int[] i;
        private final int[][][] j;
        private final af k;

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.anythink.basead.exoplayer.i.e$a$a, reason: collision with other inner class name */
        @interface InterfaceC0149a {
        }

        a(int[] iArr, af[] afVarArr, int[] iArr2, int[][][] iArr3, af afVar) {
            this.g = iArr;
            this.h = afVarArr;
            this.j = iArr3;
            this.i = iArr2;
            this.k = afVar;
            int length = iArr.length;
            this.f = length;
            this.e = length;
        }

        public final int a() {
            return this.f;
        }

        public final int a(int i) {
            return this.g[i];
        }

        public final af b(int i) {
            return this.h[i];
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0025, code lost:
        
            r1 = r1 + 1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private int c(int r8) {
            /*
                r7 = this;
                int[][][] r0 = r7.j
                r8 = r0[r8]
                r0 = 0
                r1 = r0
                r2 = r1
            L7:
                int r3 = r8.length
                if (r1 >= r3) goto L28
                r3 = r0
            Lb:
                r4 = r8[r1]
                int r5 = r4.length
                if (r3 >= r5) goto L25
                r4 = r4[r3]
                r4 = r4 & 7
                r5 = 3
                if (r4 == r5) goto L1d
                r6 = 4
                if (r4 == r6) goto L1c
                r4 = 1
                goto L1e
            L1c:
                return r5
            L1d:
                r4 = 2
            L1e:
                int r2 = java.lang.Math.max(r2, r4)
                int r3 = r3 + 1
                goto Lb
            L25:
                int r1 = r1 + 1
                goto L7
            L28:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.exoplayer.i.e.a.c(int):int");
        }

        private int e(int i) {
            int i2;
            int i3 = 0;
            for (int i4 = 0; i4 < this.f; i4++) {
                if (this.g[i4] == i) {
                    int[][] iArr = this.j[i4];
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        if (i5 >= iArr.length) {
                            break;
                        }
                        int i7 = 0;
                        while (true) {
                            int[] iArr2 = iArr[i5];
                            if (i7 < iArr2.length) {
                                int i8 = iArr2[i7] & 7;
                                if (i8 == 3) {
                                    i2 = 2;
                                } else {
                                    if (i8 == 4) {
                                        i6 = 3;
                                        break;
                                    }
                                    i2 = 1;
                                }
                                i6 = Math.max(i6, i2);
                                i7++;
                            }
                        }
                        i5++;
                    }
                    i3 = Math.max(i3, i6);
                }
            }
            return i3;
        }

        @Deprecated
        private int b(int i, int i2, int i3) {
            return a(i, i2, i3);
        }

        public final int a(int i, int i2, int i3) {
            return this.j[i][i2][i3] & 7;
        }

        public final int a(int i, int i2) {
            int i3 = this.h[i].a(i2).f2537a;
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
                String str2 = this.h[i].a(i2).a(copyOf[i4]).h;
                int i9 = i8 + 1;
                if (i8 == 0) {
                    str = str2;
                } else {
                    z |= !com.anythink.basead.exoplayer.k.af.a((Object) str, (Object) str2);
                }
                i7 = Math.min(i7, this.j[i][i2][i4] & 24);
                i4++;
                i8 = i9;
            }
            return z ? Math.min(i7, this.i[i]) : i7;
        }

        private int a(int i, int i2, int[] iArr) {
            int i3 = 0;
            int i4 = 16;
            String str = null;
            boolean z = false;
            int i5 = 0;
            while (i3 < iArr.length) {
                String str2 = this.h[i].a(i2).a(iArr[i3]).h;
                int i6 = i5 + 1;
                if (i5 == 0) {
                    str = str2;
                } else {
                    z |= !com.anythink.basead.exoplayer.k.af.a((Object) str, (Object) str2);
                }
                i4 = Math.min(i4, this.j[i][i2][i3] & 24);
                i3++;
                i5 = i6;
            }
            return z ? Math.min(i4, this.i[i]) : i4;
        }

        public final af b() {
            return this.k;
        }

        @Deprecated
        private int d(int i) {
            int i2;
            int i3 = 0;
            for (int i4 = 0; i4 < this.f; i4++) {
                if (this.g[i4] == i) {
                    int[][] iArr = this.j[i4];
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        if (i5 >= iArr.length) {
                            break;
                        }
                        int i7 = 0;
                        while (true) {
                            int[] iArr2 = iArr[i5];
                            if (i7 < iArr2.length) {
                                int i8 = iArr2[i7] & 7;
                                if (i8 == 3) {
                                    i2 = 2;
                                } else {
                                    if (i8 == 4) {
                                        i6 = 3;
                                        break;
                                    }
                                    i2 = 1;
                                }
                                i6 = Math.max(i6, i2);
                                i7++;
                            }
                        }
                        i5++;
                    }
                    i3 = Math.max(i3, i6);
                }
            }
            return i3;
        }

        @Deprecated
        private af c() {
            return this.k;
        }
    }

    public final a a() {
        return this.f2613a;
    }

    @Override // com.anythink.basead.exoplayer.i.h
    public final void a(Object obj) {
        this.f2613a = (a) obj;
    }

    @Override // com.anythink.basead.exoplayer.i.h
    public final i a(z[] zVarArr, af afVar) {
        int[] iArr;
        int[] iArr2 = new int[zVarArr.length + 1];
        int length = zVarArr.length + 1;
        ae[][] aeVarArr = new ae[length][];
        int[][][] iArr3 = new int[zVarArr.length + 1][][];
        for (int i = 0; i < length; i++) {
            aeVarArr[i] = new ae[afVar.b];
            iArr3[i] = new int[afVar.b][];
        }
        int length2 = zVarArr.length;
        int[] iArr4 = new int[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            iArr4[i2] = zVarArr[i2].m();
        }
        for (int i3 = 0; i3 < afVar.b; i3++) {
            ae a2 = afVar.a(i3);
            int length3 = zVarArr.length;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (i4 >= zVarArr.length) {
                    break;
                }
                z zVar = zVarArr[i4];
                for (int i6 = 0; i6 < a2.f2537a; i6++) {
                    int a3 = zVar.a(a2.a(i6)) & 7;
                    if (a3 > i5) {
                        if (a3 == 4) {
                            length3 = i4;
                            break;
                        }
                        length3 = i4;
                        i5 = a3;
                    }
                }
                i4++;
            }
            if (length3 == zVarArr.length) {
                iArr = new int[a2.f2537a];
            } else {
                z zVar2 = zVarArr[length3];
                int[] iArr5 = new int[a2.f2537a];
                for (int i7 = 0; i7 < a2.f2537a; i7++) {
                    iArr5[i7] = zVar2.a(a2.a(i7));
                }
                iArr = iArr5;
            }
            int i8 = iArr2[length3];
            aeVarArr[length3][i8] = a2;
            iArr3[length3][i8] = iArr;
            iArr2[length3] = i8 + 1;
        }
        af[] afVarArr = new af[zVarArr.length];
        int[] iArr6 = new int[zVarArr.length];
        for (int i9 = 0; i9 < zVarArr.length; i9++) {
            int i10 = iArr2[i9];
            afVarArr[i9] = new af((ae[]) com.anythink.basead.exoplayer.k.af.a(aeVarArr[i9], i10));
            iArr3[i9] = (int[][]) com.anythink.basead.exoplayer.k.af.a(iArr3[i9], i10);
            iArr6[i9] = zVarArr[i9].a();
        }
        a aVar = new a(iArr6, afVarArr, iArr4, iArr3, new af((ae[]) com.anythink.basead.exoplayer.k.af.a(aeVarArr[zVarArr.length], iArr2[zVarArr.length])));
        Pair<aa[], f[]> a4 = a(aVar, iArr3, iArr4);
        return new i((aa[]) a4.first, (f[]) a4.second, aVar);
    }

    private static int a(z[] zVarArr, ae aeVar) {
        int length = zVarArr.length;
        int i = 0;
        for (int i2 = 0; i2 < zVarArr.length; i2++) {
            z zVar = zVarArr[i2];
            for (int i3 = 0; i3 < aeVar.f2537a; i3++) {
                int a2 = zVar.a(aeVar.a(i3)) & 7;
                if (a2 > i) {
                    if (a2 == 4) {
                        return i2;
                    }
                    length = i2;
                    i = a2;
                }
            }
        }
        return length;
    }

    private static int[] a(z zVar, ae aeVar) {
        int[] iArr = new int[aeVar.f2537a];
        for (int i = 0; i < aeVar.f2537a; i++) {
            iArr[i] = zVar.a(aeVar.a(i));
        }
        return iArr;
    }

    private static int[] a(z[] zVarArr) {
        int length = zVarArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = zVarArr[i].m();
        }
        return iArr;
    }
}
