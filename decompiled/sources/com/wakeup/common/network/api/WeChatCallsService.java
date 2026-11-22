package com.wakeup.common.network.api;

import com.wakeup.common.network.BaseResult;
import com.wakeup.common.network.entity.wechat.WeCallDeviceInfo;
import com.wakeup.common.network.entity.wechat.WechatBean;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* compiled from: WeChatCallsService.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J/\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0019\b\u0001\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\f0\u000bH§@¢\u0006\u0002\u0010\rJ/\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0019\b\u0001\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\f0\u000bH§@¢\u0006\u0002\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/wakeup/common/network/api/WeChatCallsService;", "", "getWxUser", "Lcom/wakeup/common/network/BaseResult;", "Lcom/wakeup/common/network/entity/wechat/WechatBean;", "userId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDeviceInfo", "Lcom/wakeup/common/network/entity/wechat/WeCallDeviceInfo;", "body", "", "Lkotlin/jvm/JvmSuppressWildcards;", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createDevice", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface WeChatCallsService {
    @POST("wxDevice/v1/createDevice")
    Object createDevice(@Body Map<String, Object> map, Continuation<? super BaseResult<WeCallDeviceInfo>> continuation);

    @POST("wxDevice/v1/getDeviceInfo")
    Object getDeviceInfo(@Body Map<String, Object> map, Continuation<? super BaseResult<WeCallDeviceInfo>> continuation);

    @GET("wxUser/v1/getWxUser")
    Object getWxUser(@Query("userId") String str, Continuation<? super BaseResult<WechatBean>> continuation);
}
