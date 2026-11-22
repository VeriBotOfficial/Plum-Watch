package com.wakeup.common.burypoint;

import android.gov.nist.core.Separators;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppEntityExtendInfo.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0018\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/wakeup/common/burypoint/ComponentConnectExtendInfo;", "Lcom/wakeup/common/burypoint/BaseExtendInfo;", "componentId", "", "componentName", "componentPosition", "connectionStatus", "", "launchId", JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getComponentId", "()Ljava/lang/String;", "setComponentId", "(Ljava/lang/String;)V", "getComponentName", "setComponentName", "getComponentPosition", "setComponentPosition", "getConnectionStatus", "()I", "setConnectionStatus", "(I)V", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComponentConnectExtendInfo extends BaseExtendInfo {
    private String componentId;
    private String componentName;
    private String componentPosition;
    private int connectionStatus;

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

    public final String getComponentPosition() {
        return this.componentPosition;
    }

    public final void setComponentPosition(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.componentPosition = str;
    }

    public final int getConnectionStatus() {
        return this.connectionStatus;
    }

    public final void setConnectionStatus(int i) {
        this.connectionStatus = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComponentConnectExtendInfo(String componentId, String componentName, String componentPosition, int i, String launchId, String sessionId) {
        super(launchId, sessionId);
        Intrinsics.checkNotNullParameter(componentId, "componentId");
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        Intrinsics.checkNotNullParameter(componentPosition, "componentPosition");
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.componentId = componentId;
        this.componentName = componentName;
        this.componentPosition = componentPosition;
        this.connectionStatus = i;
    }

    @Override // com.wakeup.common.burypoint.BaseExtendInfo
    public String toString() {
        return "ComponentExtendInfo(componentId=" + this.componentId + ", componentName=" + this.componentName + ",connectionStatus=" + this.connectionStatus + ", componentPosition=" + this.componentPosition + ", launchId=" + getLaunchId() + ", sessionId=" + getSessionId() + Separators.RPAREN;
    }
}
