package sg.bigo.ads.core.adview;

import android.view.View;
import sg.bigo.ads.common.utils.u;

/* loaded from: classes9.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.api.a<?> f19943a;

    protected c(sg.bigo.ads.api.a<?> aVar) {
        this.f19943a = aVar;
    }

    protected final void a(int i) {
        this.f19943a.setTag(Integer.valueOf(i));
    }

    protected void a(View view) {
        u.a(view, this.f19943a, null, -1);
    }

    public boolean a(int i, int i2) {
        return u.a(this.f19943a, i, i2);
    }
}
