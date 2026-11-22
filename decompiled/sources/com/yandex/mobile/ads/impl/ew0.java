package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class ew0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f15426a;
    private final String b;
    private final b c;
    private final String d;
    private final String e;
    private final Float f;
    private final int g;
    private final int h;
    private final int i;
    private final String j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ b[] c;
        private final String b;

        static {
            b[] bVarArr = {new b(0, "STREAMING", "streaming"), new b(1, "PROGRESSIVE", "progressive")};
            c = bVarArr;
            EnumEntriesKt.enumEntries(bVarArr);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) c.clone();
        }

        private b(int i, String str, String str2) {
            this.b = str2;
        }

        public final String a() {
            return this.b;
        }
    }

    public ew0(String uri, String str, b bVar, String str2, String str3, Float f, int i, int i2, int i3, String str4) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f15426a = uri;
        this.b = str;
        this.c = bVar;
        this.d = str2;
        this.e = str3;
        this.f = f;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ew0)) {
            return false;
        }
        ew0 ew0Var = (ew0) obj;
        return Intrinsics.areEqual(this.f15426a, ew0Var.f15426a) && Intrinsics.areEqual(this.b, ew0Var.b) && this.c == ew0Var.c && Intrinsics.areEqual(this.d, ew0Var.d) && Intrinsics.areEqual(this.e, ew0Var.e) && Intrinsics.areEqual((Object) this.f, (Object) ew0Var.f) && this.g == ew0Var.g && this.h == ew0Var.h && this.i == ew0Var.i && Intrinsics.areEqual(this.j, ew0Var.j);
    }

    public final int hashCode() {
        int hashCode = this.f15426a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        b bVar = this.c;
        int hashCode3 = (hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Float f = this.f;
        int a2 = dy1.a(this.i, dy1.a(this.h, dy1.a(this.g, (hashCode5 + (f == null ? 0 : f.hashCode())) * 31, 31), 31), 31);
        String str4 = this.j;
        return a2 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "MediaFile(uri=" + this.f15426a + ", id=" + this.b + ", deliveryMethod=" + this.c + ", mimeType=" + this.d + ", codec=" + this.e + ", vmafMetric=" + this.f + ", height=" + this.g + ", width=" + this.h + ", bitrate=" + this.i + ", apiFramework=" + this.j + Separators.RPAREN;
    }

    public final String f() {
        return this.f15426a;
    }

    public final String e() {
        return this.d;
    }

    public final String c() {
        return this.e;
    }

    public final Float g() {
        return this.f;
    }

    public final int d() {
        return this.g;
    }

    public final int h() {
        return this.h;
    }

    public final int b() {
        return this.i;
    }

    public final String a() {
        return this.j;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f15427a;
        private String b;
        private b c;
        private String d;
        private String e;
        private Float f;
        private int g;
        private int h;
        private int i;
        private String j;

        public a(String uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.f15427a = uri;
        }

        public final a d(String str) {
            b bVar;
            b[] values = b.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    bVar = null;
                    break;
                }
                bVar = values[i];
                if (Intrinsics.areEqual(bVar.a(), str)) {
                    break;
                }
                i++;
            }
            this.c = bVar;
            return this;
        }

        public final a f(String str) {
            this.b = str;
            return this;
        }

        public final a i(String str) {
            Integer intOrNull;
            if (str != null && (intOrNull = StringsKt.toIntOrNull(str)) != null) {
                this.h = intOrNull.intValue();
            }
            return this;
        }

        public final a e(String str) {
            Integer intOrNull;
            if (str != null && (intOrNull = StringsKt.toIntOrNull(str)) != null) {
                this.g = intOrNull.intValue();
            }
            return this;
        }

        public final a b(String str) {
            Integer intOrNull;
            if (str != null && (intOrNull = StringsKt.toIntOrNull(str)) != null) {
                this.i = intOrNull.intValue();
            }
            return this;
        }

        public final a a(String str) {
            this.j = str;
            return this;
        }

        public final ew0 a() {
            return new ew0(this.f15427a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        }

        public final a c(String str) {
            this.e = str;
            return this;
        }

        public final a h(String str) {
            this.f = str != null ? StringsKt.toFloatOrNull(str) : null;
            return this;
        }

        public final a g(String str) {
            this.d = str;
            return this;
        }
    }
}
