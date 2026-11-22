package com.wakeup.common.network.api;

import com.wakeup.common.Constants;
import com.wakeup.common.network.BaseResult;
import com.wakeup.common.network.entity.qibla.ReligionKoranList;
import com.wakeup.common.network.entity.qibla.SceneContentList;
import com.wakeup.common.network.entity.qibla.SceneFavoriteList;
import com.wakeup.common.network.entity.qibla.TasbihHistoryData;
import com.wakeup.common.network.entity.qibla.TasbihSevenDaysData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

/* compiled from: ReligionService.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J@\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032*\b\u0001\u0010\u0005\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0007j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001`\b0\u0006H§@¢\u0006\u0002\u0010\tJ/\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0019\b\u0001\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u000e0\rH§@¢\u0006\u0002\u0010\u000fJ/\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\u0019\b\u0001\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u000e0\rH§@¢\u0006\u0002\u0010\u000fJ5\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00060\u00032\u0019\b\u0001\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u000e0\rH§@¢\u0006\u0002\u0010\u000fJ/\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\u0019\b\u0001\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u000e0\rH§@¢\u0006\u0002\u0010\u000fJ/\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\u0019\b\u0001\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u000e0\rH§@¢\u0006\u0002\u0010\u000fJ:\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032$\b\u0001\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0007j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001`\bH§@¢\u0006\u0002\u0010\u001aJ\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0003H§@¢\u0006\u0002\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/wakeup/common/network/api/ReligionService;", "", "saveTasbih", "Lcom/wakeup/common/network/BaseResult;", "", Constants.BundleKey.BEAN, "", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWeekTasbih", "Lcom/wakeup/common/network/entity/qibla/TasbihSevenDaysData;", "queryMap", "", "Lkotlin/jvm/JvmSuppressWildcards;", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTasbihTotal", "", "getTasbihHistory", "Lcom/wakeup/common/network/entity/qibla/TasbihHistoryData;", "getQuranText", "Lcom/wakeup/common/network/entity/qibla/ReligionKoranList;", "getPraySceneText", "Lcom/wakeup/common/network/entity/qibla/SceneContentList;", "sceneFavorite", "", "(Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "myFavorite", "Lcom/wakeup/common/network/entity/qibla/SceneFavoriteList;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface ReligionService {
    @Headers({"Accept-Language:ar"})
    @GET("healthStatistics/show/auth/getPrayText")
    Object getPraySceneText(@QueryMap Map<String, Object> map, Continuation<? super BaseResult<SceneContentList>> continuation);

    @Headers({"Accept-Language:ar"})
    @GET("healthStatistics/show/auth/getQuranText")
    Object getQuranText(@QueryMap Map<String, Object> map, Continuation<? super BaseResult<ReligionKoranList>> continuation);

    @GET("healthStatistics/show/auth/getIqiblaHistoryByMonth")
    Object getTasbihHistory(@QueryMap Map<String, Object> map, Continuation<? super BaseResult<List<TasbihHistoryData>>> continuation);

    @GET("healthStatistics/show/auth/countIqibla")
    Object getTasbihTotal(@QueryMap Map<String, Object> map, Continuation<? super BaseResult<Long>> continuation);

    @GET("healthStatistics/show/auth/getIqiblaByWeek")
    Object getWeekTasbih(@QueryMap Map<String, Object> map, Continuation<? super BaseResult<TasbihSevenDaysData>> continuation);

    @GET("healthStatistics/userFavoritePray/myFavorite")
    Object myFavorite(Continuation<? super BaseResult<SceneFavoriteList>> continuation);

    @POST("healthStatistics/save/auth/setIqiblaDayData")
    Object saveTasbih(@Body List<HashMap<String, Object>> list, Continuation<? super BaseResult<String>> continuation);

    @POST("healthStatistics/userFavoritePray/favorite")
    Object sceneFavorite(@Body HashMap<String, Object> hashMap, Continuation<? super BaseResult<Integer>> continuation);
}
