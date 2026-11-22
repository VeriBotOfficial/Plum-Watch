package com.wakeup.module.device.work.dataSync.gps;

import android.gov.nist.core.Separators;
import com.umeng.analytics.AnalyticsConfig;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import com.wakeup.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceSportRecord.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u000bHÆ\u0003J\t\u0010*\u001a\u00020\u000bHÆ\u0003J\t\u0010+\u001a\u00020\u000bHÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u008b\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0003HÖ\u0001J\t\u00104\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014¨\u00065"}, d2 = {"Lcom/wakeup/module/device/work/dataSync/gps/SportRecord;", "", "sportType", "", AnalyticsConfig.RTD_START_TIME, "duration", "step", Constants.BundleKey.KCAL, "distance", "heartRate", "trailFileName", "", "paceFileName", "hrFileName", "segmentKmFileName", "segmentMileFileName", "version", "<init>", "(IIIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getSportType", "()I", "getStartTime", "getDuration", "getStep", "getKcal", "getDistance", "getHeartRate", "getTrailFileName", "()Ljava/lang/String;", "getPaceFileName", "getHrFileName", "getSegmentKmFileName", "getSegmentMileFileName", MobileAdsBridge.versionMethodName, "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "toString", "module-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SportRecord {
    private final int distance;
    private final int duration;
    private final int heartRate;
    private final String hrFileName;
    private final int kcal;
    private final String paceFileName;
    private final String segmentKmFileName;
    private final String segmentMileFileName;
    private final int sportType;
    private final int startTime;
    private final int step;
    private final String trailFileName;
    private final int version;

    public static /* synthetic */ SportRecord copy$default(SportRecord sportRecord, int i, int i2, int i3, int i4, int i5, int i6, int i7, String str, String str2, String str3, String str4, String str5, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i = sportRecord.sportType;
        }
        return sportRecord.copy(i, (i9 & 2) != 0 ? sportRecord.startTime : i2, (i9 & 4) != 0 ? sportRecord.duration : i3, (i9 & 8) != 0 ? sportRecord.step : i4, (i9 & 16) != 0 ? sportRecord.kcal : i5, (i9 & 32) != 0 ? sportRecord.distance : i6, (i9 & 64) != 0 ? sportRecord.heartRate : i7, (i9 & 128) != 0 ? sportRecord.trailFileName : str, (i9 & 256) != 0 ? sportRecord.paceFileName : str2, (i9 & 512) != 0 ? sportRecord.hrFileName : str3, (i9 & 1024) != 0 ? sportRecord.segmentKmFileName : str4, (i9 & 2048) != 0 ? sportRecord.segmentMileFileName : str5, (i9 & 4096) != 0 ? sportRecord.version : i8);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSportType() {
        return this.sportType;
    }

    /* renamed from: component10, reason: from getter */
    public final String getHrFileName() {
        return this.hrFileName;
    }

    /* renamed from: component11, reason: from getter */
    public final String getSegmentKmFileName() {
        return this.segmentKmFileName;
    }

    /* renamed from: component12, reason: from getter */
    public final String getSegmentMileFileName() {
        return this.segmentMileFileName;
    }

    /* renamed from: component13, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStartTime() {
        return this.startTime;
    }

    /* renamed from: component3, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* renamed from: component4, reason: from getter */
    public final int getStep() {
        return this.step;
    }

    /* renamed from: component5, reason: from getter */
    public final int getKcal() {
        return this.kcal;
    }

    /* renamed from: component6, reason: from getter */
    public final int getDistance() {
        return this.distance;
    }

    /* renamed from: component7, reason: from getter */
    public final int getHeartRate() {
        return this.heartRate;
    }

    /* renamed from: component8, reason: from getter */
    public final String getTrailFileName() {
        return this.trailFileName;
    }

    /* renamed from: component9, reason: from getter */
    public final String getPaceFileName() {
        return this.paceFileName;
    }

    public final SportRecord copy(int sportType, int startTime, int duration, int step, int kcal, int distance, int heartRate, String trailFileName, String paceFileName, String hrFileName, String segmentKmFileName, String segmentMileFileName, int version) {
        Intrinsics.checkNotNullParameter(trailFileName, "trailFileName");
        Intrinsics.checkNotNullParameter(paceFileName, "paceFileName");
        Intrinsics.checkNotNullParameter(hrFileName, "hrFileName");
        Intrinsics.checkNotNullParameter(segmentKmFileName, "segmentKmFileName");
        Intrinsics.checkNotNullParameter(segmentMileFileName, "segmentMileFileName");
        return new SportRecord(sportType, startTime, duration, step, kcal, distance, heartRate, trailFileName, paceFileName, hrFileName, segmentKmFileName, segmentMileFileName, version);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportRecord)) {
            return false;
        }
        SportRecord sportRecord = (SportRecord) other;
        return this.sportType == sportRecord.sportType && this.startTime == sportRecord.startTime && this.duration == sportRecord.duration && this.step == sportRecord.step && this.kcal == sportRecord.kcal && this.distance == sportRecord.distance && this.heartRate == sportRecord.heartRate && Intrinsics.areEqual(this.trailFileName, sportRecord.trailFileName) && Intrinsics.areEqual(this.paceFileName, sportRecord.paceFileName) && Intrinsics.areEqual(this.hrFileName, sportRecord.hrFileName) && Intrinsics.areEqual(this.segmentKmFileName, sportRecord.segmentKmFileName) && Intrinsics.areEqual(this.segmentMileFileName, sportRecord.segmentMileFileName) && this.version == sportRecord.version;
    }

    public int hashCode() {
        return (((((((((((((((((((((((Integer.hashCode(this.sportType) * 31) + Integer.hashCode(this.startTime)) * 31) + Integer.hashCode(this.duration)) * 31) + Integer.hashCode(this.step)) * 31) + Integer.hashCode(this.kcal)) * 31) + Integer.hashCode(this.distance)) * 31) + Integer.hashCode(this.heartRate)) * 31) + this.trailFileName.hashCode()) * 31) + this.paceFileName.hashCode()) * 31) + this.hrFileName.hashCode()) * 31) + this.segmentKmFileName.hashCode()) * 31) + this.segmentMileFileName.hashCode()) * 31) + Integer.hashCode(this.version);
    }

    public String toString() {
        return "SportRecord(sportType=" + this.sportType + ", startTime=" + this.startTime + ", duration=" + this.duration + ", step=" + this.step + ", kcal=" + this.kcal + ", distance=" + this.distance + ", heartRate=" + this.heartRate + ", trailFileName=" + this.trailFileName + ", paceFileName=" + this.paceFileName + ", hrFileName=" + this.hrFileName + ", segmentKmFileName=" + this.segmentKmFileName + ", segmentMileFileName=" + this.segmentMileFileName + ", version=" + this.version + Separators.RPAREN;
    }

    public SportRecord(int i, int i2, int i3, int i4, int i5, int i6, int i7, String trailFileName, String paceFileName, String hrFileName, String segmentKmFileName, String segmentMileFileName, int i8) {
        Intrinsics.checkNotNullParameter(trailFileName, "trailFileName");
        Intrinsics.checkNotNullParameter(paceFileName, "paceFileName");
        Intrinsics.checkNotNullParameter(hrFileName, "hrFileName");
        Intrinsics.checkNotNullParameter(segmentKmFileName, "segmentKmFileName");
        Intrinsics.checkNotNullParameter(segmentMileFileName, "segmentMileFileName");
        this.sportType = i;
        this.startTime = i2;
        this.duration = i3;
        this.step = i4;
        this.kcal = i5;
        this.distance = i6;
        this.heartRate = i7;
        this.trailFileName = trailFileName;
        this.paceFileName = paceFileName;
        this.hrFileName = hrFileName;
        this.segmentKmFileName = segmentKmFileName;
        this.segmentMileFileName = segmentMileFileName;
        this.version = i8;
    }

    public final int getSportType() {
        return this.sportType;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getStep() {
        return this.step;
    }

    public final int getKcal() {
        return this.kcal;
    }

    public final int getDistance() {
        return this.distance;
    }

    public final int getHeartRate() {
        return this.heartRate;
    }

    public final String getTrailFileName() {
        return this.trailFileName;
    }

    public final String getPaceFileName() {
        return this.paceFileName;
    }

    public final String getHrFileName() {
        return this.hrFileName;
    }

    public final String getSegmentKmFileName() {
        return this.segmentKmFileName;
    }

    public final String getSegmentMileFileName() {
        return this.segmentMileFileName;
    }

    public final int getVersion() {
        return this.version;
    }
}
