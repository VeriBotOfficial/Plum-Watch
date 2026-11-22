package com.wakeup.module.data.dao;

import com.wakeup.module.data.entity.EventEntity;
import io.nats.client.support.ApiConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: EventDataDao.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H'¢\u0006\u0002\u0010\u0007J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tH§@¢\u0006\u0002\u0010\nJ\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\u000b\u001a\u00020\fH§@¢\u0006\u0002\u0010\rJ\"\u0010\u000e\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H§@¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u0010\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/wakeup/module/data/dao/EventDataDao;", "", "saveEvent", "", "dataList", "", "Lcom/wakeup/module/data/entity/EventEntity;", "([Lcom/wakeup/module/data/entity/EventEntity;)V", "query", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ApiConstants.LIMIT, "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteEvent", "([Lcom/wakeup/module/data/entity/EventEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllEvent", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface EventDataDao {
    Object deleteAllEvent(Continuation<? super Unit> continuation);

    Object deleteEvent(EventEntity[] eventEntityArr, Continuation<? super Unit> continuation);

    Object query(int i, Continuation<? super List<EventEntity>> continuation);

    Object query(Continuation<? super List<EventEntity>> continuation);

    void saveEvent(EventEntity... dataList);
}
