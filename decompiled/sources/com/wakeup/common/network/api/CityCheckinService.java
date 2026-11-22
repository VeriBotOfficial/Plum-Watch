package com.wakeup.common.network.api;

import com.autonavi.aps.amapapi.config.Const;
import com.wakeup.common.network.BaseResult;
import com.wakeup.common.network.entity.gift.CheckinRequest;
import com.wakeup.common.network.entity.gift.CityInfo;
import com.wakeup.common.network.entity.gift.DialCompatibleInfo;
import com.wakeup.common.network.entity.gift.DialDownloadInfo;
import com.wakeup.common.network.entity.gift.DialInfo;
import com.wakeup.common.network.entity.gift.ExchangeRecord;
import com.wakeup.common.network.entity.gift.ExchangeRequest;
import com.wakeup.common.network.entity.gift.LeaderboardEntry;
import com.wakeup.common.network.entity.gift.MyPointsInfo;
import com.wakeup.common.network.entity.gift.MyRankInfo;
import com.wakeup.common.network.entity.gift.PageData;
import com.wakeup.common.network.entity.gift.UserCheckinInfo;
import com.wakeup.common.network.entity.gift.UserRewardInfo;
import com.wakeup.common.network.entity.video.VideoEntity;
import com.wakeup.feature.user.constant.UserConstants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.MultipartBody;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: CityCheckinService.kt */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H§@¢\u0006\u0002\u0010\u000bJ\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u0003H§@¢\u0006\u0002\u0010\u000bJ.\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000f0\u00032\b\b\u0003\u0010\u0010\u001a\u00020\u00072\b\b\u0003\u0010\u0011\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\u0012J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u0015H§@¢\u0006\u0002\u0010\u0016J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u0015H§@¢\u0006\u0002\u0010\u0016J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u001bH§@¢\u0006\u0002\u0010\u001cJ.\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u000f0\u00032\b\b\u0003\u0010\u0010\u001a\u00020\u00072\b\b\u0003\u0010\u0011\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\u0012J8\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u000f0\u00032\b\b\u0003\u0010\u0010\u001a\u00020\u00072\b\b\u0003\u0010\u0011\u001a\u00020\u00072\b\b\u0003\u0010!\u001a\u00020\u0015H§@¢\u0006\u0002\u0010\"J\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0003H§@¢\u0006\u0002\u0010\u000bJ\u001e\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00032\b\b\u0001\u0010\u001a\u001a\u00020'H§@¢\u0006\u0002\u0010(J\u001a\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00040\u0003H§@¢\u0006\u0002\u0010\u000bJ\u001e\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u00032\b\b\u0001\u0010,\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\bJ(\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00032\b\b\u0001\u0010,\u001a\u00020\u00072\b\b\u0001\u0010!\u001a\u00020\u0015H§@¢\u0006\u0002\u0010/J\u001e\u00100\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u00101\u001a\u000202H§@¢\u0006\u0002\u00103J(\u00104\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0003\u00105\u001a\u00020\u00072\b\b\u0003\u00106\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\u0012J$\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\u00040\u00032\b\b\u0003\u00109\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\bJ$\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\u00040\u00032\b\b\u0001\u0010;\u001a\u000202H§@¢\u0006\u0002\u00103J4\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u001e\b\u0001\u0010=\u001a\u0018\u0012\t\u0012\u000702¢\u0006\u0002\b?\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b?0>H§@¢\u0006\u0002\u0010@J\u001e\u0010A\u001a\b\u0012\u0004\u0012\u0002020\u00032\b\b\u0001\u0010B\u001a\u00020CH§@¢\u0006\u0002\u0010DJ4\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u001e\b\u0001\u0010=\u001a\u0018\u0012\t\u0012\u000702¢\u0006\u0002\b?\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b?0>H§@¢\u0006\u0002\u0010@J4\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u001e\b\u0001\u0010=\u001a\u0018\u0012\t\u0012\u000702¢\u0006\u0002\b?\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b?0>H§@¢\u0006\u0002\u0010@J4\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u001e\b\u0001\u0010=\u001a\u0018\u0012\t\u0012\u000702¢\u0006\u0002\b?\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b?0>H§@¢\u0006\u0002\u0010@J2\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u00101\u001a\u0002022\b\b\u0003\u00105\u001a\u00020\u00072\b\b\u0003\u00106\u001a\u00020\u0007H§@¢\u0006\u0002\u0010IJ2\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010K\u001a\u0002022\b\b\u0003\u00105\u001a\u00020\u00072\b\b\u0003\u00106\u001a\u00020\u0007H§@¢\u0006\u0002\u0010IJ\u001e\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0001\u00101\u001a\u000202H§@¢\u0006\u0002\u00103J4\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u001e\b\u0001\u0010=\u001a\u0018\u0012\t\u0012\u000702¢\u0006\u0002\b?\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b?0>H§@¢\u0006\u0002\u0010@J\u001e\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010;\u001a\u000202H§@¢\u0006\u0002\u00103J\u001a\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\u00040\u0003H§@¢\u0006\u0002\u0010\u000bJ\u001a\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\u00040\u0003H§@¢\u0006\u0002\u0010\u000bJ\u0014\u0010Q\u001a\b\u0012\u0004\u0012\u0002020\u0003H§@¢\u0006\u0002\u0010\u000bJ/\u0010R\u001a\b\u0012\u0004\u0012\u00020S0\u00032\u0019\b\u0001\u0010=\u001a\u0013\u0012\u0004\u0012\u000202\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b?0>H§@¢\u0006\u0002\u0010@J\u001e\u0010T\u001a\b\u0012\u0004\u0012\u00020S0\u00032\b\b\u0001\u00101\u001a\u000202H§@¢\u0006\u0002\u00103¨\u0006U"}, d2 = {"Lcom/wakeup/common/network/api/CityCheckinService;", "", "getLeaderboard", "Lcom/wakeup/common/network/BaseResult;", "", "Lcom/wakeup/common/network/entity/gift/LeaderboardEntry;", "top", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMyRank", "Lcom/wakeup/common/network/entity/gift/MyRankInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCityProgressList", "Lcom/wakeup/common/network/entity/gift/CityInfo;", "getCityList", "Lcom/wakeup/common/network/entity/gift/PageData;", "page", "size", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCityDetail", "cityId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCityProgress", "checkin", "Lcom/wakeup/common/network/entity/gift/UserCheckinInfo;", "request", "Lcom/wakeup/common/network/entity/gift/CheckinRequest;", "(Lcom/wakeup/common/network/entity/gift/CheckinRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRewards", "Lcom/wakeup/common/network/entity/gift/UserRewardInfo;", "getDialList", "Lcom/wakeup/common/network/entity/gift/DialInfo;", "equipmentId", "(IIJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMyPoints", "Lcom/wakeup/common/network/entity/gift/MyPointsInfo;", "exchangeDial", "Lcom/wakeup/common/network/entity/gift/ExchangeRecord;", "Lcom/wakeup/common/network/entity/gift/ExchangeRequest;", "(Lcom/wakeup/common/network/entity/gift/ExchangeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMyExchanges", "getDialDownloadUrl", "Lcom/wakeup/common/network/entity/gift/DialDownloadInfo;", UserConstants.DIAL_ID, "checkDialCompatible", "Lcom/wakeup/common/network/entity/gift/DialCompatibleInfo;", "(IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getImageTextDetail", "postId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getImageTextFeed", "pageNum", "pageSize", "getRandomImageTextList", "Lcom/wakeup/common/network/entity/video/VideoEntity;", Const.SP_KEY_CALL_LOC_COUNT, "getImageTextListByPushId", "pushId", "publishImageText", "body", "", "Lkotlin/jvm/JvmSuppressWildcards;", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadImageTextImage", "file", "Lokhttp3/MultipartBody$Part;", "(Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "imageTextLike", "imageTextStore", "imageTextCommentSave", "imageTextCommentList", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "imageTextCommentSubList", "parentId", "imageTextCommentCount", "imageTextCommentLike", "getImageTextUserStats", "getImageTextLikedList", "getImageTextStoredList", "getImageTextProtocol", "postImageTextTracking", "", "deleteImageTextPost", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface CityCheckinService {
    @GET("api/v1/dial/compatible")
    Object checkDialCompatible(@Query("dial_id") int i, @Query("equipment_id") long j, Continuation<? super BaseResult<DialCompatibleInfo>> continuation);

    @POST("api/v1/checkin")
    Object checkin(@Body CheckinRequest checkinRequest, Continuation<? super BaseResult<UserCheckinInfo>> continuation);

    @DELETE("imageText/v1/post/delete")
    Object deleteImageTextPost(@Query("postId") String str, Continuation<? super BaseResult<Boolean>> continuation);

    @POST("api/v1/exchange")
    Object exchangeDial(@Body ExchangeRequest exchangeRequest, Continuation<? super BaseResult<ExchangeRecord>> continuation);

    @GET("api/v1/cities/{id}")
    Object getCityDetail(@Path("id") long j, Continuation<? super BaseResult<CityInfo>> continuation);

    @GET("api/v1/cities")
    Object getCityList(@Query("page") int i, @Query("size") int i2, Continuation<? super BaseResult<PageData<CityInfo>>> continuation);

    @GET("api/v1/checkin/progress/{cityId}")
    Object getCityProgress(@Path("cityId") long j, Continuation<? super BaseResult<CityInfo>> continuation);

    @GET("api/v1/checkin/cities")
    Object getCityProgressList(Continuation<? super BaseResult<List<CityInfo>>> continuation);

    @GET("api/v1/dial/download")
    Object getDialDownloadUrl(@Query("dial_id") int i, Continuation<? super BaseResult<DialDownloadInfo>> continuation);

    @GET("api/v1/dials")
    Object getDialList(@Query("page") int i, @Query("size") int i2, @Query("equipment_id") long j, Continuation<? super BaseResult<PageData<DialInfo>>> continuation);

    @GET("imageText/v1/detail")
    Object getImageTextDetail(@Query("postId") String str, Continuation<? super BaseResult<Object>> continuation);

    @GET("imageText/v1/feed")
    Object getImageTextFeed(@Query("pageNum") int i, @Query("pageSize") int i2, Continuation<? super BaseResult<Object>> continuation);

    @GET("imageText/v1/likedList")
    Object getImageTextLikedList(Continuation<? super BaseResult<List<VideoEntity>>> continuation);

    @GET("imageText/v1/listByPushId")
    Object getImageTextListByPushId(@Query("pushId") String str, Continuation<? super BaseResult<List<VideoEntity>>> continuation);

    @GET("imageText/v1/protocol")
    Object getImageTextProtocol(Continuation<? super BaseResult<String>> continuation);

    @GET("imageText/v1/storedList")
    Object getImageTextStoredList(Continuation<? super BaseResult<List<VideoEntity>>> continuation);

    @GET("imageText/v1/userStats")
    Object getImageTextUserStats(@Query("pushId") String str, Continuation<? super BaseResult<Object>> continuation);

    @GET("api/v1/leaderboard")
    Object getLeaderboard(@Query("top") int i, Continuation<? super BaseResult<List<LeaderboardEntry>>> continuation);

    @GET("api/v1/exchanges")
    Object getMyExchanges(Continuation<? super BaseResult<List<ExchangeRecord>>> continuation);

    @GET("api/v1/points/me")
    Object getMyPoints(Continuation<? super BaseResult<MyPointsInfo>> continuation);

    @GET("api/v1/leaderboard/me")
    Object getMyRank(Continuation<? super BaseResult<MyRankInfo>> continuation);

    @GET("imageText/v1/randomList")
    Object getRandomImageTextList(@Query("count") int i, Continuation<? super BaseResult<List<VideoEntity>>> continuation);

    @GET("api/v1/rewards")
    Object getRewards(@Query("page") int i, @Query("size") int i2, Continuation<? super BaseResult<PageData<UserRewardInfo>>> continuation);

    @GET("imageText/v1/comment/count")
    Object imageTextCommentCount(@Query("postId") String str, Continuation<? super BaseResult<Integer>> continuation);

    @POST("imageText/v1/comment/like")
    Object imageTextCommentLike(@Body Map<String, Object> map, Continuation<? super BaseResult<Integer>> continuation);

    @GET("imageText/v1/comment/list")
    Object imageTextCommentList(@Query("postId") String str, @Query("pageNum") int i, @Query("pageSize") int i2, Continuation<? super BaseResult<Object>> continuation);

    @POST("imageText/v1/comment/save")
    Object imageTextCommentSave(@Body Map<String, Object> map, Continuation<? super BaseResult<Object>> continuation);

    @GET("imageText/v1/comment/subList")
    Object imageTextCommentSubList(@Query("parentId") String str, @Query("pageNum") int i, @Query("pageSize") int i2, Continuation<? super BaseResult<Object>> continuation);

    @POST("imageText/v1/like")
    Object imageTextLike(@Body Map<String, Object> map, Continuation<? super BaseResult<Integer>> continuation);

    @POST("imageText/v1/store")
    Object imageTextStore(@Body Map<String, Object> map, Continuation<? super BaseResult<Integer>> continuation);

    @POST("imageText/v1/tracking")
    Object postImageTextTracking(@Body Map<String, Object> map, Continuation<? super BaseResult<Boolean>> continuation);

    @POST("imageText/v1/publish")
    Object publishImageText(@Body Map<String, Object> map, Continuation<? super BaseResult<Object>> continuation);

    @POST("imageText/v1/uploadImage")
    @Multipart
    Object uploadImageTextImage(@Part MultipartBody.Part part, Continuation<? super BaseResult<String>> continuation);

    /* compiled from: CityCheckinService.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getLeaderboard$default(CityCheckinService cityCheckinService, int i, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLeaderboard");
            }
            if ((i2 & 1) != 0) {
                i = 50;
            }
            return cityCheckinService.getLeaderboard(i, continuation);
        }

        public static /* synthetic */ Object getCityList$default(CityCheckinService cityCheckinService, int i, int i2, Continuation continuation, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCityList");
            }
            if ((i3 & 1) != 0) {
                i = 1;
            }
            if ((i3 & 2) != 0) {
                i2 = 100;
            }
            return cityCheckinService.getCityList(i, i2, continuation);
        }

        public static /* synthetic */ Object getRewards$default(CityCheckinService cityCheckinService, int i, int i2, Continuation continuation, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRewards");
            }
            if ((i3 & 1) != 0) {
                i = 1;
            }
            if ((i3 & 2) != 0) {
                i2 = 20;
            }
            return cityCheckinService.getRewards(i, i2, continuation);
        }

        public static /* synthetic */ Object getDialList$default(CityCheckinService cityCheckinService, int i, int i2, long j, Continuation continuation, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDialList");
            }
            if ((i3 & 1) != 0) {
                i = 1;
            }
            if ((i3 & 2) != 0) {
                i2 = 50;
            }
            if ((i3 & 4) != 0) {
                j = 0;
            }
            return cityCheckinService.getDialList(i, i2, j, continuation);
        }

        public static /* synthetic */ Object getImageTextFeed$default(CityCheckinService cityCheckinService, int i, int i2, Continuation continuation, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getImageTextFeed");
            }
            if ((i3 & 1) != 0) {
                i = 1;
            }
            if ((i3 & 2) != 0) {
                i2 = 10;
            }
            return cityCheckinService.getImageTextFeed(i, i2, continuation);
        }

        public static /* synthetic */ Object getRandomImageTextList$default(CityCheckinService cityCheckinService, int i, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRandomImageTextList");
            }
            if ((i2 & 1) != 0) {
                i = 5;
            }
            return cityCheckinService.getRandomImageTextList(i, continuation);
        }

        public static /* synthetic */ Object imageTextCommentList$default(CityCheckinService cityCheckinService, String str, int i, int i2, Continuation continuation, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: imageTextCommentList");
            }
            if ((i3 & 2) != 0) {
                i = 1;
            }
            if ((i3 & 4) != 0) {
                i2 = 20;
            }
            return cityCheckinService.imageTextCommentList(str, i, i2, continuation);
        }

        public static /* synthetic */ Object imageTextCommentSubList$default(CityCheckinService cityCheckinService, String str, int i, int i2, Continuation continuation, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: imageTextCommentSubList");
            }
            if ((i3 & 2) != 0) {
                i = 1;
            }
            if ((i3 & 4) != 0) {
                i2 = 10;
            }
            return cityCheckinService.imageTextCommentSubList(str, i, i2, continuation);
        }
    }
}
