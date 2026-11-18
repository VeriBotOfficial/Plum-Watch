package com.anythink.basead.exoplayer.k;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Comparator<a> f2698a = new Comparator<a>() { // from class: com.anythink.basead.exoplayer.k.y.1
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(a aVar, a aVar2) {
            return aVar.f2699a - aVar2.f2699a;
        }

        private static int a(a aVar, a aVar2) {
            return aVar.f2699a - aVar2.f2699a;
        }
    };
    private static final Comparator<a> b = new Comparator<a>() { // from class: com.anythink.basead.exoplayer.k.y.2
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(a aVar, a aVar2) {
            a aVar3 = aVar;
            a aVar4 = aVar2;
            if (aVar3.c < aVar4.c) {
                return -1;
            }
            return aVar4.c < aVar3.c ? 1 : 0;
        }

        private static int a(a aVar, a aVar2) {
            if (aVar.c < aVar2.c) {
                return -1;
            }
            return aVar2.c < aVar.c ? 1 : 0;
        }
    };
    private static final int c = -1;
    private static final int d = 0;
    private static final int e = 1;
    private static final int f = 5;
    private final int g;
    private int k;
    private int l;
    private int m;
    private final a[] i = new a[5];
    private final ArrayList<a> h = new ArrayList<>();
    private int j = -1;

    public y(int r1) {
        this.g = r1;
    }

    private void b() {
        if (this.j != 1) {
            Collections.sort(this.h, f2698a);
            this.j = 1;
        }
    }

    private void c() {
        if (this.j != 0) {
            Collections.sort(this.h, b);
            this.j = 0;
        }
    }

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2699a;
        public int b;
        public float c;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    public final void a(int r5, float f2) {
        a aVar;
        if (this.j != 1) {
            Collections.sort(this.h, f2698a);
            this.j = 1;
        }
        int r0 = this.m;
        byte b2 = 0;
        if (r0 > 0) {
            a[] aVarArr = this.i;
            int r1 = r0 - 1;
            this.m = r1;
            aVar = aVarArr[r1];
        } else {
            aVar = new a(b2);
        }
        int r2 = this.k;
        this.k = r2 + 1;
        aVar.f2699a = r2;
        aVar.b = r5;
        aVar.c = f2;
        this.h.add(aVar);
        this.l += r5;
        while (true) {
            int r6 = this.l;
            int r7 = this.g;
            if (r6 <= r7) {
                return;
            }
            int r8 = r6 - r7;
            a aVar2 = this.h.get(0);
            if (aVar2.b <= r8) {
                this.l -= aVar2.b;
                this.h.remove(0);
                int r9 = this.m;
                if (r9 < 5) {
                    a[] aVarArr2 = this.i;
                    this.m = r9 + 1;
                    aVarArr2[r9] = aVar2;
                }
            } else {
                aVar2.b -= r8;
                this.l -= r8;
            }
        }
    }

    public final float a() {
        if (this.j != 0) {
            Collections.sort(this.h, b);
            this.j = 0;
        }
        float f2 = this.l * 0.5f;
        int r2 = 0;
        for (int r1 = 0; r1 < this.h.size(); r1++) {
            a aVar = this.h.get(r1);
            r2 += aVar.b;
            if (r2 >= f2) {
                return aVar.c;
            }
        }
        if (this.h.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<a> arrayList = this.h;
        return arrayList.get(arrayList.size() - 1).c;
    }
}
