package com.wakeup.common.network.api;

import com.umeng.analytics.AnalyticsConfig;
import com.wakeup.common.network.BaseResult;
import com.wakeup.common.network.entity.goal.GoalBean;
import com.wakeup.common.network.entity.goal.GoalCountBean;
import com.wakeup.common.network.entity.goal.GoalHistoryBean;
import com.wakeup.common.network.entity.goal.GoalStatisticsBean;
import com.wakeup.common.network.entity.goal.GoalTypeDetailBan;
import com.wakeup.common.network.entity.goal.SettingGoalBean;
import com.wakeup.common.network.entity.sport.SportAlbumInfoBean;
import com.wakeup.common.network.entity.sport.SportDownloadRecordBean;
import com.wakeup.common.network.entity.sport.SportFeaturedPlayBean;
import com.wakeup.common.network.entity.sport.SportMonthStatistics;
import com.wakeup.common.network.entity.sport.SportTotalStatistics;
import com.wakeup.common.network.entity.sport.SportTypeModel;
import com.wakeup.common.network.entity.sport.SportUploadRecordResponse;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: SportService.kt */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J3\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\u0013\b\u0001\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\bH§@¢\u0006\u0002\u0010\tJ-\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\r\b\u0001\u0010\u0006\u001a\u00070\u0001¢\u0006\u0002\b\bH§@¢\u0006\u0002\u0010\fJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0010H§@¢\u0006\u0002\u0010\u0011J\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00070\u0003H§@¢\u0006\u0002\u0010\u0014J>\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u0016\u001a\u00020\u00102\b\b\u0001\u0010\u0017\u001a\u00020\u00102\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0001\u0010\u0018\u001a\u00020\u0010H§@¢\u0006\u0002\u0010\u0019J0\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00070\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0001\u0010\u0018\u001a\u00020\u0010H§@¢\u0006\u0002\u0010\u001cJ9\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\u0019\b\u0001\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u001f¢\u0006\u0002\b\bH§@¢\u0006\u0002\u0010 J(\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00032\b\b\u0001\u0010\u0016\u001a\u00020\u00102\b\b\u0001\u0010\u0017\u001a\u00020\u0010H§@¢\u0006\u0002\u0010#J2\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00032\b\b\u0001\u0010&\u001a\u00020\u00052\b\b\u0003\u0010\u0016\u001a\u00020\u00102\b\b\u0003\u0010\u0017\u001a\u00020\u0010H§@¢\u0006\u0002\u0010'J\u001a\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)0\u0003H§@¢\u0006\u0002\u0010\u0014J\u001e\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\b\b\u0001\u0010\u0006\u001a\u00020,H§@¢\u0006\u0002\u0010-J(\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00032\b\b\u0001\u00100\u001a\u00020\u00102\b\b\u0001\u00101\u001a\u00020\u0010H§@¢\u0006\u0002\u0010#J\u001e\u00102\u001a\b\u0012\u0004\u0012\u0002030\u00032\b\b\u0001\u00100\u001a\u00020\u0010H§@¢\u0006\u0002\u00104J*\u00105\u001a\b\u0012\u0004\u0012\u0002060\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001007H§@¢\u0006\u0002\u00108J\u001e\u00109\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\b\b\u0001\u0010\u0006\u001a\u00020,H§@¢\u0006\u0002\u0010-J$\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)0\u00032\b\b\u0001\u00101\u001a\u00020\u0010H§@¢\u0006\u0002\u00104J.\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0)0\u00032\b\b\u0001\u0010\u0016\u001a\u00020\u00102\b\b\u0001\u0010\u0017\u001a\u00020\u0010H§@¢\u0006\u0002\u0010#J\u001a\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0)0\u0003H§@¢\u0006\u0002\u0010\u0014JP\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\b\b\u0001\u0010@\u001a\u00020\u00102\b\b\u0001\u0010A\u001a\u00020\u00102\b\b\u0001\u0010B\u001a\u00020\u00102\b\b\u0001\u0010C\u001a\u00020\u00102\b\b\u0001\u0010D\u001a\u00020\u001e2\b\b\u0001\u0010E\u001a\u00020\u0010H§@¢\u0006\u0002\u0010F¨\u0006G"}, d2 = {"Lcom/wakeup/common/network/api/SportService;", "", "uploadBatchSport", "Lcom/wakeup/common/network/BaseResult;", "appTime", "", "body", "", "Lkotlin/jvm/JvmSuppressWildcards;", "(JLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadSingleSport", "Lcom/wakeup/common/network/entity/sport/SportUploadRecordResponse;", "(JLjava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSportTotal", "Lcom/wakeup/common/network/entity/sport/SportTotalStatistics;", "sportCategoryId", "", "(Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSportTypeList", "Lcom/wakeup/common/network/entity/sport/SportTypeModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/wakeup/common/network/entity/sport/SportMonthStatistics;", "pageNum", "pageSize", "dayNo", "(IILjava/lang/Integer;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHistoryList", "Lcom/wakeup/common/network/entity/sport/SportDownloadRecordBean;", "(Ljava/lang/Integer;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitSportFeel", "", "", "(JLjava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSportFeaturedPlayList", "Lcom/wakeup/common/network/entity/sport/SportFeaturedPlayBean;", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPlaylistInformation", "Lcom/wakeup/common/network/entity/sport/SportAlbumInfoBean;", "id", "(JIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGoalList", "", "Lcom/wakeup/common/network/entity/goal/GoalBean;", "settingGoalType", "Lcom/wakeup/common/network/entity/goal/SettingGoalBean;", "(Lcom/wakeup/common/network/entity/goal/SettingGoalBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGoalType", "Lcom/wakeup/common/network/entity/goal/GoalTypeDetailBan;", "goalType", "year", "getStatisticsData", "Lcom/wakeup/common/network/entity/goal/GoalStatisticsBean;", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteGoalType", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHistoryGoal", "getShareGoal", "getGoalHistory", "Lcom/wakeup/common/network/entity/goal/GoalHistoryBean;", "countGoal", "Lcom/wakeup/common/network/entity/goal/GoalCountBean;", "getWeekReport", "dayNoStart", "dayNoEnd", AnalyticsConfig.RTD_START_TIME, "endTime", "timeZone", "targetStep", "(IIIILjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface SportService {
    @GET("userGoal/countGoal")
    Object countGoal(Continuation<? super BaseResult<List<GoalCountBean>>> continuation);

    @POST("userGoal/deleteGoalType")
    Object deleteGoalType(@Body Map<String, Integer> map, Continuation<? super BaseResult<Boolean>> continuation);

    @GET("userGoal/historicalGoal")
    Object getGoalHistory(@Query("pageNum") int i, @Query("pageSize") int i2, Continuation<? super BaseResult<List<GoalHistoryBean>>> continuation);

    @GET("userGoal/listGoal")
    Object getGoalList(Continuation<? super BaseResult<List<GoalBean>>> continuation);

    @GET("userGoal/gettingGoalType")
    Object getGoalType(@Query("goalType") int i, @Query("year") int i2, Continuation<? super BaseResult<GoalTypeDetailBan>> continuation);

    @POST("userGoal/settingGoalType")
    Object getHistoryGoal(@Body SettingGoalBean settingGoalBean, Continuation<? super BaseResult<String>> continuation);

    @GET("sportRecord/history")
    Object getHistoryList(@Query("sportCategory") Integer num, @Query("dayNo") int i, Continuation<? super BaseResult<List<SportDownloadRecordBean>>> continuation);

    @GET("systemFavorites/getInfo/{id}")
    Object getPlaylistInformation(@Path("id") long j, @Query("pageNum") int i, @Query("pageSize") int i2, Continuation<? super BaseResult<SportAlbumInfoBean>> continuation);

    @GET("userGoal/shareGoal")
    Object getShareGoal(@Query("year") int i, Continuation<? super BaseResult<List<GoalBean>>> continuation);

    @GET("systemFavorites/list")
    Object getSportFeaturedPlayList(@Query("pageNum") int i, @Query("pageSize") int i2, Continuation<? super BaseResult<SportFeaturedPlayBean>> continuation);

    @GET("sportRecord/statistics/total")
    Object getSportTotal(@Query("sportCategoryId") Integer num, Continuation<? super BaseResult<SportTotalStatistics>> continuation);

    @GET("sportRecord/statistics/month")
    Object getSportTypeList(@Query("pageNum") int i, @Query("pageSize") int i2, @Query("sportCategory") Integer num, @Query("dayNo") int i3, Continuation<? super BaseResult<SportMonthStatistics>> continuation);

    @GET("sportRecord/listSportType")
    Object getSportTypeList(Continuation<? super BaseResult<List<SportTypeModel>>> continuation);

    @GET("userGoal/statisticsDataYear")
    Object getStatisticsData(@Query("goalType") int i, Continuation<? super BaseResult<GoalStatisticsBean>> continuation);

    @GET("sportReport/getWeekReport")
    Object getWeekReport(@Query("dayNoStart") int i, @Query("dayNoEnd") int i2, @Query("startTime") int i3, @Query("endTime") int i4, @Query("timeZone") String str, @Query("targetStep") int i5, Continuation<? super BaseResult<String>> continuation);

    @POST("userGoal/settingGoalType")
    Object settingGoalType(@Body SettingGoalBean settingGoalBean, Continuation<? super BaseResult<String>> continuation);

    @POST("sportRecord/submitFeel")
    Object submitSportFeel(@Query("appTime") long j, @Body Map<String, Object> map, Continuation<? super BaseResult<String>> continuation);

    @POST("sportRecord/saveRecord")
    Object uploadBatchSport(@Query("appTime") long j, @Body List<Object> list, Continuation<? super BaseResult<Object>> continuation);

    @POST("sportRecord/submitRecord")
    Object uploadSingleSport(@Query("appTime") long j, @Body Object obj, Continuation<? super BaseResult<SportUploadRecordResponse>> continuation);

    /* compiled from: SportService.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getSportTotal$default(SportService sportService, Integer num, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSportTotal");
            }
            if ((i & 1) != 0) {
                num = null;
            }
            return sportService.getSportTotal(num, continuation);
        }

        public static /* synthetic */ Object getSportTypeList$default(SportService sportService, int i, int i2, Integer num, int i3, Continuation continuation, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSportTypeList");
            }
            if ((i4 & 4) != 0) {
                num = null;
            }
            return sportService.getSportTypeList(i, i2, num, i3, continuation);
        }

        public static /* synthetic */ Object getHistoryList$default(SportService sportService, Integer num, int i, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHistoryList");
            }
            if ((i2 & 1) != 0) {
                num = null;
            }
            return sportService.getHistoryList(num, i, continuation);
        }

        public static /* synthetic */ Object getPlaylistInformation$default(SportService sportService, long j, int i, int i2, Continuation continuation, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPlaylistInformation");
            }
            if ((i3 & 2) != 0) {
                i = 1;
            }
            int i4 = i;
            if ((i3 & 4) != 0) {
                i2 = 200;
            }
            return sportService.getPlaylistInformation(j, i4, i2, continuation);
        }
    }
}
