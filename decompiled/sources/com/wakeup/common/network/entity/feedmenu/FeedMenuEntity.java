package com.wakeup.common.network.entity.feedmenu;

import android.gov.nist.core.Separators;
import com.tencent.open.SocialConstants;
import com.wakeup.common.network.entity.opts.OptsJumpModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FeedMenuEntity.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tHÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0013HÆ\u0003J®\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u00108J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020\u0003HÖ\u0001J\t\u0010=\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010 R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006>"}, d2 = {"Lcom/wakeup/common/network/entity/feedmenu/FeedMenuEntity;", "", "id", "", "functionName", "", "functionNameCn", "functionDesc", SocialConstants.PARAM_IMG_URL, "", "defaultImg", "functionType", "orderNum", "deviceType", "groupName", "groupId", "isUserComponent", "fixedStatus", "jumpVo", "Lcom/wakeup/common/network/entity/opts/OptsJumpModel;", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;IIIILjava/lang/String;IIILcom/wakeup/common/network/entity/opts/OptsJumpModel;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFunctionName", "()Ljava/lang/String;", "getFunctionNameCn", "getFunctionDesc", "getImg", "()Ljava/util/List;", "getDefaultImg", "()I", "getFunctionType", "getOrderNum", "getDeviceType", "getGroupName", "getGroupId", "getFixedStatus", "getJumpVo", "()Lcom/wakeup/common/network/entity/opts/OptsJumpModel;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;IIIILjava/lang/String;IIILcom/wakeup/common/network/entity/opts/OptsJumpModel;)Lcom/wakeup/common/network/entity/feedmenu/FeedMenuEntity;", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FeedMenuEntity {
    private final int defaultImg;
    private final int deviceType;
    private final int fixedStatus;
    private final String functionDesc;
    private final String functionName;
    private final String functionNameCn;
    private final int functionType;
    private final int groupId;
    private final String groupName;
    private final Integer id;
    private final List<String> img;
    private final int isUserComponent;
    private final OptsJumpModel jumpVo;
    private final int orderNum;

    /* renamed from: component1, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getGroupName() {
        return this.groupName;
    }

    /* renamed from: component11, reason: from getter */
    public final int getGroupId() {
        return this.groupId;
    }

    /* renamed from: component12, reason: from getter */
    public final int getIsUserComponent() {
        return this.isUserComponent;
    }

    /* renamed from: component13, reason: from getter */
    public final int getFixedStatus() {
        return this.fixedStatus;
    }

    /* renamed from: component14, reason: from getter */
    public final OptsJumpModel getJumpVo() {
        return this.jumpVo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFunctionName() {
        return this.functionName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFunctionNameCn() {
        return this.functionNameCn;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFunctionDesc() {
        return this.functionDesc;
    }

    public final List<String> component5() {
        return this.img;
    }

    /* renamed from: component6, reason: from getter */
    public final int getDefaultImg() {
        return this.defaultImg;
    }

    /* renamed from: component7, reason: from getter */
    public final int getFunctionType() {
        return this.functionType;
    }

    /* renamed from: component8, reason: from getter */
    public final int getOrderNum() {
        return this.orderNum;
    }

    /* renamed from: component9, reason: from getter */
    public final int getDeviceType() {
        return this.deviceType;
    }

    public final FeedMenuEntity copy(Integer id2, String functionName, String functionNameCn, String functionDesc, List<String> img, int defaultImg, int functionType, int orderNum, int deviceType, String groupName, int groupId, int isUserComponent, int fixedStatus, OptsJumpModel jumpVo) {
        return new FeedMenuEntity(id2, functionName, functionNameCn, functionDesc, img, defaultImg, functionType, orderNum, deviceType, groupName, groupId, isUserComponent, fixedStatus, jumpVo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedMenuEntity)) {
            return false;
        }
        FeedMenuEntity feedMenuEntity = (FeedMenuEntity) other;
        return Intrinsics.areEqual(this.id, feedMenuEntity.id) && Intrinsics.areEqual(this.functionName, feedMenuEntity.functionName) && Intrinsics.areEqual(this.functionNameCn, feedMenuEntity.functionNameCn) && Intrinsics.areEqual(this.functionDesc, feedMenuEntity.functionDesc) && Intrinsics.areEqual(this.img, feedMenuEntity.img) && this.defaultImg == feedMenuEntity.defaultImg && this.functionType == feedMenuEntity.functionType && this.orderNum == feedMenuEntity.orderNum && this.deviceType == feedMenuEntity.deviceType && Intrinsics.areEqual(this.groupName, feedMenuEntity.groupName) && this.groupId == feedMenuEntity.groupId && this.isUserComponent == feedMenuEntity.isUserComponent && this.fixedStatus == feedMenuEntity.fixedStatus && Intrinsics.areEqual(this.jumpVo, feedMenuEntity.jumpVo);
    }

    public int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.functionName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.functionNameCn;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.functionDesc;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.img;
        int hashCode5 = (((((((((hashCode4 + (list == null ? 0 : list.hashCode())) * 31) + Integer.hashCode(this.defaultImg)) * 31) + Integer.hashCode(this.functionType)) * 31) + Integer.hashCode(this.orderNum)) * 31) + Integer.hashCode(this.deviceType)) * 31;
        String str4 = this.groupName;
        int hashCode6 = (((((((hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31) + Integer.hashCode(this.groupId)) * 31) + Integer.hashCode(this.isUserComponent)) * 31) + Integer.hashCode(this.fixedStatus)) * 31;
        OptsJumpModel optsJumpModel = this.jumpVo;
        return hashCode6 + (optsJumpModel != null ? optsJumpModel.hashCode() : 0);
    }

    public String toString() {
        return "FeedMenuEntity(id=" + this.id + ", functionName=" + this.functionName + ", functionNameCn=" + this.functionNameCn + ", functionDesc=" + this.functionDesc + ", img=" + this.img + ", defaultImg=" + this.defaultImg + ", functionType=" + this.functionType + ", orderNum=" + this.orderNum + ", deviceType=" + this.deviceType + ", groupName=" + this.groupName + ", groupId=" + this.groupId + ", isUserComponent=" + this.isUserComponent + ", fixedStatus=" + this.fixedStatus + ", jumpVo=" + this.jumpVo + Separators.RPAREN;
    }

    public FeedMenuEntity(Integer num, String str, String str2, String str3, List<String> list, int i, int i2, int i3, int i4, String str4, int i5, int i6, int i7, OptsJumpModel optsJumpModel) {
        this.id = num;
        this.functionName = str;
        this.functionNameCn = str2;
        this.functionDesc = str3;
        this.img = list;
        this.defaultImg = i;
        this.functionType = i2;
        this.orderNum = i3;
        this.deviceType = i4;
        this.groupName = str4;
        this.groupId = i5;
        this.isUserComponent = i6;
        this.fixedStatus = i7;
        this.jumpVo = optsJumpModel;
    }

    public /* synthetic */ FeedMenuEntity(Integer num, String str, String str2, String str3, List list, int i, int i2, int i3, int i4, String str4, int i5, int i6, int i7, OptsJumpModel optsJumpModel, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str, (i8 & 4) != 0 ? null : str2, (i8 & 8) != 0 ? null : str3, list, i, i2, i3, i4, str4, i5, i6, i7, optsJumpModel);
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getFunctionName() {
        return this.functionName;
    }

    public final String getFunctionNameCn() {
        return this.functionNameCn;
    }

    public final String getFunctionDesc() {
        return this.functionDesc;
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
