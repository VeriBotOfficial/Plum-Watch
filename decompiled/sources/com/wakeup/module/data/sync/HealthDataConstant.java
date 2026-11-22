package com.wakeup.module.data.sync;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: HealthDataConstant.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R!\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u001dj\b\u0012\u0004\u0012\u00020\u0005`\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/wakeup/module/data/sync/HealthDataConstant;", "", "<init>", "()V", "TYPE_OSS", "", "TYPE_SERVER", "heartMin", "heatMax", "bloodOxygenMin", "bloodOxygenMax", "systolicPressureMin", "systolicPressureMax", "diastolicPressureMin", "diastolicPressureMax", "sleepMax", "sleepMin", "bloodGlucoseMin", "", "bloodGlucoseMax", "fatigueMin", "fatigueMax", "breatheMin", "breatheMax", "temperatureMin", "temperatureMax", "immunityMin", "immunityMax", "dataTypeMap", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getDataTypeMap", "()Ljava/util/ArrayList;", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HealthDataConstant {
    public static final int TYPE_OSS = 1;
    public static final int TYPE_SERVER = 2;
    public static final float bloodGlucoseMax = 10.0f;
    public static final float bloodGlucoseMin = 4.4f;
    public static final int bloodOxygenMax = 100;
    public static final int bloodOxygenMin = 50;
    public static final int breatheMax = 20;
    public static final int breatheMin = 12;
    public static final int diastolicPressureMax = 200;
    public static final int diastolicPressureMin = 30;
    public static final int fatigueMax = 60;
    public static final int fatigueMin = 1;
    public static final int heartMin = 40;
    public static final int heatMax = 160;
    public static final int immunityMax = 100;
    public static final int immunityMin = 10;
    public static final int sleepMax = 12;
    public static final int sleepMin = 6;
    public static final int systolicPressureMax = 220;
    public static final int systolicPressureMin = 40;
    public static final int temperatureMax = 38;
    public static final int temperatureMin = 35;
    public static final HealthDataConstant INSTANCE = new HealthDataConstant();
    private static final ArrayList<Integer> dataTypeMap = CollectionsKt.arrayListOf(10000, 10005, 10001, 10002, 10003, 10004, 10007, 10009, 10006, 10011, 10013, 10012, 10014);

    private HealthDataConstant() {
    }

    public final ArrayList<Integer> getDataTypeMap() {
        return dataTypeMap;
    }
}
