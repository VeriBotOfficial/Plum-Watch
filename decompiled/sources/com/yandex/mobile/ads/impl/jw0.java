package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Bundle;
import com.yandex.mobile.ads.impl.jw0;
import com.yandex.mobile.ads.impl.kk0;
import com.yandex.mobile.ads.impl.km;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes5.dex */
public final class jw0 implements km {
    public static final km.a<jw0> h;
    public final String b;
    public final g c;
    public final e d;
    public final mw0 e;
    public final c f;
    public final h g;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f15955a;
        private Uri b;
        private String f;
        private b.a c = new b.a();
        private d.a d = new d.a();
        private List<w22> e = Collections.emptyList();
        private kk0<j> g = kk0.h();
        private e.a h = new e.a();
        private h i = h.d;

        public final a b(String str) {
            str.getClass();
            this.f15955a = str;
            return this;
        }

        public final jw0 a() {
            g gVar;
            d.a aVar = this.d;
            aVar.getClass();
            Uri uri = this.b;
            if (uri != null) {
                aVar.getClass();
                gVar = new g(uri, null, null, this.e, this.f, this.g, null);
            } else {
                gVar = null;
            }
            String str = this.f15955a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            b.a aVar2 = this.c;
            aVar2.getClass();
            return new jw0(str2, new c(aVar2), gVar, this.h.a(), mw0.H, this.i);
        }

        public final a a(String str) {
            this.f = str;
            return this;
        }

        public final a a(List<w22> list) {
            List<w22> emptyList;
            if (list != null && !list.isEmpty()) {
                emptyList = Collections.unmodifiableList(new ArrayList(list));
            } else {
                emptyList = Collections.emptyList();
            }
            this.e = emptyList;
            return this;
        }

