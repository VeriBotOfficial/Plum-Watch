package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class iy {

    public static final class f extends iy {

        /* renamed from: a, reason: collision with root package name */
        private final String f15862a;
        private final cy b;
        private final zw c;

        public final String a() {
            return this.f15862a;
        }

        public final cy b() {
            return this.b;
        }

        public final zw c() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Intrinsics.areEqual(this.f15862a, fVar.f15862a) && Intrinsics.areEqual(this.b, fVar.b) && Intrinsics.areEqual(this.c, fVar.c);
        }

        public final int hashCode() {
            String str = this.f15862a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            cy cyVar = this.b;
            int hashCode2 = (hashCode + (cyVar == null ? 0 : cyVar.hashCode())) * 31;
            zw zwVar = this.c;
            return hashCode2 + (zwVar != null ? zwVar.hashCode() : 0);
        }

        public final String toString() {
            return "KeyValue(title=" + this.f15862a + ", subtitle=" + this.b + ", text=" + this.c + Separators.RPAREN;
        }

        public /* synthetic */ f(String str, cy cyVar) {
            this(str, cyVar, null);
        }

        public f(String str, cy cyVar, zw zwVar) {
            super(0);
            this.f15862a = str;
            this.b = cyVar;
            this.c = zwVar;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public f(String title, String text) {
            this(title, new cy(text, 0, null, 0, 14));
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(text, "text");
        }
    }

    private iy() {
    }

    public /* synthetic */ iy(int i) {
        this();
    }

    public boolean a(Object obj) {
        return equals(obj);
    }

    public static final class e extends iy {

        /* renamed from: a, reason: collision with root package name */
        private final String f15861a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String text) {
            super(0);
            Intrinsics.checkNotNullParameter(text, "text");
            this.f15861a = text;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.areEqual(this.f15861a, ((e) obj).f15861a);
        }

        public final int hashCode() {
            return this.f15861a.hashCode();
        }

        public final String toString() {
            return "Header(text=" + this.f15861a + Separators.RPAREN;
        }

        public final String a() {
            return this.f15861a;
        }
    }

    public static final class g extends iy {

        /* renamed from: a, reason: collision with root package name */
        private final String f15863a;
        private final String b;
        private final cy c;
        private final zw d;
        private final String e;
        private final String f;
        private final String g;
        private final List<px> h;
        private final List<ly> i;
        private final sw j;
        private final String k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String name, String str, cy cyVar, zw infoSecond, String str2, String str3, String str4, List<px> list, List<ly> list2, sw type, String str5) {
            super(0);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(infoSecond, "infoSecond");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f15863a = name;
            this.b = str;
            this.c = cyVar;
            this.d = infoSecond;
            this.e = str2;
            this.f = str3;
            this.g = str4;
            this.h = list;
            this.i = list2;
            this.j = type;
            this.k = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return Intrinsics.areEqual(this.f15863a, gVar.f15863a) && Intrinsics.areEqual(this.b, gVar.b) && Intrinsics.areEqual(this.c, gVar.c) && Intrinsics.areEqual(this.d, gVar.d) && Intrinsics.areEqual(this.e, gVar.e) && Intrinsics.areEqual(this.f, gVar.f) && Intrinsics.areEqual(this.g, gVar.g) && Intrinsics.areEqual(this.h, gVar.h) && Intrinsics.areEqual(this.i, gVar.i) && this.j == gVar.j && Intrinsics.areEqual(this.k, gVar.k);
        }

        public final int hashCode() {
            int hashCode = this.f15863a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            cy cyVar = this.c;
            int hashCode3 = (this.d.hashCode() + ((hashCode2 + (cyVar == null ? 0 : cyVar.hashCode())) * 31)) * 31;
            String str2 = this.e;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.g;
            int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            List<px> list = this.h;
            int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
            List<ly> list2 = this.i;
            int hashCode8 = (this.j.hashCode() + ((hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31)) * 31;
            String str5 = this.k;
            return hashCode8 + (str5 != null ? str5.hashCode() : 0);
        }

        public final String toString() {
            return "MediationAdapter(name=" + this.f15863a + ", logoUrl=" + this.b + ", infoFirst=" + this.c + ", infoSecond=" + this.d + ", waringMessage=" + this.e + ", adUnitId=" + this.f + ", networkAdUnitIdName=" + this.g + ", parameters=" + this.h + ", cpmFloors=" + this.i + ", type=" + this.j + ", sdk=" + this.k + Separators.RPAREN;
        }

        public final String f() {
            return this.f15863a;
        }

        public final String e() {
            return this.b;
        }

        public final cy c() {
            return this.c;
        }

        public final zw d() {
            return this.d;
        }

        public final String j() {
            return this.e;
        }

        public final String a() {
            return this.f;
        }

        public final String g() {
            return this.g;
        }

        public final List<px> h() {
            return this.h;
        }

        public final List<ly> b() {
            return this.i;
        }

        public final sw i() {
            return this.j;
        }

        public /* synthetic */ g(String str, String str2, cy cyVar, zw zwVar, String str3, String str4, String str5, List list, List list2, sw swVar, String str6, int i) {
            this(str, str2, cyVar, zwVar, str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : list2, (i & 512) != 0 ? sw.e : swVar, (i & 1024) != 0 ? null : str6);
        }
    }

    public static final class d extends iy {

        /* renamed from: a, reason: collision with root package name */
        public static final d f15860a = new d();

        private d() {
            super(0);
        }
    }

    public static final class b extends iy {

        /* renamed from: a, reason: collision with root package name */
        public static final b f15858a = new b();

        private b() {
            super(0);
        }
    }

    public static final class a extends iy {

        /* renamed from: a, reason: collision with root package name */
        private final String f15857a;
        private final String b;
        private final String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String name, String format, String id2) {
            super(0);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(id2, "id");
            this.f15857a = name;
            this.b = format;
            this.c = id2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f15857a, aVar.f15857a) && Intrinsics.areEqual(this.b, aVar.b) && Intrinsics.areEqual(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + v3.a(this.b, this.f15857a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "AdUnit(name=" + this.f15857a + ", format=" + this.b + ", id=" + this.c + Separators.RPAREN;
        }

        public final String c() {
            return this.f15857a;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.c;
        }
    }

    public static final class c extends iy {

        /* renamed from: a, reason: collision with root package name */
        private final String f15859a;
        private final a b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {
            public static final a b;
            private static final /* synthetic */ a[] c;

            static {
                a aVar = new a();
                b = aVar;
                a[] aVarArr = {aVar};
                c = aVarArr;
                EnumEntriesKt.enumEntries(aVarArr);
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) c.clone();
            }

            private a() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c() {
            super(0);
            a actionType = a.b;
            Intrinsics.checkNotNullParameter("Enable Test mode", "text");
            Intrinsics.checkNotNullParameter(actionType, "actionType");
            this.f15859a = "Enable Test mode";
            this.b = actionType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f15859a, cVar.f15859a) && this.b == cVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f15859a.hashCode() * 31);
        }

        public final String toString() {
            return "Button(text=" + this.f15859a + ", actionType=" + this.b + Separators.RPAREN;
        }

        public final String b() {
            return this.f15859a;
        }

        public final a a() {
            return this.b;
        }
    }

    public static final class h extends iy {

        /* renamed from: a, reason: collision with root package name */
        private final String f15864a;
        private final a b;
        private final boolean c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {
            public static final a b;
            private static final /* synthetic */ a[] c;

            static {
                a aVar = new a();
                b = aVar;
                a[] aVarArr = {aVar};
                c = aVarArr;
                EnumEntriesKt.enumEntries(aVarArr);
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) c.clone();
            }

            private a() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z) {
            super(0);
            a switchType = a.b;
            Intrinsics.checkNotNullParameter("Debug Error Indicator", "text");
            Intrinsics.checkNotNullParameter(switchType, "switchType");
            this.f15864a = "Debug Error Indicator";
            this.b = switchType;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Intrinsics.areEqual(this.f15864a, hVar.f15864a) && this.b == hVar.b && this.c == hVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f15864a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "Switch(text=" + this.f15864a + ", switchType=" + this.b + ", initialState=" + this.c + Separators.RPAREN;
        }

        public final String c() {
            return this.f15864a;
        }

        public final a b() {
            return this.b;
        }

        public final boolean a() {
            return this.c;
        }

        @Override // com.yandex.mobile.ads.impl.iy
        public final boolean a(Object obj) {
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Intrinsics.areEqual(this.f15864a, hVar.f15864a) && this.b == hVar.b;
        }
    }
}
