package com.qumeng.overseas.advlib.trdparty.unionset.adapter.topon.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.qumeng.overseas.advlib.__remote__.utils.n;
import com.qumeng.overseas.advlib.core.AppInformation;
import com.qumeng.overseas.advlib.core.k;
import com.qumeng.overseas.advlib.trdparty.unionset.utils.h;
import com.secmtp.sdk.banner.api.ATBannerView;
import com.secmtp.sdk.core.api.ATAdInfo;
import com.secmtp.sdk.interstitial.api.ATInterstitial;
import com.secmtp.sdk.nativead.api.ATNativeMaterial;
import com.secmtp.sdk.nativead.api.NativeAd;
import com.secmtp.sdk.rewardvideo.api.ATRewardVideoAd;
import com.secmtp.sdk.splashad.api.ATSplashAd;
import java.util.Collections;
import java.util.List;

/* loaded from: classes17.dex */
public class c implements k {
    private static final String y = "TopOnAdModelWrapper";
    private final Object w;
    private h x;

    class a implements h.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k.a f13329a;

        a(k.a aVar) {
            this.f13329a = aVar;
        }

        @Override // com.qumeng.overseas.advlib.trdparty.unionset.utils.h.a
        public void onVideoCompleted(int i, String str) {
            n.b(c.y, "VideoStatusHelper onVideoCompleted", new Object[0]);
            k.a aVar = this.f13329a;
            if (aVar != null) {
                aVar.onVideoAdComplete();
            }
            c.this.x.g();
        }

        @Override // com.qumeng.overseas.advlib.trdparty.unionset.utils.h.a
        public void onVideoPlayStart(int i) {
            n.b(c.y, "VideoStatusHelper onVideoPlayStart", new Object[0]);
            k.a aVar = this.f13329a;
            if (aVar != null) {
                aVar.onVideoAdPlay();
            }
        }

