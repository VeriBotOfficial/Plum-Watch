package com.qumeng.overseas.advlib.trdparty.unionset.adapter.topon.adapter;

import com.alex.AlexMaxConst;
import com.applovin.sdk.AppLovinMediationProvider;
import com.qumeng.overseas.advlib.__remote__.utils.n;
import com.qumeng.overseas.advlib.trdparty.unionset.common.h;
import com.secmtp.sdk.banner.api.ATBannerView;
import com.secmtp.sdk.core.api.ATAdInfo;
import com.secmtp.sdk.interstitial.api.ATInterstitial;
import com.secmtp.sdk.nativead.api.NativeAd;
import com.secmtp.sdk.rewardvideo.api.ATRewardVideoAd;
import com.secmtp.sdk.splashad.api.ATSplashAd;
import java.util.Map;

/* loaded from: classes17.dex */
public class f {
    protected static ATAdInfo a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof ATAdInfo) {
            return (ATAdInfo) obj;
        }
        if (obj instanceof NativeAd) {
            return ((NativeAd) obj).getAdInfo();
        }
        if (obj instanceof ATRewardVideoAd) {
            ATRewardVideoAd aTRewardVideoAd = (ATRewardVideoAd) obj;
            if (aTRewardVideoAd.checkAdStatus() != null) {
                return aTRewardVideoAd.checkAdStatus().getATTopAdInfo();
            }
            return null;
        }
        if (obj instanceof ATSplashAd) {
            ATSplashAd aTSplashAd = (ATSplashAd) obj;
            if (aTSplashAd.checkAdStatus() != null) {
                return aTSplashAd.checkAdStatus().getATTopAdInfo();
            }
            return null;
        }
        if (obj instanceof ATBannerView) {
            ATBannerView aTBannerView = (ATBannerView) obj;
            if (aTBannerView.checkAdStatus() != null) {
                return aTBannerView.checkAdStatus().getATTopAdInfo();
            }
            return null;
        }
        if (obj instanceof ATInterstitial) {
            ATInterstitial aTInterstitial = (ATInterstitial) obj;
            if (aTInterstitial.checkAdStatus() != null) {
                return aTInterstitial.checkAdStatus().getATTopAdInfo();
            }
        }
        return null;
    }

    public static boolean b(Object obj) {
        if (obj instanceof ATRewardVideoAd) {
            return ((ATRewardVideoAd) obj).isAdReady();
        }
        if (obj instanceof ATSplashAd) {
            return ((ATSplashAd) obj).isAdReady();
        }
        if (obj instanceof ATInterstitial) {
            return ((ATInterstitial) obj).isAdReady();
        }
        if (obj instanceof NativeAd) {
            return ((NativeAd) obj).isValid();
        }
        return true;
    }

    protected static void b(Object obj, Map<String, Object> map) {
        ATAdInfo a2 = a(obj);
        if (a2 == null || map == null) {
            return;
        }
        Double publisherRevenue = a2.getPublisherRevenue();
        double d = 0.0d;
        if (publisherRevenue != null && publisherRevenue.doubleValue() > 0.0d) {
            d = publisherRevenue.doubleValue();
        }
        map.put(h.y, Double.valueOf(d));
    }

    protected static void a(Object obj, Map<String, Object> map) {
        ATAdInfo a2 = a(obj);
        if (a2 == null || map == null) {
            return;
        }
        String networkName = a2.getNetworkName();
        String networkPlacementId = a2.getNetworkPlacementId();
        if (com.qumeng.overseas.advlib.trdparty.unionset.utils.b.b(networkName) && AppLovinMediationProvider.MAX.equalsIgnoreCase(networkName)) {
            Map extInfoMap = a2.getExtInfoMap();
            if (com.qumeng.overseas.advlib.trdparty.unionset.utils.b.b((Map<?, ?>) extInfoMap)) {
                if (extInfoMap.get("network_name") instanceof String) {
                    networkName = (String) extInfoMap.get("network_name");
                }
                if (com.qumeng.overseas.advlib.trdparty.unionset.utils.b.b(networkName) && networkName.toLowerCase().contains(com.qumeng.overseas.advlib.trdparty.unionset.network.c.w) && (extInfoMap.get("ad_unit_id") instanceof String)) {
                    networkPlacementId = (String) extInfoMap.get("ad_unit_id");
                } else if (extInfoMap.get(AlexMaxConst.KEY_NETWORK_PLACEMENT_ID) instanceof String) {
                    networkPlacementId = (String) extInfoMap.get(AlexMaxConst.KEY_NETWORK_PLACEMENT_ID);
                }
            }
        }
        n.c("ToponDataHelper", "opt_mediation_winner_adsrc : " + networkName, new Object[0]);
        n.c("ToponDataHelper", "opt_mediation_winner_slotid : " + networkPlacementId, new Object[0]);
        map.put(h.v, networkName);
        map.put(h.w, networkPlacementId);
        map.put(h.z, a2.getCountry());
    }
}
