package com.bytedance.adsdk.kg;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes13.dex */
abstract class ckl<K, V> {
    ckl<K, V>.kg kg;

    protected abstract int fxn();

    protected abstract int fxn(Object obj);

    protected abstract Object fxn(int i, int i2);

    protected abstract void fxn(int i);

    protected abstract void gff();

    protected abstract Map<K, V> kg();

    ckl() {
    }

    final class fxn<T> implements Iterator<T> {
        final int fxn;
        int gff;
        boolean hm = false;
        int kg;

        fxn(int i) {
            this.fxn = i;
            this.kg = ckl.this.fxn();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.gff < this.kg;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t = (T) ckl.this.fxn(this.gff, this.fxn);
            this.gff++;
            this.hm = true;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.hm) {
                throw new IllegalStateException();
            }
            int i = this.gff - 1;
            this.gff = i;
            this.kg--;
            this.hm = false;
            ckl.this.fxn(i);
        }
    }

    final class kg implements Set<K> {
        kg() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            ckl.this.gff();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return ckl.this.fxn(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return ckl.fxn(ckl.this.kg(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return ckl.this.fxn() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new fxn(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int fxn = ckl.this.fxn(obj);
            if (fxn < 0) {
                return false;
            }
            ckl.this.fxn(fxn);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return ckl.kg(ckl.this.kg(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return ckl.gff(ckl.this.kg(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return ckl.this.fxn();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return ckl.this.kg(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) ckl.this.fxn(tArr, 0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return ckl.fxn(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i = 0;
            for (int fxn = ckl.this.fxn() - 1; fxn >= 0; fxn--) {
                Object fxn2 = ckl.this.fxn(fxn, 0);
                i += fxn2 == null ? 0 : fxn2.hashCode();
            }
            return i;
        }
    }

    public static <K, V> boolean fxn(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <K, V> boolean kg(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static <K, V> boolean gff(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public Object[] kg(int i) {
        int fxn2 = fxn();
        Object[] objArr = new Object[fxn2];
        for (int i2 = 0; i2 < fxn2; i2++) {
            objArr[i2] = fxn(i2, i);
        }
        return objArr;
    }

    public <T> T[] fxn(T[] tArr, int i) {
        int fxn2 = fxn();
        if (tArr.length < fxn2) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), fxn2));
        }
        for (int i2 = 0; i2 < fxn2; i2++) {
            tArr[i2] = fxn(i2, i);
        }
        if (tArr.length > fxn2) {
            tArr[fxn2] = null;
        }
        return tArr;
    }

    public static <T> boolean fxn(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public Set<K> hm() {
        if (this.kg == null) {
            this.kg = new kg();
        }
        return this.kg;
    }
}
