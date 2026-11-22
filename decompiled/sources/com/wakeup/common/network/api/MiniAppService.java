package com.wakeup.common.network.api;

import com.wakeup.common.network.BaseResult;
import com.wakeup.common.tabconfig.XtabConfigBean;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.json.JSONObject;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/* compiled from: MiniAppService.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J \u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00032\b\b\u0001\u0010\n\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/wakeup/common/network/api/MiniAppService;", "", "queryAppInfo", "Lcom/wakeup/common/network/BaseResult;", "Lorg/json/JSONObject;", "appId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserTabConfig", "Lcom/wakeup/common/tabconfig/XtabConfigBean;", "userId", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface MiniAppService {
    @GET("wearfitApp/api/v1/xtab-config/getUserXtabConfig")
    Object getUserTabConfig(@Header("userId") String str, Continuation<? super BaseResult<XtabConfigBean>> continuation);

    @GET("wearfitApp/api/v1/miniProgram/queryAppInfo")
    Object queryAppInfo(@Query("appId") String str, Continuation<? super BaseResult<JSONObject>> continuation);
}
