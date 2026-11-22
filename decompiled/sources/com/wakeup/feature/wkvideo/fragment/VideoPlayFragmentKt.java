package com.wakeup.feature.wkvideo.fragment;

import kotlin.Metadata;

/* compiled from: VideoPlayFragment.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\"\u001a\u0010\u0000\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0000\u0010\u0002\"\u0004\b\u0003\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"isShareExposured", "", "()Z", "setShareExposured", "(Z)V", "SHARE_AREA_SHARE", "", "SHARE_AREA_WECHAT", "SHARE_AREA_FRIEND", "SHARE_AREA_SYSTEM", "SHARE_AREA_SAVE", "SHARE_AREA_IMAGE", "CACHE_KEY_DUPLICATION_CATEGORY_ID", "CACHE_KEY_SESSION_TIME", "CACHE_KEY_SESSION_C1_REQ", "CACHE_KEY_RECENT_SHOW", "CACHE_KEY_SESSION_WATCHED", "FULL_SCREEN_HEIGHT", "", "FULL_SCREEN_RATIO", "", "feature-wkvideo_overseasRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VideoPlayFragmentKt {
    public static final String CACHE_KEY_DUPLICATION_CATEGORY_ID = "video_de_duplication_category_id";
    public static final String CACHE_KEY_RECENT_SHOW = "recent_show";
    public static final String CACHE_KEY_SESSION_C1_REQ = "session_c1_req";
    private static final String CACHE_KEY_SESSION_TIME = "session_time";
    private static final String CACHE_KEY_SESSION_WATCHED = "session_watched";
    private static final int FULL_SCREEN_HEIGHT = 1024;
    private static final double FULL_SCREEN_RATIO = 1.76d;
    private static final String SHARE_AREA_FRIEND = "friends";
    private static final String SHARE_AREA_IMAGE = "image";
    private static final String SHARE_AREA_SAVE = "save";
    private static final String SHARE_AREA_SHARE = "share";
    private static final String SHARE_AREA_SYSTEM = "system";
    private static final String SHARE_AREA_WECHAT = "wechat";
    private static boolean isShareExposured;

    public static final boolean isShareExposured() {
        return isShareExposured;
    }

    public static final void setShareExposured(boolean z) {
        isShareExposured = z;
    }
}
