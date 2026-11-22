package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class uu implements jg2 {

    /* renamed from: a, reason: collision with root package name */
    private final List<ew0> f17086a;
    private final List<mi0> b;
    private final List<l62> c;
    private final xu d;
    private final String e;
    private final sz1 f;
    private final String g;
    private final int h;
    private final String i;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f17087a = new ArrayList();
        private final ArrayList b = new ArrayList();
        private final ArrayList c = new ArrayList();
        private xu d;
        private String e;
        private sz1 f;
        private String g;
        private int h;
        private String i;

        public final a a(List list) {
            ArrayList arrayList = this.b;
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            arrayList.addAll(list);
            return this;
        }

        public final a b(List list) {
            ArrayList arrayList = this.f17087a;
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            arrayList.addAll(list);
            return this;
        }

        public final void a(l62 trackingEvent) {
            Intrinsics.checkNotNullParameter(trackingEvent, "trackingEvent");
            this.c.add(trackingEvent);
        }

        public final a c(List<l62> list) {
            ArrayList arrayList = this.c;
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            arrayList.addAll(list);
            return this;
        }

        public final a b(String str) {
            this.e = str;
            return this;
        }

        public final a a(String str) {
            this.i = str;
            return this;
        }

        public final void a(xu creativeExtensions) {
            Intrinsics.checkNotNullParameter(creativeExtensions, "creativeExtensions");
            this.d = creativeExtensions;
        }

        public final a c(String str) {
            this.g = str;
            return this;
        }

        public final a a(int i) {
            this.h = i;
            return this;
        }

        public final a a(sz1 sz1Var) {
            this.f = sz1Var;
            return this;
        }

        public final uu a() {
            return new uu(this.f17087a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }
    }

    public uu(ArrayList mediaFiles, ArrayList icons, ArrayList trackingEventsList, xu xuVar, String str, sz1 sz1Var, String str2, int i, String str3) {
        Intrinsics.checkNotNullParameter(mediaFiles, "mediaFiles");
        Intrinsics.checkNotNullParameter(icons, "icons");
        Intrinsics.checkNotNullParameter(trackingEventsList, "trackingEventsList");
        this.f17086a = mediaFiles;
        this.b = icons;
        this.c = trackingEventsList;
        this.d = xuVar;
        this.e = str;
        this.f = sz1Var;
        this.g = str2;
        this.h = i;
        this.i = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu)) {
            return false;
        }
        uu uuVar = (uu) obj;
        return Intrinsics.areEqual(this.f17086a, uuVar.f17086a) && Intrinsics.areEqual(this.b, uuVar.b) && Intrinsics.areEqual(this.c, uuVar.c) && Intrinsics.areEqual(this.d, uuVar.d) && Intrinsics.areEqual(this.e, uuVar.e) && Intrinsics.areEqual(this.f, uuVar.f) && Intrinsics.areEqual(this.g, uuVar.g) && this.h == uuVar.h && Intrinsics.areEqual(this.i, uuVar.i);
    }

    public final int hashCode() {
        int a2 = aa.a(this.c, aa.a(this.b, this.f17086a.hashCode() * 31, 31), 31);
        xu xuVar = this.d;
        int hashCode = (a2 + (xuVar == null ? 0 : xuVar.hashCode())) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        sz1 sz1Var = this.f;
        int hashCode3 = (hashCode2 + (sz1Var == null ? 0 : sz1Var.hashCode())) * 31;
        String str2 = this.g;
        int a3 = dy1.a(this.h, (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.i;
        return a3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "Creative(mediaFiles=" + this.f17086a + ", icons=" + this.b + ", trackingEventsList=" + this.c + ", creativeExtensions=" + this.d + ", clickThroughUrl=" + this.e + ", skipOffset=" + this.f + ", id=" + this.g + ", durationMillis=" + this.h + ", adParameters=" + this.i + Separators.RPAREN;
    }

    public final List<ew0> h() {
        return this.f17086a;
    }

    public final List<mi0> f() {
        return this.b;
    }

    public final List<l62> j() {
        return this.c;
    }

    public final xu d() {
        return this.d;
    }

    public final String c() {
        return this.e;
    }

    public final sz1 i() {
        return this.f;
    }

    public final String g() {
        return this.g;
    }

    public final int e() {
        return this.h;
    }

    public final String b() {
        return this.i;
    }

    @Override // com.yandex.mobile.ads.impl.jg2
    public final Map<String, List<String>> a() {
        List<l62> list = this.c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (l62 l62Var : list) {
            String a2 = l62Var.a();
            Object obj = linkedHashMap.get(a2);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(a2, obj);
            }
            ((List) obj).add(l62Var.c());
        }
        return linkedHashMap;
    }
}
