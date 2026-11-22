package com.yandex.mobile.ads.impl;

import android.util.SparseBooleanArray;

/* loaded from: classes5.dex */
public final class bc0 {

    /* renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f15091a;

    public final int hashCode() {
        if (f92.f15466a >= 24) {
            return this.f15091a.hashCode();
        }
        int size = this.f15091a.size();
        for (int i = 0; i < this.f15091a.size(); i++) {
            size = (size * 31) + b(i);
        }
        return size;
    }

    public final int b(int i) {
        hg.a(i, this.f15091a.size());
        return this.f15091a.keyAt(i);
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final SparseBooleanArray f15092a = new SparseBooleanArray();
        private boolean b;

        public final a a(int i) {
            if (!this.b) {
                this.f15092a.append(i, true);
                return this;
            }
            throw new IllegalStateException();
        }

        public final void a(bc0 bc0Var) {
            for (int i = 0; i < bc0Var.f15091a.size(); i++) {
                a(bc0Var.b(i));
            }
        }

        public final bc0 a() {
            if (!this.b) {
                this.b = true;
                return new bc0(this.f15092a);
            }
            throw new IllegalStateException();
        }
    }

    private bc0(SparseBooleanArray sparseBooleanArray) {
        this.f15091a = sparseBooleanArray;
    }

    public final boolean a(int i) {
        return this.f15091a.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc0)) {
            return false;
        }
        bc0 bc0Var = (bc0) obj;
        if (f92.f15466a < 24) {
            if (this.f15091a.size() != bc0Var.f15091a.size()) {
                return false;
            }
            for (int i = 0; i < this.f15091a.size(); i++) {
                if (b(i) != bc0Var.b(i)) {
                    return false;
                }
            }
            return true;
        }
        return this.f15091a.equals(bc0Var.f15091a);
    }

    public final int a() {
        return this.f15091a.size();
    }
}
