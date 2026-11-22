package com.xmly.businesssdk.network.bean;

import com.google.gson.annotations.SerializedName;
import com.tencent.open.SocialConstants;
import com.xmly.businesssdk.c;
import com.yandex.div.storage.database.StorageSchema;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Template.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Jy\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\b\u0010*\u001a\u00020\u0005H\u0016R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013¨\u0006+"}, d2 = {"Lcom/xmly/businesssdk/network/bean/Template;", "", "id", "", "title", "", "style", SocialConstants.PARAM_IMG_URL, "okImg", "jumpType", "jumpValue", "description", StorageSchema.TABLE_CARDS, "", "Lcom/xmly/businesssdk/network/bean/TemplateCard;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCards", "()Ljava/util/List;", "getDescription", "()Ljava/lang/String;", "getId", "()I", "getImg", "getJumpType", "getJumpValue", "getOkImg", "getStyle", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Template {

    @SerializedName("card_blocks")
    private final List<TemplateCard> cards;
    private final String description;
    private final int id;
    private final String img;

    @SerializedName("jump_type")
    private final String jumpType;

    @SerializedName("jump_value")
    private final String jumpValue;

    @SerializedName("ok_img")
    private final String okImg;
    private final String style;
    private final String title;

    public Template(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, List<TemplateCard> list) {
        this.id = i;
        this.title = str;
        this.style = str2;
        this.img = str3;
        this.okImg = str4;
        this.jumpType = str5;
        this.jumpValue = str6;
        this.description = str7;
        this.cards = list;
    }

    public static /* synthetic */ Template copy$default(Template template, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = template.id;
        }
        if ((i2 & 2) != 0) {
            str = template.title;
        }
        if ((i2 & 4) != 0) {
            str2 = template.style;
        }
        if ((i2 & 8) != 0) {
            str3 = template.img;
        }
        if ((i2 & 16) != 0) {
            str4 = template.okImg;
        }
        if ((i2 & 32) != 0) {
            str5 = template.jumpType;
        }
        if ((i2 & 64) != 0) {
            str6 = template.jumpValue;
        }
        if ((i2 & 128) != 0) {
            str7 = template.description;
        }
        if ((i2 & 256) != 0) {
            list = template.cards;
        }
        String str8 = str7;
        List list2 = list;
        String str9 = str5;
        String str10 = str6;
        String str11 = str4;
        String str12 = str2;
        return template.copy(i, str, str12, str3, str11, str9, str10, str8, list2);
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
    public final String getStyle() {
        return this.style;
    }

    /* renamed from: component4, reason: from getter */
    public final String getImg() {
        return this.img;
    }

    /* renamed from: component5, reason: from getter */
    public final String getOkImg() {
        return this.okImg;
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

    public final List<TemplateCard> component9() {
        return this.cards;
    }

    public final Template copy(int id2, String title, String style, String img, String okImg, String jumpType, String jumpValue, String description, List<TemplateCard> cards) {
        return new Template(id2, title, style, img, okImg, jumpType, jumpValue, description, cards);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Template)) {
            return false;
        }
        Template template = (Template) other;
        return this.id == template.id && Intrinsics.areEqual(this.title, template.title) && Intrinsics.areEqual(this.style, template.style) && Intrinsics.areEqual(this.img, template.img) && Intrinsics.areEqual(this.okImg, template.okImg) && Intrinsics.areEqual(this.jumpType, template.jumpType) && Intrinsics.areEqual(this.jumpValue, template.jumpValue) && Intrinsics.areEqual(this.description, template.description) && Intrinsics.areEqual(this.cards, template.cards);
    }

    public final List<TemplateCard> getCards() {
        return this.cards;
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

    public final String getOkImg() {
        return this.okImg;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.style;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.img;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.okImg;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.jumpType;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.jumpValue;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.description;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<TemplateCard> list = this.cards;
        return hashCode8 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return c.a("Template(id=").append(this.id).append(", title=").append(this.title).append(", style=").append(this.style).append(", img=").append(this.img).append(", okImg=").append(this.okImg).append(", jumpType=").append(this.jumpType).append(", jumpValue=").append(this.jumpValue).append(", description=").append(this.description).append(", cards=").append(this.cards).append(')').toString();
    }
}
