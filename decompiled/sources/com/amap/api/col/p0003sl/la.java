package com.amap.api.col.p0003sl;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* compiled from: CrashManager.java */
/* loaded from: classes11.dex */
public class la {

    /* renamed from: a, reason: collision with root package name */
    private l9 f1750a;

    /* compiled from: CrashManager.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        public static Map<String, la> f1751a = new HashMap();
    }

    private la(l9 l9Var) {
        this.f1750a = l9Var;
    }

    public static la a(l9 l9Var) {
        if (a.f1751a.get(l9Var.d()) == null) {
            a.f1751a.put(l9Var.d(), new la(l9Var));
        }
        return a.f1751a.get(l9Var.d());
    }

    public void a(Context context, boolean z, boolean z2) {
        oa.a(context, this.f1750a, "sckey", "" + z);
        if (z) {
            oa.a(context, this.f1750a, "scisf", "" + z2);
        }
    }
}
