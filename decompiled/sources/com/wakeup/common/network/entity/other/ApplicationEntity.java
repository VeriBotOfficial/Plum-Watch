package com.wakeup.common.network.entity.other;

import android.gov.nist.core.Separators;
import com.tencent.open.SocialConstants;
import com.wakeup.common.network.entity.opts.OptsJumpModel;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApplicationEntity.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001By\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0091\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u00020\bHÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00066"}, d2 = {"Lcom/wakeup/common/network/entity/other/ApplicationEntity;", "Ljava/io/Serializable;", "functionName", "", "functionNameCn", SocialConstants.PARAM_IMG_URL, "", "defaultImg", "", "functionType", "orderNum", "deviceType", "groupName", "groupId", "isUserComponent", "fixedStatus", "jumpVo", "Lcom/wakeup/common/network/entity/opts/OptsJumpModel;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;IIIILjava/lang/String;IIILcom/wakeup/common/network/entity/opts/OptsJumpModel;)V", "getFunctionName", "()Ljava/lang/String;", "getFunctionNameCn", "getImg", "()Ljava/util/List;", "getDefaultImg", "()I", "getFunctionType", "getOrderNum", "getDeviceType", "getGroupName", "getGroupId", "getFixedStatus", "getJumpVo", "()Lcom/wakeup/common/network/entity/opts/OptsJumpModel;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ApplicationEntity implements Serializable {
    private final int defaultImg;
    private final int deviceType;
    private final int fixedStatus;
    private final String functionName;
    private final String functionNameCn;
    private final int functionType;
    private final int groupId;
    private final String groupName;
    private final List<String> img;
    private final int isUserComponent;
    private final OptsJumpModel jumpVo;
    private final int orderNum;

    public static /* synthetic */ ApplicationEntity copy$default(ApplicationEntity applicationEntity, String str, String str2, List list, int i, int i2, int i3, int i4, String str3, int i5, int i6, int i7, OptsJumpModel optsJumpModel, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = applicationEntity.functionName;
        }
        if ((i8 & 2) != 0) {
            str2 = applicationEntity.functionNameCn;
        }
        if ((i8 & 4) != 0) {
            list = applicationEntity.img;
        }
        if ((i8 & 8) != 0) {
            i = applicationEntity.defaultImg;
        }
        if ((i8 & 16) != 0) {
            i2 = applicationEntity.functionType;
        }
        if ((i8 & 32) != 0) {
            i3 = applicationEntity.orderNum;
        }
        if ((i8 & 64) != 0) {
            i4 = applicationEntity.deviceType;
        }
        if ((i8 & 128) != 0) {
            str3 = applicationEntity.groupName;
        }
        if ((i8 & 256) != 0) {
            i5 = applicationEntity.groupId;
        }
        if ((i8 & 512) != 0) {
            i6 = applicationEntity.isUserComponent;
        }
        if ((i8 & 1024) != 0) {
            i7 = applicationEntity.fixedStatus;
        }
        if ((i8 & 2048) != 0) {
            optsJumpModel = applicationEntity.jumpVo;
        }
        int i9 = i7;
        OptsJumpModel optsJumpModel2 = optsJumpModel;
        int i10 = i5;
        int i11 = i6;
        int i12 = i4;
        String str4 = str3;
        int i13 = i2;
        int i14 = i3;
        return applicationEntity.copy(str, str2, list, i, i13, i14, i12, str4, i10, i11, i9, optsJumpModel2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFunctionName() {
        return this.functionName;
    }

    /* renamed from: component10, reason: from getter */
    public final int getIsUserComponent() {
        return this.isUserComponent;
    }

    /* renamed from: component11, reason: from getter */
    public final int getFixedStatus() {
        return this.fixedStatus;
    }

    /* renamed from: component12, reason: from getter */
    public final OptsJumpModel getJumpVo() {
        return this.jumpVo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFunctionNameCn() {
        return this.functionNameCn;
    }

    public final List<String> component3() {
        return this.img;
    }

    /* renamed from: component4, reason: from getter */
    public final int getDefaultImg() {
        return this.defaultImg;
    }

    /* renamed from: component5, reason: from getter */
    public final int getFunctionType() {
        return this.functionType;
    }

    /* renamed from: component6, reason: from getter */
    public final int getOrderNum() {
        return this.orderNum;
    }

    /* renamed from: component7, reason: from getter */
    public final int getDeviceType() {
        return this.deviceType;
    }

    /* renamed from: component8, reason: from getter */
    public final String getGroupName() {
        return this.groupName;
    }

    /* renamed from: component9, reason: from getter */
    public final int getGroupId() {
        return this.groupId;
    }

    public final ApplicationEntity copy(String functionName, String functionNameCn, List<String> img, int defaultImg, int functionType, int orderNum, int deviceType, String groupName, int groupId, int isUserComponent, int fixedStatus, OptsJumpModel jumpVo) {
        return new ApplicationEntity(functionName, functionNameCn, img, defaultImg, functionType, orderNum, deviceType, groupName, groupId, isUserComponent, fixedStatus, jumpVo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplicationEntity)) {
            return false;
        }
        ApplicationEntity applicationEntity = (ApplicationEntity) other;
        return Intrinsics.areEqual(this.functionName, applicationEntity.functionName) && Intrinsics.areEqual(this.functionNameCn, applicationEntity.functionNameCn) && Intrinsics.areEqual(this.img, applicationEntity.img) && this.defaultImg == applicationEntity.defaultImg && this.functionType == applicationEntity.functionType && this.orderNum == applicationEntity.orderNum && this.deviceType == applicationEntity.deviceType && Intrinsics.areEqual(this.groupName, applicationEntity.groupName) && this.groupId == applicationEntity.groupId && this.isUserComponent == applicationEntity.isUserComponent && this.fixedStatus == applicationEntity.fixedStatus && Intrinsics.areEqual(this.jumpVo, applicationEntity.jumpVo);
    }

    public int hashCode() {
        String str = this.functionName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.functionNameCn;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.img;
        int hashCode3 = (((((((((hashCode2 + (list == null ? 0 : list.hashCode())) * 31) + Integer.hashCode(this.defaultImg)) * 31) + Integer.hashCode(this.functionType)) * 31) + Integer.hashCode(this.orderNum)) * 31) + Integer.hashCode(this.deviceType)) * 31;
        String str3 = this.groupName;
        int hashCode4 = (((((((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Integer.hashCode(this.groupId)) * 31) + Integer.hashCode(this.isUserComponent)) * 31) + Integer.hashCode(this.fixedStatus)) * 31;
        OptsJumpModel optsJumpModel = this.jumpVo;
        return hashCode4 + (optsJumpModel != null ? optsJumpModel.hashCode() : 0);
    }

    public String toString() {
        return "ApplicationEntity(functionName=" + this.functionName + ", functionNameCn=" + this.functionNameCn + ", img=" + this.img + ", defaultImg=" + this.defaultImg + ", functionType=" + this.functionType + ", orderNum=" + this.orderNum + ", deviceType=" + this.deviceType + ", groupName=" + this.groupName + ", groupId=" + this.groupId + ", isUserComponent=" + this.isUserComponent + ", fixedStatus=" + this.fixedStatus + ", jumpVo=" + this.jumpVo + Separators.RPAREN;
    }

    public ApplicationEntity(String str, String str2, List<String> list, int i, int i2, int i3, int i4, String str3, int i5, int i6, int i7, OptsJumpModel optsJumpModel) {
        this.functionName = str;
        this.functionNameCn = str2;
        this.img = list;
        this.defaultImg = i;
        this.functionType = i2;
        this.orderNum = i3;
        this.deviceType = i4;
        this.groupName = str3;
        this.groupId = i5;
        this.isUserComponent = i6;
        this.fixedStatus = i7;
        this.jumpVo = optsJumpModel;
    }

    public /* synthetic */ ApplicationEntity(String str, String str2, List list, int i, int i2, int i3, int i4, String str3, int i5, int i6, int i7, OptsJumpModel optsJumpModel, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i8 & 2) != 0 ? null : str2, list, i, i2, i3, i4, str3, i5, i6, i7, optsJumpModel);
    }

    public final String getFunctionName() {
        return this.functionName;
    }

    public final String getFunctionNameCn() {
        return this.functionNameCn;
    }

    public final List<String> getImg() {
        return this.img;
    }

    public final int getDefaultImg() {
        return this.defaultImg;
    }

    public final int getFunctionType() {
        return this.functionType;
    }

    public final int getOrderNum() {
        return this.orderNum;
    }

    public final int getDeviceType() {
        return this.deviceType;
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final int getGroupId() {
        return this.groupId;
    }

    public final int isUserComponent() {
        return this.isUserComponent;
    }

    public final int getFixedStatus() {
        return this.fixedStatus;
    }

    public final OptsJumpModel getJumpVo() {
        return this.jumpVo;
    }
}
