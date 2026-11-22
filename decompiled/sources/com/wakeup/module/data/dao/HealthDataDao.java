package com.wakeup.module.data.dao;

import androidx.sqlite.db.SupportSQLiteQuery;
import com.umeng.analytics.AnalyticsConfig;
import com.wakeup.module.data.entity.HealthEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: HealthDataDao.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H'¢\u0006\u0002\u0010\u0007J!\u0010\b\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H'¢\u0006\u0002\u0010\u0007J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u000b\u001a\u00020\fH§@¢\u0006\u0002\u0010\rJ4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H§@¢\u0006\u0002\u0010\u0014J,\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH§@¢\u0006\u0002\u0010\u0017J4\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019H§@¢\u0006\u0002\u0010\u001aJ\u000e\u0010\u001b\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u001cJ\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\n2\u0006\u0010\u000b\u001a\u00020\fH§@¢\u0006\u0002\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/wakeup/module/data/dao/HealthDataDao;", "", "saveHealth", "", "datas", "", "Lcom/wakeup/module/data/entity/HealthEntity;", "([Lcom/wakeup/module/data/entity/HealthEntity;)V", "updateHealth", "query", "", "sql", "Landroidx/sqlite/db/SupportSQLiteQuery;", "(Landroidx/sqlite/db/SupportSQLiteQuery;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uid", "", "type", AnalyticsConfig.RTD_START_TIME, "", "endTime", "(IIJJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryNoUpload", "syncState", "(IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mac", "", "(IIILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryHaveDateDay", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface HealthDataDao {
    Object deleteAllData(Continuation<? super Unit> continuation);

    Object query(int i, int i2, long j, long j2, Continuation<? super List<HealthEntity>> continuation);

    Object query(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super List<HealthEntity>> continuation);

    Object queryHaveDateDay(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super List<String>> continuation);

    Object queryNoUpload(int i, int i2, int i3, String str, Continuation<? super List<HealthEntity>> continuation);

    Object queryNoUpload(int i, int i2, int i3, Continuation<? super List<HealthEntity>> continuation);

    void saveHealth(HealthEntity... datas);

    void updateHealth(HealthEntity... datas);
}
