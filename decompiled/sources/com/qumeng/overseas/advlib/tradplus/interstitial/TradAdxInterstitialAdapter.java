package com.qumeng.overseas.advlib.tradplus.interstitial;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.anythink.core.api.ATAdConst;
import com.qumeng.overseas.advlib.api.AiClkAdManager;
import com.qumeng.overseas.advlib.core.AdRequestParam;
import com.qumeng.overseas.advlib.core.IMultiAdObject;
import com.qumeng.overseas.advlib.core.IMultiAdRequest;
import com.qumeng.overseas.advlib.tradplus.TradAdxInitManager;
import com.tradplus.ads.base.adapter.TPBaseAdapter;
import com.tradplus.ads.base.adapter.TPInitMediation;
import com.tradplus.ads.base.adapter.TPLoadAdapterListener;
import com.tradplus.ads.base.adapter.TPShowAdapterListener;
import com.tradplus.ads.base.adapter.interstitial.TPInterstitialAdapter;
import com.tradplus.ads.base.common.TPError;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes17.dex */
public class TradAdxInterstitialAdapter extends TPInterstitialAdapter {
    private static final String TAG = "TradAdxInterstitialAdapter";
    private IMultiAdObject adCupAdObj;
    private boolean isBiddingLoaded;
    private boolean isReady;
    private String mAppId;
    private Context mContext;
    private String mPlacementId;
    private TPBaseAdapter.OnC2STokenListener onC2STokenListener;

