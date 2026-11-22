package com.wakeup.module.data.dao;

import androidx.sqlite.db.SupportSQLiteQuery;
import com.umeng.analytics.AnalyticsConfig;
import com.wakeup.module.data.entity.SportEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: SportDataDao.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H'¢\u0006\u0002\u0010\u0007J\"\u0010\b\u001a\u00020\u00032\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H§@¢\u0006\u0002\u0010\nJ$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u0010J4\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H§@¢\u0006\u0002\u0010\u0017J$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H§@¢\u0006\u0002\u0010\u0018J\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0014\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u001aJ\u0016\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u001aJ\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u001e\u001a\u00020\u001fH§@¢\u0006\u0002\u0010 J$\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u0010J&\u0010\"\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u0016H§@¢\u0006\u0002\u0010%¨\u0006&"}, d2 = {"Lcom/wakeup/module/data/dao/SportDataDao;", "", "save", "", "datas", "", "Lcom/wakeup/module/data/entity/SportEntity;", "([Lcom/wakeup/module/data/entity/SportEntity;)V", "delete", "dataList", "([Lcom/wakeup/module/data/entity/SportEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryDeviceNoUpload", "", "uid", "", "syncState", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasData", "mac", "", "type", "time", "", "(ILjava/lang/String;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryByType", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryById", "id", "query", "sql", "Landroidx/sqlite/db/SupportSQLiteQuery;", "(Landroidx/sqlite/db/SupportSQLiteQuery;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryUnCompleteData", "queryAllCount", AnalyticsConfig.RTD_START_TIME, "endTime", "(IJJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface SportDataDao {
    Object delete(SportEntity[] sportEntityArr, Continuation<? super Unit> continuation);

    Object hasData(int i, long j, Continuation<? super List<SportEntity>> continuation);

    Object hasData(int i, String str, int i2, long j, Continuation<? super List<SportEntity>> continuation);

    Object query(SupportSQLiteQuery supportSQLiteQuery, Continuation<? super List<SportEntity>> continuation);

    Object queryAllCount(int i, long j, long j2, Continuation<? super Long> continuation);

    Object queryById(int i, Continuation<? super SportEntity> continuation);

    Object queryByType(int i, Continuation<? super List<SportEntity>> continuation);

    Object queryDeviceNoUpload(int i, int i2, Continuation<? super List<SportEntity>> continuation);

    Object queryUnCompleteData(int i, int i2, Continuation<? super List<SportEntity>> continuation);

    void save(SportEntity... datas);
}
