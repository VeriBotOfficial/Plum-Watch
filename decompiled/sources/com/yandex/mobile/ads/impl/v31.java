package com.yandex.mobile.ads.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class v31<K0, V0> {

    public static abstract class c<K0> {
        abstract <K extends K0, V> Map<K, Collection<V>> b();

        public final b<K0, Object> a() {
            pq.a(2, "expectedValuesPerKey");
            return new w31(this);
        }

        c() {
        }
    }

    public static c<Comparable> a() {
        qc1 qc1Var = qc1.b;
        qc1Var.getClass();
        return new u31(qc1Var);
    }

    private v31() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class a<V> implements t32<List<V>>, Serializable {
        private final int b;

        @Override // com.yandex.mobile.ads.impl.t32
        public final Object get() {
            return new ArrayList(this.b);
        }

        a(int i) {
            this.b = pq.a(i, "expectedValuesPerKey");
        }
    }

    public static abstract class b<K0, V0> extends v31<K0, V0> {
        public abstract <K extends K0, V extends V0> zr0<K, V> b();

        b() {
            super();
        }
    }
}
