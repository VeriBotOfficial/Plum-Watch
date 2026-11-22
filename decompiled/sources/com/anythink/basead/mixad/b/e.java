package com.anythink.basead.mixad.b;

import android.view.View;
import com.anythink.basead.ui.thirdparty.ThirdPartyNativeTemplateView;
import com.anythink.core.api.ATNativeAdInfo;

/* loaded from: classes11.dex */
public final class e extends a implements com.anythink.core.common.l.c.a.d {
    View b;
    ATNativeAdInfo.AdPrepareInfo c;

    @Override // com.anythink.core.common.l.c.a.d
    public final View a() {
        if (this.f2889a != null && this.b == null) {
            View view = (View) this.f2889a.a();
            this.b = view;
            if (view instanceof ThirdPartyNativeTemplateView) {
                this.c = ((ThirdPartyNativeTemplateView) view).getAdPrepareInfo();
            }
        }
        return this.b;
    }

    @Override // com.anythink.core.common.l.c.a.d
    public final ATNativeAdInfo.AdPrepareInfo b() {
        return this.c;
    }
}
