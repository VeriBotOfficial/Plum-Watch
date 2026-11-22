package com.qumeng.overseas.advlib.core;

/* loaded from: classes17.dex */
public class AdMostRequestParam {
    private int bannerType;
    private boolean isFixed;
    private boolean isRoundedMode;
    private int nativeType;
    private boolean preventClicks;

    public static class Builder {
        private int bannerType;
        private boolean isFixed;
        private boolean isRoundedMode;
        private int nativeType;
        private boolean preventClicks;

        public AdMostRequestParam build() {
            AdMostRequestParam adMostRequestParam = new AdMostRequestParam();
            adMostRequestParam.bannerType = this.bannerType;
            adMostRequestParam.nativeType = this.nativeType;
            adMostRequestParam.isRoundedMode = this.isRoundedMode;
            adMostRequestParam.isFixed = this.isFixed;
            adMostRequestParam.preventClicks = this.preventClicks;
            return adMostRequestParam;
        }

        public Builder setBannerType(int i) {
            this.bannerType = i;
            return this;
        }

        public Builder setFixed(boolean z) {
            this.isFixed = z;
            return this;
        }

        public Builder setNativeType(int i) {
            this.nativeType = i;
            return this;
        }

        public Builder setPreventClicks(boolean z) {
            this.preventClicks = z;
            return this;
        }

        public Builder setRoundedMode(boolean z) {
            this.isRoundedMode = z;
            return this;
        }
    }

    public int getBannerType() {
        return this.bannerType;
    }

    public int getNativeType() {
        return this.nativeType;
    }

    public boolean isFixed() {
        return this.isFixed;
    }

    public boolean isPreventClicks() {
        return this.preventClicks;
    }

    public boolean isRoundedMode() {
        return this.isRoundedMode;
    }
}
