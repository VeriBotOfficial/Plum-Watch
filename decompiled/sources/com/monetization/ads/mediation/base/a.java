package com.monetization.ads.mediation.base;

import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import com.monetization.ads.mediation.base.model.MediatedAdObject;

/* loaded from: classes17.dex */
public class a {
    public MediatedAdObject getAdObject() {
        return null;
    }

    public MediatedAdapterInfo getAdapterInfo() {
        return new MediatedAdapterInfo.Builder().build();
    }

    public boolean getShouldTrackImpressionAutomatically() {
        return true;
    }
}
