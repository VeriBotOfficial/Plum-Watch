package com.wakeup.module.data.sync;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HealthUpLoadManager.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006!"}, d2 = {"Lcom/wakeup/module/data/sync/ManualSleepOss;", "", "timestamp", "", "mac", "", "isUpload", "", "dataType", "duration", "name", "<init>", "(JLjava/lang/String;IIILjava/lang/String;)V", "getTimestamp", "()J", "getMac", "()Ljava/lang/String;", "()I", "getDataType", "getDuration", "getName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* data */ class ManualSleepOss {
    private final int dataType;
    private final int duration;
    private final int isUpload;
    private final String mac;
    private final String name;
    private final long timestamp;

    public static /* synthetic */ ManualSleepOss copy$default(ManualSleepOss manualSleepOss, long j, String str, int i, int i2, int i3, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j = manualSleepOss.timestamp;
        }
        long j2 = j;
        if ((i4 & 2) != 0) {
            str = manualSleepOss.mac;
        }
        String str3 = str;
        if ((i4 & 4) != 0) {
            i = manualSleepOss.isUpload;
        }
        int i5 = i;
        if ((i4 & 8) != 0) {
            i2 = manualSleepOss.dataType;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            i3 = manualSleepOss.duration;
        }
        int i7 = i3;
        if ((i4 & 32) != 0) {
            str2 = manualSleepOss.name;
        }
        return manualSleepOss.copy(j2, str3, i5, i6, i7, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMac() {
        return this.mac;
    }

    /* renamed from: component3, reason: from getter */
    public final int getIsUpload() {
        return this.isUpload;
    }

    /* renamed from: component4, reason: from getter */
    public final int getDataType() {
        return this.dataType;
    }

    /* renamed from: component5, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* renamed from: component6, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final ManualSleepOss copy(long timestamp, String mac, int isUpload, int dataType, int duration, String name) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(name, "name");
        return new ManualSleepOss(timestamp, mac, isUpload, dataType, duration, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManualSleepOss)) {
            return false;
        }
        ManualSleepOss manualSleepOss = (ManualSleepOss) other;
        return this.timestamp == manualSleepOss.timestamp && Intrinsics.areEqual(this.mac, manualSleepOss.mac) && this.isUpload == manualSleepOss.isUpload && this.dataType == manualSleepOss.dataType && this.duration == manualSleepOss.duration && Intrinsics.areEqual(this.name, manualSleepOss.name);
    }

    public int hashCode() {
        return (((((((((Long.hashCode(this.timestamp) * 31) + this.mac.hashCode()) * 31) + Integer.hashCode(this.isUpload)) * 31) + Integer.hashCode(this.dataType)) * 31) + Integer.hashCode(this.duration)) * 31) + this.name.hashCode();
    }

    public String toString() {
        return "ManualSleepOss(timestamp=" + this.timestamp + ", mac=" + this.mac + ", isUpload=" + this.isUpload + ", dataType=" + this.dataType + ", duration=" + this.duration + ", name=" + this.name + Separators.RPAREN;
    }

    public ManualSleepOss(long j, String mac, int i, int i2, int i3, String name) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(name, "name");
        this.timestamp = j;
        this.mac = mac;
        this.isUpload = i;
        this.dataType = i2;
        this.duration = i3;
        this.name = name;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getMac() {
        return this.mac;
    }

    public final int isUpload() {
        return this.isUpload;
    }

    public final int getDataType() {
        return this.dataType;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final String getName() {
        return this.name;
    }
}
