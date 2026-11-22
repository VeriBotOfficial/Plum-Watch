package com.vivo.push.util;

import android.content.Context;
import java.util.HashMap;

/* compiled from: SystemCache.java */
/* loaded from: classes2.dex */
public final class af implements e {

    /* renamed from: a, reason: collision with root package name */
    private static final HashMap<String, Integer> f14151a = new HashMap<>();
    private static final HashMap<String, Long> b = new HashMap<>();
    private static final HashMap<String, String> c = new HashMap<>();
    private static af d;
    private Context e;
    private e f;
    private boolean g;

    private af(Context context) {
        this.g = false;
        this.e = context;
        this.g = a(context);
        t.d("SystemCache", "init status is " + this.g + ";  curCache is " + this.f);
    }

    public static synchronized af b(Context context) {
        af afVar;
        synchronized (af.class) {
            if (d == null) {
                d = new af(context.getApplicationContext());
            }
            afVar = d;
        }
        return afVar;
    }

    public final void a() {
        ae aeVar = new ae();
        if (aeVar.a(this.e)) {
            aeVar.a();
            t.d("SystemCache", "sp cache is cleared");
        }
    }

    @Override // com.vivo.push.util.e
    public final boolean a(Context context) {
        ac acVar = new ac();
        this.f = acVar;
        boolean a2 = acVar.a(context);
        if (!a2) {
            ae aeVar = new ae();
            this.f = aeVar;
            a2 = aeVar.a(context);
        }
        if (!a2) {
            this.f = null;
        }
        return a2;
    }

    @Override // com.vivo.push.util.e
    public final String a(String str, String str2) {
        e eVar;
        String str3 = c.get(str);
        return (str3 != null || (eVar = this.f) == null) ? str3 : eVar.a(str, str2);
    }
}
