package com.wakeup.common.ab;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: AbTestHelper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/wakeup/common/ab/AbTestHelper;", "", "<init>", "()V", "Companion", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AbTestHelper {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    public static final int hotCacheFillTimeInterval() {
        return INSTANCE.hotCacheFillTimeInterval();
    }

    @JvmStatic
    public static final boolean isBenefitsEnabled() {
        return INSTANCE.isBenefitsEnabled();
    }

    @JvmStatic
    public static final boolean isFeedAdRefresh() {
        return INSTANCE.isFeedAdRefresh();
    }

    @JvmStatic
    public static final int isHotCacheFill() {
        return INSTANCE.isHotCacheFill();
    }

    @JvmStatic
    public static final boolean isSkipNotificationEnabled() {
        return INSTANCE.isSkipNotificationEnabled();
    }

    @JvmStatic
    public static final boolean isSplashLive() {
        return INSTANCE.isSplashLive();
    }

    @JvmStatic
    public static final boolean isStepCalorieNotifyEnabled() {
        return INSTANCE.isStepCalorieNotifyEnabled();
    }

    @JvmStatic
    public static final boolean isStepNotifyClickJumpMainEnabled() {
        return INSTANCE.isStepNotifyClickJumpMainEnabled();
    }

    @JvmStatic
    public static final boolean isStepNotifyJumpMainPageEnabled() {
        return INSTANCE.isStepNotifyJumpMainPageEnabled();
    }

    @JvmStatic
    public static final boolean isStepNotifyRestoreEnabled() {
        return INSTANCE.isStepNotifyRestoreEnabled();
    }

    @JvmStatic
    public static final int reqiAdsTimeIntervalMs() {
        return INSTANCE.reqiAdsTimeIntervalMs();
    }

    @JvmStatic
    public static final int splashLiveTimeInterval() {
        return INSTANCE.splashLiveTimeInterval();
    }

    /* compiled from: AbTestHelper.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\b\u0010\u0006\u001a\u00020\u0005H\u0007J\b\u0010\u0007\u001a\u00020\u0005H\u0007J\b\u0010\b\u001a\u00020\u0005H\u0007J\b\u0010\t\u001a\u00020\u0005H\u0007J\b\u0010\n\u001a\u00020\u0005H\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\fH\u0007J\b\u0010\u000e\u001a\u00020\u0005H\u0007J\b\u0010\u000f\u001a\u00020\fH\u0007J\b\u0010\u0010\u001a\u00020\fH\u0007J\b\u0010\u0011\u001a\u00020\u0005H\u0007J\b\u0010\u0012\u001a\u00020\u0005H\u0007¨\u0006\u0013"}, d2 = {"Lcom/wakeup/common/ab/AbTestHelper$Companion;", "", "<init>", "()V", "getConnectionPoolKeepAlive", "", "isSkipNotificationEnabled", "isStepCalorieNotifyEnabled", "isStepNotifyRestoreEnabled", "isStepNotifyJumpMainPageEnabled", "isStepNotifyClickJumpMainEnabled", "isHotCacheFill", "", "hotCacheFillTimeInterval", "isSplashLive", "splashLiveTimeInterval", "reqiAdsTimeIntervalMs", "isFeedAdRefresh", "isBenefitsEnabled", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final boolean isBenefitsEnabled() {
            return false;
        }

        private Companion() {
        }

        public final boolean getConnectionPoolKeepAlive() {
            return NorthStarABManager.getABTestBoolean(NorthStartConfigs.ENABLE_CONNECTION_POOL_KEEP_ALIVE, false);
        }

        @JvmStatic
        public final boolean isSkipNotificationEnabled() {
            return NorthStarABManager.getABTestBoolean(NorthStartConfigs.ENABLE_SKIP_NOTIFICATION, false);
        }

        @JvmStatic
        public final boolean isStepCalorieNotifyEnabled() {
            return NorthStarABManager.getABTestBooleanOrCache(NorthStartConfigs.ENABLE_NOTICE_RICH_TEXT, false);
        }

        @JvmStatic
        public final boolean isStepNotifyRestoreEnabled() {
            return NorthStarABManager.getABTestBooleanOrCache(NorthStartConfigs.ENABLE_NOTICE_PERSISTENT, false);
        }

        @JvmStatic
        public final boolean isStepNotifyJumpMainPageEnabled() {
            return NorthStarABManager.getABTestBooleanOrCache(NorthStartConfigs.ENABLE_NOTICE_JUMP_MAIN_PAGE, false);
        }

        @JvmStatic
        public final boolean isStepNotifyClickJumpMainEnabled() {
            return isStepCalorieNotifyEnabled() && isStepNotifyJumpMainPageEnabled();
        }

        @JvmStatic
        public final int isHotCacheFill() {
            return NorthStarABManager.getABTestInt(NorthStartConfigs.ENABLE_HOT_CACHE_FILL, -1);
        }

        @JvmStatic
        public final int hotCacheFillTimeInterval() {
            return NorthStarABManager.getABTestInt(NorthStartConfigs.ENABLE_HOT_CACHE_TIME_INTERVAL, 60) * 1000;
        }

        @JvmStatic
        public final boolean isSplashLive() {
            return NorthStarABManager.getABTestBoolean(NorthStartConfigs.ENABLE_SPLASH_LIVE, false);
        }

        @JvmStatic
        public final int splashLiveTimeInterval() {
            return NorthStarABManager.getABTestInt(NorthStartConfigs.ENABLE_SPLASH_LIVE_TIME_INTERVAL, 300) * 1000;
        }

        @JvmStatic
        public final int reqiAdsTimeIntervalMs() {
            return NorthStarABManager.getABTestInt(NorthStartConfigs.ANDROID_IOS_REQI_ADS_TIME, 300) * 1000;
        }

        @JvmStatic
        public final boolean isFeedAdRefresh() {
            return NorthStarABManager.getABTestBoolean(NorthStartConfigs.ENABLE_FEED_AD_REFRESH, false);
        }
    }
}
