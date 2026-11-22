package com.wakeup.common.network.api;

import com.wakeup.common.network.BaseResult;
import com.wakeup.common.network.wsh.OverseasLifeList;
import com.wakeup.common.network.wsh.SelectedList;
import com.wakeup.common.network.wsh.WeiLifeExchangeList;
import com.wakeup.common.network.wsh.WeiLifeHomeBean;
import com.wakeup.common.network.wsh.WeiLifeReturnList;
import com.wakeup.common.network.wsh.WeiLifeTopBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* compiled from: WeiLifeService.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@¢\u0006\u0002\u0010\u0005J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H§@¢\u0006\u0002\u0010\u0005J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H§@¢\u0006\u0002\u0010\u0005J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003H§@¢\u0006\u0002\u0010\u0005J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@¢\u0006\u0002\u0010\u0005J\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003H§@¢\u0006\u0002\u0010\u0005J\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003H§@¢\u0006\u0002\u0010\u0005J$\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u0014H§@¢\u0006\u0002\u0010\u0015J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003H§@¢\u0006\u0002\u0010\u0005¨\u0006\u0017"}, d2 = {"Lcom/wakeup/common/network/api/WeiLifeService;", "", "getHomeTopData", "Lcom/wakeup/common/network/BaseResult;", "Lcom/wakeup/common/network/wsh/WeiLifeHomeBean;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHomeExchangeData", "Lcom/wakeup/common/network/wsh/WeiLifeExchangeList;", "getHomeReturnData", "Lcom/wakeup/common/network/wsh/WeiLifeReturnList;", "getSelectData", "Lcom/wakeup/common/network/wsh/SelectedList;", "getHomeEnTopData", "getTopData", "Lcom/wakeup/common/network/wsh/OverseasLifeList;", "getListMiddleInfoData", "getBottomByPosition", "", "Lcom/wakeup/common/network/wsh/WeiLifeTopBean;", "positionId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getListBottomInfo", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface WeiLifeService {
    @GET("microLife/quickLink/en/getByPosition")
    Object getBottomByPosition(@Query("positionId") String str, Continuation<? super BaseResult<List<WeiLifeTopBean>>> continuation);

    @GET("microLife/quickLink/en/getHomeData")
    Object getHomeEnTopData(Continuation<? super BaseResult<WeiLifeHomeBean>> continuation);

    @GET("microLife/product/homeData")
    Object getHomeExchangeData(Continuation<? super BaseResult<WeiLifeExchangeList>> continuation);

    @GET("microLife/cashbackProduct/listProduct")
    Object getHomeReturnData(Continuation<? super BaseResult<WeiLifeReturnList>> continuation);

    @GET("microLife/quickLink/getHomeData")
    Object getHomeTopData(Continuation<? super BaseResult<WeiLifeHomeBean>> continuation);

    @GET("microLife/information/en/listBottomInfo")
    Object getListBottomInfo(Continuation<? super BaseResult<OverseasLifeList>> continuation);

    @GET("microLife/information/en/listMiddleInfo")
    Object getListMiddleInfoData(Continuation<? super BaseResult<OverseasLifeList>> continuation);

    @GET("microLife/welfare/listAndType")
    Object getSelectData(Continuation<? super BaseResult<SelectedList>> continuation);

    @GET("microLife/information/en/listTopInfo")
    Object getTopData(Continuation<? super BaseResult<OverseasLifeList>> continuation);
}
