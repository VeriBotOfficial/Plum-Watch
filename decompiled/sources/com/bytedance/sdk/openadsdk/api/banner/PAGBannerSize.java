package com.bytedance.sdk.openadsdk.api.banner;

import android.content.Context;
import com.bytedance.sdk.openadsdk.utils.gff;

/* loaded from: classes14.dex */
public final class PAGBannerSize {
    private int fxn;
    private int gff = 1;
    private int hm;
    private int kg;
    public static final PAGBannerSize BANNER_W_320_H_50 = new PAGBannerSize(320, 50);
    public static final PAGBannerSize BANNER_W_300_H_250 = new PAGBannerSize(300, 250);
    public static final PAGBannerSize BANNER_W_728_H_90 = new PAGBannerSize(728, 90);

    public PAGBannerSize(int i, int i2) {
        this.fxn = i;
        this.kg = i2;
    }

    public int getWidth() {
        return this.fxn;
    }

    public int getHeight() {
        return this.kg;
    }

    public int getType() {
        return this.gff;
    }

    public int getMaxHeight() {
        return this.hm;
    }

    public static PAGBannerSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context context, int i) {
        int fxn = gff.fxn(context, i, 0);
        if (fxn == gff.fxn) {
            return new PAGBannerSize(-1, -1);
        }
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i, fxn);
        pAGBannerSize.gff = 2;
        return pAGBannerSize;
    }

    public static PAGBannerSize getCurrentOrientationInlineAdaptiveBannerAdSize(Context context, int i) {
        int fxn = gff.fxn(context, 0);
        if (fxn == gff.fxn) {
            return new PAGBannerSize(-1, -1);
        }
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i, 0);
        pAGBannerSize.hm = fxn;
        pAGBannerSize.gff = 3;
        return pAGBannerSize;
    }

    public static PAGBannerSize getInlineAdaptiveBannerAdSize(int i, int i2) {
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i, 0);
        pAGBannerSize.hm = i2;
        pAGBannerSize.gff = 3;
        return pAGBannerSize;
    }
}
