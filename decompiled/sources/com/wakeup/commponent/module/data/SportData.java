package com.wakeup.commponent.module.data;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import com.umeng.analytics.AnalyticsConfig;
import com.wakeup.common.Constants;
import com.wakeup.common.burypoint.BuryPointPageId;
import com.wakeup.common.storage.UserDao;
import com.wakeup.common.utils.NumberUtils;
import com.wakeup.commponent.module.sport.LocationStatisticsEntity;
import com.wakeup.commponent.module.sport.SportAltitudeEntity;
import com.wakeup.commponent.module.sport.SportCourseEntity;
import com.wakeup.commponent.module.sport.SportHeartEntity;
import com.wakeup.commponent.module.sport.SportOtherEntity;
import com.wakeup.commponent.module.sport.SportPaceEntity;
import com.wakeup.commponent.module.sport.SportSpeedEntity;
import com.wakeup.commponent.module.sport.SportStepFrequencyEntity;
import com.wakeup.commponent.module.sport.SportTypeHelp;
import io.nats.client.support.ApiConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: SportData.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u008d\u00012\u00020\u0001:\u0002\u008d\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006JX\u0010\u007f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u000e2\u0007\u0010\u0080\u0001\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000e2\u0007\u0010\u0081\u0001\u001a\u00020\u00142\u0006\u00104\u001a\u00020\u000eJJ\u0010\u0082\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\u000e2\u0007\u0010\u0083\u0001\u001a\u00020\b2\u0006\u0010%\u001a\u0002082\u0007\u0010\u0084\u0001\u001a\u00020\u000e2\u0007\u0010\u0085\u0001\u001a\u00020bJQ\u0010\u0086\u0001\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0007\u0010\u0081\u0001\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e2\u0007\u0010\u0083\u0001\u001a\u00020\b2\u0006\u0010%\u001a\u00020&2\u0006\u0010+\u001a\u00020&2\u0006\u00104\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\u000eJ\t\u0010\u0087\u0001\u001a\u00020\u000eH\u0016J\u001c\u0010\u0088\u0001\u001a\u00030\u0089\u00012\u0007\u0010\u008a\u0001\u001a\u00020\u00052\u0007\u0010\u008b\u0001\u001a\u00020\u000eH\u0016J\t\u0010\u008c\u0001\u001a\u00020\u0014H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R\u001a\u0010\u001c\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\n\"\u0004\b\u001e\u0010\fR\u001a\u0010\u001f\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\u0012R\u001a\u0010\"\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012R\u001a\u0010%\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0010\"\u0004\b-\u0010\u0012R\u001a\u0010.\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010(\"\u0004\b0\u0010*R\u001a\u00101\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0010\"\u0004\b3\u0010\u0012R\u001a\u00104\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0010\"\u0004\b6\u0010\u0012R\u001a\u00107\u001a\u000208X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010=\u001a\u00020>X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR \u0010C\u001a\b\u0012\u0004\u0012\u00020E0DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR \u0010J\u001a\b\u0012\u0004\u0012\u00020K0DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010G\"\u0004\bM\u0010IR \u0010N\u001a\b\u0012\u0004\u0012\u00020O0DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010G\"\u0004\bQ\u0010IR \u0010R\u001a\b\u0012\u0004\u0012\u00020S0DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010G\"\u0004\bU\u0010IR \u0010V\u001a\b\u0012\u0004\u0012\u00020S0DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010G\"\u0004\bX\u0010IR \u0010Y\u001a\b\u0012\u0004\u0012\u00020Z0DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010G\"\u0004\b\\\u0010IR \u0010]\u001a\b\u0012\u0004\u0012\u00020^0DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010G\"\u0004\b`\u0010IR\u001a\u0010a\u001a\u00020bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u001a\u0010g\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010\u0010\"\u0004\bi\u0010\u0012R\u001a\u0010j\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010\u0010\"\u0004\bl\u0010\u0012R\u001a\u0010m\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010\u0010\"\u0004\bo\u0010\u0012R\u001a\u0010p\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010\u0010\"\u0004\br\u0010\u0012R\u001a\u0010s\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010\u0010\"\u0004\bu\u0010\u0012R\u001a\u0010v\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010\u0010\"\u0004\bx\u0010\u0012R\u001a\u0010y\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010\u0010\"\u0004\b{\u0010\u0012R\u001a\u0010|\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b}\u0010\n\"\u0004\b~\u0010\f¨\u0006\u008e\u0001"}, d2 = {"Lcom/wakeup/commponent/module/data/SportData;", "Landroid/os/Parcelable;", "<init>", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "id", "", "getId", "()J", "setId", "(J)V", "uid", "", "getUid", "()I", "setUid", "(I)V", "mac", "", "getMac", "()Ljava/lang/String;", "setMac", "(Ljava/lang/String;)V", "type", "getType", "setType", AnalyticsConfig.RTD_START_TIME, "getStartTime", "setStartTime", "duration", "getDuration", "setDuration", "step", "getStep", "setStep", Constants.BundleKey.KCAL, "", "getKcal", "()F", "setKcal", "(F)V", "distance", "getDistance", "setDistance", "speed", "getSpeed", "setSpeed", "pace", "getPace", "setPace", "heart", "getHeart", "setHeart", "currentAltitude", "", "getCurrentAltitude", "()D", "setCurrentAltitude", "(D)V", "otherEntity", "Lcom/wakeup/commponent/module/sport/SportOtherEntity;", "getOtherEntity", "()Lcom/wakeup/commponent/module/sport/SportOtherEntity;", "setOtherEntity", "(Lcom/wakeup/commponent/module/sport/SportOtherEntity;)V", "altitudeList", "", "Lcom/wakeup/commponent/module/sport/SportAltitudeEntity;", "getAltitudeList", "()Ljava/util/List;", "setAltitudeList", "(Ljava/util/List;)V", "heartRateList", "Lcom/wakeup/commponent/module/sport/SportHeartEntity;", "getHeartRateList", "setHeartRateList", "mLocationList", "Lcom/wakeup/commponent/module/sport/LocationStatisticsEntity;", "getMLocationList", "setMLocationList", "paceList", "Lcom/wakeup/commponent/module/sport/SportPaceEntity;", "getPaceList", "setPaceList", "milePaceList", "getMilePaceList", "setMilePaceList", "stepFrequencyList", "Lcom/wakeup/commponent/module/sport/SportStepFrequencyEntity;", "getStepFrequencyList", "setStepFrequencyList", "speedList", "Lcom/wakeup/commponent/module/sport/SportSpeedEntity;", "getSpeedList", "setSpeedList", "courseRecord", "Lcom/wakeup/commponent/module/sport/SportCourseEntity;", "getCourseRecord", "()Lcom/wakeup/commponent/module/sport/SportCourseEntity;", "setCourseRecord", "(Lcom/wakeup/commponent/module/sport/SportCourseEntity;)V", "gpsAccuracy", "getGpsAccuracy", "setGpsAccuracy", "kmDistance", "getKmDistance", "setKmDistance", "kmDuration", "getKmDuration", "setKmDuration", "mileDistance", "getMileDistance", "setMileDistance", "mileDuration", "getMileDuration", "setMileDuration", "syncState", "getSyncState", "setSyncState", "pauseDuration", "getPauseDuration", "setPauseDuration", "pauseTimeStamp", "getPauseTimeStamp", "setPauseTimeStamp", BuryPointPageId.PAGE_ID_PLAN_CREATE, "time", "deviceName", "createCourse", Constants.BundleKey.TIMESTAMP, "fromType", "courseEntity", "createCourseSport", "describeContents", "writeToParcel", "", ApiConstants.DEST, "flags", "toString", "CREATOR", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SportData implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private List<SportAltitudeEntity> altitudeList;
    private SportCourseEntity courseRecord;
    private double currentAltitude;
    private int distance;
    private int duration;
    private int gpsAccuracy;
    private int heart;
    private List<SportHeartEntity> heartRateList;
    private long id;
    private float kcal;
    private int kmDistance;
    private int kmDuration;
    private List<LocationStatisticsEntity> mLocationList;
    private String mac;
    private int mileDistance;
    private int mileDuration;
    private List<SportPaceEntity> milePaceList;
    private SportOtherEntity otherEntity;
    private int pace;
    private List<SportPaceEntity> paceList;
    private int pauseDuration;
    private long pauseTimeStamp;
    private float speed;
    private List<SportSpeedEntity> speedList;
    private long startTime;
    private int step;
    private List<SportStepFrequencyEntity> stepFrequencyList;
    private int syncState;
    private int type;
    private int uid;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final long getId() {
        return this.id;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final int getUid() {
        return this.uid;
    }

    public final void setUid(int i) {
        this.uid = i;
    }

    public final String getMac() {
        return this.mac;
    }

    public final void setMac(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mac = str;
    }

    public final int getType() {
        return this.type;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final int getStep() {
        return this.step;
    }

    public final void setStep(int i) {
        this.step = i;
    }

    public final float getKcal() {
        return this.kcal;
    }

    public final void setKcal(float f) {
        this.kcal = f;
    }

    public final int getDistance() {
        return this.distance;
    }

    public final void setDistance(int i) {
        this.distance = i;
    }

    public final float getSpeed() {
        return this.speed;
    }

    public final void setSpeed(float f) {
        this.speed = f;
    }

    public final int getPace() {
        return this.pace;
    }

    public final void setPace(int i) {
        this.pace = i;
    }

    public final int getHeart() {
        return this.heart;
    }

    public final void setHeart(int i) {
        this.heart = i;
    }

    public final double getCurrentAltitude() {
        return this.currentAltitude;
    }

    public final void setCurrentAltitude(double d) {
        this.currentAltitude = d;
    }

    public final SportOtherEntity getOtherEntity() {
        return this.otherEntity;
    }

    public final void setOtherEntity(SportOtherEntity sportOtherEntity) {
        Intrinsics.checkNotNullParameter(sportOtherEntity, "<set-?>");
        this.otherEntity = sportOtherEntity;
    }

    public final List<SportAltitudeEntity> getAltitudeList() {
        return this.altitudeList;
    }

    public final void setAltitudeList(List<SportAltitudeEntity> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.altitudeList = list;
    }

    public final List<SportHeartEntity> getHeartRateList() {
        return this.heartRateList;
    }

    public final void setHeartRateList(List<SportHeartEntity> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.heartRateList = list;
    }

    public final List<LocationStatisticsEntity> getMLocationList() {
        return this.mLocationList;
    }

    public final void setMLocationList(List<LocationStatisticsEntity> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mLocationList = list;
    }

    public final List<SportPaceEntity> getPaceList() {
        return this.paceList;
    }

    public final void setPaceList(List<SportPaceEntity> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.paceList = list;
    }

    public final List<SportPaceEntity> getMilePaceList() {
        return this.milePaceList;
    }

    public final void setMilePaceList(List<SportPaceEntity> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.milePaceList = list;
    }

    public final List<SportStepFrequencyEntity> getStepFrequencyList() {
        return this.stepFrequencyList;
    }

    public final void setStepFrequencyList(List<SportStepFrequencyEntity> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.stepFrequencyList = list;
    }

    public final List<SportSpeedEntity> getSpeedList() {
        return this.speedList;
    }

    public final void setSpeedList(List<SportSpeedEntity> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.speedList = list;
    }

    public final SportCourseEntity getCourseRecord() {
        return this.courseRecord;
    }

    public final void setCourseRecord(SportCourseEntity sportCourseEntity) {
        Intrinsics.checkNotNullParameter(sportCourseEntity, "<set-?>");
        this.courseRecord = sportCourseEntity;
    }

    public final int getGpsAccuracy() {
        return this.gpsAccuracy;
    }

    public final void setGpsAccuracy(int i) {
        this.gpsAccuracy = i;
    }

    public final int getKmDistance() {
        return this.kmDistance;
    }

    public final void setKmDistance(int i) {
        this.kmDistance = i;
    }

    public final int getKmDuration() {
        return this.kmDuration;
    }

    public final void setKmDuration(int i) {
        this.kmDuration = i;
    }

    public final int getMileDistance() {
        return this.mileDistance;
    }

    public final void setMileDistance(int i) {
        this.mileDistance = i;
    }

    public final int getMileDuration() {
        return this.mileDuration;
    }

    public final void setMileDuration(int i) {
        this.mileDuration = i;
    }

    public final int getSyncState() {
        return this.syncState;
    }

    public final void setSyncState(int i) {
        this.syncState = i;
    }

    public final int getPauseDuration() {
        return this.pauseDuration;
    }

    public final void setPauseDuration(int i) {
        this.pauseDuration = i;
    }

    public final long getPauseTimeStamp() {
        return this.pauseTimeStamp;
    }

    public final void setPauseTimeStamp(long j) {
        this.pauseTimeStamp = j;
    }

    public SportData() {
        this.mac = "";
        this.otherEntity = new SportOtherEntity();
        this.altitudeList = new ArrayList();
        this.heartRateList = new ArrayList();
        this.mLocationList = new ArrayList();
        this.paceList = new ArrayList();
        this.milePaceList = new ArrayList();
        this.stepFrequencyList = new ArrayList();
        this.speedList = new ArrayList();
        this.courseRecord = new SportCourseEntity();
        this.gpsAccuracy = -1;
    }

    public final SportData create(int uid, String mac, int type, long time, int duration, int step, int kcal, int distance, String deviceName, int heart) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        SportData sportData = new SportData();
        sportData.uid = uid;
        sportData.mac = mac;
        sportData.type = type;
        sportData.startTime = time;
        sportData.duration = duration;
        sportData.step = step < 0 ? 0 : step;
        sportData.kcal = kcal < 0 ? 0.0f : kcal;
        sportData.distance = distance < 0 ? 0 : distance;
        sportData.otherEntity.setName(deviceName);
        sportData.otherEntity.setSourceType(2);
        sportData.otherEntity.setAverageCadence(duration > 0 ? (int) (step / (duration / 60.0f)) : 0);
        float f = distance;
        float f2 = duration;
        sportData.otherEntity.setAverageSpeed(NumberUtils.formatNumber((f * 1.0f) / f2, 2));
        sportData.otherEntity.setAveragePace(distance > 0 ? (int) ((f2 * 1.0f) / (f / 1000.0f)) : 0);
        sportData.otherEntity.setAverageHeartRate(heart);
        return sportData;
    }

    public final SportData createCourse(int uid, int type, int duration, int heart, long timeStamp, double kcal, int fromType, SportCourseEntity courseEntity) {
        Intrinsics.checkNotNullParameter(courseEntity, "courseEntity");
        SportData sportData = new SportData();
        sportData.uid = uid;
        sportData.mac = HealthData.TYPE_PHONE;
        sportData.type = SportTypeHelp.INSTANCE.getCourseTypeToSportCourseId(type);
        sportData.startTime = timeStamp;
        sportData.kcal = (float) kcal;
        sportData.duration = duration;
        sportData.otherEntity.setSourceType(fromType);
        sportData.otherEntity.setName(HealthData.TYPE_PHONE);
        sportData.otherEntity.setAverageHeartRate(heart);
        sportData.courseRecord = courseEntity;
        return sportData;
    }

    public final SportData createCourseSport(String mac, String deviceName, int duration, int step, long timeStamp, float kcal, float distance, int heart, int pace) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        SportData sportData = new SportData();
        sportData.uid = UserDao.getUser().getUid();
        sportData.mac = mac;
        sportData.type = 16;
        sportData.startTime = timeStamp;
        if (kcal < 0.0f) {
            kcal = 0.0f;
        }
        sportData.kcal = kcal;
        sportData.distance = distance < 0.0f ? 0 : (int) distance;
        sportData.duration = duration;
        if (step < 0) {
            step = 0;
        }
        sportData.step = step;
        sportData.otherEntity.setAverageHeartRate(heart);
        sportData.otherEntity.setSourceType(2);
        if (pace < 0) {
            pace = 0;
        }
        sportData.pace = pace;
        sportData.otherEntity.setName(deviceName);
        return sportData;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.id);
        dest.writeInt(this.uid);
        dest.writeString(this.mac);
        dest.writeInt(this.type);
        dest.writeLong(this.startTime);
        dest.writeInt(this.duration);
        dest.writeInt(this.step);
        dest.writeFloat(this.kcal);
        dest.writeInt(this.distance);
        dest.writeFloat(this.speed);
        dest.writeInt(this.pace);
        dest.writeInt(this.heart);
        dest.writeDouble(this.currentAltitude);
        dest.writeParcelable(this.otherEntity, flags);
        dest.writeTypedList(this.altitudeList);
        dest.writeTypedList(this.heartRateList);
        dest.writeTypedList(this.mLocationList);
        dest.writeTypedList(this.paceList);
        dest.writeTypedList(this.milePaceList);
        dest.writeTypedList(this.stepFrequencyList);
        dest.writeTypedList(this.speedList);
        dest.writeParcelable(this.courseRecord, flags);
        dest.writeInt(this.gpsAccuracy);
        dest.writeInt(this.kmDistance);
        dest.writeInt(this.kmDuration);
        dest.writeInt(this.mileDistance);
        dest.writeInt(this.mileDuration);
        dest.writeInt(this.syncState);
        dest.writeInt(this.pauseDuration);
        dest.writeLong(this.pauseTimeStamp);
    }

    public String toString() {
        return "SportData(id=" + this.id + ", uid=" + this.uid + ", mac='" + this.mac + "', type=" + this.type + ", startTime=" + this.startTime + ", duration=" + this.duration + ", step=" + this.step + ", kcal=" + this.kcal + ", distance=" + this.distance + ", speed=" + this.speed + ", pace=" + this.pace + ", heart=" + this.heart + ", currentAltitude=" + this.currentAltitude + ", otherEntity=" + this.otherEntity + ", altitudeList=" + this.altitudeList + ", heartRateList=" + this.heartRateList + ", mLocationList=" + this.mLocationList + ", paceList=" + this.paceList + ", milePaceList=" + this.milePaceList + ", stepFrequencyList=" + this.stepFrequencyList + ", speedList=" + this.speedList + ", courseRecord=" + this.courseRecord + ", gpsAccuracy=" + this.gpsAccuracy + ", kmDistance=" + this.kmDistance + ", kmDuration=" + this.kmDuration + ", mileDistance=" + this.mileDistance + ", mileDuration=" + this.mileDuration + ", syncState=" + this.syncState + Separators.RPAREN;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SportData(Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.id = parcel.readLong();
        this.uid = parcel.readInt();
        String readString = parcel.readString();
        this.mac = readString == null ? "" : readString;
        this.type = parcel.readInt();
        this.startTime = parcel.readLong();
        this.duration = parcel.readInt();
        this.step = parcel.readInt();
        this.kcal = parcel.readFloat();
        this.distance = parcel.readInt();
        this.speed = parcel.readFloat();
        this.pace = parcel.readInt();
        this.heart = parcel.readInt();
        this.currentAltitude = parcel.readDouble();
        Parcelable readParcelable = parcel.readParcelable(new PropertyReference1Impl() { // from class: com.wakeup.commponent.module.data.SportData.1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return obj.getClass();
            }
        }.getClass().getClassLoader());
        Intrinsics.checkNotNull(readParcelable);
        this.otherEntity = (SportOtherEntity) readParcelable;
        ArrayList createTypedArrayList = parcel.createTypedArrayList(SportAltitudeEntity.CREATOR);
        Intrinsics.checkNotNull(createTypedArrayList);
        this.altitudeList = createTypedArrayList;
        ArrayList createTypedArrayList2 = parcel.createTypedArrayList(SportHeartEntity.CREATOR);
        Intrinsics.checkNotNull(createTypedArrayList2);
        this.heartRateList = createTypedArrayList2;
        ArrayList createTypedArrayList3 = parcel.createTypedArrayList(LocationStatisticsEntity.CREATOR);
        Intrinsics.checkNotNull(createTypedArrayList3);
        this.mLocationList = createTypedArrayList3;
        ArrayList createTypedArrayList4 = parcel.createTypedArrayList(SportPaceEntity.CREATOR);
        Intrinsics.checkNotNull(createTypedArrayList4);
        this.paceList = createTypedArrayList4;
        ArrayList createTypedArrayList5 = parcel.createTypedArrayList(SportPaceEntity.CREATOR);
        Intrinsics.checkNotNull(createTypedArrayList5);
        this.milePaceList = createTypedArrayList5;
        ArrayList createTypedArrayList6 = parcel.createTypedArrayList(SportStepFrequencyEntity.CREATOR);
        Intrinsics.checkNotNull(createTypedArrayList6);
        this.stepFrequencyList = createTypedArrayList6;
        ArrayList createTypedArrayList7 = parcel.createTypedArrayList(SportSpeedEntity.CREATOR);
        Intrinsics.checkNotNull(createTypedArrayList7);
        this.speedList = createTypedArrayList7;
        Parcelable readParcelable2 = parcel.readParcelable(new PropertyReference1Impl() { // from class: com.wakeup.commponent.module.data.SportData.2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return obj.getClass();
            }
        }.getClass().getClassLoader());
        Intrinsics.checkNotNull(readParcelable2);
        this.courseRecord = (SportCourseEntity) readParcelable2;
        this.gpsAccuracy = parcel.readInt();
        this.kmDistance = parcel.readInt();
        this.kmDuration = parcel.readInt();
        this.mileDistance = parcel.readInt();
        this.mileDuration = parcel.readInt();
        this.syncState = parcel.readInt();
        this.pauseDuration = parcel.readInt();
        this.pauseTimeStamp = parcel.readLong();
    }

    /* compiled from: SportData.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/wakeup/commponent/module/data/SportData$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/wakeup/commponent/module/data/SportData;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/wakeup/commponent/module/data/SportData;", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.wakeup.commponent.module.data.SportData$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<SportData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SportData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SportData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SportData[] newArray(int size) {
            return new SportData[size];
        }
    }
}
