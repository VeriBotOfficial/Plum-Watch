package com.beken.iot.smartsdk.core.connect;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* compiled from: ProtocolConfig.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJV\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0006HÖ\u0001J\u0006\u0010$\u001a\u00020!J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011¨\u0006&"}, d2 = {"Lcom/beken/iot/smartsdk/core/connect/ProtocolConfig;", "", "serviceName", "", IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, "port", "", "cmdPort", "audioPort", "imgPort", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getAudioPort", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCmdPort", "getImgPort", "getIp", "()Ljava/lang/String;", "setIp", "(Ljava/lang/String;)V", "getPort", "setPort", "(Ljava/lang/Integer;)V", "getServiceName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/beken/iot/smartsdk/core/connect/ProtocolConfig;", "equals", "", "other", "hashCode", "isLegal", "toString", "iotsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ProtocolConfig {
    private final Integer audioPort;
    private final Integer cmdPort;
    private final Integer imgPort;
    private String ip;
    private Integer port;
    private final String serviceName;

    public static /* synthetic */ ProtocolConfig copy$default(ProtocolConfig protocolConfig, String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = protocolConfig.serviceName;
        }
        if ((i & 2) != 0) {
            str2 = protocolConfig.ip;
        }
        if ((i & 4) != 0) {
            num = protocolConfig.port;
        }
        if ((i & 8) != 0) {
            num2 = protocolConfig.cmdPort;
        }
        if ((i & 16) != 0) {
            num3 = protocolConfig.audioPort;
        }
        if ((i & 32) != 0) {
            num4 = protocolConfig.imgPort;
        }
        Integer num5 = num3;
        Integer num6 = num4;
        return protocolConfig.copy(str, str2, num, num2, num5, num6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getServiceName() {
        return this.serviceName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIp() {
        return this.ip;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getPort() {
        return this.port;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getCmdPort() {
        return this.cmdPort;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getAudioPort() {
        return this.audioPort;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getImgPort() {
        return this.imgPort;
    }

    public final ProtocolConfig copy(String serviceName, String ip, Integer port, Integer cmdPort, Integer audioPort, Integer imgPort) {
        return new ProtocolConfig(serviceName, ip, port, cmdPort, audioPort, imgPort);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProtocolConfig)) {
            return false;
        }
        ProtocolConfig protocolConfig = (ProtocolConfig) other;
        return Intrinsics.areEqual(this.serviceName, protocolConfig.serviceName) && Intrinsics.areEqual(this.ip, protocolConfig.ip) && Intrinsics.areEqual(this.port, protocolConfig.port) && Intrinsics.areEqual(this.cmdPort, protocolConfig.cmdPort) && Intrinsics.areEqual(this.audioPort, protocolConfig.audioPort) && Intrinsics.areEqual(this.imgPort, protocolConfig.imgPort);
    }

    public int hashCode() {
        String str = this.serviceName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.ip;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.port;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.cmdPort;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.audioPort;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.imgPort;
        return hashCode5 + (num4 != null ? num4.hashCode() : 0);
    }

    public String toString() {
        return "ProtocolConfig(serviceName=" + this.serviceName + ", ip=" + this.ip + ", port=" + this.port + ", cmdPort=" + this.cmdPort + ", audioPort=" + this.audioPort + ", imgPort=" + this.imgPort + ')';
    }

    public ProtocolConfig(String str, String str2, Integer num, Integer num2, Integer num3, Integer num4) {
        this.serviceName = str;
        this.ip = str2;
        this.port = num;
        this.cmdPort = num2;
        this.audioPort = num3;
        this.imgPort = num4;
    }

    public final Integer getAudioPort() {
        return this.audioPort;
    }

    public final Integer getCmdPort() {
        return this.cmdPort;
    }

    public final Integer getImgPort() {
        return this.imgPort;
    }

    public final String getIp() {
        return this.ip;
    }

    public final Integer getPort() {
        return this.port;
    }

    public final String getServiceName() {
        return this.serviceName;
    }

    public final void setIp(String str) {
        this.ip = str;
    }

    public final void setPort(Integer num) {
        this.port = num;
    }

    public final boolean isLegal() {
        Integer num;
        if (this.serviceName != null && this.ip != null && (num = this.port) != null) {
            num.intValue();
            Integer num2 = this.cmdPort;
            if (num2 != null) {
                num2.intValue();
                Integer num3 = this.audioPort;
                if (num3 != null) {
                    num3.intValue();
                    Integer num4 = this.imgPort;
                    if (num4 != null) {
                        num4.intValue();
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
