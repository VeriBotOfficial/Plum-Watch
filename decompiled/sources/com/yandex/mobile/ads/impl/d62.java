package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.km;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class d62 implements km {
    public static final km.a<d62> d = new km.a() { // from class: com.yandex.mobile.ads.impl.d62$$ExternalSyntheticLambda0
        @Override // com.yandex.mobile.ads.impl.km.a
        public final km fromBundle(Bundle bundle) {
            d62 a2;
            a2 = d62.a(bundle);
            return a2;
        }
    };
    public final y52 b;
    public final kk0<Integer> c;

    /* JADX INFO: Access modifiers changed from: private */
    public static d62 a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(Integer.toString(0, 36));
        bundle2.getClass();
        y52 fromBundle = y52.g.fromBundle(bundle2);
        int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
        intArray.getClass();
        return new d62(fromBundle, hq0.a(intArray));
    }

    public d62(y52 y52Var, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= y52Var.b)) {
            throw new IndexOutOfBoundsException();
        }
        this.b = y52Var;
        this.c = kk0.a((Collection) list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d62.class == obj.getClass()) {
            d62 d62Var = (d62) obj;
            if (this.b.equals(d62Var.b) && this.c.equals(d62Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.c.hashCode() * 31) + this.b.hashCode();
    }
}
