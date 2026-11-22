package com.umeng.analytics.pro;

import android.gov.nist.core.Separators;
import com.umeng.analytics.pro.ba;
import com.umeng.analytics.pro.bd;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: TUnion.java */
/* loaded from: classes2.dex */
public abstract class bd<T extends bd<?, ?>, F extends ba> implements at<T, F> {
    private static final Map<Class<? extends ca>, cb> c;

    /* renamed from: a, reason: collision with root package name */
    protected Object f13802a;
    protected F b;

    protected abstract F a(short s);

    protected abstract Object a(bs bsVar, bn bnVar) throws az;

    protected abstract Object a(bs bsVar, short s) throws az;

    protected abstract void a(bs bsVar) throws az;

    protected abstract void b(F f, Object obj) throws ClassCastException;

    protected abstract void b(bs bsVar) throws az;

    protected abstract bn c(F f);

    protected abstract bx d();

    protected bd() {
        this.b = null;
        this.f13802a = null;
    }

    static {
        HashMap hashMap = new HashMap();
        c = hashMap;
        hashMap.put(cc.class, new b());
        hashMap.put(cd.class, new d());
    }

    protected bd(F f, Object obj) {
        a((bd<T, F>) f, obj);
    }

    protected bd(bd<T, F> bdVar) {
        if (!bdVar.getClass().equals(getClass())) {
            throw new ClassCastException();
        }
        this.b = bdVar.b;
        this.f13802a = a(bdVar.f13802a);
    }

    private static Object a(Object obj) {
        if (obj instanceof at) {
            return ((at) obj).deepCopy();
        }
        if (obj instanceof ByteBuffer) {
            return au.d((ByteBuffer) obj);
        }
        if (obj instanceof List) {
            return a((List) obj);
        }
        if (obj instanceof Set) {
            return a((Set) obj);
        }
        return obj instanceof Map ? a((Map<Object, Object>) obj) : obj;
    }

    private static Map a(Map<Object, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            hashMap.put(a(entry.getKey()), a(entry.getValue()));
        }
        return hashMap;
    }

    private static Set a(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(a(it.next()));
        }
        return hashSet;
    }

    private static List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next()));
        }
        return arrayList;
    }

    public F a() {
        return this.b;
    }

    public Object b() {
        return this.f13802a;
    }

    public Object a(F f) {
        if (f != this.b) {
            throw new IllegalArgumentException("Cannot get the value of field " + f + " because union's set field is " + this.b);
        }
        return b();
    }

    public Object a(int i) {
        return a((bd<T, F>) a((short) i));
    }

    public boolean c() {
        return this.b != null;
    }

    public boolean b(F f) {
        return this.b == f;
    }

    public boolean b(int i) {
        return b((bd<T, F>) a((short) i));
    }

    @Override // com.umeng.analytics.pro.at
    public void read(bs bsVar) throws az {
        c.get(bsVar.D()).b().b(bsVar, this);
    }

    public void a(F f, Object obj) {
        b(f, obj);
        this.b = f;
        this.f13802a = obj;
    }

    public void a(int i, Object obj) {
        a((bd<T, F>) a((short) i), obj);
    }

    @Override // com.umeng.analytics.pro.at
    public void write(bs bsVar) throws az {
        c.get(bsVar.D()).b().a(bsVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Separators.LESS_THAN);
        sb.append(getClass().getSimpleName());
        sb.append(" ");
        if (a() != null) {
            Object b2 = b();
            sb.append(c(a()).f13816a);
            sb.append(":");
            if (b2 instanceof ByteBuffer) {
                au.a((ByteBuffer) b2, sb);
            } else {
                sb.append(b2.toString());
            }
        }
        sb.append(Separators.GREATER_THAN);
        return sb.toString();
    }

    @Override // com.umeng.analytics.pro.at
    public final void clear() {
        this.b = null;
        this.f13802a = null;
    }

    /* compiled from: TUnion.java */
    private static class b implements cb {
        private b() {
        }

        @Override // com.umeng.analytics.pro.cb
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b() {
            return new a();
        }
    }

    /* compiled from: TUnion.java */
    private static class a extends cc<bd> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.ca
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(bs bsVar, bd bdVar) throws az {
            bdVar.b = null;
            bdVar.f13802a = null;
            bsVar.j();
            bn l = bsVar.l();
            bdVar.f13802a = bdVar.a(bsVar, l);
            if (bdVar.f13802a != null) {
                bdVar.b = (F) bdVar.a(l.c);
            }
            bsVar.m();
            bsVar.l();
            bsVar.k();
        }

        @Override // com.umeng.analytics.pro.ca
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(bs bsVar, bd bdVar) throws az {
            if (bdVar.a() == null || bdVar.b() == null) {
                throw new bt("Cannot write a TUnion with no set value!");
            }
            bsVar.a(bdVar.d());
            bsVar.a(bdVar.c(bdVar.b));
            bdVar.a(bsVar);
            bsVar.c();
            bsVar.d();
            bsVar.b();
        }
    }

    /* compiled from: TUnion.java */
    private static class d implements cb {
        private d() {
        }

        @Override // com.umeng.analytics.pro.cb
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c b() {
            return new c();
        }
    }

    /* compiled from: TUnion.java */
    private static class c extends cd<bd> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.ca
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(bs bsVar, bd bdVar) throws az {
            bdVar.b = null;
            bdVar.f13802a = null;
            short v = bsVar.v();
            bdVar.f13802a = bdVar.a(bsVar, v);
            if (bdVar.f13802a != null) {
                bdVar.b = (F) bdVar.a(v);
            }
        }

        @Override // com.umeng.analytics.pro.ca
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(bs bsVar, bd bdVar) throws az {
            if (bdVar.a() == null || bdVar.b() == null) {
                throw new bt("Cannot write a TUnion with no set value!");
            }
            bsVar.a(bdVar.b.a());
            bdVar.b(bsVar);
        }
    }
}
