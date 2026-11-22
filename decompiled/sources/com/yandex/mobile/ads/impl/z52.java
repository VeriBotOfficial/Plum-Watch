package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.km;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class z52 implements km {
    public static final z52 e = new z52(new y52[0]);
    public static final km.a<z52> f = new km.a() { // from class: com.yandex.mobile.ads.impl.z52$$ExternalSyntheticLambda0
        @Override // com.yandex.mobile.ads.impl.km.a
        public final km fromBundle(Bundle bundle) {
            z52 a2;
            a2 = z52.a(bundle);
            return a2;
        }
    };
    public final int b;
    private final kk0<y52> c;
    private int d;

    public z52(y52... y52VarArr) {
        this.c = kk0.b(y52VarArr);
        this.b = y52VarArr.length;
        a();
    }

    public final y52 a(int i) {
        return this.c.get(i);
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.c.hashCode();
        }
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z52.class == obj.getClass()) {
            z52 z52Var = (z52) obj;
            if (this.b == z52Var.b && this.c.equals(z52Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int a(y52 y52Var) {
        int indexOf = this.c.indexOf(y52Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static z52 a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        if (parcelableArrayList == null) {
            return new z52(new y52[0]);
        }
        return new z52((y52[]) lm.a(y52.g, parcelableArrayList).toArray(new y52[0]));
    }

    private void a() {
        int i = 0;
        while (i < this.c.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.c.size(); i3++) {
                if (this.c.get(i).equals(this.c.get(i3))) {
                    et0.a("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }
}
