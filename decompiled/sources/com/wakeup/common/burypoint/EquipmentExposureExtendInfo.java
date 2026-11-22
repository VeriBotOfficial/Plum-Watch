package com.wakeup.common.burypoint;

import android.gov.nist.core.Separators;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppEntityExtendInfo.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/wakeup/common/burypoint/EquipmentExposureExtendInfo;", "Lcom/wakeup/common/burypoint/BaseExtendInfo;", "productId", "", "launchId", JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProductId", "()Ljava/lang/String;", "setProductId", "(Ljava/lang/String;)V", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EquipmentExposureExtendInfo extends BaseExtendInfo {
    private String productId;

    public final String getProductId() {
        return this.productId;
    }

    public final void setProductId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.productId = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquipmentExposureExtendInfo(String productId, String launchId, String sessionId) {
        super(launchId, sessionId);
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.productId = productId;
    }

    @Override // com.wakeup.common.burypoint.BaseExtendInfo
    public String toString() {
        return "EquipmentExposureExtendInfo(productId=" + this.productId + ", launchId=" + getLaunchId() + ", sessionId=" + getSessionId() + Separators.RPAREN;
    }
}
