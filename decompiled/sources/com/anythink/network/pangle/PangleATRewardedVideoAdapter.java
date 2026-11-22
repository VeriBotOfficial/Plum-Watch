package com.anythink.network.pangle;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.MediationInitCallback;
import com.anythink.network.pangle.PangleATConst;
import com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public class PangleATRewardedVideoAdapter extends CustomRewardVideoAdapter {
    boolean b;
    private PAGRewardedAd f;
    private Map<String, Object> g;
    private String h;
    private final String e = getClass().getSimpleName();

    /* renamed from: a, reason: collision with root package name */
    String f5878a = "";
    PAGRewardedAdLoadListener c = new PAGRewardedAdLoadListener() { // from class: com.anythink.network.pangle.PangleATRewardedVideoAdapter.1
        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.bh
        public final void onError(int i, String str) {
            if (PangleATRewardedVideoAdapter.this.mLoadListener != null) {
                PangleATRewardedVideoAdapter.this.mLoadListener.onAdLoadError(String.valueOf(i), str);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        public final void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
            PangleATRewardedVideoAdapter.this.f = pAGRewardedAd;
            try {
                Map<String, Object> mediaExtraInfo = PangleATRewardedVideoAdapter.this.f.getMediaExtraInfo();
                if (mediaExtraInfo != null) {
                    if (PangleATRewardedVideoAdapter.this.g == null) {
                        PangleATRewardedVideoAdapter.this.g = new HashMap(3);
                    }
                    PangleATRewardedVideoAdapter.this.g.putAll(mediaExtraInfo);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (PangleATRewardedVideoAdapter.this.mLoadListener != null) {
                PangleATRewardedVideoAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }
    };
    PAGRewardedAdInteractionListener d = new PAGRewardedAdInteractionListener() { // from class: com.anythink.network.pangle.PangleATRewardedVideoAdapter.2
        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public final void onAdShowed() {
            try {
                PangleATInitManager.getInstance().a(PangleATRewardedVideoAdapter.this.getTrackingInfo().z(), new WeakReference(PangleATRewardedVideoAdapter.this.f));
            } catch (Throwable unused) {
            }
            if (PangleATRewardedVideoAdapter.this.mImpressionListener != null) {
                PangleATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayStart();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public final void onAdClicked() {
            if (PangleATRewardedVideoAdapter.this.mImpressionListener != null) {
                PangleATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public final void onAdDismissed() {
            if (PangleATRewardedVideoAdapter.this.mImpressionListener != null) {
                PangleATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdClosed();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener
        public final void onUserEarnedReward(PAGRewardItem pAGRewardItem) {
            Log.i(PangleATRewardedVideoAdapter.this.e, "onUserEarnedReward()");
            if (PangleATRewardedVideoAdapter.this.b) {
                return;
            }
            PangleATRewardedVideoAdapter.this.b = true;
            if (PangleATRewardedVideoAdapter.this.mImpressionListener != null) {
                PangleATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayEnd();
            }
            if (pAGRewardItem != null) {
                try {
                    if (PangleATRewardedVideoAdapter.this.g == null) {
                        PangleATRewardedVideoAdapter.this.g = new HashMap();
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put(PangleATConst.REWARD_EXTRA.REWARD_EXTRA_KEY_REWARD_AMOUNT, Integer.valueOf(pAGRewardItem.getRewardAmount()));
                    hashMap.put(PangleATConst.REWARD_EXTRA.REWARD_EXTRA_KEY_REWARD_NAME, pAGRewardItem.getRewardName());
                    PangleATRewardedVideoAdapter.this.g.put(ATAdConst.REWARD_EXTRA.REWARD_INFO, hashMap);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            if (PangleATRewardedVideoAdapter.this.mImpressionListener != null) {
                PangleATRewardedVideoAdapter.this.mImpressionListener.onReward();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener
        public final void onUserEarnedRewardFail(int i, String str) {
            Log.i(PangleATRewardedVideoAdapter.this.e, "onUserEarnedRewardFail(), " + i + ", " + str);
        }
    };

    /* renamed from: com.anythink.network.pangle.PangleATRewardedVideoAdapter$3, reason: invalid class name */
    final class AnonymousClass3 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f5881a;

        AnonymousClass3(Map map) {
            this.f5881a = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!TextUtils.isEmpty(PangleATRewardedVideoAdapter.this.mUserData) && PangleATRewardedVideoAdapter.this.mUserData.contains(ATAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME)) {
                PangleATRewardedVideoAdapter pangleATRewardedVideoAdapter = PangleATRewardedVideoAdapter.this;
                pangleATRewardedVideoAdapter.mUserData = pangleATRewardedVideoAdapter.mUserData.replace(ATAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME, PangleATRewardedVideoAdapter.this.f5878a);
            }
            PAGRewardedRequest pAGRewardedRequest = new PAGRewardedRequest();
            if (!TextUtils.isEmpty(PangleATRewardedVideoAdapter.this.h)) {
                pAGRewardedRequest.setAdString(PangleATRewardedVideoAdapter.this.h);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("user_id", PangleATRewardedVideoAdapter.this.mUserId);
            hashMap.put("media_extra", PangleATRewardedVideoAdapter.this.mUserData);
            pAGRewardedRequest.setExtraInfo(hashMap);
            PangleATInitManager.setPangleUserData(this.f5881a);
            PAGRewardedAd.loadAd(PangleATRewardedVideoAdapter.this.f5878a, pAGRewardedRequest, PangleATRewardedVideoAdapter.this.c);
        }
    }

    private void a(Map<String, Object> map) {
        postOnMainThread(new AnonymousClass3(map));
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public boolean isAdReady() {
        return this.f != null;
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter
    public void show(Activity activity) {
        PAGRewardedAd pAGRewardedAd;
        if (activity == null || (pAGRewardedAd = this.f) == null) {
            return;
        }
        pAGRewardedAd.setAdInteractionListener(this.d);
        this.f.show(activity);
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return PangleATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, final Map<String, Object> map, Map<String, Object> map2) {
        String stringFromMap = ATInitMediation.getStringFromMap(map, "app_id");
        this.f5878a = ATInitMediation.getStringFromMap(map, "slot_id");
        if (TextUtils.isEmpty(stringFromMap) || TextUtils.isEmpty(this.f5878a)) {
            if (this.mLoadListener != null) {
                this.mLoadListener.onAdLoadError("", "app_id or slot_id is empty!");
            }
        } else {
            this.h = ATInitMediation.getStringFromMap(map, "payload");
            PangleATInitManager.getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.anythink.network.pangle.PangleATRewardedVideoAdapter.4
                @Override // com.anythink.core.api.MediationInitCallback
                public final void onSuccess() {
                    try {
                        PangleATRewardedVideoAdapter.b(PangleATRewardedVideoAdapter.this, map);
                    } catch (Throwable th) {
                        if (PangleATRewardedVideoAdapter.this.mLoadListener != null) {
                            PangleATRewardedVideoAdapter.this.mLoadListener.onAdLoadError("", th.getMessage());
                        }
                    }
                }

                @Override // com.anythink.core.api.MediationInitCallback
                public final void onFail(String str) {
                    if (PangleATRewardedVideoAdapter.this.mLoadListener != null) {
                        PangleATRewardedVideoAdapter.this.mLoadListener.onAdLoadError("", str);
                    }
                }
            });
        }
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        PAGRewardedAd pAGRewardedAd = this.f;
        if (pAGRewardedAd != null) {
            pAGRewardedAd.setAdInteractionListener(null);
            this.f = null;
        }
        this.c = null;
        this.d = null;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f5878a;
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

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.g;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public ATInitMediation getMediationInitManager() {
        return PangleATInitManager.getInstance();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        this.f5878a = ATInitMediation.getStringFromMap(map, "slot_id");
        PangleATInitManager.getInstance().a(context, map, map2, aTBidRequestInfoListener);
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z, boolean z2) {
        return PangleATInitManager.getInstance().setUserDataConsent(context, z, z2);
    }

    @Override // com.anythink.core.api.ATBaseAdInternalAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<Integer, Class<? extends ATBaseAdAdapter>> getFormatAdapterMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(3, PangleATInterstitialAdapter.class);
        return hashMap;
    }

    static /* synthetic */ void b(PangleATRewardedVideoAdapter pangleATRewardedVideoAdapter, Map map) {
        pangleATRewardedVideoAdapter.postOnMainThread(pangleATRewardedVideoAdapter.new AnonymousClass3(map));
    }
}
