package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xk1<T, V> {

    /* renamed from: a, reason: collision with root package name */
    private final long f17342a;
    private final int b;
    private final n70 c;
    private final o70 d;
    private final ArrayList e;

    public static final class a<T, V> implements m70 {

        /* renamed from: a, reason: collision with root package name */
        private final T f17343a;
        private final V b;
        private final long c;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f17343a, aVar.f17343a) && Intrinsics.areEqual(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            T t = this.f17343a;
            int hashCode = (t == null ? 0 : t.hashCode()) * 31;
            V v = this.b;
            return Long.hashCode(this.c) + ((hashCode + (v != null ? v.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "CachedItem(params=" + this.f17343a + ", item=" + this.b + ", expiresAtTimestampMillis=" + this.c + Separators.RPAREN;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(wd0 wd0Var, Object obj, long j) {
            this.f17343a = wd0Var;
            this.b = obj;
            this.c = j;
        }

        public final T c() {
            return this.f17343a;
        }

        public final V b() {
            return this.b;
        }

        @Override // com.yandex.mobile.ads.impl.m70
        public final long a() {
            return this.c;
        }
    }

    public /* synthetic */ xk1() {
        this(86400000L, 5, new n70(), new o70());
    }

    public final synchronized void a(wd0 wd0Var, Object obj) {
        a();
        if (this.e.size() < this.b) {
            ArrayList arrayList = this.e;
            o70 o70Var = this.d;
            long j = this.f17342a;
            o70Var.getClass();
            arrayList.add(new a(wd0Var, obj, System.currentTimeMillis() + j));
        }
    }

    public xk1(long j, int i, n70 expirationChecker, o70 expirationTimestampUtil) {
        Intrinsics.checkNotNullParameter(expirationChecker, "expirationChecker");
        Intrinsics.checkNotNullParameter(expirationTimestampUtil, "expirationTimestampUtil");
        this.f17342a = j;
        this.b = i;
        this.c = expirationChecker;
        this.d = expirationTimestampUtil;
        this.e = new ArrayList();
    }

    public final synchronized boolean b() {
        a();
        return this.e.size() < this.b;
    }

    private final void a() {
        ArrayList arrayList = this.e;
        n70 n70Var = this.c;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            m70 any = (m70) next;
            n70Var.getClass();
            Intrinsics.checkNotNullParameter(any, "any");
            if (System.currentTimeMillis() > any.a()) {
                arrayList2.add(next);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            this.e.remove((a) it2.next());
        }
    }

    public final synchronized Object a(wd0 wd0Var) {
        Object obj;
        Object obj2;
        Object b;
        a();
        Iterator it = this.e.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (Intrinsics.areEqual(((a) obj2).c(), wd0Var)) {
                break;
            }
        }
        a aVar = (a) obj2;
        if (aVar != null && (b = aVar.b()) != null) {
            this.e.remove(aVar);
            obj = b;
        }
        return obj;
    }
}
