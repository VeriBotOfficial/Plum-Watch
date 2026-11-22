package com.wakeup.common.network.entity.other;

import android.gov.nist.core.Separators;
import com.tencent.open.SocialConstants;
import com.wakeup.common.network.entity.opts.OptsJumpModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SubassemblyEntity.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010+\u001a\u00020\rHÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0010HÆ\u0003J\u0090\u0001\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0003HÖ\u0001J\t\u00104\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001d\u0010\u0014R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u000e\u0010\u0014R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00065"}, d2 = {"Lcom/wakeup/common/network/entity/other/SubassemblyEntity;", "", "id", "", "componentName", "", "componentNameCn", "componentShapeType", "componentType", "deviceType", "orderNum", "componentSource", "jumpVo", "Lcom/wakeup/common/network/entity/opts/OptsJumpModel;", "isUserComponent", SocialConstants.PARAM_IMG_URL, "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/Integer;Ljava/lang/Integer;Lcom/wakeup/common/network/entity/opts/OptsJumpModel;Ljava/lang/Integer;Ljava/util/List;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getComponentName", "()Ljava/lang/String;", "getComponentNameCn", "getComponentShapeType", "()I", "getComponentType", "getDeviceType", "getOrderNum", "getComponentSource", "getJumpVo", "()Lcom/wakeup/common/network/entity/opts/OptsJumpModel;", "getImg", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/Integer;Ljava/lang/Integer;Lcom/wakeup/common/network/entity/opts/OptsJumpModel;Ljava/lang/Integer;Ljava/util/List;)Lcom/wakeup/common/network/entity/other/SubassemblyEntity;", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SubassemblyEntity {
    private final String componentName;
    private final String componentNameCn;
    private final int componentShapeType;
    private final Integer componentSource;
    private final int componentType;
    private final int deviceType;
    private final Integer id;
    private final List<String> img;
    private final Integer isUserComponent;
    private final OptsJumpModel jumpVo;
    private final Integer orderNum;

    public static /* synthetic */ SubassemblyEntity copy$default(SubassemblyEntity subassemblyEntity, Integer num, String str, String str2, int i, int i2, int i3, Integer num2, Integer num3, OptsJumpModel optsJumpModel, Integer num4, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            num = subassemblyEntity.id;
        }
        if ((i4 & 2) != 0) {
            str = subassemblyEntity.componentName;
        }
        if ((i4 & 4) != 0) {
            str2 = subassemblyEntity.componentNameCn;
        }
        if ((i4 & 8) != 0) {
            i = subassemblyEntity.componentShapeType;
        }
        if ((i4 & 16) != 0) {
            i2 = subassemblyEntity.componentType;
        }
        if ((i4 & 32) != 0) {
            i3 = subassemblyEntity.deviceType;
        }
        if ((i4 & 64) != 0) {
            num2 = subassemblyEntity.orderNum;
        }
        if ((i4 & 128) != 0) {
            num3 = subassemblyEntity.componentSource;
        }
        if ((i4 & 256) != 0) {
            optsJumpModel = subassemblyEntity.jumpVo;
        }
        if ((i4 & 512) != 0) {
            num4 = subassemblyEntity.isUserComponent;
        }
        if ((i4 & 1024) != 0) {
            list = subassemblyEntity.img;
        }
        Integer num5 = num4;
        List list2 = list;
        Integer num6 = num3;
        OptsJumpModel optsJumpModel2 = optsJumpModel;
        int i5 = i3;
        Integer num7 = num2;
        int i6 = i2;
        String str3 = str2;
        return subassemblyEntity.copy(num, str, str3, i, i6, i5, num7, num6, optsJumpModel2, num5, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final Integer getIsUserComponent() {
        return this.isUserComponent;
    }

    public final List<String> component11() {
        return this.img;
    }

    /* renamed from: component2, reason: from getter */
    public final String getComponentName() {
        return this.componentName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getComponentNameCn() {
        return this.componentNameCn;
    }

    /* renamed from: component4, reason: from getter */
    public final int getComponentShapeType() {
        return this.componentShapeType;
    }

    /* renamed from: component5, reason: from getter */
    public final int getComponentType() {
        return this.componentType;
    }

    /* renamed from: component6, reason: from getter */
    public final int getDeviceType() {
        return this.deviceType;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getOrderNum() {
        return this.orderNum;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getComponentSource() {
        return this.componentSource;
    }

    /* renamed from: component9, reason: from getter */
    public final OptsJumpModel getJumpVo() {
        return this.jumpVo;
    }

    public final SubassemblyEntity copy(Integer id2, String componentName, String componentNameCn, int componentShapeType, int componentType, int deviceType, Integer orderNum, Integer componentSource, OptsJumpModel jumpVo, Integer isUserComponent, List<String> img) {
        Intrinsics.checkNotNullParameter(jumpVo, "jumpVo");
        return new SubassemblyEntity(id2, componentName, componentNameCn, componentShapeType, componentType, deviceType, orderNum, componentSource, jumpVo, isUserComponent, img);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubassemblyEntity)) {
            return false;
        }
        SubassemblyEntity subassemblyEntity = (SubassemblyEntity) other;
        return Intrinsics.areEqual(this.id, subassemblyEntity.id) && Intrinsics.areEqual(this.componentName, subassemblyEntity.componentName) && Intrinsics.areEqual(this.componentNameCn, subassemblyEntity.componentNameCn) && this.componentShapeType == subassemblyEntity.componentShapeType && this.componentType == subassemblyEntity.componentType && this.deviceType == subassemblyEntity.deviceType && Intrinsics.areEqual(this.orderNum, subassemblyEntity.orderNum) && Intrinsics.areEqual(this.componentSource, subassemblyEntity.componentSource) && Intrinsics.areEqual(this.jumpVo, subassemblyEntity.jumpVo) && Intrinsics.areEqual(this.isUserComponent, subassemblyEntity.isUserComponent) && Intrinsics.areEqual(this.img, subassemblyEntity.img);
    }

    public int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.componentName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.componentNameCn;
        int hashCode3 = (((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.componentShapeType)) * 31) + Integer.hashCode(this.componentType)) * 31) + Integer.hashCode(this.deviceType)) * 31;
        Integer num2 = this.orderNum;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.componentSource;
        int hashCode5 = (((hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31) + this.jumpVo.hashCode()) * 31;
        Integer num4 = this.isUserComponent;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List<String> list = this.img;
        return hashCode6 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "SubassemblyEntity(id=" + this.id + ", componentName=" + this.componentName + ", componentNameCn=" + this.componentNameCn + ", componentShapeType=" + this.componentShapeType + ", componentType=" + this.componentType + ", deviceType=" + this.deviceType + ", orderNum=" + this.orderNum + ", componentSource=" + this.componentSource + ", jumpVo=" + this.jumpVo + ", isUserComponent=" + this.isUserComponent + ", img=" + this.img + Separators.RPAREN;
    }

    public SubassemblyEntity(Integer num, String str, String str2, int i, int i2, int i3, Integer num2, Integer num3, OptsJumpModel jumpVo, Integer num4, List<String> list) {
        Intrinsics.checkNotNullParameter(jumpVo, "jumpVo");
        this.id = num;
        this.componentName = str;
        this.componentNameCn = str2;
        this.componentShapeType = i;
        this.componentType = i2;
        this.deviceType = i3;
        this.orderNum = num2;
        this.componentSource = num3;
        this.jumpVo = jumpVo;
        this.isUserComponent = num4;
        this.img = list;
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getComponentName() {
        return this.componentName;
    }

    public final String getComponentNameCn() {
        return this.componentNameCn;
    }

    public final int getComponentShapeType() {
        return this.componentShapeType;
    }

    public final int getComponentType() {
        return this.componentType;
    }

    public final int getDeviceType() {
        return this.deviceType;
    }

    public final Integer getOrderNum() {
        return this.orderNum;
    }

    public final Integer getComponentSource() {
        return this.componentSource;
    }

    public final OptsJumpModel getJumpVo() {
        return this.jumpVo;
    }

    public final Integer isUserComponent() {
        return this.isUserComponent;
    }

    public final List<String> getImg() {
        return this.img;
    }
}
