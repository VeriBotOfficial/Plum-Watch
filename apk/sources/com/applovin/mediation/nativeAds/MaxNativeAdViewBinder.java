package com.applovin.mediation.nativeAds;

import android.view.View;

/* JADX INFO: loaded from: classes16.dex */
public class MaxNativeAdViewBinder {
    protected final int advertiserTextViewId;
    protected final int bodyTextViewId;
    protected final int callToActionButtonId;
    protected final int iconContentViewId;
    protected final int iconImageViewId;
    protected final int layoutResourceId;
    protected final View mainView;
    protected final int mediaContentFrameLayoutId;
    protected final int mediaContentViewGroupId;
    protected final int optionsContentFrameLayoutId;
    protected final int optionsContentViewGroupId;
    protected final int starRatingContentViewGroupId;
    protected final String templateType;
    protected final int titleTextViewId;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f6643a;
        private final int b;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int l;
        private int m;
        private String n;

        public Builder(View view) {
            this(-1, view);
        }

        public MaxNativeAdViewBinder build() {
            return new MaxNativeAdViewBinder(this.f6643a, this.b, this.c, this.d, this.e, this.f, this.g, this.j, this.h, this.i, this.k, this.l, this.m, this.n);
        }

        public Builder setAdvertiserTextViewId(int r1) {
            this.d = r1;
            return this;
        }

        public Builder setBodyTextViewId(int r1) {
            this.e = r1;
            return this;
        }

        public Builder setCallToActionButtonId(int r1) {
            this.m = r1;
            return this;
        }

        @Deprecated
        protected Builder setIconContentViewId(int r1) {
            this.g = r1;
            return this;
        }

        public Builder setIconImageViewId(int r1) {
            this.f = r1;
            return this;
        }

        @Deprecated
        protected Builder setMediaContentFrameLayoutId(int r1) {
            this.l = r1;
            return this;
        }

        public Builder setMediaContentViewGroupId(int r1) {
            this.k = r1;
            return this;
        }

        @Deprecated
        protected Builder setOptionsContentFrameLayoutId(int r1) {
            this.i = r1;
            return this;
        }

        public Builder setOptionsContentViewGroupId(int r1) {
            this.h = r1;
            return this;
        }

        public Builder setStarRatingContentViewGroupId(int r1) {
            this.j = r1;
            return this;
        }

        protected Builder setTemplateType(String str) {
            this.n = str;
            return this;
        }

        public Builder setTitleTextViewId(int r1) {
            this.c = r1;
            return this;
        }

        public Builder(int r2) {
            this(r2, null);
        }

        private Builder(int r2, View view) {
            this.c = -1;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.b = r2;
            this.f6643a = view;
        }
    }

    private MaxNativeAdViewBinder(View view, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, String str) {
        this.mainView = view;
        this.layoutResourceId = r2;
        this.titleTextViewId = r3;
        this.advertiserTextViewId = r4;
        this.bodyTextViewId = r5;
        this.iconImageViewId = r6;
        this.iconContentViewId = r7;
        this.starRatingContentViewGroupId = r8;
        this.optionsContentViewGroupId = r9;
        this.optionsContentFrameLayoutId = r10;
        this.mediaContentViewGroupId = r11;
        this.mediaContentFrameLayoutId = r12;
        this.callToActionButtonId = r13;
        this.templateType = str;
    }
}
