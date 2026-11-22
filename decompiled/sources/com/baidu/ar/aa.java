package com.baidu.ar;

import java.util.List;

/* loaded from: classes12.dex */
public final class aa extends d8 {
    public long e;

    public aa(x3 x3Var, int i, h6 h6Var, boolean z) {
        super(x3Var, i, h6Var, z);
        this.e = 0L;
    }

    @Override // com.baidu.ar.d8
    public List<List<t3>> a() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.e < 1000) {
            return null;
        }
        this.e = currentTimeMillis;
        List<List<t3>> a2 = super.a();
        return a2.size() > 1 ? a2.subList(0, 1) : a2;
    }
}
