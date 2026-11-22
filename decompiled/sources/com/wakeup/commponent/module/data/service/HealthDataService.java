package com.wakeup.commponent.module.data.service;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.umeng.analytics.AnalyticsConfig;
import com.wakeup.common.base.BaseCallback;
import com.wakeup.commponent.module.data.HealthConfig;
import com.wakeup.commponent.module.data.HealthData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: HealthDataService.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J7\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\t2\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\f\u0018\u00010\u000bH&¢\u0006\u0002\u0010\rJ\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\fH&J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH&J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\f2\u0006\u0010\u0013\u001a\u00020\u0014H¦@¢\u0006\u0002\u0010\u0015J.\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\f2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH¦@¢\u0006\u0002\u0010\u001cJ,\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\f2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH¦@¢\u0006\u0002\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH&J\u001c\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\n\u0010\u001f\u001a\u00020 \"\u00020\u0005H&J\b\u0010!\u001a\u00020\u0003H&J&\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010&J6\u0010'\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010-¨\u0006."}, d2 = {"Lcom/wakeup/commponent/module/data/service/HealthDataService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "setUid", "", "uid", "", "saveData", "datas", "", "Lcom/wakeup/commponent/module/data/HealthData;", "callback", "Lcom/wakeup/common/base/BaseCallback;", "", "([Lcom/wakeup/commponent/module/data/HealthData;Lcom/wakeup/common/base/BaseCallback;)V", "dataList", "replaceData", "oldData", "newData", "queryData", "config", "Lcom/wakeup/commponent/module/data/HealthConfig;", "(Lcom/wakeup/commponent/module/data/HealthConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryDataDay", "", "type", "time", "mac", "", "(IJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryDataMonth", "startUpload", "dataType", "", "deleteAllData", "downloadOssData", AnalyticsConfig.RTD_START_TIME, "endTime", "healthType", "(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadManualSleep", "", "deviceName", "sleepStartSec", "durationMin", "dayNo", "(Ljava/lang/String;Ljava/lang/String;JIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface HealthDataService extends IProvider {
    void deleteAllData();

    Object downloadOssData(long j, long j2, int i, Continuation<? super Unit> continuation);

    Object queryData(HealthConfig healthConfig, Continuation<? super List<HealthData>> continuation);

    Object queryDataDay(int i, long j, String str, Continuation<? super List<Long>> continuation);

    Object queryDataMonth(int i, long j, String str, Continuation<? super List<Long>> continuation);

    void replaceData(HealthData oldData, HealthData newData);

    void saveData(List<HealthData> dataList);

    void saveData(HealthData[] datas, BaseCallback<List<HealthData>> callback);

    void setUid(int uid);

    void startUpload(String mac);

    void startUpload(String mac, int... dataType);

    Object uploadManualSleep(String str, String str2, long j, int i, int i2, Continuation<? super Boolean> continuation);
}
