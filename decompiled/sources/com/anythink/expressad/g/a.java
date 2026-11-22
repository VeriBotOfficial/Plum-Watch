package com.anythink.expressad.g;

import android.content.Context;
import com.anythink.expressad.foundation.g.f.n;
import java.util.Map;

/* loaded from: classes12.dex */
public final class a implements com.anythink.expressad.b {

    /* renamed from: a, reason: collision with root package name */
    public static Map<String, String> f4956a;
    private Context b;
    private boolean c = false;

    private void a() {
        this.c = false;
        try {
            n.a(this.b);
            com.anythink.expressad.foundation.b.b.a().a(f4956a, this.b);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.anythink.expressad.b
    public final void a(Map<String, String> map, Context context) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        f4956a = map;
        this.c = false;
        try {
            n.a(applicationContext);
            com.anythink.expressad.foundation.b.b.a().a(f4956a, this.b);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
