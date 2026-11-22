package com.wakeup.feature.aimusic.network;

import com.wakeup.feature.aimusic.model.AsmrItem;
import com.wakeup.feature.aimusic.model.AsmrPlaylist;
import com.wakeup.feature.aimusic.model.AsmrPlaylistList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: AsmrService.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0002\u0010\u0007J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\n\u001a\u00020\u00062\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0002\u0010\u000bJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/wakeup/feature/aimusic/network/AsmrService;", "", "getPlaylists", "Lcom/wakeup/feature/aimusic/network/MusicApiResponse;", "Lcom/wakeup/feature/aimusic/model/AsmrPlaylistList;", "language", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPlaylistDetail", "Lcom/wakeup/feature/aimusic/model/AsmrPlaylist;", "playlistId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getItem", "Lcom/wakeup/feature/aimusic/model/AsmrItem;", "itemId", "feature-aimusic_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface AsmrService {
    @GET("items/{item_id}")
    Object getItem(@Path("item_id") String str, Continuation<? super MusicApiResponse<AsmrItem>> continuation);

    @GET("playlists/{playlist_id}")
    Object getPlaylistDetail(@Path("playlist_id") String str, @Query("language") String str2, Continuation<? super MusicApiResponse<AsmrPlaylist>> continuation);

    @GET("playlists")
    Object getPlaylists(@Query("language") String str, Continuation<? super MusicApiResponse<AsmrPlaylistList>> continuation);

    /* compiled from: AsmrService.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getPlaylists$default(AsmrService asmrService, String str, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPlaylists");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return asmrService.getPlaylists(str, continuation);
        }

        public static /* synthetic */ Object getPlaylistDetail$default(AsmrService asmrService, String str, String str2, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPlaylistDetail");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return asmrService.getPlaylistDetail(str, str2, continuation);
        }
    }
}
