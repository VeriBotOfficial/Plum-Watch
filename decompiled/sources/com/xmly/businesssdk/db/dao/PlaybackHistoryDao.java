package com.xmly.businesssdk.db.dao;

import com.wakeup.common.burypoint.BuryPointPageId;
import com.xmly.businesssdk.db.entity.PlaybackHistoryEntity;
import io.nats.client.support.ApiConstants;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PlaybackHistoryDao.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH'J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH'J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000bH'¨\u0006\u000f"}, d2 = {"Lcom/xmly/businesssdk/db/dao/PlaybackHistoryDao;", "", "deleteByAlbumId", "", "albumId", "", "deleteOldestRecords", ApiConstants.LIMIT, "", "getAllHistory", "", "Lcom/xmly/businesssdk/db/entity/PlaybackHistoryEntity;", "getHistoryByAlbumId", "insertOrUpdate", BuryPointPageId.PAGE_ID_HISTORY, "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public interface PlaybackHistoryDao {
    void deleteByAlbumId(String albumId);

    void deleteOldestRecords(int limit);

    List<PlaybackHistoryEntity> getAllHistory();

    PlaybackHistoryEntity getHistoryByAlbumId(String albumId);

    void insertOrUpdate(PlaybackHistoryEntity history);
}
