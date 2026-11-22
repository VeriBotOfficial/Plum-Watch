package com.wakeup.common.network.api;

import com.wakeup.common.network.BaseResult;
import com.wakeup.common.network.entity.BasicResponse;
import com.wakeup.howear.rn.api.burypoint.RnBuryPointApi;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: BreathService.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\bJ\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\fH§@¢\u0006\u0002\u0010\rJ(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\bJ/\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\u0019\b\u0001\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015H§@¢\u0006\u0002\u0010\u0016J@\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0002\u0010\u001bJ@\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0002\u0010\u001bJT\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\u001e\u001a\u00020\u00062\b\b\u0003\u0010\u001f\u001a\u00020\u0006H§@¢\u0006\u0002\u0010 J\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00032\b\b\u0001\u0010#\u001a\u00020\fH§@¢\u0006\u0002\u0010\rJ$\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0\u00032\b\b\u0001\u0010#\u001a\u00020\fH§@¢\u0006\u0002\u0010\rJ\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00032\b\b\u0001\u0010#\u001a\u00020\fH§@¢\u0006\u0002\u0010\rJ$\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*0\u00032\b\b\u0001\u0010,\u001a\u00020\u0006H§@¢\u0006\u0002\u0010-J$\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*0\u00032\b\b\u0001\u0010/\u001a\u00020\u0006H§@¢\u0006\u0002\u0010-J@\u00100\u001a\b\u0012\u0004\u0012\u0002010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010/\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0002\u0010\u001bJ\u001e\u00102\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010#\u001a\u00020\fH§@¢\u0006\u0002\u0010\rJ\u001e\u00103\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\u000b\u001a\u00020\fH§@¢\u0006\u0002\u0010\r¨\u00064"}, d2 = {"Lcom/wakeup/common/network/api/BreathService;", "", "breathingTraining", "Lcom/wakeup/common/network/BaseResult;", "Lcom/wakeup/common/network/entity/BasicResponse$BreathingTrain;", "pageNum", "", "pageSize", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "breathingTrainingInfo", "Lcom/wakeup/common/network/entity/BasicResponse$BreathingTrainInfo;", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "backgroundMusic", "Lcom/wakeup/common/network/entity/BasicResponse$BackgroundMusic;", "submitRecord", "Lcom/wakeup/common/network/entity/BasicResponse$BreathTrainRecord;", "body", "", "", "Lkotlin/jvm/JvmSuppressWildcards;", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMusicList", "Lcom/wakeup/common/network/entity/BasicResponse$MusicList;", "musicCategoryId", "musicTypeId", "(IILjava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWriteNoiseList", "getWriteNoiseList2", "fileSize", "dataType", "(IILjava/lang/Integer;Ljava/lang/Integer;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMusicInfo", "Lcom/wakeup/common/network/entity/BasicResponse$MusicInfo;", "musicId", "listRecommend", "", "Lcom/wakeup/common/network/entity/BasicResponse$MusicItemBean;", "userMusicFavorites", "Lcom/wakeup/common/network/entity/BasicResponse$MusicFavorite;", "listMusicType", "", "Lcom/wakeup/common/network/entity/BasicResponse$MusicCollectTabType;", "categoryId", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "myCollectMusicType", RnBuryPointApi.KEY_PAGE_ID, "userFavorites", "Lcom/wakeup/common/network/entity/BasicResponse$MusicCollect;", "submitPlayTime", "submitPlayTime2", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface BreathService {
    @GET("music/api/backgroundMusic/pageList")
    Object backgroundMusic(@Query("pageNum") int i, @Query("pageSize") int i2, Continuation<? super BaseResult<BasicResponse.BackgroundMusic>> continuation);

    @GET("music/api/breathingTraining/pageList")
    Object breathingTraining(@Query("pageNum") int i, @Query("pageSize") int i2, Continuation<? super BaseResult<BasicResponse.BreathingTrain>> continuation);

    @GET("music/api/breathingTraining/getDetail/{id}")
    Object breathingTrainingInfo(@Path("id") long j, Continuation<? super BaseResult<BasicResponse.BreathingTrainInfo>> continuation);

    @GET("music/api/music/getDetail/{musicId}")
    Object getMusicInfo(@Path("musicId") long j, Continuation<? super BaseResult<BasicResponse.MusicInfo>> continuation);

    @GET("music/api/music/pageList")
    Object getMusicList(@Query("pageNum") int i, @Query("pageSize") int i2, @Query("musicCategoryId") Integer num, @Query("musicTypeId") Integer num2, Continuation<? super BaseResult<BasicResponse.MusicList>> continuation);

    @GET("music/api/music/sound/pageList")
    Object getWriteNoiseList(@Query("pageNum") int i, @Query("pageSize") int i2, @Query("musicCategoryId") Integer num, @Query("musicTypeId") Integer num2, Continuation<? super BaseResult<BasicResponse.MusicList>> continuation);

    @GET("music/api/music/sound/pageList")
    Object getWriteNoiseList2(@Query("pageNum") int i, @Query("pageSize") int i2, @Query("musicCategoryId") Integer num, @Query("musicTypeId") Integer num2, @Query("fileSize") int i3, @Query("dataType") int i4, Continuation<? super BaseResult<BasicResponse.MusicList>> continuation);

    @GET("music/api/musicType/listType/{categoryId}")
    Object listMusicType(@Path("categoryId") int i, Continuation<? super BaseResult<List<BasicResponse.MusicCollectTabType>>> continuation);

    @GET("music/api/musicRecommend/listRecommend/{musicId}")
    Object listRecommend(@Path("musicId") long j, Continuation<? super BaseResult<List<BasicResponse.MusicItemBean>>> continuation);

    @GET("music/api/userMusicFavorites/listMusicCategory")
    Object myCollectMusicType(@Query("pageId") int i, Continuation<? super BaseResult<List<BasicResponse.MusicCollectTabType>>> continuation);

    @POST("music/api/music/play/{musicId}")
    Object submitPlayTime(@Path("musicId") long j, Continuation<? super BaseResult<Integer>> continuation);

    @POST("music/api/breathingTraining/play/{id}")
    Object submitPlayTime2(@Path("id") long j, Continuation<? super BaseResult<Integer>> continuation);

    @POST("music/api/breathingTraining/submitRecord")
    Object submitRecord(@Body Map<String, Object> map, Continuation<? super BaseResult<BasicResponse.BreathTrainRecord>> continuation);

    @GET("music/api/userMusicFavorites/pageList")
    Object userFavorites(@Query("pageNum") int i, @Query("pageSize") int i2, @Query("pageId") Integer num, @Query("musicCategoryId") Integer num2, Continuation<? super BaseResult<BasicResponse.MusicCollect>> continuation);

    @POST("music/api/userMusicFavorites/favorite/{musicId}")
    Object userMusicFavorites(@Path("musicId") long j, Continuation<? super BaseResult<BasicResponse.MusicFavorite>> continuation);

    /* compiled from: BreathService.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getMusicList$default(BreathService breathService, int i, int i2, Integer num, Integer num2, Continuation continuation, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMusicList");
            }
            if ((i3 & 4) != 0) {
                num = null;
            }
            if ((i3 & 8) != 0) {
                num2 = null;
            }
            return breathService.getMusicList(i, i2, num, num2, continuation);
        }

        public static /* synthetic */ Object getWriteNoiseList$default(BreathService breathService, int i, int i2, Integer num, Integer num2, Continuation continuation, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWriteNoiseList");
            }
            if ((i3 & 4) != 0) {
                num = null;
            }
            if ((i3 & 8) != 0) {
                num2 = null;
            }
            return breathService.getWriteNoiseList(i, i2, num, num2, continuation);
        }

        public static /* synthetic */ Object getWriteNoiseList2$default(BreathService breathService, int i, int i2, Integer num, Integer num2, int i3, int i4, Continuation continuation, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWriteNoiseList2");
            }
            if ((i5 & 4) != 0) {
                num = null;
            }
            if ((i5 & 8) != 0) {
                num2 = null;
            }
            if ((i5 & 16) != 0) {
                i3 = 36;
            }
            if ((i5 & 32) != 0) {
                i4 = 1;
            }
            return breathService.getWriteNoiseList2(i, i2, num, num2, i3, i4, continuation);
        }

        public static /* synthetic */ Object userFavorites$default(BreathService breathService, int i, int i2, Integer num, Integer num2, Continuation continuation, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: userFavorites");
            }
            if ((i3 & 4) != 0) {
                num = null;
            }
            if ((i3 & 8) != 0) {
                num2 = null;
            }
            return breathService.userFavorites(i, i2, num, num2, continuation);
        }
    }
}
