package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class Jc {

    /* renamed from: a, reason: collision with root package name */
    public final Map f17917a;
    public final Object b;

    public Jc(Object obj) {
        this(new HashMap(), obj);
    }

    public final void a(Object obj, Object obj2) {
        this.f17917a.put(obj, obj2);
    }

    public Jc(HashMap hashMap, Object obj) {
        this.f17917a = hashMap;
        this.b = obj;
    }

    public final Object a(Object obj) {
        Object obj2 = this.f17917a.get(obj);
        return obj2 == null ? this.b : obj2;
    }
}
