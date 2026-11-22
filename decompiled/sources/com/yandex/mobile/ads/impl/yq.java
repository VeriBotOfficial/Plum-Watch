package com.yandex.mobile.ads.impl;

import java.util.Comparator;

/* loaded from: classes5.dex */
public abstract class yq {

    /* renamed from: a, reason: collision with root package name */
    private static final yq f17445a = new a();
    private static final yq b = new b(-1);
    private static final yq c = new b(1);

    final class a extends yq {
        @Override // com.yandex.mobile.ads.impl.yq
        public final int a() {
            return 0;
        }

        @Override // com.yandex.mobile.ads.impl.yq
        public final yq a(int i, int i2) {
            char c = i < i2 ? (char) 65535 : i > i2 ? (char) 1 : (char) 0;
            return c < 0 ? yq.b : c > 0 ? yq.c : yq.f17445a;
        }

        @Override // com.yandex.mobile.ads.impl.yq
        public final yq b(boolean z, boolean z2) {
            char c = z2 == z ? (char) 0 : z2 ? (char) 1 : (char) 65535;
            return c < 0 ? yq.b : c > 0 ? yq.c : yq.f17445a;
        }

        @Override // com.yandex.mobile.ads.impl.yq
        public final yq a(long j, long j2) {
            char c = j < j2 ? (char) 65535 : j > j2 ? (char) 1 : (char) 0;
            if (c < 0) {
                return yq.b;
            }
            return c > 0 ? yq.c : yq.f17445a;
        }

        a() {
            super();
        }

        @Override // com.yandex.mobile.ads.impl.yq
        public final <T> yq a(T t, T t2, Comparator<T> comparator) {
            int compare = comparator.compare(t, t2);
            if (compare < 0) {
                return yq.b;
            }
            return compare > 0 ? yq.c : yq.f17445a;
        }

        @Override // com.yandex.mobile.ads.impl.yq
        public final yq a(boolean z, boolean z2) {
            char c = z == z2 ? (char) 0 : z ? (char) 1 : (char) 65535;
            if (c < 0) {
                return yq.b;
            }
            return c > 0 ? yq.c : yq.f17445a;
        }
    }

    public static yq b() {
        return f17445a;
    }

    public abstract int a();

    public abstract yq a(int i, int i2);

    public abstract yq a(long j, long j2);

    public abstract <T> yq a(T t, T t2, Comparator<T> comparator);

    public abstract yq a(boolean z, boolean z2);

    public abstract yq b(boolean z, boolean z2);

    private yq() {
    }

    private static final class b extends yq {
        final int d;

        @Override // com.yandex.mobile.ads.impl.yq
        public final yq a(int i, int i2) {
            return this;
        }

        @Override // com.yandex.mobile.ads.impl.yq
        public final yq a(long j, long j2) {
            return this;
        }

        @Override // com.yandex.mobile.ads.impl.yq
        public final <T> yq a(T t, T t2, Comparator<T> comparator) {
            return this;
        }

        @Override // com.yandex.mobile.ads.impl.yq
        public final yq a(boolean z, boolean z2) {
            return this;
        }

        @Override // com.yandex.mobile.ads.impl.yq
        public final yq b(boolean z, boolean z2) {
            return this;
        }

        b(int i) {
            super();
            this.d = i;
        }

        @Override // com.yandex.mobile.ads.impl.yq
        public final int a() {
            return this.d;
        }
    }
}
