package com.wakeup.common.network.api;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.wakeup.common.network.BaseResult;
import com.wakeup.common.network.entity.BasicRequest;
import com.wakeup.common.network.entity.weather.WeatherAllInfo;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

/* compiled from: WeatherService.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001Jd\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/wakeup/common/network/api/WeatherService;", "", "weatherAllInfo", "Lcom/wakeup/common/network/BaseResult;", "Lcom/wakeup/common/network/entity/weather/WeatherAllInfo;", "uToken", "", RemoteMessageConst.Notification.CHANNEL_ID, "productId", "modelType", "clientType", "timestamp", "sign", "body", "Lcom/wakeup/common/network/entity/BasicRequest$WeatherAllInfo;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/wakeup/common/network/entity/BasicRequest$WeatherAllInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface WeatherService {
    @POST("weather/v2/allInfo")
    Object weatherAllInfo(@Header("U-Token") String str, @Header("Channel-Id") String str2, @Header("Product-Id") String str3, @Header("Model-Type") String str4, @Header("Client-Type") String str5, @Header("timestamp") String str6, @Header("sign") String str7, @Body BasicRequest.WeatherAllInfo weatherAllInfo, Continuation<? super BaseResult<WeatherAllInfo>> continuation);
}
