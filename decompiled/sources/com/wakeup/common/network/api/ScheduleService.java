package com.wakeup.common.network.api;

import com.umeng.analytics.AnalyticsConfig;
import com.wakeup.common.Constants;
import com.wakeup.common.network.BaseResult;
import com.wakeup.common.network.entity.schedule.ScheduleModel;
import com.wakeup.common.network.entity.schedule.ScheduleMonthModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;

/* compiled from: ScheduleService.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ.\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u00032\b\b\u0001\u0010\u000e\u001a\u00020\n2\b\b\u0001\u0010\u000f\u001a\u00020\nH§@¢\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0013J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0002\u0010\u0017J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0001\u0010\u0019\u001a\u00020\nH§@¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/wakeup/common/network/api/ScheduleService;", "", "getDayScheduleList", "Lcom/wakeup/common/network/BaseResult;", "", "Lcom/wakeup/common/network/entity/schedule/ScheduleModel;", "pageNum", "", "pageSize", "currentTime", "", "(IIJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMonthScheduleList", "Lcom/wakeup/common/network/entity/schedule/ScheduleMonthModel;", AnalyticsConfig.RTD_START_TIME, "endTime", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addSchedule", Constants.BundleKey.BEAN, "(Lcom/wakeup/common/network/entity/schedule/ScheduleModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSchedule", "", "url", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getScheduleDetail", "scheduleId", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface ScheduleService {
    @POST("schedule/userSchedule/save")
    Object addSchedule(@Body ScheduleModel scheduleModel, Continuation<? super BaseResult<Long>> continuation);

    @POST
    Object deleteSchedule(@Url String str, Continuation<? super BaseResult<String>> continuation);

    @GET("schedule/userSchedule/listByLatest")
    Object getDayScheduleList(@Query("pageNum") int i, @Query("pageSize") int i2, @Query("currentTime") long j, Continuation<? super BaseResult<List<ScheduleModel>>> continuation);

    @GET("schedule/userSchedule/listByMonth")
    Object getMonthScheduleList(@Query("startTime") long j, @Query("endTime") long j2, Continuation<? super BaseResult<List<ScheduleMonthModel>>> continuation);

    @GET("schedule/userSchedule/getDetail")
    Object getScheduleDetail(@Query("scheduleId") long j, Continuation<? super BaseResult<ScheduleModel>> continuation);
}
