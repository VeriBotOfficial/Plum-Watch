package com.applovin.mediation.ads;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.b8;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.s;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxAdViewConfiguration;
import com.applovin.sdk.AppLovinSdk;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* loaded from: classes12.dex */
public class MaxAdView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private MaxAdViewImpl f6634a;
    private View b;
    private int c;

    public MaxAdView(String str) {
        this(str, (MaxAdViewConfiguration) null);
    }

    private void a(String str, MaxAdFormat maxAdFormat, MaxAdViewConfiguration maxAdViewConfiguration, int i, Context context) {
        View view = new View(context.getApplicationContext());
        this.b = view;
        view.setBackgroundColor(0);
        addView(this.b);
        this.b.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.c = getVisibility();
        this.f6634a = new MaxAdViewImpl(str.trim(), maxAdFormat, maxAdViewConfiguration, this, this.b, context);
        setGravity(i);
        if (getBackground() instanceof ColorDrawable) {
            setBackgroundColor(((ColorDrawable) getBackground()).getColor());
        }
        super.setBackgroundColor(0);
    }

    public void destroy() {
        this.f6634a.logApiCall("destroy()");
        this.f6634a.destroy();
    }

    public MaxAdFormat getAdFormat() {
        return this.f6634a.getAdFormat();
    }

    public String getAdUnitId() {
        return this.f6634a.getAdUnitId();
    }

    public String getPlacement() {
        this.f6634a.logApiCall("getPlacement()");
        return this.f6634a.getPlacement();
    }

    public void loadAd() {
        this.f6634a.logApiCall("loadAd()");
        this.f6634a.loadAd();
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (isInEditMode()) {
            return;
        }
        this.f6634a.logApiCall("onWindowVisibilityChanged(visibility=" + i + Separators.RPAREN);
        if (this.f6634a != null && b8.a(this.c, i)) {
            this.f6634a.onWindowVisibilityChanged(i);
        }
        this.c = i;
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f6634a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + Separators.RPAREN);
        this.f6634a.setAdReviewListener(maxAdReviewListener);
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        this.f6634a.logApiCall("setAlpha(alpha=" + f + Separators.RPAREN);
        View view = this.b;
        if (view != null) {
            view.setAlpha(f);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f6634a.logApiCall("setBackgroundColor(color=" + i + Separators.RPAREN);
        MaxAdViewImpl maxAdViewImpl = this.f6634a;
        if (maxAdViewImpl != null) {
            maxAdViewImpl.setPublisherBackgroundColor(i);
        }
        View view = this.b;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setCustomData(String str) {
        this.f6634a.logApiCall("setCustomData(value=" + str + Separators.RPAREN);
        this.f6634a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        this.f6634a.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + Separators.RPAREN);
        this.f6634a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdViewAdListener maxAdViewAdListener) {
        this.f6634a.logApiCall("setListener(listener=" + maxAdViewAdListener + Separators.RPAREN);
        this.f6634a.setListener(maxAdViewAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f6634a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + Separators.RPAREN);
        this.f6634a.setLocalExtraParameter(str, obj);
    }

    public void setPlacement(String str) {
        this.f6634a.logApiCall("setPlacement(placement=" + str + Separators.RPAREN);
        this.f6634a.setPlacement(str);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f6634a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + Separators.RPAREN);
        this.f6634a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f6634a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + Separators.RPAREN);
        this.f6634a.setRevenueListener(maxAdRevenueListener);
    }

    public void startAutoRefresh() {
        this.f6634a.logApiCall("startAutoRefresh()");
        this.f6634a.startAutoRefresh();
    }

    public void stopAutoRefresh() {
        this.f6634a.logApiCall("stopAutoRefresh()");
        this.f6634a.stopAutoRefresh();
    }

    @Override // android.view.View
    public String toString() {
        MaxAdViewImpl maxAdViewImpl = this.f6634a;
        return maxAdViewImpl != null ? maxAdViewImpl.toString() : "MaxAdView";
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat) {
        this(str, maxAdFormat, (MaxAdViewConfiguration) null);
    }

    public MaxAdView(String str, MaxAdViewConfiguration maxAdViewConfiguration) {
        this(str, s.a(k.o()), maxAdViewConfiguration);
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat, MaxAdViewConfiguration maxAdViewConfiguration) {
        super(k.o());
        a.logApiCall("MaxAdView", "MaxAdView(adUnitId=" + str + ", adFormat=" + maxAdFormat + ", configuration=" + maxAdViewConfiguration + Separators.RPAREN);
        a(str, maxAdFormat, maxAdViewConfiguration, 49, k.o());
    }

    public MaxAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaxAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MaxAdFormat a2;
        String a3 = s.a(context, attributeSet, AppLovinAdView.NAMESPACE, HandleInvocationsFromAdViewer.KEY_AD_UNIT_ID);
        String a4 = s.a(context, attributeSet, AppLovinAdView.NAMESPACE, "adFormat");
        if (StringUtils.isValidString(a4)) {
            a2 = MaxAdFormat.formatFromString(a4);
        } else {
            a2 = s.a(context);
        }
        MaxAdFormat maxAdFormat = a2;
        int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 49);
        if (a3 != null) {
            if (!TextUtils.isEmpty(a3)) {
                if (isInEditMode()) {
                    a(context);
                    return;
                } else {
                    a(a3, maxAdFormat, null, attributeIntValue, context);
                    return;
                }
            }
            throw new IllegalArgumentException("Empty ad unit ID specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    private void a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        TextView textView = new TextView(context);
        textView.setBackgroundColor(Color.rgb(220, 220, 220));
        textView.setTextColor(-16777216);
        textView.setText("AppLovin MAX Ad");
        textView.setGravity(17);
        addView(textView, i, i2);
    }

    @Deprecated
    public MaxAdView(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    @Deprecated
    public MaxAdView(String str, AppLovinSdk appLovinSdk, Context context) {
        this(str, s.a(context), context);
    }

    @Deprecated
    public MaxAdView(String str, MaxAdFormat maxAdFormat, Context context) {
        this(str, maxAdFormat, AppLovinSdk.getInstance(context), context);
    }

    @Deprecated
    public MaxAdView(String str, MaxAdFormat maxAdFormat, AppLovinSdk appLovinSdk, Context context) {
        super(context);
        a.logApiCall("MaxAdView", "MaxAdView(adUnitId=" + str + ", adFormat=" + maxAdFormat + Separators.RPAREN);
        a(str, maxAdFormat, null, 49, context);
    }
}
