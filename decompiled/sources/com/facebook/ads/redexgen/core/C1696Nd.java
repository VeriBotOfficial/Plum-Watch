package com.facebook.ads.redexgen.core;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.InterstitialAdListener;

/* renamed from: com.facebook.ads.redexgen.X.Nd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1696Nd implements InterstitialAdListener {
    public final /* synthetic */ AbstractC2503hy A00;
    public final /* synthetic */ C2453h4 A01;

    public C1696Nd(C2453h4 c2453h4, AbstractC2503hy abstractC2503hy) {
        this.A01 = c2453h4;
        this.A00 = abstractC2503hy;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad) {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C2445gv c2445gv;
        interstitialAdExtendedListener = this.A01.A00.A07;
        c2445gv = this.A01.A00.A08;
        interstitialAdExtendedListener.onAdLoaded(c2445gv.A6c());
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, AdError adError) {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C2445gv c2445gv;
        this.A01.A00.A01 = null;
        this.A00.A2A(false);
        interstitialAdExtendedListener = this.A01.A00.A07;
        c2445gv = this.A01.A00.A08;
        interstitialAdExtendedListener.onAdLoaded(c2445gv.A6c());
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(Ad ad) {
        C12936y c12936y;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C2445gv c2445gv;
        C12936y c12936y2;
        C12936y c12936y3;
        C12936y c12936y4;
        this.A01.A00.A04 = false;
        c12936y = this.A01.A00.A03;
        if (c12936y != null) {
            c12936y2 = this.A01.A00.A03;
            c12936y2.A0S(new C2455h6(this));
            c12936y3 = this.A01.A00.A03;
            c12936y3.A0N();
            c12936y4 = this.A01.A00.A03;
            c12936y4.A0K();
            this.A01.A00.A03 = null;
        }
        interstitialAdExtendedListener = this.A01.A00.A07;
        c2445gv = this.A01.A00.A08;
        interstitialAdExtendedListener.onInterstitialDismissed(c2445gv.A6c());
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDisplayed(Ad ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad) {
    }
}
