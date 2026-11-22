package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.h02;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes5.dex */
public final class h02 {
    private static final Comparator<a> h = new Comparator() { // from class: com.yandex.mobile.ads.impl.h02$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int a2;
            a2 = h02.a((h02.a) obj, (h02.a) obj2);
            return a2;
        }
    };
    private static final Comparator<a> i = new Comparator() { // from class: com.yandex.mobile.ads.impl.h02$$ExternalSyntheticLambda1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int b;
            b = h02.b((h02.a) obj, (h02.a) obj2);
            return b;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f15641a;
    private int e;
    private int f;
    private int g;
    private final a[] c = new a[5];
    private final ArrayList<a> b = new ArrayList<>();
    private int d = -1;

    public final void a(int i2, float f) {
        a aVar;
        if (this.d != 1) {
            Collections.sort(this.b, h);
            this.d = 1;
        }
        int i3 = this.g;
        if (i3 > 0) {
            a[] aVarArr = this.c;
            int i4 = i3 - 1;
            this.g = i4;
            aVar = aVarArr[i4];
        } else {
            aVar = new a();
        }
        int i5 = this.e;
        this.e = i5 + 1;
        aVar.f15642a = i5;
        aVar.b = i2;
        aVar.c = f;
        this.b.add(aVar);
        this.f += i2;
        while (true) {
            int i6 = this.f;
            int i7 = this.f15641a;
            if (i6 <= i7) {
                return;
            }
            int i8 = i6 - i7;
            a aVar2 = this.b.get(0);
            int i9 = aVar2.b;
            if (i9 <= i8) {
                this.f -= i9;
                this.b.remove(0);
                int i10 = this.g;
                if (i10 < 5) {
                    a[] aVarArr2 = this.c;
                    this.g = i10 + 1;
                    aVarArr2[i10] = aVar2;
                }
            } else {
                aVar2.b = i9 - i8;
                this.f -= i8;
            }
        }
    }

    public final float a() {
        if (this.d != 0) {
            Collections.sort(this.b, i);
            this.d = 0;
        }
        float f = 0.5f * this.f;
        int i2 = 0;
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            a aVar = this.b.get(i3);
            i2 += aVar.b;
            if (i2 >= f) {
                return aVar.c;
            }
        }
        if (this.b.isEmpty()) {
            return Float.NaN;
        }
        return this.b.get(r0.size() - 1).c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int b(a aVar, a aVar2) {
        return Float.compare(aVar.c, aVar2.c);
    }

    public h02(int i2) {
        this.f15641a = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(a aVar, a aVar2) {
        return aVar.f15642a - aVar2.f15642a;
    }

    public final void b() {
        this.b.clear();
        this.d = -1;
        this.e = 0;
        this.f = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f15642a;
        public int b;
        public float c;

        private a() {
        }
    }
}
