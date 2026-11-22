package com.wakeup.module.device.work.his;

import android.gov.nist.core.Separators;
import com.hispark.crashdump.DumpDeviceInfo;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceHisCrashDumpMgr.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0017\u001a\u00020\u0018J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J`\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\bHÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0015\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0016\u0010\u0013¨\u0006'"}, d2 = {"Lcom/wakeup/module/device/work/his/HisDumpDeviceInfo;", "", "sn", "", "version", "hardwareModel", "chipModel", "rebootCause", "", "rebootCount", "exceptionRebootCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getSn", "()Ljava/lang/String;", MobileAdsBridge.versionMethodName, "getHardwareModel", "getChipModel", "getRebootCause", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRebootCount", "getExceptionRebootCount", "toSdkModel", "Lcom/hispark/crashdump/DumpDeviceInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/wakeup/module/device/work/his/HisDumpDeviceInfo;", "equals", "", "other", "hashCode", "toString", "module-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HisDumpDeviceInfo {
    private final String chipModel;
    private final Integer exceptionRebootCount;
    private final String hardwareModel;
    private final Integer rebootCause;
    private final Integer rebootCount;
    private final String sn;
    private final String version;

    public static /* synthetic */ HisDumpDeviceInfo copy$default(HisDumpDeviceInfo hisDumpDeviceInfo, String str, String str2, String str3, String str4, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hisDumpDeviceInfo.sn;
        }
        if ((i & 2) != 0) {
            str2 = hisDumpDeviceInfo.version;
        }
        if ((i & 4) != 0) {
            str3 = hisDumpDeviceInfo.hardwareModel;
        }
        if ((i & 8) != 0) {
            str4 = hisDumpDeviceInfo.chipModel;
        }
        if ((i & 16) != 0) {
            num = hisDumpDeviceInfo.rebootCause;
        }
        if ((i & 32) != 0) {
            num2 = hisDumpDeviceInfo.rebootCount;
        }
        if ((i & 64) != 0) {
            num3 = hisDumpDeviceInfo.exceptionRebootCount;
        }
        Integer num4 = num2;
        Integer num5 = num3;
        Integer num6 = num;
        String str5 = str3;
        return hisDumpDeviceInfo.copy(str, str2, str5, str4, num6, num4, num5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    /* renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* renamed from: component3, reason: from getter */
    public final String getHardwareModel() {
        return this.hardwareModel;
    }

    /* renamed from: component4, reason: from getter */
    public final String getChipModel() {
        return this.chipModel;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getRebootCause() {
        return this.rebootCause;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getRebootCount() {
        return this.rebootCount;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getExceptionRebootCount() {
        return this.exceptionRebootCount;
    }

    public final HisDumpDeviceInfo copy(String sn, String version, String hardwareModel, String chipModel, Integer rebootCause, Integer rebootCount, Integer exceptionRebootCount) {
        Intrinsics.checkNotNullParameter(sn, "sn");
        return new HisDumpDeviceInfo(sn, version, hardwareModel, chipModel, rebootCause, rebootCount, exceptionRebootCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HisDumpDeviceInfo)) {
            return false;
        }
        HisDumpDeviceInfo hisDumpDeviceInfo = (HisDumpDeviceInfo) other;
        return Intrinsics.areEqual(this.sn, hisDumpDeviceInfo.sn) && Intrinsics.areEqual(this.version, hisDumpDeviceInfo.version) && Intrinsics.areEqual(this.hardwareModel, hisDumpDeviceInfo.hardwareModel) && Intrinsics.areEqual(this.chipModel, hisDumpDeviceInfo.chipModel) && Intrinsics.areEqual(this.rebootCause, hisDumpDeviceInfo.rebootCause) && Intrinsics.areEqual(this.rebootCount, hisDumpDeviceInfo.rebootCount) && Intrinsics.areEqual(this.exceptionRebootCount, hisDumpDeviceInfo.exceptionRebootCount);
    }

    public int hashCode() {
        int hashCode = this.sn.hashCode() * 31;
        String str = this.version;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.hardwareModel;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.chipModel;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.rebootCause;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.rebootCount;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.exceptionRebootCount;
        return hashCode6 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        return "HisDumpDeviceInfo(sn=" + this.sn + ", version=" + this.version + ", hardwareModel=" + this.hardwareModel + ", chipModel=" + this.chipModel + ", rebootCause=" + this.rebootCause + ", rebootCount=" + this.rebootCount + ", exceptionRebootCount=" + this.exceptionRebootCount + Separators.RPAREN;
    }

    public HisDumpDeviceInfo(String sn, String str, String str2, String str3, Integer num, Integer num2, Integer num3) {
        Intrinsics.checkNotNullParameter(sn, "sn");
        this.sn = sn;
        this.version = str;
        this.hardwareModel = str2;
        this.chipModel = str3;
        this.rebootCause = num;
        this.rebootCount = num2;
        this.exceptionRebootCount = num3;
    }

    public /* synthetic */ HisDumpDeviceInfo(String str, String str2, String str3, String str4, Integer num, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : num3);
    }

    public final String getSn() {
        return this.sn;
    }

    public final String getVersion() {
        return this.version;
    }

    public final String getHardwareModel() {
        return this.hardwareModel;
    }

    public final String getChipModel() {
        return this.chipModel;
    }

    public final Integer getRebootCause() {
        return this.rebootCause;
    }

    public final Integer getRebootCount() {
        return this.rebootCount;
    }

    public final Integer getExceptionRebootCount() {
        return this.exceptionRebootCount;
    }

    public final DumpDeviceInfo toSdkModel() {
        String str = this.sn;
        String str2 = this.version;
        Intrinsics.checkNotNull(str2);
        String str3 = this.hardwareModel;
        Intrinsics.checkNotNull(str3);
        return new DumpDeviceInfo(str, str2, str3, this.chipModel, this.rebootCause, this.rebootCount, this.exceptionRebootCount);
    }
}
