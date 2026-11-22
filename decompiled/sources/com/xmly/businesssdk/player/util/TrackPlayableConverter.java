package com.xmly.businesssdk.player.util;

import com.xmly.businesssdk.network.bean.Announcer;
import com.xmly.businesssdk.network.bean.album.Album;
import com.xmly.businesssdk.network.bean.track.Track;
import com.xmly.businesssdk.player.entity.Playable;
import com.xmly.businesssdk.utils.Converter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlayableConverters.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\r\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xmly/businesssdk/player/util/TrackPlayableConverter;", "Lcom/xmly/businesssdk/utils/Converter;", "Lcom/xmly/businesssdk/network/bean/track/Track;", "Lcom/xmly/businesssdk/player/entity/Playable;", "()V", "album", "Lcom/xmly/businesssdk/network/bean/album/Album;", "getAlbum", "()Lcom/xmly/businesssdk/network/bean/album/Album;", "setAlbum", "(Lcom/xmly/businesssdk/network/bean/album/Album;)V", "convert", "input", "withAlbum", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public class TrackPlayableConverter implements Converter<Track, Playable> {
    private Album album;

    public final Album getAlbum() {
        return this.album;
    }

    public final void setAlbum(Album album) {
        this.album = album;
    }

    public TrackPlayableConverter withAlbum(Album album) {
        this.album = album;
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.xmly.businesssdk.utils.Converter
    public Playable convert(Track input) {
        String str;
        String str2;
        String title;
        Announcer announcer;
        if (input == null) {
            return null;
        }
        Playable playable = new Playable();
        playable.setId(String.valueOf(input.getDataId()));
        String title2 = input.getTitle();
        String str3 = "";
        if (title2 == null) {
            title2 = "";
        }
        playable.setTitle(title2);
        playable.setDuration(input.getDuration());
        playable.setSize((int) input.getPlaySize());
        Album album = this.album;
        if (album == null || (announcer = album.getAnnouncer()) == null || (str = announcer.getNickname()) == null) {
            str = "";
        }
        playable.setArtist(str);
        playable.setUrl(playable.getId());
        playable.putExtraInt(TrackUtils.KEY_SELECT_RECOMMEND_TAB_ID, 0);
        String title3 = input.getTitle();
        if (title3 == null) {
            title3 = "";
        } else {
            Intrinsics.checkNotNullExpressionValue(title3, "input.title ?: \"\"");
        }
        playable.putExtraString(TrackUtils.KEY_SELECT_RECOMMEND_TAB_NAME, title3);
        String img = input.getImg();
        if (img == null) {
            Album album2 = this.album;
            String img2 = album2 != null ? album2.getImg() : null;
            img = img2 == null ? "" : img2;
        }
        playable.setImgUrl(img);
        playable.setPlayCount(input.getPlayCount());
        Album album3 = this.album;
        if (album3 == null || (str2 = album3.getImg()) == null) {
            str2 = "";
        }
        playable.setAlbumImgUrl(str2);
        Album album4 = this.album;
        if (album4 != null && (title = album4.getTitle()) != null) {
            str3 = title;
        }
        playable.setAlbumTitle(str3);
        Album album5 = this.album;
        playable.setAlbumId(String.valueOf(album5 != null ? album5.getAlbumId() : input.getAlbumId()));
        playable.setPayType(input.getPayType());
        return playable;
    }
}
