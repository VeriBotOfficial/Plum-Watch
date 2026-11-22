package com.wakeup.common.network.api;

import com.wakeup.common.network.BaseResult;
import com.wakeup.common.network.entity.ai.ClientCountry;
import com.wakeup.common.network.entity.aipay.AiEnergyOrder;
import com.wakeup.common.network.entity.aipay.AiEnergyOrderList;
import com.wakeup.common.network.entity.aipay.AiEnergyPay;
import com.wakeup.common.network.entity.aipay.AiEnergyPrice;
import com.wakeup.common.network.entity.aipay.AiEnergyPrivilege;
import com.wakeup.common.network.entity.aipay.AiEnergyRule;
import com.wakeup.common.network.entity.aipay.CardEnergyList;
import com.wakeup.common.network.entity.aipay.EnergyExpendList;
import com.wakeup.common.network.entity.aipay.UserEnergy;
import io.nats.client.support.ApiConstants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Url;

/* compiled from: AiPayNetService.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JK\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0019\b\u0003\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\n0\u0007H§@¢\u0006\u0002\u0010\u000bJE\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0019\b\u0001\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\n0\u0007H§@¢\u0006\u0002\u0010\u000bJK\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0019\b\u0003\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\n0\u0007H§@¢\u0006\u0002\u0010\u000bJK\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00040\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0019\b\u0003\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\n0\u0007H§@¢\u0006\u0002\u0010\u000bJK\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00040\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0019\b\u0003\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\n0\u0007H§@¢\u0006\u0002\u0010\u000bJE\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0019\b\u0001\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\n0\u0007H§@¢\u0006\u0002\u0010\u000bJE\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0019\b\u0001\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\n0\u0007H§@¢\u0006\u0002\u0010\u000bJE\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0019\b\u0001\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\n0\u0007H§@¢\u0006\u0002\u0010\u000bJE\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0019\b\u0001\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\n0\u0007H§@¢\u0006\u0002\u0010\u000bJE\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0019\b\u0001\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\n0\u0007H§@¢\u0006\u0002\u0010\u000bJE\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0019\b\u0001\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\n0\u0007H§@¢\u0006\u0002\u0010\u000bJE\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0019\b\u0001\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\n0\u0007H§@¢\u0006\u0002\u0010\u000bJ*\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H§@¢\u0006\u0002\u0010 J4\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00032\b\b\u0001\u0010#\u001a\u00020\b2\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H§@¢\u0006\u0002\u0010$¨\u0006%"}, d2 = {"Lcom/wakeup/common/network/api/AiPayNetService;", "", "getUserBalance", "Lcom/wakeup/common/network/BaseResult;", "", "Lcom/wakeup/common/network/entity/aipay/UserEnergy;", ApiConstants.HEADERS, "", "", "params", "Lkotlin/jvm/JvmSuppressWildcards;", "(Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getReceiveBalance", "Lcom/wakeup/common/network/entity/aipay/CardEnergyList;", "getFeeRules", "Lcom/wakeup/common/network/entity/aipay/AiEnergyRule;", "getEnergyPrivilege", "Lcom/wakeup/common/network/entity/aipay/AiEnergyPrivilege;", "getPrices", "Lcom/wakeup/common/network/entity/aipay/AiEnergyPrice;", "createAiEnergyOrder", "Lcom/wakeup/common/network/entity/aipay/AiEnergyOrder;", "queryStripeOrderStatus", "startPayAiEnergy", "Lcom/wakeup/common/network/entity/aipay/AiEnergyPay;", "getEnergyOrderList", "Lcom/wakeup/common/network/entity/aipay/AiEnergyOrderList;", "getConsumeList", "Lcom/wakeup/common/network/entity/aipay/EnergyExpendList;", "getGiveConsumeList", "getGiveConsumeListById", "checkoutEnergy", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getClientCountry", "Lcom/wakeup/common/network/entity/ai/ClientCountry;", "url", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface AiPayNetService {
    @GET("gateway/machine/v2/aiChargeClient/v1/queryEnergyBalance")
    Object checkoutEnergy(@HeaderMap Map<String, String> map, Continuation<? super BaseResult<String>> continuation);

    @POST("gateway/wearfitPay/api/v2/Order/saveApiOrder")
    Object createAiEnergyOrder(@HeaderMap Map<String, String> map, @Body Map<String, Object> map2, Continuation<? super BaseResult<AiEnergyOrder>> continuation);

    @POST
    Object getClientCountry(@Url String str, @HeaderMap Map<String, String> map, Continuation<? super BaseResult<ClientCountry>> continuation);

    @POST("gateway/wearfitPay/api/v2/consumer/selectConsumeList")
    Object getConsumeList(@HeaderMap Map<String, String> map, @Body Map<String, Object> map2, Continuation<? super BaseResult<EnergyExpendList>> continuation);

    @POST("gateway/wearfitPay/api/v2/Order/getOrderList")
    Object getEnergyOrderList(@HeaderMap Map<String, String> map, @Body Map<String, Object> map2, Continuation<? super BaseResult<AiEnergyOrderList>> continuation);

    @POST("gateway/machine/v2/aiChargeClient/queryRuleContentType")
    Object getEnergyPrivilege(@HeaderMap Map<String, String> map, @Body Map<String, Object> map2, Continuation<? super BaseResult<List<AiEnergyPrivilege>>> continuation);

    @POST("gateway/machine/v2/aiChargeClient/chargeDetails")
    Object getFeeRules(@HeaderMap Map<String, String> map, @Body Map<String, Object> map2, Continuation<? super BaseResult<List<AiEnergyRule>>> continuation);

    @POST("gateway/wearfitPay/api/v2/consumer/selectGiveConsumeList")
    Object getGiveConsumeList(@HeaderMap Map<String, String> map, @Body Map<String, Object> map2, Continuation<? super BaseResult<EnergyExpendList>> continuation);

    @POST("gateway/wearfitPay/api/v2/consumer/selectGiveConsumeListByCouponId")
    Object getGiveConsumeListById(@HeaderMap Map<String, String> map, @Body Map<String, Object> map2, Continuation<? super BaseResult<EnergyExpendList>> continuation);

    @POST("gateway/wearfitPay/api/v2/rechargeRule/getRechargeRuleList")
    Object getPrices(@HeaderMap Map<String, String> map, @Body Map<String, Object> map2, Continuation<? super BaseResult<List<AiEnergyPrice>>> continuation);

    @POST("gateway/wearfitPay/api/v2/Order/getGiveOrderList")
    Object getReceiveBalance(@HeaderMap Map<String, String> map, @Body Map<String, Object> map2, Continuation<? super BaseResult<CardEnergyList>> continuation);

    @POST("gateway/wearfitPay/api/v2/balance/getRechargeBalanceListByUser")
    Object getUserBalance(@HeaderMap Map<String, String> map, @Body Map<String, Object> map2, Continuation<? super BaseResult<List<UserEnergy>>> continuation);

    @POST("gateway/wearfitPay/api/v2/Pay/queryStripeOrderStatus")
    Object queryStripeOrderStatus(@HeaderMap Map<String, String> map, @Body Map<String, Object> map2, Continuation<? super BaseResult<Object>> continuation);

    @POST("gateway/wearfitPay/api/v2/Pay/startPayment")
    Object startPayAiEnergy(@HeaderMap Map<String, String> map, @Body Map<String, Object> map2, Continuation<? super BaseResult<AiEnergyPay>> continuation);

    /* compiled from: AiPayNetService.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object getUserBalance$default(AiPayNetService aiPayNetService, Map map, Map map2, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUserBalance");
            }
            if ((i & 2) != 0) {
                map2 = MapsKt.emptyMap();
            }
            return aiPayNetService.getUserBalance(map, map2, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object getFeeRules$default(AiPayNetService aiPayNetService, Map map, Map map2, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFeeRules");
            }
            if ((i & 2) != 0) {
                map2 = MapsKt.emptyMap();
            }
            return aiPayNetService.getFeeRules(map, map2, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object getEnergyPrivilege$default(AiPayNetService aiPayNetService, Map map, Map map2, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getEnergyPrivilege");
            }
            if ((i & 2) != 0) {
                map2 = MapsKt.emptyMap();
            }
            return aiPayNetService.getEnergyPrivilege(map, map2, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object getPrices$default(AiPayNetService aiPayNetService, Map map, Map map2, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrices");
            }
            if ((i & 2) != 0) {
                map2 = MapsKt.emptyMap();
            }
            return aiPayNetService.getPrices(map, map2, continuation);
        }
    }
}
