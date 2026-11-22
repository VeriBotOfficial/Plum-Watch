package sg.bigo.ads.ad.interstitial.e.b;

import android.content.Context;
import android.view.View;
import sg.bigo.ads.ad.interstitial.e.d;
import sg.bigo.ads.ad.interstitial.e.j;
import sg.bigo.ads.common.view.RealtimeBlurLinearLayout;

/* loaded from: classes7.dex */
public final class a extends RealtimeBlurLinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public d f19211a;

    public a(Context context) {
        this(context, (byte) 0);
    }

    private a(Context context, byte b) {
        this(context, (char) 0);
    }

    private a(Context context, char c) {
        super(context, null, 0);
    }

    public final d getIconAdsRenderStyle() {
        return this.f19211a;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        d dVar = this.f19211a;
        if ((dVar instanceof j) && dVar.b() == 4) {
            int defaultSize = (int) ((r0 * 2) + (((getDefaultSize(Integer.MIN_VALUE, i) - (((j) this.f19211a).i * 3.0f)) / 4.0f) * 3.0f));
            setMeasuredDimension(defaultSize, getMeasuredHeight());
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(defaultSize, 1073741824);
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                measureChildWithMargins(getChildAt(i3), makeMeasureSpec, 0, i2, 0);
            }
        }
    }
}
