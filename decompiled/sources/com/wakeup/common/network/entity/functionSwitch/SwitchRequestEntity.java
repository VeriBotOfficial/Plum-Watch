package com.wakeup.common.network.entity.functionSwitch;

import android.gov.nist.core.Separators;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SwitchRequestEntity.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/wakeup/common/network/entity/functionSwitch/SwitchRequestEntity;", "", "channel", "", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getChannel", "()Ljava/lang/String;", "setChannel", "(Ljava/lang/String;)V", MobileAdsBridge.versionMethodName, "setVersion", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SwitchRequestEntity {
    private String channel;
    private String version;

    public static /* synthetic */ SwitchRequestEntity copy$default(SwitchRequestEntity switchRequestEntity, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = switchRequestEntity.channel;
        }
        if ((i & 2) != 0) {
            str2 = switchRequestEntity.version;
        }
        return switchRequestEntity.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    /* renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    public final SwitchRequestEntity copy(String channel, String version) {
        return new SwitchRequestEntity(channel, version);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SwitchRequestEntity)) {
            return false;
        }
        SwitchRequestEntity switchRequestEntity = (SwitchRequestEntity) other;
        return Intrinsics.areEqual(this.channel, switchRequestEntity.channel) && Intrinsics.areEqual(this.version, switchRequestEntity.version);
    }

    public int hashCode() {
        String str = this.channel;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.version;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "SwitchRequestEntity(channel=" + this.channel + ", version=" + this.version + Separators.RPAREN;
    }

    public SwitchRequestEntity(String str, String str2) {
        this.channel = str;
        this.version = str2;
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
}
