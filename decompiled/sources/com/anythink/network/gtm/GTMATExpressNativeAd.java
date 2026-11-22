package com.anythink.network.gtm;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.nativead.api.ATNativePrepareInfo;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;
import com.mbridge.msdk.out.MBNativeAdvancedHandler;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.NativeAdvancedAdListener;

/* loaded from: classes12.dex */
public class GTMATExpressNativeAd extends CustomNativeAd {

    /* renamed from: a, reason: collision with root package name */
    MBNativeAdvancedHandler f5796a;
    ViewGroup b;
    boolean c;
    private final String d = "GTMATExpressNativeAd";

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void clear(View view) {
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public boolean isNativeExpress() {
        return true;
    }

    public GTMATExpressNativeAd(Context context, MBNativeAdvancedHandler mBNativeAdvancedHandler, boolean z) {
        this.f5796a = mBNativeAdvancedHandler;
        mBNativeAdvancedHandler.setAdListener(new NativeAdvancedAdListener() { // from class: com.anythink.network.gtm.GTMATExpressNativeAd.1
            @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
            public final void closeFullScreen(MBridgeIds mBridgeIds) {
            }

            @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
            public final void onLeaveApp(MBridgeIds mBridgeIds) {
            }

            @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
            public final void onLoadFailed(MBridgeIds mBridgeIds, String str) {
            }

            @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
            public final void onLoadSuccessed(MBridgeIds mBridgeIds) {
            }

            @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
            public final void showFullScreen(MBridgeIds mBridgeIds) {
            }

            @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
            public final void onLogImpression(MBridgeIds mBridgeIds) {
                GTMATExpressNativeAd.this.notifyAdImpression();
            }

            @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
            public final void onClick(MBridgeIds mBridgeIds) {
                GTMATExpressNativeAd.this.notifyAdClicked();
            }

            @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
            public final void onClose(MBridgeIds mBridgeIds) {
                GTMATExpressNativeAd.this.notifyAdDislikeClick();
            }
        });
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    public void prepare(View view, ATNativePrepareInfo aTNativePrepareInfo) {
        MBNativeAdvancedHandler mBNativeAdvancedHandler = this.f5796a;
        if (mBNativeAdvancedHandler != null) {
            mBNativeAdvancedHandler.onResume();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        try {
            if (this.b == null) {
                this.b = this.f5796a.getAdViewGroup();
            }
            return this.b;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void destroy() {
        MBNativeAdvancedHandler mBNativeAdvancedHandler = this.f5796a;
        if (mBNativeAdvancedHandler != null) {
            mBNativeAdvancedHandler.release();
            this.f5796a.setAdListener(null);
            this.f5796a = null;
        }
        this.b = null;
    }

    public void setIsAutoPlay(boolean z) {
        this.c = z;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    public void onResume() {
        super.onResume();
        MBNativeAdvancedHandler mBNativeAdvancedHandler = this.f5796a;
        if (mBNativeAdvancedHandler != null) {
            mBNativeAdvancedHandler.onResume();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    public void onPause() {
        super.onPause();
        MBNativeAdvancedHandler mBNativeAdvancedHandler = this.f5796a;
        if (mBNativeAdvancedHandler != null) {
            mBNativeAdvancedHandler.onPause();
        }
    }
}
