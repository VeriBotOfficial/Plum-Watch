package com.qumeng.overseas.advlib.topon.natives;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.core.api.ATAdAppInfo;
import com.anythink.nativead.api.ATNativePrepareInfo;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;
import com.qumeng.overseas.advlib.core.AppInformation;
import com.qumeng.overseas.advlib.core.IMultiAdObject;
import com.qumeng.overseas.advlib.topon.AdxAdapterConst;
import java.util.List;
import java.util.Objects;

/* loaded from: classes17.dex */
public class AdxNativeWrapper extends CustomNativeAd {
    private static final String TAG = "AdxNativeWrapper";
    private final IMultiAdObject mAdCupNative;
    private final Context mContext;
    final LoadCallbackListener mCustomNativeListener;

    protected interface LoadCallbackListener {
        void onFail(String str, String str2);

        void onSuccess(CustomNativeAd customNativeAd);
    }

    AdxNativeWrapper(Context context, final IMultiAdObject iMultiAdObject, LoadCallbackListener loadCallbackListener) {
        String str;
        this.mAdCupNative = iMultiAdObject;
        this.mContext = context;
        this.mCustomNativeListener = loadCallbackListener;
        if (iMultiAdObject == null) {
            return;
        }
        setTitle(iMultiAdObject.getTitle());
        setDescriptionText(iMultiAdObject.getDesc());
        setAppPrice(iMultiAdObject.getECPM());
        setImageUrlList(iMultiAdObject.getImageUrls());
        setAdLogoView(iMultiAdObject.getAdLogoView(context));
        if (iMultiAdObject.getInteractionType() == 2) {
            final AppInformation appInformation = iMultiAdObject.getAppInformation();
            if (appInformation != null) {
                setIconImageUrl(iMultiAdObject.getAppLogoUrl());
                setAdAppInfo(new ATAdAppInfo() { // from class: com.qumeng.overseas.advlib.topon.natives.AdxNativeWrapper.1
                    public String getAppDownloadCount() {
                        return "";
                    }

                    @Override // com.anythink.core.api.ATAdAppInfo
                    public String getAppName() {
                        return iMultiAdObject.getAppName();
                    }

                    @Override // com.anythink.core.api.ATAdAppInfo
                    public String getAppPackageName() {
                        return iMultiAdObject.getAppPackageName();
                    }

                    @Override // com.anythink.core.api.ATAdAppInfo
                    public String getAppPermissonUrl() {
                        return appInformation.getPermissionProtocolUrl();
                    }

                    @Override // com.anythink.core.api.ATAdAppInfo
                    public String getAppPrivacyUrl() {
                        return appInformation.getPrivacyProtocolUrl();
                    }

                    @Override // com.anythink.core.api.ATAdAppInfo
                    public long getAppSize() {
                        return -1L;
                    }

                    @Override // com.anythink.core.api.ATAdAppInfo
                    public String getAppVersion() {
                        return appInformation.getAppVersion();
                    }

                    @Override // com.anythink.core.api.ATAdAppInfo
                    public String getPublisher() {
                        return appInformation.developers;
                    }
                });
            }
            str = AdxAdapterConst.CTA_OPEN;
        } else {
            str = AdxAdapterConst.CTA_VIEW;
        }
        if (iMultiAdObject.getMaterialType() == 4 || iMultiAdObject.getMaterialType() == 9) {
            setVideoDuration(iMultiAdObject.getVideoDuration());
            this.mAdSourceType = "1";
            iMultiAdObject.setOnMediaStateListener(new IMultiAdObject.MediaStateListener() { // from class: com.qumeng.overseas.advlib.topon.natives.AdxNativeWrapper.2
                @Override // com.qumeng.overseas.advlib.core.IMultiAdObject.MediaStateListener
                public void onVideoCompleted() {
                    Log.d(AdxNativeWrapper.TAG, "onVideoCompleted: ");
                    AdxNativeWrapper.this.notifyAdVideoEnd();
                }

                @Override // com.qumeng.overseas.advlib.core.IMultiAdObject.MediaStateListener
                public void onVideoError(Bundle bundle) {
                }

                @Override // com.qumeng.overseas.advlib.core.IMultiAdObject.MediaStateListener
                public void onVideoPause() {
                    Log.d(AdxNativeWrapper.TAG, "onVideoPause: ");
                }

                @Override // com.qumeng.overseas.advlib.core.IMultiAdObject.MediaStateListener
                public void onVideoReady() {
                    Log.d(AdxNativeWrapper.TAG, "onVideoReady: ");
                }

                @Override // com.qumeng.overseas.advlib.core.IMultiAdObject.MediaStateListener
                public void onVideoResume() {
                    Log.d(AdxNativeWrapper.TAG, "onVideoResume: ");
                }

                @Override // com.qumeng.overseas.advlib.core.IMultiAdObject.MediaStateListener
                public void onVideoStart() {
                    Log.d(AdxNativeWrapper.TAG, "onVideoStart: ");
                    AdxNativeWrapper.this.notifyAdVideoStart();
                }

                @Override // com.qumeng.overseas.advlib.core.IMultiAdObject.MediaStateListener
                public void onVideoStop() {
                    Log.d(AdxNativeWrapper.TAG, "onVideoStop: ");
                }
            });
        } else {
            this.mAdSourceType = "2";
        }
        setCallToActionText(str);
        if (loadCallbackListener != null) {
            loadCallbackListener.onSuccess(this);
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void destroy() {
        super.destroy();
        IMultiAdObject iMultiAdObject = this.mAdCupNative;
        if (iMultiAdObject != null) {
            iMultiAdObject.destroy();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        if (this.mAdCupNative == null || !Objects.equals(this.mAdSourceType, "1")) {
            return null;
        }
        return this.mAdCupNative.getMediaiView(this.mContext, null);
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    public void prepare(View view, ATNativePrepareInfo aTNativePrepareInfo) {
        List<View> clickViewList = aTNativePrepareInfo.getClickViewList();
        IMultiAdObject iMultiAdObject = this.mAdCupNative;
        if (iMultiAdObject == null || !(view instanceof ViewGroup)) {
            return;
        }
        iMultiAdObject.bindEvent((ViewGroup) view, clickViewList, new IMultiAdObject.ADEventListener() { // from class: com.qumeng.overseas.advlib.topon.natives.AdxNativeWrapper.3
            @Override // com.qumeng.overseas.advlib.core.IMultiAdObject.ADEventListener
            public void onADExposed() {
                Log.d(AdxNativeWrapper.TAG, "onADExposed: ");
                AdxNativeWrapper.this.notifyAdImpression();
            }

            @Override // com.qumeng.overseas.advlib.core.IMultiAdObject.ADEventListener
            public void onAdClick() {
                Log.d(AdxNativeWrapper.TAG, "onAdClick: ");
                AdxNativeWrapper.this.notifyAdClicked();
            }

            @Override // com.qumeng.overseas.advlib.core.IMultiAdObject.ADEventListener
            public void onAdFailed(String str) {
                LoadCallbackListener loadCallbackListener = AdxNativeWrapper.this.mCustomNativeListener;
                if (loadCallbackListener != null) {
                    loadCallbackListener.onFail("", str);
                }
            }
        });
    }
}
