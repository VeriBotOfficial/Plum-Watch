package com.google.android.gms.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes15.dex */
public enum AdFormat {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    APP_OPEN_AD(6);

    private final int zzb;

    AdFormat(int r3) {
        this.zzb = r3;
    }

    public static AdFormat getAdFormat(int r5) {
        for (AdFormat adFormat : values()) {
            if (adFormat.getValue() == r5) {
                return adFormat;
            }
        }
        return null;
    }

    public int getValue() {
        return this.zzb;
    }
}
