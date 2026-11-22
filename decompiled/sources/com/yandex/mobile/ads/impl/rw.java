package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class rw {

    /* renamed from: a, reason: collision with root package name */
    private final String f16800a;
    private final String b;
    private final boolean c;
    private final String d;
    private final String e;
    private final String f;
    private final a g;
    private final List<String> h;

    public rw(String name, String str, boolean z, String str2, String str3, String str4, a adapterStatus, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(adapterStatus, "adapterStatus");
        this.f16800a = name;
        this.b = str;
        this.c = z;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = adapterStatus;
        this.h = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rw)) {
            return false;
        }
        rw rwVar = (rw) obj;
        return Intrinsics.areEqual(this.f16800a, rwVar.f16800a) && Intrinsics.areEqual(this.b, rwVar.b) && this.c == rwVar.c && Intrinsics.areEqual(this.d, rwVar.d) && Intrinsics.areEqual(this.e, rwVar.e) && Intrinsics.areEqual(this.f, rwVar.f) && Intrinsics.areEqual(this.g, rwVar.g) && Intrinsics.areEqual(this.h, rwVar.h);
    }

    public final int hashCode() {
        int hashCode = this.f16800a.hashCode() * 31;
        String str = this.b;
        int a2 = a7.a(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.d;
        int hashCode2 = (a2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int hashCode4 = (this.g.hashCode() + ((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        List<String> list = this.h;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "DebugPanelAdapterData(name=" + this.f16800a + ", logoUrl=" + this.b + ", adapterIntegrationStatus=" + this.c + ", adapterVersion=" + this.d + ", latestAdapterVersion=" + this.e + ", sdkVersion=" + this.f + ", adapterStatus=" + this.g + ", formats=" + this.h + Separators.RPAREN;
    }

    public final String e() {
        return this.f16800a;
    }

    public final String d() {
        return this.b;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.e;
    }

    public final String f() {
        return this.f;
    }

    public final a a() {
        return this.g;
    }

    public interface a {

        /* renamed from: com.yandex.mobile.ads.impl.rw$a$a, reason: collision with other inner class name */
        public static final class C0983a implements a {

            /* renamed from: a, reason: collision with root package name */
            public static final C0983a f16801a = new C0983a();

            private C0983a() {
            }
        }

        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            private final sz0 f16802a;

            public b() {
                sz0 error = sz0.b;
                Intrinsics.checkNotNullParameter(error, "error");
                this.f16802a = error;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f16802a == ((b) obj).f16802a;
            }

            public final int hashCode() {
                return this.f16802a.hashCode();
            }

            public final String toString() {
                return "InvalidIntegration(error=" + this.f16802a + Separators.RPAREN;
            }

            public final sz0 a() {
                return this.f16802a;
            }
        }

        public static final class c implements a {

            /* renamed from: a, reason: collision with root package name */
            public static final c f16803a = new c();

            private c() {
            }
        }
    }
}
