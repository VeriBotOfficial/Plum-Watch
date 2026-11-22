package com.wakeup.commponent.module.sport;

import android.os.Parcel;
import android.os.Parcelable;
import com.wakeup.common.Constants;
import io.nats.client.support.ApiConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: SportCacheData.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 H2\u00020\u0001:\u0001HB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\b\u0010C\u001a\u00020\bH\u0016J\u0018\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\u00052\u0006\u0010G\u001a\u00020\bH\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001a\u0010\u0010\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001a\u0010\u0013\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\fR\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\n\"\u0004\b!\u0010\fR\u001a\u0010\"\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\n\"\u0004\b$\u0010\fR\u001a\u0010%\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R\u001a\u0010.\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010(\"\u0004\b0\u0010*R\u001a\u00101\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\n\"\u0004\b3\u0010\fR\u001c\u00104\u001a\u0004\u0018\u000105X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001c\u0010:\u001a\u0004\u0018\u000105X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u00107\"\u0004\b<\u00109R\u001a\u0010=\u001a\u00020>X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006I"}, d2 = {"Lcom/wakeup/commponent/module/sport/SportCacheData;", "Landroid/os/Parcelable;", "<init>", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "type", "", "getType", "()I", "setType", "(I)V", "duration", "getDuration", "setDuration", "distance", "getDistance", "setDistance", "pace", "getPace", "setPace", "speed", "", "getSpeed", "()F", "setSpeed", "(F)V", Constants.BundleKey.KCAL, "getKcal", "setKcal", "step", "getStep", "setStep", "heart", "getHeart", "setHeart", "climb", "", "getClimb", "()D", "setClimb", "(D)V", "decline", "getDecline", "setDecline", "altitude", "getAltitude", "setAltitude", "gpsAccuracy", "getGpsAccuracy", "setGpsAccuracy", "paceData", "Lcom/wakeup/commponent/module/sport/SportPaceEntity;", "getPaceData", "()Lcom/wakeup/commponent/module/sport/SportPaceEntity;", "setPaceData", "(Lcom/wakeup/commponent/module/sport/SportPaceEntity;)V", "milePaceData", "getMilePaceData", "setMilePaceData", "courseRecord", "Lcom/wakeup/commponent/module/sport/SportCourseEntity;", "getCourseRecord", "()Lcom/wakeup/commponent/module/sport/SportCourseEntity;", "setCourseRecord", "(Lcom/wakeup/commponent/module/sport/SportCourseEntity;)V", "describeContents", "writeToParcel", "", ApiConstants.DEST, "flags", "CREATOR", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SportCacheData implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private double altitude;
    private double climb;
    private SportCourseEntity courseRecord;
    private double decline;
    private int distance;
    private int duration;
    private int gpsAccuracy;
    private int heart;
    private float kcal;
    private SportPaceEntity milePaceData;
    private int pace;
    private SportPaceEntity paceData;
    private float speed;
    private int step;
    private int type;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getType() {
        return this.type;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final int getDistance() {
        return this.distance;
    }

    public final void setDistance(int i) {
        this.distance = i;
    }

    public final int getPace() {
        return this.pace;
    }

    public final void setPace(int i) {
        this.pace = i;
    }

    public final float getSpeed() {
        return this.speed;
    }

    public final void setSpeed(float f) {
        this.speed = f;
    }

    public final float getKcal() {
        return this.kcal;
    }

    public final void setKcal(float f) {
        this.kcal = f;
    }

    public final int getStep() {
        return this.step;
    }

    public final void setStep(int i) {
        this.step = i;
    }

    public final int getHeart() {
        return this.heart;
    }

    public final void setHeart(int i) {
        this.heart = i;
    }

    public final double getClimb() {
        return this.climb;
    }

    public final void setClimb(double d) {
        this.climb = d;
    }

    public final double getDecline() {
        return this.decline;
    }

    public final void setDecline(double d) {
        this.decline = d;
    }

    public final double getAltitude() {
        return this.altitude;
    }

    public final void setAltitude(double d) {
        this.altitude = d;
    }

    public final int getGpsAccuracy() {
        return this.gpsAccuracy;
    }

    public final void setGpsAccuracy(int i) {
        this.gpsAccuracy = i;
    }

    public final SportPaceEntity getPaceData() {
        return this.paceData;
    }

    public final void setPaceData(SportPaceEntity sportPaceEntity) {
        this.paceData = sportPaceEntity;
    }

    public final SportPaceEntity getMilePaceData() {
        return this.milePaceData;
    }

    public final void setMilePaceData(SportPaceEntity sportPaceEntity) {
        this.milePaceData = sportPaceEntity;
    }

    public final SportCourseEntity getCourseRecord() {
        return this.courseRecord;
    }

    public final void setCourseRecord(SportCourseEntity sportCourseEntity) {
        Intrinsics.checkNotNullParameter(sportCourseEntity, "<set-?>");
        this.courseRecord = sportCourseEntity;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.type);
        dest.writeInt(this.duration);
        dest.writeInt(this.distance);
        dest.writeInt(this.pace);
        dest.writeFloat(this.speed);
        dest.writeFloat(this.kcal);
        dest.writeInt(this.step);
        dest.writeInt(this.heart);
        dest.writeDouble(this.climb);
        dest.writeDouble(this.decline);
        dest.writeDouble(this.altitude);
        dest.writeInt(this.gpsAccuracy);
        dest.writeParcelable(this.paceData, flags);
        dest.writeParcelable(this.milePaceData, flags);
        dest.writeParcelable(this.courseRecord, flags);
    }

    public SportCacheData() {
        this.courseRecord = new SportCourseEntity();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SportCacheData(Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.type = parcel.readInt();
        this.duration = parcel.readInt();
        this.distance = parcel.readInt();
        this.pace = parcel.readInt();
        this.speed = parcel.readFloat();
        this.kcal = parcel.readFloat();
        this.step = parcel.readInt();
        this.heart = parcel.readInt();
        this.climb = parcel.readDouble();
        this.decline = parcel.readDouble();
        this.altitude = parcel.readDouble();
        this.gpsAccuracy = parcel.readInt();
        this.paceData = (SportPaceEntity) parcel.readParcelable(new PropertyReference1Impl() { // from class: com.wakeup.commponent.module.sport.SportCacheData.1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return obj.getClass();
            }
        }.getClass().getClassLoader());
        this.milePaceData = (SportPaceEntity) parcel.readParcelable(new PropertyReference1Impl() { // from class: com.wakeup.commponent.module.sport.SportCacheData.2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return obj.getClass();
            }
        }.getClass().getClassLoader());
        Parcelable readParcelable = parcel.readParcelable(new PropertyReference1Impl() { // from class: com.wakeup.commponent.module.sport.SportCacheData.3
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return obj.getClass();
            }
        }.getClass().getClassLoader());
        Intrinsics.checkNotNull(readParcelable);
        this.courseRecord = (SportCourseEntity) readParcelable;
    }

    /* compiled from: SportCacheData.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/wakeup/commponent/module/sport/SportCacheData$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/wakeup/commponent/module/sport/SportCacheData;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/wakeup/commponent/module/sport/SportCacheData;", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.wakeup.commponent.module.sport.SportCacheData$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<SportCacheData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SportCacheData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SportCacheData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SportCacheData[] newArray(int size) {
            return new SportCacheData[size];
        }
    }
}
