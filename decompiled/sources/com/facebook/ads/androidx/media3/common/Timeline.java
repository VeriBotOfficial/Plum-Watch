package com.facebook.ads.androidx.media3.common;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.ads.redexgen.core.AbstractC12174a;
import com.facebook.ads.redexgen.core.AbstractC1372Am;
import com.facebook.ads.redexgen.core.C11481h;
import com.facebook.ads.redexgen.core.C13469m;
import com.facebook.ads.redexgen.core.C1Q;
import com.facebook.ads.redexgen.core.C1R;
import com.facebook.ads.redexgen.core.C1S;
import com.facebook.ads.redexgen.core.C2874oL;
import com.facebook.ads.redexgen.core.C2876oN;
import com.facebook.ads.redexgen.core.C3M;
import com.facebook.ads.redexgen.core.C3R;

/* loaded from: assets/audience_network.dex */
public abstract class Timeline implements C1S {
    public static String[] A00 = {"u1TV1j0aFj13GJQ9ixTagHG8KyMgbnog", "4GMeFBxldVuonExwkIPaDDi9I59L728Z", "hqD1wOYcZTmehOTQOtlNc0UQ2KV4ETaI", "yejsGunEYiKaKfUzobCfCtheJf3zEEcL", "wYd9LRHFlTpJXE3VqmNr3ySXFdmyeGzN", "VCegaKN739XbWKUaP5Uwy30Zmvr6QTeK", "Cr3igiuAIuu", "x89DN52UD2fFRZn9rQXfWzGYhaiJYHE1"};
    public static final Timeline A02 = new Timeline() { // from class: com.facebook.ads.redexgen.X.9n
        @Override // com.facebook.ads.androidx.media3.common.Timeline
        public final int A06() {
            return 0;
        }

        @Override // com.facebook.ads.androidx.media3.common.Timeline
        public final int A07() {
            return 0;
        }

        @Override // com.facebook.ads.androidx.media3.common.Timeline
        public final int A0A(Object obj) {
            return -1;
        }

        @Override // com.facebook.ads.androidx.media3.common.Timeline
        public final C2876oN A0I(int i, C2876oN c2876oN, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.facebook.ads.androidx.media3.common.Timeline
        public final C2874oL A0L(int i, C2874oL c2874oL, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.facebook.ads.androidx.media3.common.Timeline
        public final Object A0M(int i) {
            throw new IndexOutOfBoundsException();
        }
    };
    public static final String A05 = AbstractC12174a.A0h(0);
    public static final String A03 = AbstractC12174a.A0h(1);
    public static final String A04 = AbstractC12174a.A0h(2);
    public static final C1R<Timeline> A01 = new C1R() { // from class: com.facebook.ads.redexgen.X.oP
        @Override // com.facebook.ads.redexgen.core.C1R
        public final C1S A6X(Bundle bundle) {
            Timeline A022;
            A022 = Timeline.A02(bundle);
            return A022;
        }
    };

    public abstract int A06();

    public abstract int A07();

    public abstract int A0A(Object obj);

    public abstract C2876oN A0I(int i, C2876oN c2876oN, boolean z);

    public abstract C2874oL A0L(int i, C2874oL c2874oL, long j);

    public abstract Object A0M(int i);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Period> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Window> */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.facebook.ads.redexgen.X.9m] */
    public static C13469m A02(Bundle bundle) {
        final AbstractC1372Am A042 = A04(C2874oL.A0J, C3R.A00(bundle, A05));
        final AbstractC1372Am A043 = A04(C2876oN.A08, C3R.A00(bundle, A03));
        final int[] intArray = bundle.getIntArray(A04);
        if (intArray == null) {
            intArray = A05(A042.size());
        }
        return new Timeline(A042, A043, intArray) { // from class: com.facebook.ads.redexgen.X.9m
            public static String[] A04 = {"nDkuZZEFG4iGMwbsGEvKBo4ueCI7wxif", "OM6NJOBBZMKrUazjZz4CdR8Ljfz9nzwy", "h9AdYD37MAF4FmuzDOyGIvEw", "VkmtOVI9Gbc78hEhNGIz4LiMtzYnUrU2", "bkWqGplua99PBwc9ED6yZtwvDtuw6KwN", "305DBImSoaz5MlD7g6qLfpiwFg5d3Fl", "QtOjLPNYFNek9UnmHWOFtbeX9w", "y2avdvKeY0dhYPEmFhuJXZmeyR2ks2D4"};
            public final AbstractC1372Am<C2876oN> A00;
            public final AbstractC1372Am<C2874oL> A01;
            public final int[] A02;
            public final int[] A03;

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Period> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Window> */
            /* JADX WARN: Incorrect condition in loop: B:6:0x001b */
            {
                /*
                    r3 = this;
                    r3.<init>()
                    int r1 = r4.size()
                    int r0 = r6.length
                    if (r1 != r0) goto L26
                    r0 = 1
                Lb:
                    com.facebook.ads.redexgen.core.C3M.A07(r0)
                    r3.A01 = r4
                    r3.A00 = r5
                    r3.A02 = r6
                    int r0 = r6.length
                    int[] r0 = new int[r0]
                    r3.A03 = r0
                    r2 = 0
                L1a:
                    int r0 = r6.length
                    if (r2 >= r0) goto L28
                    int[] r1 = r3.A03
                    r0 = r6[r2]
                    r1[r0] = r2
                    int r2 = r2 + 1
                    goto L1a
                L26:
                    r0 = 0
                    goto Lb
                L28:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C13469m.<init>(com.facebook.ads.redexgen.X.Am, com.facebook.ads.redexgen.X.Am, int[]):void");
            }

            @Override // com.facebook.ads.androidx.media3.common.Timeline
            public final int A06() {
                return this.A00.size();
            }

            @Override // com.facebook.ads.androidx.media3.common.Timeline
            public final int A07() {
                return this.A01.size();
            }

            @Override // com.facebook.ads.androidx.media3.common.Timeline
            public final int A08(int i, int i2, boolean z) {
                if (i2 == 1) {
                    return i;
                }
                if (i == A0C(z)) {
                    if (i2 == 2) {
                        return A0B(z);
                    }
                    return -1;
                }
                if (z) {
                    return this.A02[this.A03[i] + 1];
                }
                return i + 1;
            }

            @Override // com.facebook.ads.androidx.media3.common.Timeline
            public final int A0A(Object obj) {
                throw new UnsupportedOperationException();
            }

            @Override // com.facebook.ads.androidx.media3.common.Timeline
            public final int A0B(boolean z) {
                if (A0N()) {
                    return -1;
                }
                if (!z) {
                    return 0;
                }
                int[] iArr = this.A02;
                if (A04[1].charAt(22) == 'H') {
                    throw new RuntimeException();
                }
                A04[7] = "6ncpOYdEr0xsUZdZBYFnYejLEosAstPL";
                return iArr[0];
            }

            @Override // com.facebook.ads.androidx.media3.common.Timeline
            public final int A0C(boolean z) {
                if (A0N()) {
                    return -1;
                }
                if (z) {
                    return this.A02[A07() - 1];
                }
                return A07() - 1;
            }

            @Override // com.facebook.ads.androidx.media3.common.Timeline
            public final C2876oN A0I(int i, C2876oN p, boolean z) {
                C2913p0 c2913p0;
                C2876oN p2 = this.A00.get(i);
                Object obj = p2.A03;
                Object obj2 = p2.A04;
                int i2 = p2.A00;
                long j = p2.A01;
                long j2 = p2.A02;
                c2913p0 = p2.A06;
                p.A0G(obj, obj2, i2, j, j2, c2913p0, p2.A05);
                return p;
            }

            @Override // com.facebook.ads.androidx.media3.common.Timeline
            public final C2874oL A0L(int i, C2874oL c2874oL, long j) {
                C2874oL c2874oL2 = this.A01.get(i);
                c2874oL.A07(c2874oL2.A0C, c2874oL2.A09, c2874oL2.A0A, c2874oL2.A06, c2874oL2.A07, c2874oL2.A04, c2874oL2.A0G, c2874oL2.A0D, c2874oL2.A08, c2874oL2.A02, c2874oL2.A03, c2874oL2.A00, c2874oL2.A01, c2874oL2.A05);
                c2874oL.A0F = c2874oL2.A0F;
                return c2874oL;
            }

            @Override // com.facebook.ads.androidx.media3.common.Timeline
            public final Object A0M(int i) {
                throw new UnsupportedOperationException();
            }
        };
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1R != com.facebook.ads.androidx.media3.common.Bundleable$Creator<T extends com.facebook.ads.redexgen.X.1S> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1h != com.google.common.collect.ImmutableList$Builder<T extends com.facebook.ads.redexgen.X.1S> */
    public static <T extends C1S> AbstractC1372Am<T> A04(C1R<T> c1r, IBinder iBinder) {
        if (iBinder == null) {
            return AbstractC1372Am.A03();
        }
        C11481h c11481h = new C11481h();
        AbstractC1372Am<Bundle> A002 = C1Q.A00(iBinder);
        for (int i = 0; i < A002.size(); i++) {
            c11481h.A04(c1r.A6X(A002.get(i)));
        }
        return c11481h.A05();
    }

    public static int[] A05(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = i2;
            int i3 = A00[1].charAt(20);
            if (i3 == 50) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[2] = "bm1hpxiL8T70YPoy7qoC4X3DFFhRRvrI";
            strArr[4] = "ZU2doOYnXTdq2XyitRV5O0BVNSu1NLTL";
        }
        return iArr;
    }

    public int A08(int i, int i2, boolean z) {
        switch (i2) {
            case 0:
                if (i == A0C(z)) {
                    return -1;
                }
                return i + 1;
            case 1:
                return i;
            case 2:
                int A0C = A0C(z);
                String[] strArr = A00;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    throw new RuntimeException();
                }
                A00[1] = "R0HEAX03GiDQUcMP0CiDD2yYG3qNGv8H";
                if (i == A0C) {
                    return A0B(z);
                }
                return i + 1;
            default:
                throw new IllegalStateException();
        }
    }

    public final int A09(int i, C2876oN c2876oN, C2874oL c2874oL, int i2, boolean z) {
        int i3 = A0H(i, c2876oN).A00;
        int windowIndex = A0K(i3, c2874oL).A01;
        if (windowIndex == i) {
            int nextWindowIndex = A08(i3, i2, z);
            if (nextWindowIndex == -1) {
                return -1;
            }
            int windowIndex2 = A0K(nextWindowIndex, c2874oL).A00;
            return windowIndex2;
        }
        int windowIndex3 = i + 1;
        return windowIndex3;
    }

    public int A0B(boolean z) {
        return A0N() ? -1 : 0;
    }

    public int A0C(boolean z) {
        if (A0N()) {
            return -1;
        }
        return A07() - 1;
    }

    @Deprecated
    public final Pair<Object, Long> A0D(C2874oL c2874oL, C2876oN c2876oN, int i, long j) {
        return A0E(c2874oL, c2876oN, i, j);
    }

    public final Pair<Object, Long> A0E(C2874oL c2874oL, C2876oN c2876oN, int i, long j) {
        return (Pair) C3M.A01(A0G(c2874oL, c2876oN, i, j, 0L));
    }

    @Deprecated
    public final Pair<Object, Long> A0F(C2874oL c2874oL, C2876oN c2876oN, int i, long j, long j2) {
        return A0G(c2874oL, c2876oN, i, j, j2);
    }

    public final Pair<Object, Long> A0G(C2874oL c2874oL, C2876oN c2876oN, int i, long j, long j2) {
        C3M.A00(i, 0, A07());
        A0L(i, c2874oL, j2);
        if (j == -9223372036854775807L) {
            j = c2874oL.A05();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = c2874oL.A00;
        A0H(i2, c2876oN);
        while (i2 < c2874oL.A01 && c2876oN.A02 != j && A0H(i2 + 1, c2876oN).A02 <= j) {
            i2++;
        }
        A0I(i2, c2876oN, true);
        long j3 = j - c2876oN.A02;
        if (c2876oN.A01 != -9223372036854775807L) {
            long j4 = c2876oN.A01;
            if (A00[1].charAt(20) == '2') {
                throw new RuntimeException();
            }
            A00[1] = "slEcDLMOMSnRw8lzrIQwxe9jf9tcgTic";
            j3 = Math.min(j3, j4 - 1);
        }
        return Pair.create(C3M.A01(c2876oN.A04), Long.valueOf(Math.max(0L, j3)));
    }

    public final C2876oN A0H(int i, C2876oN c2876oN) {
        return A0I(i, c2876oN, false);
    }

    public C2876oN A0J(Object obj, C2876oN c2876oN) {
        return A0I(A0A(obj), c2876oN, true);
    }

    public final C2874oL A0K(int i, C2874oL c2874oL) {
        return A0L(i, c2874oL, 0L);
    }

    public final boolean A0N() {
        return A07() == 0;
    }

    public final boolean A0O(int i, C2876oN c2876oN, C2874oL c2874oL, int i2, boolean z) {
        return A09(i, c2876oN, c2874oL, i2, z) == -1;
    }

    public final boolean equals(Object obj) {
        int A0C;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Timeline)) {
            return false;
        }
        Timeline timeline = (Timeline) obj;
        if (timeline.A07() != A07() || timeline.A06() != A06()) {
            return false;
        }
        C2874oL c2874oL = new C2874oL();
        C2876oN c2876oN = new C2876oN();
        C2874oL window = new C2874oL();
        C2876oN otherPeriod = new C2876oN();
        for (int i = 0; i < A07(); i++) {
            if (!A0K(i, c2874oL).equals(timeline.A0K(i, window))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < A06(); i2++) {
            boolean equals = A0I(i2, c2876oN, true).equals(timeline.A0I(i2, otherPeriod, true));
            if (A00[6].length() != 11) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[7] = "LCXdoHEXleHtD1UyLVprjOGqC7qnADXU";
            strArr[0] = "np8LEsRhRemsbbWWIjAQc1GjKbBRdfRS";
            if (!equals) {
                return false;
            }
        }
        int A0B = A0B(true);
        if (A0B != timeline.A0B(true) || (A0C = A0C(true)) != timeline.A0C(true)) {
            return false;
        }
        while (A0B != A0C) {
            int A08 = A08(A0B, 0, true);
            if (A08 != timeline.A08(A0B, 0, true)) {
                return false;
            }
            A0B = A08;
        }
        return true;
    }

    public final int hashCode() {
        C2874oL c2874oL = new C2874oL();
        C2876oN c2876oN = new C2876oN();
        int result = 7 * 31;
        int i = result + A07();
        for (int i2 = 0; i2 < A07(); i2++) {
            C2874oL window = A0K(i2, c2874oL);
            i = (i * 31) + window.hashCode();
        }
        int result2 = i * 31;
        int i3 = result2 + A06();
        for (int i4 = 0; i4 < A06(); i4++) {
            i3 = (i3 * 31) + A0I(i4, c2876oN, true).hashCode();
        }
        int A0B = A0B(true);
        while (A0B != -1) {
            int windowIndex = i3 * 31;
            i3 = windowIndex + A0B;
            A0B = A08(A0B, 0, true);
        }
        return i3;
    }
}
