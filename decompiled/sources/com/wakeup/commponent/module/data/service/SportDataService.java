package com.wakeup.commponent.module.data.service;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.wakeup.common.network.entity.sport.SportUploadRecordResponse;
import com.wakeup.commponent.module.data.SportConfig;
import com.wakeup.commponent.module.data.SportData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: SportDataService.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH¦@¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH¦@¢\u0006\u0002\u0010\tJ\"\u0010\u000b\u001a\u00020\u00032\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\r\"\u00020\bH¦@¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0010J\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\bH¦@¢\u0006\u0002\u0010\tJ\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00152\u0006\u0010\u0016\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0017J\u0018\u0010\u0018\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0019\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0017J\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00152\u0006\u0010\u001b\u001a\u00020\u001cH¦@¢\u0006\u0002\u0010\u001dJ\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00152\u0006\u0010\u001f\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0017J\u0016\u0010 \u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u001cH¦@¢\u0006\u0002\u0010\u001d¨\u0006\""}, d2 = {"Lcom/wakeup/commponent/module/data/service/SportDataService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "setUid", "", "uid", "", "save", "data", "Lcom/wakeup/commponent/module/data/SportData;", "(Lcom/wakeup/commponent/module/data/SportData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "replace", "delete", "dataList", "", "([Lcom/wakeup/commponent/module/data/SportData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadDevice", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadSport", "Lcom/wakeup/common/network/entity/sport/SportUploadRecordResponse;", "sportData", "queryByType", "", "type", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryById", "id", "queryByData", "sportConfig", "Lcom/wakeup/commponent/module/data/SportConfig;", "(Lcom/wakeup/commponent/module/data/SportConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryUnCompleteData", "synState", "queryAllCount", "", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface SportDataService extends IProvider {
    Object delete(SportData[] sportDataArr, Continuation<? super Unit> continuation);

    Object queryAllCount(SportConfig sportConfig, Continuation<? super Long> continuation);

    Object queryByData(SportConfig sportConfig, Continuation<? super List<SportData>> continuation);

    Object queryById(int i, Continuation<? super SportData> continuation);

    Object queryByType(int i, Continuation<? super List<SportData>> continuation);

    Object queryUnCompleteData(int i, Continuation<? super List<SportData>> continuation);

    Object replace(SportData sportData, Continuation<? super Unit> continuation);

    Object save(SportData sportData, Continuation<? super Unit> continuation);

    void setUid(int uid);

    Object uploadDevice(Continuation<? super Unit> continuation);

    Object uploadSport(SportData sportData, Continuation<? super SportUploadRecordResponse> continuation);
}
