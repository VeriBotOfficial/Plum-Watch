package com.wakeup.howear.startup.ad;

import com.autonavi.aps.amapapi.config.Const;
import com.wakeup.common.common.constants.nativead.AdOverSeasZoneConfigManager;
import com.wakeup.common.common.constants.nativead.AdZoneConfigManager;
import com.wakeup.common.common.constants.nativead.takuSDK.TakuAdConstants;
import com.wakeup.common.network.entity.ad.AdPlatformInfoEntity;
import com.wakeup.common.network.entity.ad.InfomecialZoonsEntity;
import com.wakeup.common.network.entity.ad.TakuOrZhenshuInfoEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdConfigApplier.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/wakeup/howear/startup/ad/AdConfigApplier;", "", "<init>", "()V", "apply", "", Const.LBS_FAIL_BD_ENTITY, "Lcom/wakeup/common/network/entity/ad/AdPlatformInfoEntity;", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AdConfigApplier {
    public static final AdConfigApplier INSTANCE = new AdConfigApplier();

    private AdConfigApplier() {
    }

    public final void apply(AdPlatformInfoEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        TakuOrZhenshuInfoEntity takuOrZhenshuInfo = entity.getTakuOrZhenshuInfo();
        if (takuOrZhenshuInfo != null) {
            TakuAdConstants.INSTANCE.initAdConfig(takuOrZhenshuInfo);
        }
        List<InfomecialZoonsEntity> infomecialZoons = entity.getInfomecialZoons();
        if (infomecialZoons != null) {
            if (infomecialZoons.isEmpty()) {
                infomecialZoons = null;
            }
            if (infomecialZoons != null) {
                AdZoneConfigManager.INSTANCE.initAdZoneConfig(infomecialZoons);
            }
        }
        Integer feedAdvertisingNum = entity.getFeedAdvertisingNum();
        if (feedAdvertisingNum != null) {
            AdOverSeasZoneConfigManager.INSTANCE.setFeedAdvertisingNum(Integer.valueOf(feedAdvertisingNum.intValue()));
        }
    }
}
