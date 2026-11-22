package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface ll0 {

    public static final class c implements ll0 {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f16140a;

        public c(Uri reportUri) {
            Intrinsics.checkNotNullParameter(reportUri, "reportUri");
            this.f16140a = reportUri;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.areEqual(this.f16140a, ((c) obj).f16140a);
        }

        public final int hashCode() {
            return this.f16140a.hashCode();
        }

        public final String toString() {
            return "Success(reportUri=" + this.f16140a + Separators.RPAREN;
        }

        public final Uri a() {
            return this.f16140a;
        }
    }

    public static final class a implements ll0 {

        /* renamed from: a, reason: collision with root package name */
        private final String f16138a;

        public a(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f16138a = message;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f16138a, ((a) obj).f16138a);
        }

        public final int hashCode() {
            return this.f16138a.hashCode();
        }

        public final String toString() {
            return "Failure(message=" + this.f16138a + Separators.RPAREN;
        }

        public final String a() {
            return this.f16138a;
        }
    }

    public static final class b implements ll0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f16139a = new b();

        private b() {
        }
    }
}
