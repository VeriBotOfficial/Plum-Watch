package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.y12;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* loaded from: classes5.dex */
abstract class l<T> implements Iterator<T> {
    private int b = 2;

    @CheckForNull
    private String c;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    protected l() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int a2;
        int i = this.b;
        if (i != 4) {
            int a3 = f9.a(i);
            if (a3 == 0) {
                return true;
            }
            if (a3 != 2) {
                this.b = 4;
                y12.a aVar = (y12.a) this;
                int i2 = aVar.g;
                while (true) {
                    int i3 = aVar.g;
                    if (i3 != -1) {
                        w12 w12Var = (w12) aVar;
                        a2 = w12Var.i.f17302a.a(w12Var.d, i3);
                        if (a2 == -1) {
                            a2 = aVar.d.length();
                            aVar.g = -1;
                        } else {
                            aVar.g = a2 + 1;
                        }
                        int i4 = aVar.g;
                        if (i4 == i2) {
                            int i5 = i4 + 1;
                            aVar.g = i5;
                            if (i5 > aVar.d.length()) {
                                aVar.g = -1;
                            }
                        } else {
                            while (i2 < a2 && aVar.e.a(aVar.d.charAt(i2))) {
                                i2++;
                            }
                            while (a2 > i2 && aVar.e.a(aVar.d.charAt(a2 - 1))) {
                                a2--;
                            }
                            if (!aVar.f || i2 != a2) {
                                break;
                            }
                            i2 = aVar.g;
                        }
                    } else {
                        aVar.b = 3;
                        str = null;
                        break;
                    }
                }
                int i6 = aVar.h;
                if (i6 == 1) {
                    a2 = aVar.d.length();
                    aVar.g = -1;
                    while (a2 > i2 && aVar.e.a(aVar.d.charAt(a2 - 1))) {
                        a2--;
                    }
                } else {
                    aVar.h = i6 - 1;
                }
                str = aVar.d.subSequence(i2, a2).toString();
                this.c = str;
                if (this.b != 3) {
                    this.b = 1;
                    return true;
                }
            }
            return false;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.b = 2;
            T t = (T) this.c;
            this.c = null;
            return t;
        }
        throw new NoSuchElementException();
    }
}
