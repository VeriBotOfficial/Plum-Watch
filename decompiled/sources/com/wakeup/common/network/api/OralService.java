package com.wakeup.common.network.api;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.wakeup.common.network.BaseResult;
import com.wakeup.common.network.entity.oral.SessionInfo;
import com.wakeup.common.network.entity.oral.UserTokenBean;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* compiled from: OralService.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0019\b\u0001\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\b0\u0006H§@¢\u0006\u0002\u0010\tJ\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\n\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\fJ\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/wakeup/common/network/api/OralService;", "", "createSession", "Lcom/wakeup/common/network/BaseResult;", "Lcom/wakeup/common/network/entity/oral/SessionInfo;", "params", "", "", "Lkotlin/jvm/JvmSuppressWildcards;", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userToken", "Lcom/wakeup/common/network/entity/oral/UserTokenBean;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "endSession", JsonStorageKeyNames.SESSION_ID_KEY, "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface OralService {
    @POST("spoken/sparring/api/v1/createSession")
    Object createSession(@Body Map<String, Object> map, Continuation<? super BaseResult<SessionInfo>> continuation);

    @GET("spoken/sparring/api/v1/endSession")
    Object endSession(@Query("sessionId") String str, Continuation<? super BaseResult<SessionInfo>> continuation);

    @POST("spoken/sparring/api/v1/auth/user/token")
    Object userToken(@Query("userToken") String str, Continuation<? super BaseResult<UserTokenBean>> continuation);
}
