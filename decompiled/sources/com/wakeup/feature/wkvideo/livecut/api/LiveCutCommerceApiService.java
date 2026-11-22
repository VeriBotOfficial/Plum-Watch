package com.wakeup.feature.wkvideo.livecut.api;

import com.wakeup.common.network.BaseResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* compiled from: LiveCutCommerceApiService.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\tJ\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\f\u001a\u00020\rH§@¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/wakeup/feature/wkvideo/livecut/api/LiveCutCommerceApiService;", "", "getProduct", "Lcom/wakeup/common/network/BaseResult;", "Lcom/wakeup/feature/wkvideo/livecut/api/LiveCutProductResponseDto;", "clipId", "", "title", "buyPath", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createOrder", "Lcom/wakeup/feature/wkvideo/livecut/api/LiveCutCreateOrderResponseDto;", "body", "Lcom/wakeup/feature/wkvideo/livecut/api/LiveCutCreateOrderRequestDto;", "(Lcom/wakeup/feature/wkvideo/livecut/api/LiveCutCreateOrderRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-wkvideo_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface LiveCutCommerceApiService {
    @POST("livecut/api/v1/order")
    Object createOrder(@Body LiveCutCreateOrderRequestDto liveCutCreateOrderRequestDto, Continuation<? super BaseResult<LiveCutCreateOrderResponseDto>> continuation);

    @GET("livecut/api/v1/product")
    Object getProduct(@Query("clipId") String str, @Query("title") String str2, @Query("buyPath") String str3, Continuation<? super BaseResult<LiveCutProductResponseDto>> continuation);
}
