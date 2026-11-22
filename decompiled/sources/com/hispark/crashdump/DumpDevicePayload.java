package com.hispark.crashdump;

import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CrashDumpUploader.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/hispark/crashdump/DumpDevicePayload;", "", "sn", "", "hardwareModel", "version", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSn", "()Ljava/lang/String;", "getHardwareModel", MobileAdsBridge.versionMethodName, "getType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DumpDevicePayload {
    private final String hardwareModel;
    private final String sn;
    private final String type;
    private final String version;

    public static /* synthetic */ DumpDevicePayload copy$default(DumpDevicePayload dumpDevicePayload, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dumpDevicePayload.sn;
        }
        if ((i & 2) != 0) {
            str2 = dumpDevicePayload.hardwareModel;
        }
        if ((i & 4) != 0) {
            str3 = dumpDevicePayload.version;
        }
        if ((i & 8) != 0) {
            str4 = dumpDevicePayload.type;
        }
        return dumpDevicePayload.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHardwareModel() {
        return this.hardwareModel;
    }

    /* renamed from: component3, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final DumpDevicePayload copy(String sn, String hardwareModel, String version, String type) {
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(hardwareModel, "hardwareModel");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(type, "type");
        return new DumpDevicePayload(sn, hardwareModel, version, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DumpDevicePayload)) {
            return false;
        }
        DumpDevicePayload dumpDevicePayload = (DumpDevicePayload) other;
        return Intrinsics.areEqual(this.sn, dumpDevicePayload.sn) && Intrinsics.areEqual(this.hardwareModel, dumpDevicePayload.hardwareModel) && Intrinsics.areEqual(this.version, dumpDevicePayload.version) && Intrinsics.areEqual(this.type, dumpDevicePayload.type);
    }

    public int hashCode() {
        return (((((this.sn.hashCode() * 31) + this.hardwareModel.hashCode()) * 31) + this.version.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "DumpDevicePayload(sn=" + this.sn + ", hardwareModel=" + this.hardwareModel + ", version=" + this.version + ", type=" + this.type + ')';
    }

    public DumpDevicePayload(String sn, String hardwareModel, String version, String type) {
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(hardwareModel, "hardwareModel");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(type, "type");
        this.sn = sn;
        this.hardwareModel = hardwareModel;
        this.version = version;
        this.type = type;
    }

    public final String getSn() {
        return this.sn;
    }

    public final String getHardwareModel() {
        return this.hardwareModel;
    }

    public final String getVersion() {
        return this.version;
    }

    public final String getType() {
        return this.type;
    }
}
