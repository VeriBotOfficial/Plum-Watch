package com.efs.sdk.base.samplingwhitelist;

/* JADX INFO: loaded from: classes11.dex */
public class SamplingWhiteListUtil {
    private static boolean sHitWL = false;

    public static void setHitWL(boolean z) {
        sHitWL = z;
    }

    public static boolean isHitWL() {
        return sHitWL;
    }
}
