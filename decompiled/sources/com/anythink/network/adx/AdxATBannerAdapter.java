package com.anythink.network.adx;

import android.content.Context;
import android.view.View;
import com.anythink.banner.unitgroup.api.CustomBannerAdapter;
import com.anythink.basead.d;
import com.anythink.basead.d.f;
import com.anythink.basead.f.b;
import com.anythink.basead.f.c;
import com.anythink.basead.g.a;
import com.anythink.basead.g.c;
import com.anythink.basead.g.e;
import com.anythink.basead.g.j;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.h.x;
import java.util.Map;

/* loaded from: classes12.dex */
public class AdxATBannerAdapter extends CustomBannerAdapter {

    /* renamed from: a, reason: collision with root package name */
    x f5690a;
    Map<String, Object> b;
    private b c;
    private View d;

    @Override // com.anythink.banner.unitgroup.api.CustomBannerAdapter
    public View getBannerView() {
        b bVar = this.c;
        if (bVar != null && this.b == null) {
            this.b = d.a(bVar);
        }
        return this.d;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        a(context, map, map2);
        this.c.a(new c() { // from class: com.anythink.network.adx.AdxATBannerAdapter.1
            @Override // com.anythink.basead.g.c
            public final void onAdDataLoaded() {
                if (AdxATBannerAdapter.this.mLoadListener != null) {
                    AdxATBannerAdapter.this.mLoadListener.onAdDataLoaded();
                }
            }

            @Override // com.anythink.basead.g.c
            public final void onAdCacheLoaded() {
                if (AdxATBannerAdapter.this.c == null || AdxATBannerAdapter.this.mLoadListener == null) {
                    return;
                }
                AdxATBannerAdapter adxATBannerAdapter = AdxATBannerAdapter.this;
                adxATBannerAdapter.b = d.a(adxATBannerAdapter.c);
                AdxATInitManager.getInstance();
                AdxATInitManager.a(AdxATBannerAdapter.this.getTrackingInfo(), AdxATBannerAdapter.this.f5690a);
                AdxATBannerAdapter.this.c.a(new e(AdxATBannerAdapter.this.c.d(), AdxATBannerAdapter.this.getTrackingInfo()) { // from class: com.anythink.network.adx.AdxATBannerAdapter.1.1
                    @Override // com.anythink.basead.g.a
                    public final void onShowFailed(f fVar) {
                    }

                    @Override // com.anythink.basead.g.e, com.anythink.basead.g.a
                    public final void onAdShow(j jVar) {
                        super.onAdShow(jVar);
                        if (AdxATBannerAdapter.this.mImpressionEventListener != null) {
                            AdxATBannerAdapter.this.mImpressionEventListener.onBannerAdShow();
                        }
                    }

                    @Override // com.anythink.basead.g.a
                    public final void onAdClosed() {
                        if (AdxATBannerAdapter.this.mImpressionEventListener != null) {
                            AdxATBannerAdapter.this.mImpressionEventListener.onBannerAdClose();
                        }
                    }

                    @Override // com.anythink.basead.g.e, com.anythink.basead.g.a
                    public final void onAdClick(j jVar) {
                        super.onAdClick(jVar);
                        if (AdxATBannerAdapter.this.mImpressionEventListener != null) {
                            AdxATBannerAdapter.this.mImpressionEventListener.onBannerAdClicked();
                        }
                    }

                    @Override // com.anythink.basead.g.a
                    public final void onDeeplinkCallback(boolean z) {
                        if ((AdxATBannerAdapter.this.c == null || AdxATBannerAdapter.this.c.g()) && AdxATBannerAdapter.this.mImpressionEventListener != null) {
                            AdxATBannerAdapter.this.mImpressionEventListener.onDeeplinkCallback(z);
                        }
                    }
                });
                if (AdxATBannerAdapter.this.getTrackingInfo() != null) {
                    AdxATBannerAdapter.this.getTrackingInfo().M(AdxATBannerAdapter.this.c.f());
                }
                AdxATBannerAdapter adxATBannerAdapter2 = AdxATBannerAdapter.this;
                adxATBannerAdapter2.d = adxATBannerAdapter2.c.a();
                if (AdxATBannerAdapter.this.d != null) {
                    AdxATBannerAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                } else {
                    AdxATBannerAdapter.this.mLoadListener.onAdLoadError("", "Adx bannerView = null");
                }
            }

            @Override // com.anythink.basead.g.c
            public final void onAdLoadFailed(f fVar) {
                if (AdxATBannerAdapter.this.mLoadListener != null) {
                    AdxATBannerAdapter.this.mLoadListener.onAdLoadError(fVar.a(), fVar.b());
                }
            }
        });
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        a(context, map, map2);
        b bVar = this.c;
        if (bVar == null) {
            return true;
        }
        bVar.a(new c.a() { // from class: com.anythink.network.adx.AdxATBannerAdapter.2
            @Override // com.anythink.basead.f.c.a
            public final void onAdCacheLoaded() {
                if (AdxATBannerAdapter.this.getTrackingInfo() != null) {
                    AdxATBannerAdapter.this.getTrackingInfo().M(AdxATBannerAdapter.this.c.f());
                }
                AdxATInitManager.getInstance();
                AdxATInitManager.a(AdxATBannerAdapter.this.getTrackingInfo(), AdxATBannerAdapter.this.f5690a);
                AdxATBannerAdapter.this.c.a(new e(AdxATBannerAdapter.this.c.d(), AdxATBannerAdapter.this.getTrackingInfo()) { // from class: com.anythink.network.adx.AdxATBannerAdapter.2.1
                    @Override // com.anythink.basead.g.a
                    public final void onShowFailed(f fVar) {
                    }

                    @Override // com.anythink.basead.g.e, com.anythink.basead.g.a
                    public final void onAdShow(j jVar) {
                        super.onAdShow(jVar);
                        if (AdxATBannerAdapter.this.mImpressionEventListener != null) {
                            AdxATBannerAdapter.this.mImpressionEventListener.onBannerAdShow();
                        }
                    }

                    @Override // com.anythink.basead.g.a
                    public final void onAdClosed() {
                        if (AdxATBannerAdapter.this.mImpressionEventListener != null) {
                            AdxATBannerAdapter.this.mImpressionEventListener.onBannerAdClose();
                        }
                    }

                    @Override // com.anythink.basead.g.e, com.anythink.basead.g.a
                    public final void onAdClick(j jVar) {
                        super.onAdClick(jVar);
                        if (AdxATBannerAdapter.this.mImpressionEventListener != null) {
                            AdxATBannerAdapter.this.mImpressionEventListener.onBannerAdClicked();
                        }
                    }

                    @Override // com.anythink.basead.g.a
                    public final void onDeeplinkCallback(boolean z) {
                        if ((AdxATBannerAdapter.this.c == null || AdxATBannerAdapter.this.c.g()) && AdxATBannerAdapter.this.mImpressionEventListener != null) {
                            AdxATBannerAdapter.this.mImpressionEventListener.onDeeplinkCallback(z);
                        }
                    }
                });
                AdxATBannerAdapter.this.postOnMainThread(new Runnable() { // from class: com.anythink.network.adx.AdxATBannerAdapter.2.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdxATBannerAdapter.this.d = AdxATBannerAdapter.this.c.a();
                    }
                });
            }
        });
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(android.content.Context r7, java.util.Map<java.lang.String, java.lang.Object> r8, java.util.Map<java.lang.String, java.lang.Object> r9) {
        /*
            r6 = this;
            com.anythink.network.adx.AdxATInitManager r0 = com.anythink.network.adx.AdxATInitManager.getInstance()
            r1 = 0
            r0.initSDK(r7, r8, r1)
            java.lang.String r0 = "close_button"
            boolean r1 = r8.containsKey(r0)
            r2 = 0
            if (r1 == 0) goto L20
            java.lang.Object r0 = r8.get(r0)
            if (r0 == 0) goto L20
            java.lang.String r0 = r0.toString()
            int r0 = java.lang.Integer.parseInt(r0)
            goto L21
        L20:
            r0 = r2
        L21:
            java.lang.String r1 = "size"
            boolean r3 = r8.containsKey(r1)
            if (r3 == 0) goto L34
            java.lang.Object r1 = r8.get(r1)
            if (r1 == 0) goto L34
            java.lang.String r1 = r1.toString()
            goto L36
        L34:
            java.lang.String r1 = "320x50"
        L36:
            if (r9 == 0) goto L70
            java.lang.String r3 = "key_width"
            boolean r4 = r9.containsKey(r3)
            if (r4 == 0) goto L52
            java.lang.Object r3 = r9.get(r3)
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L4e
            double r3 = java.lang.Double.parseDouble(r3)     // Catch: java.lang.Throwable -> L4e
            int r3 = (int) r3
            goto L53
        L4e:
            r3 = move-exception
            r3.printStackTrace()
        L52:
            r3 = r2
        L53:
            java.lang.String r4 = "key_height"
            boolean r5 = r9.containsKey(r4)
            if (r5 == 0) goto L6d
            java.lang.Object r9 = r9.get(r4)
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L69
            double r4 = java.lang.Double.parseDouble(r9)     // Catch: java.lang.Throwable -> L69
            int r2 = (int) r4
            goto L6d
        L69:
            r9 = move-exception
            r9.printStackTrace()
        L6d:
            r9 = r2
            r2 = r3
            goto L71
        L70:
            r9 = r2
        L71:
            java.lang.String r3 = "basead_params"
            java.lang.Object r8 = r8.get(r3)
            com.anythink.core.common.h.x r8 = (com.anythink.core.common.h.x) r8
            r6.f5690a = r8
            com.anythink.basead.f.b r8 = new com.anythink.basead.f.b
            com.anythink.basead.f.c$b r3 = com.anythink.basead.f.c.b.ADX_OFFER_REQUEST_TYPE
            com.anythink.core.common.h.x r4 = r6.f5690a
            r8.<init>(r7, r3, r4)
            r6.c = r8
            com.anythink.basead.f.d$a r7 = new com.anythink.basead.f.d$a
            r7.<init>()
            com.anythink.basead.f.d$a r7 = r7.c(r0)
            com.anythink.basead.f.d$a r7 = r7.b(r1)
            com.anythink.basead.f.d$a r7 = r7.g(r2)
            com.anythink.basead.f.d$a r7 = r7.h(r9)
            com.anythink.basead.f.d r7 = r7.a()
            r8.a(r7)
            com.anythink.network.adx.AdxATInitManager.getInstance()
            com.anythink.core.common.h.n r7 = r6.getTrackingInfo()
            com.anythink.core.common.h.x r8 = r6.f5690a
            com.anythink.network.adx.AdxATInitManager.a(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.network.adx.AdxATBannerAdapter.a(android.content.Context, java.util.Map, java.util.Map):void");
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        this.d = null;
        b bVar = this.c;
        if (bVar != null) {
            bVar.a((a) null);
            this.c.b();
            this.c = null;
        }
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        x xVar = this.f5690a;
        return xVar != null ? xVar.b : "";
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return "";
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return AdxATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.b;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        AdxATInitManager.getInstance().a(context, map, map2, aTBidRequestInfoListener, 2);
    }
}
