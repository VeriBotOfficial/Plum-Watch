package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface ey {

    public static final class d implements ey {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f15434a;

        public d(Uri reportUri) {
            Intrinsics.checkNotNullParameter(reportUri, "reportUri");
            this.f15434a = reportUri;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.areEqual(this.f15434a, ((d) obj).f15434a);
        }

        public final int hashCode() {
            return this.f15434a.hashCode();
        }

        public final String toString() {
            return "ShareReport(reportUri=" + this.f15434a + Separators.RPAREN;
        }

        public final Uri a() {
            return this.f15434a;
        }
    }

    public static final class c implements ey {

        /* renamed from: a, reason: collision with root package name */
        private final String f15433a;

        public c(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.f15433a = text;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.areEqual(this.f15433a, ((c) obj).f15433a);
        }

        public final int hashCode() {
            return this.f15433a.hashCode();
        }

        public final String toString() {
            return "Message(text=" + this.f15433a + Separators.RPAREN;
        }

        public final String a() {
            return this.f15433a;
        }
    }

    public static final class e implements ey {

        /* renamed from: a, reason: collision with root package name */
        private final String f15435a;
        private final String b;

        public e(String message) {
            Intrinsics.checkNotNullParameter("Warning", "title");
            Intrinsics.checkNotNullParameter(message, "message");
            this.f15435a = "Warning";
            this.b = message;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.areEqual(this.f15435a, eVar.f15435a) && Intrinsics.areEqual(this.b, eVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f15435a.hashCode() * 31);
        }

        public final String toString() {
            return "Warning(title=" + this.f15435a + ", message=" + this.b + Separators.RPAREN;
        }

        public final String a() {
            return this.b;
        }
    }

    public static final class b implements ey {

        /* renamed from: a, reason: collision with root package name */
        public static final b f15432a = new b();

        private b() {
        }
    }

    public static final class a implements ey {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15431a = new a();

        private a() {
        }
    }
}
