package com.wakeup.common.network.api;

import com.wakeup.common.network.BaseResult;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* compiled from: DialSearchService.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00032\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH§@¢\u0006\u0002\u0010\nJ$\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\b0\u00032\b\b\u0001\u0010\f\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\rJ\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0003H§@¢\u0006\u0002\u0010\u000fJ\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\b0\u0003H§@¢\u0006\u0002\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/wakeup/common/network/api/DialSearchService;", "", "autoClassify", "Lcom/wakeup/common/network/BaseResult;", "", "", "", "dials", "", "Lcom/wakeup/common/network/api/DialSimple;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchByTag", "keyword", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getKeywords", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHotTags", "Lcom/wakeup/common/network/api/HotTagItem;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface DialSearchService {
    @POST("api/tag/auto-classify")
    Object autoClassify(@Body List<DialSimple> list, Continuation<? super BaseResult<Map<String, Integer>>> continuation);

    @GET("api/tag/hot")
    Object getHotTags(Continuation<? super BaseResult<List<HotTagItem>>> continuation);

    @GET("api/tag/keywords")
    Object getKeywords(Continuation<? super BaseResult<List<String>>> continuation);

    @GET("api/tag/search")
    Object searchByTag(@Query("keyword") String str, Continuation<? super BaseResult<List<Integer>>> continuation);
}
