package com.anythink.network.pangle;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.MediationInitCallback;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;
import com.anythink.nativead.unitgroup.api.CustomNativeAdapter;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public class PangleATAdapter extends CustomNativeAdapter {

    /* renamed from: a, reason: collision with root package name */
    String f5854a;
    String b;
    String c;
    Map<String, Object> d;
    private final String e = getClass().getSimpleName();

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(final Context context, final Map<String, Object> map, Map<String, Object> map2) {
        String stringFromMap = ATInitMediation.getStringFromMap(map, "app_id");
        this.f5854a = ATInitMediation.getStringFromMap(map, "slot_id");
        if (TextUtils.isEmpty(stringFromMap) || TextUtils.isEmpty(this.f5854a)) {
            if (this.mLoadListener != null) {
                this.mLoadListener.onAdLoadError("", "toutiao app_id or slot_id is empty!");
            }
        } else {
            this.c = ATInitMediation.getStringFromMap(map, "payload");
            this.b = ATInitMediation.getStringFromMap(map, MBridgeConstans.PROPERTIES_LAYOUT_TYPE, "0");
            if (this.mRequestNum > 3) {
                this.mRequestNum = 3;
            }
            PangleATInitManager.getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.anythink.network.pangle.PangleATAdapter.1
                @Override // com.anythink.core.api.MediationInitCallback
                public final void onSuccess() {
                    PangleATAdapter.a(PangleATAdapter.this, context, map);
                }

                @Override // com.anythink.core.api.MediationInitCallback
                public final void onFail(String str) {
                    if (PangleATAdapter.this.mLoadListener != null) {
                        PangleATAdapter.this.mLoadListener.onAdLoadError("", str);
                    }
                }
            });
        }
    }

    private void a(Context context, Map<String, Object> map) {
        postOnMainThread(new AnonymousClass2(map, context.getApplicationContext()));
    }

    /* renamed from: com.anythink.network.pangle.PangleATAdapter$2, reason: invalid class name */
    final class AnonymousClass2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f5856a;
        final /* synthetic */ Context b;

        AnonymousClass2(Map map, Context context) {
            this.f5856a = map;
            this.b = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            PAGNativeRequest pAGNativeRequest = new PAGNativeRequest();
            if (!TextUtils.isEmpty(PangleATAdapter.this.c)) {
                pAGNativeRequest.setAdString(PangleATAdapter.this.c);
            }
            PangleATInitManager.setPangleUserData(this.f5856a);
            PAGNativeAd.loadAd(PangleATAdapter.this.f5854a, pAGNativeRequest, new PAGNativeAdLoadListener() { // from class: com.anythink.network.pangle.PangleATAdapter.2.1
                @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.bh
                public final void onError(int i, String str) {
                    if (PangleATAdapter.this.mLoadListener != null) {
                        PangleATAdapter.this.mLoadListener.onAdLoadError(String.valueOf(i), str);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
                public final void onAdLoaded(PAGNativeAd pAGNativeAd) {
                    if (pAGNativeAd == null) {
                        if (PangleATAdapter.this.mLoadListener != null) {
                            PangleATAdapter.this.mLoadListener.onAdLoadError("", "Pangle: pagNativeAd = null");
                            return;
                        }
                        return;
                    }
                    try {
                        Map<String, Object> mediaExtraInfo = pAGNativeAd.getMediaExtraInfo();
                        if (mediaExtraInfo != null) {
                            if (PangleATAdapter.this.d == null) {
                                PangleATAdapter.this.d = new HashMap(3);
                            }
                            PangleATAdapter.this.d.putAll(mediaExtraInfo);
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new PangleATNativeAd(AnonymousClass2.this.b, PangleATAdapter.this.f5854a, pAGNativeAd, AnonymousClass2.this.f5856a));
                    if (PangleATAdapter.this.mLoadListener != null) {
                        PangleATAdapter.this.mLoadListener.onAdCacheLoaded((CustomNativeAd[]) arrayList.toArray(new CustomNativeAd[arrayList.size()]));
                    }
                }
            });
        }
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return PangleATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f5854a;
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
        this.f5854a = ATInitMediation.getStringFromMap(map, "slot_id");
        PangleATInitManager.getInstance().a(context, map, map2, aTBidRequestInfoListener);
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z, boolean z2) {
        return PangleATInitManager.getInstance().setUserDataConsent(context, z, z2);
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.d;
    }

    static /* synthetic */ void a(PangleATAdapter pangleATAdapter, Context context, Map map) {
        pangleATAdapter.postOnMainThread(pangleATAdapter.new AnonymousClass2(map, context.getApplicationContext()));
    }
}
