package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import com.anythink.core.common.d.j;
import com.applovin.sdk.AppLovinMediationProvider;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class mz0 {
    private static final String d = "com.yandex.mobile.ads.mediation";
    public static final /* synthetic */ int e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final String f16293a;
    private final String b;
    private final List<b> c;

    public mz0(String name, String id2, List<b> adapters) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(adapters, "adapters");
        this.f16293a = name;
        this.b = id2;
        this.c = adapters;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz0)) {
            return false;
        }
        mz0 mz0Var = (mz0) obj;
        return Intrinsics.areEqual(this.f16293a, mz0Var.f16293a) && Intrinsics.areEqual(this.b, mz0Var.b) && Intrinsics.areEqual(this.c, mz0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + v3.a(this.b, this.f16293a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "MediationNetwork(name=" + this.f16293a + ", id=" + this.b + ", adapters=" + this.c + Separators.RPAREN;
    }

    public final String d() {
        return this.f16293a;
    }

    public final String c() {
        return this.b;
    }

    public final List<b> b() {
        return this.c;
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f16294a;
        private final String b;

        public b(String format, String className) {
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(className, "className");
            this.f16294a = format;
            this.b = className;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f16294a, bVar.f16294a) && Intrinsics.areEqual(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f16294a.hashCode() * 31);
        }

        public final String toString() {
            return "MediationAdapterSignature(format=" + this.f16294a + ", className=" + this.b + Separators.RPAREN;
        }

        public final String b() {
            return this.f16294a;
        }

        public final String a() {
            return this.b;
        }
    }

    public static final class a {
        public static List a() {
            return CollectionsKt.listOf((Object[]) new mz0[]{new mz0("AppLovin", com.qumeng.overseas.advlib.trdparty.unionset.network.c.w, CollectionsKt.listOf((Object[]) new b[]{new b(j.n.c, a("banner", "AppLovinBannerAdapter")), new b("Interstitial", a(com.anythink.expressad.foundation.g.a.f.d, "AppLovinInterstitialAdapter")), new b("Rewarded", a("rewarded", "AppLovinRewardedAdapter"))})), new mz0("AppLovinMax", "applovin_max", CollectionsKt.listOf((Object[]) new b[]{new b(j.n.c, a("banner", "AppLovinMaxBannerAdapter")), new b("Interstitial", a(com.anythink.expressad.foundation.g.a.f.d, "AppLovinMaxInterstitialAdapter")), new b("Rewarded", a("rewarded", "AppLovinMaxRewardedAdapter"))})), new mz0("Appnext", "appnext", CollectionsKt.listOf((Object[]) new b[]{new b(j.n.c, a("banner", "AppNextBannerAdapter")), new b("Interstitial", a(com.anythink.expressad.foundation.g.a.f.d, "AppNextInterstitialAdapter")), new b(j.n.f3693a, a("nativeads", "AppNextNativeAdapter")), new b("Rewarded", a("rewarded", "AppNextRewardedAdapter"))})), new mz0("BigoAds", "bigoads", CollectionsKt.listOf((Object[]) new b[]{new b(j.n.c, a("banner", "BigoAdsBannerAdapter")), new b("Interstitial", a(com.anythink.expressad.foundation.g.a.f.d, "BigoAdsInterstitialAdapter")), new b(j.n.f3693a, a("nativeads", "BigoAdsNativeAdapter")), new b("Rewarded", a("rewarded", "BigoAdsRewardedAdapter"))})), new mz0("Chartboost", "chartboost", CollectionsKt.listOf((Object[]) new b[]{new b(j.n.c, a("banner", "ChartboostBannerAdapter")), new b("Interstitial", a(com.anythink.expressad.foundation.g.a.f.d, "ChartboostInterstitialAdapter")), new b("Rewarded", a("rewarded", "ChartboostRewardedAdapter"))})), new mz0("AdMob", "admob", CollectionsKt.listOf((Object[]) new b[]{new b("AppOpen", a("appopen", "AdMobAppOpenAdAdapter")), new b(j.n.c, a("banner", "AdMobBannerAdapter")), new b("Interstitial", a(com.anythink.expressad.foundation.g.a.f.d, "AdMobInterstitialAdapter")), new b(j.n.f3693a, a("nativeads", "AdMobNativeAdapter")), new b("Rewarded", a("rewarded", "AdMobRewardedAdapter"))})), new mz0("AdManager", "admanager", CollectionsKt.listOf((Object[]) new b[]{new b(j.n.c, a("banner", "AdManagerBannerAdapter")), new b("Interstitial", a(com.anythink.expressad.foundation.g.a.f.d, "AdManagerInterstitialAdapter")), new b(j.n.f3693a, a("nativeads", "AdManagerNativeAdapter")), new b("Rewarded", a("rewarded", "AdManagerRewardedAdapter"))})), new mz0("InMobi", "inmobi", CollectionsKt.listOf((Object[]) new b[]{new b(j.n.c, a("banner", "InMobiBannerAdapter")), new b("Interstitial", a(com.anythink.expressad.foundation.g.a.f.d, "InMobiInterstitialAdapter")), new b("Rewarded", a("rewarded", "InMobiRewardedAdapter"))})), new mz0("IronSource", AppLovinMediationProvider.IRONSOURCE, CollectionsKt.listOf((Object[]) new b[]{new b(j.n.c, a("banner", "IronSourceBannerAdapter")), new b("Interstitial", a(com.anythink.expressad.foundation.g.a.f.d, "IronSourceInterstitialAdapter")), new b("Rewarded", a("rewarded", "IronSourceRewardedAdapter"))})), new mz0("Mintegral", "mintegral", CollectionsKt.listOf((Object[]) new b[]{new b(j.n.c, a("banner", "MintegralBannerAdapter")), new b("Interstitial", a(com.anythink.expressad.foundation.g.a.f.d, "MintegralInterstitialAdapter")), new b(j.n.f3693a, a("nativeads", "MintegralNativeAdapter")), new b("Rewarded", a("rewarded", "MintegralRewardedAdapter"))})), new mz0("MyTarget", "mytarget", CollectionsKt.listOf((Object[]) new b[]{new b(j.n.c, a("banner", "MyTargetBannerAdapter")), new b("Interstitial", a(com.anythink.expressad.foundation.g.a.f.d, "MyTargetInterstitialAdapter")), new b(j.n.f3693a, a("nativeads", "MyTargetNativeAdapter")), new b("Rewarded", a("rewarded", "MyTargetRewardedAdapter"))})), new mz0("Pangle", com.qumeng.overseas.advlib.trdparty.unionset.network.c.v, CollectionsKt.listOf((Object[]) new b[]{new b("Interstitial", a(com.anythink.expressad.foundation.g.a.f.d, "PangleInterstitialAdapter")), new b("Rewarded", a("rewarded", "PangleRewardedAdapter"))})), new mz0("StartApp", "startapp", CollectionsKt.listOf((Object[]) new b[]{new b(j.n.c, a("banner", "StartAppBannerAdapter")), new b("Interstitial", a(com.anythink.expressad.foundation.g.a.f.d, "StartAppInterstitialAdapter")), new b(j.n.f3693a, a("nativeads", "StartAppNativeAdapter")), new b("Rewarded", a("rewarded", "StartAppRewardedAdapter"))})), new mz0("TapJoy", "tapjoy", CollectionsKt.listOf((Object[]) new b[]{new b("Interstitial", a(com.anythink.expressad.foundation.g.a.f.d, "TapJoyInterstitialAdapter")), new b("Rewarded", a("rewarded", "TapJoyRewardedAdapter"))})), new mz0("UnityAds", "unityads", CollectionsKt.listOf((Object[]) new b[]{new b(j.n.c, a("banner", "UnityAdsBannerAdapter")), new b("Interstitial", a(com.anythink.expressad.foundation.g.a.f.d, "UnityAdsInterstitialAdapter")), new b("Rewarded", a("rewarded", "UnityAdsRewardedAdapter"))})), new mz0("Vungle", "vungle", CollectionsKt.listOf((Object[]) new b[]{new b(j.n.c, a("banner", "VungleBannerAdapter")), new b("Interstitial", a(com.anythink.expressad.foundation.g.a.f.d, "VungleInterstitialAdapter")), new b("Rewarded", a("rewarded", "VungleRewardedAdapter"))})), new mz0("zMaticoo", "zmaticoo", CollectionsKt.listOf((Object[]) new b[]{new b(j.n.c, a("banner", "MaticooBannerAdapter")), new b("Interstitial", a(com.anythink.expressad.foundation.g.a.f.d, "MaticooInterstitialAdapter")), new b("Rewarded", a("rewarded", "MaticooRewardedAdapter"))}))});
        }

        private static String a(String str, String str2) {
            return mz0.d + "." + str + "." + str2;
        }
    }
}
