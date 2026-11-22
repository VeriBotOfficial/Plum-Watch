package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.wakeup.common.utils.CrossMediaPause;
import com.wakeup.commponent.constant.PagePath;
import com.wakeup.feature.aimusic.ui.artist.AiMusicArtistActivity;
import com.wakeup.feature.aimusic.ui.feed.AiMusicFeedActivity;
import com.wakeup.feature.aimusic.ui.player.AiMusicPlayerActivity;
import com.wakeup.feature.aimusic.ui.search.AiMusicSearchActivity;
import com.wakeup.feature.aimusic.ui.styledetail.AiMusicStyleDetailActivity;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Group$$aimusic implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(PagePath.PAGE_AIMUSIC_ARTIST, RouteMeta.build(RouteType.ACTIVITY, AiMusicArtistActivity.class, PagePath.PAGE_AIMUSIC_ARTIST, CrossMediaPause.OWNER_AI_MUSIC, null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_AIMUSIC_HOME, RouteMeta.build(RouteType.ACTIVITY, AiMusicFeedActivity.class, PagePath.PAGE_AIMUSIC_HOME, CrossMediaPause.OWNER_AI_MUSIC, null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_AIMUSIC_PLAYER, RouteMeta.build(RouteType.ACTIVITY, AiMusicPlayerActivity.class, PagePath.PAGE_AIMUSIC_PLAYER, CrossMediaPause.OWNER_AI_MUSIC, null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_AIMUSIC_SEARCH, RouteMeta.build(RouteType.ACTIVITY, AiMusicSearchActivity.class, PagePath.PAGE_AIMUSIC_SEARCH, CrossMediaPause.OWNER_AI_MUSIC, null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_AIMUSIC_STYLE_DETAIL, RouteMeta.build(RouteType.ACTIVITY, AiMusicStyleDetailActivity.class, "/aimusic/styledetail", CrossMediaPause.OWNER_AI_MUSIC, null, -1, Integer.MIN_VALUE));
    }
}
