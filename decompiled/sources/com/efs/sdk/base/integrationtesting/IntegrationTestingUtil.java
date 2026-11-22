package com.efs.sdk.base.integrationtesting;

/* loaded from: classes14.dex */
public class IntegrationTestingUtil {
    private static boolean sIsInPeriod = false;

    public static void setIntegrationTestingInPeriod(boolean z) {
        sIsInPeriod = z;
    }

    public static boolean isIntegrationTestingInPeriod() {
        return sIsInPeriod;
    }
}
