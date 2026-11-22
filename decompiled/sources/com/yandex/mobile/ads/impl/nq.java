package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class nq {

    public static final class c extends nq {

        /* renamed from: a, reason: collision with root package name */
        private final String f16369a;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.areEqual(this.f16369a, ((c) obj).f16369a);
        }

        public final int hashCode() {
            String str = this.f16369a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return "ConsentString(value=" + this.f16369a + Separators.RPAREN;
        }

        public c(String str) {
            super(0);
            this.f16369a = str;
        }

        public final String a() {
            return this.f16369a;
        }
    }

    private nq() {
    }

    public static final class d extends nq {

        /* renamed from: a, reason: collision with root package name */
        private final String f16370a;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.areEqual(this.f16370a, ((d) obj).f16370a);
        }

        public final int hashCode() {
            String str = this.f16370a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return "Gdpr(value=" + this.f16370a + Separators.RPAREN;
        }

        public d(String str) {
            super(0);
            this.f16370a = str;
        }

        public final String a() {
            return this.f16370a;
        }
    }

    public static final class b extends nq {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f16368a;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f16368a == ((b) obj).f16368a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f16368a);
        }

        public final String toString() {
            return "CmpPresent(value=" + this.f16368a + Separators.RPAREN;
        }

        public b(boolean z) {
            super(0);
            this.f16368a = z;
        }

        public final boolean a() {
            return this.f16368a;
        }
    }

    public /* synthetic */ nq(int i) {
        this();
    }

    public static final class e extends nq {

        /* renamed from: a, reason: collision with root package name */
        private final String f16371a;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.areEqual(this.f16371a, ((e) obj).f16371a);
        }

        public final int hashCode() {
            String str = this.f16371a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return "PurposeConsents(value=" + this.f16371a + Separators.RPAREN;
        }

        public e(String str) {
            super(0);
            this.f16371a = str;
        }

        public final String a() {
            return this.f16371a;
        }
    }

    public static final class f extends nq {

        /* renamed from: a, reason: collision with root package name */
        private final String f16372a;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Intrinsics.areEqual(this.f16372a, ((f) obj).f16372a);
        }

        public final int hashCode() {
            String str = this.f16372a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return "VendorConsents(value=" + this.f16372a + Separators.RPAREN;
        }

        public f(String str) {
            super(0);
            this.f16372a = str;
        }

        public final String a() {
            return this.f16372a;
        }
    }

    public static final class a extends nq {

        /* renamed from: a, reason: collision with root package name */
        private final String f16367a;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f16367a, ((a) obj).f16367a);
        }

        public final int hashCode() {
            String str = this.f16367a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return "AdditionalConsent(value=" + this.f16367a + Separators.RPAREN;
        }

        public a(String str) {
            super(0);
            this.f16367a = str;
        }

        public final String a() {
            return this.f16367a;
        }
    }
}
