package com.wakeup.common.network.api;

import com.wakeup.common.network.BaseResult;
import com.wakeup.common.network.entity.user.AIVipDialog;
import com.wakeup.common.network.entity.user.AIVipOrder;
import com.wakeup.common.network.entity.user.AIVipPayLink;
import com.wakeup.common.network.entity.user.AiFunction;
import com.wakeup.common.network.entity.user.AiMemberPackage;
import com.wakeup.common.network.entity.user.UserAiMemberResp;
import com.wakeup.common.network.entity.user.UserSignCancelInfo;
import com.wakeup.common.network.entity.user.UserSigningResp;
import com.wakeup.common.storage.UserDao;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* compiled from: AIVipService.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\bJ$\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\bJ(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0003\u0010\r\u001a\u00020\u000e2\b\b\u0003\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u0010JB\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00040\u00032\b\b\u0003\u0010\r\u001a\u00020\u000e2\b\b\u0003\u0010\u0013\u001a\u00020\u000e2\b\b\u0003\u0010\u0014\u001a\u00020\u000e2\b\b\u0003\u0010\u0015\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u0016J(\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\u0018\u001a\u00020\u00072\b\b\u0003\u0010\u0019\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u001aJ/\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00032\u0019\b\u0001\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u001f0\u001eH§@¢\u0006\u0002\u0010 J/\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00032\u0019\b\u0001\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u001f0\u001eH§@¢\u0006\u0002\u0010 J\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H§@¢\u0006\u0002\u0010$J\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0003H§@¢\u0006\u0002\u0010$J\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00032\b\b\u0001\u0010)\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\bJ/\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0019\b\u0001\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u001f0\u001eH§@¢\u0006\u0002\u0010 ¨\u0006+"}, d2 = {"Lcom/wakeup/common/network/api/AIVipService;", "", "getAIVip", "Lcom/wakeup/common/network/BaseResult;", "", "Lcom/wakeup/common/network/entity/user/AiMemberPackage;", "type", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAIVipFunction", "Lcom/wakeup/common/network/entity/user/AiFunction;", "getUserAIVipInfo", "Lcom/wakeup/common/network/entity/user/UserAiMemberResp;", "userId", "", "region", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserOrderList", "Lcom/wakeup/common/network/entity/user/AIVipOrder;", "orderType", "page", "size", "(IIIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserOrderDetail", "orderNo", "orderSourceType", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPayLink", "Lcom/wakeup/common/network/entity/user/AIVipPayLink;", "body", "", "Lkotlin/jvm/JvmSuppressWildcards;", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startSignAutoPay", "Lcom/wakeup/common/network/entity/user/UserSigningResp;", "stopAutoPay", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkCancelSignInfo", "Lcom/wakeup/common/network/entity/user/UserSignCancelInfo;", "getDialogShow", "Lcom/wakeup/common/network/entity/user/AIVipDialog;", "pageName", "reportPayAction", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface AIVipService {
    @Headers({"Model-Type:2", "Product-Id:7", "Client-Type:2", "Channel-Id:1"})
    @GET("api/v1/aiMember/signing/checkCancelEligibility")
    Object checkCancelSignInfo(Continuation<? super BaseResult<UserSignCancelInfo>> continuation);

    @GET("api/v2/aiMember/package/list")
    Object getAIVip(@Query("aiMemberType") String str, Continuation<? super BaseResult<List<AiMemberPackage>>> continuation);

    @GET("api/v2/aiMember/package/funcList")
    Object getAIVipFunction(@Query("aiMemberType") String str, Continuation<? super BaseResult<List<AiFunction>>> continuation);

    @Headers({"Model-Type:2", "Product-Id:7", "Client-Type:2", "Channel-Id:1"})
    @GET("aiMember/popup")
    Object getDialogShow(@Query("pageName") String str, Continuation<? super BaseResult<AIVipDialog>> continuation);

    @Headers({"Model-Type:2", "Product-Id:7", "Client-Type:2", "Channel-Id:1"})
    @POST("api/v1/aiMember/pay/startPayment")
    Object getPayLink(@Body Map<String, Object> map, Continuation<? super BaseResult<AIVipPayLink>> continuation);

    @GET("ai/member/getUserMemberInfo")
    Object getUserAIVipInfo(@Query("userId") int i, @Query("region") int i2, Continuation<? super BaseResult<UserAiMemberResp>> continuation);

    @GET("api/v2/aiMember/order/getOrderByOrderNo")
    Object getUserOrderDetail(@Query("orderNo") String str, @Query("orderSourceType") int i, Continuation<? super BaseResult<AIVipOrder>> continuation);

    @GET("api/v2/aiMember/order/getUserOrder")
    Object getUserOrderList(@Query("userId") int i, @Query("orderType") int i2, @Query("page") int i3, @Query("size") int i4, Continuation<? super BaseResult<List<AIVipOrder>>> continuation);

    @POST("api/v1/aiMember/pay/userPayActionCallback")
    Object reportPayAction(@Body Map<String, Object> map, Continuation<? super BaseResult<Object>> continuation);

    @Headers({"Model-Type:2", "Product-Id:7", "Client-Type:2", "Channel-Id:1"})
    @POST("api/v1/aiMember/signing/startSign")
    Object startSignAutoPay(@Body Map<String, Object> map, Continuation<? super BaseResult<UserSigningResp>> continuation);

    @Headers({"Model-Type:2", "Product-Id:7", "Client-Type:2", "Channel-Id:1"})
    @POST("api/v1/aiMember/signing/cancelSign")
    Object stopAutoPay(Continuation<? super BaseResult<Object>> continuation);

    /* compiled from: AIVipService.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getAIVip$default(AIVipService aIVipService, String str, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAIVip");
            }
            if ((i & 1) != 0) {
                str = "erji";
            }
            return aIVipService.getAIVip(str, continuation);
        }

        public static /* synthetic */ Object getAIVipFunction$default(AIVipService aIVipService, String str, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAIVipFunction");
            }
            if ((i & 1) != 0) {
                str = "erji";
            }
            return aIVipService.getAIVipFunction(str, continuation);
        }

        public static /* synthetic */ Object getUserAIVipInfo$default(AIVipService aIVipService, int i, int i2, Continuation continuation, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUserAIVipInfo");
            }
            if ((i3 & 1) != 0) {
                String uid = UserDao.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                i = Integer.parseInt(uid);
            }
            if ((i3 & 2) != 0) {
                i2 = 2;
            }
            return aIVipService.getUserAIVipInfo(i, i2, continuation);
        }

        public static /* synthetic */ Object getUserOrderList$default(AIVipService aIVipService, int i, int i2, int i3, int i4, Continuation continuation, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUserOrderList");
            }
            if ((i5 & 1) != 0) {
                String uid = UserDao.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                i = Integer.parseInt(uid);
            }
            if ((i5 & 2) != 0) {
                i2 = 4;
            }
            if ((i5 & 4) != 0) {
                i3 = 1;
            }
            if ((i5 & 8) != 0) {
                i4 = 10;
            }
            int i6 = i3;
            return aIVipService.getUserOrderList(i, i2, i6, i4, continuation);
        }

        public static /* synthetic */ Object getUserOrderDetail$default(AIVipService aIVipService, String str, int i, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUserOrderDetail");
            }
            if ((i2 & 2) != 0) {
                i = 2;
            }
            return aIVipService.getUserOrderDetail(str, i, continuation);
        }
    }
}
