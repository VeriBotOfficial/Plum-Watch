package com.wakeup.common.network.api;

import com.wakeup.common.network.entity.ab.ExperimentResult;
import com.wakeup.common.network.entity.video.ABPost;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* compiled from: NorthStarService.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/wakeup/common/network/api/NorthStarService;", "", "getAB", "Lcom/wakeup/common/network/entity/ab/ExperimentResult;", "body", "Lcom/wakeup/common/network/entity/video/ABPost;", "(Lcom/wakeup/common/network/entity/video/ABPost;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface NorthStarService {
    @POST("microLife/north-star/api/v1/traffics")
    Object getAB(@Body ABPost aBPost, Continuation<? super ExperimentResult> continuation);
}
