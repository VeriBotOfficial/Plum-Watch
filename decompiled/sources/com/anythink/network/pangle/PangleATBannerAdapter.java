package com.anythink.network.pangle;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.anythink.banner.unitgroup.api.CustomBannerAdapter;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.MediationInitCallback;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public class PangleATBannerAdapter extends CustomBannerAdapter {
    View b;
    int c;
    int d;
    String e;
    boolean f;
    PAGBannerAd g;
    private Map<String, Object> k;
    private final String j = getClass().getSimpleName();

    /* renamed from: a, reason: collision with root package name */
    String f5858a = "";
    PAGBannerAdLoadListener h = new PAGBannerAdLoadListener() { // from class: com.anythink.network.pangle.PangleATBannerAdapter.1
        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.bh
        public final void onError(int i, String str) {
            if (PangleATBannerAdapter.this.mLoadListener != null) {
                PangleATBannerAdapter.this.mLoadListener.onAdLoadError(String.valueOf(i), str);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        public final void onAdLoaded(PAGBannerAd pAGBannerAd) {
            if (pAGBannerAd == null) {
                if (PangleATBannerAdapter.this.mLoadListener != null) {
                    PangleATBannerAdapter.this.mLoadListener.onAdLoadError("", "TTAD is null!");
                    return;
                }
                return;
            }
            View bannerView = pAGBannerAd.getBannerView();
            if (bannerView == null) {
                if (PangleATBannerAdapter.this.mLoadListener != null) {
                    PangleATBannerAdapter.this.mLoadListener.onAdLoadError("", "TTBannerView is null!");
                    return;
                }
                return;
            }
            PangleATBannerAdapter.this.g = pAGBannerAd;
            PangleATBannerAdapter.this.b = bannerView;
            PangleATBannerAdapter.this.b.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.anythink.network.pangle.PangleATBannerAdapter.1.1
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    try {
                        if (PangleATBannerAdapter.this.b == null || PangleATBannerAdapter.this.b.getParent() == null) {
                            return true;
                        }
                        int measuredWidth = ((ViewGroup) PangleATBannerAdapter.this.b.getParent()).getMeasuredWidth();
                        int measuredHeight = ((ViewGroup) PangleATBannerAdapter.this.b.getParent()).getMeasuredHeight();
                        if (PangleATBannerAdapter.this.b.getLayoutParams().width == measuredWidth) {
                            return true;
                        }
                        PangleATBannerAdapter.this.b.getLayoutParams().width = measuredWidth;
                        PangleATBannerAdapter.this.b.getLayoutParams().height = (measuredWidth * PangleATBannerAdapter.this.d) / PangleATBannerAdapter.this.c;
                        if (PangleATBannerAdapter.this.b.getLayoutParams().height > measuredHeight) {
                            PangleATBannerAdapter.this.b.getLayoutParams().height = measuredHeight;
                            PangleATBannerAdapter.this.b.getLayoutParams().width = (measuredHeight * PangleATBannerAdapter.this.c) / PangleATBannerAdapter.this.d;
                        }
                        ((ViewGroup) PangleATBannerAdapter.this.b.getParent()).requestLayout();
                        return true;
                    } catch (Exception e) {
                        e.printStackTrace();
                        return true;
                    }
                }
            });
            PangleATBannerAdapter.this.g.setAdInteractionListener(PangleATBannerAdapter.this.i);
            try {
                Map<String, Object> mediaExtraInfo = PangleATBannerAdapter.this.g.getMediaExtraInfo();
                if (mediaExtraInfo != null) {
                    if (PangleATBannerAdapter.this.k == null) {
                        PangleATBannerAdapter.this.k = new HashMap(3);
                    }
                    PangleATBannerAdapter.this.k.putAll(mediaExtraInfo);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            PangleATBannerAdapter.this.f = false;
            if (PangleATBannerAdapter.this.mLoadListener != null) {
                PangleATBannerAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }
    };
    PAGBannerAdInteractionListener i = new PAGBannerAdInteractionListener() { // from class: com.anythink.network.pangle.PangleATBannerAdapter.2
        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public final void onAdShowed() {
            try {
                PangleATInitManager.getInstance().a(PangleATBannerAdapter.this.getTrackingInfo().z(), new WeakReference(PangleATBannerAdapter.this.g));
            } catch (Throwable unused) {
            }
            if (PangleATBannerAdapter.this.mImpressionEventListener == null || PangleATBannerAdapter.this.f) {
                return;
            }
            PangleATBannerAdapter.this.mImpressionEventListener.onBannerAdShow();
            PangleATBannerAdapter.this.f = true;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public final void onAdClicked() {
            if (PangleATBannerAdapter.this.mImpressionEventListener != null) {
                PangleATBannerAdapter.this.mImpressionEventListener.onBannerAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public final void onAdDismissed() {
            if (PangleATBannerAdapter.this.mImpressionEventListener != null) {
                PangleATBannerAdapter.this.mImpressionEventListener.onBannerAdClose();
            }
        }
    };

    private void a(Context context, Map<String, Object> map, Map<String, Object> map2) {
        postOnMainThread(new AnonymousClass3(context.getApplicationContext(), map, map2));
    }

    /* renamed from: com.anythink.network.pangle.PangleATBannerAdapter$3, reason: invalid class name */
    final class AnonymousClass3 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f5862a;
        final /* synthetic */ Map b;
        final /* synthetic */ Map c;

        AnonymousClass3(Context context, Map map, Map map2) {
            this.f5862a = context;
            this.b = map;
            this.c = map2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            PangleATBannerAdapter.this.c = 320;
            PangleATBannerAdapter.this.d = 50;
            PAGBannerSize bannerSize = PangleATInitManager.getInstance().getBannerSize(this.f5862a, this.b, this.c);
            if (bannerSize != null) {
                PangleATBannerAdapter.this.c = bannerSize.getWidth();
                PangleATBannerAdapter.this.d = bannerSize.getHeight();
            }
            PAGBannerRequest pAGBannerRequest = new PAGBannerRequest(bannerSize);
            if (!TextUtils.isEmpty(PangleATBannerAdapter.this.e)) {
                pAGBannerRequest.setAdString(PangleATBannerAdapter.this.e);
            }
            PangleATInitManager.setPangleUserData(this.b);
            PAGBannerAd.loadAd(PangleATBannerAdapter.this.f5858a, pAGBannerRequest, PangleATBannerAdapter.this.h);
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerAdapter
    public View getBannerView() {
        return this.b;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return PangleATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(final Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        String stringFromMap = ATInitMediation.getStringFromMap(map, "app_id");
        this.f5858a = ATInitMediation.getStringFromMap(map, "slot_id");
        if (TextUtils.isEmpty(stringFromMap) || TextUtils.isEmpty(this.f5858a)) {
            if (this.mLoadListener != null) {
                this.mLoadListener.onAdLoadError("", "app_id or slot_id is empty!");
            }
        } else {
            this.e = ATInitMediation.getStringFromMap(map, "payload");
            PangleATInitManager.getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.anythink.network.pangle.PangleATBannerAdapter.4
                @Override // com.anythink.core.api.MediationInitCallback
                public final void onSuccess() {
                    try {
                        PangleATBannerAdapter.a(PangleATBannerAdapter.this, context, map, map2);
                    } catch (Throwable th) {
                        if (PangleATBannerAdapter.this.mLoadListener != null) {
                            PangleATBannerAdapter.this.mLoadListener.onAdLoadError("", th.getMessage());
                        }
                    }
                }

                @Override // com.anythink.core.api.MediationInitCallback
                public final void onFail(String str) {
                    if (PangleATBannerAdapter.this.mLoadListener != null) {
                        PangleATBannerAdapter.this.mLoadListener.onAdLoadError("", str);
                    }
                }
            });
        }
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        this.b = null;
        PAGBannerAd pAGBannerAd = this.g;
        if (pAGBannerAd != null) {
            pAGBannerAd.setAdInteractionListener(null);
            this.g.destroy();
            this.g = null;
        }
        this.i = null;
        this.h = null;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f5858a;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return PangleATInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public ATInitMediation getMediationInitManager() {
        return PangleATInitManager.getInstance();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        this.f5858a = ATInitMediation.getStringFromMap(map, "slot_id");
        PangleATInitManager.getInstance().a(context, map, map2, aTBidRequestInfoListener, true);
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z, boolean z2) {
        return PangleATInitManager.getInstance().setUserDataConsent(context, z, z2);
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.k;
    }

    @Override // com.anythink.core.api.ATBaseAdInternalAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<Integer, Class<? extends ATBaseAdAdapter>> getFormatAdapterMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, PangleATAdapter.class);
        return hashMap;
    }

    static /* synthetic */ void a(PangleATBannerAdapter pangleATBannerAdapter, Context context, Map map, Map map2) {
        pangleATBannerAdapter.postOnMainThread(pangleATBannerAdapter.new AnonymousClass3(context.getApplicationContext(), map, map2));
    }
}
