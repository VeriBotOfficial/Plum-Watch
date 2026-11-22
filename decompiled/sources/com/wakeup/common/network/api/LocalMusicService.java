package com.wakeup.common.network.api;

import com.wakeup.common.network.BaseResult;
import com.wakeup.common.network.entity.music.library.LocalMusicNewEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* compiled from: LocalMusicService.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\tJ\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/wakeup/common/network/api/LocalMusicService;", "", "getNewLocalMusicData", "Lcom/wakeup/common/network/BaseResult;", "", "Lcom/wakeup/common/network/entity/music/library/LocalMusicNewEntity;", "page", "", "pageSize", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMusicInfoById", "musicId", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface LocalMusicService {
    @GET("music/localMusic/getDetails")
    Object getMusicInfoById(@Query("musicLocalId") int i, Continuation<? super BaseResult<LocalMusicNewEntity>> continuation);

    @GET("music/localMusic/listMusic")
    Object getNewLocalMusicData(@Query("pageNum") int i, @Query("pageSize") int i2, Continuation<? super BaseResult<List<LocalMusicNewEntity>>> continuation);

    /* compiled from: LocalMusicService.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getNewLocalMusicData$default(LocalMusicService localMusicService, int i, int i2, Continuation continuation, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNewLocalMusicData");
            }
            if ((i3 & 1) != 0) {
                i = 1;
            }
            if ((i3 & 2) != 0) {
                i2 = 20;
            }
            return localMusicService.getNewLocalMusicData(i, i2, continuation);
        }
    }
}
