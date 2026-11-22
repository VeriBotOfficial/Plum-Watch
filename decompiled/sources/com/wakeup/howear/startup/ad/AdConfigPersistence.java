package com.wakeup.howear.startup.ad;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.autonavi.aps.amapapi.config.Const;
import com.wakeup.common.network.entity.ad.AdPlatformInfoEntity;
import com.wakeup.common.storage.CacheManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdConfigPersistence.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u0011\u001a\u00020\bJ\u0006\u0010\u0012\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/wakeup/howear/startup/ad/AdConfigPersistence;", "", "<init>", "()V", "KEY_ENTITY", "", "KEY_LAST_UPDATE_TIME", "save", "", Const.LBS_FAIL_BD_ENTITY, "Lcom/wakeup/common/network/entity/ad/AdPlatformInfoEntity;", RequestParameters.X_OSS_RESTORE, "hasCache", "", "cacheAgeMs", "", "apply", "applyCachedOrDefault", SDPKeywords.CLEAR, "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AdConfigPersistence {
    public static final AdConfigPersistence INSTANCE = new AdConfigPersistence();
    private static final String KEY_ENTITY = "persist_ad_platform_config";
    private static final String KEY_LAST_UPDATE_TIME = "persist_ad_config_time";

    private AdConfigPersistence() {
    }

    public final void save(AdPlatformInfoEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        CacheManager.INSTANCE.saveData(KEY_ENTITY, entity);
        CacheManager.INSTANCE.saveLong(KEY_LAST_UPDATE_TIME, System.currentTimeMillis());
    }

    public final AdPlatformInfoEntity restore() {
        return (AdPlatformInfoEntity) CacheManager.INSTANCE.getData(KEY_ENTITY, AdPlatformInfoEntity.class);
    }

    public final boolean hasCache() {
        return restore() != null;
    }

    public final long cacheAgeMs() {
        long j = CacheManager.INSTANCE.getLong(KEY_LAST_UPDATE_TIME);
        if (j > 0) {
            return System.currentTimeMillis() - j;
        }
        return -1L;
    }

    public final void apply(AdPlatformInfoEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        AdConfigApplier.INSTANCE.apply(entity);
    }

    public final void applyCachedOrDefault() {
        AdPlatformInfoEntity restore = restore();
        if (restore != null) {
            INSTANCE.apply(restore);
        }
    }

    public final void clear() {
        CacheManager.INSTANCE.saveString(KEY_ENTITY, "");
        CacheManager.INSTANCE.saveLong(KEY_LAST_UPDATE_TIME, 0L);
    }
}
