package com.wakeup.common.network.entity.desktop;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DesktopEntity.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/wakeup/common/network/entity/desktop/DesktopEntity;", "", "imgUrl", "", "<init>", "(Ljava/lang/String;)V", "getImgUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DesktopEntity {
    private final String imgUrl;

    public static /* synthetic */ DesktopEntity copy$default(DesktopEntity desktopEntity, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = desktopEntity.imgUrl;
        }
        return desktopEntity.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getImgUrl() {
        return this.imgUrl;
    }

    public final DesktopEntity copy(String imgUrl) {
        Intrinsics.checkNotNullParameter(imgUrl, "imgUrl");
        return new DesktopEntity(imgUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DesktopEntity) && Intrinsics.areEqual(this.imgUrl, ((DesktopEntity) other).imgUrl);
    }

    public int hashCode() {
        return this.imgUrl.hashCode();
    }

    public String toString() {
        return "DesktopEntity(imgUrl=" + this.imgUrl + Separators.RPAREN;
    }

    public DesktopEntity(String imgUrl) {
        Intrinsics.checkNotNullParameter(imgUrl, "imgUrl");
        this.imgUrl = imgUrl;
    }

    public final String getImgUrl() {
        return this.imgUrl;
    }
}
