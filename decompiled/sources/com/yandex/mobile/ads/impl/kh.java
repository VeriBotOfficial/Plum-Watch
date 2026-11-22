package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes5.dex */
abstract class kh {

    /* renamed from: a, reason: collision with root package name */
    public final int f16020a;

    public static String a(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public kh(int i) {
        this.f16020a = i;
    }

    public String toString() {
        return a(this.f16020a);
    }

    static final class b extends kh {
        public final ag1 b;

        public b(int i, ag1 ag1Var) {
            super(i);
            this.b = ag1Var;
        }
    }

    static final class a extends kh {
        public final long b;
        public final ArrayList c;
        public final ArrayList d;

        @Override // com.yandex.mobile.ads.impl.kh
        public final String toString() {
            return kh.a(this.f16020a) + " leaves: " + Arrays.toString(this.c.toArray()) + " containers: " + Arrays.toString(this.d.toArray());
        }

        public a(int i, long j) {
            super(i);
            this.b = j;
            this.c = new ArrayList();
            this.d = new ArrayList();
        }

        public final b c(int i) {
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                b bVar = (b) this.c.get(i2);
                if (bVar.f16020a == i) {
                    return bVar;
                }
            }
            return null;
        }

        public final a b(int i) {
            int size = this.d.size();
            for (int i2 = 0; i2 < size; i2++) {
                a aVar = (a) this.d.get(i2);
                if (aVar.f16020a == i) {
                    return aVar;
                }
            }
            return null;
        }
    }
}
