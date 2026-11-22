package com.vivo.push.util;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: SpCache.java */
/* loaded from: classes2.dex */
public final class ae implements e {

    /* renamed from: a, reason: collision with root package name */
    private static String f14150a = "SpCache";
    private static String b = "com.vivo.push.cache";
    private SharedPreferences c;

    @Override // com.vivo.push.util.e
    public final boolean a(Context context) {
        if (this.c != null) {
            return true;
        }
        this.c = context.getSharedPreferences(b, 0);
        return true;
    }

    @Override // com.vivo.push.util.e
    public final String a(String str, String str2) {
        String string = this.c.getString(str, str2);
        t.d(f14150a, "getString " + str + " is " + string);
        return string;
    }

    public final void a() {
        SharedPreferences.Editor edit = this.c.edit();
        if (edit != null) {
            edit.clear();
            c.a(edit);
        }
        t.d(f14150a, "system cache is cleared");
    }
}
