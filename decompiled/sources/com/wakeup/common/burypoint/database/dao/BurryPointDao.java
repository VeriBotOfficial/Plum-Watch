package com.wakeup.common.burypoint.database.dao;

import com.autonavi.aps.amapapi.config.Const;
import com.wakeup.common.burypoint.database.BurryPointDbEntity;
import io.nats.client.support.ApiConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: BurryPointDao.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000f\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH§@¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u001c\u0010\f\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH§@¢\u0006\u0002\u0010\nJ\u0016\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u001c\u0010\u000e\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH§@¢\u0006\u0002\u0010\nJ\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u0011H§@¢\u0006\u0002\u0010\u0012J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\u0014\u001a\u00020\u0015H§@¢\u0006\u0002\u0010\u0016J*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\t2\u0006\u0010\u0019\u001a\u00020\u0015H§@¢\u0006\u0002\u0010\u001aJ,\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH§@¢\u0006\u0002\u0010\u001fJ\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\u0014\u001a\u00020\u0015H§@¢\u0006\u0002\u0010\u0016J,\u0010!\u001a\u00020\u00032\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110\t2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u001dH§@¢\u0006\u0002\u0010$J\u001c\u0010%\u001a\u00020\u00032\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110\tH§@¢\u0006\u0002\u0010\nJ\u001e\u0010&\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\u001dH§@¢\u0006\u0002\u0010(J\u001c\u0010)\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\tH§@¢\u0006\u0002\u0010\nJ\u000e\u0010*\u001a\u00020\u0015H§@¢\u0006\u0002\u0010+J\u000e\u0010\u000e\u001a\u00020\u0003H§@¢\u0006\u0002\u0010+¨\u0006,"}, d2 = {"Lcom/wakeup/common/burypoint/database/dao/BurryPointDao;", "", "insert", "", Const.LBS_FAIL_BD_ENTITY, "Lcom/wakeup/common/burypoint/database/BurryPointDbEntity;", "(Lcom/wakeup/common/burypoint/database/BurryPointDbEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertAll", "entities", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "updateAll", "delete", "deleteAll", "queryByActionId", "actionId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryByStatus", "status", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryPendingUpload", "statuses", ApiConstants.LIMIT, "(Ljava/util/List;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryTimeoutUploading", "timeoutMs", "", "currentTime", "(IJJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryUploaded", "updateStatusByActionIds", "actionIds", "uploadTime", "(Ljava/util/List;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteByActionIds", "deleteUploadedBefore", "beforeTime", "(IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "countPending", "countAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface BurryPointDao {
    Object countAll(Continuation<? super Integer> continuation);

    Object countPending(List<Integer> list, Continuation<? super Integer> continuation);

    Object delete(BurryPointDbEntity burryPointDbEntity, Continuation<? super Unit> continuation);

    Object deleteAll(List<BurryPointDbEntity> list, Continuation<? super Unit> continuation);

    Object deleteAll(Continuation<? super Unit> continuation);

    Object deleteByActionIds(List<String> list, Continuation<? super Unit> continuation);

    Object deleteUploadedBefore(int i, long j, Continuation<? super Unit> continuation);

    Object insert(BurryPointDbEntity burryPointDbEntity, Continuation<? super Unit> continuation);

    Object insertAll(List<BurryPointDbEntity> list, Continuation<? super Unit> continuation);

    Object queryByActionId(String str, Continuation<? super BurryPointDbEntity> continuation);

    Object queryByStatus(int i, Continuation<? super List<BurryPointDbEntity>> continuation);

    Object queryPendingUpload(List<Integer> list, int i, Continuation<? super List<BurryPointDbEntity>> continuation);

    Object queryTimeoutUploading(int i, long j, long j2, Continuation<? super List<BurryPointDbEntity>> continuation);

    Object queryUploaded(int i, Continuation<? super List<BurryPointDbEntity>> continuation);

    Object update(BurryPointDbEntity burryPointDbEntity, Continuation<? super Unit> continuation);

    Object updateAll(List<BurryPointDbEntity> list, Continuation<? super Unit> continuation);

    Object updateStatusByActionIds(List<String> list, int i, long j, Continuation<? super Unit> continuation);
}
