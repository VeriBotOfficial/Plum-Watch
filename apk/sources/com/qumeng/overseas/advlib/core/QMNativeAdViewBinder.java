package com.qumeng.overseas.advlib.core;

import android.os.Bundle;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class QMNativeAdViewBinder {
    protected final int adLogoTextViewId;
    protected final int adLogoViewGroupId;
    protected final View adViewContainer;
    protected final int advertiserTextViewId;
    protected final int bodyTextViewId;
    protected final int callToActionButtonId;
    protected final int closeViewId;
    protected final int domainTextViewId;
    public Bundle extraBundle;
    protected final int iconContentViewId;
    protected final int iconImageViewId;
    protected final int layoutResourceId;
    protected final int mediaContentFrameLayoutId;
    protected final int mediaContentViewGroupId;
    protected final int optionsContentFrameLayoutId;
    protected final int optionsContentViewGroupId;
    protected final int starRatingContentViewGroupId;
    protected final String templateType;
    protected final int titleTextViewId;
    protected final int warningTextViewId;

    public static class Builder {
        private int adLogoTextViewId;
        private int adLogoViewGroupId;
        private View adViewContainer;
        private int advertiserTextViewId;
        private int bodyTextViewId;
        private int callToActionButtonId;
        private int closeViewId;
        private int domainTextViewId;
        public Bundle extraBundle;
        private int iconContentViewId;
        private int iconImageViewId;
        private int layoutResourceId;
        private int mediaContentFrameLayoutId;
        private int mediaContentViewGroupId;
        private int optionsContentFrameLayoutId;
        private int optionsContentViewGroupId;
        private int starRatingContentViewGroupId;
        private String templateType;
        private int titleTextViewId;
        private int warningTextViewId;

        public Builder(View view) {
            this(view, -1);
        }

        public QMNativeAdViewBinder build() {
            return new QMNativeAdViewBinder(this.adViewContainer, this.layoutResourceId, this.titleTextViewId, this.advertiserTextViewId, this.bodyTextViewId, this.iconImageViewId, this.adLogoTextViewId, this.adLogoViewGroupId, this.iconContentViewId, this.starRatingContentViewGroupId, this.optionsContentViewGroupId, this.optionsContentFrameLayoutId, this.mediaContentViewGroupId, this.mediaContentFrameLayoutId, this.callToActionButtonId, this.closeViewId, this.domainTextViewId, this.warningTextViewId, this.templateType, this.extraBundle);
        }

        public Builder setAdLogoTextViewId(int r1) {
            this.adLogoTextViewId = r1;
            return this;
        }

        public Builder setAdLogoViewGroupId(int r1) {
            this.adLogoViewGroupId = r1;
            return this;
        }

        public Builder setAdvertiserTextViewId(int r1) {
            this.advertiserTextViewId = r1;
            return this;
        }

        public Builder setBodyTextViewId(int r1) {
            this.bodyTextViewId = r1;
            return this;
        }

        public Builder setCallToActionButtonId(int r1) {
            this.callToActionButtonId = r1;
            return this;
        }

        public Builder setCloseViewId(int r1) {
            this.closeViewId = r1;
            return this;
        }

        public Builder setDomainTextViewId(int r1) {
            this.domainTextViewId = r1;
            return this;
        }

        public Builder setExtraBundle(Bundle bundle) {
            this.extraBundle = bundle;
            return this;
        }

        public Builder setIconContentViewId(int r1) {
            this.iconContentViewId = r1;
            return this;
        }

        public Builder setIconImageViewId(int r1) {
            this.iconImageViewId = r1;
            return this;
        }

        public Builder setMediaContentFrameLayoutId(int r1) {
            this.mediaContentFrameLayoutId = r1;
            return this;
        }

        public Builder setMediaContentViewGroupId(int r1) {
            this.mediaContentViewGroupId = r1;
            return this;
        }

        public Builder setOptionsContentFrameLayoutId(int r1) {
            this.optionsContentFrameLayoutId = r1;
            return this;
        }

        public Builder setOptionsContentViewGroupId(int r1) {
            this.optionsContentViewGroupId = r1;
            return this;
        }

        public Builder setStarRatingContentViewGroupId(int r1) {
            this.starRatingContentViewGroupId = r1;
            return this;
        }

        public Builder setTemplateType(String str) {
            this.templateType = str;
            return this;
        }

        public Builder setTitleTextViewId(int r1) {
            this.titleTextViewId = r1;
            return this;
        }

        public Builder setWarningTextViewId(int r1) {
            this.warningTextViewId = r1;
            return this;
        }

        public Builder(int r2) {
            this(null, r2);
        }

        public Builder(View view, int r3) {
            this.titleTextViewId = -1;
            this.advertiserTextViewId = -1;
            this.bodyTextViewId = -1;
            this.iconImageViewId = -1;
            this.adLogoTextViewId = -1;
            this.adLogoViewGroupId = -1;
            this.iconContentViewId = -1;
            this.starRatingContentViewGroupId = -1;
            this.optionsContentViewGroupId = -1;
            this.optionsContentFrameLayoutId = -1;
            this.mediaContentViewGroupId = -1;
            this.mediaContentFrameLayoutId = -1;
            this.callToActionButtonId = -1;
            this.adViewContainer = view;
            this.layoutResourceId = r3;
        }
    }

    public QMNativeAdViewBinder(View view, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, String str, Bundle bundle) {
        this.adViewContainer = view;
        this.layoutResourceId = r4;
        this.titleTextViewId = r5;
        this.advertiserTextViewId = r6;
        this.bodyTextViewId = r7;
        this.iconImageViewId = r8;
        this.adLogoTextViewId = r9;
        this.adLogoViewGroupId = r10;
        this.iconContentViewId = r11;
        this.starRatingContentViewGroupId = r12;
        this.optionsContentViewGroupId = r13;
        this.optionsContentFrameLayoutId = r14;
        this.mediaContentViewGroupId = r15;
        this.mediaContentFrameLayoutId = r16;
        this.callToActionButtonId = r17;
        this.closeViewId = r18;
        this.domainTextViewId = r19;
        this.warningTextViewId = r20;
        this.templateType = str;
        this.extraBundle = bundle;
    }

    public int getAdLogoTextViewId() {
        return this.adLogoTextViewId;
    }

    public int getAdLogoViewGroupId() {
        return this.adLogoViewGroupId;
    }

    public View getAdViewContainer() {
        return this.adViewContainer;
    }

    public int getAdvertiserTextViewId() {
        return this.advertiserTextViewId;
    }

    public int getBodyTextViewId() {
        return this.bodyTextViewId;
    }

    public int getCallToActionButtonId() {
        return this.callToActionButtonId;
    }

    public int getCloseViewId() {
        return this.closeViewId;
    }

    public int getDomainTextViewId() {
        return this.domainTextViewId;
    }

    public Bundle getExtraBundle() {
        return this.extraBundle;
    }

    public int getIconContentViewId() {
        return this.iconContentViewId;
    }

    public int getIconImageViewId() {
        return this.iconImageViewId;
    }

    public int getLayoutResourceId() {
        return this.layoutResourceId;
    }

    public int getMediaContentFrameLayoutId() {
        return this.mediaContentFrameLayoutId;
    }

    public int getMediaContentViewGroupId() {
        return this.mediaContentViewGroupId;
    }

    public int getOptionsContentFrameLayoutId() {
        return this.optionsContentFrameLayoutId;
    }

    public int getOptionsContentViewGroupId() {
        return this.optionsContentViewGroupId;
    }

    public int getStarRatingContentViewGroupId() {
        return this.starRatingContentViewGroupId;
    }

    public String getTemplateType() {
        return this.templateType;
    }

    public int getTitleTextViewId() {
        return this.titleTextViewId;
    }

    public int getWarningTextViewId() {
        return this.warningTextViewId;
    }
}
