package com.xmly.businesssdk.db.dao;

import com.xmly.businesssdk.db.entity.PlayRecordInfo;
import io.nats.client.support.ApiConstants;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PlayRecordDao.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH'J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH'J\u0012\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\rH'J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H'J\u001a\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u0011H'J\"\u0010\u0012\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH'¨\u0006\u0015"}, d2 = {"Lcom/xmly/businesssdk/db/dao/PlayRecordDao;", "", "deletePlayRecordByTrackId", "", "trackId", "", "deletePlayRecordInfoRange", "id", "", "insertPlayRecord", "playRecordInfo", "Lcom/xmly/businesssdk/db/entity/PlayRecordInfo;", "queryAllPlayRecordInfo", "", "queryPlayRecordByTrackId", "queryPlayRecordInfoListRange", ApiConstants.LIMIT, "", "updatePlayRecordInfoByTrackId", "playSeconds", "playTimeTotal", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public interface PlayRecordDao {
    void deletePlayRecordByTrackId(String trackId);

    void deletePlayRecordInfoRange(long id2);

    void insertPlayRecord(PlayRecordInfo playRecordInfo);

    List<PlayRecordInfo> queryAllPlayRecordInfo();

    PlayRecordInfo queryPlayRecordByTrackId(String trackId);

    List<PlayRecordInfo> queryPlayRecordInfoListRange(int limit);

    void updatePlayRecordInfoByTrackId(String trackId, long playSeconds, long playTimeTotal);
}
