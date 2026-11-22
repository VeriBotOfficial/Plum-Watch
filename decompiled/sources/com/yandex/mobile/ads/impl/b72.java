package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.b72;
import com.yandex.mobile.ads.impl.km;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes5.dex */
public final class b72 implements km {
    public static final b72 c = new b72(kk0.h());
    private final kk0<a> b;

    static {
        new km.a() { // from class: com.yandex.mobile.ads.impl.b72$$ExternalSyntheticLambda0
            @Override // com.yandex.mobile.ads.impl.km.a
            public final km fromBundle(Bundle bundle) {
                b72 a2;
                a2 = b72.a(bundle);
                return a2;
            }
        };
    }

    public b72(kk0 kk0Var) {
        this.b = kk0.a((Collection) kk0Var);
    }

    public static final class a implements km {
        public static final km.a<a> g = new km.a() { // from class: com.yandex.mobile.ads.impl.b72$a$$ExternalSyntheticLambda0
            @Override // com.yandex.mobile.ads.impl.km.a
            public final km fromBundle(Bundle bundle) {
                b72.a a2;
                a2 = b72.a.a(bundle);
                return a2;
            }
        };
        public final int b;
        private final y52 c;
        private final boolean d;
        private final int[] e;
        private final boolean[] f;

        public a(y52 y52Var, boolean z, int[] iArr, boolean[] zArr) {
            int i = y52Var.b;
            this.b = i;
            boolean z2 = false;
            hg.a(i == iArr.length && i == zArr.length);
            this.c = y52Var;
            if (z && i > 1) {
                z2 = true;
            }
            this.d = z2;
            this.e = (int[]) iArr.clone();
            this.f = (boolean[]) zArr.clone();
        }

        public final jc0 a(int i) {
            return this.c.a(i);
        }

        public final boolean b() {
            for (boolean z : this.f) {
                if (z) {
                    return true;
                }
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.d == aVar.d && this.c.equals(aVar.c) && Arrays.equals(this.e, aVar.e) && Arrays.equals(this.f, aVar.f)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + (((this.c.hashCode() * 31) + (this.d ? 1 : 0)) * 31)) * 31);
        }

        public final int a() {
            return this.c.d;
        }

        public final boolean b(int i) {
            return this.f[i];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static a a(Bundle bundle) {
            km.a<y52> aVar = y52.g;
            Bundle bundle2 = bundle.getBundle(Integer.toString(0, 36));
            bundle2.getClass();
            y52 fromBundle = aVar.fromBundle(bundle2);
            int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
            int[] iArr = new int[fromBundle.b];
            if (intArray == null) {
                intArray = iArr;
            }
            boolean[] booleanArray = bundle.getBooleanArray(Integer.toString(3, 36));
            boolean[] zArr = new boolean[fromBundle.b];
            if (booleanArray == null) {
                booleanArray = zArr;
            }
            return new a(fromBundle, bundle.getBoolean(Integer.toString(4, 36), false), intArray, booleanArray);
        }
    }

    public final kk0<a> a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b72.class != obj.getClass()) {
            return false;
        }
        return this.b.equals(((b72) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final boolean a(int i) {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            a aVar = this.b.get(i2);
            if (aVar.b() && aVar.a() == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static b72 a(Bundle bundle) {
        kk0 a2;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        if (parcelableArrayList == null) {
            a2 = kk0.h();
        } else {
            a2 = lm.a(a.g, parcelableArrayList);
        }
        return new b72(a2);
    }
}
