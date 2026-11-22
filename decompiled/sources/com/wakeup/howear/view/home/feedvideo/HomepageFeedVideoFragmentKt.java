package com.wakeup.howear.view.home.feedvideo;

import kotlin.Metadata;

/* compiled from: HomepageFeedVideoFragment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"CLOSED_PUSHER_ID_LIST", "", "TYPE_HOME_FEED_RECOMMEND", "TYPE_HOME_FEED_FOLLOW", "TYPE_HOME_FEED_AD", "isFeedAdShownRefresh", "", "()Z", "setFeedAdShownRefresh", "(Z)V", "app_wpOverseasRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomepageFeedVideoFragmentKt {
    public static final String CLOSED_PUSHER_ID_LIST = "closed_pusher_id_list";
    public static final String TYPE_HOME_FEED_AD = "feed_ad";
    public static final String TYPE_HOME_FEED_FOLLOW = "follow";
    public static final String TYPE_HOME_FEED_RECOMMEND = "recommend";
    private static boolean isFeedAdShownRefresh;

    public static final boolean isFeedAdShownRefresh() {
        return isFeedAdShownRefresh;
    }

    public static final void setFeedAdShownRefresh(boolean z) {
        isFeedAdShownRefresh = z;
    }
}
