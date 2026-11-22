package com.wakeup.common.network.api;

import com.wakeup.common.network.BaseResult;
import com.wakeup.common.network.entity.live.LiveRoomEntity;
import com.wakeup.common.network.entity.live.RoomInfo;
import io.nats.client.support.ApiConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;

/* compiled from: LiveService.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001JJ\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\b2\u0014\b\u0001\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\bH§@¢\u0006\u0002\u0010\nJ>\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0001\u0010\r\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u000eJH\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0001\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0002\u0010\u0013J4\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\bH§@¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/wakeup/common/network/api/LiveService;", "", "createRoomChannel", "Lcom/wakeup/common/network/BaseResult;", "Lcom/wakeup/common/network/entity/live/LiveRoomEntity;", "url", "", ApiConstants.HEADERS, "", "body", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRoomInfo", "Lcom/wakeup/common/network/entity/live/RoomInfo;", "channelName", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createRtc", "callTime", "", "callStartTime", "(Ljava/lang/String;Ljava/util/Map;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRtcLogList", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface LiveService {
    @POST
    Object createRoomChannel(@Url String str, @HeaderMap Map<String, String> map, @Body Map<String, String> map2, Continuation<? super BaseResult<LiveRoomEntity>> continuation);

    @POST
    Object createRtc(@Url String str, @HeaderMap Map<String, String> map, @Query("callTime") long j, @Query("callStartTime") long j2, Continuation<? super BaseResult<LiveRoomEntity>> continuation);

    @GET
    Object getRoomInfo(@Url String str, @HeaderMap Map<String, String> map, @Query("channelName") String str2, Continuation<? super BaseResult<RoomInfo>> continuation);

    @POST
    Object getRtcLogList(@Url String str, @HeaderMap Map<String, String> map, Continuation<? super BaseResult<LiveRoomEntity>> continuation);
}
