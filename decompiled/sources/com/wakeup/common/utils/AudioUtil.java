package com.wakeup.common.utils;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AudioUtil.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¨\u0006\u000f"}, d2 = {"Lcom/wakeup/common/utils/AudioUtil;", "", "<init>", "()V", "getRecordPcmDuration", "", "filePath", "", "calculatePcmDuration", "", "fileSizeInBytes", "sampleRate", "", "channels", "bitDepth", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AudioUtil {
    public static final AudioUtil INSTANCE = new AudioUtil();

    private AudioUtil() {
    }

    public final long getRecordPcmDuration(String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        return (long) calculatePcmDuration(new File(filePath).length(), 16000, 1, 16);
    }

    private final double calculatePcmDuration(long fileSizeInBytes, int sampleRate, int channels, int bitDepth) {
        return fileSizeInBytes / ((sampleRate * channels) * (bitDepth / 8));
    }
}
