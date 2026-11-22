package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public interface p72 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f16530a;
        public final byte[] b;

        public a(String str, byte[] bArr) {
            this.f16530a = str;
            this.b = bArr;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f16531a;
        public final List<a> b;
        public final byte[] c;

        public b(int i, String str, ArrayList arrayList, byte[] bArr) {
            this.f16531a = str;
            this.b = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
            this.c = bArr;
        }
    }

    public interface c {
        SparseArray<p72> a();

        p72 a(int i, b bVar);
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f16532a;
        private final int b;
        private final int c;
        private int d;
        private String e;

        public final String b() {
            if (this.d != Integer.MIN_VALUE) {
                return this.e;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }

        public final int c() {
            int i = this.d;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }

        public d(int i, int i2, int i3) {
            this.f16532a = i != Integer.MIN_VALUE ? i + "/" : "";
            this.b = i2;
            this.c = i3;
            this.d = Integer.MIN_VALUE;
            this.e = "";
        }

        public final void a() {
            int i = this.d;
            this.d = i == Integer.MIN_VALUE ? this.b : i + this.c;
            this.e = this.f16532a + this.d;
        }
    }

    void a();

    void a(int i, ag1 ag1Var) throws eg1;

    void a(p52 p52Var, b80 b80Var, d dVar);
}
