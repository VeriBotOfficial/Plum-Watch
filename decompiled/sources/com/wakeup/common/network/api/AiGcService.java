package com.wakeup.common.network.api;

import com.wakeup.common.network.BaseResult;
import com.wakeup.common.network.entity.aigc.AiDialBean;
import com.wakeup.common.network.entity.aigc.SubmitBean;
import com.wakeup.common.network.entity.aigc.SubmitResult;
import io.nats.client.support.ApiConstants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Url;

/* compiled from: AiGcService.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JD\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ:\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\tH§@¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/wakeup/common/network/api/AiGcService;", "", "weikeAiGcSubmit", "Lcom/wakeup/common/network/BaseResult;", "", "Lcom/wakeup/common/network/entity/aigc/SubmitResult;", "url", "", ApiConstants.HEADERS, "", "body", "Lcom/wakeup/common/network/entity/aigc/SubmitBean;", "(Ljava/lang/String;Ljava/util/Map;Lcom/wakeup/common/network/entity/aigc/SubmitBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAiGcStyle", "", "Lcom/wakeup/common/network/entity/aigc/AiDialBean;", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface AiGcService {
    @GET
    Object getAiGcStyle(@Url String str, @HeaderMap Map<String, String> map, Continuation<? super BaseResult<List<AiDialBean>>> continuation);

    @POST
    Object weikeAiGcSubmit(@Url String str, @HeaderMap Map<String, String> map, @Body SubmitBean submitBean, Continuation<? super BaseResult<List<SubmitResult>>> continuation);
}
