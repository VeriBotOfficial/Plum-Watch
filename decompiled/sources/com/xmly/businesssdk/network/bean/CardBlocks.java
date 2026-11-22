package com.xmly.businesssdk.network.bean;

import com.google.gson.annotations.SerializedName;
import com.tencent.open.SocialConstants;
import com.xmly.businesssdk.config.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardInfo.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003JO\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, d2 = {"Lcom/xmly/businesssdk/network/bean/CardBlocks;", "", "id", "", "title", "", "description", SocialConstants.PARAM_IMG_URL, "jumpType", "jumpValue", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getId", "()J", "getImg", "getJumpType", "getJumpValue", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CardBlocks {

    @SerializedName("description")
    private final String description;

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

    public CardBlocks() {
        this(0L, null, null, null, null, null, 63, null);
    }

    public CardBlocks(long j, String str, String str2, String str3, String str4, String str5) {
        this.id = j;
        this.title = str;
        this.description = str2;
        this.img = str3;
        this.jumpType = str4;
        this.jumpValue = str5;
    }

    public static /* synthetic */ CardBlocks copy$default(CardBlocks cardBlocks, long j, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            j = cardBlocks.id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = cardBlocks.title;
        }
        String str6 = str;
        if ((i & 4) != 0) {
            str2 = cardBlocks.description;
        }
        String str7 = str2;
        if ((i & 8) != 0) {
            str3 = cardBlocks.img;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = cardBlocks.jumpType;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = cardBlocks.jumpValue;
        }
        return cardBlocks.copy(j2, str6, str7, str8, str9, str5);
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
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final String getImg() {
        return this.img;
    }

    /* renamed from: component5, reason: from getter */
    public final String getJumpType() {
        return this.jumpType;
    }

    /* renamed from: component6, reason: from getter */
    public final String getJumpValue() {
        return this.jumpValue;
    }

    public final CardBlocks copy(long id2, String title, String description, String img, String jumpType, String jumpValue) {
        return new CardBlocks(id2, title, description, img, jumpType, jumpValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardBlocks)) {
            return false;
        }
        CardBlocks cardBlocks = (CardBlocks) other;
        return this.id == cardBlocks.id && Intrinsics.areEqual(this.title, cardBlocks.title) && Intrinsics.areEqual(this.description, cardBlocks.description) && Intrinsics.areEqual(this.img, cardBlocks.img) && Intrinsics.areEqual(this.jumpType, cardBlocks.jumpType) && Intrinsics.areEqual(this.jumpValue, cardBlocks.jumpValue);
    }

    public final String getDescription() {
        return this.description;
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
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.img;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.jumpType;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.jumpValue;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return c.a(com.xmly.businesssdk.c.a("CardBlocks(id=").append(this.id).append(", title=").append(this.title).append(", description=").append(this.description).append(", img=").append(this.img).append(", jumpType=").append(this.jumpType).append(", jumpValue="), this.jumpValue, ')');
    }

    public /* synthetic */ CardBlocks(long j, String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }
}
