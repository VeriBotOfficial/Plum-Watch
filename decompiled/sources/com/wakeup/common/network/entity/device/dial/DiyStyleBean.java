package com.wakeup.common.network.entity.device.dial;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DialGalleryModule.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/wakeup/common/network/entity/device/dial/DiyStyleBean;", "", "name", "", "image", "bigImage", "firmwareId", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getName", "()Ljava/lang/String;", "getImage", "getBigImage", "getFirmwareId", "()I", "isSelect", "", "()Z", "setSelect", "(Z)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DiyStyleBean {
    private final String bigImage;
    private final int firmwareId;
    private final String image;
    private boolean isSelect;
    private final String name;

    public static /* synthetic */ DiyStyleBean copy$default(DiyStyleBean diyStyleBean, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = diyStyleBean.name;
        }
        if ((i2 & 2) != 0) {
            str2 = diyStyleBean.image;
        }
        if ((i2 & 4) != 0) {
            str3 = diyStyleBean.bigImage;
        }
        if ((i2 & 8) != 0) {
            i = diyStyleBean.firmwareId;
        }
        return diyStyleBean.copy(str, str2, str3, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBigImage() {
        return this.bigImage;
    }

    /* renamed from: component4, reason: from getter */
    public final int getFirmwareId() {
        return this.firmwareId;
    }

    public final DiyStyleBean copy(String name, String image, String bigImage, int firmwareId) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(bigImage, "bigImage");
        return new DiyStyleBean(name, image, bigImage, firmwareId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiyStyleBean)) {
            return false;
        }
        DiyStyleBean diyStyleBean = (DiyStyleBean) other;
        return Intrinsics.areEqual(this.name, diyStyleBean.name) && Intrinsics.areEqual(this.image, diyStyleBean.image) && Intrinsics.areEqual(this.bigImage, diyStyleBean.bigImage) && this.firmwareId == diyStyleBean.firmwareId;
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.image.hashCode()) * 31) + this.bigImage.hashCode()) * 31) + Integer.hashCode(this.firmwareId);
    }

    public String toString() {
        return "DiyStyleBean(name=" + this.name + ", image=" + this.image + ", bigImage=" + this.bigImage + ", firmwareId=" + this.firmwareId + Separators.RPAREN;
    }

    public DiyStyleBean(String name, String image, String bigImage, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(bigImage, "bigImage");
        this.name = name;
        this.image = image;
        this.bigImage = bigImage;
        this.firmwareId = i;
    }

    public final String getName() {
        return this.name;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getBigImage() {
        return this.bigImage;
    }

    public final int getFirmwareId() {
        return this.firmwareId;
    }

    /* renamed from: isSelect, reason: from getter */
    public final boolean getIsSelect() {
        return this.isSelect;
    }

    public final void setSelect(boolean z) {
        this.isSelect = z;
    }
}
