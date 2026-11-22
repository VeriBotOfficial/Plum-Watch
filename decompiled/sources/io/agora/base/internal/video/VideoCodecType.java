package io.agora.base.internal.video;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes6.dex */
enum VideoCodecType {
    VP8("video/x-vnd.on2.vp8"),
    VP9("video/x-vnd.on2.vp9"),
    H264("video/avc"),
    H265("video/hevc"),
    UNKNOWN("video/unknown");

    private static Set<String> _values = new HashSet();
    private final String mimeType;

    static {
        for (VideoCodecType videoCodecType : values()) {
            _values.add(videoCodecType.name());
        }
    }

    VideoCodecType(String str) {
        this.mimeType = str;
    }

    String mimeType() {
        return this.mimeType;
    }

    public static boolean contains(String str) {
        return _values.contains(str);
    }
}
