package com.baidu.mshield.x6.b;

import android.content.Context;
import android.content.SharedPreferences;
import com.baidu.mshield.x6.f.f;

/* compiled from: DnaResultPref.java */
/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferences f8470a;

    public a(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("msgzpfc", 4);
            this.f8470a = sharedPreferences;
            sharedPreferences.edit();
        } catch (Throwable th) {
            f.b(th);
        }
    }

    public String a(String str) {
        return this.f8470a.getString(str, "");
    }
}
