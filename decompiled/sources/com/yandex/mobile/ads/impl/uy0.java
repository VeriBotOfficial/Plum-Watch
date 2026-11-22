package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.anythink.core.api.ATCustomRuleKeys;
import com.caverock.androidsvg.SVGParser;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider;
import com.monetization.ads.nativeads.CustomizableMediaView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class uy0 implements MediatedNativeAdViewProvider {

    /* renamed from: a, reason: collision with root package name */
    private final View f17096a;
    private final q71 b;

    public uy0(View nativeAdView, q71 nativeAdWeakViewProvider) {
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        Intrinsics.checkNotNullParameter(nativeAdWeakViewProvider, "nativeAdWeakViewProvider");
        this.f17096a = nativeAdView;
        this.b = nativeAdWeakViewProvider;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final View getNativeAdView() {
        return this.f17096a;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getAgeView() {
        View a2 = this.b.a(ATCustomRuleKeys.AGE);
        if (a2 instanceof TextView) {
            return (TextView) a2;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getBodyView() {
        View a2 = this.b.a("body");
        if (a2 instanceof TextView) {
            return (TextView) a2;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getCallToActionView() {
        View a2 = this.b.a("call_to_action");
        if (a2 instanceof TextView) {
            return (TextView) a2;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getDomainView() {
        View a2 = this.b.a("domain");
        if (a2 instanceof TextView) {
            return (TextView) a2;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final ImageView getFeedbackView() {
        View a2 = this.b.a("feedback");
        if (a2 instanceof ImageView) {
            return (ImageView) a2;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final ImageView getIconView() {
        View a2 = this.b.a("icon");
        if (a2 instanceof ImageView) {
            return (ImageView) a2;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final FrameLayout getMediaView() {
        View a2 = this.b.a(SVGParser.XML_STYLESHEET_ATTR_MEDIA);
        if (a2 instanceof CustomizableMediaView) {
            return (CustomizableMediaView) a2;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getPriceView() {
        View a2 = this.b.a("price");
        if (a2 instanceof TextView) {
            return (TextView) a2;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final View getRatingView() {
        return this.b.a("rating");
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getReviewCountView() {
        View a2 = this.b.a("review_count");
        if (a2 instanceof TextView) {
            return (TextView) a2;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getSponsoredView() {
        View a2 = this.b.a("sponsored");
        if (a2 instanceof TextView) {
            return (TextView) a2;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getTitleView() {
        View a2 = this.b.a("title");
        if (a2 instanceof TextView) {
            return (TextView) a2;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getWarningView() {
        View a2 = this.b.a("warning");
        if (a2 instanceof TextView) {
            return (TextView) a2;
        }
        return null;
    }
}
