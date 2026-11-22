package com.anythink.network.adx;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.anythink.basead.d;
import com.anythink.basead.d.f;
import com.anythink.basead.f.c;
import com.anythink.basead.f.d;
import com.anythink.basead.f.h;
import com.anythink.basead.g.c;
import com.anythink.basead.g.e;
import com.anythink.basead.g.j;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.a.b;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h.x;
import com.anythink.splashad.unitgroup.api.CustomSplashAdapter;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public class AdxATSplashAdapter extends CustomSplashAdapter {

    /* renamed from: a, reason: collision with root package name */
    h f5705a;
    x b;
    Map<String, Object> c;

    static /* synthetic */ int i(AdxATSplashAdapter adxATSplashAdapter) {
        adxATSplashAdapter.mDismissType = 3;
        return 3;
    }

    static /* synthetic */ int j(AdxATSplashAdapter adxATSplashAdapter) {
        adxATSplashAdapter.mDismissType = 4;
        return 4;
    }

    static /* synthetic */ int k(AdxATSplashAdapter adxATSplashAdapter) {
        adxATSplashAdapter.mDismissType = 99;
        return 99;
    }

    static /* synthetic */ int l(AdxATSplashAdapter adxATSplashAdapter) {
        adxATSplashAdapter.mDismissType = 2;
        return 2;
    }

    static /* synthetic */ int s(AdxATSplashAdapter adxATSplashAdapter) {
        adxATSplashAdapter.mDismissType = 99;
        return 99;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        a(context, map, map2);
        this.f5705a.a(new c() { // from class: com.anythink.network.adx.AdxATSplashAdapter.1
            @Override // com.anythink.basead.g.c
            public final void onAdDataLoaded() {
                if (AdxATSplashAdapter.this.mLoadListener != null) {
                    AdxATSplashAdapter.this.mLoadListener.onAdDataLoaded();
                }
            }

            @Override // com.anythink.basead.g.c
            public final void onAdCacheLoaded() {
                AdxATSplashAdapter adxATSplashAdapter = AdxATSplashAdapter.this;
                adxATSplashAdapter.c = d.a(adxATSplashAdapter.f5705a);
                if (AdxATSplashAdapter.this.getTrackingInfo() != null) {
                    AdxATSplashAdapter.this.getTrackingInfo().M(AdxATSplashAdapter.this.f5705a.f());
                }
                if (AdxATSplashAdapter.this.mLoadListener != null) {
                    AdxATSplashAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            }

            @Override // com.anythink.basead.g.c
            public final void onAdLoadFailed(f fVar) {
                if (AdxATSplashAdapter.this.mLoadListener != null) {
                    AdxATSplashAdapter.this.mLoadListener.onAdLoadError(fVar.a(), fVar.b());
                }
            }
        });
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public boolean isAdReady() {
        h hVar = this.f5705a;
        boolean z = hVar != null && hVar.c();
        if (z && this.c == null) {
            this.c = d.a(this.f5705a);
        }
        return z;
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashAdapter
    public void show(Activity activity, ViewGroup viewGroup) {
        if (this.f5705a != null) {
            AdxATInitManager.getInstance();
            AdxATInitManager.a(getTrackingInfo(), this.b);
            this.f5705a.a(new e(this.f5705a.d(), getTrackingInfo()) { // from class: com.anythink.network.adx.AdxATSplashAdapter.2
                @Override // com.anythink.basead.g.e, com.anythink.basead.g.a
                public final void onAdShow(j jVar) {
                    super.onAdShow(jVar);
                    if (AdxATSplashAdapter.this.mImpressionListener != null) {
                        AdxATSplashAdapter.this.mImpressionListener.onSplashAdShow();
                    }
                }

                @Override // com.anythink.basead.g.a
                public final void onAdClosed() {
                    Map<String, Object> adExtraInfoMap = AdxATSplashAdapter.this.getAdExtraInfoMap();
                    if (adExtraInfoMap != null) {
                        try {
                            int intFromMap = ATInitMediation.getIntFromMap(adExtraInfoMap, b.C0190b.f3606a, 1);
                            if (intFromMap == 2) {
                                AdxATSplashAdapter.i(AdxATSplashAdapter.this);
                            } else {
                                if (intFromMap != 3 && intFromMap != 5) {
                                    if (intFromMap == 6) {
                                        AdxATSplashAdapter.j(AdxATSplashAdapter.this);
                                    } else if (intFromMap != 10) {
                                        AdxATSplashAdapter.l(AdxATSplashAdapter.this);
                                    }
                                }
                                AdxATSplashAdapter.k(AdxATSplashAdapter.this);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    if (AdxATSplashAdapter.this.mImpressionListener != null) {
                        AdxATSplashAdapter.this.mImpressionListener.onSplashAdDismiss();
                    }
                }

                @Override // com.anythink.basead.g.e, com.anythink.basead.g.a
                public final void onAdClick(j jVar) {
                    super.onAdClick(jVar);
                    if (AdxATSplashAdapter.this.mImpressionListener != null) {
                        AdxATSplashAdapter.this.mImpressionListener.onSplashAdClicked();
                    }
                }

                @Override // com.anythink.basead.g.a
                public final void onDeeplinkCallback(boolean z) {
                    if ((AdxATSplashAdapter.this.f5705a == null || AdxATSplashAdapter.this.f5705a.g()) && AdxATSplashAdapter.this.mImpressionListener != null) {
                        AdxATSplashAdapter.this.mImpressionListener.onDeeplinkCallback(z);
                    }
                }

                @Override // com.anythink.basead.g.a
                public final void onShowFailed(f fVar) {
                    AdxATSplashAdapter.s(AdxATSplashAdapter.this);
                    if (AdxATSplashAdapter.this.mImpressionListener != null) {
                        AdxATSplashAdapter.this.mImpressionListener.onSplashAdShowFail(ErrorCode.getErrorCode(ErrorCode.adShowError, fVar.a(), fVar.b()));
                        AdxATSplashAdapter.this.mImpressionListener.onSplashAdDismiss();
                    }
                }
            });
            if (isCustomSkipView()) {
                this.f5705a.a();
            }
            this.f5705a.a(viewGroup);
        }
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        h hVar = this.f5705a;
        if (hVar != null) {
            hVar.b();
            this.f5705a = null;
        }
        this.b = null;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        a(context, map, map2);
        h hVar = this.f5705a;
        if (hVar == null) {
            return true;
        }
        hVar.a(new c.a() { // from class: com.anythink.network.adx.AdxATSplashAdapter.3
            @Override // com.anythink.basead.f.c.a
            public final void onAdCacheLoaded() {
                if (AdxATSplashAdapter.this.getTrackingInfo() != null) {
                    AdxATSplashAdapter.this.getTrackingInfo().M(AdxATSplashAdapter.this.f5705a.f());
                }
            }
        });
        return true;
    }

    private void a(Context context, Map<String, Object> map, Map<String, Object> map2) {
        int i;
        Object obj;
        Object obj2;
        Object obj3;
        AdxATInitManager.getInstance().initSDK(context, map, null);
        int parseInt = (!map.containsKey("orientation") || (obj3 = map.get("orientation")) == null) ? 1 : Integer.parseInt(obj3.toString());
        int parseInt2 = (!map.containsKey("countdown") || (obj2 = map.get("countdown")) == null) ? 5000 : Integer.parseInt(obj2.toString()) * 1000;
        if (!map.containsKey("allows_skip") || (obj = map.get("allows_skip")) == null || (i = Integer.parseInt(obj.toString())) == 0) {
            i = 1;
        } else if (i == 1) {
            i = 0;
        }
        int intFromMap = ATInitMediation.getIntFromMap(map, "end_cls", 1);
        x xVar = (x) map.get(j.w.f3704a);
        this.b = xVar;
        if (xVar != null) {
            xVar.w = new HashMap<>();
            this.b.w.put("orientation", Integer.valueOf(parseInt));
            this.b.w.put(ATAdConst.KEY.AD_WIDTH, map2.get(ATAdConst.KEY.AD_WIDTH));
            this.b.w.put(ATAdConst.KEY.AD_HEIGHT, map2.get(ATAdConst.KEY.AD_HEIGHT));
        }
        h hVar = new h(context, c.b.ADX_OFFER_REQUEST_TYPE, this.b);
        this.f5705a = hVar;
        hVar.a(new d.a().d(parseInt).e(parseInt2).f(i).i(intFromMap).a());
        AdxATInitManager.getInstance();
        AdxATInitManager.a(getTrackingInfo(), this.b);
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return AdxATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        x xVar = this.b;
        return xVar != null ? xVar.b : "";
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.c;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public Map<String, Object> getAdExtraInfoMap() {
        h hVar = this.f5705a;
        if (hVar != null) {
            return hVar.e();
        }
        return null;
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashAdapter
    public boolean isSupportCustomSkipView() {
        h hVar = this.f5705a;
        return hVar != null && hVar.h();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        AdxATInitManager.getInstance().a(context, map, map2, aTBidRequestInfoListener, 4);
    }

    @Override // com.anythink.core.api.ATBaseAdInternalAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<Integer, Class<? extends ATBaseAdAdapter>> getFormatAdapterMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(3, AdxATInterstitialAdapter.class);
        return hashMap;
    }
}
