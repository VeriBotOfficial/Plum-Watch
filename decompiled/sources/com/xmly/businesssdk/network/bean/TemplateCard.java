package com.xmly.businesssdk.network.bean;

import com.google.gson.annotations.SerializedName;
import com.tencent.open.SocialConstants;
import com.wakeup.common.Constants;
import com.xmly.businesssdk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Template.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u001b\u001a\u00020\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003Js\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\u0006\u0010*\u001a\u00020'J\u0006\u0010+\u001a\u00020,J\u0006\u0010-\u001a\u00020,J\b\u0010.\u001a\u00020\u0005H\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010¨\u0006/"}, d2 = {"Lcom/xmly/businesssdk/network/bean/TemplateCard;", "", "id", "", "title", "", "subtitle", "okImg", SocialConstants.PARAM_IMG_URL, "jumpType", "jumpValue", "description", "metadata", "Lcom/xmly/businesssdk/network/bean/AlbumMetaData;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/xmly/businesssdk/network/bean/AlbumMetaData;)V", "getDescription", "()Ljava/lang/String;", "getId", "()I", "getImg", "getJumpType", "getJumpValue", "getMetadata", "()Lcom/xmly/businesssdk/network/bean/AlbumMetaData;", "getOkImg", "getSubtitle", "getTitle", "albumType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "isAlbum", "playCount", "", Constants.SHARE_URL_PARAMS_JUMP_SOURCE_ID, "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TemplateCard {
    private final String description;
    private final int id;
    private final String img;

    @SerializedName("jump_type")
    private final String jumpType;

    @SerializedName("jump_value")
    private final String jumpValue;
    private final AlbumMetaData metadata;

    @SerializedName("ok_img")
    private final String okImg;
    private final String subtitle;
    private final String title;

    public TemplateCard(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, AlbumMetaData albumMetaData) {
        this.id = i;
        this.title = str;
        this.subtitle = str2;
        this.okImg = str3;
        this.img = str4;
        this.jumpType = str5;
        this.jumpValue = str6;
        this.description = str7;
        this.metadata = albumMetaData;
    }

    public static /* synthetic */ TemplateCard copy$default(TemplateCard templateCard, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, AlbumMetaData albumMetaData, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = templateCard.id;
        }
        if ((i2 & 2) != 0) {
            str = templateCard.title;
        }
        if ((i2 & 4) != 0) {
            str2 = templateCard.subtitle;
        }
        if ((i2 & 8) != 0) {
            str3 = templateCard.okImg;
        }
        if ((i2 & 16) != 0) {
            str4 = templateCard.img;
        }
        if ((i2 & 32) != 0) {
            str5 = templateCard.jumpType;
        }
        if ((i2 & 64) != 0) {
            str6 = templateCard.jumpValue;
        }
        if ((i2 & 128) != 0) {
            str7 = templateCard.description;
        }
        if ((i2 & 256) != 0) {
            albumMetaData = templateCard.metadata;
        }
        String str8 = str7;
        AlbumMetaData albumMetaData2 = albumMetaData;
        String str9 = str5;
        String str10 = str6;
        String str11 = str4;
        String str12 = str2;
        return templateCard.copy(i, str, str12, str3, str11, str9, str10, str8, albumMetaData2);
    }

    public final int albumType() {
        AlbumMetaData albumMetaData = this.metadata;
        if (albumMetaData != null) {
            return albumMetaData.albumType();
        }
        return 0;
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final String getOkImg() {
        return this.okImg;
    }

    /* renamed from: component5, reason: from getter */
    public final String getImg() {
        return this.img;
    }

    /* renamed from: component6, reason: from getter */
    public final String getJumpType() {
        return this.jumpType;
    }

    /* renamed from: component7, reason: from getter */
    public final String getJumpValue() {
        return this.jumpValue;
    }

    /* renamed from: component8, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component9, reason: from getter */
    public final AlbumMetaData getMetadata() {
        return this.metadata;
    }

    public final TemplateCard copy(int id2, String title, String subtitle, String okImg, String img, String jumpType, String jumpValue, String description, AlbumMetaData metadata) {
        return new TemplateCard(id2, title, subtitle, okImg, img, jumpType, jumpValue, description, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TemplateCard)) {
            return false;
        }
        TemplateCard templateCard = (TemplateCard) other;
        return this.id == templateCard.id && Intrinsics.areEqual(this.title, templateCard.title) && Intrinsics.areEqual(this.subtitle, templateCard.subtitle) && Intrinsics.areEqual(this.okImg, templateCard.okImg) && Intrinsics.areEqual(this.img, templateCard.img) && Intrinsics.areEqual(this.jumpType, templateCard.jumpType) && Intrinsics.areEqual(this.jumpValue, templateCard.jumpValue) && Intrinsics.areEqual(this.description, templateCard.description) && Intrinsics.areEqual(this.metadata, templateCard.metadata);
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getId() {
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

    public final AlbumMetaData getMetadata() {
        return this.metadata;
    }

    public final String getOkImg() {
        return this.okImg;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.okImg;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.img;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.jumpType;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.jumpValue;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.description;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        AlbumMetaData albumMetaData = this.metadata;
        return hashCode8 + (albumMetaData != null ? albumMetaData.hashCode() : 0);
    }

    public final boolean isAlbum() {
        return Intrinsics.areEqual(this.jumpType, "album");
    }

    public final long playCount() {
        AlbumMetaData albumMetaData = this.metadata;
        if (albumMetaData != null) {
            return albumMetaData.getPlayCount();
        }
        return 0L;
    }

    public final long sourceId() {
        AlbumMetaData albumMetaData = this.metadata;
        if (albumMetaData != null) {
            return albumMetaData.getSourceId();
        }
        return 0L;
    }

    public String toString() {
        return c.a("TemplateCard(id=").append(this.id).append(", title=").append(this.title).append(", img=").append(this.img).append(", jumpType=").append(this.jumpType).append(", jumpValue=").append(this.jumpValue).append(", description=").append(this.description).append(", metadata=").append(this.metadata).append(')').toString();
    }
}
