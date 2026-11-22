package com.amap.api.col.p0003sl;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/* compiled from: MobileUpdateStrategy.java */
/* loaded from: classes11.dex */
public class jc extends mc {
    private Context c;
    private boolean d;
    private int e;
    private int f;
    private String b = "iKey";
    private int g = 0;

    public jc(Context context, boolean z, int i, int i2, String str) {
        a(context, z, i, i2, str, 0);
    }

    private void a(Context context, boolean z, int i, int i2, String str, int i3) {
        this.c = context;
        this.d = z;
        this.e = i;
        this.f = i2;
        this.b = str;
        this.g = i3;
    }

    @Override // com.amap.api.col.p0003sl.mc
    protected boolean c() {
        if (d9.g(this.c) == 1) {
            return true;
        }
        if (!this.d) {
            return false;
        }
        String b = ga.b(this.c, this.b);
        if (TextUtils.isEmpty(b)) {
            return true;
        }
        String[] split = b.split("\\|");
        if (split != null && split.length >= 2) {
            return !m9.a(System.currentTimeMillis(), "yyyyMMdd").equals(split[0]) || Integer.parseInt(split[1]) < this.f;
        }
        Context context = this.c;
        String str = this.b;
        SharedPreferences.Editor edit = context.getSharedPreferences("AMSKLG_CFG", 0).edit();
        edit.remove(str);
        edit.apply();
        return true;
    }

    @Override // com.amap.api.col.p0003sl.mc
    public int a() {
        int i;
        if ((d9.g(this.c) == 1 || (i = this.e) <= 0) && ((i = this.g) <= 0 || i >= Integer.MAX_VALUE)) {
            i = Integer.MAX_VALUE;
        }
        mc mcVar = this.f1779a;
        return mcVar != null ? Math.max(i, mcVar.a()) : i;
    }

    @Override // com.amap.api.col.p0003sl.mc
    public void a(int i) {
        if (d9.g(this.c) == 1) {
            return;
        }
        String a2 = m9.a(System.currentTimeMillis(), "yyyyMMdd");
        String b = ga.b(this.c, this.b);
        if (!TextUtils.isEmpty(b)) {
            String[] split = b.split("\\|");
            if (split != null && split.length >= 2) {
                if (a2.equals(split[0])) {
                    i += Integer.parseInt(split[1]);
                }
            } else {
                Context context = this.c;
                String str = this.b;
                SharedPreferences.Editor edit = context.getSharedPreferences("AMSKLG_CFG", 0).edit();
                edit.remove(str);
                edit.apply();
            }
        }
        Context context2 = this.c;
        String str2 = this.b;
        String str3 = a2 + "|" + i;
        SharedPreferences.Editor edit2 = context2.getSharedPreferences("AMSKLG_CFG", 0).edit();
        edit2.putString(str2, str3);
        edit2.apply();
    }

    public jc(Context context, boolean z, int i, int i2, String str, int i3) {
        a(context, z, i, i2, str, i3);
    }
}
