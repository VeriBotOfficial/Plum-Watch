package com.anythink.basead.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;
import com.anythink.basead.ui.BaseATActivity;
import com.anythink.core.basead.a;
import com.anythink.core.basead.b.c;
import com.anythink.core.common.d.t;
import com.anythink.core.common.l.f.a.a;

/* loaded from: classes11.dex */
public class ATMixSplashActivity extends BaseATActivity {
    private String o;
    private FrameLayout p;

    public static void b(Activity activity, c cVar) {
        if (cVar == null) {
            return;
        }
        Context g = t.b().g();
        if (activity == null || activity.isFinishing()) {
            Log.i("anythink_BaseATActivity", "Activity is null");
        } else {
            g = activity;
        }
        Intent intent = new Intent(g, (Class<?>) ATMixSplashActivity.class);
        intent.putExtra(a.C0188a.d, cVar.d);
        if (!(g instanceof Activity)) {
            intent.addFlags(268435456);
        }
        g.startActivity(intent);
        if (activity == null || activity.isFinishing()) {
            return;
        }
        activity.overridePendingTransition(0, 0);
    }

    @Override // com.anythink.basead.ui.BaseATActivity
    protected final void a(Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(this);
        this.p = frameLayout;
        setContentView(frameLayout);
        try {
            this.o = getIntent().getStringExtra(a.C0188a.d);
            a.InterfaceC0200a c = com.anythink.basead.mixad.a.a().c(this.o);
            if (c != null) {
                c.a(this, this.p);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.basead.ui.BaseATActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
    }

    private void a() {
        this.o = getIntent().getStringExtra(a.C0188a.d);
    }

    private void b() {
        a.InterfaceC0200a c = com.anythink.basead.mixad.a.a().c(this.o);
        if (c != null) {
            c.a(this, this.p);
        }
    }
}
