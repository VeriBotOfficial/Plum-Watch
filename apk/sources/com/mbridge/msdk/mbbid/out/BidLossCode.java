package com.mbridge.msdk.mbbid.out;

/* JADX INFO: loaded from: classes2.dex */
public class BidLossCode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f11791a;

    private BidLossCode(int r1) {
        f11791a = r1;
    }

    public static BidLossCode bidPriceNotHighest() {
        return new BidLossCode(102);
    }

    public static BidLossCode bidTimeOut() {
        return new BidLossCode(2);
    }

    public static BidLossCode bidWinButNotShow() {
        return new BidLossCode(3001);
    }

    public int getCurrentCode() {
        return f11791a;
    }
}
