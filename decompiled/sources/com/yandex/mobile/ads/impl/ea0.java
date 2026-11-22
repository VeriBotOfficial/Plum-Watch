package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class ea0 {

    public static final class b extends ea0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f15364a = new b();

        private b() {
            super(0);
        }
    }

    private ea0() {
    }

    public static final class d extends ea0 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f15366a = new d();

        private d() {
            super(0);
        }
    }

    public /* synthetic */ ea0(int i) {
        this();
    }

    public static final class c extends ea0 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f15365a = new c();

        private c() {
            super(0);
        }
    }

    public static final class a extends ea0 {

        /* renamed from: a, reason: collision with root package name */
        private final w3 f15363a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w3 adFetchRequestError) {
            super(0);
            Intrinsics.checkNotNullParameter(adFetchRequestError, "adFetchRequestError");
            this.f15363a = adFetchRequestError;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f15363a, ((a) obj).f15363a);
        }

        public final int hashCode() {
            return this.f15363a.hashCode();
        }

        public final String toString() {
            return "Failed(adFetchRequestError=" + this.f15363a + Separators.RPAREN;
        }

        public final w3 a() {
            return this.f15363a;
        }
    }
}
