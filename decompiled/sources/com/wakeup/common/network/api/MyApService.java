package com.wakeup.common.network.api;

import com.wakeup.common.network.BaseResult;
import com.wakeup.common.network.wsh.SignConfiguration;
import com.wakeup.common.network.wsh.WeiLifeExchangeList;
import com.wakeup.common.network.wsh.WeiLifeTopBean;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* compiled from: MyApService.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@¢\u0006\u0002\u0010\u0005J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H§@¢\u0006\u0002\u0010\u0005J\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0003H§@¢\u0006\u0002\u0010\u0005J:\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032$\b\u0001\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0001`\u000fH§@¢\u0006\u0002\u0010\u0010J$\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\t0\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u0014J:\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032$\b\u0001\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0001`\u000fH§@¢\u0006\u0002\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/wakeup/common/network/api/MyApService;", "", "getApExchangeData", "Lcom/wakeup/common/network/BaseResult;", "Lcom/wakeup/common/network/wsh/WeiLifeExchangeList;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTotalScore", "", "getSignConfiguration", "", "Lcom/wakeup/common/network/wsh/SignConfiguration;", "addScore", "params", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "(Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getByPosition", "Lcom/wakeup/common/network/wsh/WeiLifeTopBean;", "positionId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "savePrize", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface MyApService {
    @POST("integral/userIntegral/auth/save")
    Object addScore(@Body HashMap<String, Object> hashMap, Continuation<? super BaseResult<Integer>> continuation);

    @GET("microLife/product/listSelfProduct")
    Object getApExchangeData(Continuation<? super BaseResult<WeiLifeExchangeList>> continuation);

    @GET("microLife/quickLink/getByPosition")
    Object getByPosition(@Query("positionId") String str, Continuation<? super BaseResult<List<WeiLifeTopBean>>> continuation);

    @GET("integral/sign/listTask")
    Object getSignConfiguration(Continuation<? super BaseResult<List<SignConfiguration>>> continuation);

    @GET("integral/userIntegral/auth/getAllPoint")
    Object getTotalScore(Continuation<? super BaseResult<Integer>> continuation);

    @POST("microLife/userPrize/insertPrize")
    Object savePrize(@Body HashMap<String, Object> hashMap, Continuation<? super BaseResult<Object>> continuation);
}
