package com.anythink.network.pangle;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.MediationInitCallback;
import com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public class PangleATInterstitialAdapter extends CustomInterstitialAdapter {
    private PAGInterstitialAd e;
    private String f;
    private Map<String, Object> g;
    private final String d = getClass().getSimpleName();

    /* renamed from: a, reason: collision with root package name */
    String f5871a = "";
    PAGInterstitialAdLoadListener b = new PAGInterstitialAdLoadListener() { // from class: com.anythink.network.pangle.PangleATInterstitialAdapter.1
        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.bh
        public final void onError(int i, String str) {
            if (PangleATInterstitialAdapter.this.mLoadListener != null) {
                PangleATInterstitialAdapter.this.mLoadListener.onAdLoadError(String.valueOf(i), str);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        public final void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
            PangleATInterstitialAdapter.this.e = pAGInterstitialAd;
            try {
                Map<String, Object> mediaExtraInfo = PangleATInterstitialAdapter.this.e.getMediaExtraInfo();
                if (mediaExtraInfo != null) {
                    if (PangleATInterstitialAdapter.this.g == null) {
                        PangleATInterstitialAdapter.this.g = new HashMap(3);
                    }
                    PangleATInterstitialAdapter.this.g.putAll(mediaExtraInfo);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (PangleATInterstitialAdapter.this.mLoadListener != null) {
                PangleATInterstitialAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }
    };
    PAGInterstitialAdInteractionListener c = new PAGInterstitialAdInteractionListener() { // from class: com.anythink.network.pangle.PangleATInterstitialAdapter.2
        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public final void onAdShowed() {
            try {
                PangleATInitManager.getInstance().a(PangleATInterstitialAdapter.this.getTrackingInfo().z(), new WeakReference(PangleATInterstitialAdapter.this.e));
            } catch (Throwable unused) {
            }
            if (PangleATInterstitialAdapter.this.mImpressListener != null) {
                PangleATInterstitialAdapter.this.mImpressListener.onInterstitialAdShow();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public final void onAdClicked() {
            if (PangleATInterstitialAdapter.this.mImpressListener != null) {
                PangleATInterstitialAdapter.this.mImpressListener.onInterstitialAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public final void onAdDismissed() {
            if (PangleATInterstitialAdapter.this.mImpressListener != null) {
                PangleATInterstitialAdapter.this.mImpressListener.onInterstitialAdClose();
            }
        }
    };

    /* renamed from: com.anythink.network.pangle.PangleATInterstitialAdapter$3, reason: invalid class name */
    final class AnonymousClass3 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f5874a;

        AnonymousClass3(Map map) {
            this.f5874a = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            PAGInterstitialRequest pAGInterstitialRequest = new PAGInterstitialRequest();
            if (!TextUtils.isEmpty(PangleATInterstitialAdapter.this.f)) {
                pAGInterstitialRequest.setAdString(PangleATInterstitialAdapter.this.f);
            }
            PangleATInitManager.setPangleUserData(this.f5874a);
            PAGInterstitialAd.loadAd(PangleATInterstitialAdapter.this.f5871a, pAGInterstitialRequest, PangleATInterstitialAdapter.this.b);
        }
    }

    private void a(Map<String, Object> map) {
        postOnMainThread(new AnonymousClass3(map));
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public boolean isAdReady() {
        return this.e != null;
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter
    public void show(Activity activity) {
        PAGInterstitialAd pAGInterstitialAd = this.e;
        if (pAGInterstitialAd == null || activity == null) {
            return;
        }
        pAGInterstitialAd.setAdInteractionListener(this.c);
        this.e.show(activity);
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return PangleATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, final Map<String, Object> map, Map<String, Object> map2) {
        String stringFromMap = ATInitMediation.getStringFromMap(map, "app_id");
        this.f5871a = ATInitMediation.getStringFromMap(map, "slot_id");
        if (TextUtils.isEmpty(stringFromMap) || TextUtils.isEmpty(this.f5871a)) {
            if (this.mLoadListener != null) {
                this.mLoadListener.onAdLoadError("", "app_id or slot_id is empty!");
            }
        } else {
            this.f = ATInitMediation.getStringFromMap(map, "payload");
            PangleATInitManager.getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.anythink.network.pangle.PangleATInterstitialAdapter.4
                @Override // com.anythink.core.api.MediationInitCallback
                public final void onSuccess() {
                    try {
                        PangleATInterstitialAdapter.b(PangleATInterstitialAdapter.this, map);
                    } catch (Throwable th) {
                        if (PangleATInterstitialAdapter.this.mLoadListener != null) {
                            PangleATInterstitialAdapter.this.mLoadListener.onAdLoadError("", th.getMessage());
                        }
                    }
                }

                @Override // com.anythink.core.api.MediationInitCallback
                public final void onFail(String str) {
                    if (PangleATInterstitialAdapter.this.mLoadListener != null) {
                        PangleATInterstitialAdapter.this.mLoadListener.onAdLoadError("", str);
                    }
                }
            });
        }
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter, com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        PAGInterstitialAd pAGInterstitialAd = this.e;
        if (pAGInterstitialAd != null) {
            pAGInterstitialAd.setAdInteractionListener(null);
            this.e = null;
        }
        this.c = null;
        this.b = null;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f5871a;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return PangleATInitManager.getInstance().getNetworkVersion();
    }

    private static int a(Context context, float f) {
        float f2 = context.getResources().getDisplayMetrics().density;
        if (f2 <= 0.0f) {
            f2 = 1.0f;
        }
        return (int) ((f / f2) + 0.5f);
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public ATInitMediation getMediationInitManager() {
        return PangleATInitManager.getInstance();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        this.f5871a = ATInitMediation.getStringFromMap(map, "slot_id");
        PangleATInitManager.getInstance().a(context, map, map2, aTBidRequestInfoListener);
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z, boolean z2) {
        return PangleATInitManager.getInstance().setUserDataConsent(context, z, z2);
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.g;
    }

    static /* synthetic */ void b(PangleATInterstitialAdapter pangleATInterstitialAdapter, Map map) {
        pangleATInterstitialAdapter.postOnMainThread(pangleATInterstitialAdapter.new AnonymousClass3(map));
    }
}
