package com.wakeup.commponent.module.data;

import android.gov.nist.core.Separators;
import com.wakeup.common.Constants;
import com.wakeup.common.burypoint.BuryPointPageId;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: HealthData.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 =2\u00020\u0001:\u0001=BS\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u001f\u001a\u00020\tJ\u0006\u0010 \u001a\u00020\u0005J\u0006\u0010!\u001a\u00020\"J\u000e\u0010 \u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0007J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0007J\u001b\u0010$\u001a\n %*\u0004\u0018\u00010\t0\t2\u0006\u0010&\u001a\u00020\u0005¢\u0006\u0002\u0010'J#\u0010$\u001a\n %*\u0004\u0018\u00010\t0\t2\u0006\u0010#\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0005¢\u0006\u0002\u0010(J#\u0010$\u001a\n %*\u0004\u0018\u00010\t0\t2\u0006\u0010#\u001a\u00020\u00072\u0006\u0010&\u001a\u00020)¢\u0006\u0002\u0010*J\u0006\u0010+\u001a\u00020\tJ\u000e\u0010,\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0007J#\u0010-\u001a\n %*\u0004\u0018\u00010\t0\t2\u0006\u0010#\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0005¢\u0006\u0002\u0010(J\u001b\u0010.\u001a\n %*\u0004\u0018\u00010\u00070\u00072\u0006\u0010#\u001a\u00020\u0007¢\u0006\u0002\u0010/J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\t\u00103\u001a\u00020\tHÂ\u0003J\t\u00104\u001a\u00020\tHÂ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003JU\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0001J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020\u0005HÖ\u0001J\t\u0010<\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006>"}, d2 = {"Lcom/wakeup/commponent/module/data/HealthData;", "", "time", "", "type", "", "mac", "", "values", "Lorg/json/JSONObject;", "otherValue", "syncState", "detailList", "", "Lcom/wakeup/commponent/module/data/HealthItem;", "<init>", "(JILjava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;ILjava/util/List;)V", "getTime", "()J", "setTime", "(J)V", "getType", "()I", "setType", "(I)V", "getMac", "()Ljava/lang/String;", "getSyncState", "setSyncState", "getDetailList", "()Ljava/util/List;", "getValues", "getValue", "getValueF", "", "valueType", "setValue", "kotlin.jvm.PlatformType", "value", "(I)Lorg/json/JSONObject;", "(Ljava/lang/String;I)Lorg/json/JSONObject;", "", "(Ljava/lang/String;F)Lorg/json/JSONObject;", "getOtherValues", "getOtherValue", "setOtherValue", "getOtherValueString", "(Ljava/lang/String;)Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class HealthData {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int DATA_TYPE_ACTIVE_HEAT = 20016;
    public static final int DATA_TYPE_ACTIVE_STRENGTH = 20014;
    public static final int DATA_TYPE_ACTIVE_TIME = 20013;
    public static final int DATA_TYPE_BO = 10003;
    public static final int DATA_TYPE_BO_LOW = 20003;
    public static final int DATA_TYPE_BP = 10002;
    public static final int DATA_TYPE_BP_HIGH = 20002;
    public static final int DATA_TYPE_BREATHE = 10008;
    public static final int DATA_TYPE_BREATHE_HIGH = 20010;
    public static final int DATA_TYPE_BREATHE_LOW = 20009;
    public static final int DATA_TYPE_BS = 10004;
    public static final int DATA_TYPE_BS_HIGH = 20005;
    public static final int DATA_TYPE_BS_LOW = 20004;
    public static final int DATA_TYPE_HEART = 10001;
    public static final int DATA_TYPE_HEART_HIGH = 10013;
    public static final int DATA_TYPE_HEART_LOW = 10012;
    public static final int DATA_TYPE_IMMUNITY = 10009;
    public static final int DATA_TYPE_MET = 10010;
    public static final int DATA_TYPE_PRESSURE = 10006;
    public static final int DATA_TYPE_PRESSURE_HIGH = 20006;
    public static final int DATA_TYPE_SLEEP = 10005;
    public static final int DATA_TYPE_SLEEP_APNEA = 10014;
    public static final int DATA_TYPE_SPORT_COUNT = 10021;
    public static final int DATA_TYPE_SPORT_DURATION = 10020;
    public static final int DATA_TYPE_STEP = 10000;
    public static final int DATA_TYPE_STEP_RANK = 20015;
    public static final int DATA_TYPE_TEMPERATURE = 10007;
    public static final int DATA_TYPE_TEMPERATURE_HIGH = 20008;
    public static final int DATA_TYPE_TEMPERATURE_LOW = 20007;
    public static final int DATA_TYPE_WEIGHT = 10011;
    public static final int DATA_TYPE_WEIGHT_HIGH = 20012;
    public static final int DATA_TYPE_WEIGHT_LOW = 20011;
    public static final String DEVICE_NAME = "device_name";
    public static final int LENOVO_TYPE_AWAKE = 4;
    public static final int LENOVO_TYPE_DEEP = 2;
    public static final int LENOVO_TYPE_NAP = 17;
    public static final int LENOVO_TYPE_REM = 3;
    public static final int LENOVO_TYPE_SHALLOW = 1;
    public static final String OTHER_VALUE_SEND_WARNING = "other_value_send_warning";
    public static final String STATISTICS_AVERAGE = "average";
    public static final String STATISTICS_AVG = "avg";
    public static final String STATISTICS_AVG_DBP = "averageDiastolic";
    public static final String STATISTICS_AVG_MET = "avgMet";
    public static final String STATISTICS_AVG_PULSE = "averagePulse";
    public static final String STATISTICS_AVG_SBP = "averageSystolic";
    public static final String STATISTICS_AVG_STEP = "avgStep";
    public static final String STATISTICS_AVG_WEIGHT = "avgWeight";
    public static final String STATISTICS_AWAKE_RATIO = "awakeRatio";
    public static final String STATISTICS_BMI = "bmi";
    public static final String STATISTICS_CYCLE_PERCENT = "cycle_percent";
    public static final String STATISTICS_DEEP_RATIO = "deepRatio";
    public static final String STATISTICS_DISTANCE_TOTAL = "countDistance";
    public static final String STATISTICS_GOAL_MET = "goalMet";
    public static final String STATISTICS_KCAL_TOTAL = "countKcal";
    public static final String STATISTICS_LAST_WEIGHT = "lastWeight";
    public static final String STATISTICS_MAXIMUM = "maximum";
    public static final String STATISTICS_MINIMUM = "minimum";
    public static final String STATISTICS_NAP_RATIO = "napRatio";
    public static final String STATISTICS_OTHER_PERCENT = "other_percent";
    public static final String STATISTICS_RECENTLY = "recently";
    public static final String STATISTICS_REM_RATIO = "remRatio";
    public static final String STATISTICS_RUN_PERCENT = "run_percent";
    public static final String STATISTICS_SHALLOW_RATIO = "shallowRatio";
    public static final String STATISTICS_STEP_TOTAL = "countStep";
    public static final String STATISTICS_SUM_DURATION = "sumDuration";
    public static final String STATISTICS_SUM_MET = "sumMet";
    public static final String STATISTICS_TOTAL = "total";
    public static final String STATISTICS_TRAIN_PERCENT = "train_percent";
    public static final String STATISTICS_WALK_PERCENT = "walk_percent";
    public static final String STATISTICS_WEIGHT = "weight";
    public static final int TYPE_AWAKE = 3;
    public static final int TYPE_DEEP = 2;
    public static final String TYPE_PHONE = "Phone";
    public static final int TYPE_SHALLOW = 1;
    public static final String VALUE_BS_TIME_TYPE = "value_bs_time_type";
    public static final String VALUE_CYCLE_KCAL = "value_cycle_kcal";
    public static final String VALUE_CYCLE_STRENGTH = "value_cycle_strength";
    public static final String VALUE_DEFAULT = "value";
    public static final String VALUE_DIASTOLIC = "value_diastolic";
    public static final String VALUE_IS_ACTIVITY_FINISH = "value_is_activity_finish";
    public static final String VALUE_PULSE = "value_pulse";
    public static final String VALUE_RUN_KCAL = "value_run_kcal";
    public static final String VALUE_RUN_STRENGTH = "value_run_strength";
    public static final String VALUE_SLEEP_DURATION = "value_duration";
    public static final String VALUE_SLEEP_TYPE = "value_sleep_type";
    public static final String VALUE_STEP_INTERVAL = "value_step_shallow";
    public static final String VALUE_STEP_KCAL = "value_step_kcal";
    public static final String VALUE_STEP_TOTAL = "value_step_total";
    public static final String VALUE_SYSTOLIC = "value_systolic";
    public static final String VALUE_TOTAL_KCAL = "value_total_kcal";
    public static final String VALUE_TOTAL_STRENGTH = "value_total_strength";
    public static final String VALUE_TRAIN_KCAL = "value_train_kcal";
    public static final String VALUE_TRAIN_STRENGTH = "value_train_strength";
    public static final String VALUE_WALK_KCAL = "value_walk_kcal";
    public static final String VALUE_WALK_STRENGTH = "value_walk_strength";
    private final List<HealthItem> detailList;
    private final String mac;
    private final JSONObject otherValue;
    private int syncState;
    private long time;
    private int type;
    private JSONObject values;

    public HealthData(int i) {
        this(0L, i, null, null, null, 0, null, 125, null);
    }

    public HealthData(long j, int i) {
        this(j, i, null, null, null, 0, null, 124, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HealthData(long j, int i, String mac) {
        this(j, i, mac, null, null, 0, null, 120, null);
        Intrinsics.checkNotNullParameter(mac, "mac");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HealthData(long j, int i, String mac, JSONObject values) {
        this(j, i, mac, values, null, 0, null, 112, null);
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(values, "values");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HealthData(long j, int i, String mac, JSONObject values, JSONObject otherValue) {
        this(j, i, mac, values, otherValue, 0, null, 96, null);
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(otherValue, "otherValue");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HealthData(long j, int i, String mac, JSONObject values, JSONObject otherValue, int i2) {
        this(j, i, mac, values, otherValue, i2, null, 64, null);
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(otherValue, "otherValue");
    }

    /* renamed from: component4, reason: from getter */
    private final JSONObject getValues() {
        return this.values;
    }

    /* renamed from: component5, reason: from getter */
    private final JSONObject getOtherValue() {
        return this.otherValue;
    }

    public static /* synthetic */ HealthData copy$default(HealthData healthData, long j, int i, String str, JSONObject jSONObject, JSONObject jSONObject2, int i2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = healthData.time;
        }
        long j2 = j;
        if ((i3 & 2) != 0) {
            i = healthData.type;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            str = healthData.mac;
        }
        String str2 = str;
        if ((i3 & 8) != 0) {
            jSONObject = healthData.values;
        }
        JSONObject jSONObject3 = jSONObject;
        if ((i3 & 16) != 0) {
            jSONObject2 = healthData.otherValue;
        }
        return healthData.copy(j2, i4, str2, jSONObject3, jSONObject2, (i3 & 32) != 0 ? healthData.syncState : i2, (i3 & 64) != 0 ? healthData.detailList : list);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMac() {
        return this.mac;
    }

    /* renamed from: component6, reason: from getter */
    public final int getSyncState() {
        return this.syncState;
    }

    public final List<HealthItem> component7() {
        return this.detailList;
    }

    public final HealthData copy(long time, int type, String mac, JSONObject values, JSONObject otherValue, int syncState, List<HealthItem> detailList) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(otherValue, "otherValue");
        Intrinsics.checkNotNullParameter(detailList, "detailList");
        return new HealthData(time, type, mac, values, otherValue, syncState, detailList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthData)) {
            return false;
        }
        HealthData healthData = (HealthData) other;
        return this.time == healthData.time && this.type == healthData.type && Intrinsics.areEqual(this.mac, healthData.mac) && Intrinsics.areEqual(this.values, healthData.values) && Intrinsics.areEqual(this.otherValue, healthData.otherValue) && this.syncState == healthData.syncState && Intrinsics.areEqual(this.detailList, healthData.detailList);
    }

    public int hashCode() {
        return (((((((((((Long.hashCode(this.time) * 31) + Integer.hashCode(this.type)) * 31) + this.mac.hashCode()) * 31) + this.values.hashCode()) * 31) + this.otherValue.hashCode()) * 31) + Integer.hashCode(this.syncState)) * 31) + this.detailList.hashCode();
    }

    public String toString() {
        return "HealthData(time=" + this.time + ", type=" + this.type + ", mac=" + this.mac + ", values=" + this.values + ", otherValue=" + this.otherValue + ", syncState=" + this.syncState + ", detailList=" + this.detailList + Separators.RPAREN;
    }

    public HealthData(long j, int i, String mac, JSONObject values, JSONObject otherValue, int i2, List<HealthItem> detailList) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(otherValue, "otherValue");
        Intrinsics.checkNotNullParameter(detailList, "detailList");
        this.time = j;
        this.type = i;
        this.mac = mac;
        this.values = values;
        this.otherValue = otherValue;
        this.syncState = i2;
        this.detailList = detailList;
    }

    public final long getTime() {
        return this.time;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final int getType() {
        return this.type;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public /* synthetic */ HealthData(long j, int i, String str, JSONObject jSONObject, JSONObject jSONObject2, int i2, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, i, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? new JSONObject() : jSONObject, (i3 & 16) != 0 ? new JSONObject() : jSONObject2, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final String getMac() {
        return this.mac;
    }

    public final int getSyncState() {
        return this.syncState;
    }

    public final void setSyncState(int i) {
        this.syncState = i;
    }

    public final List<HealthItem> getDetailList() {
        return this.detailList;
    }

    /* compiled from: HealthData.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b(\n\u0002\u0010\u000e\n\u0002\b7\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010e\u001a\u00020f2\u0006\u0010g\u001a\u00020\u00052\u0006\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020.2\u0006\u0010k\u001a\u00020\u0005J&\u0010e\u001a\u00020f2\u0006\u0010g\u001a\u00020\u00052\u0006\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020.2\u0006\u0010k\u001a\u00020lJ6\u0010m\u001a\u00020f2\u0006\u0010g\u001a\u00020\u00052\u0006\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020.2\u0006\u0010n\u001a\u00020\u00052\u0006\u0010o\u001a\u00020\u00052\u0006\u0010p\u001a\u00020\u0005J6\u0010q\u001a\u00020f2\u0006\u0010g\u001a\u00020\u00052\u0006\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020.2\u0006\u0010r\u001a\u00020.2\u0006\u0010s\u001a\u00020\u00052\u0006\u0010t\u001a\u00020\u0005J6\u0010u\u001a\u00020f2\u0006\u0010g\u001a\u00020\u00052\u0006\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020.2\u0006\u0010r\u001a\u00020.2\u0006\u0010v\u001a\u00020\u00052\u0006\u0010w\u001a\u00020\u0005Jg\u0010x\u001a\u00020f2\u0006\u0010g\u001a\u00020\u00052\u0006\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020.2\u0006\u0010r\u001a\u00020.2\u0006\u0010y\u001a\u00020\u00052\u0006\u0010z\u001a\u00020\u00052\u0006\u0010{\u001a\u00020\u00052\u0006\u0010|\u001a\u00020\u00052\u0006\u0010}\u001a\u00020\u00052\u0006\u0010~\u001a\u00020\u00052\u0006\u0010\u007f\u001a\u00020\u00052\u0007\u0010\u0080\u0001\u001a\u00020\u0005J1\u0010\u0081\u0001\u001a\u00020f2\u0006\u0010g\u001a\u00020\u00052\u0006\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020.2\u0006\u0010r\u001a\u00020.2\b\u0010\u0082\u0001\u001a\u00030\u0083\u0001J(\u0010\u0084\u0001\u001a\u00020f2\u0006\u0010h\u001a\u00020i2\u0006\u0010k\u001a\u00020l2\u0007\u0010\u0085\u0001\u001a\u00020\u00052\u0006\u0010j\u001a\u00020.J\u001f\u0010\u0086\u0001\u001a\u00020f2\u0006\u0010h\u001a\u00020i2\u0006\u0010k\u001a\u00020l2\u0006\u0010j\u001a\u00020.R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010]\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010^\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010_\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010`\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010a\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010b\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010c\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010d\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0087\u0001"}, d2 = {"Lcom/wakeup/commponent/module/data/HealthData$Companion;", "", "<init>", "()V", "DATA_TYPE_STEP", "", "DATA_TYPE_HEART", "DATA_TYPE_BP", "DATA_TYPE_BO", "DATA_TYPE_BS", "DATA_TYPE_SLEEP", "DATA_TYPE_PRESSURE", "DATA_TYPE_TEMPERATURE", "DATA_TYPE_BREATHE", "DATA_TYPE_IMMUNITY", "DATA_TYPE_MET", "DATA_TYPE_WEIGHT", "DATA_TYPE_HEART_LOW", "DATA_TYPE_HEART_HIGH", "DATA_TYPE_SLEEP_APNEA", "DATA_TYPE_SPORT_DURATION", "DATA_TYPE_SPORT_COUNT", "DATA_TYPE_BP_HIGH", "DATA_TYPE_BO_LOW", "DATA_TYPE_BS_LOW", "DATA_TYPE_BS_HIGH", "DATA_TYPE_PRESSURE_HIGH", "DATA_TYPE_TEMPERATURE_LOW", "DATA_TYPE_TEMPERATURE_HIGH", "DATA_TYPE_BREATHE_LOW", "DATA_TYPE_BREATHE_HIGH", "DATA_TYPE_WEIGHT_LOW", "DATA_TYPE_WEIGHT_HIGH", "DATA_TYPE_ACTIVE_TIME", "DATA_TYPE_ACTIVE_STRENGTH", "DATA_TYPE_STEP_RANK", "DATA_TYPE_ACTIVE_HEAT", "TYPE_DEEP", "TYPE_SHALLOW", "TYPE_AWAKE", "LENOVO_TYPE_DEEP", "LENOVO_TYPE_SHALLOW", "LENOVO_TYPE_REM", "LENOVO_TYPE_AWAKE", "LENOVO_TYPE_NAP", "VALUE_DEFAULT", "", "VALUE_DIASTOLIC", "VALUE_SYSTOLIC", "VALUE_PULSE", "VALUE_SLEEP_TYPE", "VALUE_SLEEP_DURATION", "VALUE_STEP_TOTAL", "VALUE_STEP_INTERVAL", "VALUE_STEP_KCAL", "VALUE_RUN_STRENGTH", "VALUE_WALK_STRENGTH", "VALUE_CYCLE_STRENGTH", "VALUE_TRAIN_STRENGTH", "VALUE_TOTAL_STRENGTH", "VALUE_IS_ACTIVITY_FINISH", "VALUE_RUN_KCAL", "VALUE_WALK_KCAL", "VALUE_CYCLE_KCAL", "VALUE_TRAIN_KCAL", "VALUE_TOTAL_KCAL", "DEVICE_NAME", "VALUE_BS_TIME_TYPE", "OTHER_VALUE_SEND_WARNING", "TYPE_PHONE", "STATISTICS_STEP_TOTAL", "STATISTICS_KCAL_TOTAL", "STATISTICS_DISTANCE_TOTAL", "STATISTICS_AVG_STEP", "STATISTICS_AWAKE_RATIO", "STATISTICS_DEEP_RATIO", "STATISTICS_SHALLOW_RATIO", "STATISTICS_REM_RATIO", "STATISTICS_NAP_RATIO", "STATISTICS_SUM_DURATION", "STATISTICS_AVERAGE", "STATISTICS_MAXIMUM", "STATISTICS_MINIMUM", "STATISTICS_RECENTLY", "STATISTICS_AVG_DBP", "STATISTICS_AVG_SBP", "STATISTICS_AVG_PULSE", "STATISTICS_AVG_MET", "STATISTICS_GOAL_MET", "STATISTICS_SUM_MET", "STATISTICS_AVG_WEIGHT", "STATISTICS_BMI", "STATISTICS_WEIGHT", "STATISTICS_LAST_WEIGHT", "STATISTICS_AVG", "STATISTICS_TOTAL", "STATISTICS_CYCLE_PERCENT", "STATISTICS_RUN_PERCENT", "STATISTICS_WALK_PERCENT", "STATISTICS_TRAIN_PERCENT", "STATISTICS_OTHER_PERCENT", BuryPointPageId.PAGE_ID_PLAN_CREATE, "Lcom/wakeup/commponent/module/data/HealthData;", "type", "time", "", "mac", "value", "", "createBP", "diastolic", "systolic", HealthItem.TYPE_AVG_PULSE, "createSleep", "name", "sleepType", "duration", "createStep", "step", Constants.BundleKey.KCAL, "createStepStrength", "runStrength", "runKcal", "walkStrength", "walkKcal", "cycleStrength", "cycleKcal", "trainStrength", "trainKcal", "createStepActivityFinish", "isActivityFinish", "", "createBS", "timeType", "createTem", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final HealthData create(int type, long time, String mac, int value) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", value);
            Unit unit = Unit.INSTANCE;
            return new HealthData(time, type, mac, jSONObject, null, 0, null, 112, null);
        }

        public final HealthData create(int type, long time, String mac, float value) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", Float.valueOf(value));
            Unit unit = Unit.INSTANCE;
            return new HealthData(time, type, mac, jSONObject, null, 0, null, 112, null);
        }

        public final HealthData createBP(int type, long time, String mac, int diastolic, int systolic, int pulse) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(HealthData.VALUE_DIASTOLIC, diastolic);
            jSONObject.put(HealthData.VALUE_SYSTOLIC, systolic);
            jSONObject.put(HealthData.VALUE_PULSE, pulse);
            Unit unit = Unit.INSTANCE;
            return new HealthData(time, type, mac, jSONObject, null, 0, null, 112, null);
        }

        public final HealthData createSleep(int type, long time, String mac, String name, int sleepType, int duration) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            Intrinsics.checkNotNullParameter(name, "name");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(HealthData.VALUE_SLEEP_TYPE, sleepType);
            jSONObject.put(HealthData.VALUE_SLEEP_DURATION, duration);
            Unit unit = Unit.INSTANCE;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("device_name", name);
            Unit unit2 = Unit.INSTANCE;
            return new HealthData(time, type, mac, jSONObject, jSONObject2, 0, null, 96, null);
        }

        public final HealthData createStep(int type, long time, String mac, String name, int step, int kcal) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            Intrinsics.checkNotNullParameter(name, "name");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(HealthData.VALUE_STEP_TOTAL, step);
            jSONObject.put(HealthData.VALUE_STEP_KCAL, kcal);
            jSONObject.put(HealthData.VALUE_IS_ACTIVITY_FINISH, (!Intrinsics.areEqual(mac, HealthData.TYPE_PHONE) || step <= 0) ? 0 : 1);
            Unit unit = Unit.INSTANCE;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("device_name", name);
            Unit unit2 = Unit.INSTANCE;
            return new HealthData(time, type, mac, jSONObject, jSONObject2, 0, null, 96, null);
        }

        public final HealthData createStepStrength(int type, long time, String mac, String name, int runStrength, int runKcal, int walkStrength, int walkKcal, int cycleStrength, int cycleKcal, int trainStrength, int trainKcal) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            Intrinsics.checkNotNullParameter(name, "name");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(HealthData.VALUE_RUN_STRENGTH, runStrength);
            jSONObject.put(HealthData.VALUE_RUN_KCAL, runKcal);
            jSONObject.put(HealthData.VALUE_WALK_STRENGTH, walkStrength);
            jSONObject.put(HealthData.VALUE_WALK_KCAL, walkKcal);
            jSONObject.put(HealthData.VALUE_CYCLE_STRENGTH, cycleStrength);
            jSONObject.put(HealthData.VALUE_CYCLE_KCAL, cycleKcal);
            jSONObject.put(HealthData.VALUE_TRAIN_STRENGTH, trainStrength);
            jSONObject.put(HealthData.VALUE_TRAIN_KCAL, trainKcal);
            Unit unit = Unit.INSTANCE;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("device_name", name);
            Unit unit2 = Unit.INSTANCE;
            return new HealthData(time, type, mac, jSONObject, jSONObject2, 0, null, 96, null);
        }

        public final HealthData createStepActivityFinish(int type, long time, String mac, String name, boolean isActivityFinish) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            Intrinsics.checkNotNullParameter(name, "name");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(HealthData.VALUE_IS_ACTIVITY_FINISH, isActivityFinish ? 1 : 0);
            Unit unit = Unit.INSTANCE;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("device_name", name);
            Unit unit2 = Unit.INSTANCE;
            return new HealthData(time, type, mac, jSONObject, jSONObject2, 0, null, 96, null);
        }

        public final HealthData createBS(long time, float value, int timeType, String mac) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", Float.valueOf(value));
            jSONObject.put(HealthData.VALUE_BS_TIME_TYPE, timeType);
            Unit unit = Unit.INSTANCE;
            return new HealthData(time, 10004, mac, jSONObject, null, 0, null, 112, null);
        }

        public final HealthData createTem(long time, float value, String mac) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", Float.valueOf(value));
            Unit unit = Unit.INSTANCE;
            return new HealthData(time, 10007, mac, jSONObject, null, 0, null, 112, null);
        }
    }

    public final JSONObject getValues() {
        return this.values;
    }

    public final int getValue() {
        if (this.values.has("value")) {
            return this.values.optInt("value");
        }
        return 0;
    }

    public final double getValueF() {
        if (this.values.has("value")) {
            return this.values.optDouble("value");
        }
        return 0.0d;
    }

    public final int getValue(String valueType) {
        Intrinsics.checkNotNullParameter(valueType, "valueType");
        if (this.values.has(valueType)) {
            return this.values.optInt(valueType);
        }
        return 0;
    }

    public final double getValueF(String valueType) {
        Intrinsics.checkNotNullParameter(valueType, "valueType");
        if (this.values.has(valueType)) {
            return this.values.optDouble(valueType);
        }
        return 0.0d;
    }

    public final JSONObject setValue(int value) {
        return this.values.put("value", value);
    }

    public final JSONObject setValue(String valueType, int value) {
        Intrinsics.checkNotNullParameter(valueType, "valueType");
        return this.values.put(valueType, value);
    }

    public final JSONObject setValue(String valueType, float value) {
        Intrinsics.checkNotNullParameter(valueType, "valueType");
        return this.values.put(valueType, Float.valueOf(value));
    }

    public final JSONObject getOtherValues() {
        return this.otherValue;
    }

    public final int getOtherValue(String valueType) {
        Intrinsics.checkNotNullParameter(valueType, "valueType");
        if (this.otherValue.has(valueType)) {
            return this.otherValue.optInt(valueType);
        }
        return 0;
    }

    public final JSONObject setOtherValue(String valueType, int value) {
        Intrinsics.checkNotNullParameter(valueType, "valueType");
        return this.otherValue.put(valueType, value);
    }

    public final String getOtherValueString(String valueType) {
        Intrinsics.checkNotNullParameter(valueType, "valueType");
        return !this.otherValue.has(valueType) ? "" : this.otherValue.optString(valueType);
    }
}
