package com.wakeup.common.network.api;

import com.wakeup.common.network.BaseResult;
import com.wakeup.common.network.entity.user.MedalGroupModel;
import com.wakeup.common.network.entity.user.MedalItemModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;

/* compiled from: MedalService.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H§@¢\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00040\u0003H§@¢\u0006\u0002\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/wakeup/common/network/api/MedalService;", "", "getMeMedal", "Lcom/wakeup/common/network/BaseResult;", "", "Lcom/wakeup/common/network/entity/user/MedalItemModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMedalList", "Lcom/wakeup/common/network/entity/user/MedalGroupModel;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface MedalService {
    @GET("medal/getPersonalListToShow")
    Object getMeMedal(Continuation<? super BaseResult<List<MedalItemModel>>> continuation);

    @GET("medal/personalList")
    Object getMedalList(Continuation<? super BaseResult<List<MedalGroupModel>>> continuation);
}
