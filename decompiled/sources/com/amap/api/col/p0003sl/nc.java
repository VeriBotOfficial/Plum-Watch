package com.amap.api.col.p0003sl;

import android.content.Context;

/* compiled from: WiFiUplateStrategy.java */
/* loaded from: classes11.dex */
public class nc extends mc {
    private Context b;
    private boolean c;

    public nc(Context context, boolean z) {
        this.b = context;
        this.c = z;
    }

    @Override // com.amap.api.col.p0003sl.mc
    protected boolean c() {
        return d9.g(this.b) == 1 || this.c;
    }
}
