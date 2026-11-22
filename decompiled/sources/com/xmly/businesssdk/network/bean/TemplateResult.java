package com.xmly.businesssdk.network.bean;

import com.google.gson.annotations.SerializedName;
import com.tencent.open.SocialConstants;
import com.xmly.businesssdk.c;
import com.yandex.div.storage.database.StorageSchema;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Template.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JU\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\b\u0010!\u001a\u00020\u0005H\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006\""}, d2 = {"Lcom/xmly/businesssdk/network/bean/TemplateResult;", "", "id", "", "title", "", SocialConstants.PARAM_IMG_URL, "bgImg", "tag", StorageSchema.TABLE_CARDS, "", "Lcom/xmly/businesssdk/network/bean/Template;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getBgImg", "()Ljava/lang/String;", "getCards", "()Ljava/util/List;", "getId", "()I", "getImg", "getTag", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TemplateResult {

    @SerializedName("bg_img")
    private final String bgImg;
    private final List<Template> cards;
    private final int id;
    private final String img;
    private final String tag;
    private final String title;

    public TemplateResult(int i, String str, String str2, String str3, String str4, List<Template> list) {
        this.id = i;
        this.title = str;
        this.img = str2;
        this.bgImg = str3;
        this.tag = str4;
        this.cards = list;
    }

    public static /* synthetic */ TemplateResult copy$default(TemplateResult templateResult, int i, String str, String str2, String str3, String str4, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = templateResult.id;
        }
        if ((i2 & 2) != 0) {
            str = templateResult.title;
        }
        if ((i2 & 4) != 0) {
            str2 = templateResult.img;
        }
        if ((i2 & 8) != 0) {
            str3 = templateResult.bgImg;
        }
        if ((i2 & 16) != 0) {
            str4 = templateResult.tag;
        }
        if ((i2 & 32) != 0) {
            list = templateResult.cards;
        }
        String str5 = str4;
        List list2 = list;
        return templateResult.copy(i, str, str2, str3, str5, list2);
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
    public final String getImg() {
        return this.img;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBgImg() {
        return this.bgImg;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    public final List<Template> component6() {
        return this.cards;
    }

    public final TemplateResult copy(int id2, String title, String img, String bgImg, String tag, List<Template> cards) {
        return new TemplateResult(id2, title, img, bgImg, tag, cards);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TemplateResult)) {
            return false;
        }
        TemplateResult templateResult = (TemplateResult) other;
        return this.id == templateResult.id && Intrinsics.areEqual(this.title, templateResult.title) && Intrinsics.areEqual(this.img, templateResult.img) && Intrinsics.areEqual(this.bgImg, templateResult.bgImg) && Intrinsics.areEqual(this.tag, templateResult.tag) && Intrinsics.areEqual(this.cards, templateResult.cards);
    }

    public final String getBgImg() {
        return this.bgImg;
    }

    public final List<Template> getCards() {
        return this.cards;
    }

    public final int getId() {
        return this.id;
    }

    public final String getImg() {
        return this.img;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.img;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bgImg;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tag;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<Template> list = this.cards;
        return hashCode5 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return c.a("TemplateResult(id=").append(this.id).append(", title=").append(this.title).append(", img=").append(this.img).append(", bgImg=").append(this.bgImg).append(", tag=").append(this.tag).append(", cards=").append(this.cards).append(')').toString();
    }
}
