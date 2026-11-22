package sg.bigo.ads.api.core;

import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdLoadListener;

/* loaded from: classes7.dex */
public final class f<T extends Ad> implements AdLoadListener<T> {

    /* renamed from: a, reason: collision with root package name */
    private AdLoadListener<T> f19534a;

    public f() {
    }

    public f(AdLoadListener<T> adLoadListener) {
        this.f19534a = adLoadListener;
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onAdLoaded(final T t) {
        if (this.f19534a != null) {
            sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.api.core.f.2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    f.this.f19534a.onAdLoaded(t);
                }
            });
        }
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onError(final AdError adError) {
        if (this.f19534a != null) {
            sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.api.core.f.1
                @Override // java.lang.Runnable
                public final void run() {
                    f.this.f19534a.onError(adError);
                }
            });
        }
    }
}
