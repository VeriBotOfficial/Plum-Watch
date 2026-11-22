package com.wakeup.common.network.api;

import com.wakeup.common.network.BaseResult;
import com.wakeup.common.network.entity.BasicRequest;
import com.wakeup.common.network.entity.glasses.AiTimbreData;
import com.wakeup.common.network.entity.glasses.ChatTextCase;
import com.wakeup.common.network.entity.glasses.GiftVipStatus;
import com.wakeup.common.network.entity.glasses.GlassesFeatureResult;
import com.wakeup.common.network.entity.glasses.GlassesFunctionResult;
import com.wakeup.common.network.entity.glasses.GlassesKeyConfigV2;
import com.wakeup.common.network.entity.glasses.VideoShakeInfo;
import io.nats.client.support.ApiConstants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;

/* compiled from: GlassesService.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J<\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\nJ2\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\rJ/\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0019\b\u0001\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00110\u0010H§@¢\u0006\u0002\u0010\u0012J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003H§@¢\u0006\u0002\u0010\u0015J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H§@¢\u0006\u0002\u0010\u0015J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H§@¢\u0006\u0002\u0010\u0015J(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\b\u0003\u0010\u001b\u001a\u00020\u00062\b\b\u0001\u0010\u001c\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u001dJM\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\b\u0001\u0010\u001b\u001a\u00020\u00062\b\b\u0001\u0010\u001c\u001a\u00020\u00062\b\b\u0003\u0010\u001f\u001a\u00020\u00062\u0019\b\u0001\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00110\u0010H§@¢\u0006\u0002\u0010 J>\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u00062\b\b\u0001\u0010#\u001a\u00020$2\u0014\b\u0001\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0010H§@¢\u0006\u0002\u0010&J$\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0002\u0010*JD\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,0\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u00062\u0014\b\u0001\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00102\b\b\u0001\u0010.\u001a\u00020/H§@¢\u0006\u0002\u00100J>\u00101\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u00062\u0014\b\u0001\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00102\b\b\u0001\u0010.\u001a\u000202H§@¢\u0006\u0002\u00103JH\u00104\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u00062\u0014\b\u0001\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00102\b\b\u0001\u00105\u001a\u00020\u00062\b\b\u0001\u00106\u001a\u00020\u0006H§@¢\u0006\u0002\u00107J \u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001090\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0002\u0010*¨\u0006:"}, d2 = {"Lcom/wakeup/common/network/api/GlassesService;", "", "getAllFunctionList", "Lcom/wakeup/common/network/BaseResult;", "Lcom/wakeup/common/network/entity/glasses/GlassesFunctionResult;", "pid", "", "code", "mac", "version", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFunctionList", "Lcom/wakeup/common/network/entity/glasses/GlassesFeatureResult;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveSelectedFunction", "params", "", "Lkotlin/jvm/JvmSuppressWildcards;", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGiftVipStatus", "Lcom/wakeup/common/network/entity/glasses/GiftVipStatus;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "giftVip", "savePop", "checkHealth", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "url", "token", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPredictTime", "apikey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChatTextCase", "Lcom/wakeup/common/network/entity/glasses/ChatTextCase;", "type", "", ApiConstants.HEADERS, "(Ljava/lang/String;ILjava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getKeyList", "", "Lcom/wakeup/common/network/entity/glasses/GlassesKeyConfigV2;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSystemTimbreList", "", "Lcom/wakeup/common/network/entity/glasses/AiTimbreData;", "body", "Lcom/wakeup/common/network/entity/BasicRequest$TimbreListRequestBody;", "(Ljava/lang/String;Ljava/util/Map;Lcom/wakeup/common/network/entity/BasicRequest$TimbreListRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setTimbre", "Lcom/wakeup/common/network/entity/BasicRequest$SetTimbreRequestBody;", "(Ljava/lang/String;Ljava/util/Map;Lcom/wakeup/common/network/entity/BasicRequest$SetTimbreRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTimbre", "languageId", "deviceVersion", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVideoShakeInfo", "Lcom/wakeup/common/network/entity/glasses/VideoShakeInfo;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface GlassesService {
    @GET
    Object checkHealth(@Url String str, @Header("Authorization") String str2, Continuation<? super Response<ResponseBody>> continuation);

    @GET("userEyeglassesEquipment/getAllFunctionListV2")
    Object getAllFunctionList(@Query("pid") String str, @Query("code") String str2, @Query("mac") String str3, @Query("version") String str4, Continuation<? super BaseResult<GlassesFunctionResult>> continuation);

    @GET
    Object getChatTextCase(@Url String str, @Query("type") int i, @HeaderMap Map<String, String> map, Continuation<? super BaseResult<ChatTextCase>> continuation);

    @GET("userEyeglassesEquipment/getUserFunctionListV2")
    Object getFunctionList(@Query("code") String str, @Query("mac") String str2, @Query("version") String str3, Continuation<? super BaseResult<GlassesFeatureResult>> continuation);

    @GET("userEyeglassesEquipment/getGiftVipStatus")
    Object getGiftVipStatus(Continuation<? super BaseResult<GiftVipStatus>> continuation);

    @GET("userEyeglassesEquipment/v2/getKeyListV2")
    Object getKeyList(@Query("code") String str, Continuation<? super BaseResult<List<GlassesKeyConfigV2>>> continuation);

    @POST
    Object getPredictTime(@Url String str, @Header("Authorization") String str2, @Header("apikey") String str3, @Body Map<String, Object> map, Continuation<? super Response<ResponseBody>> continuation);

    @POST
    Object getSystemTimbreList(@Url String str, @HeaderMap Map<String, String> map, @Body BasicRequest.TimbreListRequestBody timbreListRequestBody, Continuation<? super BaseResult<List<AiTimbreData>>> continuation);

    @GET
    Object getTimbre(@Url String str, @HeaderMap Map<String, String> map, @Query("languageId") String str2, @Query("deviceVersion") String str3, Continuation<? super BaseResult<String>> continuation);

    @GET("videoShake/api/v1/getVideoShakeCode")
    Object getVideoShakeInfo(@Query("code") String str, Continuation<? super BaseResult<VideoShakeInfo>> continuation);

    @POST("userEyeglassesEquipment/giftVip")
    Object giftVip(Continuation<? super BaseResult<Object>> continuation);

    @POST("userEyeglassesEquipment/confirmPopUp")
    Object savePop(Continuation<? super BaseResult<Object>> continuation);

    @POST("userEyeglassesEquipment/updateUserFunctionList")
    Object saveSelectedFunction(@Body Map<String, Object> map, Continuation<? super BaseResult<Object>> continuation);

    @POST
    Object setTimbre(@Url String str, @HeaderMap Map<String, String> map, @Body BasicRequest.SetTimbreRequestBody setTimbreRequestBody, Continuation<? super BaseResult<Object>> continuation);

    /* compiled from: GlassesService.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object checkHealth$default(GlassesService glassesService, String str, String str2, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkHealth");
            }
            if ((i & 1) != 0) {
                str = "https://ai-cloud.4paradigm.com:9443/preview/video_stab/health_check";
            }
            return glassesService.checkHealth(str, str2, continuation);
        }

        public static /* synthetic */ Object getPredictTime$default(GlassesService glassesService, String str, String str2, String str3, Map map, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPredictTime");
            }
            if ((i & 4) != 0) {
                str3 = "2bLkxcVGbNlOzaDgFtKOreumitUESY77";
            }
            return glassesService.getPredictTime(str, str2, str3, map, continuation);
        }
    }
}
