package com.wakeup.common.burypoint;

import android.gov.nist.core.Separators;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppEntityExtendInfo.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/wakeup/common/burypoint/FunctionComponentExtendInfo;", "Lcom/wakeup/common/burypoint/BaseExtendInfo;", "componentId", "", "componentName", "launchId", JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getComponentId", "()Ljava/lang/String;", "setComponentId", "(Ljava/lang/String;)V", "getComponentName", "setComponentName", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FunctionComponentExtendInfo extends BaseExtendInfo {
    private String componentId;
    private String componentName;

    public final String getComponentId() {
        return this.componentId;
    }

    public final void setComponentId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.componentId = str;
    }

    public final String getComponentName() {
        return this.componentName;
    }

    public final void setComponentName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.componentName = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FunctionComponentExtendInfo(String componentId, String componentName, String launchId, String sessionId) {
        super(launchId, sessionId);
        Intrinsics.checkNotNullParameter(componentId, "componentId");
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.componentId = componentId;
        this.componentName = componentName;
    }

    @Override // com.wakeup.common.burypoint.BaseExtendInfo
    public String toString() {
        return "FunctionComponentExtendInfo(componentId=" + this.componentId + ", componentName=" + this.componentName + ", launchId=" + getLaunchId() + ", sessionId=" + getSessionId() + Separators.RPAREN;
    }
}
