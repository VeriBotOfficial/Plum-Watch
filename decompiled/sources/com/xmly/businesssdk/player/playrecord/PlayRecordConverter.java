package com.xmly.businesssdk.player.playrecord;

import com.xmly.businesssdk.db.entity.PlayRecordInfo;
import com.xmly.businesssdk.utils.Converter;
import com.xmly.businesssdk.utils.Logger;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* compiled from: PlayRecordConverter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00072\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/xmly/businesssdk/player/playrecord/PlayRecordConverter;", "Lcom/xmly/businesssdk/utils/Converter;", "Lcom/xmly/businesssdk/db/entity/PlayRecordInfo;", "Lcom/xmly/businesssdk/player/playrecord/BatchRecord;", "()V", "convert", "input", "Companion", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class PlayRecordConverter implements Converter<PlayRecordInfo, BatchRecord> {
    private static final String TAG = "PlayRecordConverter";

    @Override // com.xmly.businesssdk.utils.Converter
    public BatchRecord convert(PlayRecordInfo input) {
        Integer intOrNull;
        Integer intOrNull2;
        if (input == null) {
            return null;
        }
        int i = 0;
        BatchRecord batchRecord = new BatchRecord(0, 0, 0, 0L, 0, 0, null, null, null, null, 1023, null);
        String trackId = input.getTrackId();
        batchRecord.setTrack_id((trackId == null || (intOrNull2 = StringsKt.toIntOrNull(trackId)) == null) ? 0 : intOrNull2.intValue());
        String albumId = input.getAlbumId();
        if (albumId != null && (intOrNull = StringsKt.toIntOrNull(albumId)) != null) {
            i = intOrNull.intValue();
        }
        batchRecord.setAlbumId(i);
        batchRecord.setDuration((int) input.getPlayTimeTotal());
        batchRecord.setPlayed_secs((int) input.getPlaySeconds());
        batchRecord.setStarted_at(input.getStartAt());
        batchRecord.setPlay_type(input.getPlayType());
        Logger.d(TAG, "转换播放记录: trackId=" + batchRecord.getTrack_id() + ", albumId=" + batchRecord.getAlbumId() + ", duration=" + batchRecord.getDuration() + "s, played_secs=" + batchRecord.getPlayed_secs() + 's');
        return batchRecord;
    }
}
