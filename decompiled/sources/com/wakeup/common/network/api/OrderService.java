package com.wakeup.common.network.api;

import com.wakeup.common.network.BaseResult;
import com.wakeup.common.network.entity.BasicRequest;
import com.wakeup.common.network.entity.BasicResponse;
import com.wakeup.common.network.entity.other.MyOrderModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* compiled from: OrderService.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\tJ\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\f\u001a\u00020\rH§@¢\u0006\u0002\u0010\u000eJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0011J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\f\u001a\u00020\u0013H§@¢\u0006\u0002\u0010\u0014J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0011J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/wakeup/common/network/api/OrderService;", "", "getUserOrderDetail", "Lcom/wakeup/common/network/BaseResult;", "Lcom/wakeup/common/network/entity/other/MyOrderModel;", "orderNo", "", "orderType", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserOrderList", "Lcom/wakeup/common/network/entity/BasicResponse$UserOrderPageVO;", "body", "Lcom/wakeup/common/network/entity/BasicRequest$DialOrder;", "(Lcom/wakeup/common/network/entity/BasicRequest$DialOrder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "synDialInfo", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOverseasUserOrderList", "Lcom/wakeup/common/network/entity/BasicRequest$OverseasUserOrder;", "(Lcom/wakeup/common/network/entity/BasicRequest$OverseasUserOrder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOverseasUserOrderDetail", "synMemberInfo", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface OrderService {
    @GET("gateway/wearfitPay/api/pay/en/member/order/getUserOrderDetail")
    Object getOverseasUserOrderDetail(@Query("orderNo") String str, Continuation<? super BaseResult<MyOrderModel>> continuation);

    @POST("gateway/wearfitPay/api/pay/en/member/order/getUserOrderList")
    Object getOverseasUserOrderList(@Body BasicRequest.OverseasUserOrder overseasUserOrder, Continuation<? super BaseResult<BasicResponse.UserOrderPageVO>> continuation);

    @GET("gateway/wearfitPay/api/pay/en/dial/order/getUserOrderDetail")
    Object getUserOrderDetail(@Query("orderNo") String str, @Query("orderType") int i, Continuation<? super BaseResult<MyOrderModel>> continuation);

    @POST("gateway/wearfitPay/api/pay/en/dial/order/getUserOrderList")
    Object getUserOrderList(@Body BasicRequest.DialOrder dialOrder, Continuation<? super BaseResult<BasicResponse.UserOrderPageVO>> continuation);

    @GET("gateway/wearfitPay/api/pay/en/dial/order/grantDial")
    Object synDialInfo(@Query("orderNo") String str, Continuation<? super BaseResult<Boolean>> continuation);

    @GET("gateway/wearfitPay/api/pay/en/member/order/grantMember")
    Object synMemberInfo(@Query("orderNo") String str, Continuation<? super BaseResult<Boolean>> continuation);
}