    /* JADX INFO: Access modifiers changed from: private */
    public void startLoadAdWithBid(Context context, String str, final TPBaseAdapter.OnC2STokenListener onC2STokenListener) {
        AdRequestParam build = new AdRequestParam.Builder().adslotID(str).adType(2).adLoadListener(new AdRequestParam.ADLoadListener() { // from class: com.qumeng.overseas.advlib.tradplus.interstitial.TradAdxInterstitialAdapter.3
            @Override // com.qumeng.overseas.advlib.core.AdRequestParam.ADLoadListener
            public void onADLoaded(IMultiAdObject iMultiAdObject) {
                Log.d(TradAdxInterstitialAdapter.TAG, "onADLoaded: ");
                if (iMultiAdObject == null) {
                    TPBaseAdapter.OnC2STokenListener onC2STokenListener2 = onC2STokenListener;
                    if (onC2STokenListener2 != null) {
                        onC2STokenListener2.onC2SBiddingFailed("adFailed", "onADLoaded but iMultiAdObject is null");
                        return;
                    }
                    return;
                }
                if (onC2STokenListener != null) {
                    TradAdxInterstitialAdapter.this.adCupAdObj = iMultiAdObject;
                    TradAdxInterstitialAdapter.this.isReady = true;
                    TradAdxInterstitialAdapter.this.isBiddingLoaded = true;
                    double ecpm = iMultiAdObject.getECPM() / 100.0d;
                    ATAdConst.CURRENCY currency = ATAdConst.CURRENCY.USD;
                    if (ecpm <= 0.0d) {
                        TradAdxInterstitialAdapter.this.onC2STokenListener.onC2SBiddingFailed("", "ecpmLevel is Empty");
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("ECPM", Double.valueOf(ecpm));
                    onC2STokenListener.onC2SBiddingResult(hashMap);
                }
            }

            @Override // com.qumeng.overseas.advlib.core.AdRequestParam.ADLoadListener
            public void onAdFailed(String str2) {
                Log.d(TradAdxInterstitialAdapter.TAG, "onAdFailed: " + str2);
                TPBaseAdapter.OnC2STokenListener onC2STokenListener2 = onC2STokenListener;
                if (onC2STokenListener2 != null) {
                    onC2STokenListener2.onC2SBiddingFailed("", str2);
                }
            }
        }).build();
        IMultiAdRequest createAdRequest = AiClkAdManager.getInstance().createAdRequest();
        if (createAdRequest != null) {
            this.isReady = false;
            createAdRequest.invokeADV(build);
        } else if (onC2STokenListener != null) {
            onC2STokenListener.onC2SBiddingFailed("", "MultiAdRequest is null");
        }
    }

    public void getC2SBidding(Context context, Map<String, Object> map, Map<String, String> map2, TPBaseAdapter.OnC2STokenListener onC2STokenListener) {
        this.onC2STokenListener = onC2STokenListener;
        loadCustomAd(context, map, map2);
    }

    public String getNetworkName() {
        return TradAdxInitManager.getInstance().getNetworkVersionName();
    }

    public String getNetworkVersion() {
        return TradAdxInitManager.getInstance().getNetworkVersionCode();
    }

    public boolean isReady() {
        IMultiAdObject iMultiAdObject = this.adCupAdObj;
        return iMultiAdObject != null && iMultiAdObject.isReady();
    }

    public void loadCustomAd(final Context context, Map<String, Object> map, Map<String, String> map2) {
        Log.d(TAG, "invoke startBiddingRequest: ");
        if (map2.isEmpty() || !map2.containsKey("placementId") || !map2.containsKey("appId")) {
            TPBaseAdapter.OnC2STokenListener onC2STokenListener = this.onC2STokenListener;
            if (onC2STokenListener != null) {
                onC2STokenListener.onC2SBiddingFailed("", "Native Network or Custom Event adapter was configured incorrectly.");
                return;
            }
            return;
        }
        this.mAppId = map2.get("appId");
        this.mPlacementId = map2.get("placementId");
        if (this.onC2STokenListener == null || !this.isBiddingLoaded) {
            this.mContext = context;
            TradAdxInitManager.getInstance().initSDK(this.mContext, map, map2, new TPInitMediation.InitCallback() { // from class: com.qumeng.overseas.advlib.tradplus.interstitial.TradAdxInterstitialAdapter.2
                public void onFailed(String str, String str2) {
                    if (TradAdxInterstitialAdapter.this.onC2STokenListener != null) {
                        TradAdxInterstitialAdapter.this.onC2STokenListener.onC2SBiddingFailed(str, str2);
                    }
                }

                public void onSuccess() {
                    Log.d(TradAdxInterstitialAdapter.TAG, "init onSuccess and startLoadAd: ");
                    TradAdxInterstitialAdapter tradAdxInterstitialAdapter = TradAdxInterstitialAdapter.this;
                    tradAdxInterstitialAdapter.startLoadAdWithBid(context, tradAdxInterstitialAdapter.mPlacementId, TradAdxInterstitialAdapter.this.onC2STokenListener);
                }
            });
        } else {
            TPLoadAdapterListener tPLoadAdapterListener = ((TPInterstitialAdapter) this).mLoadAdapterListener;
            if (tPLoadAdapterListener != null) {
                tPLoadAdapterListener.loadAdapterLoadFailed((TPError) null);
            }
        }
    }

    public void showAd() {
        IMultiAdObject iMultiAdObject = this.adCupAdObj;
        if (iMultiAdObject != null) {
            Context context = this.mContext;
            if (context instanceof Activity) {
                iMultiAdObject.showInteractionAd((Activity) context, new AdRequestParam.ADInteractionListener() { // from class: com.qumeng.overseas.advlib.tradplus.interstitial.TradAdxInterstitialAdapter.1
                    @Override // com.qumeng.overseas.advlib.core.IMultiAdObject.ADEventListener
                    public void onADExposed() {
                        TPShowAdapterListener tPShowAdapterListener = ((TPInterstitialAdapter) TradAdxInterstitialAdapter.this).mShowListener;
                        if (tPShowAdapterListener != null) {
                            tPShowAdapterListener.onAdShown();
                        }
                    }

                    @Override // com.qumeng.overseas.advlib.core.IMultiAdObject.ADEventListener
                    public void onAdClick() {
                        TPShowAdapterListener tPShowAdapterListener = ((TPInterstitialAdapter) TradAdxInterstitialAdapter.this).mShowListener;
                        if (tPShowAdapterListener != null) {
                            tPShowAdapterListener.onAdClicked();
                        }
                    }

                    @Override // com.qumeng.overseas.advlib.core.AdRequestParam.ADInteractionListener
                    public void onAdClose(Bundle bundle) {
                        TPShowAdapterListener tPShowAdapterListener = ((TPInterstitialAdapter) TradAdxInterstitialAdapter.this).mShowListener;
                        if (tPShowAdapterListener != null) {
                            tPShowAdapterListener.onAdClosed();
                        }
                    }

                    @Override // com.qumeng.overseas.advlib.core.IMultiAdObject.ADEventListener
                    public void onAdFailed(String str) {
                        TradAdxInterstitialAdapter tradAdxInterstitialAdapter = TradAdxInterstitialAdapter.this;
                        TPLoadAdapterListener tPLoadAdapterListener = ((TPInterstitialAdapter) tradAdxInterstitialAdapter).mLoadAdapterListener;
                        if (tPLoadAdapterListener != null) {
                            tPLoadAdapterListener.loadAdapterLoadFailed(new TPError(str));
                        } else if (tradAdxInterstitialAdapter.onC2STokenListener != null) {
                            TradAdxInterstitialAdapter.this.onC2STokenListener.onC2SBiddingFailed("", str);
                        }
                    }
                });
            }
        }
    }
}
