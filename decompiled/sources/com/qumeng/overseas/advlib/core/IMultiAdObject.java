package com.qumeng.overseas.advlib.core;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.qumeng.overseas.advlib.core.AdRequestParam;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes17.dex */
public class IMultiAdObject {
    public static final int MATERIAL_BANNER = 10;
    public static final int MATERIAL_TYPE_BIG_IMAGE = 2;
    public static final int MATERIAL_TYPE_GROUP_IMAGE = 3;
    public static final int MATERIAL_TYPE_SMALL_IMAGE = 1;
    public static final int MATERIAL_TYPE_VIDEO_H = 4;
    public static final int MATERIAL_TYPE_VIDEO_V = 9;
    public static final int PUT_TYPE_DEFAULT = 0;
    public static final int PUT_TYPE_LIVE = 2;
    public static final int PUT_TYPE_NEW = 1;

    public interface ADEventListener {
        void onADExposed();

        void onAdClick();

        void onAdFailed(String str);
    }

    public interface ADStateListener {
        void onAdEvent(int i, Bundle bundle);
    }

    public interface ADVideoEventListener extends ADEventListener {
        void onVideoAdComplete();

        void onVideoAdPaused();

        void onVideoAdPlay();

        void onVideoAdSkip();

        void onVideoError();
    }

    public interface MediaStateListener {
        void onVideoCompleted();

        void onVideoError(Bundle bundle);

        void onVideoPause();

        void onVideoReady();

        void onVideoResume();

        void onVideoStart();

        void onVideoStop();
    }

    public interface RevenueListener {
        void onRevenue(Bundle bundle);
    }

    public interface SplashEventListener {
        void onAdClicked();

        void onAdFailed(String str);

        void onAdShow();

        void onAdSkip();

        void onAdTimeOver();
    }

    public void bindEvent(ViewGroup viewGroup, QMNativeAdViewBinder qMNativeAdViewBinder, List<View> list, List<View> list2, ADEventListener aDEventListener) {
    }

    public void bindEvent(ViewGroup viewGroup, String str, QMNativeAdViewBinder qMNativeAdViewBinder, List<View> list, List<View> list2, ADEventListener aDEventListener) {
    }

    public void bindEvent(ViewGroup viewGroup, String str, List<View> list, ADEventListener aDEventListener) {
    }

    public void bindEvent(ViewGroup viewGroup, List<View> list, ADEventListener aDEventListener) {
    }

    public void bindView(ViewGroup viewGroup, ADEventListener aDEventListener) {
    }

    public void bindView(ViewGroup viewGroup, String str, ADEventListener aDEventListener) {
    }

    public ICliBundle convert2ICliBundle() {
        return null;
    }

    public void destroy() {
    }

    public String getAdFrom() {
        return "";
    }

    public View getAdLogoView(Context context) {
        return null;
    }

    public String getAdSrc() {
        return "";
    }

    public String getAdm() {
        return "";
    }

    public AppInformation getAppInformation() {
        return null;
    }

    @Deprecated
    public String getAppLogoUrl() {
        return "";
    }

    @Deprecated
    public String getAppName() {
        return "";
    }

    public String getAppPackageName() {
        return "";
    }

    public String getCallToAction() {
        return "View";
    }

    public String getDesc() {
        return "";
    }

    public String getDoMain() {
        return "";
    }

    public int getECPM() {
        return 0;
    }

    public Map<String, Object> getExtraInfo() {
        return null;
    }

    public View getIconView(Context context) {
        return null;
    }

    public List<String> getImageUrls() {
        return new ArrayList();
    }

    public int getInteractionType() {
        return 0;
    }

    public String getLandingPageUrl() {
        return "";
    }

    public String getMainImageUrl() {
        return "";
    }

    public int getMaterialType() {
        return 0;
    }

    public Pair<Integer, Integer> getMediaSize() {
        return null;
    }

    public View getMediaiView(Context context, ViewGroup viewGroup) {
        return null;
    }

    public int getPutType() {
        return 0;
    }

    public String getRequestId() {
        return "";
    }

    public int getResidualCacheTime() {
        return 0;
    }

    public String getTitle() {
        return "";
    }

    public int getTotalCacheTime() {
        return 0;
    }

    public View getTwistView(Context context) {
        return null;
    }

    public int getVideoDuration() {
        return 0;
    }

    public String getWarning() {
        return "";
    }

    public boolean isExpired() {
        return false;
    }

    public boolean isReady() {
        return true;
    }

    public void lossNotice(int i, String str, String str2) {
    }

    public void onShowBanner(ViewGroup viewGroup, AdRequestParam.ADBannerListener aDBannerListener) {
    }

    public void onShowBanner(ViewGroup viewGroup, String str, AdRequestParam.ADBannerListener aDBannerListener) {
    }

    public void setADStateListener(ADStateListener aDStateListener) {
    }

    public void setOnMediaStateListener(MediaStateListener mediaStateListener) {
    }

    public void setRevenueListener(RevenueListener revenueListener) {
    }

    public void showInteractionAd(Activity activity, AdRequestParam.ADInteractionListener aDInteractionListener) {
    }

    public void showInteractionAd(Activity activity, String str, AdRequestParam.ADInteractionListener aDInteractionListener) {
    }

    public void showRewardVideo(Activity activity, AdRequestParam.ADRewardVideoListener aDRewardVideoListener) {
    }

    public void showRewardVideo(Activity activity, String str, AdRequestParam.ADRewardVideoListener aDRewardVideoListener) {
    }

    public void showSplashView(ViewGroup viewGroup, SplashEventListener splashEventListener) {
    }

    public void showSplashView(ViewGroup viewGroup, String str, SplashEventListener splashEventListener) {
    }

    public void winNotice(int i) {
    }
}
