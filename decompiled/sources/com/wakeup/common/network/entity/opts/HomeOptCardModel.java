package com.wakeup.common.network.entity.opts;

import android.gov.nist.core.Separators;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeOptCardModel.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/wakeup/common/network/entity/opts/HomeOptCardModel;", "", "id", "", "name", "", "type", "firmwareId", SocialConstants.PARAM_IMG_URL, "jumpVo", "Lcom/wakeup/common/network/entity/opts/OptsJumpModel;", "<init>", "(ILjava/lang/String;IILjava/lang/String;Lcom/wakeup/common/network/entity/opts/OptsJumpModel;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getType", "getFirmwareId", "getImg", "getJumpVo", "()Lcom/wakeup/common/network/entity/opts/OptsJumpModel;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class HomeOptCardModel {
    private final int firmwareId;
    private final int id;
    private final String img;
    private final OptsJumpModel jumpVo;
    private final String name;
    private final int type;

    public static /* synthetic */ HomeOptCardModel copy$default(HomeOptCardModel homeOptCardModel, int i, String str, int i2, int i3, String str2, OptsJumpModel optsJumpModel, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = homeOptCardModel.id;
        }
        if ((i4 & 2) != 0) {
            str = homeOptCardModel.name;
        }
        if ((i4 & 4) != 0) {
            i2 = homeOptCardModel.type;
        }
        if ((i4 & 8) != 0) {
            i3 = homeOptCardModel.firmwareId;
        }
        if ((i4 & 16) != 0) {
            str2 = homeOptCardModel.img;
        }
        if ((i4 & 32) != 0) {
            optsJumpModel = homeOptCardModel.jumpVo;
        }
        String str3 = str2;
        OptsJumpModel optsJumpModel2 = optsJumpModel;
        return homeOptCardModel.copy(i, str, i2, i3, str3, optsJumpModel2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component4, reason: from getter */
    public final int getFirmwareId() {
        return this.firmwareId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getImg() {
        return this.img;
    }

    /* renamed from: component6, reason: from getter */
    public final OptsJumpModel getJumpVo() {
        return this.jumpVo;
    }

    public final HomeOptCardModel copy(int id2, String name, int type, int firmwareId, String img, OptsJumpModel jumpVo) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(img, "img");
        Intrinsics.checkNotNullParameter(jumpVo, "jumpVo");
        return new HomeOptCardModel(id2, name, type, firmwareId, img, jumpVo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeOptCardModel)) {
            return false;
        }
        HomeOptCardModel homeOptCardModel = (HomeOptCardModel) other;
        return this.id == homeOptCardModel.id && Intrinsics.areEqual(this.name, homeOptCardModel.name) && this.type == homeOptCardModel.type && this.firmwareId == homeOptCardModel.firmwareId && Intrinsics.areEqual(this.img, homeOptCardModel.img) && Intrinsics.areEqual(this.jumpVo, homeOptCardModel.jumpVo);
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.type)) * 31) + Integer.hashCode(this.firmwareId)) * 31) + this.img.hashCode()) * 31) + this.jumpVo.hashCode();
    }

    public String toString() {
        return "HomeOptCardModel(id=" + this.id + ", name=" + this.name + ", type=" + this.type + ", firmwareId=" + this.firmwareId + ", img=" + this.img + ", jumpVo=" + this.jumpVo + Separators.RPAREN;
    }

    public HomeOptCardModel(int i, String name, int i2, int i3, String img, OptsJumpModel jumpVo) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(img, "img");
        Intrinsics.checkNotNullParameter(jumpVo, "jumpVo");
        this.id = i;
        this.name = name;
        this.type = i2;
        this.firmwareId = i3;
        this.img = img;
        this.jumpVo = jumpVo;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final int getType() {
        return this.type;
    }

    public final int getFirmwareId() {
        return this.firmwareId;
    }

    public final String getImg() {
        return this.img;
    }

    public final OptsJumpModel getJumpVo() {
        return this.jumpVo;
    }
}
