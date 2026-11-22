package com.wakeup.feature.aimusic.network;

import com.wakeup.feature.aimusic.model.ArtistDetail;
import com.wakeup.feature.aimusic.model.FavoriteToggle;
import com.wakeup.feature.aimusic.model.HomeFeed;
import com.wakeup.feature.aimusic.model.PaginatedSongs;
import com.wakeup.feature.aimusic.model.RecentCard;
import com.wakeup.feature.aimusic.model.RecommendTag;
import com.wakeup.feature.aimusic.model.RecommendTagSongs;
import com.wakeup.feature.aimusic.model.ScenePlaylist;
import com.wakeup.feature.aimusic.model.SearchResult;
import com.wakeup.feature.aimusic.model.SongDetail;
import com.wakeup.feature.aimusic.model.Style;
import com.wakeup.feature.aimusic.model.UserFavor;
import com.wakeup.feature.aimusic.model.UserFavorSongs;
import io.nats.client.support.ApiConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: AiMusicService.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@¢\u0006\u0002\u0010\u0005J\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0003H§@¢\u0006\u0002\u0010\u0005J2\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u0010J2\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\u0013\u001a\u00020\f2\b\b\u0001\u0010\u0014\u001a\u00020\u000e2\b\b\u0001\u0010\u0015\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u0010J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0001\u0010\u0018\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u0019J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00032\b\b\u0001\u0010\u001c\u001a\u00020\fH§@¢\u0006\u0002\u0010\u001dJ\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00032\b\b\u0001\u0010 \u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u0019J\u001a\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00070\u0003H§@¢\u0006\u0002\u0010\u0005J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00032\b\b\u0001\u0010$\u001a\u00020\fH§@¢\u0006\u0002\u0010\u001dJ\u001e\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0\u00032\b\b\u0001\u0010$\u001a\u00020\fH§@¢\u0006\u0002\u0010\u001dJ\u001e\u0010&\u001a\b\u0012\u0004\u0012\u00020\"0\u00032\b\b\u0001\u0010$\u001a\u00020\fH§@¢\u0006\u0002\u0010\u001dJ\u001a\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00070\u0003H§@¢\u0006\u0002\u0010\u0005J\u001e\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00032\b\b\u0001\u0010+\u001a\u00020\fH§@¢\u0006\u0002\u0010\u001dJ\u001e\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u00032\b\b\u0001\u0010\u001c\u001a\u00020\fH§@¢\u0006\u0002\u0010\u001dJ\u001e\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00032\b\b\u0001\u0010\u001c\u001a\u00020\fH§@¢\u0006\u0002\u0010\u001dJ\u0014\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u0003H§@¢\u0006\u0002\u0010\u0005J\u001e\u00101\u001a\b\u0012\u0004\u0012\u0002020\u00032\b\b\u0001\u0010 \u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u0019¨\u00063"}, d2 = {"Lcom/wakeup/feature/aimusic/network/AiMusicService;", "", "getFeed", "Lcom/wakeup/feature/aimusic/network/MusicApiResponse;", "Lcom/wakeup/feature/aimusic/model/HomeFeed;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStyles", "", "Lcom/wakeup/feature/aimusic/model/Style;", "getStyleSongs", "Lcom/wakeup/feature/aimusic/model/PaginatedSongs;", "styleId", "", "page", "", "pageSize", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "Lcom/wakeup/feature/aimusic/model/SearchResult;", "keyword", "artistLimit", "songLimit", "getArtistDetail", "Lcom/wakeup/feature/aimusic/model/ArtistDetail;", "artistId", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSongDetail", "Lcom/wakeup/feature/aimusic/model/SongDetail;", "musicId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecentCard", "Lcom/wakeup/feature/aimusic/model/RecentCard;", ApiConstants.LIMIT, "getScenePlaylists", "Lcom/wakeup/feature/aimusic/model/ScenePlaylist;", "getScenePlaylistDetail", "playlistId", "subscribeScenePlaylist", "unsubscribeScenePlaylist", "getFavors", "Lcom/wakeup/feature/aimusic/model/UserFavor;", "getFavorSongs", "Lcom/wakeup/feature/aimusic/model/UserFavorSongs;", "favorId", "likeSong", "Lcom/wakeup/feature/aimusic/model/FavoriteToggle;", "unlikeSong", "getRecommendTag", "Lcom/wakeup/feature/aimusic/model/RecommendTag;", "getRecommendTagSongs", "Lcom/wakeup/feature/aimusic/model/RecommendTagSongs;", "feature-aimusic_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface AiMusicService {
    @GET("api/music/artists/{artist_id}")
    Object getArtistDetail(@Path("artist_id") int i, Continuation<? super MusicApiResponse<ArtistDetail>> continuation);

    @GET("api/music/card/favors/{favor_id}/songs")
    Object getFavorSongs(@Path("favor_id") String str, Continuation<? super MusicApiResponse<UserFavorSongs>> continuation);

    @GET("api/music/card/favors")
    Object getFavors(Continuation<? super MusicApiResponse<List<UserFavor>>> continuation);

    @GET("api/music/feed")
    Object getFeed(Continuation<? super MusicApiResponse<HomeFeed>> continuation);

    @GET("api/music/card/recent")
    Object getRecentCard(@Query("limit") int i, Continuation<? super MusicApiResponse<RecentCard>> continuation);

    @GET("api/music/card/recommend-tags")
    Object getRecommendTag(Continuation<? super MusicApiResponse<RecommendTag>> continuation);

    @GET("api/music/card/recommend-tags/songs")
    Object getRecommendTagSongs(@Query("limit") int i, Continuation<? super MusicApiResponse<RecommendTagSongs>> continuation);

    @GET("api/music/card/scene-playlists/{playlist_id}")
    Object getScenePlaylistDetail(@Path("playlist_id") String str, Continuation<? super MusicApiResponse<ScenePlaylist>> continuation);

    @GET("api/music/card/scene-playlists")
    Object getScenePlaylists(Continuation<? super MusicApiResponse<List<ScenePlaylist>>> continuation);

    @GET("api/music/songs/{music_id}")
    Object getSongDetail(@Path("music_id") String str, Continuation<? super MusicApiResponse<SongDetail>> continuation);

    @GET("api/music/styles/{style_id}/songs")
    Object getStyleSongs(@Path("style_id") String str, @Query("page") int i, @Query("page_size") int i2, Continuation<? super MusicApiResponse<PaginatedSongs>> continuation);

    @GET("api/music/styles")
    Object getStyles(Continuation<? super MusicApiResponse<List<Style>>> continuation);

    @POST("api/music/favors/songs/{music_id}")
    Object likeSong(@Path("music_id") String str, Continuation<? super MusicApiResponse<FavoriteToggle>> continuation);

    @GET("api/music/search")
    Object search(@Query("q") String str, @Query("artist_limit") int i, @Query("song_limit") int i2, Continuation<? super MusicApiResponse<SearchResult>> continuation);

    @POST("api/music/card/scene-playlists/{playlist_id}/subscribe")
    Object subscribeScenePlaylist(@Path("playlist_id") String str, Continuation<? super MusicApiResponse<ScenePlaylist>> continuation);

    @DELETE("api/music/favors/songs/{music_id}")
    Object unlikeSong(@Path("music_id") String str, Continuation<? super MusicApiResponse<FavoriteToggle>> continuation);

    @DELETE("api/music/card/scene-playlists/{playlist_id}/subscribe")
    Object unsubscribeScenePlaylist(@Path("playlist_id") String str, Continuation<? super MusicApiResponse<ScenePlaylist>> continuation);
}