        @Override // com.qumeng.overseas.advlib.trdparty.unionset.utils.h.a
        public void onVideoProgress(int i) {
            n.b(c.y, "VideoStatusHelper onVideoProgress = " + i, new Object[0]);
            k.a aVar = this.f13329a;
            if (aVar != null) {
                aVar.onVideoProgress(i);
            }
        }
    }

    public c(Object obj) {
        this.w = obj;
    }

    private ATNativeMaterial E() {
        if (g()) {
            return ((NativeAd) this.w).getAdMaterial();
        }
        return null;
    }

    @Override // com.qumeng.overseas.advlib.core.j
    public String A() {
        return String.valueOf(this.w.hashCode());
    }

    @Override // com.qumeng.overseas.advlib.core.j
    public Object C() {
        return null;
    }

    @Override // com.qumeng.overseas.advlib.core.j
    public double D() {
        ATAdInfo a2 = f.a(this.w);
        if (a2 != null) {
            return a2.getEcpm();
        }
        return 0.0d;
    }

    @Override // com.qumeng.overseas.advlib.core.j
    public View b(Context context) {
        if (E() != null) {
            return com.qumeng.overseas.advlib.trdparty.unionset.adapter.topon.adapter.a.b(context, E());
        }
        return null;
    }

    @Override // com.qumeng.overseas.advlib.core.j
    public AppInformation c() {
        return null;
    }

    @Override // com.qumeng.overseas.advlib.core.j
    public String d() {
        return "";
    }

    @Override // com.qumeng.overseas.advlib.core.j
    public boolean f() {
        return false;
    }

    @Override // com.qumeng.overseas.advlib.core.j
    public boolean g() {
        try {
            return this.w instanceof NativeAd;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.qumeng.overseas.advlib.core.j
    public String getAdFrom() {
        return E() != null ? E().getAdFrom() : "";
    }

    @Override // com.qumeng.overseas.advlib.core.j
    public String getMainImageUrl() {
        return E() != null ? E().getMainImageUrl() : "";
    }

    @Override // com.qumeng.overseas.advlib.core.j
    public String getTitle() {
        return E() != null ? E().getTitle() : "";
    }

    @Override // com.qumeng.overseas.advlib.core.j
    public int getVideoDuration() {
        if (E() != null) {
            return (int) E().getVideoDuration();
        }
        return 0;
    }

    @Override // com.qumeng.overseas.advlib.core.j
    public String getWarning() {
        return E() != null ? E().getWarning() : "";
    }

    @Override // com.qumeng.overseas.advlib.core.j
    public Pair<Integer, Integer> h() {
        if (E() != null) {
            return com.qumeng.overseas.advlib.trdparty.unionset.adapter.topon.adapter.a.a(E());
        }
        return null;
    }

    @Override // com.qumeng.overseas.advlib.core.j
    public int i() {
        if (E() == null) {
            return 0;
        }
        int nativeAdInteractionType = E().getNativeAdInteractionType();
        if (nativeAdInteractionType == 1) {
            return 2;
        }
        if (nativeAdInteractionType != 2) {
            return nativeAdInteractionType != 3 ? 0 : 4;
        }
        return 1;
    }

    @Override // com.qumeng.overseas.advlib.core.j
    public List<String> j() {
        return E() != null ? E().getImageUrlList() : Collections.emptyList();
    }

    @Override // com.qumeng.overseas.advlib.core.j
    public String k() {
        return "";
    }

    @Override // com.qumeng.overseas.advlib.core.j
    public String m() {
        return E() != null ? E().getDescriptionText() : "";
    }

    @Override // com.qumeng.overseas.advlib.core.j
    public boolean n() {
        try {
            return this.w instanceof ATBannerView;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.qumeng.overseas.advlib.core.j
    public String p() {
        return E() != null ? E().getDomain() : "";
    }

    @Override // com.qumeng.overseas.advlib.core.j
    public boolean q() {
        try {
            return this.w instanceof ATRewardVideoAd;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.qumeng.overseas.advlib.core.k
    public String r() {
        return E() != null ? E().getAdvertiserName() : "";
    }

    @Override // com.qumeng.overseas.advlib.core.j
    public boolean s() {
        return !f.b(this.w);
    }

    @Override // com.qumeng.overseas.advlib.core.j
    public int u() {
        return 0;
    }

    @Override // com.qumeng.overseas.advlib.core.j
    public boolean v() {
        try {
            return this.w instanceof ATSplashAd;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.qumeng.overseas.advlib.core.j
    public boolean w() {
        try {
            return this.w instanceof ATInterstitial;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.qumeng.overseas.advlib.core.j
    public Pair<Integer, Integer> x() {
        return null;
    }

    @Override // com.qumeng.overseas.advlib.core.j
    public int a(boolean z) {
        if (E() == null) {
            return 0;
        }
        String adType = E().getAdType();
        adType.hashCode();
        if (adType.equals("1")) {
            return 4;
        }
        return !adType.equals("2") ? 0 : 2;
    }

    @Override // com.qumeng.overseas.advlib.core.j
    public String o() {
        return (!g() || ((NativeAd) this.w).getAdMaterial() == null) ? "" : ((NativeAd) this.w).getAdMaterial().getIconImageUrl();
    }

    @Override // com.qumeng.overseas.advlib.core.j
    public String z() {
        ATAdInfo a2 = f.a(this.w);
        if (a2 == null || TextUtils.isEmpty(a2.getNetworkName())) {
            return "";
        }
        String lowerCase = a2.getNetworkName().toLowerCase();
        n.c(y, "networkName: " + lowerCase, new Object[0]);
        String a3 = a("", lowerCase);
        return com.qumeng.overseas.advlib.trdparty.unionset.utils.b.a(a3) ? "https://image-cdn.adseye.com/direct_client/topon_50.png " : a3;
    }

    @Override // com.qumeng.overseas.advlib.core.j
    public View a(Context context) {
        if (E() != null) {
            return com.qumeng.overseas.advlib.trdparty.unionset.adapter.topon.adapter.a.a(context, E());
        }
        return null;
    }

    @Override // com.qumeng.overseas.advlib.core.j
    public View a(Context context, ViewGroup viewGroup) {
        if (E() != null) {
            return com.qumeng.overseas.advlib.trdparty.unionset.adapter.topon.adapter.a.a(context, E(), viewGroup);
        }
        return null;
    }

    @Override // com.qumeng.overseas.advlib.core.k, com.qumeng.overseas.advlib.core.j
    public String a() {
        if (E() != null) {
            return E().getCallToActionText();
        }
        return super.a();
    }

    public void a(int i, View view, k.a aVar) {
        if (view == null) {
            n.b(y, "VideoStatusHelper mediaView = null", new Object[0]);
            return;
        }
        if (this.x != null) {
            n.b(y, "VideoStatusHelper videoStatusHelper = " + this.x, new Object[0]);
            this.x.g();
            this.x = null;
        }
        h hVar = new h(i, view);
        this.x = hVar;
        hVar.a(new a(aVar));
        this.x.f();
    }
}
