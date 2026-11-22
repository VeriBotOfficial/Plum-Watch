package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.wx1;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

/* loaded from: classes5.dex */
final class vx1 extends wx1.d<Object> {
    final /* synthetic */ Set b;
    final /* synthetic */ Set c;

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new ux1(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    vx1(mk0 mk0Var, mk0 mk0Var2) {
        super();
        this.b = mk0Var;
        this.c = mk0Var2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.b.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.c.contains(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.c, this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return this.b.contains(obj) && this.c.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        return this.b.containsAll(collection) && this.c.containsAll(collection);
    }
}
