package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.gov.nist.core.Separators;
import com.yandex.mobile.ads.impl.ub2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class mb2 implements jg2 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f16225a;
    private final List<uu> b;
    private final Map<String, List<String>> c;
    private final ub2 d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final zh2 j;
    private final Integer k;
    private final String l;
    private final uk2 m;
    private final List<wa2> n;
    private final Map<String, List<String>> o;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f16226a;
        private final rd2 b;
        private uk2 c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private zh2 i;
        private Integer j;
        private String k;
        private final ArrayList l;
        private final ArrayList m;
        private final LinkedHashMap n;
        private ub2 o;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Context context, boolean z) {
            this(z, new rd2(context));
            Intrinsics.checkNotNullParameter(context, "context");
        }

        public final void b(String impression) {
            Intrinsics.checkNotNullParameter(impression, "impression");
            LinkedHashMap linkedHashMap = this.n;
            Object obj = linkedHashMap.get("impression");
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put("impression", obj);
            }
            ((List) obj).add(impression);
        }

        public final a a(List list) {
            ArrayList arrayList = this.m;
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            arrayList.addAll(list);
            return this;
        }

        public final a a(ArrayList arrayList) {
            this.l.addAll(arrayList);
            return this;
        }

        public final void a(String error) {
            Intrinsics.checkNotNullParameter(error, "error");
            LinkedHashMap linkedHashMap = this.n;
            Object obj = linkedHashMap.get("error");
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put("error", obj);
            }
            ((List) obj).add(error);
        }

        public final a h(String str) {
            this.h = str;
            return this;
        }

        public final a c(String str) {
            this.d = str;
            return this;
        }

        public final a d(String str) {
            this.e = str;
            return this;
        }

        public final a e(String str) {
            this.f = str;
            return this;
        }

        public final a g(String str) {
            this.g = str;
            return this;
        }

        public final a f(String str) {
            this.k = str;
            return this;
        }

        private a(boolean z, rd2 rd2Var) {
            this.f16226a = z;
            this.b = rd2Var;
            this.l = new ArrayList();
            this.m = new ArrayList();
            MapsKt.emptyMap();
            this.n = new LinkedHashMap();
            this.o = new ub2.a().a();
        }

        public final a a(Map<String, ? extends List<String>> map) {
            if (map == null) {
                map = MapsKt.emptyMap();
            }
            for (Map.Entry<String, ? extends List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if (value == null) {
                    value = CollectionsKt.emptyList();
                }
                for (String str : CollectionsKt.filterNotNull(value)) {
                    LinkedHashMap linkedHashMap = this.n;
                    Object obj = linkedHashMap.get(key);
                    if (obj == null) {
                        obj = new ArrayList();
                        linkedHashMap.put(key, obj);
                    }
                    ((List) obj).add(str);
                }
            }
            return this;
        }

        public final mb2 a() {
            return new mb2(this.f16226a, this.l, this.n, this.o, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.c, this.m, this.b.a(this.n, this.i));
        }

        public final void a(Integer num) {
            this.j = num;
        }

        public final a a(ub2 videoAdExtensions) {
            Intrinsics.checkNotNullParameter(videoAdExtensions, "videoAdExtensions");
            this.o = videoAdExtensions;
            return this;
        }

        public final a a(zh2 viewableImpression) {
            Intrinsics.checkNotNullParameter(viewableImpression, "viewableImpression");
            this.i = viewableImpression;
            return this;
        }

        public final a a(uk2 uk2Var) {
            this.c = uk2Var;
            return this;
        }
    }

    public mb2(boolean z, ArrayList creatives, LinkedHashMap rawTrackingEvents, ub2 videoAdExtensions, String str, String str2, String str3, String str4, String str5, zh2 zh2Var, Integer num, String str6, uk2 uk2Var, ArrayList adVerifications, Map trackingEvents) {
        Intrinsics.checkNotNullParameter(creatives, "creatives");
        Intrinsics.checkNotNullParameter(rawTrackingEvents, "rawTrackingEvents");
        Intrinsics.checkNotNullParameter(videoAdExtensions, "videoAdExtensions");
        Intrinsics.checkNotNullParameter(adVerifications, "adVerifications");
        Intrinsics.checkNotNullParameter(trackingEvents, "trackingEvents");
        this.f16225a = z;
        this.b = creatives;
        this.c = rawTrackingEvents;
        this.d = videoAdExtensions;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = zh2Var;
        this.k = num;
        this.l = str6;
        this.m = uk2Var;
        this.n = adVerifications;
        this.o = trackingEvents;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb2)) {
            return false;
        }
        mb2 mb2Var = (mb2) obj;
        return this.f16225a == mb2Var.f16225a && Intrinsics.areEqual(this.b, mb2Var.b) && Intrinsics.areEqual(this.c, mb2Var.c) && Intrinsics.areEqual(this.d, mb2Var.d) && Intrinsics.areEqual(this.e, mb2Var.e) && Intrinsics.areEqual(this.f, mb2Var.f) && Intrinsics.areEqual(this.g, mb2Var.g) && Intrinsics.areEqual(this.h, mb2Var.h) && Intrinsics.areEqual(this.i, mb2Var.i) && Intrinsics.areEqual(this.j, mb2Var.j) && Intrinsics.areEqual(this.k, mb2Var.k) && Intrinsics.areEqual(this.l, mb2Var.l) && Intrinsics.areEqual(this.m, mb2Var.m) && Intrinsics.areEqual(this.n, mb2Var.n) && Intrinsics.areEqual(this.o, mb2Var.o);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + aa.a(this.b, Boolean.hashCode(this.f16225a) * 31, 31)) * 31)) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        zh2 zh2Var = this.j;
        int hashCode7 = (hashCode6 + (zh2Var == null ? 0 : zh2Var.hashCode())) * 31;
        Integer num = this.k;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.l;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        uk2 uk2Var = this.m;
        return this.o.hashCode() + aa.a(this.n, (hashCode9 + (uk2Var != null ? uk2Var.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "VideoAd(isWrapper=" + this.f16225a + ", creatives=" + this.b + ", rawTrackingEvents=" + this.c + ", videoAdExtensions=" + this.d + ", adSystem=" + this.e + ", adTitle=" + this.f + ", description=" + this.g + ", survey=" + this.h + ", vastAdTagUri=" + this.i + ", viewableImpression=" + this.j + ", sequence=" + this.k + ", id=" + this.l + ", wrapperConfiguration=" + this.m + ", adVerifications=" + this.n + ", trackingEvents=" + this.o + Separators.RPAREN;
    }

    public final boolean o() {
        return this.f16225a;
    }

    public final List<uu> e() {
        return this.b;
    }

    public final Map<String, List<String>> h() {
        return this.c;
    }

    public final ub2 l() {
        return this.d;
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.f;
    }

    public final String f() {
        return this.g;
    }

    public final String j() {
        return this.h;
    }

    public final String k() {
        return this.i;
    }

    public final zh2 m() {
        return this.j;
    }

    public final Integer i() {
        return this.k;
    }

    public final String g() {
        return this.l;
    }

    public final uk2 n() {
        return this.m;
    }

    public final List<wa2> d() {
        return this.n;
    }

    @Override // com.yandex.mobile.ads.impl.jg2
    public final Map<String, List<String>> a() {
        return this.o;
    }
}
