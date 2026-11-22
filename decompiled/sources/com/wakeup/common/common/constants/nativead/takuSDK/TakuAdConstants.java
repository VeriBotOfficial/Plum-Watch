package com.wakeup.common.common.constants.nativead.takuSDK;

import com.wakeup.common.network.entity.ad.AdvertInfoEntity;
import com.wakeup.common.network.entity.ad.TakuOrZhenshuInfoEntity;
import com.wakeup.commponent.module.ad.ScenarioBannerHelper;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TakuAdConstants.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"J\b\u0010#\u001a\u00020 H\u0002J\u001a\u0010O\u001a\u00020\u00052\u0006\u0010P\u001a\u00020\u00052\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u0005J\u0010\u0010R\u001a\u00020\u00052\u0006\u0010P\u001a\u00020\u0005H\u0002J\u0012\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050TJ\u0006\u0010U\u001a\u00020VJ\u000e\u0010W\u001a\u00020V2\u0006\u0010P\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010$\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0011\u0010)\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b*\u0010&R\u0011\u0010+\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b,\u0010&R\u0011\u0010-\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b.\u0010&R\u0011\u0010/\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b0\u0010&R\u0011\u00101\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b2\u0010&R\u0011\u00103\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b4\u0010&R\u0011\u00105\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b6\u0010&R\u0011\u00107\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b8\u0010&R\u0011\u00109\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b:\u0010&R\u0011\u0010;\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b<\u0010&R\u0011\u0010=\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b>\u0010&R\u0011\u0010?\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b@\u0010&R\u0011\u0010A\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bB\u0010&R\u0011\u0010C\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bD\u0010&R\u0011\u0010E\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bF\u0010&R\u0011\u0010G\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bH\u0010&R\u0011\u0010I\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bJ\u0010&R\u0011\u0010K\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bL\u0010&R\u0011\u0010M\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bN\u0010&¨\u0006X"}, d2 = {"Lcom/wakeup/common/common/constants/nativead/takuSDK/TakuAdConstants;", "", "<init>", "()V", "SOURCE_AD_TAKU", "", "DEFAULT_APP_ID", "DEFAULT_APP_KEY", "DEFAULT_ID_AT_PLACEMENT_SPLASH", "DEFAULT_ID_AT_PLACEMENT_HOT_SPLASH", "DEFAULT_ID_AT_PLACEMENT_SPLASH_LIVE", "DEFAULT_ID_AT_PLACEMENT_REQI_ADS", "DEFAULT_ID_AT_PLACEMENT_WX_SPLASH", "DEFAULT_ID_AT_PLACEMENT_FEED_VIDEO_TWO", "DEFAULT_ID_AT_PLACEMENT_FEED_VIDEO_FOUR", "DEFAULT_ID_AT_PLACEMENT_FEED_VIDEO_SIX", "DEFAULT_ID_AT_PLACEMENT_BANNER_MINE", "DEFAULT_ID_AT_PLACEMENT_BANNER_WATCH_MAIN", "DEFAULT_ID_AT_PLACEMENT_BANNER_DIAL_DETAIL", "DEFAULT_ID_AT_PLACEMENT_BANNER_DIAL_LIST", "DEFAULT_ID_AT_PLACEMENT_BANNER_DIAL_MAIN", "DEFAULT_ID_AT_PLACEMENT_BANNER_DEF_DEVICE", "DEFAULT_ID_AT_PLACEMENT_BANNER_WATCH_DEVICE", "DEFAULT_ID_AT_PLACEMENT_BANNER_WATCH_DEVICE_PAGE", "DEFAULT_ID_AT_PLACEMENT_BANNER_HEALTH_DASH", "DEFAULT_ID_AT_PLACEMENT_BANNER_AI_MUSIC", "DEFAULT_ID_AT_PLACEMENT_NATIVE_DIAL_MAIN", "HOT_CACHE_FILL_SCENARIO", "FEED_SHOWN_REFRESH", "placementMap", "", "initAdConfig", "", "takuOrZhenshuInfo", "Lcom/wakeup/common/network/entity/ad/TakuOrZhenshuInfoEntity;", "setDefaultPlacements", "APP_ID", "getAPP_ID", "()Ljava/lang/String;", "APP_KEY", "getAPP_KEY", "ID_AT_PLACEMENT_FEED_SPLASH", "getID_AT_PLACEMENT_FEED_SPLASH", "ID_AT_PLACEMENT_HOT_SPLASH", "getID_AT_PLACEMENT_HOT_SPLASH", "ID_AT_PLACEMENT_SPLASH_LIVE", "getID_AT_PLACEMENT_SPLASH_LIVE", "ID_AT_PLACEMENT_REQI_ADS", "getID_AT_PLACEMENT_REQI_ADS", "ID_AT_PLACEMENT_WX_SPLASH", "getID_AT_PLACEMENT_WX_SPLASH", "ID_AT_PLACEMENT_FEED_VIDEO_TWO", "getID_AT_PLACEMENT_FEED_VIDEO_TWO", "ID_AT_PLACEMENT_FEED_VIDEO_FOUR", "getID_AT_PLACEMENT_FEED_VIDEO_FOUR", "ID_AT_PLACEMENT_FEED_VIDEO_SIX", "getID_AT_PLACEMENT_FEED_VIDEO_SIX", "ID_ID_AT_PLACEMENT_BANNER_MINE", "getID_ID_AT_PLACEMENT_BANNER_MINE", "ID_ID_AT_PLACEMENT_BANNER_WATCH_MAIN", "getID_ID_AT_PLACEMENT_BANNER_WATCH_MAIN", "ID_AT_AT_PLACEMENT_BANNER_DIAL_DETAIL", "getID_AT_AT_PLACEMENT_BANNER_DIAL_DETAIL", "ID_AT_AT_PLACEMENT_BANNER_DIAL_LIST", "getID_AT_AT_PLACEMENT_BANNER_DIAL_LIST", "ID_AT_AT_PLACEMENT_BANNER_DIAL_MAIN", "getID_AT_AT_PLACEMENT_BANNER_DIAL_MAIN", "ID_AT_AT_PLACEMENT_BANNER_DEF_DEVICE", "getID_AT_AT_PLACEMENT_BANNER_DEF_DEVICE", "ID_AT_AT_PLACEMENT_BANNER_WATCH_DEVICE", "getID_AT_AT_PLACEMENT_BANNER_WATCH_DEVICE", "ID_AT_AT_PLACEMENT_BANNER_WATCH_PAGE", "getID_AT_AT_PLACEMENT_BANNER_WATCH_PAGE", "ID_AT_AT_PLACEMENT_BANNER_HEALTH_DASH", "getID_AT_AT_PLACEMENT_BANNER_HEALTH_DASH", "ID_AT_AT_PLACEMENT_BANNER_AI_MUSIC", "getID_AT_AT_PLACEMENT_BANNER_AI_MUSIC", "ID_AT_AT_PLACEMENT_NATIVE_DIAL_MAIN", "getID_AT_AT_PLACEMENT_NATIVE_DIAL_MAIN", "getPlacementId", "appConventionCode", "defaultPlacementId", "getDefaultPlacementId", "getAllPlacements", "", "isInitialized", "", "isUsingDefaultValue", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TakuAdConstants {
    private static final String DEFAULT_APP_ID = "a69eb0835a4457";
    private static final String DEFAULT_APP_KEY = "aafd7851c40ee841cacc2ce3307ebc43d";
    private static final String DEFAULT_ID_AT_PLACEMENT_BANNER_AI_MUSIC = "b1ho3sk7iveh2t";
    private static final String DEFAULT_ID_AT_PLACEMENT_BANNER_DEF_DEVICE = "b6ab347acba832";
    private static final String DEFAULT_ID_AT_PLACEMENT_BANNER_DIAL_DETAIL = "b6a951fc39ba28";
    private static final String DEFAULT_ID_AT_PLACEMENT_BANNER_DIAL_LIST = "b6a951fc313ca1";
    private static final String DEFAULT_ID_AT_PLACEMENT_BANNER_DIAL_MAIN = "b6a951fc2803bb";
    private static final String DEFAULT_ID_AT_PLACEMENT_BANNER_HEALTH_DASH = "b1hniir3psqba1";
    private static final String DEFAULT_ID_AT_PLACEMENT_BANNER_MINE = "b6a951fc1d8661";
    private static final String DEFAULT_ID_AT_PLACEMENT_BANNER_WATCH_DEVICE = "b6ab347ad289f3";
    private static final String DEFAULT_ID_AT_PLACEMENT_BANNER_WATCH_DEVICE_PAGE = "b6ac84f18d91de";
    private static final String DEFAULT_ID_AT_PLACEMENT_BANNER_WATCH_MAIN = "b6ac9a94f89862";
    private static final String DEFAULT_ID_AT_PLACEMENT_FEED_VIDEO_FOUR = "b69eb115629124";
    private static final String DEFAULT_ID_AT_PLACEMENT_FEED_VIDEO_SIX = "b69eb1156cff5d";
    private static final String DEFAULT_ID_AT_PLACEMENT_FEED_VIDEO_TWO = "b69eb1155824ab";
    private static final String DEFAULT_ID_AT_PLACEMENT_HOT_SPLASH = "b6a5f1acf8e493";
    private static final String DEFAULT_ID_AT_PLACEMENT_NATIVE_DIAL_MAIN = "b6a9f7daf2a56e";
    private static final String DEFAULT_ID_AT_PLACEMENT_REQI_ADS = "b6ae2afe93c660";
    private static final String DEFAULT_ID_AT_PLACEMENT_SPLASH = "b69eb1154e9769";
    private static final String DEFAULT_ID_AT_PLACEMENT_SPLASH_LIVE = "b6acc9b837d6dc";
    private static final String DEFAULT_ID_AT_PLACEMENT_WX_SPLASH = "b6a5f146fce564";
    public static final String FEED_SHOWN_REFRESH = "feed_refresh";
    public static final String HOT_CACHE_FILL_SCENARIO = "hot_cache_fill";
    public static final String SOURCE_AD_TAKU = "takuad";
    public static final TakuAdConstants INSTANCE = new TakuAdConstants();
    private static final Map<String, String> placementMap = new LinkedHashMap();

    public final boolean isInitialized() {
        return true;
    }

    private TakuAdConstants() {
    }

    public final void initAdConfig(TakuOrZhenshuInfoEntity takuOrZhenshuInfo) {
        Map<String, String> map = placementMap;
        map.clear();
        setDefaultPlacements();
        if (takuOrZhenshuInfo != null) {
            String appId = takuOrZhenshuInfo.getAppId();
            if (appId == null) {
                appId = DEFAULT_APP_ID;
            }
            map.put("app_id", appId);
            String appKey = takuOrZhenshuInfo.getAppKey();
            if (appKey == null) {
                appKey = DEFAULT_APP_KEY;
            }
            map.put("app_key", appKey);
            List<AdvertInfoEntity> adverInfoList = takuOrZhenshuInfo.getAdverInfoList();
            if (adverInfoList != null) {
                for (AdvertInfoEntity advertInfoEntity : adverInfoList) {
                    String appConventionCode = advertInfoEntity.getAppConventionCode();
                    String advertisingSpaceCode = advertInfoEntity.getAdvertisingSpaceCode();
                    if (appConventionCode != null && advertisingSpaceCode != null) {
                        placementMap.put(appConventionCode, advertisingSpaceCode);
                    }
                }
            }
        }
    }

    private final void setDefaultPlacements() {
        Map<String, String> map = placementMap;
        map.put("open_screen", DEFAULT_ID_AT_PLACEMENT_SPLASH);
        map.put("open_screen_hot", DEFAULT_ID_AT_PLACEMENT_HOT_SPLASH);
        map.put("open_screen_live", DEFAULT_ID_AT_PLACEMENT_SPLASH_LIVE);
        map.put("open_screen_reqi", DEFAULT_ID_AT_PLACEMENT_REQI_ADS);
        map.put("open_screen_wx", DEFAULT_ID_AT_PLACEMENT_WX_SPLASH);
        map.put("feed2", DEFAULT_ID_AT_PLACEMENT_FEED_VIDEO_TWO);
        map.put("feed4", DEFAULT_ID_AT_PLACEMENT_FEED_VIDEO_FOUR);
        map.put("feed6", DEFAULT_ID_AT_PLACEMENT_FEED_VIDEO_SIX);
        map.put(ScenarioBannerHelper.SCENE_MINE, DEFAULT_ID_AT_PLACEMENT_BANNER_MINE);
        map.put(ScenarioBannerHelper.SCENE_WATCH_MAIN, DEFAULT_ID_AT_PLACEMENT_BANNER_WATCH_MAIN);
        map.put(ScenarioBannerHelper.SCENE_DIAL_DETAIL, DEFAULT_ID_AT_PLACEMENT_BANNER_DIAL_DETAIL);
        map.put(ScenarioBannerHelper.SCENE_DIAL_MORE_LIST, DEFAULT_ID_AT_PLACEMENT_BANNER_DIAL_LIST);
        map.put(ScenarioBannerHelper.SCENE_DIAL_MAIN, DEFAULT_ID_AT_PLACEMENT_BANNER_DIAL_MAIN);
        map.put(ScenarioBannerHelper.SCENE_DEF_DEVICE, DEFAULT_ID_AT_PLACEMENT_BANNER_DEF_DEVICE);
        map.put(ScenarioBannerHelper.SCENE_WATCH_DEVICE, DEFAULT_ID_AT_PLACEMENT_BANNER_WATCH_DEVICE);
        map.put(ScenarioBannerHelper.SCENE_WATCH_PAGE, DEFAULT_ID_AT_PLACEMENT_BANNER_WATCH_DEVICE_PAGE);
        map.put(ScenarioBannerHelper.SCENE_HEALTH_DASH, DEFAULT_ID_AT_PLACEMENT_BANNER_HEALTH_DASH);
        map.put(ScenarioBannerHelper.SCENE_AI_MUSIC, DEFAULT_ID_AT_PLACEMENT_BANNER_AI_MUSIC);
        map.put("native_dial_main", DEFAULT_ID_AT_PLACEMENT_NATIVE_DIAL_MAIN);
    }

    public final String getAPP_ID() {
        String str = placementMap.get("app_id");
        return str == null ? DEFAULT_APP_ID : str;
    }

    public final String getAPP_KEY() {
        String str = placementMap.get("app_key");
        return str == null ? DEFAULT_APP_KEY : str;
    }

    public final String getID_AT_PLACEMENT_FEED_SPLASH() {
        String str = placementMap.get("open_screen");
        return str == null ? DEFAULT_ID_AT_PLACEMENT_SPLASH : str;
    }

    public final String getID_AT_PLACEMENT_HOT_SPLASH() {
        String str = placementMap.get("open_screen_hot");
        return str == null ? DEFAULT_ID_AT_PLACEMENT_HOT_SPLASH : str;
    }

    public final String getID_AT_PLACEMENT_SPLASH_LIVE() {
        String str = placementMap.get("open_screen_hot_live");
        return str == null ? DEFAULT_ID_AT_PLACEMENT_SPLASH_LIVE : str;
    }

    public final String getID_AT_PLACEMENT_REQI_ADS() {
        String str = placementMap.get("open_screen_reqi");
        return str == null ? DEFAULT_ID_AT_PLACEMENT_REQI_ADS : str;
    }

    public final String getID_AT_PLACEMENT_WX_SPLASH() {
        String str = placementMap.get("open_screen_wx");
        return str == null ? DEFAULT_ID_AT_PLACEMENT_WX_SPLASH : str;
    }

    public final String getID_AT_PLACEMENT_FEED_VIDEO_TWO() {
        String str = placementMap.get("feed2");
        return str == null ? DEFAULT_ID_AT_PLACEMENT_FEED_VIDEO_TWO : str;
    }

    public final String getID_AT_PLACEMENT_FEED_VIDEO_FOUR() {
        String str = placementMap.get("feed4");
        return str == null ? DEFAULT_ID_AT_PLACEMENT_FEED_VIDEO_FOUR : str;
    }

    public final String getID_AT_PLACEMENT_FEED_VIDEO_SIX() {
        String str = placementMap.get("feed6");
        return str == null ? DEFAULT_ID_AT_PLACEMENT_FEED_VIDEO_SIX : str;
    }

    public final String getID_ID_AT_PLACEMENT_BANNER_MINE() {
        String str = placementMap.get(ScenarioBannerHelper.SCENE_MINE);
        return str == null ? DEFAULT_ID_AT_PLACEMENT_BANNER_MINE : str;
    }

    public final String getID_ID_AT_PLACEMENT_BANNER_WATCH_MAIN() {
        String str = placementMap.get(ScenarioBannerHelper.SCENE_WATCH_MAIN);
        return str == null ? DEFAULT_ID_AT_PLACEMENT_BANNER_WATCH_MAIN : str;
    }

    public final String getID_AT_AT_PLACEMENT_BANNER_DIAL_DETAIL() {
        String str = placementMap.get(ScenarioBannerHelper.SCENE_DIAL_DETAIL);
        return str == null ? DEFAULT_ID_AT_PLACEMENT_BANNER_DIAL_DETAIL : str;
    }

    public final String getID_AT_AT_PLACEMENT_BANNER_DIAL_LIST() {
        String str = placementMap.get(ScenarioBannerHelper.SCENE_DIAL_MORE_LIST);
        return str == null ? DEFAULT_ID_AT_PLACEMENT_BANNER_DIAL_LIST : str;
    }

    public final String getID_AT_AT_PLACEMENT_BANNER_DIAL_MAIN() {
        String str = placementMap.get(ScenarioBannerHelper.SCENE_DIAL_MAIN);
        return str == null ? DEFAULT_ID_AT_PLACEMENT_BANNER_DIAL_MAIN : str;
    }

    public final String getID_AT_AT_PLACEMENT_BANNER_DEF_DEVICE() {
        String str = placementMap.get(ScenarioBannerHelper.SCENE_DEF_DEVICE);
        return str == null ? DEFAULT_ID_AT_PLACEMENT_BANNER_DEF_DEVICE : str;
    }

    public final String getID_AT_AT_PLACEMENT_BANNER_WATCH_DEVICE() {
        String str = placementMap.get(ScenarioBannerHelper.SCENE_WATCH_DEVICE);
        return str == null ? DEFAULT_ID_AT_PLACEMENT_BANNER_WATCH_DEVICE : str;
    }

    public final String getID_AT_AT_PLACEMENT_BANNER_WATCH_PAGE() {
        String str = placementMap.get(ScenarioBannerHelper.SCENE_WATCH_PAGE);
        return str == null ? DEFAULT_ID_AT_PLACEMENT_BANNER_WATCH_DEVICE_PAGE : str;
    }

    public final String getID_AT_AT_PLACEMENT_BANNER_HEALTH_DASH() {
        String str = placementMap.get(ScenarioBannerHelper.SCENE_HEALTH_DASH);
        return str == null ? DEFAULT_ID_AT_PLACEMENT_BANNER_HEALTH_DASH : str;
    }

    public final String getID_AT_AT_PLACEMENT_BANNER_AI_MUSIC() {
        String str = placementMap.get(ScenarioBannerHelper.SCENE_AI_MUSIC);
        return str == null ? DEFAULT_ID_AT_PLACEMENT_BANNER_AI_MUSIC : str;
    }

    public final String getID_AT_AT_PLACEMENT_NATIVE_DIAL_MAIN() {
        String str = placementMap.get("native_dial_main");
        return str == null ? DEFAULT_ID_AT_PLACEMENT_NATIVE_DIAL_MAIN : str;
    }

    public static /* synthetic */ String getPlacementId$default(TakuAdConstants takuAdConstants, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return takuAdConstants.getPlacementId(str, str2);
    }

    public final String getPlacementId(String appConventionCode, String defaultPlacementId) {
        Intrinsics.checkNotNullParameter(appConventionCode, "appConventionCode");
        String str = placementMap.get(appConventionCode);
        return str == null ? defaultPlacementId == null ? getDefaultPlacementId(appConventionCode) : defaultPlacementId : str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    private final String getDefaultPlacementId(String appConventionCode) {
        switch (appConventionCode.hashCode()) {
            case -1907033722:
                if (appConventionCode.equals(ScenarioBannerHelper.SCENE_MINE)) {
                    return DEFAULT_ID_AT_PLACEMENT_BANNER_MINE;
                }
                break;
            case -1889373590:
                if (appConventionCode.equals("open_screen_live")) {
                    return DEFAULT_ID_AT_PLACEMENT_SPLASH_LIVE;
                }
                break;
            case -1889198839:
                if (appConventionCode.equals("open_screen_reqi")) {
                    return DEFAULT_ID_AT_PLACEMENT_REQI_ADS;
                }
                break;
            case -996899300:
                if (appConventionCode.equals(ScenarioBannerHelper.SCENE_WATCH_MAIN)) {
                    return DEFAULT_ID_AT_PLACEMENT_BANNER_WATCH_MAIN;
                }
                break;
            case -996809998:
                if (appConventionCode.equals(ScenarioBannerHelper.SCENE_WATCH_PAGE)) {
                    return DEFAULT_ID_AT_PLACEMENT_BANNER_WATCH_DEVICE_PAGE;
                }
                break;
            case -496102919:
                if (appConventionCode.equals(ScenarioBannerHelper.SCENE_WATCH_DEVICE)) {
                    return DEFAULT_ID_AT_PLACEMENT_BANNER_WATCH_DEVICE;
                }
                break;
            case -91351073:
                if (appConventionCode.equals("open_screen_wx")) {
                    return DEFAULT_ID_AT_PLACEMENT_WX_SPLASH;
                }
                break;
            case -60698623:
                if (appConventionCode.equals("open_screen")) {
                    return DEFAULT_ID_AT_PLACEMENT_SPLASH;
                }
                break;
            case 97308244:
                if (appConventionCode.equals("feed2")) {
                    return DEFAULT_ID_AT_PLACEMENT_FEED_VIDEO_TWO;
                }
                break;
            case 97308246:
                if (appConventionCode.equals("feed4")) {
                    return DEFAULT_ID_AT_PLACEMENT_FEED_VIDEO_FOUR;
                }
                break;
            case 97308248:
                if (appConventionCode.equals("feed6")) {
                    return DEFAULT_ID_AT_PLACEMENT_FEED_VIDEO_SIX;
                }
                break;
            case 152150785:
                if (appConventionCode.equals(ScenarioBannerHelper.SCENE_AI_MUSIC)) {
                    return DEFAULT_ID_AT_PLACEMENT_BANNER_AI_MUSIC;
                }
                break;
            case 351550210:
                if (appConventionCode.equals(ScenarioBannerHelper.SCENE_HEALTH_DASH)) {
                    return DEFAULT_ID_AT_PLACEMENT_BANNER_HEALTH_DASH;
                }
                break;
            case 892127085:
                if (appConventionCode.equals(ScenarioBannerHelper.SCENE_DIAL_DETAIL)) {
                    return DEFAULT_ID_AT_PLACEMENT_BANNER_DIAL_DETAIL;
                }
                break;
            case 1020163770:
                if (appConventionCode.equals(ScenarioBannerHelper.SCENE_DIAL_MORE_LIST)) {
                    return DEFAULT_ID_AT_PLACEMENT_BANNER_DIAL_LIST;
                }
                break;
            case 1020185557:
                if (appConventionCode.equals(ScenarioBannerHelper.SCENE_DIAL_MAIN)) {
                    return DEFAULT_ID_AT_PLACEMENT_BANNER_DIAL_MAIN;
                }
                break;
            case 1463069455:
                if (appConventionCode.equals("open_screen_hot")) {
                    return DEFAULT_ID_AT_PLACEMENT_HOT_SPLASH;
                }
                break;
            case 1702343424:
                if (appConventionCode.equals("native_dial_main")) {
                    return DEFAULT_ID_AT_PLACEMENT_NATIVE_DIAL_MAIN;
                }
                break;
            case 1808718531:
                if (appConventionCode.equals(ScenarioBannerHelper.SCENE_DEF_DEVICE)) {
                    return DEFAULT_ID_AT_PLACEMENT_BANNER_DEF_DEVICE;
                }
                break;
        }
        throw new IllegalArgumentException("未知的广告位代码: " + appConventionCode);
    }

    public final Map<String, String> getAllPlacements() {
        return MapsKt.toMap(placementMap);
    }

    public final boolean isUsingDefaultValue(String appConventionCode) {
        Intrinsics.checkNotNullParameter(appConventionCode, "appConventionCode");
        return Intrinsics.areEqual(placementMap.get(appConventionCode), getDefaultPlacementId(appConventionCode));
    }
}
