package com.iab.omid.library.bigosg;

import android.content.Context;
import com.iab.omid.library.bigosg.b.d;
import com.iab.omid.library.bigosg.b.f;
import com.iab.omid.library.bigosg.d.e;

/* loaded from: classes17.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f10898a;

    private void b(Context context) {
        e.a(context, "Application Context cannot be null");
    }

    String a() {
        return "1.3.0-Bigosg";
    }

    void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        f.a().a(context);
        com.iab.omid.library.bigosg.b.b.a().a(context);
        com.iab.omid.library.bigosg.d.b.a(context);
        d.a().a(context);
    }

    void a(boolean z) {
        this.f10898a = z;
    }

    boolean a(String str) {
        return true;
    }

    boolean b() {
        return this.f10898a;
    }
}
