package com.wakeup.module.jacket.utils;

import com.wakeup.common.utils.AppPath;
import kotlin.Metadata;

/* compiled from: FileCachePath.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"JACKET_CAMERA_DIR", "", "getJACKET_CAMERA_DIR", "()Ljava/lang/String;", "feature-jacket_overseasRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FileCachePathKt {
    private static final String JACKET_CAMERA_DIR = AppPath.getAiFileDir() + "camera/";

    public static final String getJACKET_CAMERA_DIR() {
        return JACKET_CAMERA_DIR;
    }
}
