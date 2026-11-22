package com.amap.api.col.p0003sl;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/* compiled from: TimeUpdateStrategy.java */
/* loaded from: classes11.dex */
public class lc extends mc {
    protected int b;
    protected long c;
    private String d;
    private Context e;

    public lc(Context context, int i, String str, mc mcVar) {
        super(mcVar);
        this.b = i;
        this.d = str;
        this.e = context;
    }

    @Override // com.amap.api.col.p0003sl.mc
    public void a(boolean z) {
        mc mcVar = this.f1779a;
        if (mcVar != null) {
            mcVar.a(z);
        }
        if (z) {
            String str = this.d;
            long currentTimeMillis = System.currentTimeMillis();
            this.c = currentTimeMillis;
            Context context = this.e;
            String valueOf = String.valueOf(currentTimeMillis);
            int i = ga.c;
            SharedPreferences.Editor edit = context.getSharedPreferences("AMSKLG_CFG", 0).edit();
            edit.putString(str, valueOf);
            edit.apply();
        }
    }

    @Override // com.amap.api.col.p0003sl.mc
    protected boolean c() {
        if (this.c == 0) {
            String b = ga.b(this.e, this.d);
            this.c = TextUtils.isEmpty(b) ? 0L : Long.parseLong(b);
        }
        return System.currentTimeMillis() - this.c >= ((long) this.b);
    }
}
