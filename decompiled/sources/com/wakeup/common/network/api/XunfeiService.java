package com.wakeup.common.network.api;

import com.wakeup.common.network.entity.xunfei.XFBaseRsp;
import com.wakeup.common.network.entity.xunfei.XFCreateInfo;
import com.wakeup.common.network.entity.xunfei.XFQueryInfo;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Url;

/* compiled from: XunfeiService.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\tJ(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\f\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/wakeup/common/network/api/XunfeiService;", "", "postAudioFile", "Lcom/wakeup/common/network/entity/xunfei/XFBaseRsp;", "Lcom/wakeup/common/network/entity/xunfei/XFCreateInfo;", "url", "", "body", "Lokhttp3/RequestBody;", "(Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryResult", "Lcom/wakeup/common/network/entity/xunfei/XFQueryInfo;", "type", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface XunfeiService {
    @POST
    Object postAudioFile(@Url String str, @Body RequestBody requestBody, Continuation<? super XFBaseRsp<XFCreateInfo>> continuation);

    @GET
    Object queryResult(@Url String str, @Header("Content-Type") String str2, Continuation<? super XFBaseRsp<XFQueryInfo>> continuation);

    /* compiled from: XunfeiService.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object queryResult$default(XunfeiService xunfeiService, String str, String str2, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryResult");
            }
            if ((i & 2) != 0) {
                str2 = "multipart/form-data";
            }
            return xunfeiService.queryResult(str, str2, continuation);
        }
    }
}
