package com.qumeng.overseas.advlib.core;

import android.os.Bundle;
import android.view.View;

/* loaded from: classes17.dex */
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

        public Builder setAdLogoTextViewId(int i) {
            this.adLogoTextViewId = i;
            return this;
        }

        public Builder setAdLogoViewGroupId(int i) {
            this.adLogoViewGroupId = i;
            return this;
        }

        public Builder setAdvertiserTextViewId(int i) {
            this.advertiserTextViewId = i;
            return this;
        }

        public Builder setBodyTextViewId(int i) {
            this.bodyTextViewId = i;
            return this;
        }

        public Builder setCallToActionButtonId(int i) {
            this.callToActionButtonId = i;
            return this;
        }

        public Builder setCloseViewId(int i) {
            this.closeViewId = i;
            return this;
        }

        public Builder setDomainTextViewId(int i) {
            this.domainTextViewId = i;
            return this;
        }

        public Builder setExtraBundle(Bundle bundle) {
            this.extraBundle = bundle;
            return this;
        }

        public Builder setIconContentViewId(int i) {
            this.iconContentViewId = i;
            return this;
        }

        public Builder setIconImageViewId(int i) {
            this.iconImageViewId = i;
            return this;
        }

        public Builder setMediaContentFrameLayoutId(int i) {
            this.mediaContentFrameLayoutId = i;
            return this;
        }

        public Builder setMediaContentViewGroupId(int i) {
            this.mediaContentViewGroupId = i;
            return this;
        }

        public Builder setOptionsContentFrameLayoutId(int i) {
            this.optionsContentFrameLayoutId = i;
            return this;
        }

        public Builder setOptionsContentViewGroupId(int i) {
            this.optionsContentViewGroupId = i;
            return this;
        }

        public Builder setStarRatingContentViewGroupId(int i) {
            this.starRatingContentViewGroupId = i;
            return this;
        }

        public Builder setTemplateType(String str) {
            this.templateType = str;
            return this;
        }

        public Builder setTitleTextViewId(int i) {
            this.titleTextViewId = i;
            return this;
        }

        public Builder setWarningTextViewId(int i) {
            this.warningTextViewId = i;
            return this;
        }

        public Builder(int i) {
            this(null, i);
        }

        public Builder(View view, int i) {
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
            this.layoutResourceId = i;
        }
    }

    public QMNativeAdViewBinder(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, String str, Bundle bundle) {
        this.adViewContainer = view;
        this.layoutResourceId = i;
        this.titleTextViewId = i2;
        this.advertiserTextViewId = i3;
        this.bodyTextViewId = i4;
        this.iconImageViewId = i5;
        this.adLogoTextViewId = i6;
        this.adLogoViewGroupId = i7;
        this.iconContentViewId = i8;
        this.starRatingContentViewGroupId = i9;
        this.optionsContentViewGroupId = i10;
        this.optionsContentFrameLayoutId = i11;
        this.mediaContentViewGroupId = i12;
        this.mediaContentFrameLayoutId = i13;
        this.callToActionButtonId = i14;
        this.closeViewId = i15;
        this.domainTextViewId = i16;
        this.warningTextViewId = i17;
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
