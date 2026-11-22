package com.wakeup.module.video.utils;

import java.util.Formatter;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TrimVideoUtils.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/wakeup/module/video/utils/TrimVideoUtils;", "", "<init>", "()V", "stringForTime", "", "timeMs", "", "module-video_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TrimVideoUtils {
    public static final TrimVideoUtils INSTANCE = new TrimVideoUtils();

    private TrimVideoUtils() {
    }

    public final String stringForTime(float timeMs) {
        int i = (int) (timeMs / 1000);
        int i2 = i % 60;
        int i3 = (i / 60) % 60;
        int i4 = i / 3600;
        Formatter formatter = new Formatter(Locale.ENGLISH);
        if (i4 > 0) {
            String formatter2 = formatter.format("%d:%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i3), Integer.valueOf(i2)).toString();
            Intrinsics.checkNotNull(formatter2);
            return formatter2;
        }
        String formatter3 = formatter.format("%02d:%02d", Integer.valueOf(i3), Integer.valueOf(i2)).toString();
        Intrinsics.checkNotNull(formatter3);
        return formatter3;
    }
}
