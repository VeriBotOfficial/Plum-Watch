package com.bytedance.adsdk.kg;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes13.dex */
public final class fxn<E> implements Collection<E>, Set<E> {
    private static int bh;
    private static final int[] gff = new int[0];
    private static final Object[] hm = new Object[0];
    private static Object[] rb;

    /* renamed from: sg, reason: collision with root package name */
    private static Object[] f9229sg;
    private static int tw;
    Object[] fxn;
    private ckl<E, E> hie;
    private int[] jq;
    int kg;

    private int fxn(Object obj, int i) {
        int i2 = this.kg;
        if (i2 == 0) {
            return -1;
        }
        int fxn = kg.fxn(this.jq, i2, i);
        if (fxn < 0 || obj.equals(this.fxn[fxn])) {
            return fxn;
        }
        int i3 = fxn + 1;
        while (i3 < i2 && this.jq[i3] == i) {
            if (obj.equals(this.fxn[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = fxn - 1; i4 >= 0 && this.jq[i4] == i; i4--) {
            if (obj.equals(this.fxn[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    private int fxn() {
        int i = this.kg;
        if (i == 0) {
            return -1;
        }
        int fxn = kg.fxn(this.jq, i, 0);
        if (fxn < 0 || this.fxn[fxn] == null) {
            return fxn;
        }
        int i2 = fxn + 1;
        while (i2 < i && this.jq[i2] == 0) {
            if (this.fxn[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = fxn - 1; i3 >= 0 && this.jq[i3] == 0; i3--) {
            if (this.fxn[i3] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    private void hm(int i) {
        if (i == 8) {
            synchronized (fxn.class) {
                Object[] objArr = f9229sg;
                if (objArr != null) {
                    this.fxn = objArr;
                    f9229sg = (Object[]) objArr[0];
                    this.jq = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    tw--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (fxn.class) {
                Object[] objArr2 = rb;
                if (objArr2 != null) {
                    this.fxn = objArr2;
                    rb = (Object[]) objArr2[0];
                    this.jq = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    bh--;
                    return;
                }
            }
        }
        this.jq = new int[i];
        this.fxn = new Object[i];
    }

    private static void fxn(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (fxn.class) {
                if (tw < 10) {
                    objArr[0] = f9229sg;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f9229sg = objArr;
                    tw++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (fxn.class) {
                if (bh < 10) {
                    objArr[0] = rb;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    rb = objArr;
                    bh++;
                }
            }
        }
    }

    public fxn() {
        this(0);
    }

    public fxn(int i) {
        if (i == 0) {
            this.jq = gff;
            this.fxn = hm;
        } else {
            hm(i);
        }
        this.kg = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.kg;
        if (i != 0) {
            fxn(this.jq, this.fxn, i);
            this.jq = gff;
            this.fxn = hm;
            this.kg = 0;
        }
    }

    public void fxn(int i) {
        int[] iArr = this.jq;
        if (iArr.length < i) {
            Object[] objArr = this.fxn;
            hm(i);
            int i2 = this.kg;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.jq, 0, i2);
                System.arraycopy(objArr, 0, this.fxn, 0, this.kg);
            }
            fxn(iArr, objArr, this.kg);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return fxn(obj) >= 0;
    }

    public int fxn(Object obj) {
        return obj == null ? fxn() : fxn(obj, obj.hashCode());
    }

    public E kg(int i) {
        return (E) this.fxn[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.kg <= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int i;
        int fxn;
        if (e == null) {
            fxn = fxn();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            fxn = fxn(e, hashCode);
        }
        if (fxn >= 0) {
            return false;
        }
        int i2 = ~fxn;
        int i3 = this.kg;
        int[] iArr = this.jq;
        if (i3 >= iArr.length) {
            int i4 = 8;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.fxn;
            hm(i4);
            int[] iArr2 = this.jq;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.fxn, 0, objArr.length);
            }
            fxn(iArr, objArr, this.kg);
        }
        int i5 = this.kg;
        if (i2 < i5) {
            int[] iArr3 = this.jq;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.fxn;
            System.arraycopy(objArr2, i2, objArr2, i6, this.kg - i2);
        }
        this.jq[i2] = i;
        this.fxn[i2] = e;
        this.kg++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int fxn = fxn(obj);
        if (fxn < 0) {
            return false;
        }
        gff(fxn);
        return true;
    }

    public E gff(int i) {
        Object[] objArr = this.fxn;
        E e = (E) objArr[i];
        int i2 = this.kg;
        if (i2 <= 1) {
            fxn(this.jq, objArr, i2);
            this.jq = gff;
            this.fxn = hm;
            this.kg = 0;
            return e;
        }
        int[] iArr = this.jq;
        if (iArr.length > 8 && i2 < iArr.length / 3) {
            hm(i2 > 8 ? i2 + (i2 >> 1) : 8);
            this.kg--;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.jq, 0, i);
                System.arraycopy(objArr, 0, this.fxn, 0, i);
            }
            int i3 = this.kg;
            if (i < i3) {
                int i4 = i + 1;
                System.arraycopy(iArr, i4, this.jq, i, i3 - i);
                System.arraycopy(objArr, i4, this.fxn, i, this.kg - i);
            }
            return e;
        }
        int i5 = i2 - 1;
        this.kg = i5;
        if (i < i5) {
            int i6 = i + 1;
            System.arraycopy(iArr, i6, iArr, i, i5 - i);
            Object[] objArr2 = this.fxn;
            System.arraycopy(objArr2, i6, objArr2, i, this.kg - i);
        }
        this.fxn[this.kg] = null;
        return e;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.kg;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i = this.kg;
        Object[] objArr = new Object[i];
        System.arraycopy(this.fxn, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.kg) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.kg));
        }
        System.arraycopy(this.fxn, 0, tArr, 0, this.kg);
        int length = tArr.length;
        int i = this.kg;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i = 0; i < this.kg; i++) {
                try {
                    if (!set.contains(kg(i))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.jq;
        int i = this.kg;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.kg * 14);
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        for (int i = 0; i < this.kg; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            E kg = kg(i);
            if (kg != this) {
                sb.append(kg);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    private ckl<E, E> kg() {
        if (this.hie == null) {
            this.hie = new ckl<E, E>() { // from class: com.bytedance.adsdk.kg.fxn.1
                @Override // com.bytedance.adsdk.kg.ckl
                protected int fxn() {
                    return fxn.this.kg;
                }

                @Override // com.bytedance.adsdk.kg.ckl
                protected Object fxn(int i, int i2) {
                    return fxn.this.fxn[i];
                }

                @Override // com.bytedance.adsdk.kg.ckl
                protected int fxn(Object obj) {
                    return fxn.this.fxn(obj);
                }

                @Override // com.bytedance.adsdk.kg.ckl
                protected Map<E, E> kg() {
                    throw new UnsupportedOperationException("not a map");
                }

                @Override // com.bytedance.adsdk.kg.ckl
                protected void fxn(int i) {
                    fxn.this.gff(i);
                }

                @Override // com.bytedance.adsdk.kg.ckl
                protected void gff() {
                    fxn.this.clear();
                }
            };
        }
        return this.hie;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return kg().hm().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        fxn(this.kg + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.kg - 1; i >= 0; i--) {
            if (!collection.contains(this.fxn[i])) {
                gff(i);
                z = true;
            }
        }
        return z;
    }
}
