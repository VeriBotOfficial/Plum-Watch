package com.yandex.mobile.ads.impl;

import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* loaded from: classes5.dex */
public abstract class mk0<E> extends ik0<E> implements Set<E> {

    @CheckForNull
    @LazyInit
    private transient kk0<E> c;

    @Override // com.yandex.mobile.ads.impl.ik0
    Object writeReplace() {
        return new a(toArray());
    }

    @Override // com.yandex.mobile.ads.impl.ik0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    static int a(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    public static mk0 a(Set set) {
        if ((set instanceof mk0) && !(set instanceof SortedSet)) {
            mk0 mk0Var = (mk0) set;
            if (!mk0Var.f()) {
                return mk0Var;
            }
        }
        Object[] array = set.toArray();
        return b(array.length, array);
    }

    mk0() {
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof mk0) && (this instanceof no1)) {
            mk0 mk0Var = (mk0) obj;
            mk0Var.getClass();
            if ((mk0Var instanceof no1) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return wx1.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return wx1.a(this);
    }

    @Override // com.yandex.mobile.ads.impl.ik0
    public kk0<E> b() {
        kk0<E> kk0Var = this.c;
        if (kk0Var != null) {
            return kk0Var;
        }
        kk0<E> g = g();
        this.c = g;
        return g;
    }

    kk0<E> g() {
        Object[] array = toArray();
        int i = kk0.d;
        return kk0.b(array.length, array);
    }

    private static class a implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] b;

        a(Object[] objArr) {
            this.b = objArr;
        }

        Object readResolve() {
            return mk0.a(this.b);
        }
    }

    private static <E> mk0<E> b(int i, Object... objArr) {
        if (i == 0) {
            return no1.j;
        }
        if (i != 1) {
            int a2 = a(i);
            Object[] objArr2 = new Object[a2];
            int i2 = a2 - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object obj = objArr[i5];
                if (obj != null) {
                    int hashCode = obj.hashCode();
                    int a3 = jf0.a(hashCode);
                    while (true) {
                        int i6 = a3 & i2;
                        Object obj2 = objArr2[i6];
                        if (obj2 == null) {
                            objArr[i4] = obj;
                            objArr2[i6] = obj;
                            i3 += hashCode;
                            i4++;
                            break;
                        }
                        if (obj2.equals(obj)) {
                            break;
                        }
                        a3++;
                    }
                } else {
                    throw new NullPointerException(oe.a("at index ", i5));
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                return new ez1(Objects.requireNonNull(objArr[0]));
            }
            if (a(i4) < a2 / 2) {
                return b(i4, objArr);
            }
            int length = objArr.length;
            if (i4 < (length >> 1) + (length >> 2)) {
                objArr = Arrays.copyOf(objArr, i4);
            }
            return new no1(objArr, i3, objArr2, i2, i4);
        }
        return new ez1(Objects.requireNonNull(objArr[0]));
    }

    public static <E> mk0<E> a(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return no1.j;
        }
        if (length != 1) {
            return b(eArr.length, (Object[]) eArr.clone());
        }
        return new ez1(eArr[0]);
    }

    public static mk0 a(String str, String str2) {
        return b(2, str, str2);
    }

    public static mk0 a(String str, String str2, String str3) {
        return b(3, str, str2, str3);
    }
}
