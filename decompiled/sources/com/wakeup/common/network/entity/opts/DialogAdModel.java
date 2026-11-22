package com.wakeup.common.network.entity.opts;

import android.gov.nist.core.Separators;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DialogAdModel.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001cJd\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\bHÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0015\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001c¨\u0006-"}, d2 = {"Lcom/wakeup/common/network/entity/opts/DialogAdModel;", "", "id", "", "title", "introduce", SocialConstants.PARAM_IMG_URL, "popFrequency", "", "popCount", "jumpVo", "Lcom/wakeup/common/network/entity/opts/OptsJumpModel;", "productId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILcom/wakeup/common/network/entity/opts/OptsJumpModel;Ljava/lang/Integer;)V", "getId", "()Ljava/lang/String;", "getTitle", "getIntroduce", "getImg", "getPopFrequency", "()I", "getPopCount", "setPopCount", "(I)V", "getJumpVo", "()Lcom/wakeup/common/network/entity/opts/OptsJumpModel;", "getProductId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILcom/wakeup/common/network/entity/opts/OptsJumpModel;Ljava/lang/Integer;)Lcom/wakeup/common/network/entity/opts/DialogAdModel;", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DialogAdModel {
    private final String id;
    private final String img;
    private final String introduce;
    private final OptsJumpModel jumpVo;
    private int popCount;
    private final int popFrequency;
    private final Integer productId;
    private final String title;

    public static /* synthetic */ DialogAdModel copy$default(DialogAdModel dialogAdModel, String str, String str2, String str3, String str4, int i, int i2, OptsJumpModel optsJumpModel, Integer num, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = dialogAdModel.id;
        }
        if ((i3 & 2) != 0) {
            str2 = dialogAdModel.title;
        }
        if ((i3 & 4) != 0) {
            str3 = dialogAdModel.introduce;
        }
        if ((i3 & 8) != 0) {
            str4 = dialogAdModel.img;
        }
        if ((i3 & 16) != 0) {
            i = dialogAdModel.popFrequency;
        }
        if ((i3 & 32) != 0) {
            i2 = dialogAdModel.popCount;
        }
        if ((i3 & 64) != 0) {
            optsJumpModel = dialogAdModel.jumpVo;
        }
        if ((i3 & 128) != 0) {
            num = dialogAdModel.productId;
        }
        OptsJumpModel optsJumpModel2 = optsJumpModel;
        Integer num2 = num;
        int i4 = i;
        int i5 = i2;
        return dialogAdModel.copy(str, str2, str3, str4, i4, i5, optsJumpModel2, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIntroduce() {
        return this.introduce;
    }

    /* renamed from: component4, reason: from getter */
    public final String getImg() {
        return this.img;
    }

    /* renamed from: component5, reason: from getter */
    public final int getPopFrequency() {
        return this.popFrequency;
    }

    /* renamed from: component6, reason: from getter */
    public final int getPopCount() {
        return this.popCount;
    }

    /* renamed from: component7, reason: from getter */
    public final OptsJumpModel getJumpVo() {
        return this.jumpVo;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getProductId() {
        return this.productId;
    }

    public final DialogAdModel copy(String id2, String title, String introduce, String img, int popFrequency, int popCount, OptsJumpModel jumpVo, Integer productId) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(img, "img");
        Intrinsics.checkNotNullParameter(jumpVo, "jumpVo");
        return new DialogAdModel(id2, title, introduce, img, popFrequency, popCount, jumpVo, productId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialogAdModel)) {
            return false;
        }
        DialogAdModel dialogAdModel = (DialogAdModel) other;
        return Intrinsics.areEqual(this.id, dialogAdModel.id) && Intrinsics.areEqual(this.title, dialogAdModel.title) && Intrinsics.areEqual(this.introduce, dialogAdModel.introduce) && Intrinsics.areEqual(this.img, dialogAdModel.img) && this.popFrequency == dialogAdModel.popFrequency && this.popCount == dialogAdModel.popCount && Intrinsics.areEqual(this.jumpVo, dialogAdModel.jumpVo) && Intrinsics.areEqual(this.productId, dialogAdModel.productId);
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.introduce;
        int hashCode3 = (((((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.img.hashCode()) * 31) + Integer.hashCode(this.popFrequency)) * 31) + Integer.hashCode(this.popCount)) * 31) + this.jumpVo.hashCode()) * 31;
        Integer num = this.productId;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "DialogAdModel(id=" + this.id + ", title=" + this.title + ", introduce=" + this.introduce + ", img=" + this.img + ", popFrequency=" + this.popFrequency + ", popCount=" + this.popCount + ", jumpVo=" + this.jumpVo + ", productId=" + this.productId + Separators.RPAREN;
    }

    public DialogAdModel(String id2, String str, String str2, String img, int i, int i2, OptsJumpModel jumpVo, Integer num) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(img, "img");
        Intrinsics.checkNotNullParameter(jumpVo, "jumpVo");
        this.id = id2;
        this.title = str;
        this.introduce = str2;
        this.img = img;
        this.popFrequency = i;
        this.popCount = i2;
        this.jumpVo = jumpVo;
        this.productId = num;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ DialogAdModel(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6, int r7, com.wakeup.common.network.entity.opts.OptsJumpModel r8, java.lang.Integer r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r1 = this;
            r11 = r10 & 2
            java.lang.String r0 = ""
            if (r11 == 0) goto L7
            r3 = r0
        L7:
            r10 = r10 & 4
            if (r10 == 0) goto L12
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r0
            goto L18
        L12:
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
        L18:
            r4 = r3
            r3 = r2
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.common.network.entity.opts.DialogAdModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, com.wakeup.common.network.entity.opts.OptsJumpModel, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getIntroduce() {
        return this.introduce;
    }

    public final String getImg() {
        return this.img;
    }

    public final int getPopFrequency() {
        return this.popFrequency;
    }

    public final int getPopCount() {
        return this.popCount;
    }

    public final void setPopCount(int i) {
        this.popCount = i;
    }

    public final OptsJumpModel getJumpVo() {
        return this.jumpVo;
    }

    public final Integer getProductId() {
        return this.productId;
    }
}
