package com.wakeup.common.network.entity.device.dial;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DialGalleryModule.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/wakeup/common/network/entity/device/dial/DialGalleryModule;", "", "colorList", "", "Lcom/wakeup/common/network/entity/device/dial/GalleryColorBean;", "styleList", "Lcom/wakeup/common/network/entity/device/dial/GalleryStyleBean;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getColorList", "()Ljava/util/List;", "getStyleList", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DialGalleryModule {
    private final List<GalleryColorBean> colorList;
    private final List<GalleryStyleBean> styleList;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DialGalleryModule copy$default(DialGalleryModule dialGalleryModule, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = dialGalleryModule.colorList;
        }
        if ((i & 2) != 0) {
            list2 = dialGalleryModule.styleList;
        }
        return dialGalleryModule.copy(list, list2);
    }

    public final List<GalleryColorBean> component1() {
        return this.colorList;
    }

    public final List<GalleryStyleBean> component2() {
        return this.styleList;
    }

    public final DialGalleryModule copy(List<GalleryColorBean> colorList, List<GalleryStyleBean> styleList) {
        Intrinsics.checkNotNullParameter(colorList, "colorList");
        Intrinsics.checkNotNullParameter(styleList, "styleList");
        return new DialGalleryModule(colorList, styleList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialGalleryModule)) {
            return false;
        }
        DialGalleryModule dialGalleryModule = (DialGalleryModule) other;
        return Intrinsics.areEqual(this.colorList, dialGalleryModule.colorList) && Intrinsics.areEqual(this.styleList, dialGalleryModule.styleList);
    }

    public int hashCode() {
        return (this.colorList.hashCode() * 31) + this.styleList.hashCode();
    }

    public String toString() {
        return "DialGalleryModule(colorList=" + this.colorList + ", styleList=" + this.styleList + Separators.RPAREN;
    }

    public DialGalleryModule(List<GalleryColorBean> colorList, List<GalleryStyleBean> styleList) {
        Intrinsics.checkNotNullParameter(colorList, "colorList");
        Intrinsics.checkNotNullParameter(styleList, "styleList");
        this.colorList = colorList;
        this.styleList = styleList;
    }

    public final List<GalleryColorBean> getColorList() {
        return this.colorList;
    }

    public final List<GalleryStyleBean> getStyleList() {
        return this.styleList;
    }
}
