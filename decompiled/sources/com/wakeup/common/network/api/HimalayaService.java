package com.wakeup.common.network.api;

import com.wakeup.common.network.BaseResult;
import com.wakeup.common.network.entity.device.UserTicketEntity;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* compiled from: HimalayaService.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/wakeup/common/network/api/HimalayaService;", "", "userTicket", "Lcom/wakeup/common/network/BaseResult;", "Lcom/wakeup/common/network/entity/device/UserTicketEntity;", "body", "(Lcom/wakeup/common/network/entity/device/UserTicketEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface HimalayaService {
    @POST("api/v1/getUserTicket")
    Object userTicket(@Body UserTicketEntity userTicketEntity, Continuation<? super BaseResult<UserTicketEntity>> continuation);
}
