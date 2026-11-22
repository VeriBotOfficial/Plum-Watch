package com.yandex.mobile.ads.impl;

import com.google.errorprone.annotations.DoNotMock;
import com.yandex.mobile.ads.impl.kk0;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.annotation.CheckForNull;

@DoNotMock("Use ImmutableList.of or another implementation")
/* loaded from: classes5.dex */
public abstract class ik0<E> extends AbstractCollection<E> implements Serializable {
    private static final Object[] b = new Object[0];

    static abstract class a<E> extends b<E> {

        /* renamed from: a, reason: collision with root package name */
        Object[] f15826a;
        int b;
        boolean c;

        a() {
            pq.a(4, "initialCapacity");
            this.f15826a = new Object[4];
            this.b = 0;
        }

        public final void a(Object obj) {
            obj.getClass();
            int i = this.b;
            int i2 = i + 1;
            Object[] objArr = this.f15826a;
            if (objArr.length < i2) {
                int length = objArr.length;
                if (i2 < 0) {
                    throw new AssertionError("cannot store more than MAX_VALUE elements");
                }
                int i3 = length + (length >> 1) + 1;
                if (i3 < i2) {
                    i3 = Integer.highestOneBit(i) << 1;
                }
                if (i3 < 0) {
                    i3 = Integer.MAX_VALUE;
                }
                this.f15826a = Arrays.copyOf(objArr, i3);
                this.c = false;
            } else if (this.c) {
                this.f15826a = (Object[]) objArr.clone();
                this.c = false;
            }
            Object[] objArr2 = this.f15826a;
            int i4 = this.b;
            this.b = i4 + 1;
            objArr2[i4] = obj;
        }

        public void b(Object obj) {
            a(obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final b a(List list) {
            if (list instanceof Collection) {
                int size = list.size() + this.b;
                Object[] objArr = this.f15826a;
                if (objArr.length < size) {
                    int length = objArr.length;
                    if (size >= 0) {
                        int i = length + (length >> 1) + 1;
                        if (i < size) {
                            i = Integer.highestOneBit(size - 1) << 1;
                        }
                        if (i < 0) {
                            i = Integer.MAX_VALUE;
                        }
                        this.f15826a = Arrays.copyOf(objArr, i);
                        this.c = false;
                    } else {
                        throw new AssertionError("cannot store more than MAX_VALUE elements");
                    }
                } else if (this.c) {
                    this.f15826a = (Object[]) objArr.clone();
                    this.c = false;
                }
                if (list instanceof ik0) {
                    this.b = ((ik0) list).a(this.b, this.f15826a);
                    return this;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((kk0.a) this).a(it.next());
            }
            return this;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @CheckForNull
    Object[] c() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(@CheckForNull Object obj);

    int d() {
        throw new UnsupportedOperationException();
    }

    int e() {
        throw new UnsupportedOperationException();
    }

    abstract boolean f();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public abstract i82<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    Object writeReplace() {
        return new kk0.c(toArray(b));
    }

    int a(int i, Object[] objArr) {
        i82<E> it = iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
    }

    ik0() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int size = size();
        if (tArr.length < size) {
            Object[] c = c();
            if (c != null) {
                return (T[]) qh1.a(c, e(), d(), tArr);
            }
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        a(0, tArr);
        return tArr;
    }

    public kk0<E> b() {
        if (isEmpty()) {
            int i = kk0.d;
            return (kk0<E>) lo1.g;
        }
        Object[] array = toArray(b);
        int i2 = kk0.d;
        return kk0.b(array.length, array);
    }

    @DoNotMock
    public static abstract class b<E> {
        b() {
        }
    }
}
