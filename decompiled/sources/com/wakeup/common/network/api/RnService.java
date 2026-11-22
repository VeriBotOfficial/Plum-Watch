package com.wakeup.common.network.api;

import com.wakeup.common.network.BaseResult;
import com.wakeup.common.network.entity.rn.UpdateEntity;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* compiled from: RnService.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0019\b\u0001\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\b0\u0006H§@¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/wakeup/common/network/api/RnService;", "", "checkUpdate", "Lcom/wakeup/common/network/BaseResult;", "Lcom/wakeup/common/network/entity/rn/UpdateEntity;", "body", "", "", "Lkotlin/jvm/JvmSuppressWildcards;", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface RnService {
    @POST("api/v1/app/firm/queryInfo")
    Object checkUpdate(@Body Map<String, Object> map, Continuation<? super BaseResult<UpdateEntity>> continuation);
}
