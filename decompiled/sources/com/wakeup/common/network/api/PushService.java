package com.wakeup.common.network.api;

import com.wakeup.common.network.BaseResult;
import com.wakeup.common.network.entity.opts.MessageEntity;
import com.wakeup.common.network.entity.push.PushMessageData;
import com.wakeup.common.network.entity.push.PushRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* compiled from: PushService.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000fJ8\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00040\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0002\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/wakeup/common/network/api/PushService;", "", "pushRegister", "Lcom/wakeup/common/network/BaseResult;", "", "body", "Lcom/wakeup/common/network/entity/push/PushRequest$PushRegisterWithVersionAndLanguage;", "(Lcom/wakeup/common/network/entity/push/PushRequest$PushRegisterWithVersionAndLanguage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pushReadCallback", "", "Lcom/wakeup/common/network/entity/push/PushRequest$PushReadCallback;", "(Lcom/wakeup/common/network/entity/push/PushRequest$PushReadCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pushPost2GetMessageList", "Lcom/wakeup/common/network/entity/push/PushMessageData;", "Lcom/wakeup/common/network/entity/push/PushRequest$PushGetMessageList;", "(Lcom/wakeup/common/network/entity/push/PushRequest$PushGetMessageList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pushGetMessageList", "Lcom/wakeup/common/network/entity/opts/MessageEntity;", "userId", "", "pageNum", "", "pageSize", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface PushService {
    @GET("push/push/getMessageList")
    Object pushGetMessageList(@Query("userId") String str, @Query("pageNum") int i, @Query("pageSize") int i2, Continuation<? super BaseResult<List<MessageEntity>>> continuation);

    @POST("push/push/getMessageList")
    Object pushPost2GetMessageList(@Body PushRequest.PushGetMessageList pushGetMessageList, Continuation<? super BaseResult<PushMessageData>> continuation);

    @POST("push/push/readCallback")
    Object pushReadCallback(@Body PushRequest.PushReadCallback pushReadCallback, Continuation<? super BaseResult<Boolean>> continuation);

    @POST("push/push/register")
    Object pushRegister(@Body PushRequest.PushRegisterWithVersionAndLanguage pushRegisterWithVersionAndLanguage, Continuation<? super BaseResult<List<Object>>> continuation);
}
