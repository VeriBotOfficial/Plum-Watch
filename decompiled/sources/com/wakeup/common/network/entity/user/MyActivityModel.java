package com.wakeup.common.network.entity.user;

import android.gov.nist.core.Separators;
import com.tencent.open.SocialConstants;
import com.wakeup.common.network.entity.opts.OptsJumpModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MyActivityModel.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003JA\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006'"}, d2 = {"Lcom/wakeup/common/network/entity/user/MyActivityModel;", "", "id", "", SocialConstants.PARAM_IMG_URL, "", "mainTitle", "subTitle", "jumpVo", "Lcom/wakeup/common/network/entity/opts/OptsJumpModel;", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/wakeup/common/network/entity/opts/OptsJumpModel;)V", "getId", "()I", "setId", "(I)V", "getImg", "()Ljava/lang/String;", "setImg", "(Ljava/lang/String;)V", "getMainTitle", "setMainTitle", "getSubTitle", "setSubTitle", "getJumpVo", "()Lcom/wakeup/common/network/entity/opts/OptsJumpModel;", "setJumpVo", "(Lcom/wakeup/common/network/entity/opts/OptsJumpModel;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MyActivityModel {
    private int id;
    private String img;
    private OptsJumpModel jumpVo;
    private String mainTitle;
    private String subTitle;

    public static /* synthetic */ MyActivityModel copy$default(MyActivityModel myActivityModel, int i, String str, String str2, String str3, OptsJumpModel optsJumpModel, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = myActivityModel.id;
        }
        if ((i2 & 2) != 0) {
            str = myActivityModel.img;
        }
        if ((i2 & 4) != 0) {
            str2 = myActivityModel.mainTitle;
        }
        if ((i2 & 8) != 0) {
            str3 = myActivityModel.subTitle;
        }
        if ((i2 & 16) != 0) {
            optsJumpModel = myActivityModel.jumpVo;
        }
        OptsJumpModel optsJumpModel2 = optsJumpModel;
        String str4 = str2;
        return myActivityModel.copy(i, str, str4, str3, optsJumpModel2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getImg() {
        return this.img;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMainTitle() {
        return this.mainTitle;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* renamed from: component5, reason: from getter */
    public final OptsJumpModel getJumpVo() {
        return this.jumpVo;
    }

    public final MyActivityModel copy(int id2, String img, String mainTitle, String subTitle, OptsJumpModel jumpVo) {
        Intrinsics.checkNotNullParameter(jumpVo, "jumpVo");
        return new MyActivityModel(id2, img, mainTitle, subTitle, jumpVo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MyActivityModel)) {
            return false;
        }
        MyActivityModel myActivityModel = (MyActivityModel) other;
        return this.id == myActivityModel.id && Intrinsics.areEqual(this.img, myActivityModel.img) && Intrinsics.areEqual(this.mainTitle, myActivityModel.mainTitle) && Intrinsics.areEqual(this.subTitle, myActivityModel.subTitle) && Intrinsics.areEqual(this.jumpVo, myActivityModel.jumpVo);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        String str = this.img;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mainTitle;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subTitle;
        return ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.jumpVo.hashCode();
    }

    public String toString() {
        return "MyActivityModel(id=" + this.id + ", img=" + this.img + ", mainTitle=" + this.mainTitle + ", subTitle=" + this.subTitle + ", jumpVo=" + this.jumpVo + Separators.RPAREN;
    }

    public MyActivityModel(int i, String str, String str2, String str3, OptsJumpModel jumpVo) {
        Intrinsics.checkNotNullParameter(jumpVo, "jumpVo");
        this.id = i;
        this.img = str;
        this.mainTitle = str2;
        this.subTitle = str3;
        this.jumpVo = jumpVo;
    }

    public final int getId() {
        return this.id;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final String getImg() {
        return this.img;
    }

    public final void setImg(String str) {
        this.img = str;
    }

    public final String getMainTitle() {
        return this.mainTitle;
    }

    public final void setMainTitle(String str) {
        this.mainTitle = str;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final void setSubTitle(String str) {
        this.subTitle = str;
    }

    public final OptsJumpModel getJumpVo() {
        return this.jumpVo;
    }

    public final void setJumpVo(OptsJumpModel optsJumpModel) {
        Intrinsics.checkNotNullParameter(optsJumpModel, "<set-?>");
        this.jumpVo = optsJumpModel;
    }
}
