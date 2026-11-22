package com.wakeup.common.network.api;

import com.wakeup.common.Constants;
import com.wakeup.common.network.BaseResult;
import com.wakeup.common.network.entity.BasicRequest;
import com.wakeup.common.network.entity.opts.BannerGameModel;
import com.wakeup.common.storage.model.FunctionComponentTypeModel;
import com.wakeup.common.storage.model.HomePageFunctionComponentModel;
import com.wakeup.common.storage.model.UserHomePageFunctionInfoModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* compiled from: FunctionalComponentService.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\\\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\f\u001a\u00020\n2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0002\u0010\u000eJN\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\n2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0002\u0010\u0012J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u0016H§@¢\u0006\u0002\u0010\u0017J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0019JZ\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\u001c\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\f\u001a\u00020\nH§@¢\u0006\u0002\u0010\u001dJ\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0003H§@¢\u0006\u0002\u0010 ¨\u0006!"}, d2 = {"Lcom/wakeup/common/network/api/FunctionalComponentService;", "", "getFunctionalComponentHomepageConfig", "Lcom/wakeup/common/network/BaseResult;", "Lcom/wakeup/common/storage/model/HomePageFunctionComponentModel;", "deviceCode", "", "deviceMac", "deviceVersion", "pageSize", "", "showPage", "showMore", "scoreVersion", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllFunctionalComponents", "", "Lcom/wakeup/common/storage/model/FunctionComponentTypeModel;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateFunctionalComponentHomepageConfig", "", Constants.BundleKey.BEAN, "Lcom/wakeup/common/network/entity/BasicRequest$DeviceFunctionComponent;", "(Lcom/wakeup/common/network/entity/BasicRequest$DeviceFunctionComponent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFunctionHighestNumber", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserHomePageFunctionInfo", "Lcom/wakeup/common/storage/model/UserHomePageFunctionInfoModel;", "productId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBannerGame", "Lcom/wakeup/common/network/entity/opts/BannerGameModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface FunctionalComponentService {
    @GET("userHomePageEquipment/getAllFunctionList")
    Object getAllFunctionalComponents(@Query("code") String str, @Query("mac") String str2, @Query("version") String str3, @Query("pageSize") int i, @Query("scoreVersion") Integer num, Continuation<? super BaseResult<List<FunctionComponentTypeModel>>> continuation);

    @GET("auth/banner/game")
    Object getBannerGame(Continuation<? super BaseResult<BannerGameModel>> continuation);

    @GET("userHomePageEquipment/getFunctionHighestNumber")
    Object getFunctionHighestNumber(@Query("productId") String str, Continuation<? super BaseResult<Integer>> continuation);

    @GET("userHomePageEquipment/getUserFunctionList")
    Object getFunctionalComponentHomepageConfig(@Query("code") String str, @Query("mac") String str2, @Query("version") String str3, @Query("pageSize") int i, @Query("showPage") int i2, @Query("showMore") int i3, @Query("scoreVersion") Integer num, Continuation<? super BaseResult<HomePageFunctionComponentModel>> continuation);

    @GET("userHomePageEquipment/getUserHomePageFunctionInfo")
    Object getUserHomePageFunctionInfo(@Query("code") String str, @Query("mac") String str2, @Query("version") String str3, @Query("productId") String str4, @Query("pageSize") int i, @Query("showPage") int i2, @Query("showMore") int i3, Continuation<? super BaseResult<UserHomePageFunctionInfoModel>> continuation);

    @POST("userHomePageEquipment/updateUserFunctionList")
    Object updateFunctionalComponentHomepageConfig(@Body BasicRequest.DeviceFunctionComponent deviceFunctionComponent, Continuation<? super BaseResult<Boolean>> continuation);

    /* compiled from: FunctionalComponentService.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getFunctionalComponentHomepageConfig$default(FunctionalComponentService functionalComponentService, String str, String str2, String str3, int i, int i2, int i3, Integer num, Continuation continuation, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFunctionalComponentHomepageConfig");
            }
            if ((i4 & 16) != 0) {
                i2 = 0;
            }
            if ((i4 & 32) != 0) {
                i3 = 0;
            }
            if ((i4 & 64) != 0) {
                num = null;
            }
            return functionalComponentService.getFunctionalComponentHomepageConfig(str, str2, str3, i, i2, i3, num, continuation);
        }

        public static /* synthetic */ Object getAllFunctionalComponents$default(FunctionalComponentService functionalComponentService, String str, String str2, String str3, int i, Integer num, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllFunctionalComponents");
            }
            if ((i2 & 16) != 0) {
                num = null;
            }
            return functionalComponentService.getAllFunctionalComponents(str, str2, str3, i, num, continuation);
        }

        public static /* synthetic */ Object getUserHomePageFunctionInfo$default(FunctionalComponentService functionalComponentService, String str, String str2, String str3, String str4, int i, int i2, int i3, Continuation continuation, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUserHomePageFunctionInfo");
            }
            if ((i4 & 32) != 0) {
                i2 = 0;
            }
            if ((i4 & 64) != 0) {
                i3 = 0;
            }
            return functionalComponentService.getUserHomePageFunctionInfo(str, str2, str3, str4, i, i2, i3, continuation);
        }
    }
}
