package com.wakeup.module.data.entity;

import com.wakeup.commponent.module.data.HealthData;
import com.wakeup.commponent.module.data.HealthItem;
import com.wakeup.module.data.sync.HealthDataDaoManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HealthOssUploadBean.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u000f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0013"}, d2 = {"Lcom/wakeup/module/data/entity/HealthOssUploadBean;", "", "<init>", "()V", "OssHealBaseBean", "Step", "Sleep", "SleepPoint", "Heart", "HeartPoint", "BloodPressure", "BloodOxygen", "BloodGlucose", "Immunity", "Temperature", "Fatigue", "Weight", "HeartWarning", "SleepApnea", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HealthOssUploadBean {

    /* compiled from: HealthOssUploadBean.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0016\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0006\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/wakeup/module/data/entity/HealthOssUploadBean$OssHealBaseBean;", "", "timestamp", "", "mac", "", "isUpload", "", "<init>", "(JLjava/lang/String;Ljava/lang/Integer;)V", "getTimestamp", "()J", "setTimestamp", "(J)V", "getMac", "()Ljava/lang/String;", "setMac", "(Ljava/lang/String;)V", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class OssHealBaseBean {
        private final Integer isUpload;
        private String mac;
        private long timestamp;

        public OssHealBaseBean(long j, String str, Integer num) {
            this.timestamp = j;
            this.mac = str;
            this.isUpload = num;
        }

        public final String getMac() {
            return this.mac;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: isUpload, reason: from getter */
        public final Integer getIsUpload() {
            return this.isUpload;
        }

        public final void setMac(String str) {
            this.mac = str;
        }

        public final void setTimestamp(long j) {
            this.timestamp = j;
        }
    }

    /* compiled from: HealthOssUploadBean.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b%\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u0018\u0010\t\"\u0004\b\u0019\u0010\u000bR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b!\u0010\t\"\u0004\b\"\u0010\u000bR\u001e\u0010#\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b$\u0010\t\"\u0004\b%\u0010\u000bR\u001e\u0010&\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b'\u0010\t\"\u0004\b(\u0010\u000bR\u001e\u0010)\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b*\u0010\t\"\u0004\b+\u0010\u000bR\u001e\u0010,\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b-\u0010\t\"\u0004\b.\u0010\u000bR\u001e\u0010/\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b/\u0010\t\"\u0004\b0\u0010\u000bR\u001e\u00101\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b2\u0010\t\"\u0004\b3\u0010\u000bR\u001e\u00104\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b5\u0010\t\"\u0004\b6\u0010\u000bR\u001e\u00107\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b8\u0010\t\"\u0004\b9\u0010\u000bR\u001e\u0010:\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b;\u0010\t\"\u0004\b<\u0010\u000bR\u001e\u0010=\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b>\u0010\t\"\u0004\b?\u0010\u000b¨\u0006@"}, d2 = {"Lcom/wakeup/module/data/entity/HealthOssUploadBean$Step;", "Lcom/wakeup/module/data/entity/HealthOssUploadBean$OssHealBaseBean;", "model", "Lcom/wakeup/module/data/entity/HealthEntity;", "<init>", "(Lcom/wakeup/module/data/entity/HealthEntity;)V", "step", "", "getStep", "()Ljava/lang/Integer;", "setStep", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "stepAll", "getStepAll", "setStepAll", "kacl", "", "getKacl", "()Ljava/lang/Float;", "setKacl", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "type", "getType", "setType", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "runStrength", "getRunStrength", "setRunStrength", "walkStrength", "getWalkStrength", "setWalkStrength", "cycleStrength", "getCycleStrength", "setCycleStrength", "trainStrength", "getTrainStrength", "setTrainStrength", "totalStrength", "getTotalStrength", "setTotalStrength", "isActivityFinish", "setActivityFinish", "runKcal", "getRunKcal", "setRunKcal", "walkKcal", "getWalkKcal", "setWalkKcal", "cycleKcal", "getCycleKcal", "setCycleKcal", "trainKcal", "getTrainKcal", "setTrainKcal", "totalKcal", "getTotalKcal", "setTotalKcal", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Step extends OssHealBaseBean {
        private Integer cycleKcal;
        private Integer cycleStrength;
        private Integer isActivityFinish;
        private Float kacl;
        private String name;
        private Integer runKcal;
        private Integer runStrength;
        private Integer step;
        private Integer stepAll;
        private Integer totalKcal;
        private Integer totalStrength;
        private Integer trainKcal;
        private Integer trainStrength;
        private Integer type;
        private Integer walkKcal;
        private Integer walkStrength;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Step(HealthEntity model) {
            super(model.getTime(), Intrinsics.areEqual(model.getMac(), "phone") ? HealthData.TYPE_PHONE : model.getMac(), Integer.valueOf((model.getSyncState() & 2) == 2 ? 1 : 0));
            Intrinsics.checkNotNullParameter(model, "model");
            this.step = Integer.valueOf(HealthDataDaoManager.INSTANCE.getValue(model, HealthData.VALUE_STEP_INTERVAL));
            this.stepAll = Integer.valueOf(HealthDataDaoManager.INSTANCE.getValue(model, HealthData.VALUE_STEP_TOTAL));
            this.kacl = Float.valueOf((float) HealthDataDaoManager.INSTANCE.getValueF(model, HealthData.VALUE_STEP_KCAL));
            this.type = (Intrinsics.areEqual(model.getMac(), "phone") || Intrinsics.areEqual(model.getMac(), HealthData.TYPE_PHONE)) ? 1 : 0;
            this.name = HealthDataDaoManager.INSTANCE.getOtherValueString(model, "device_name");
            this.runStrength = Integer.valueOf(HealthDataDaoManager.INSTANCE.getValue(model, HealthData.VALUE_RUN_STRENGTH));
            this.walkStrength = Integer.valueOf(HealthDataDaoManager.INSTANCE.getValue(model, HealthData.VALUE_WALK_STRENGTH));
            this.cycleStrength = Integer.valueOf(HealthDataDaoManager.INSTANCE.getValue(model, HealthData.VALUE_CYCLE_STRENGTH));
            this.trainStrength = Integer.valueOf(HealthDataDaoManager.INSTANCE.getValue(model, HealthData.VALUE_TRAIN_STRENGTH));
            this.totalStrength = Integer.valueOf(HealthDataDaoManager.INSTANCE.getValue(model, HealthData.VALUE_TOTAL_STRENGTH));
            this.isActivityFinish = Integer.valueOf(HealthDataDaoManager.INSTANCE.getValue(model, HealthData.VALUE_IS_ACTIVITY_FINISH));
            this.runKcal = Integer.valueOf(HealthDataDaoManager.INSTANCE.getValue(model, HealthData.VALUE_RUN_KCAL));
            this.walkKcal = Integer.valueOf(HealthDataDaoManager.INSTANCE.getValue(model, HealthData.VALUE_WALK_KCAL));
            this.cycleKcal = Integer.valueOf(HealthDataDaoManager.INSTANCE.getValue(model, HealthData.VALUE_CYCLE_KCAL));
            this.trainKcal = Integer.valueOf(HealthDataDaoManager.INSTANCE.getValue(model, HealthData.VALUE_TRAIN_KCAL));
            this.totalKcal = Integer.valueOf(HealthDataDaoManager.INSTANCE.getValue(model, HealthData.VALUE_TOTAL_KCAL));
        }

        public final Integer getStep() {
            return this.step;
        }

        public final void setStep(Integer num) {
            this.step = num;
        }

        public final Integer getStepAll() {
            return this.stepAll;
        }

        public final void setStepAll(Integer num) {
            this.stepAll = num;
        }

        public final Float getKacl() {
            return this.kacl;
        }

        public final void setKacl(Float f) {
            this.kacl = f;
        }

        public final Integer getType() {
            return this.type;
        }

        public final void setType(Integer num) {
            this.type = num;
        }

        public final String getName() {
            return this.name;
        }

        public final void setName(String str) {
            this.name = str;
        }

        public final Integer getRunStrength() {
            return this.runStrength;
        }

        public final void setRunStrength(Integer num) {
            this.runStrength = num;
        }

        public final Integer getWalkStrength() {
            return this.walkStrength;
        }

        public final void setWalkStrength(Integer num) {
            this.walkStrength = num;
        }

        public final Integer getCycleStrength() {
            return this.cycleStrength;
        }

        public final void setCycleStrength(Integer num) {
            this.cycleStrength = num;
        }

        public final Integer getTrainStrength() {
            return this.trainStrength;
        }

        public final void setTrainStrength(Integer num) {
            this.trainStrength = num;
        }

        public final Integer getTotalStrength() {
            return this.totalStrength;
        }

        public final void setTotalStrength(Integer num) {
            this.totalStrength = num;
        }

        /* renamed from: isActivityFinish, reason: from getter */
        public final Integer getIsActivityFinish() {
            return this.isActivityFinish;
        }

        public final void setActivityFinish(Integer num) {
            this.isActivityFinish = num;
        }

        public final Integer getRunKcal() {
            return this.runKcal;
        }

        public final void setRunKcal(Integer num) {
            this.runKcal = num;
        }

        public final Integer getWalkKcal() {
            return this.walkKcal;
        }

        public final void setWalkKcal(Integer num) {
            this.walkKcal = num;
        }

        public final Integer getCycleKcal() {
            return this.cycleKcal;
        }

        public final void setCycleKcal(Integer num) {
            this.cycleKcal = num;
        }

        public final Integer getTrainKcal() {
            return this.trainKcal;
        }

        public final void setTrainKcal(Integer num) {
            this.trainKcal = num;
        }

        public final Integer getTotalKcal() {
            return this.totalKcal;
        }

        public final void setTotalKcal(Integer num) {
            this.totalKcal = num;
        }
    }

    /* compiled from: HealthOssUploadBean.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/wakeup/module/data/entity/HealthOssUploadBean$Sleep;", "Lcom/wakeup/module/data/entity/HealthOssUploadBean$OssHealBaseBean;", "model", "Lcom/wakeup/module/data/entity/HealthEntity;", "<init>", "(Lcom/wakeup/module/data/entity/HealthEntity;)V", "dataType", "", "getDataType", "()Ljava/lang/Integer;", "setDataType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "duration", "getDuration", "setDuration", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Sleep extends OssHealBaseBean {
        private Integer dataType;
        private Integer duration;
        private String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Sleep(HealthEntity model) {
            super(model.getTime(), model.getMac(), Integer.valueOf((model.getSyncState() & 2) == 2 ? 1 : 0));
            Intrinsics.checkNotNullParameter(model, "model");
            this.dataType = Integer.valueOf(HealthDataDaoManager.INSTANCE.getValue(model, HealthData.VALUE_SLEEP_TYPE));
            this.duration = Integer.valueOf(HealthDataDaoManager.INSTANCE.getValue(model, HealthData.VALUE_SLEEP_DURATION));
            this.name = HealthDataDaoManager.INSTANCE.getOtherValueString(model, "device_name");
        }

        public final Integer getDataType() {
            return this.dataType;
        }

        public final void setDataType(Integer num) {
            this.dataType = num;
        }

        public final Integer getDuration() {
            return this.duration;
        }

        public final void setDuration(Integer num) {
            this.duration = num;
        }

        public final String getName() {
            return this.name;
        }

        public final void setName(String str) {
            this.name = str;
        }
    }

    /* compiled from: HealthOssUploadBean.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001f¨\u0006#"}, d2 = {"Lcom/wakeup/module/data/entity/HealthOssUploadBean$SleepPoint;", "Lcom/wakeup/module/data/entity/HealthOssUploadBean$OssHealBaseBean;", "model", "Lcom/wakeup/module/data/entity/HealthEntity;", "<init>", "(Lcom/wakeup/module/data/entity/HealthEntity;)V", "start", "", "getStart", "()Ljava/lang/Long;", "setStart", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "end", "getEnd", "setEnd", "dataType", "", "getDataType", "()Ljava/lang/Integer;", "setDataType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "duration", "getDuration", "setDuration", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "desc", "getDesc", "setDesc", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SleepPoint extends OssHealBaseBean {
        private Integer dataType;
        private String desc;
        private Integer duration;
        private Long end;
        private String name;
        private Long start;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SleepPoint(HealthEntity model) {
            super(model.getTime(), model.getMac(), Integer.valueOf((model.getSyncState() & 2) == 2 ? 1 : 0));
            Intrinsics.checkNotNullParameter(model, "model");
            this.start = Long.valueOf(model.getTime());
            this.end = Long.valueOf((HealthDataDaoManager.INSTANCE.getValue(model, HealthData.VALUE_SLEEP_DURATION) * 60) + model.getTime());
            this.dataType = Integer.valueOf(HealthDataDaoManager.INSTANCE.getValue(model, HealthData.VALUE_SLEEP_TYPE));
            this.duration = Integer.valueOf(HealthDataDaoManager.INSTANCE.getValue(model, HealthData.VALUE_SLEEP_DURATION) * 60);
            this.name = HealthDataDaoManager.INSTANCE.getOtherValueString(model, "device_name");
            this.desc = HealthDataDaoManager.INSTANCE.getValue(model, HealthData.VALUE_SLEEP_TYPE) == 1 ? "浅睡" : "深睡";
        }

        public final Long getStart() {
            return this.start;
        }

        public final void setStart(Long l) {
            this.start = l;
        }

        public final Long getEnd() {
            return this.end;
        }

        public final void setEnd(Long l) {
            this.end = l;
        }

        public final Integer getDataType() {
            return this.dataType;
        }

        public final void setDataType(Integer num) {
            this.dataType = num;
        }

        public final Integer getDuration() {
            return this.duration;
        }

        public final void setDuration(Integer num) {
            this.duration = num;
        }

        public final String getName() {
            return this.name;
        }

        public final void setName(String str) {
            this.name = str;
        }

        public final String getDesc() {
            return this.desc;
        }

        public final void setDesc(String str) {
            this.desc = str;
        }
    }

    /* compiled from: HealthOssUploadBean.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/wakeup/module/data/entity/HealthOssUploadBean$Heart;", "Lcom/wakeup/module/data/entity/HealthOssUploadBean$OssHealBaseBean;", "model", "Lcom/wakeup/module/data/entity/HealthEntity;", "<init>", "(Lcom/wakeup/module/data/entity/HealthEntity;)V", "heart", "", "getHeart", "()Ljava/lang/Integer;", "setHeart", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "sendWarning", "getSendWarning", "setSendWarning", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Heart extends OssHealBaseBean {
        private Integer heart;
        private Integer sendWarning;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Heart(HealthEntity model) {
            super(model.getTime(), model.getMac(), Integer.valueOf((model.getSyncState() & 2) == 2 ? 1 : 0));
            Intrinsics.checkNotNullParameter(model, "model");
            this.heart = Integer.valueOf(HealthDataDaoManager.INSTANCE.getValue(model));
            this.sendWarning = Integer.valueOf(HealthDataDaoManager.INSTANCE.getOtherValue(model, HealthData.OTHER_VALUE_SEND_WARNING));
        }

        public final Integer getHeart() {
            return this.heart;
        }

        public final void setHeart(Integer num) {
            this.heart = num;
        }

        public final Integer getSendWarning() {
            return this.sendWarning;
        }

        public final void setSendWarning(Integer num) {
            this.sendWarning = num;
        }
    }

    /* compiled from: HealthOssUploadBean.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/wakeup/module/data/entity/HealthOssUploadBean$HeartPoint;", "Lcom/wakeup/module/data/entity/HealthOssUploadBean$OssHealBaseBean;", "model", "Lcom/wakeup/module/data/entity/HealthEntity;", "<init>", "(Lcom/wakeup/module/data/entity/HealthEntity;)V", "heart", "", "getHeart", "()Ljava/lang/Integer;", "setHeart", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "earlyWarning", "getEarlyWarning", "setEarlyWarning", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HeartPoint extends OssHealBaseBean {
        private Integer earlyWarning;
        private Integer heart;
        private String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeartPoint(HealthEntity model) {
            super(model.getTime(), model.getMac(), Integer.valueOf((model.getSyncState() & 2) == 2 ? 1 : 0));
            Intrinsics.checkNotNullParameter(model, "model");
            this.heart = Integer.valueOf(HealthDataDaoManager.INSTANCE.getValue(model));
            this.earlyWarning = Integer.valueOf(HealthDataDaoManager.INSTANCE.getOtherValue(model, HealthData.OTHER_VALUE_SEND_WARNING));
            this.name = HealthDataDaoManager.INSTANCE.getOtherValueString(model, "device_name");
        }

        public final Integer getHeart() {
            return this.heart;
        }

        public final void setHeart(Integer num) {
            this.heart = num;
        }

        public final Integer getEarlyWarning() {
            return this.earlyWarning;
        }

        public final void setEarlyWarning(Integer num) {
            this.earlyWarning = num;
        }

        public final String getName() {
            return this.name;
        }

        public final void setName(String str) {
            this.name = str;
        }
    }

    /* compiled from: HealthOssUploadBean.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/wakeup/module/data/entity/HealthOssUploadBean$BloodPressure;", "Lcom/wakeup/module/data/entity/HealthOssUploadBean$OssHealBaseBean;", "model", "Lcom/wakeup/module/data/entity/HealthEntity;", "<init>", "(Lcom/wakeup/module/data/entity/HealthEntity;)V", "systolicPressure", "", "getSystolicPressure", "()Ljava/lang/Integer;", "setSystolicPressure", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "diastolicPressure", "getDiastolicPressure", "setDiastolicPressure", HealthItem.TYPE_AVG_PULSE, "getPulse", "setPulse", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BloodPressure extends OssHealBaseBean {
        private Integer diastolicPressure;
        private Integer pulse;
        private Integer systolicPressure;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BloodPressure(HealthEntity model) {
            super(model.getTime(), Intrinsics.areEqual(model.getMac(), "phone") ? HealthData.TYPE_PHONE : model.getMac(), Integer.valueOf((model.getSyncState() & 2) == 2 ? 1 : 0));
            Intrinsics.checkNotNullParameter(model, "model");
            this.systolicPressure = Integer.valueOf(HealthDataDaoManager.INSTANCE.getValue(model, HealthData.VALUE_SYSTOLIC));
            this.diastolicPressure = Integer.valueOf(HealthDataDaoManager.INSTANCE.getValue(model, HealthData.VALUE_DIASTOLIC));
            this.pulse = Integer.valueOf(HealthDataDaoManager.INSTANCE.getValue(model, HealthData.VALUE_PULSE));
        }

        public final Integer getSystolicPressure() {
            return this.systolicPressure;
        }

        public final void setSystolicPressure(Integer num) {
            this.systolicPressure = num;
        }

        public final Integer getDiastolicPressure() {
            return this.diastolicPressure;
        }

        public final void setDiastolicPressure(Integer num) {
            this.diastolicPressure = num;
        }

        public final Integer getPulse() {
            return this.pulse;
        }

        public final void setPulse(Integer num) {
            this.pulse = num;
        }
    }

    /* compiled from: HealthOssUploadBean.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/wakeup/module/data/entity/HealthOssUploadBean$BloodOxygen;", "Lcom/wakeup/module/data/entity/HealthOssUploadBean$OssHealBaseBean;", "model", "Lcom/wakeup/module/data/entity/HealthEntity;", "<init>", "(Lcom/wakeup/module/data/entity/HealthEntity;)V", "bloodOxygen", "", "getBloodOxygen", "()Ljava/lang/Integer;", "setBloodOxygen", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BloodOxygen extends OssHealBaseBean {
        private Integer bloodOxygen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BloodOxygen(HealthEntity model) {
            super(model.getTime(), model.getMac(), Integer.valueOf((model.getSyncState() & 2) == 2 ? 1 : 0));
            Intrinsics.checkNotNullParameter(model, "model");
            this.bloodOxygen = Integer.valueOf(HealthDataDaoManager.INSTANCE.getValue(model));
        }

        public final Integer getBloodOxygen() {
            return this.bloodOxygen;
        }

        public final void setBloodOxygen(Integer num) {
            this.bloodOxygen = num;
        }
    }

    /* compiled from: HealthOssUploadBean.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/wakeup/module/data/entity/HealthOssUploadBean$BloodGlucose;", "Lcom/wakeup/module/data/entity/HealthOssUploadBean$OssHealBaseBean;", "model", "Lcom/wakeup/module/data/entity/HealthEntity;", "<init>", "(Lcom/wakeup/module/data/entity/HealthEntity;)V", "bloodSugar", "", "getBloodSugar", "()Ljava/lang/Object;", "setBloodSugar", "(Ljava/lang/Object;)V", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BloodGlucose extends OssHealBaseBean {
        private Object bloodSugar;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BloodGlucose(HealthEntity model) {
            super(model.getTime(), Intrinsics.areEqual(model.getMac(), "phone") ? HealthData.TYPE_PHONE : model.getMac(), Integer.valueOf((model.getSyncState() & 2) == 2 ? 1 : 0));
            Intrinsics.checkNotNullParameter(model, "model");
            this.bloodSugar = Double.valueOf(HealthDataDaoManager.INSTANCE.getValueF(model));
        }

        public final Object getBloodSugar() {
            return this.bloodSugar;
        }

        public final void setBloodSugar(Object obj) {
            this.bloodSugar = obj;
        }
    }

    /* compiled from: HealthOssUploadBean.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/wakeup/module/data/entity/HealthOssUploadBean$Immunity;", "Lcom/wakeup/module/data/entity/HealthOssUploadBean$OssHealBaseBean;", "model", "Lcom/wakeup/module/data/entity/HealthEntity;", "<init>", "(Lcom/wakeup/module/data/entity/HealthEntity;)V", "immunity", "", "getImmunity", "()Ljava/lang/Integer;", "setImmunity", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Immunity extends OssHealBaseBean {
        private Integer immunity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Immunity(HealthEntity model) {
            super(model.getTime(), model.getMac(), Integer.valueOf((model.getSyncState() & 2) == 2 ? 1 : 0));
            Intrinsics.checkNotNullParameter(model, "model");
            this.immunity = Integer.valueOf(HealthDataDaoManager.INSTANCE.getValue(model));
        }

        public final Integer getImmunity() {
            return this.immunity;
        }

        public final void setImmunity(Integer num) {
            this.immunity = num;
        }
    }

    /* compiled from: HealthOssUploadBean.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/wakeup/module/data/entity/HealthOssUploadBean$Temperature;", "Lcom/wakeup/module/data/entity/HealthOssUploadBean$OssHealBaseBean;", "model", "Lcom/wakeup/module/data/entity/HealthEntity;", "<init>", "(Lcom/wakeup/module/data/entity/HealthEntity;)V", "temperature", "", "getTemperature", "()Ljava/lang/Object;", "setTemperature", "(Ljava/lang/Object;)V", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Temperature extends OssHealBaseBean {
        private Object temperature;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Temperature(HealthEntity model) {
            super(model.getTime(), Intrinsics.areEqual(model.getMac(), "phone") ? HealthData.TYPE_PHONE : model.getMac(), Integer.valueOf((model.getSyncState() & 2) == 2 ? 1 : 0));
            Intrinsics.checkNotNullParameter(model, "model");
            this.temperature = Double.valueOf(HealthDataDaoManager.INSTANCE.getValueF(model));
        }

        public final Object getTemperature() {
            return this.temperature;
        }

        public final void setTemperature(Object obj) {
            this.temperature = obj;
        }
    }

    /* compiled from: HealthOssUploadBean.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/wakeup/module/data/entity/HealthOssUploadBean$Fatigue;", "Lcom/wakeup/module/data/entity/HealthOssUploadBean$OssHealBaseBean;", "model", "Lcom/wakeup/module/data/entity/HealthEntity;", "<init>", "(Lcom/wakeup/module/data/entity/HealthEntity;)V", "fatigue", "", "getFatigue", "()Ljava/lang/Integer;", "setFatigue", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Fatigue extends OssHealBaseBean {
        private Integer fatigue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Fatigue(HealthEntity model) {
            super(model.getTime(), model.getMac(), Integer.valueOf((model.getSyncState() & 2) == 2 ? 1 : 0));
            Intrinsics.checkNotNullParameter(model, "model");
            this.fatigue = Integer.valueOf(HealthDataDaoManager.INSTANCE.getValue(model));
        }

        public final Integer getFatigue() {
            return this.fatigue;
        }

        public final void setFatigue(Integer num) {
            this.fatigue = num;
        }
    }

    /* compiled from: HealthOssUploadBean.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/wakeup/module/data/entity/HealthOssUploadBean$Weight;", "Lcom/wakeup/module/data/entity/HealthOssUploadBean$OssHealBaseBean;", "model", "Lcom/wakeup/module/data/entity/HealthEntity;", "<init>", "(Lcom/wakeup/module/data/entity/HealthEntity;)V", "weight", "", "getWeight", "()Ljava/lang/Object;", "setWeight", "(Ljava/lang/Object;)V", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Weight extends OssHealBaseBean {
        private Object weight;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Weight(HealthEntity model) {
            super(model.getTime(), Intrinsics.areEqual(model.getMac(), "phone") ? HealthData.TYPE_PHONE : model.getMac(), Integer.valueOf((model.getSyncState() & 2) == 2 ? 1 : 0));
            Intrinsics.checkNotNullParameter(model, "model");
            this.weight = Double.valueOf(HealthDataDaoManager.INSTANCE.getValueF(model));
        }

        public final Object getWeight() {
            return this.weight;
        }

        public final void setWeight(Object obj) {
            this.weight = obj;
        }
    }

    /* compiled from: HealthOssUploadBean.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/wakeup/module/data/entity/HealthOssUploadBean$HeartWarning;", "Lcom/wakeup/module/data/entity/HealthOssUploadBean$OssHealBaseBean;", "model", "Lcom/wakeup/module/data/entity/HealthEntity;", "<init>", "(Lcom/wakeup/module/data/entity/HealthEntity;)V", "heart", "", "getHeart", "()Ljava/lang/Integer;", "setHeart", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HeartWarning extends OssHealBaseBean {
        private Integer heart;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeartWarning(HealthEntity model) {
            super(model.getTime(), model.getMac(), Integer.valueOf((model.getSyncState() & 2) == 2 ? 1 : 0));
            Intrinsics.checkNotNullParameter(model, "model");
            this.heart = Integer.valueOf(HealthDataDaoManager.INSTANCE.getValue(model));
        }

        public final Integer getHeart() {
            return this.heart;
        }

        public final void setHeart(Integer num) {
            this.heart = num;
        }
    }

    /* compiled from: HealthOssUploadBean.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/wakeup/module/data/entity/HealthOssUploadBean$SleepApnea;", "Lcom/wakeup/module/data/entity/HealthOssUploadBean$OssHealBaseBean;", "model", "Lcom/wakeup/module/data/entity/HealthEntity;", "<init>", "(Lcom/wakeup/module/data/entity/HealthEntity;)V", "value", "", "getValue", "()Ljava/lang/Integer;", "setValue", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SleepApnea extends OssHealBaseBean {
        private Integer value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SleepApnea(HealthEntity model) {
            super(model.getTime(), model.getMac(), Integer.valueOf((model.getSyncState() & 2) == 2 ? 1 : 0));
            Intrinsics.checkNotNullParameter(model, "model");
            this.value = Integer.valueOf(HealthDataDaoManager.INSTANCE.getValue(model));
        }

        public final Integer getValue() {
            return this.value;
        }

        public final void setValue(Integer num) {
            this.value = num;
        }
    }
}
