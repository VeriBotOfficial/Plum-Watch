package com.xmly.businesssdk.player.util;

import com.xmly.businesssdk.network.bean.track.Track;
import com.xmly.businesssdk.network.bean.track.TrackPage;
import com.xmly.businesssdk.player.entity.Playable;
import com.xmly.businesssdk.utils.Converter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PlayableConverters.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0005J\u001a\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/xmly/businesssdk/player/util/TrackPagePlayableConverter;", "Lcom/xmly/businesssdk/utils/Converter;", "Lcom/xmly/businesssdk/network/bean/track/TrackPage;", "", "Lcom/xmly/businesssdk/player/entity/Playable;", "()V", "convert", "input", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class TrackPagePlayableConverter implements Converter<TrackPage, List<? extends Playable>> {
    @Override // com.xmly.businesssdk.utils.Converter
    public List<Playable> convert(TrackPage input) {
        List<Track> tracks;
        if (input == null || (tracks = input.getTracks()) == null || tracks.isEmpty()) {
            return null;
        }
        TrackPlayableConverter withAlbum = new TrackPlayableConverter().withAlbum(input.getAlbum());
        ArrayList arrayList = new ArrayList(input.getTracks().size());
        Iterator<Track> it = input.getTracks().iterator();
        while (it.hasNext()) {
            Playable convert = withAlbum.convert(it.next());
            if (convert != null) {
                arrayList.add(convert);
            }
        }
        return arrayList;
    }
}
