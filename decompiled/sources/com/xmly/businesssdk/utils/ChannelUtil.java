package com.xmly.businesssdk.utils;

import com.autonavi.aps.amapapi.config.Const;
import com.facebook.hermes.intl.Constants;
import com.xmly.businesssdk.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChannelUtil.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u000f\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\rJ\u0006\u0010\u0011\u001a\u00020\rJ\u0006\u0010\u0012\u001a\u00020\rJ\u0006\u0010\u0013\u001a\u00020\rJ\u0006\u0010\u0014\u001a\u00020\rJ\u0006\u0010\u0015\u001a\u00020\rJ\u0006\u0010\u0016\u001a\u00020\rJ\u0006\u0010\u0017\u001a\u00020\rJ\u0006\u0010\u0018\u001a\u00020\rJ\u0006\u0010\u0019\u001a\u00020\rJ\u0006\u0010\u001a\u001a\u00020\rJ\u0006\u0010\u001b\u001a\u00020\rJ\u0006\u0010\u001c\u001a\u00020\rJ\u0006\u0010\u001d\u001a\u00020\rJ\u0006\u0010\u001e\u001a\u00020\rJ\u0006\u0010\u001f\u001a\u00020\r¨\u0006 "}, d2 = {"Lcom/xmly/businesssdk/utils/ChannelUtil;", "", "()V", "getApiDomain", "", "getAppKey", "getChannelId", "getChannelName", "getChannelScheme", "getDefaultListenPackageId", "getSN", "getSecret", "isBaseusChannel", "", "isCodingChannel", "isCommonChannel", "isFengyuChannel", "isFzsChannel", "isHaobaiChannel", "isHonorChannel", "isMaokingChannel", "isNajingyunChannel", "isNoetixChannel", "isOnemoreChannel", "isPlayerEnabled", "isRrtingChannel", "isStandardChannel", "isTencentChannel", "isTopstepChannel", "isUcChannel", "isWakeChannel", "isYidabaoChannel", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ChannelUtil {
    public static final ChannelUtil INSTANCE = new ChannelUtil();

    private ChannelUtil() {
    }

    public final String getApiDomain() {
        return BuildConfig.API_DOMAIN;
    }

    public final String getAppKey() {
        return BuildConfig.APP_KEY;
    }

    public final String getChannelId() {
        return "wake";
    }

    public final String getChannelName() {
        return "wake";
    }

    public final String getChannelScheme() {
        return "wake";
    }

    public final String getDefaultListenPackageId() {
        return "";
    }

    public final String getSN() {
        return BuildConfig.SN;
    }

    public final String getSecret() {
        return BuildConfig.SECRET;
    }

    public final boolean isBaseusChannel() {
        return Intrinsics.areEqual(getChannelName(), "baseus");
    }

    public final boolean isCodingChannel() {
        return Intrinsics.areEqual(getChannelName(), "coding");
    }

    public final boolean isCommonChannel() {
        return Intrinsics.areEqual(getChannelScheme(), "common");
    }

    public final boolean isFengyuChannel() {
        return Intrinsics.areEqual(getChannelName(), "fengyu");
    }

    public final boolean isFzsChannel() {
        return Intrinsics.areEqual(getChannelName(), "fzs");
    }

    public final boolean isHaobaiChannel() {
        return Intrinsics.areEqual(getChannelName(), "haobai");
    }

    public final boolean isHonorChannel() {
        return Intrinsics.areEqual(getChannelName(), Const.BRAND_HONOR);
    }

    public final boolean isMaokingChannel() {
        return Intrinsics.areEqual(getChannelName(), "maoking");
    }

    public final boolean isNajingyunChannel() {
        return Intrinsics.areEqual(getChannelName(), "najingyun");
    }

    public final boolean isNoetixChannel() {
        return Intrinsics.areEqual(getChannelName(), "noetix");
    }

    public final boolean isOnemoreChannel() {
        return Intrinsics.areEqual(getChannelName(), "onemore");
    }

    public final boolean isPlayerEnabled() {
        Boolean ENABLE_PLAYER = BuildConfig.ENABLE_PLAYER;
        Intrinsics.checkNotNullExpressionValue(ENABLE_PLAYER, "ENABLE_PLAYER");
        return ENABLE_PLAYER.booleanValue();
    }

    public final boolean isRrtingChannel() {
        return Intrinsics.areEqual(getChannelName(), "rrting");
    }

    public final boolean isStandardChannel() {
        return Intrinsics.areEqual(getChannelScheme(), Constants.COLLATION_STANDARD);
    }

    public final boolean isTencentChannel() {
        return Intrinsics.areEqual(getChannelName(), "tencent");
    }

    public final boolean isTopstepChannel() {
        return Intrinsics.areEqual(getChannelName(), "topstep");
    }

    public final boolean isUcChannel() {
        return Intrinsics.areEqual(getChannelName(), "uc");
    }

    public final boolean isWakeChannel() {
        return Intrinsics.areEqual(getChannelName(), "wake");
    }

    public final boolean isYidabaoChannel() {
        return Intrinsics.areEqual(getChannelName(), "yidabao");
    }
}
