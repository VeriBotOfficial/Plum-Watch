package com.iab.omid.library.unity3d.adsession.media;

import com.applovin.mediation.adapters.google.BuildConfig;
import com.yandex.mobile.ads.instream.InstreamAdBreakType;

/* loaded from: classes17.dex */
public enum Position {
    PREROLL(InstreamAdBreakType.PREROLL),
    MIDROLL(InstreamAdBreakType.MIDROLL),
    POSTROLL(InstreamAdBreakType.POSTROLL),
    STANDALONE(BuildConfig.FLAVOR);

    private final String position;

    Position(String str) {
        this.position = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.position;
    }
}
