package com.xmly.businesssdk.network.bean;

import com.google.gson.annotations.SerializedName;
import com.tencent.open.SocialConstants;
import com.xmly.businesssdk.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardInfo.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n¢\u0006\u0002\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\nHÆ\u0003Jg\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\nHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015¨\u0006'"}, d2 = {"Lcom/xmly/businesssdk/network/bean/CardInfo;", "", "id", "", "title", "", SocialConstants.PARAM_IMG_URL, "jumpType", "jumpValue", "cardBlocks", "", "Lcom/xmly/businesssdk/network/bean/CardBlocks;", "albums", "Lcom/xmly/businesssdk/network/bean/AlbumInfo;", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getAlbums", "()Ljava/util/List;", "getCardBlocks", "getId", "()J", "getImg", "()Ljava/lang/String;", "getJumpType", "getJumpValue", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CardInfo {

    @SerializedName("albums")
    private final List<AlbumInfo> albums;

    @SerializedName("card_blocks")
    private final List<CardBlocks> cardBlocks;

    @SerializedName("id")
    private final long id;

    @SerializedName(SocialConstants.PARAM_IMG_URL)
    private final String img;

    @SerializedName("jump_type")
    private final String jumpType;

    @SerializedName("jump_value")
    private final String jumpValue;

    @SerializedName("title")
    private final String title;

    public CardInfo() {
        this(0L, null, null, null, null, null, null, 127, null);
    }

    public CardInfo(long j, String str, String str2, String str3, String str4, List<CardBlocks> list, List<AlbumInfo> list2) {
        this.id = j;
        this.title = str;
        this.img = str2;
        this.jumpType = str3;
        this.jumpValue = str4;
        this.cardBlocks = list;
        this.albums = list2;
    }

    public static /* synthetic */ CardInfo copy$default(CardInfo cardInfo, long j, String str, String str2, String str3, String str4, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = cardInfo.id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = cardInfo.title;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = cardInfo.img;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = cardInfo.jumpType;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = cardInfo.jumpValue;
        }
        return cardInfo.copy(j2, str5, str6, str7, str4, (i & 32) != 0 ? cardInfo.cardBlocks : list, (i & 64) != 0 ? cardInfo.albums : list2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getImg() {
        return this.img;
    }

    /* renamed from: component4, reason: from getter */
    public final String getJumpType() {
        return this.jumpType;
    }

    /* renamed from: component5, reason: from getter */
    public final String getJumpValue() {
        return this.jumpValue;
    }

    public final List<CardBlocks> component6() {
        return this.cardBlocks;
    }

    public final List<AlbumInfo> component7() {
        return this.albums;
    }

    public final CardInfo copy(long id2, String title, String img, String jumpType, String jumpValue, List<CardBlocks> cardBlocks, List<AlbumInfo> albums) {
        return new CardInfo(id2, title, img, jumpType, jumpValue, cardBlocks, albums);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardInfo)) {
            return false;
        }
        CardInfo cardInfo = (CardInfo) other;
        return this.id == cardInfo.id && Intrinsics.areEqual(this.title, cardInfo.title) && Intrinsics.areEqual(this.img, cardInfo.img) && Intrinsics.areEqual(this.jumpType, cardInfo.jumpType) && Intrinsics.areEqual(this.jumpValue, cardInfo.jumpValue) && Intrinsics.areEqual(this.cardBlocks, cardInfo.cardBlocks) && Intrinsics.areEqual(this.albums, cardInfo.albums);
    }

    public final List<AlbumInfo> getAlbums() {
        return this.albums;
    }

    public final List<CardBlocks> getCardBlocks() {
        return this.cardBlocks;
    }

    public final long getId() {
        return this.id;
    }

    public final String getImg() {
        return this.img;
    }

    public final String getJumpType() {
        return this.jumpType;
    }

    public final String getJumpValue() {
        return this.jumpValue;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.img;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.jumpType;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.jumpValue;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<CardBlocks> list = this.cardBlocks;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<AlbumInfo> list2 = this.albums;
        return hashCode6 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return c.a("CardInfo(id=").append(this.id).append(", title=").append(this.title).append(", img=").append(this.img).append(", jumpType=").append(this.jumpType).append(", jumpValue=").append(this.jumpValue).append(", cardBlocks=").append(this.cardBlocks).append(", albums=").append(this.albums).append(')').toString();
    }

    public /* synthetic */ CardInfo(long j, String str, String str2, String str3, String str4, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : list2);
    }
}
