package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class w80 {
    public static final w80 c;
    public static final w80 d;
    public static final w80 e;
    public static final w80 f;
    private static final /* synthetic */ w80[] g;
    private final String b;

    static {
        w80 w80Var = new w80(0, "AD_POD_SKIP", "AdPodSkipFeatureToggle");
        w80 w80Var2 = new w80(1, "INTERSTITIAL_PRELOADING", "InterstitialPreloading");
        w80 w80Var3 = new w80(2, "REWARDED_PRELOADING", "RewardedPreloading");
        w80 w80Var4 = new w80(3, "FIRST_VIDEO_PRELOADING_STRATEGY", "FirstVideoPreloadingStrategyFeatureToggle");
        c = w80Var4;
        w80 w80Var5 = new w80(4, "TESTING_NEW_ADAPTER", "TestingNewAdapterFeatureToggle");
        d = w80Var5;
        w80 w80Var6 = new w80(5, "FALLBACK_FOR_VIDEO", "FallbackForVideoFeatureToggle");
        e = w80Var6;
        w80 w80Var7 = new w80(6, "QRCODE", "QrcodeFeatureToggle");
        f = w80Var7;
        w80[] w80VarArr = {w80Var, w80Var2, w80Var3, w80Var4, w80Var5, w80Var6, w80Var7};
        g = w80VarArr;
        EnumEntriesKt.enumEntries(w80VarArr);
    }

    public static w80 valueOf(String str) {
        return (w80) Enum.valueOf(w80.class, str);
    }

    public static w80[] values() {
        return (w80[]) g.clone();
    }

    private w80(int i, String str, String str2) {
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }
}
