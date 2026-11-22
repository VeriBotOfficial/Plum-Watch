package com.wakeup.common.network.entity.device.dial;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DialGalleryModule.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003JS\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010¨\u0006 "}, d2 = {"Lcom/wakeup/common/network/entity/device/dial/DiyDialBean;", "", "radius", "", "colorList", "", "Lcom/wakeup/common/network/entity/device/dial/GalleryColorBean;", "fountList", "Lcom/wakeup/common/network/entity/device/dial/DiyStyleBean;", "digitStyleList", "pointerStyleList", "<init>", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getRadius", "()I", "getColorList", "()Ljava/util/List;", "getFountList", "getDigitStyleList", "getPointerStyleList", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DiyDialBean {
    private final List<GalleryColorBean> colorList;
    private final List<DiyStyleBean> digitStyleList;
    private final List<DiyStyleBean> fountList;
    private final List<DiyStyleBean> pointerStyleList;
    private final int radius;

    public static /* synthetic */ DiyDialBean copy$default(DiyDialBean diyDialBean, int i, List list, List list2, List list3, List list4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = diyDialBean.radius;
        }
        if ((i2 & 2) != 0) {
            list = diyDialBean.colorList;
        }
        if ((i2 & 4) != 0) {
            list2 = diyDialBean.fountList;
        }
        if ((i2 & 8) != 0) {
            list3 = diyDialBean.digitStyleList;
        }
        if ((i2 & 16) != 0) {
            list4 = diyDialBean.pointerStyleList;
        }
        List list5 = list4;
        List list6 = list2;
        return diyDialBean.copy(i, list, list6, list3, list5);
    }

    /* renamed from: component1, reason: from getter */
    public final int getRadius() {
        return this.radius;
    }

    public final List<GalleryColorBean> component2() {
        return this.colorList;
    }

    public final List<DiyStyleBean> component3() {
        return this.fountList;
    }

    public final List<DiyStyleBean> component4() {
        return this.digitStyleList;
    }

    public final List<DiyStyleBean> component5() {
        return this.pointerStyleList;
    }

    public final DiyDialBean copy(int radius, List<GalleryColorBean> colorList, List<DiyStyleBean> fountList, List<DiyStyleBean> digitStyleList, List<DiyStyleBean> pointerStyleList) {
        Intrinsics.checkNotNullParameter(colorList, "colorList");
        Intrinsics.checkNotNullParameter(fountList, "fountList");
        Intrinsics.checkNotNullParameter(digitStyleList, "digitStyleList");
        Intrinsics.checkNotNullParameter(pointerStyleList, "pointerStyleList");
        return new DiyDialBean(radius, colorList, fountList, digitStyleList, pointerStyleList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiyDialBean)) {
            return false;
        }
        DiyDialBean diyDialBean = (DiyDialBean) other;
        return this.radius == diyDialBean.radius && Intrinsics.areEqual(this.colorList, diyDialBean.colorList) && Intrinsics.areEqual(this.fountList, diyDialBean.fountList) && Intrinsics.areEqual(this.digitStyleList, diyDialBean.digitStyleList) && Intrinsics.areEqual(this.pointerStyleList, diyDialBean.pointerStyleList);
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.radius) * 31) + this.colorList.hashCode()) * 31) + this.fountList.hashCode()) * 31) + this.digitStyleList.hashCode()) * 31) + this.pointerStyleList.hashCode();
    }

    public String toString() {
        return "DiyDialBean(radius=" + this.radius + ", colorList=" + this.colorList + ", fountList=" + this.fountList + ", digitStyleList=" + this.digitStyleList + ", pointerStyleList=" + this.pointerStyleList + Separators.RPAREN;
    }

    public DiyDialBean(int i, List<GalleryColorBean> colorList, List<DiyStyleBean> fountList, List<DiyStyleBean> digitStyleList, List<DiyStyleBean> pointerStyleList) {
        Intrinsics.checkNotNullParameter(colorList, "colorList");
        Intrinsics.checkNotNullParameter(fountList, "fountList");
        Intrinsics.checkNotNullParameter(digitStyleList, "digitStyleList");
        Intrinsics.checkNotNullParameter(pointerStyleList, "pointerStyleList");
        this.radius = i;
        this.colorList = colorList;
        this.fountList = fountList;
        this.digitStyleList = digitStyleList;
        this.pointerStyleList = pointerStyleList;
    }

    public final int getRadius() {
        return this.radius;
    }

    public final List<GalleryColorBean> getColorList() {
        return this.colorList;
    }

    public final List<DiyStyleBean> getFountList() {
        return this.fountList;
    }

    public final List<DiyStyleBean> getDigitStyleList() {
        return this.digitStyleList;
    }

    public final List<DiyStyleBean> getPointerStyleList() {
        return this.pointerStyleList;
    }
}
