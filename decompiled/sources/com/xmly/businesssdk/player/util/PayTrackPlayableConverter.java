package com.xmly.businesssdk.player.util;

import com.baidu.ar.arplay.core.engine.ARPScriptEnvironment;
import com.xmly.businesssdk.network.bean.album.Album;
import com.xmly.businesssdk.network.bean.track.Track;
import com.xmly.businesssdk.player.entity.Playable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlayableConverters.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0012\u0010\u000f\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xmly/businesssdk/player/util/PayTrackPlayableConverter;", "Lcom/xmly/businesssdk/player/util/TrackPlayableConverter;", "isVipUser", "", "(Z)V", "convert", "Lcom/xmly/businesssdk/player/entity/Playable;", "input", "Lcom/xmly/businesssdk/network/bean/track/Track;", "getPlayType", "", ARPScriptEnvironment.KEY_DATA_PIP_TRACK, "getPlayUrl", "", "trackId", "withAlbum", "album", "Lcom/xmly/businesssdk/network/bean/album/Album;", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class PayTrackPlayableConverter extends TrackPlayableConverter {
    private final boolean isVipUser;

    public PayTrackPlayableConverter(boolean z) {
        this.isVipUser = z;
    }

    private final int getPlayType(Track track) {
        if (track.getPayType() == 0) {
            return 0;
        }
        if (track.getPayType() == 1) {
            return 4096;
        }
        return track.getPayType() == 2 ? 4098 : 4097;
    }

    private final String getPlayUrl(Track track, String trackId) {
        return trackId;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.xmly.businesssdk.player.util.TrackPlayableConverter, com.xmly.businesssdk.utils.Converter
    public Playable convert(Track input) {
        Playable convert = super.convert(input);
        if (convert == null || input == null) {
            return null;
        }
        convert.setType(getPlayType(input));
        String id2 = convert.getId();
        Intrinsics.checkNotNullExpressionValue(id2, "id");
        String playUrl = getPlayUrl(input, id2);
        if (playUrl.length() > 0) {
            convert.setUrl(playUrl);
        }
        return convert;
    }

    @Override // com.xmly.businesssdk.player.util.TrackPlayableConverter
    public PayTrackPlayableConverter withAlbum(Album album) {
        super.withAlbum(album);
        return this;
    }
}
