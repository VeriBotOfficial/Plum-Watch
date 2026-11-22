package com.wakeup.common.network.entity.other;

import android.gov.nist.core.Separators;
import com.tencent.open.SocialConstants;
import com.wakeup.common.network.entity.opts.OptsJumpModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeMenuEntity.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003JU\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0006HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lcom/wakeup/common/network/entity/other/HomeMenuEntity;", "", "menuName", "", SocialConstants.PARAM_IMG_URL, "defaultImg", "", "cornerMark", "type", "firmwareId", "jumpVo", "Lcom/wakeup/common/network/entity/opts/OptsJumpModel;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IILcom/wakeup/common/network/entity/opts/OptsJumpModel;)V", "getMenuName", "()Ljava/lang/String;", "getImg", "getDefaultImg", "()I", "getCornerMark", "getType", "getFirmwareId", "getJumpVo", "()Lcom/wakeup/common/network/entity/opts/OptsJumpModel;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class HomeMenuEntity {
    private final String cornerMark;
    private final int defaultImg;
    private final int firmwareId;
    private final String img;
    private final OptsJumpModel jumpVo;
    private final String menuName;
    private final int type;

    public static /* synthetic */ HomeMenuEntity copy$default(HomeMenuEntity homeMenuEntity, String str, String str2, int i, String str3, int i2, int i3, OptsJumpModel optsJumpModel, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = homeMenuEntity.menuName;
        }
        if ((i4 & 2) != 0) {
            str2 = homeMenuEntity.img;
        }
        if ((i4 & 4) != 0) {
            i = homeMenuEntity.defaultImg;
        }
        if ((i4 & 8) != 0) {
            str3 = homeMenuEntity.cornerMark;
        }
        if ((i4 & 16) != 0) {
            i2 = homeMenuEntity.type;
        }
        if ((i4 & 32) != 0) {
            i3 = homeMenuEntity.firmwareId;
        }
        if ((i4 & 64) != 0) {
            optsJumpModel = homeMenuEntity.jumpVo;
        }
        int i5 = i3;
        OptsJumpModel optsJumpModel2 = optsJumpModel;
        int i6 = i2;
        int i7 = i;
        return homeMenuEntity.copy(str, str2, i7, str3, i6, i5, optsJumpModel2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMenuName() {
        return this.menuName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getImg() {
        return this.img;
    }

    /* renamed from: component3, reason: from getter */
    public final int getDefaultImg() {
        return this.defaultImg;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCornerMark() {
        return this.cornerMark;
    }

    /* renamed from: component5, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component6, reason: from getter */
    public final int getFirmwareId() {
        return this.firmwareId;
    }

    /* renamed from: component7, reason: from getter */
    public final OptsJumpModel getJumpVo() {
        return this.jumpVo;
    }

    public final HomeMenuEntity copy(String menuName, String img, int defaultImg, String cornerMark, int type, int firmwareId, OptsJumpModel jumpVo) {
        Intrinsics.checkNotNullParameter(jumpVo, "jumpVo");
        return new HomeMenuEntity(menuName, img, defaultImg, cornerMark, type, firmwareId, jumpVo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeMenuEntity)) {
            return false;
        }
        HomeMenuEntity homeMenuEntity = (HomeMenuEntity) other;
        return Intrinsics.areEqual(this.menuName, homeMenuEntity.menuName) && Intrinsics.areEqual(this.img, homeMenuEntity.img) && this.defaultImg == homeMenuEntity.defaultImg && Intrinsics.areEqual(this.cornerMark, homeMenuEntity.cornerMark) && this.type == homeMenuEntity.type && this.firmwareId == homeMenuEntity.firmwareId && Intrinsics.areEqual(this.jumpVo, homeMenuEntity.jumpVo);
    }

    public int hashCode() {
        String str = this.menuName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.img;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.defaultImg)) * 31;
        String str3 = this.cornerMark;
        return ((((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.type)) * 31) + Integer.hashCode(this.firmwareId)) * 31) + this.jumpVo.hashCode();
    }

    public String toString() {
        return "HomeMenuEntity(menuName=" + this.menuName + ", img=" + this.img + ", defaultImg=" + this.defaultImg + ", cornerMark=" + this.cornerMark + ", type=" + this.type + ", firmwareId=" + this.firmwareId + ", jumpVo=" + this.jumpVo + Separators.RPAREN;
    }

    public HomeMenuEntity(String str, String str2, int i, String str3, int i2, int i3, OptsJumpModel jumpVo) {
        Intrinsics.checkNotNullParameter(jumpVo, "jumpVo");
        this.menuName = str;
        this.img = str2;
        this.defaultImg = i;
        this.cornerMark = str3;
        this.type = i2;
        this.firmwareId = i3;
        this.jumpVo = jumpVo;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ HomeMenuEntity(java.lang.String r9, java.lang.String r10, int r11, java.lang.String r12, int r13, int r14, com.wakeup.common.network.entity.opts.OptsJumpModel r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r8 = this;
            r0 = r16 & 8
            if (r0 == 0) goto L5
            r12 = 0
        L5:
            r4 = r12
            r12 = r16 & 16
            r0 = 0
            if (r12 == 0) goto Ld
            r5 = r0
            goto Le
        Ld:
            r5 = r13
        Le:
            r12 = r16 & 32
            if (r12 == 0) goto L19
            r6 = r0
            r1 = r9
            r2 = r10
            r3 = r11
            r7 = r15
            r0 = r8
            goto L1f
        L19:
            r6 = r14
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r7 = r15
        L1f:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.common.network.entity.other.HomeMenuEntity.<init>(java.lang.String, java.lang.String, int, java.lang.String, int, int, com.wakeup.common.network.entity.opts.OptsJumpModel, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getMenuName() {
        return this.menuName;
    }

    public final String getImg() {
        return this.img;
    }

    public final int getDefaultImg() {
        return this.defaultImg;
    }

    public final String getCornerMark() {
        return this.cornerMark;
    }

    public final int getType() {
        return this.type;
    }

    public final int getFirmwareId() {
        return this.firmwareId;
    }

    public final OptsJumpModel getJumpVo() {
        return this.jumpVo;
    }
}
