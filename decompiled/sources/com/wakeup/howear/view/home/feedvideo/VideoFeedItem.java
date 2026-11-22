package com.wakeup.howear.view.home.feedvideo;

import android.gov.nist.core.Separators;
import com.anythink.core.express.b.a;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.wakeup.common.network.entity.video.VideoEntity;
import com.wakeup.feature.aimusic.model.AiPlaylist;
import com.wakeup.feature.aimusic.model.Song;
import com.wakeup.howear.model.domain.feedmenu.entity.FeedMenuDomainEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VideoFeedItem.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00062\u00020\u0001:\n\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005\u0082\u0001\t\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/wakeup/howear/view/home/feedvideo/VideoFeedItem;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "<init>", "()V", "isMusicItem", "", "Companion", "Video", "Ad", "Menu", "Dial", "ImageText", "MusicRecent", "MusicPlaylist", "MusicRecoChip", "MusicRecoPlaylists", "Lcom/wakeup/howear/view/home/feedvideo/VideoFeedItem$Ad;", "Lcom/wakeup/howear/view/home/feedvideo/VideoFeedItem$Dial;", "Lcom/wakeup/howear/view/home/feedvideo/VideoFeedItem$ImageText;", "Lcom/wakeup/howear/view/home/feedvideo/VideoFeedItem$Menu;", "Lcom/wakeup/howear/view/home/feedvideo/VideoFeedItem$MusicPlaylist;", "Lcom/wakeup/howear/view/home/feedvideo/VideoFeedItem$MusicRecent;", "Lcom/wakeup/howear/view/home/feedvideo/VideoFeedItem$MusicRecoChip;", "Lcom/wakeup/howear/view/home/feedvideo/VideoFeedItem$MusicRecoPlaylists;", "Lcom/wakeup/howear/view/home/feedvideo/VideoFeedItem$Video;", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class VideoFeedItem implements MultiItemEntity {
    public static final int TYPE_AD = 1;
    public static final int TYPE_DIAL = 3;
    public static final int TYPE_IMAGE_TEXT = 4;
    public static final int TYPE_MENU = 2;
    public static final int TYPE_MUSIC_PLAYLIST = 6;
    public static final int TYPE_MUSIC_RECENT = 5;
    public static final int TYPE_MUSIC_RECO_CHIP = 7;
    public static final int TYPE_MUSIC_RECO_SONGS = 8;
    public static final int TYPE_VIDEO = 0;

    public /* synthetic */ VideoFeedItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private VideoFeedItem() {
    }

    public final boolean isMusicItem() {
        return (this instanceof MusicRecent) || (this instanceof MusicPlaylist) || (this instanceof MusicRecoChip) || (this instanceof MusicRecoPlaylists);
    }

    /* compiled from: VideoFeedItem.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\tHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/wakeup/howear/view/home/feedvideo/VideoFeedItem$Video;", "Lcom/wakeup/howear/view/home/feedvideo/VideoFeedItem;", "data", "Lcom/wakeup/common/network/entity/video/VideoEntity;", "<init>", "(Lcom/wakeup/common/network/entity/video/VideoEntity;)V", "getData", "()Lcom/wakeup/common/network/entity/video/VideoEntity;", "itemType", "", "getItemType", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Video extends VideoFeedItem {
        private final VideoEntity data;

        public static /* synthetic */ Video copy$default(Video video, VideoEntity videoEntity, int i, Object obj) {
            if ((i & 1) != 0) {
                videoEntity = video.data;
            }
            return video.copy(videoEntity);
        }

        /* renamed from: component1, reason: from getter */
        public final VideoEntity getData() {
            return this.data;
        }

        public final Video copy(VideoEntity data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new Video(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Video) && Intrinsics.areEqual(this.data, ((Video) other).data);
        }

        @Override // com.chad.library.adapter.base.entity.MultiItemEntity
        /* renamed from: getItemType */
        public int getType() {
            return 0;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Video(data=" + this.data + Separators.RPAREN;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Video(VideoEntity data) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        public final VideoEntity getData() {
            return this.data;
        }
    }

    /* compiled from: VideoFeedItem.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\tHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/wakeup/howear/view/home/feedvideo/VideoFeedItem$Ad;", "Lcom/wakeup/howear/view/home/feedvideo/VideoFeedItem;", "data", "Lcom/wakeup/common/network/entity/video/VideoEntity;", "<init>", "(Lcom/wakeup/common/network/entity/video/VideoEntity;)V", "getData", "()Lcom/wakeup/common/network/entity/video/VideoEntity;", "itemType", "", "getItemType", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Ad extends VideoFeedItem {
        private final VideoEntity data;

        public static /* synthetic */ Ad copy$default(Ad ad, VideoEntity videoEntity, int i, Object obj) {
            if ((i & 1) != 0) {
                videoEntity = ad.data;
            }
            return ad.copy(videoEntity);
        }

        /* renamed from: component1, reason: from getter */
        public final VideoEntity getData() {
            return this.data;
        }

        public final Ad copy(VideoEntity data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new Ad(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Ad) && Intrinsics.areEqual(this.data, ((Ad) other).data);
        }

        @Override // com.chad.library.adapter.base.entity.MultiItemEntity
        /* renamed from: getItemType */
        public int getType() {
            return 1;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Ad(data=" + this.data + Separators.RPAREN;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ad(VideoEntity data) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        public final VideoEntity getData() {
            return this.data;
        }
    }

    /* compiled from: VideoFeedItem.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\tHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/wakeup/howear/view/home/feedvideo/VideoFeedItem$Menu;", "Lcom/wakeup/howear/view/home/feedvideo/VideoFeedItem;", "data", "Lcom/wakeup/howear/model/domain/feedmenu/entity/FeedMenuDomainEntity;", "<init>", "(Lcom/wakeup/howear/model/domain/feedmenu/entity/FeedMenuDomainEntity;)V", "getData", "()Lcom/wakeup/howear/model/domain/feedmenu/entity/FeedMenuDomainEntity;", "itemType", "", "getItemType", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Menu extends VideoFeedItem {
        private final FeedMenuDomainEntity data;

        public static /* synthetic */ Menu copy$default(Menu menu, FeedMenuDomainEntity feedMenuDomainEntity, int i, Object obj) {
            if ((i & 1) != 0) {
                feedMenuDomainEntity = menu.data;
            }
            return menu.copy(feedMenuDomainEntity);
        }

        /* renamed from: component1, reason: from getter */
        public final FeedMenuDomainEntity getData() {
            return this.data;
        }

        public final Menu copy(FeedMenuDomainEntity data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new Menu(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Menu) && Intrinsics.areEqual(this.data, ((Menu) other).data);
        }

        @Override // com.chad.library.adapter.base.entity.MultiItemEntity
        /* renamed from: getItemType */
        public int getType() {
            return 2;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Menu(data=" + this.data + Separators.RPAREN;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Menu(FeedMenuDomainEntity data) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        public final FeedMenuDomainEntity getData() {
            return this.data;
        }
    }

    /* compiled from: VideoFeedItem.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\tHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/wakeup/howear/view/home/feedvideo/VideoFeedItem$Dial;", "Lcom/wakeup/howear/view/home/feedvideo/VideoFeedItem;", "data", "Lcom/wakeup/common/network/entity/video/VideoEntity;", "<init>", "(Lcom/wakeup/common/network/entity/video/VideoEntity;)V", "getData", "()Lcom/wakeup/common/network/entity/video/VideoEntity;", "itemType", "", "getItemType", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Dial extends VideoFeedItem {
        private final VideoEntity data;

        public static /* synthetic */ Dial copy$default(Dial dial, VideoEntity videoEntity, int i, Object obj) {
            if ((i & 1) != 0) {
                videoEntity = dial.data;
            }
            return dial.copy(videoEntity);
        }

        /* renamed from: component1, reason: from getter */
        public final VideoEntity getData() {
            return this.data;
        }

        public final Dial copy(VideoEntity data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new Dial(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Dial) && Intrinsics.areEqual(this.data, ((Dial) other).data);
        }

        @Override // com.chad.library.adapter.base.entity.MultiItemEntity
        /* renamed from: getItemType */
        public int getType() {
            return 3;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Dial(data=" + this.data + Separators.RPAREN;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dial(VideoEntity data) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        public final VideoEntity getData() {
            return this.data;
        }
    }

    /* compiled from: VideoFeedItem.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\tHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/wakeup/howear/view/home/feedvideo/VideoFeedItem$ImageText;", "Lcom/wakeup/howear/view/home/feedvideo/VideoFeedItem;", "data", "Lcom/wakeup/common/network/entity/video/VideoEntity;", "<init>", "(Lcom/wakeup/common/network/entity/video/VideoEntity;)V", "getData", "()Lcom/wakeup/common/network/entity/video/VideoEntity;", "itemType", "", "getItemType", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ImageText extends VideoFeedItem {
        private final VideoEntity data;

        public static /* synthetic */ ImageText copy$default(ImageText imageText, VideoEntity videoEntity, int i, Object obj) {
            if ((i & 1) != 0) {
                videoEntity = imageText.data;
            }
            return imageText.copy(videoEntity);
        }

        /* renamed from: component1, reason: from getter */
        public final VideoEntity getData() {
            return this.data;
        }

        public final ImageText copy(VideoEntity data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new ImageText(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ImageText) && Intrinsics.areEqual(this.data, ((ImageText) other).data);
        }

        @Override // com.chad.library.adapter.base.entity.MultiItemEntity
        /* renamed from: getItemType */
        public int getType() {
            return 4;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "ImageText(data=" + this.data + Separators.RPAREN;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ImageText(VideoEntity data) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        public final VideoEntity getData() {
            return this.data;
        }
    }

    /* compiled from: VideoFeedItem.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/wakeup/howear/view/home/feedvideo/VideoFeedItem$MusicRecent;", "Lcom/wakeup/howear/view/home/feedvideo/VideoFeedItem;", "titleIsHot", "", "songs", "", "Lcom/wakeup/feature/aimusic/model/Song;", "<init>", "(ZLjava/util/List;)V", "getTitleIsHot", "()Z", "getSongs", "()Ljava/util/List;", "itemType", "", "getItemType", "()I", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MusicRecent extends VideoFeedItem {
        private final List<Song> songs;
        private final boolean titleIsHot;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MusicRecent copy$default(MusicRecent musicRecent, boolean z, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                z = musicRecent.titleIsHot;
            }
            if ((i & 2) != 0) {
                list = musicRecent.songs;
            }
            return musicRecent.copy(z, list);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getTitleIsHot() {
            return this.titleIsHot;
        }

        public final List<Song> component2() {
            return this.songs;
        }

        public final MusicRecent copy(boolean titleIsHot, List<Song> songs) {
            Intrinsics.checkNotNullParameter(songs, "songs");
            return new MusicRecent(titleIsHot, songs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MusicRecent)) {
                return false;
            }
            MusicRecent musicRecent = (MusicRecent) other;
            return this.titleIsHot == musicRecent.titleIsHot && Intrinsics.areEqual(this.songs, musicRecent.songs);
        }

        @Override // com.chad.library.adapter.base.entity.MultiItemEntity
        /* renamed from: getItemType */
        public int getType() {
            return 5;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.titleIsHot) * 31) + this.songs.hashCode();
        }

        public String toString() {
            return "MusicRecent(titleIsHot=" + this.titleIsHot + ", songs=" + this.songs + Separators.RPAREN;
        }

        public final boolean getTitleIsHot() {
            return this.titleIsHot;
        }

        public final List<Song> getSongs() {
            return this.songs;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MusicRecent(boolean z, List<Song> songs) {
            super(null);
            Intrinsics.checkNotNullParameter(songs, "songs");
            this.titleIsHot = z;
            this.songs = songs;
        }
    }

    /* compiled from: VideoFeedItem.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/wakeup/howear/view/home/feedvideo/VideoFeedItem$MusicPlaylist;", "Lcom/wakeup/howear/view/home/feedvideo/VideoFeedItem;", "playlist", "Lcom/wakeup/feature/aimusic/model/AiPlaylist;", "position", "", "forcedHeightPx", "", "<init>", "(Lcom/wakeup/feature/aimusic/model/AiPlaylist;Ljava/lang/String;I)V", "getPlaylist", "()Lcom/wakeup/feature/aimusic/model/AiPlaylist;", "getPosition", "()Ljava/lang/String;", "getForcedHeightPx", "()I", "itemType", "getItemType", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MusicPlaylist extends VideoFeedItem {
        private final int forcedHeightPx;
        private final AiPlaylist playlist;
        private final String position;

        public static /* synthetic */ MusicPlaylist copy$default(MusicPlaylist musicPlaylist, AiPlaylist aiPlaylist, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                aiPlaylist = musicPlaylist.playlist;
            }
            if ((i2 & 2) != 0) {
                str = musicPlaylist.position;
            }
            if ((i2 & 4) != 0) {
                i = musicPlaylist.forcedHeightPx;
            }
            return musicPlaylist.copy(aiPlaylist, str, i);
        }

        /* renamed from: component1, reason: from getter */
        public final AiPlaylist getPlaylist() {
            return this.playlist;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPosition() {
            return this.position;
        }

        /* renamed from: component3, reason: from getter */
        public final int getForcedHeightPx() {
            return this.forcedHeightPx;
        }

        public final MusicPlaylist copy(AiPlaylist playlist, String position, int forcedHeightPx) {
            Intrinsics.checkNotNullParameter(playlist, "playlist");
            Intrinsics.checkNotNullParameter(position, "position");
            return new MusicPlaylist(playlist, position, forcedHeightPx);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MusicPlaylist)) {
                return false;
            }
            MusicPlaylist musicPlaylist = (MusicPlaylist) other;
            return Intrinsics.areEqual(this.playlist, musicPlaylist.playlist) && Intrinsics.areEqual(this.position, musicPlaylist.position) && this.forcedHeightPx == musicPlaylist.forcedHeightPx;
        }

        @Override // com.chad.library.adapter.base.entity.MultiItemEntity
        /* renamed from: getItemType */
        public int getType() {
            return 6;
        }

        public int hashCode() {
            return (((this.playlist.hashCode() * 31) + this.position.hashCode()) * 31) + Integer.hashCode(this.forcedHeightPx);
        }

        public String toString() {
            return "MusicPlaylist(playlist=" + this.playlist + ", position=" + this.position + ", forcedHeightPx=" + this.forcedHeightPx + Separators.RPAREN;
        }

        public /* synthetic */ MusicPlaylist(AiPlaylist aiPlaylist, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(aiPlaylist, str, (i2 & 4) != 0 ? 0 : i);
        }

        public final AiPlaylist getPlaylist() {
            return this.playlist;
        }

        public final String getPosition() {
            return this.position;
        }

        public final int getForcedHeightPx() {
            return this.forcedHeightPx;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MusicPlaylist(AiPlaylist playlist, String position, int i) {
            super(null);
            Intrinsics.checkNotNullParameter(playlist, "playlist");
            Intrinsics.checkNotNullParameter(position, "position");
            this.playlist = playlist;
            this.position = position;
            this.forcedHeightPx = i;
        }
    }

    /* compiled from: VideoFeedItem.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\rHÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/wakeup/howear/view/home/feedvideo/VideoFeedItem$MusicRecoChip;", "Lcom/wakeup/howear/view/home/feedvideo/VideoFeedItem;", "query", "", a.g, "", "<init>", "(Ljava/lang/String;Z)V", "getQuery", "()Ljava/lang/String;", "getExpanded", "()Z", "itemType", "", "getItemType", "()I", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MusicRecoChip extends VideoFeedItem {
        private final boolean expanded;
        private final String query;

        public static /* synthetic */ MusicRecoChip copy$default(MusicRecoChip musicRecoChip, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = musicRecoChip.query;
            }
            if ((i & 2) != 0) {
                z = musicRecoChip.expanded;
            }
            return musicRecoChip.copy(str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getQuery() {
            return this.query;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getExpanded() {
            return this.expanded;
        }

        public final MusicRecoChip copy(String query, boolean expanded) {
            Intrinsics.checkNotNullParameter(query, "query");
            return new MusicRecoChip(query, expanded);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MusicRecoChip)) {
                return false;
            }
            MusicRecoChip musicRecoChip = (MusicRecoChip) other;
            return Intrinsics.areEqual(this.query, musicRecoChip.query) && this.expanded == musicRecoChip.expanded;
        }

        @Override // com.chad.library.adapter.base.entity.MultiItemEntity
        /* renamed from: getItemType */
        public int getType() {
            return 7;
        }

        public int hashCode() {
            return (this.query.hashCode() * 31) + Boolean.hashCode(this.expanded);
        }

        public String toString() {
            return "MusicRecoChip(query=" + this.query + ", expanded=" + this.expanded + Separators.RPAREN;
        }

        public final String getQuery() {
            return this.query;
        }

        public final boolean getExpanded() {
            return this.expanded;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MusicRecoChip(String query, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(query, "query");
            this.query = query;
            this.expanded = z;
        }
    }

    /* compiled from: VideoFeedItem.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\nHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/wakeup/howear/view/home/feedvideo/VideoFeedItem$MusicRecoPlaylists;", "Lcom/wakeup/howear/view/home/feedvideo/VideoFeedItem;", "playlists", "", "Lcom/wakeup/feature/aimusic/model/AiPlaylist;", "<init>", "(Ljava/util/List;)V", "getPlaylists", "()Ljava/util/List;", "itemType", "", "getItemType", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MusicRecoPlaylists extends VideoFeedItem {
        private final List<AiPlaylist> playlists;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MusicRecoPlaylists copy$default(MusicRecoPlaylists musicRecoPlaylists, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = musicRecoPlaylists.playlists;
            }
            return musicRecoPlaylists.copy(list);
        }

        public final List<AiPlaylist> component1() {
            return this.playlists;
        }

        public final MusicRecoPlaylists copy(List<AiPlaylist> playlists) {
            Intrinsics.checkNotNullParameter(playlists, "playlists");
            return new MusicRecoPlaylists(playlists);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MusicRecoPlaylists) && Intrinsics.areEqual(this.playlists, ((MusicRecoPlaylists) other).playlists);
        }

        @Override // com.chad.library.adapter.base.entity.MultiItemEntity
        /* renamed from: getItemType */
        public int getType() {
            return 8;
        }

        public int hashCode() {
            return this.playlists.hashCode();
        }

        public String toString() {
            return "MusicRecoPlaylists(playlists=" + this.playlists + Separators.RPAREN;
        }

        public final List<AiPlaylist> getPlaylists() {
            return this.playlists;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MusicRecoPlaylists(List<AiPlaylist> playlists) {
            super(null);
            Intrinsics.checkNotNullParameter(playlists, "playlists");
            this.playlists = playlists;
        }
    }
}
