package com.wakeup.commponent.module.data.service;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.wakeup.commponent.module.data.EventData;
import io.nats.client.support.ApiConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: EventDataService.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H&¢\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\n\u001a\u00020\u000bH¦@¢\u0006\u0002\u0010\fJ!\u0010\r\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H&¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u0003H&¨\u0006\u000f"}, d2 = {"Lcom/wakeup/commponent/module/data/service/EventDataService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "saveEventData", "", "dataArray", "", "Lcom/wakeup/commponent/module/data/EventData;", "([Lcom/wakeup/commponent/module/data/EventData;)V", "queryEventData", "", ApiConstants.LIMIT, "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteEventData", "deleteAllEventData", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface EventDataService extends IProvider {
    void deleteAllEventData();

    void deleteEventData(EventData... dataArray);

    Object queryEventData(int i, Continuation<? super List<EventData>> continuation);

    void saveEventData(EventData... dataArray);
}
