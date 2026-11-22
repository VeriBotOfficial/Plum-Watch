package com.wakeup.feature.device.aiAlbum.utils;

import com.wakeup.common.storage.CacheManager;
import kotlin.Metadata;

/* compiled from: AigcAlbumDeviceHelper.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/wakeup/feature/device/aiAlbum/utils/AigcAlbumDeviceHelper;", "", "<init>", "()V", AigcAlbumDeviceHelper.AI_GC_ALBUM_MAX_KEY, "", "saveAiGcAlbumMaxSize", "", "maxSize", "", "getAiGcAlbumMaxSize", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AigcAlbumDeviceHelper {
    private static final String AI_GC_ALBUM_MAX_KEY = "AI_GC_ALBUM_MAX_KEY";
    public static final AigcAlbumDeviceHelper INSTANCE = new AigcAlbumDeviceHelper();

    private AigcAlbumDeviceHelper() {
    }

    public final void saveAiGcAlbumMaxSize(int maxSize) {
        CacheManager.INSTANCE.saveInt(AI_GC_ALBUM_MAX_KEY, maxSize);
    }

    public final int getAiGcAlbumMaxSize() {
        return CacheManager.INSTANCE.getInt(AI_GC_ALBUM_MAX_KEY);
    }
}
