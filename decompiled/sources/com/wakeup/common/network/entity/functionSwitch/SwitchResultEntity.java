package com.wakeup.common.network.entity.functionSwitch;

import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SwitchResultEntity.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/wakeup/common/network/entity/functionSwitch/SwitchResultEntity;", "", "buttonTabId", "", "nameCn", "status", "", "channel", "version", "buttonTabConfig", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getButtonTabId", "()Ljava/lang/String;", "setButtonTabId", "(Ljava/lang/String;)V", "getNameCn", "setNameCn", "getStatus", "()Z", "setStatus", "(Z)V", "getChannel", "setChannel", MobileAdsBridge.versionMethodName, "setVersion", "getButtonTabConfig", "setButtonTabConfig", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SwitchResultEntity {
    private String buttonTabConfig;
    private String buttonTabId;
    private String channel;
    private String nameCn;
    private boolean status;
    private String version;

    public SwitchResultEntity() {
        this(null, null, false, null, null, null, 63, null);
    }

    public SwitchResultEntity(String buttonTabId, String str, boolean z, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(buttonTabId, "buttonTabId");
        this.buttonTabId = buttonTabId;
        this.nameCn = str;
        this.status = z;
        this.channel = str2;
        this.version = str3;
        this.buttonTabConfig = str4;
    }

    public /* synthetic */ SwitchResultEntity(String str, String str2, boolean z, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? true : z, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5);
    }

    public final String getButtonTabId() {
        return this.buttonTabId;
    }

    public final void setButtonTabId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.buttonTabId = str;
    }

    public final String getNameCn() {
        return this.nameCn;
    }

    public final void setNameCn(String str) {
        this.nameCn = str;
    }

    public final boolean getStatus() {
        return this.status;
    }

    public final void setStatus(boolean z) {
        this.status = z;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final void setChannel(String str) {
        this.channel = str;
    }

    public final String getVersion() {
        return this.version;
    }

    public final void setVersion(String str) {
        this.version = str;
    }

    public final String getButtonTabConfig() {
        return this.buttonTabConfig;
    }

    public final void setButtonTabConfig(String str) {
        this.buttonTabConfig = str;
    }
}
