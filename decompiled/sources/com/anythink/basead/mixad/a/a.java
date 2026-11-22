package com.anythink.basead.mixad.a;

import android.content.Context;
import android.view.View;
import com.anythink.basead.ui.thirdparty.ThirdPartySplashBannerATView;
import com.anythink.basead.ui.thirdparty.a;
import com.anythink.core.api.IATBaseAdAdapter;
import com.anythink.core.common.l.b.a.b;
import com.anythink.core.common.l.b.a.c;

/* loaded from: classes11.dex */
public final class a implements com.anythink.core.common.l.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    private Context f2887a;
    private b b;
    private IATBaseAdAdapter c;
    private int d;

    public a(com.anythink.core.common.l.d.a aVar) {
        if (aVar == null) {
            return;
        }
        this.f2887a = aVar.a();
        this.b = aVar.i();
        this.c = aVar.f();
        this.d = aVar.a("countdown");
    }

    @Override // com.anythink.core.common.l.b.a.a
    public final c a() {
        if (this.f2887a == null) {
            return null;
        }
        IATBaseAdAdapter iATBaseAdAdapter = this.c;
        View mixView = iATBaseAdAdapter != null ? iATBaseAdAdapter.getMixView() : null;
        if (mixView == null) {
            return null;
        }
        ThirdPartySplashBannerATView thirdPartySplashBannerATView = new ThirdPartySplashBannerATView(this.f2887a);
        thirdPartySplashBannerATView.addBannerView(mixView);
        thirdPartySplashBannerATView.addCountDownView(this.d, new AnonymousClass1());
        return thirdPartySplashBannerATView;
    }

    private c a(View view) {
        ThirdPartySplashBannerATView thirdPartySplashBannerATView = new ThirdPartySplashBannerATView(this.f2887a);
        thirdPartySplashBannerATView.addBannerView(view);
        thirdPartySplashBannerATView.addCountDownView(this.d, new AnonymousClass1());
        return thirdPartySplashBannerATView;
    }

    /* renamed from: com.anythink.basead.mixad.a.a$1, reason: invalid class name */
    final class AnonymousClass1 implements a.InterfaceC0181a {
        AnonymousClass1() {
        }

        @Override // com.anythink.basead.ui.thirdparty.a.InterfaceC0181a
        public final void a(int i) {
            if (a.this.b != null) {
                a.this.b.a(i);
                a.this.b = null;
            }
            if (a.this.c != null) {
                a.this.c.destory();
            }
        }
    }
}
