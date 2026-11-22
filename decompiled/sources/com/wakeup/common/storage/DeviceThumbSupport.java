package com.wakeup.common.storage;

import com.wakeup.common.log.LogUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceThumbSupport.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0007J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/wakeup/common/storage/DeviceThumbSupport;", "", "<init>", "()V", "CACHE_KEY", "", "TYPE_AI_DIAL_PLATE", "", "TYPE_AI_DIAL_ALBUM", "saveType", "", "mac", "type", "isSupport", "", "supportType", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DeviceThumbSupport {
    public static final String CACHE_KEY = "thumb_support_key_";
    public static final DeviceThumbSupport INSTANCE = new DeviceThumbSupport();
    public static final int TYPE_AI_DIAL_ALBUM = 2;
    public static final int TYPE_AI_DIAL_PLATE = 1;

    private DeviceThumbSupport() {
    }

    public final void saveType(String mac, int type) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        CacheManager.INSTANCE.saveInt(CACHE_KEY + mac, type);
    }

    public final boolean isSupport(String mac, int supportType) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        int i = CacheManager.INSTANCE.getInt(CACHE_KEY + mac);
        LogUtils.d("DeviceThumbSupport", "type = " + i);
        return (i & supportType) == supportType;
    }
}
