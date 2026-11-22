package com.xmly.businesssdk.player.playrecord;

import com.xmly.businesssdk.db.entity.PlayRecordInfo;
import com.xmly.businesssdk.utils.Converter;
import com.xmly.businesssdk.utils.Logger;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* compiled from: PlayHistoryConverter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00072\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/xmly/businesssdk/player/playrecord/PlayHistoryConverter;", "Lcom/xmly/businesssdk/utils/Converter;", "Lcom/xmly/businesssdk/db/entity/PlayRecordInfo;", "Lcom/xmly/businesssdk/player/playrecord/PlayHistory;", "()V", "convert", "input", "Companion", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class PlayHistoryConverter implements Converter<PlayRecordInfo, PlayHistory> {
    private static final String TAG = "PlayHistoryConverter";

    @Override // com.xmly.businesssdk.utils.Converter
    public PlayHistory convert(PlayRecordInfo input) {
        Integer intOrNull;
        Integer intOrNull2;
        if (input == null) {
            return null;
        }
        int i = 0;
        PlayHistory playHistory = new PlayHistory(0, 0, 0, 0, 0L, 0L, 63, null);
        String albumId = input.getAlbumId();
        playHistory.setAlbum_id((albumId == null || (intOrNull2 = StringsKt.toIntOrNull(albumId)) == null) ? 0 : intOrNull2.intValue());
        String trackId = input.getTrackId();
        if (trackId != null && (intOrNull = StringsKt.toIntOrNull(trackId)) != null) {
            i = intOrNull.intValue();
        }
        playHistory.setTrack_id(i);
        playHistory.setBreak_second((int) input.getPlaySeconds());
        playHistory.setPlay_begin_at(input.getStartAt());
        playHistory.setPlay_end_at((input.getPlayTimeTotal() * 1000) + input.getStartAt());
        Logger.d(TAG, "转换播放历史: trackId=" + playHistory.getTrack_id() + ", albumId=" + playHistory.getAlbum_id() + ", break_second=" + playHistory.getBreak_second() + 's');
        return playHistory;
    }
}
