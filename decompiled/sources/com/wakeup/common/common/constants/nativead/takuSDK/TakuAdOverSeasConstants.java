package com.wakeup.common.common.constants.nativead.takuSDK;

import com.wakeup.common.network.entity.ad.AdvertInfoEntity;
import com.wakeup.common.network.entity.ad.TakuOrZhenshuInfoEntity;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TakuAdOverSeasConstants.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\u001a\u0010,\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u00052\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0005J\u0010\u0010/\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u0005H\u0002J\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000501J\u0006\u00102\u001a\u000203J\u000e\u00104\u001a\u0002032\u0006\u0010-\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\u001e\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010 \u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b!\u0010\u0019R\u0011\u0010\"\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b#\u0010\u0019R\u0011\u0010$\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b%\u0010\u0019R\u0011\u0010&\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b'\u0010\u0019R\u0011\u0010(\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b)\u0010\u0019R\u0011\u0010*\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b+\u0010\u0019¨\u00065"}, d2 = {"Lcom/wakeup/common/common/constants/nativead/takuSDK/TakuAdOverSeasConstants;", "", "<init>", "()V", "SOURCE_AD_TAKU", "", "DEFAULT_APP_ID", "DEFAULT_APP_KEY", "DEFAULT_ID_AT_PLACEMENT_SPLASH_COLD", "DEFAULT_ID_AT_PLACEMENT_SPLASH_HOT", "DEFAULT_ID_AT_PLACEMENT_SPLASH_HOT_CACHE", "DEFAULT_ID_AT_PLACEMENT_BANNER", "DEFAULT_ID_AT_PLACEMENT_INSERT", "DEFAULT_ID_AT_PLACEMENT_FEED_VIDEO_TWO", "DEFAULT_ID_AT_PLACEMENT_FEED_VIDEO_FOUR", "DEFAULT_ID_AT_PLACEMENT_FEED_VIDEO_SIX", "placementMap", "", "initAdConfig", "", "takuOrZhenshuInfo", "Lcom/wakeup/common/network/entity/ad/TakuOrZhenshuInfoEntity;", "setDefaultPlacements", "APP_ID", "getAPP_ID", "()Ljava/lang/String;", "APP_KEY", "getAPP_KEY", "ID_AT_PLACEMENT_SPLASH_COLD", "getID_AT_PLACEMENT_SPLASH_COLD", "ID_AT_PLACEMENT_SPLASH_HOT", "getID_AT_PLACEMENT_SPLASH_HOT", "ID_AT_PLACEMENT_SPLASH_HOT_CACHE", "getID_AT_PLACEMENT_SPLASH_HOT_CACHE", "ID_AT_PLACEMENT_BANNER", "getID_AT_PLACEMENT_BANNER", "ID_AT_PLACEMENT_INSERT", "getID_AT_PLACEMENT_INSERT", "ID_AT_PLACEMENT_FEED_VIDEO_TWO", "getID_AT_PLACEMENT_FEED_VIDEO_TWO", "ID_AT_PLACEMENT_FEED_VIDEO_FOUR", "getID_AT_PLACEMENT_FEED_VIDEO_FOUR", "ID_AT_PLACEMENT_FEED_VIDEO_SIX", "getID_AT_PLACEMENT_FEED_VIDEO_SIX", "getPlacementId", "appConventionCode", "defaultPlacementId", "getDefaultPlacementId", "getAllPlacements", "", "isInitialized", "", "isUsingDefaultValue", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TakuAdOverSeasConstants {
    private static final String DEFAULT_APP_ID = "a65581ffe7865d";
    private static final String DEFAULT_APP_KEY = "44ad464dc117b91d4693390ce9abc8d7";
    private static final String DEFAULT_ID_AT_PLACEMENT_BANNER = "b1f64mbv5t3emd";
    private static final String DEFAULT_ID_AT_PLACEMENT_FEED_VIDEO_FOUR = "b691c11aee01f2";
    private static final String DEFAULT_ID_AT_PLACEMENT_FEED_VIDEO_SIX = "b691c11af9dd73";
    private static final String DEFAULT_ID_AT_PLACEMENT_FEED_VIDEO_TWO = "b67777e8b660af";
    private static final String DEFAULT_ID_AT_PLACEMENT_INSERT = "b1f64mbv5t2vp1";
    private static final String DEFAULT_ID_AT_PLACEMENT_SPLASH_COLD = "b1f64mbv5t39cn";
    private static final String DEFAULT_ID_AT_PLACEMENT_SPLASH_HOT = "b1f64mbv5t39cn";
    private static final String DEFAULT_ID_AT_PLACEMENT_SPLASH_HOT_CACHE = "b1hijpblfo1eth";
    public static final String SOURCE_AD_TAKU = "takuad";
    public static final TakuAdOverSeasConstants INSTANCE = new TakuAdOverSeasConstants();
    private static final Map<String, String> placementMap = new LinkedHashMap();

    public final boolean isInitialized() {
        return true;
    }

    private TakuAdOverSeasConstants() {
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
        map.put("open_screen_cold", "b1f64mbv5t39cn");
        map.put("open_screen_hot", "b1f64mbv5t39cn");
        map.put("open_screen_hot_cache", DEFAULT_ID_AT_PLACEMENT_SPLASH_HOT_CACHE);
        map.put("banner", DEFAULT_ID_AT_PLACEMENT_BANNER);
        map.put("insert_screen", DEFAULT_ID_AT_PLACEMENT_INSERT);
        map.put("feed2", DEFAULT_ID_AT_PLACEMENT_FEED_VIDEO_TWO);
        map.put("feed4", DEFAULT_ID_AT_PLACEMENT_FEED_VIDEO_FOUR);
        map.put("feed6", DEFAULT_ID_AT_PLACEMENT_FEED_VIDEO_SIX);
    }

    public final String getAPP_ID() {
        String str = placementMap.get("app_id");
        return str == null ? DEFAULT_APP_ID : str;
    }

    public final String getAPP_KEY() {
        String str = placementMap.get("app_key");
        return str == null ? DEFAULT_APP_KEY : str;
    }

    public final String getID_AT_PLACEMENT_SPLASH_COLD() {
        String str = placementMap.get("open_screen_cold");
        return str == null ? "b1f64mbv5t39cn" : str;
    }

    public final String getID_AT_PLACEMENT_SPLASH_HOT() {
        String str = placementMap.get("open_screen_hot");
        return str == null ? "b1f64mbv5t39cn" : str;
    }

    public final String getID_AT_PLACEMENT_SPLASH_HOT_CACHE() {
        String str = placementMap.get("open_screen_hot_cache");
        return str == null ? DEFAULT_ID_AT_PLACEMENT_SPLASH_HOT_CACHE : str;
    }

    public final String getID_AT_PLACEMENT_BANNER() {
        String str = placementMap.get("banner");
        return str == null ? DEFAULT_ID_AT_PLACEMENT_BANNER : str;
    }

    public final String getID_AT_PLACEMENT_INSERT() {
        String str = placementMap.get("insert_screen");
        return str == null ? DEFAULT_ID_AT_PLACEMENT_INSERT : str;
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

    public static /* synthetic */ String getPlacementId$default(TakuAdOverSeasConstants takuAdOverSeasConstants, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return takuAdOverSeasConstants.getPlacementId(str, str2);
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
            case -1889636254:
                if (appConventionCode.equals("open_screen_cold")) {
                    return "b1f64mbv5t39cn";
                }
                break;
            case -1425869230:
                if (appConventionCode.equals("open_screen_hot_cache")) {
                    return DEFAULT_ID_AT_PLACEMENT_SPLASH_HOT_CACHE;
                }
                break;
            case -1396342996:
                if (appConventionCode.equals("banner")) {
                    return DEFAULT_ID_AT_PLACEMENT_BANNER;
                }
                break;
            case -375379790:
                if (appConventionCode.equals("insert_screen")) {
                    return DEFAULT_ID_AT_PLACEMENT_INSERT;
                }
                break;
            case 1463069455:
                if (appConventionCode.equals("open_screen_hot")) {
                    return "b1f64mbv5t39cn";
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
