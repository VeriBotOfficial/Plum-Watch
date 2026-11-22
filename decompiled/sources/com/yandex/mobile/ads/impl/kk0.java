package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ik0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* loaded from: classes5.dex */
public abstract class kk0<E> extends ik0<E> implements List<E>, RandomAccess {
    private static final j82<Object> c = new b(0, lo1.g);
    public static final /* synthetic */ int d = 0;

    public static final class a<E> extends ik0.a<E> {
        public final a b(List list) {
            a(list);
            return this;
        }

        public a() {
            this(0);
        }

        a(int i) {
        }

        public final kk0<E> a() {
            this.c = true;
            return kk0.b(this.b, this.f15826a);
        }
    }

    static class b<E> extends j<E> {
        private final kk0<E> d;

        b(int i, kk0 kk0Var) {
            super(kk0Var.size(), i);
            this.d = kk0Var;
        }

        @Override // com.yandex.mobile.ads.impl.j
        protected final E a(int i) {
            return this.d.get(i);
        }
    }

    class d extends kk0<E> {
        final transient int e;
        final transient int f;

        @Override // com.yandex.mobile.ads.impl.ik0
        final boolean f() {
            return true;
        }

        @Override // com.yandex.mobile.ads.impl.kk0, com.yandex.mobile.ads.impl.ik0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // com.yandex.mobile.ads.impl.kk0, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // com.yandex.mobile.ads.impl.kk0, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return listIterator(i);
        }

        d(int i, int i2) {
            this.e = i;
            this.f = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f;
        }

        @Override // com.yandex.mobile.ads.impl.ik0
        @CheckForNull
        final Object[] c() {
            return kk0.this.c();
        }

        @Override // com.yandex.mobile.ads.impl.ik0
        final int e() {
            return kk0.this.e() + this.e;
        }

        @Override // com.yandex.mobile.ads.impl.ik0
        final int d() {
            return kk0.this.e() + this.e + this.f;
        }

        @Override // java.util.List
        public final E get(int i) {
            vj1.a(i, this.f);
            return kk0.this.get(i + this.e);
        }

        @Override // com.yandex.mobile.ads.impl.kk0, java.util.List
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kk0<E> subList(int i, int i2) {
            vj1.a(i, i2, this.f);
            kk0 kk0Var = kk0.this;
            int i3 = this.e;
            return kk0Var.subList(i + i3, i2 + i3);
        }
    }

    public static <E> a<E> g() {
        return new a<>();
    }

    public static <E> kk0<E> h() {
        return (kk0<E>) lo1.g;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.mobile.ads.impl.ik0
    @Deprecated
    public final kk0<E> b() {
        return this;
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.mobile.ads.impl.ik0
    Object writeReplace() {
        return new c(toArray());
    }

    private static <E> kk0<E> a(Object... objArr) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (objArr[i] == null) {
                throw new NullPointerException(oe.a("at index ", i));
            }
        }
        return b(objArr.length, objArr);
    }

    static kk0 b(int i, Object[] objArr) {
        return i == 0 ? lo1.g : new lo1(i, objArr);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@CheckForNull Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator<E> it = iterator();
                        Iterator<E> it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && zd1.a(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (zd1.a(get(i), list.get(i))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.List
    public final int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.yandex.mobile.ads.impl.ik0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final i82<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // com.yandex.mobile.ads.impl.ik0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // com.yandex.mobile.ads.impl.ik0
    int a(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public static <E> kk0<E> a(Collection<? extends E> collection) {
        if (collection instanceof ik0) {
            kk0<E> b2 = ((ik0) collection).b();
            if (!b2.f()) {
                return b2;
            }
            Object[] array = b2.toArray();
            return b(array.length, array);
        }
        return a(collection.toArray());
    }

    public static <E> kk0<E> b(E[] eArr) {
        if (eArr.length == 0) {
            return (kk0<E>) lo1.g;
        }
        return a((Object[]) eArr.clone());
    }

    kk0() {
    }

    @Override // com.yandex.mobile.ads.impl.ik0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final j82<E> listIterator(int i) {
        vj1.b(i, size());
        if (isEmpty()) {
            return (j82<E>) c;
        }
        return new b(i, this);
    }

    public static kk0 a(Long l, Long l2, Long l3, Long l4, Long l5) {
        return a(l, l2, l3, l4, l5);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    static class c implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] b;

        c(Object[] objArr) {
            this.b = objArr;
        }

        Object readResolve() {
            return kk0.b(this.b);
        }
    }

    public static <E> kk0<E> a(E e) {
        return a(e);
    }

    public static <E> kk0<E> a(E e, E e2) {
        return a(e, e2);
    }

    @Override // java.util.List
    /* renamed from: a */
    public kk0<E> subList(int i, int i2) {
        vj1.a(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return (kk0<E>) lo1.g;
        }
        return new d(i, i3);
    }
}
