package sg.bigo.ads.api;

import android.content.Context;
import android.util.AttributeSet;
import sg.bigo.ads.core.adview.g;

/* loaded from: classes7.dex */
public class NativeAdView extends a<g> {
    public NativeAdView(Context context) {
        super(context);
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // sg.bigo.ads.api.a
    protected final /* synthetic */ g a() {
        return new g(this);
    }
}
