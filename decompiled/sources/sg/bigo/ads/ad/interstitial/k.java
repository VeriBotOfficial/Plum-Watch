package sg.bigo.ads.ad.interstitial;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.InterstitialAd;
import sg.bigo.ads.api.b.d;
import sg.bigo.ads.api.core.c;

/* loaded from: classes7.dex */
public abstract class k<U extends sg.bigo.ads.api.core.c> extends sg.bigo.ads.ad.d<InterstitialAd, U> implements InterstitialAd {
    protected b w;
    private long x;

    public interface a<T extends k> {
        T getAdInstance(sg.bigo.ads.api.core.g gVar);
    }

    interface b {
        void C();

        void b(String str);
    }

    public k(sg.bigo.ads.api.core.g gVar) {
        super(gVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.app.Activity] */
    private void a(Activity activity, boolean z) {
        sg.bigo.ads.api.a.h hVar;
        a(activity == 0, z);
        if (activity != 0) {
            b(activity);
        }
        sg.bigo.ads.core.d.b.a(f());
        if (isExpired()) {
            a(2000, "The ad is expired.");
            return;
        }
        if (this.h) {
            a(2000, "The ad is destroyed.");
            return;
        }
        if (n()) {
            a(2003, "This ad cannot be shown repeatedly");
            return;
        }
        try {
            U f = f();
            if (f instanceof sg.bigo.ads.api.core.o) {
                sg.bigo.ads.api.core.o oVar = (sg.bigo.ads.api.core.o) f;
                if (oVar.aQ()) {
                    File file = new File(oVar.b(this.b.e));
                    if (!file.exists() && !new File(file.getParentFile(), sg.bigo.ads.common.utils.f.c(file.getName())).exists()) {
                        sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.c) f, new AdError(2010, "resource clear."), true);
                    }
                }
            }
        } catch (Exception unused) {
        }
        if (activity != 0) {
            a(1);
        }
        if (activity == 0 && (hVar = sg.bigo.ads.api.a.i.f19524a) != null && hVar.n().a(16)) {
            activity = sg.bigo.ads.common.f.b.b();
            a(2);
        }
        if (activity == 0) {
            activity = this.b.e;
        }
        this.S = this.R.a();
        if (this.T != null) {
            this.T.c(this.S);
        }
        a(activity);
    }

    protected abstract Class<? extends sg.bigo.ads.controller.e.b<?>> A();

    public void a(int i, int i2) {
        k();
    }

    protected final void a(int i, long j) {
        sg.bigo.ads.core.d.b.a(this.b.f19537a, i, this.x > 0 ? SystemClock.elapsedRealtime() - this.x : 0L, j, this);
    }

    protected void a(Context context) {
        if (sg.bigo.ads.controller.landing.d.a(context, A(), this, f() != null && f().ar())) {
            return;
        }
        a(2004, "This ad cannot be open");
    }

    public final void a(b bVar) {
        this.w = bVar;
    }

    @Override // sg.bigo.ads.ad.c, sg.bigo.ads.api.b.d
    public final void a(d.a<InterstitialAd> aVar) {
        super.a(aVar);
        b(aVar);
    }

    protected void b(Activity activity) {
    }

    protected abstract void b(d.a<InterstitialAd> aVar);

    @Override // sg.bigo.ads.ad.d, sg.bigo.ads.ad.c
    public void destroyInMainThread() {
        super.destroyInMainThread();
        this.w = null;
    }

    public final void e(String str) {
        a(2003, str);
    }

    @Override // sg.bigo.ads.api.InterstitialAd
    public void show() {
        a((Activity) null, true);
    }

    @Override // sg.bigo.ads.api.InterstitialAd
    public void show(Activity activity) {
        a(activity, false);
    }

    public int x() {
        if (y()) {
            return this.b.b.c();
        }
        return 0;
    }

    protected abstract boolean y();

    public final void z() {
        t();
        j();
        this.x = SystemClock.elapsedRealtime();
        sg.bigo.ads.core.d.b.a(this.b.f19537a, this);
    }
}
