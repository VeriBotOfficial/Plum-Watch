package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import android.os.Bundle;
import com.yandex.mobile.ads.impl.km;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class y52 implements km {
    public static final km.a<y52> g = new km.a() { // from class: com.yandex.mobile.ads.impl.y52$$ExternalSyntheticLambda0
        @Override // com.yandex.mobile.ads.impl.km.a
        public final km fromBundle(Bundle bundle) {
            y52 a2;
            a2 = y52.a(bundle);
            return a2;
        }
    };
    public final int b;
    public final String c;
    public final int d;
    private final jc0[] e;
    private int f;

    public y52(String str, jc0... jc0VarArr) {
        hg.a(jc0VarArr.length > 0);
        this.c = str;
        this.e = jc0VarArr;
        this.b = jc0VarArr.length;
        int c = w01.c(jc0VarArr[0].m);
        this.d = c == -1 ? w01.c(jc0VarArr[0].l) : c;
        a();
    }

    public final jc0 a(int i) {
        return this.e[i];
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = v3.a(this.c, 527, 31) + Arrays.hashCode(this.e);
        }
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y52.class == obj.getClass()) {
            y52 y52Var = (y52) obj;
            if (this.c.equals(y52Var.c) && Arrays.equals(this.e, y52Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int a(jc0 jc0Var) {
        int i = 0;
        while (true) {
            jc0[] jc0VarArr = this.e;
            if (i >= jc0VarArr.length) {
                return -1;
            }
            if (jc0Var == jc0VarArr[i]) {
                return i;
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static y52 a(Bundle bundle) {
        kk0 a2;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        if (parcelableArrayList == null) {
            a2 = kk0.h();
        } else {
            a2 = lm.a(jc0.I, parcelableArrayList);
        }
        return new y52(bundle.getString(Integer.toString(1, 36), ""), (jc0[]) a2.toArray(new jc0[0]));
    }

    private void a() {
        String str = this.e[0].d;
        if (str == null || str.equals("und")) {
            str = "";
        }
        int i = this.e[0].f | 16384;
        int i2 = 1;
        while (true) {
            jc0[] jc0VarArr = this.e;
            if (i2 >= jc0VarArr.length) {
                return;
            }
            String str2 = jc0VarArr[i2].d;
            if (str2 == null || str2.equals("und")) {
                str2 = "";
            }
            if (!str.equals(str2)) {
                jc0[] jc0VarArr2 = this.e;
                et0.a("TrackGroup", "", new IllegalStateException("Different languages combined in one TrackGroup: '" + jc0VarArr2[0].d + "' (track 0) and '" + jc0VarArr2[i2].d + "' (track " + i2 + Separators.RPAREN));
                return;
            }
            jc0[] jc0VarArr3 = this.e;
            if (i != (jc0VarArr3[i2].f | 16384)) {
                et0.a("TrackGroup", "", new IllegalStateException("Different role flags combined in one TrackGroup: '" + Integer.toBinaryString(jc0VarArr3[0].f) + "' (track 0) and '" + Integer.toBinaryString(this.e[i2].f) + "' (track " + i2 + Separators.RPAREN));
                return;
            }
            i2++;
        }
    }
}
