package com.wakeup.common.network.api;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.wakeup.common.network.entity.whatsapp.BindResponse;
import com.wakeup.common.network.entity.whatsapp.DeviceStatusResponse;
import com.wakeup.common.network.entity.whatsapp.SendMessageResponse;
import com.wakeup.common.network.entity.whatsapp.TokenResponse;
import com.wakeup.common.network.entity.whatsapp.UnBindResponse;
import com.wakeup.common.network.entity.whatsapp.WhatsAppAccount;
import io.nats.client.support.ApiConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: WhatsAppApiService.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H§@¢\u0006\u0002\u0010\u0007J.\u0010\b\u001a\u00020\t2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ.\u0010\r\u001a\u00020\t2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u000e\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00112\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ$\u0010\u0012\u001a\u00020\u00132\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H§@¢\u0006\u0002\u0010\u0007J8\u0010\u0014\u001a\u00020\u00152\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0016\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\u0017J.\u0010\u0018\u001a\u00020\u00192\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0003\u0010\u001a\u001a\u00020\u001bH§@¢\u0006\u0002\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/wakeup/common/network/api/WhatsAppApiService;", "", "onlineStatus", "Lcom/wakeup/common/network/entity/whatsapp/DeviceStatusResponse;", ApiConstants.HEADERS, "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startBind", "Lcom/wakeup/common/network/entity/whatsapp/BindResponse;", "body", "Lokhttp3/RequestBody;", "(Ljava/util/Map;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryBind", "bindingId", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unbind", "Lcom/wakeup/common/network/entity/whatsapp/UnBindResponse;", "getToken", "Lcom/wakeup/common/network/entity/whatsapp/TokenResponse;", "sendMessage", "Lcom/wakeup/common/network/entity/whatsapp/SendMessageResponse;", "chatId", "(Ljava/util/Map;Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProfile", "Lcom/wakeup/common/network/entity/whatsapp/WhatsAppAccount;", TtmlNode.ANNOTATION_POSITION_AFTER, "", "(Ljava/util/Map;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface WhatsAppApiService {
    @GET("api/v1/account/profile")
    Object getProfile(@HeaderMap Map<String, String> map, @Query("qr_base64") boolean z, Continuation<? super WhatsAppAccount> continuation);

    @POST("api/v1/auth/events/token")
    Object getToken(@HeaderMap Map<String, String> map, Continuation<? super TokenResponse> continuation);

    @GET("api/v1/auth/status")
    Object onlineStatus(@HeaderMap Map<String, String> map, Continuation<? super DeviceStatusResponse> continuation);

    @GET("api/v1/auth/bind/status/{binding_id}")
    Object queryBind(@HeaderMap Map<String, String> map, @Path("binding_id") String str, Continuation<? super BindResponse> continuation);

    @POST("api/v1/chats/{chat_id}/messages")
    Object sendMessage(@HeaderMap Map<String, String> map, @Path("chat_id") String str, @Body RequestBody requestBody, Continuation<? super SendMessageResponse> continuation);

    @POST("api/v1/auth/bind/start")
    Object startBind(@HeaderMap Map<String, String> map, @Body RequestBody requestBody, Continuation<? super BindResponse> continuation);

    @POST("api/v1/auth/unbind")
    Object unbind(@HeaderMap Map<String, String> map, @Body RequestBody requestBody, Continuation<? super UnBindResponse> continuation);

    /* compiled from: WhatsAppApiService.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getProfile$default(WhatsAppApiService whatsAppApiService, Map map, boolean z, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getProfile");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            return whatsAppApiService.getProfile(map, z, continuation);
        }
    }
}
