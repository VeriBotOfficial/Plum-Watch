package sg.bigo.ads.ad.interstitial.e;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import sg.bigo.ads.ad.interstitial.e.a.b;

/* loaded from: classes7.dex */
public final class b extends sg.bigo.ads.common.view.a.b {

    /* renamed from: a, reason: collision with root package name */
    protected final int f19210a;
    protected final boolean b;
    protected final Drawable c;

    public b(float f, float f2, float f3, float f4, Rect rect, float f5, boolean[] zArr, b.a aVar) {
        super(f, f2, f3, f4, rect, aVar.b, aVar.c, f5, zArr);
        int i = aVar.b;
        this.f19210a = i;
        boolean z = aVar.f19208a;
        this.b = z;
        if (z) {
            this.c = null;
        } else {
            Drawable a2 = sg.bigo.ads.common.utils.d.a(f, f2, f3, f4, rect, i);
            this.c = this.n != null ? new LayerDrawable(new Drawable[]{a2, this.n}) : a2;
        }
    }

    public b(float f, float f2, b.a aVar) {
        this(f, f, f, f, null, f2, null, aVar);
    }

    public final Drawable a() {
        return this.c;
    }
}
