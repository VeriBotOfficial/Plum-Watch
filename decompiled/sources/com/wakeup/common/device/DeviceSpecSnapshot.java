package com.wakeup.common.device;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceSpecLog.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\"\u001a\u00020\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0010HÆ\u0003J\u008b\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u00101\u001a\u00020\u00102\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00066"}, d2 = {"Lcom/wakeup/common/device/DeviceSpecSnapshot;", "", "phoneName", "", "brandModel", "ramTotal", "ramAvail", "romAvail", "romTotal", "cpuArch", "cpuBit", "allAbis", "osVersion", "tierLabel", "totalMemGb", "lowRam", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getPhoneName", "()Ljava/lang/String;", "getBrandModel", "getRamTotal", "getRamAvail", "getRomAvail", "getRomTotal", "getCpuArch", "getCpuBit", "getAllAbis", "getOsVersion", "getTierLabel", "getTotalMemGb", "getLowRam", "()Z", "toLogLine", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DeviceSpecSnapshot {
    private final String allAbis;
    private final String brandModel;
    private final String cpuArch;
    private final String cpuBit;
    private final boolean lowRam;
    private final String osVersion;
    private final String phoneName;
    private final String ramAvail;
    private final String ramTotal;
    private final String romAvail;
    private final String romTotal;
    private final String tierLabel;
    private final String totalMemGb;

    public static /* synthetic */ DeviceSpecSnapshot copy$default(DeviceSpecSnapshot deviceSpecSnapshot, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceSpecSnapshot.phoneName;
        }
        return deviceSpecSnapshot.copy(str, (i & 2) != 0 ? deviceSpecSnapshot.brandModel : str2, (i & 4) != 0 ? deviceSpecSnapshot.ramTotal : str3, (i & 8) != 0 ? deviceSpecSnapshot.ramAvail : str4, (i & 16) != 0 ? deviceSpecSnapshot.romAvail : str5, (i & 32) != 0 ? deviceSpecSnapshot.romTotal : str6, (i & 64) != 0 ? deviceSpecSnapshot.cpuArch : str7, (i & 128) != 0 ? deviceSpecSnapshot.cpuBit : str8, (i & 256) != 0 ? deviceSpecSnapshot.allAbis : str9, (i & 512) != 0 ? deviceSpecSnapshot.osVersion : str10, (i & 1024) != 0 ? deviceSpecSnapshot.tierLabel : str11, (i & 2048) != 0 ? deviceSpecSnapshot.totalMemGb : str12, (i & 4096) != 0 ? deviceSpecSnapshot.lowRam : z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPhoneName() {
        return this.phoneName;
    }

    /* renamed from: component10, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    /* renamed from: component11, reason: from getter */
    public final String getTierLabel() {
        return this.tierLabel;
    }

    /* renamed from: component12, reason: from getter */
    public final String getTotalMemGb() {
        return this.totalMemGb;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getLowRam() {
        return this.lowRam;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBrandModel() {
        return this.brandModel;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRamTotal() {
        return this.ramTotal;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRamAvail() {
        return this.ramAvail;
    }

    /* renamed from: component5, reason: from getter */
    public final String getRomAvail() {
        return this.romAvail;
    }

    /* renamed from: component6, reason: from getter */
    public final String getRomTotal() {
        return this.romTotal;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCpuArch() {
        return this.cpuArch;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCpuBit() {
        return this.cpuBit;
    }

    /* renamed from: component9, reason: from getter */
    public final String getAllAbis() {
        return this.allAbis;
    }

    public final DeviceSpecSnapshot copy(String phoneName, String brandModel, String ramTotal, String ramAvail, String romAvail, String romTotal, String cpuArch, String cpuBit, String allAbis, String osVersion, String tierLabel, String totalMemGb, boolean lowRam) {
        Intrinsics.checkNotNullParameter(phoneName, "phoneName");
        Intrinsics.checkNotNullParameter(brandModel, "brandModel");
        Intrinsics.checkNotNullParameter(ramTotal, "ramTotal");
        Intrinsics.checkNotNullParameter(ramAvail, "ramAvail");
        Intrinsics.checkNotNullParameter(romAvail, "romAvail");
        Intrinsics.checkNotNullParameter(romTotal, "romTotal");
        Intrinsics.checkNotNullParameter(cpuArch, "cpuArch");
        Intrinsics.checkNotNullParameter(cpuBit, "cpuBit");
        Intrinsics.checkNotNullParameter(allAbis, "allAbis");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(tierLabel, "tierLabel");
        Intrinsics.checkNotNullParameter(totalMemGb, "totalMemGb");
        return new DeviceSpecSnapshot(phoneName, brandModel, ramTotal, ramAvail, romAvail, romTotal, cpuArch, cpuBit, allAbis, osVersion, tierLabel, totalMemGb, lowRam);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceSpecSnapshot)) {
            return false;
        }
        DeviceSpecSnapshot deviceSpecSnapshot = (DeviceSpecSnapshot) other;
        return Intrinsics.areEqual(this.phoneName, deviceSpecSnapshot.phoneName) && Intrinsics.areEqual(this.brandModel, deviceSpecSnapshot.brandModel) && Intrinsics.areEqual(this.ramTotal, deviceSpecSnapshot.ramTotal) && Intrinsics.areEqual(this.ramAvail, deviceSpecSnapshot.ramAvail) && Intrinsics.areEqual(this.romAvail, deviceSpecSnapshot.romAvail) && Intrinsics.areEqual(this.romTotal, deviceSpecSnapshot.romTotal) && Intrinsics.areEqual(this.cpuArch, deviceSpecSnapshot.cpuArch) && Intrinsics.areEqual(this.cpuBit, deviceSpecSnapshot.cpuBit) && Intrinsics.areEqual(this.allAbis, deviceSpecSnapshot.allAbis) && Intrinsics.areEqual(this.osVersion, deviceSpecSnapshot.osVersion) && Intrinsics.areEqual(this.tierLabel, deviceSpecSnapshot.tierLabel) && Intrinsics.areEqual(this.totalMemGb, deviceSpecSnapshot.totalMemGb) && this.lowRam == deviceSpecSnapshot.lowRam;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.phoneName.hashCode() * 31) + this.brandModel.hashCode()) * 31) + this.ramTotal.hashCode()) * 31) + this.ramAvail.hashCode()) * 31) + this.romAvail.hashCode()) * 31) + this.romTotal.hashCode()) * 31) + this.cpuArch.hashCode()) * 31) + this.cpuBit.hashCode()) * 31) + this.allAbis.hashCode()) * 31) + this.osVersion.hashCode()) * 31) + this.tierLabel.hashCode()) * 31) + this.totalMemGb.hashCode()) * 31) + Boolean.hashCode(this.lowRam);
    }

    public String toString() {
        return "DeviceSpecSnapshot(phoneName=" + this.phoneName + ", brandModel=" + this.brandModel + ", ramTotal=" + this.ramTotal + ", ramAvail=" + this.ramAvail + ", romAvail=" + this.romAvail + ", romTotal=" + this.romTotal + ", cpuArch=" + this.cpuArch + ", cpuBit=" + this.cpuBit + ", allAbis=" + this.allAbis + ", osVersion=" + this.osVersion + ", tierLabel=" + this.tierLabel + ", totalMemGb=" + this.totalMemGb + ", lowRam=" + this.lowRam + Separators.RPAREN;
    }

    public DeviceSpecSnapshot(String phoneName, String brandModel, String ramTotal, String ramAvail, String romAvail, String romTotal, String cpuArch, String cpuBit, String allAbis, String osVersion, String tierLabel, String totalMemGb, boolean z) {
        Intrinsics.checkNotNullParameter(phoneName, "phoneName");
        Intrinsics.checkNotNullParameter(brandModel, "brandModel");
        Intrinsics.checkNotNullParameter(ramTotal, "ramTotal");
        Intrinsics.checkNotNullParameter(ramAvail, "ramAvail");
        Intrinsics.checkNotNullParameter(romAvail, "romAvail");
        Intrinsics.checkNotNullParameter(romTotal, "romTotal");
        Intrinsics.checkNotNullParameter(cpuArch, "cpuArch");
        Intrinsics.checkNotNullParameter(cpuBit, "cpuBit");
        Intrinsics.checkNotNullParameter(allAbis, "allAbis");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(tierLabel, "tierLabel");
        Intrinsics.checkNotNullParameter(totalMemGb, "totalMemGb");
        this.phoneName = phoneName;
        this.brandModel = brandModel;
        this.ramTotal = ramTotal;
        this.ramAvail = ramAvail;
        this.romAvail = romAvail;
        this.romTotal = romTotal;
        this.cpuArch = cpuArch;
        this.cpuBit = cpuBit;
        this.allAbis = allAbis;
        this.osVersion = osVersion;
        this.tierLabel = tierLabel;
        this.totalMemGb = totalMemGb;
        this.lowRam = z;
    }

    public final String getPhoneName() {
        return this.phoneName;
    }

    public final String getBrandModel() {
        return this.brandModel;
    }

    public final String getRamTotal() {
        return this.ramTotal;
    }

    public final String getRamAvail() {
        return this.ramAvail;
    }

    public final String getRomAvail() {
        return this.romAvail;
    }

    public final String getRomTotal() {
        return this.romTotal;
    }

    public final String getCpuArch() {
        return this.cpuArch;
    }

    public final String getCpuBit() {
        return this.cpuBit;
    }

    public final String getAllAbis() {
        return this.allAbis;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final String getTierLabel() {
        return this.tierLabel;
    }

    public final String getTotalMemGb() {
        return this.totalMemGb;
    }

    public final boolean getLowRam() {
        return this.lowRam;
    }

    public final String toLogLine() {
        return "phone=" + this.phoneName + " model=" + this.brandModel + " ram=" + this.ramTotal + "/" + this.ramAvail + " rom=" + this.romAvail + "/" + this.romTotal + " cpu=" + this.cpuArch + Separators.LPAREN + this.cpuBit + ") abis=" + this.allAbis + " os=" + this.osVersion + " tier=" + this.tierLabel + " totalMemGb=" + this.totalMemGb + " lowRam=" + this.lowRam;
    }
}
