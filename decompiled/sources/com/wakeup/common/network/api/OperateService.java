package com.wakeup.common.network.api;

import com.wakeup.common.network.BaseResult;
import com.wakeup.common.network.entity.opts.AdInfo;
import com.wakeup.common.network.entity.opts.AdPopInfo;
import com.wakeup.common.network.entity.opts.BannerAdModel;
import com.wakeup.common.network.entity.opts.DeviceBannerAdModel;
import com.wakeup.common.network.entity.opts.DialogAdNewModel;
import com.wakeup.common.network.entity.opts.MessageEntity;
import com.wakeup.common.network.entity.other.HomeMenuEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* compiled from: OperateService.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@¢\u0006\u0002\u0010\u0005J\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0003H§@¢\u0006\u0002\u0010\u0005J8\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u00032\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\r\u001a\u00020\u000e2\b\b\u0003\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u0010JT\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00070\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u000e2\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u000eH§@¢\u0006\u0002\u0010\u0019JT\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00070\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u000e2\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u000eH§@¢\u0006\u0002\u0010\u0019J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00032\b\b\u0001\u0010\u001e\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u001fJ\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00032\b\b\u0001\u0010\"\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u001f¨\u0006#"}, d2 = {"Lcom/wakeup/common/network/api/OperateService;", "", "getPopupMapAdv", "Lcom/wakeup/common/network/BaseResult;", "Lcom/wakeup/common/network/entity/opts/DialogAdNewModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMenuBarList", "", "Lcom/wakeup/common/network/entity/other/HomeMenuEntity;", "getMessageCenterData", "Lcom/wakeup/common/network/entity/opts/MessageEntity;", "registerTime", "", "pageNum", "", "pageSize", "(JIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBannerAdList", "Lcom/wakeup/common/network/entity/opts/BannerAdModel;", "adId", "bluetoothName", "", "code", "frameworkVersion", "majorVersion", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDeviceBannerAdList", "Lcom/wakeup/common/network/entity/opts/DeviceBannerAdModel;", "getAdInfoById", "Lcom/wakeup/common/network/entity/opts/AdInfo;", "advertisingId", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAdvPopupInfoById", "Lcom/wakeup/common/network/entity/opts/AdPopInfo;", "advPopupId", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface OperateService {
    @GET("homePage/advertising/getAdvertisingInfoById")
    Object getAdInfoById(@Query("advertisingId") int i, Continuation<? super BaseResult<AdInfo>> continuation);

    @GET("homePage/advPopup/getAdvPopupInfoById")
    Object getAdvPopupInfoById(@Query("advPopupId") int i, Continuation<? super BaseResult<AdPopInfo>> continuation);

    @GET("homePage/advertising/getAdvertisingList")
    Object getBannerAdList(@Query("advertisingPositionId") int i, @Query("bluetoothName") String str, @Query("code") String str2, @Query("frameworkVersion") Integer num, @Query("majorVersion") Integer num2, Continuation<? super BaseResult<List<BannerAdModel>>> continuation);

    @GET("homePage/advertising/getAdvertisingList")
    Object getDeviceBannerAdList(@Query("advertisingPositionId") int i, @Query("bluetoothName") String str, @Query("code") String str2, @Query("frameworkVersion") Integer num, @Query("majorVersion") Integer num2, Continuation<? super BaseResult<List<DeviceBannerAdModel>>> continuation);

    @GET("/base/api/v1/function/homePage")
    Object getMenuBarList(Continuation<? super BaseResult<List<HomeMenuEntity>>> continuation);

    @GET("homePage/message/v2/getMessageList")
    Object getMessageCenterData(@Query("registerTime") long j, @Query("pageNum") int i, @Query("pageSize") int i2, Continuation<? super BaseResult<List<MessageEntity>>> continuation);

    @GET("homePage/advPopup/v2/getPopupMap")
    Object getPopupMapAdv(Continuation<? super BaseResult<DialogAdNewModel>> continuation);

    /* compiled from: OperateService.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getMessageCenterData$default(OperateService operateService, long j, int i, int i2, Continuation continuation, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMessageCenterData");
            }
            if ((i3 & 2) != 0) {
                i = 1;
            }
            if ((i3 & 4) != 0) {
                i2 = 1;
            }
            return operateService.getMessageCenterData(j, i, i2, continuation);
        }

        public static /* synthetic */ Object getBannerAdList$default(OperateService operateService, int i, String str, String str2, Integer num, Integer num2, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBannerAdList");
            }
            if ((i2 & 2) != 0) {
                str = null;
            }
            if ((i2 & 4) != 0) {
                str2 = null;
            }
            if ((i2 & 8) != 0) {
                num = null;
            }
            if ((i2 & 16) != 0) {
                num2 = null;
            }
            return operateService.getBannerAdList(i, str, str2, num, num2, continuation);
        }

        public static /* synthetic */ Object getDeviceBannerAdList$default(OperateService operateService, int i, String str, String str2, Integer num, Integer num2, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDeviceBannerAdList");
            }
            if ((i2 & 2) != 0) {
                str = null;
            }
            if ((i2 & 4) != 0) {
                str2 = null;
            }
            if ((i2 & 8) != 0) {
                num = null;
            }
            if ((i2 & 16) != 0) {
                num2 = null;
            }
            return operateService.getDeviceBannerAdList(i, str, str2, num, num2, continuation);
        }
    }
}
