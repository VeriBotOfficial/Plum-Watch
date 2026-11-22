package com.wakeup.common.network.api;

import com.wakeup.common.network.entity.BasicResponse;
import com.wakeup.common.network.entity.baidu.Result;
import com.wakeup.common.utils.BaiduCommon;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;

/* compiled from: GptService.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\fJI\u0010\r\u001a\u00020\u000e2\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u0014\b\u0001\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00102\u0019\b\u0001\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00120\u0010H§@¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/wakeup/common/network/api/GptService;", "", "getBaiduAccessToken", "Lcom/wakeup/common/network/entity/BasicResponse$BaiduAccessToken;", "url", "", "grantType", "clientId", "clientSecret", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDetectLanguage", "Lcom/wakeup/common/network/entity/BasicResponse$GetDetectLanguageResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "genAudio", "Lcom/wakeup/common/network/entity/baidu/Result;", "heads", "", "params", "Lkotlin/jvm/JvmSuppressWildcards;", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface GptService {
    @POST
    Object genAudio(@Url String str, @HeaderMap Map<String, String> map, @Body Map<String, Object> map2, Continuation<? super Result> continuation);

    @GET
    Object getBaiduAccessToken(@Url String str, @Query("grant_type") String str2, @Query("client_id") String str3, @Query("client_secret") String str4, Continuation<? super BasicResponse.BaiduAccessToken> continuation);

    @GET
    Object getDetectLanguage(@Url String str, Continuation<? super BasicResponse.GetDetectLanguageResponse> continuation);

    /* compiled from: GptService.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getBaiduAccessToken$default(GptService gptService, String str, String str2, String str3, String str4, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBaiduAccessToken");
            }
            if ((i & 1) != 0) {
                str = "https://openapi.baidu.com/oauth/2.0/token";
            }
            if ((i & 2) != 0) {
                str2 = "client_credentials";
            }
            if ((i & 4) != 0) {
                str3 = BaiduCommon.INSTANCE.getClientId();
            }
            if ((i & 8) != 0) {
                str4 = BaiduCommon.INSTANCE.getClientSecret();
            }
            String str5 = str3;
            return gptService.getBaiduAccessToken(str, str2, str5, str4, continuation);
        }

        public static /* synthetic */ Object genAudio$default(GptService gptService, String str, Map map, Map map2, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: genAudio");
            }
            if ((i & 1) != 0) {
                str = "https://duer-kids.baidu.com/botwatch/api/operation/aigc/stream/dcschat";
            }
            return gptService.genAudio(str, map, map2, continuation);
        }
    }
}
