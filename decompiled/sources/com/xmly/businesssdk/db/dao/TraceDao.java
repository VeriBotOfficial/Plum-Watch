package com.xmly.businesssdk.db.dao;

import com.autonavi.aps.amapapi.config.Const;
import com.xmly.businesssdk.db.entity.TraceEntity;
import io.nats.client.support.ApiConstants;
import java.util.List;
import kotlin.Metadata;

/* compiled from: TraceDao.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH'J\b\u0010\n\u001a\u00020\tH'J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\u0006\u0010\r\u001a\u00020\tH'J\u0016\u0010\u000e\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\fH'¨\u0006\u0011"}, d2 = {"Lcom/xmly/businesssdk/db/dao/TraceDao;", "", "deleteEvents", "", "ids", "", "", "deleteFailedEvents", "maxRetries", "", "getCount", "getPendingEvents", "Lcom/xmly/businesssdk/db/entity/TraceEntity;", ApiConstants.LIMIT, "incrementRetryCount", "insert", Const.LBS_FAIL_BD_ENTITY, "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public interface TraceDao {
    void deleteEvents(List<Long> ids);

    void deleteFailedEvents(int maxRetries);

    int getCount();

    List<TraceEntity> getPendingEvents(int limit);

    void incrementRetryCount(List<Long> ids);

    long insert(TraceEntity entity);
}
