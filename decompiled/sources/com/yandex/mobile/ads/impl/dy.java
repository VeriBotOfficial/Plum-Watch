package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import com.yandex.mobile.ads.impl.iy;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface dy {

    public static final class a implements dy {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15318a = new a();

        private a() {
        }
    }

    public static final class g implements dy {

        /* renamed from: a, reason: collision with root package name */
        public static final g f15324a = new g();

        private g() {
        }
    }

    public static final class d implements dy {

        /* renamed from: a, reason: collision with root package name */
        public static final d f15321a = new d();

        private d() {
        }
    }

    public static final class c implements dy {

        /* renamed from: a, reason: collision with root package name */
        public static final c f15320a = new c();

        private c() {
        }
    }

    public static final class e implements dy {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f15322a;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f15322a == ((e) obj).f15322a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f15322a);
        }

        public final String toString() {
            return "OnDebugErrorIndicatorSwitch(isChecked=" + this.f15322a + Separators.RPAREN;
        }

        public e(boolean z) {
            this.f15322a = z;
        }
    }

    public static final class b implements dy {

        /* renamed from: a, reason: collision with root package name */
        private final String f15319a;

        public b(String id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            this.f15319a = id2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f15319a, ((b) obj).f15319a);
        }

        public final int hashCode() {
            return this.f15319a.hashCode();
        }

        public final String toString() {
            return "OnAdUnitClick(id=" + this.f15319a + Separators.RPAREN;
        }

        public final String a() {
            return this.f15319a;
        }
    }

    public static final class f implements dy {

        /* renamed from: a, reason: collision with root package name */
        private final iy.g f15323a;

        public f(iy.g uiUnit) {
            Intrinsics.checkNotNullParameter(uiUnit, "uiUnit");
            this.f15323a = uiUnit;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Intrinsics.areEqual(this.f15323a, ((f) obj).f15323a);
        }

        public final int hashCode() {
            return this.f15323a.hashCode();
        }

        public final String toString() {
            return "OnMediationNetworkClick(uiUnit=" + this.f15323a + Separators.RPAREN;
        }

        public final iy.g a() {
            return this.f15323a;
        }
    }

    public static final class h implements dy {

        /* renamed from: a, reason: collision with root package name */
        private final String f15325a;

        public h(String waring) {
            Intrinsics.checkNotNullParameter(waring, "waring");
            this.f15325a = waring;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && Intrinsics.areEqual(this.f15325a, ((h) obj).f15325a);
        }

        public final int hashCode() {
            return this.f15325a.hashCode();
        }

        public final String toString() {
            return "OnWarningButtonClick(waring=" + this.f15325a + Separators.RPAREN;
        }

        public final String a() {
            return this.f15325a;
        }
    }
}
