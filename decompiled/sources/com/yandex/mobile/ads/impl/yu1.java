package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface yu1 {

    public static final class b implements yu1 {

        /* renamed from: a, reason: collision with root package name */
        private final ju1 f17457a;
        private final kr b;

        public b(ju1 sdkConfiguration, kr configurationSource) {
            Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
            Intrinsics.checkNotNullParameter(configurationSource, "configurationSource");
            this.f17457a = sdkConfiguration;
            this.b = configurationSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f17457a, bVar.f17457a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f17457a.hashCode() * 31);
        }

        public final String toString() {
            return "Success(sdkConfiguration=" + this.f17457a + ", configurationSource=" + this.b + Separators.RPAREN;
        }

        public final ju1 b() {
            return this.f17457a;
        }

        public final kr a() {
            return this.b;
        }
    }

    public static final class a implements yu1 {

        /* renamed from: a, reason: collision with root package name */
        private final si2 f17456a;
        private final kr b;

        public a(si2 error, kr configurationSource) {
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(configurationSource, "configurationSource");
            this.f17456a = error;
            this.b = configurationSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f17456a, aVar.f17456a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f17456a.hashCode() * 31);
        }

        public final String toString() {
            return "Failure(error=" + this.f17456a + ", configurationSource=" + this.b + Separators.RPAREN;
        }

        public final si2 b() {
            return this.f17456a;
        }

        public final kr a() {
            return this.b;
        }
    }
}
