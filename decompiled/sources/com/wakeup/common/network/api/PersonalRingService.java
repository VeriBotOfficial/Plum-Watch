package com.wakeup.common.network.api;

import com.wakeup.common.network.BaseResult;
import com.wakeup.common.network.entity.BasicResponse;
import com.wakeup.common.network.entity.ring.PersonalRingEntity;
import com.wakeup.common.network.entity.ring.PersonalRingHome;
import com.wakeup.common.network.entity.ring.RingCategoryBean;
import com.wakeup.common.network.entity.ring.RingListType;
import com.wakeup.common.network.entity.ring.RingOrder;
import com.wakeup.common.network.entity.ring.RingOrderModel;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: PersonalRingService.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\bJ$\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\bJ<\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\r\u001a\u00020\u00072\b\b\u0001\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\u0011J\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00040\u0003H§@¢\u0006\u0002\u0010\u0014J\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00040\u0003H§@¢\u0006\u0002\u0010\u0014J(\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0001\u0010\r\u001a\u00020\u00072\b\b\u0003\u0010\u000e\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\u0018J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u001cH§@¢\u0006\u0002\u0010\u001dJ/\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0019\b\u0001\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020!\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\"0 H§@¢\u0006\u0002\u0010#J/\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00032\u0019\b\u0001\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020!\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\"0 H§@¢\u0006\u0002\u0010#¨\u0006&"}, d2 = {"Lcom/wakeup/common/network/api/PersonalRingService;", "", "listAll", "Lcom/wakeup/common/network/BaseResult;", "", "Lcom/wakeup/common/network/entity/ring/PersonalRingHome;", "categoryId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listType", "Lcom/wakeup/common/network/entity/ring/RingListType;", "getCategoryList", "Lcom/wakeup/common/network/entity/ring/RingCategoryBean;", "pageNum", "pageSize", "musicTypeId", "musicCategoryId", "(IIIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPurchasedList", "Lcom/wakeup/common/network/entity/ring/PersonalRingEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getInstalledList", "getRingOrderList", "Lcom/wakeup/common/network/entity/BasicResponse$RingOrder;", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRingOrderInfo", "Lcom/wakeup/common/network/entity/ring/RingOrderModel;", "orderId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncRingOrder", "body", "", "", "Lkotlin/jvm/JvmSuppressWildcards;", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "synPurchaseRing", "Lcom/wakeup/common/network/entity/ring/RingOrder;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface PersonalRingService {
    @GET("music/api/music/pageList")
    Object getCategoryList(@Query("pageNum") int i, @Query("pageSize") int i2, @Query("musicTypeId") int i3, @Query("musicCategoryId") int i4, Continuation<? super BaseResult<RingCategoryBean>> continuation);

    @GET("music/api/music/listMyInstalled")
    Object getInstalledList(Continuation<? super BaseResult<List<PersonalRingEntity>>> continuation);

    @GET("music/api/music/listMyPurchased")
    Object getPurchasedList(Continuation<? super BaseResult<List<PersonalRingEntity>>> continuation);

    @GET("music/api/musicOrder/getDetail")
    Object getRingOrderInfo(@Query("orderId") long j, Continuation<? super BaseResult<RingOrderModel>> continuation);

    @GET("music/api/musicOrder/pageList")
    Object getRingOrderList(@Query("pageNum") int i, @Query("pageSize") int i2, Continuation<? super BaseResult<BasicResponse.RingOrder>> continuation);

    @GET("music/api/music/listByCategory")
    Object listAll(@Query("categoryId") int i, Continuation<? super BaseResult<List<PersonalRingHome>>> continuation);

    @GET("music/api/musicType/listType/{categoryId}")
    Object listType(@Path("categoryId") int i, Continuation<? super BaseResult<List<RingListType>>> continuation);

    @POST("music/api/musicOrder/purchase")
    Object synPurchaseRing(@Body Map<String, Object> map, Continuation<? super BaseResult<RingOrder>> continuation);

    @POST("music/api/musicOrder/syncAppPayOrder")
    Object syncRingOrder(@Body Map<String, Object> map, Continuation<? super BaseResult<Object>> continuation);

    /* compiled from: PersonalRingService.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getRingOrderList$default(PersonalRingService personalRingService, int i, int i2, Continuation continuation, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRingOrderList");
            }
            if ((i3 & 2) != 0) {
                i2 = 50;
            }
            return personalRingService.getRingOrderList(i, i2, continuation);
        }
    }
}
