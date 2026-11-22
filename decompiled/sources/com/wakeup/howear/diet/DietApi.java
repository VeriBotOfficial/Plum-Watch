package com.wakeup.howear.diet;

import com.baidu.ar.constants.HttpConstants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* compiled from: DietRetrofit.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'¨\u0006\b"}, d2 = {"Lcom/wakeup/howear/diet/DietApi;", "", HttpConstants.HTTP_BOARD, "Lretrofit2/Call;", "Lcom/wakeup/howear/diet/DietApiResp;", "Lcom/wakeup/howear/diet/BoardWrapper;", HiAnalyticsConstant.Direction.REQUEST, "Lcom/wakeup/howear/diet/BoardReq;", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface DietApi {
    @POST("api/user/board")
    Call<DietApiResp<BoardWrapper>> board(@Body BoardReq req);
}
