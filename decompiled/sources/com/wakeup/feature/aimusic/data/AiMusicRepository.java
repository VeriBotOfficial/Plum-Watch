package com.wakeup.feature.aimusic.data;

import com.wakeup.feature.aimusic.model.ArtistDetail;
import com.wakeup.feature.aimusic.model.FavoriteToggle;
import com.wakeup.feature.aimusic.model.PaginatedSongs;
import com.wakeup.feature.aimusic.model.RecentCard;
import com.wakeup.feature.aimusic.model.RecommendTag;
import com.wakeup.feature.aimusic.model.RecommendTagSongs;
import com.wakeup.feature.aimusic.model.ScenePlaylist;
import com.wakeup.feature.aimusic.model.SearchResult;
import com.wakeup.feature.aimusic.model.Song;
import com.wakeup.feature.aimusic.model.SongDetail;
import com.wakeup.feature.aimusic.model.Style;
import com.wakeup.feature.aimusic.model.UserFavor;
import com.wakeup.feature.aimusic.model.UserFavorSongs;
import io.nats.client.support.ApiConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: AiMusicRepository.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0002\u0010\u0005J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H¦@¢\u0006\u0002\u0010\u0005J&\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH¦@¢\u0006\u0002\u0010\u000fJ&\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH¦@¢\u0006\u0002\u0010\u000fJ\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\rH¦@¢\u0006\u0002\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000bH¦@¢\u0006\u0002\u0010\u001cJ\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\rH¦@¢\u0006\u0002\u0010\u0018J\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0003H¦@¢\u0006\u0002\u0010\u0005J\u0016\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u000bH¦@¢\u0006\u0002\u0010\u001cJ\u0018\u0010$\u001a\u0004\u0018\u00010!2\u0006\u0010#\u001a\u00020\u000bH¦@¢\u0006\u0002\u0010\u001cJ\u0018\u0010%\u001a\u0004\u0018\u00010!2\u0006\u0010#\u001a\u00020\u000bH¦@¢\u0006\u0002\u0010\u001cJ\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0003H¦@¢\u0006\u0002\u0010\u0005J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u000bH¦@¢\u0006\u0002\u0010\u001cJ\u0016\u0010+\u001a\u00020,2\u0006\u0010\u001b\u001a\u00020\u000bH¦@¢\u0006\u0002\u0010\u001cJ\u0016\u0010-\u001a\u00020,2\u0006\u0010\u001b\u001a\u00020\u000bH¦@¢\u0006\u0002\u0010\u001cJ\u0010\u0010.\u001a\u0004\u0018\u00010/H¦@¢\u0006\u0002\u0010\u0005J\u0016\u00100\u001a\u0002012\u0006\u0010\u001f\u001a\u00020\rH¦@¢\u0006\u0002\u0010\u0018¨\u00062"}, d2 = {"Lcom/wakeup/feature/aimusic/data/AiMusicRepository;", "", "getFeed", "", "Lcom/wakeup/feature/aimusic/model/Song;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStyles", "Lcom/wakeup/feature/aimusic/model/Style;", "getStyleSongs", "Lcom/wakeup/feature/aimusic/model/PaginatedSongs;", "styleId", "", "page", "", "pageSize", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "Lcom/wakeup/feature/aimusic/model/SearchResult;", "keyword", "artistLimit", "songLimit", "getArtistDetail", "Lcom/wakeup/feature/aimusic/model/ArtistDetail;", "artistId", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSongDetail", "Lcom/wakeup/feature/aimusic/model/SongDetail;", "musicId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecentCard", "Lcom/wakeup/feature/aimusic/model/RecentCard;", ApiConstants.LIMIT, "getScenePlaylists", "Lcom/wakeup/feature/aimusic/model/ScenePlaylist;", "getScenePlaylistDetail", "playlistId", "subscribeScenePlaylist", "unsubscribeScenePlaylist", "getFavors", "Lcom/wakeup/feature/aimusic/model/UserFavor;", "getFavorSongs", "Lcom/wakeup/feature/aimusic/model/UserFavorSongs;", "favorId", "likeSong", "Lcom/wakeup/feature/aimusic/model/FavoriteToggle;", "unlikeSong", "getRecommendTag", "Lcom/wakeup/feature/aimusic/model/RecommendTag;", "getRecommendTagSongs", "Lcom/wakeup/feature/aimusic/model/RecommendTagSongs;", "feature-aimusic_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface AiMusicRepository {
    Object getArtistDetail(int i, Continuation<? super ArtistDetail> continuation);

    Object getFavorSongs(String str, Continuation<? super UserFavorSongs> continuation);

    Object getFavors(Continuation<? super List<UserFavor>> continuation);

    Object getFeed(Continuation<? super List<Song>> continuation);

    Object getRecentCard(int i, Continuation<? super RecentCard> continuation);

    Object getRecommendTag(Continuation<? super RecommendTag> continuation);

    Object getRecommendTagSongs(int i, Continuation<? super RecommendTagSongs> continuation);

    Object getScenePlaylistDetail(String str, Continuation<? super ScenePlaylist> continuation);

    Object getScenePlaylists(Continuation<? super List<ScenePlaylist>> continuation);

    Object getSongDetail(String str, Continuation<? super SongDetail> continuation);

    Object getStyleSongs(String str, int i, int i2, Continuation<? super PaginatedSongs> continuation);

    Object getStyles(Continuation<? super List<Style>> continuation);

    Object likeSong(String str, Continuation<? super FavoriteToggle> continuation);

    Object search(String str, int i, int i2, Continuation<? super SearchResult> continuation);

    Object subscribeScenePlaylist(String str, Continuation<? super ScenePlaylist> continuation);

    Object unlikeSong(String str, Continuation<? super FavoriteToggle> continuation);

    Object unsubscribeScenePlaylist(String str, Continuation<? super ScenePlaylist> continuation);
}
