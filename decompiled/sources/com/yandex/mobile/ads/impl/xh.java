package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.e;
import com.yandex.mobile.ads.impl.e42;
import com.yandex.mobile.ads.impl.jc0;
import java.util.Collections;

/* loaded from: classes5.dex */
final class xh extends e42 {
    private static final int[] e = {5512, 11025, 22050, 44100};
    private boolean b;
    private boolean c;
    private int d;

    public xh(a62 a62Var) {
        super(a62Var);
    }

    protected final boolean a(ag1 ag1Var) throws e42.a {
        if (!this.b) {
            int t = ag1Var.t();
            int i = (t >> 4) & 15;
            this.d = i;
            if (i == 2) {
                this.f15346a.a(new jc0.a().e("audio/mpeg").c(1).l(e[(t >> 2) & 3]).a());
                this.c = true;
            } else if (i == 7 || i == 8) {
                this.f15346a.a(new jc0.a().e(i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").c(1).l(8000).a());
                this.c = true;
            } else if (i != 10) {
                throw new e42.a("Audio format not supported: " + this.d);
            }
            this.b = true;
        } else {
            ag1Var.f(1);
        }
        return true;
    }

    protected final boolean a(long j, ag1 ag1Var) throws eg1 {
        if (this.d == 2) {
            int a2 = ag1Var.a();
            this.f15346a.a(a2, ag1Var);
            this.f15346a.a(j, 1, a2, 0, null);
            return true;
        }
        int t = ag1Var.t();
        if (t == 0 && !this.c) {
            int a3 = ag1Var.a();
            byte[] bArr = new byte[a3];
            ag1Var.a(bArr, 0, a3);
            e.a a4 = e.a(new zf1(a3, bArr), false);
            this.f15346a.a(new jc0.a().e("audio/mp4a-latm").a(a4.c).c(a4.b).l(a4.f15329a).a(Collections.singletonList(bArr)).a());
            this.c = true;
            return false;
        }
        if (this.d == 10 && t != 1) {
            return false;
        }
        int a5 = ag1Var.a();
        this.f15346a.a(a5, ag1Var);
        this.f15346a.a(j, 1, a5, 0, null);
        return true;
    }
}