        public final a a(Uri uri) {
            this.b = uri;
            return this;
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f15960a;
        public final String b;
        public final d c;
        public final List<w22> d;
        public final String e;
        public final kk0<j> f;
        public final Object g;

        /* JADX WARN: Multi-variable type inference failed */
        private f(Uri uri, String str, d dVar, List list, String str2, kk0 kk0Var, Object obj) {
            this.f15960a = uri;
            this.b = str;
            this.c = dVar;
            this.d = list;
            this.e = str2;
            this.f = kk0Var;
            kk0.a g = kk0.g();
            for (int i = 0; i < kk0Var.size(); i++) {
                g.b(((j) kk0Var.get(i)).a().a());
            }
            g.a();
            this.g = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f15960a.equals(fVar.f15960a) && f92.a(this.b, fVar.b) && f92.a(this.c, fVar.c) && f92.a((Object) null, (Object) null) && this.d.equals(fVar.d) && f92.a(this.e, fVar.e) && this.f.equals(fVar.f) && f92.a(this.g, fVar.g);
        }

        public final int hashCode() {
            int hashCode = this.f15960a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            d dVar = this.c;
            int hashCode3 = (this.d.hashCode() + ((hashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 961)) * 31;
            String str2 = this.e;
            int hashCode4 = (this.f.hashCode() + ((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            Object obj = this.g;
            return hashCode4 + (obj != null ? obj.hashCode() : 0);
        }
    }

    @Deprecated
    public static final class g extends f {
        private g(Uri uri, String str, d dVar, List list, String str2, kk0 kk0Var, Object obj) {
            super(uri, str, dVar, list, str2, kk0Var, obj);
        }
    }

    static {
        new d.a();
        Collections.emptyList();
        kk0.h();
        e.a aVar = new e.a();
        h hVar = h.d;
        aVar.a();
        mw0 mw0Var = mw0.H;
        h = new km.a() { // from class: com.yandex.mobile.ads.impl.jw0$$ExternalSyntheticLambda0
            @Override // com.yandex.mobile.ads.impl.km.a
            public final km fromBundle(Bundle bundle) {
                jw0 a2;
                a2 = jw0.a(bundle);
                return a2;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static jw0 a(Bundle bundle) {
        String string = bundle.getString(Integer.toString(0, 36), "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(Integer.toString(1, 36));
        e fromBundle = bundle2 == null ? e.g : e.h.fromBundle(bundle2);
        Bundle bundle3 = bundle.getBundle(Integer.toString(2, 36));
        mw0 fromBundle2 = bundle3 == null ? mw0.H : mw0.I.fromBundle(bundle3);
        Bundle bundle4 = bundle.getBundle(Integer.toString(3, 36));
        c fromBundle3 = bundle4 == null ? c.h : b.g.fromBundle(bundle4);
        Bundle bundle5 = bundle.getBundle(Integer.toString(4, 36));
        return new jw0(string, fromBundle3, null, fromBundle, fromBundle2, bundle5 == null ? h.d : h.e.fromBundle(bundle5));
    }

    public static jw0 a(String str) {
        b.a aVar = new b.a();
        new d.a();
        List emptyList = Collections.emptyList();
        kk0 h2 = kk0.h();
        h hVar = h.d;
        Uri parse = str == null ? null : Uri.parse(str);
        return new jw0("", new c(aVar), parse != null ? new g(parse, null, null, emptyList, null, h2, null) : null, new e(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), mw0.H, hVar);
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final UUID f15957a;
        public final Uri b;
        public final lk0<String, String> c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final kk0<Integer> g;
        private final byte[] h;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private lk0<String, String> f15958a;
            private kk0<Integer> b;

            @Deprecated
            private a() {
                this.f15958a = lk0.g();
                this.b = kk0.h();
            }
        }

        private d(a aVar) {
            aVar.getClass();
            aVar.getClass();
            this.f15957a = (UUID) hg.a((Object) null);
            aVar.getClass();
            this.b = null;
            this.c = aVar.f15958a;
            aVar.getClass();
            this.d = false;
            aVar.getClass();
            this.f = false;
            aVar.getClass();
            this.e = false;
            this.g = aVar.b;
            aVar.getClass();
            this.h = null;
        }

        public final byte[] a() {
            byte[] bArr = this.h;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f15957a.equals(dVar.f15957a) && f92.a(this.b, dVar.b) && f92.a(this.c, dVar.c) && this.d == dVar.d && this.f == dVar.f && this.e == dVar.e && this.g.equals(dVar.g) && Arrays.equals(this.h, dVar.h);
        }

        public final int hashCode() {
            int hashCode = this.f15957a.hashCode() * 31;
            Uri uri = this.b;
            return Arrays.hashCode(this.h) + ((this.g.hashCode() + ((((((((this.c.hashCode() + ((hashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
        }
    }

    public static final class e implements km {
        public static final e g = new e(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);
        public static final km.a<e> h = new km.a() { // from class: com.yandex.mobile.ads.impl.jw0$e$$ExternalSyntheticLambda0
            @Override // com.yandex.mobile.ads.impl.km.a
            public final km fromBundle(Bundle bundle) {
                jw0.e a2;
                a2 = jw0.e.a(bundle);
                return a2;
            }
        };
        public final long b;
        public final long c;
        public final long d;
        public final float e;
        public final float f;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private long f15959a = -9223372036854775807L;
            private long b = -9223372036854775807L;
            private long c = -9223372036854775807L;
            private float d = -3.4028235E38f;
            private float e = -3.4028235E38f;

            public final e a() {
                return new e(this.f15959a, this.b, this.c, this.d, this.e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static e a(Bundle bundle) {
            return new e(bundle.getLong(Integer.toString(0, 36), -9223372036854775807L), bundle.getLong(Integer.toString(1, 36), -9223372036854775807L), bundle.getLong(Integer.toString(2, 36), -9223372036854775807L), bundle.getFloat(Integer.toString(3, 36), -3.4028235E38f), bundle.getFloat(Integer.toString(4, 36), -3.4028235E38f));
        }

        @Deprecated
        public e(long j, long j2, long j3, float f, float f2) {
            this.b = j;
            this.c = j2;
            this.d = j3;
            this.e = f;
            this.f = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.b == eVar.b && this.c == eVar.c && this.d == eVar.d && this.e == eVar.e && this.f == eVar.f;
        }

        public final int hashCode() {
            long j = this.b;
            long j2 = this.c;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.d;
            int i2 = (i + ((int) ((j3 >>> 32) ^ j3))) * 31;
            float f = this.e;
            int floatToIntBits = (i2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
            float f2 = this.f;
            return floatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
        }
    }

    public static class j {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f15962a;
        public final String b;
        public final String c;
        public final int d;
        public final int e;
        public final String f;
        public final String g;

        public final a a() {
            return new a();
        }

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private Uri f15963a;
            private String b;
            private String c;
            private int d;
            private int e;
            private String f;
            private String g;

            /* JADX INFO: Access modifiers changed from: private */
            public i a() {
                return new i(this);
            }

            private a(j jVar) {
                this.f15963a = jVar.f15962a;
                this.b = jVar.b;
                this.c = jVar.c;
                this.d = jVar.d;
                this.e = jVar.e;
                this.f = jVar.f;
                this.g = jVar.g;
            }
        }

        private j(a aVar) {
            this.f15962a = aVar.f15963a;
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
            this.e = aVar.e;
            this.f = aVar.f;
            this.g = aVar.g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.f15962a.equals(jVar.f15962a) && f92.a(this.b, jVar.b) && f92.a(this.c, jVar.c) && this.d == jVar.d && this.e == jVar.e && f92.a(this.f, jVar.f) && f92.a(this.g, jVar.g);
        }

        public final int hashCode() {
            int hashCode = this.f15962a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.d) * 31) + this.e) * 31;
            String str3 = this.f;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.g;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    @Deprecated
    public static final class i extends j {
        private i(j.a aVar) {
            super(aVar);
        }
    }

    public static class b implements km {
        public static final km.a<c> g = new km.a() { // from class: com.yandex.mobile.ads.impl.jw0$b$$ExternalSyntheticLambda0
            @Override // com.yandex.mobile.ads.impl.km.a
            public final km fromBundle(Bundle bundle) {
                jw0.c a2;
                a2 = jw0.b.a(bundle);
                return a2;
            }
        };
        public final long b;
        public final long c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private long f15956a;
            private long b = Long.MIN_VALUE;
            private boolean c;
            private boolean d;
            private boolean e;
        }

        private b(a aVar) {
            this.b = aVar.f15956a;
            this.c = aVar.b;
            this.d = aVar.c;
            this.e = aVar.d;
            this.f = aVar.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f;
        }

        public final int hashCode() {
            long j = this.b;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j2 = this.c;
            return ((((((i + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c a(Bundle bundle) {
            a aVar = new a();
            long j = bundle.getLong(Integer.toString(0, 36), 0L);
            if (j >= 0) {
                aVar.f15956a = j;
                long j2 = bundle.getLong(Integer.toString(1, 36), Long.MIN_VALUE);
                if (j2 != Long.MIN_VALUE && j2 < 0) {
                    throw new IllegalArgumentException();
                }
                aVar.b = j2;
                aVar.c = bundle.getBoolean(Integer.toString(2, 36), false);
                aVar.d = bundle.getBoolean(Integer.toString(3, 36), false);
                aVar.e = bundle.getBoolean(Integer.toString(4, 36), false);
                return new c(aVar);
            }
            throw new IllegalArgumentException();
        }
    }

    @Deprecated
    public static final class c extends b {
        public static final c h = new c(new b.a());

        private c(b.a aVar) {
            super(aVar);
        }
    }

    public static final class h implements km {
        public static final h d = new h(new a());
        public static final km.a<h> e = new km.a() { // from class: com.yandex.mobile.ads.impl.jw0$h$$ExternalSyntheticLambda0
            @Override // com.yandex.mobile.ads.impl.km.a
            public final km fromBundle(Bundle bundle) {
                jw0.h a2;
                a2 = jw0.h.a(bundle);
                return a2;
            }
        };
        public final Uri b;
        public final String c;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private Uri f15961a;
            private String b;
            private Bundle c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static h a(Bundle bundle) {
            a aVar = new a();
            aVar.f15961a = (Uri) bundle.getParcelable(Integer.toString(0, 36));
            aVar.b = bundle.getString(Integer.toString(1, 36));
            aVar.c = bundle.getBundle(Integer.toString(2, 36));
            return new h(aVar);
        }

        private h(a aVar) {
            this.b = aVar.f15961a;
            this.c = aVar.b;
            Bundle unused = aVar.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return f92.a(this.b, hVar.b) && f92.a(this.c, hVar.c);
        }

        public final int hashCode() {
            Uri uri = this.b;
            int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.c;
            return hashCode + (str != null ? str.hashCode() : 0);
        }
    }

    private jw0(String str, c cVar, g gVar, e eVar, mw0 mw0Var, h hVar) {
        this.b = str;
        this.c = gVar;
        this.d = eVar;
        this.e = mw0Var;
        this.f = cVar;
        this.g = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jw0)) {
            return false;
        }
        jw0 jw0Var = (jw0) obj;
        return f92.a(this.b, jw0Var.b) && this.f.equals(jw0Var.f) && f92.a(this.c, jw0Var.c) && f92.a(this.d, jw0Var.d) && f92.a(this.e, jw0Var.e) && f92.a(this.g, jw0Var.g);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        g gVar = this.c;
        return this.g.hashCode() + ((this.e.hashCode() + ((this.f.hashCode() + ((this.d.hashCode() + ((hashCode + (gVar != null ? gVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
