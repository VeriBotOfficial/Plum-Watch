package com.wakeup.module.data.sync.download;

import com.wakeup.common.network.entity.health.ActiveHeatStatistics;
import com.wakeup.common.network.entity.health.ActiveStrengthStatistics;
import com.wakeup.common.network.entity.health.ActiveTimeStatistics;
import com.wakeup.common.network.entity.health.HealthBloodGlucoseStatistics;
import com.wakeup.common.network.entity.health.HealthBloodPressureStatistics;
import com.wakeup.common.network.entity.health.HealthCommonFloatStatistics;
import com.wakeup.common.network.entity.health.HealthCommonStatistics;
import com.wakeup.common.network.entity.health.HealthMetStatistics;
import com.wakeup.common.network.entity.health.HealthSleepApneaStatistics;
import com.wakeup.common.network.entity.health.HealthSleepStatistics;
import com.wakeup.common.network.entity.health.HealthStepStatistics;
import com.wakeup.common.network.entity.health.HealthWeightStatistics;
import com.wakeup.commponent.module.data.HealthConfig;
import com.wakeup.commponent.module.data.HealthData;
import com.wakeup.commponent.module.data.HealthItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: WakeDownloadHandler.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\rJ\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0017J\u0016\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u001bJ\u0016\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u001dJ\u0016\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u001f¨\u0006 "}, d2 = {"Lcom/wakeup/module/data/sync/download/WakeDownloadHandler;", "", "<init>", "()V", "dealWakeStepData", "Lcom/wakeup/commponent/module/data/HealthData;", "config", "Lcom/wakeup/commponent/module/data/HealthConfig;", "data", "Lcom/wakeup/common/network/entity/health/HealthStepStatistics;", "dealWakeSleepData", "Lcom/wakeup/common/network/entity/health/HealthSleepStatistics;", "dealWakeBloodPressureData", "Lcom/wakeup/common/network/entity/health/HealthBloodPressureStatistics;", "dealWakeMetData", "Lcom/wakeup/common/network/entity/health/HealthMetStatistics;", "dealWakeCommonData", "Lcom/wakeup/common/network/entity/health/HealthCommonStatistics;", "dealWakeCommonFloatData", "Lcom/wakeup/common/network/entity/health/HealthCommonFloatStatistics;", "dealWakeWeightData", "Lcom/wakeup/common/network/entity/health/HealthWeightStatistics;", "dealWakeBloodSugarData", "Lcom/wakeup/common/network/entity/health/HealthBloodGlucoseStatistics;", "dealWakeActiveStrengthData", "Lcom/wakeup/common/network/entity/health/ActiveStrengthStatistics;", "dealWakeActiveTimeData", "Lcom/wakeup/common/network/entity/health/ActiveTimeStatistics;", "dealWakeActiveHeatData", "Lcom/wakeup/common/network/entity/health/ActiveHeatStatistics;", "dealWakeSleepApneaData", "Lcom/wakeup/common/network/entity/health/HealthSleepApneaStatistics;", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WakeDownloadHandler {
    public static final WakeDownloadHandler INSTANCE = new WakeDownloadHandler();

    private WakeDownloadHandler() {
    }

    public final HealthData dealWakeStepData(HealthConfig config, HealthStepStatistics data) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(data, "data");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(HealthData.STATISTICS_STEP_TOTAL, data.getCountStep());
        jSONObject.put(HealthData.STATISTICS_KCAL_TOTAL, data.getCountKcal());
        jSONObject.put(HealthData.STATISTICS_DISTANCE_TOTAL, data.getCountDistance());
        jSONObject.put(HealthData.STATISTICS_AVG_STEP, data.getAvgStep());
        ArrayList arrayList = new ArrayList();
        List<HealthStepStatistics.ListBean> list = data.getList();
        Intrinsics.checkNotNullExpressionValue(list, "getList(...)");
        for (HealthStepStatistics.ListBean listBean : list) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("y", listBean.getY());
            arrayList.add(new HealthItem(listBean.getX(), jSONObject2));
        }
        return new HealthData(config.getStartTime(), config.getType(), "", jSONObject, null, 2, arrayList, 16, null);
    }

    public final HealthData dealWakeSleepData(HealthConfig config, HealthSleepStatistics data) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(data, "data");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(HealthData.STATISTICS_AWAKE_RATIO, data.getAwakeRatio());
        jSONObject.put(HealthData.STATISTICS_DEEP_RATIO, data.getDeepRatio());
        jSONObject.put(HealthData.STATISTICS_SHALLOW_RATIO, data.getShallowRatio());
        jSONObject.put(HealthData.STATISTICS_SUM_DURATION, data.getSumDuration());
        ArrayList arrayList = new ArrayList();
        List<HealthSleepStatistics.ListBean> list = data.getList();
        Intrinsics.checkNotNullExpressionValue(list, "getList(...)");
        for (HealthSleepStatistics.ListBean listBean : list) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(HealthItem.TYPE_AWAKE_Y, listBean.getAwakeY());
            jSONObject2.put(HealthItem.TYPE_SHALLOW_Y, listBean.getShallowY());
            jSONObject2.put(HealthItem.TYPE_DEEP_Y, listBean.getDeepY());
            arrayList.add(new HealthItem(listBean.getX(), jSONObject2));
        }
        return new HealthData(config.getStartTime(), config.getType(), "", jSONObject, null, 2, arrayList, 16, null);
    }

    public final HealthData dealWakeBloodPressureData(HealthConfig config, HealthBloodPressureStatistics data) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(data, "data");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(HealthData.STATISTICS_AVG_DBP, data.getAverageDiastolic());
        jSONObject.put(HealthData.STATISTICS_AVG_SBP, data.getAverageSystolic());
        jSONObject.put(HealthData.STATISTICS_AVG_PULSE, data.getAveragePulse());
        ArrayList arrayList = new ArrayList();
        List<HealthBloodPressureStatistics.ListBean> list = data.getList();
        Intrinsics.checkNotNullExpressionValue(list, "getList(...)");
        for (HealthBloodPressureStatistics.ListBean listBean : list) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(HealthItem.TYPE_AVG_DBP_Y, listBean.getAverageDiastolicY());
            jSONObject2.put(HealthItem.TYPE_AVG_SBP_Y, listBean.getAverageSystolicY());
            jSONObject2.put(HealthItem.TYPE_AVG_PULSE, listBean.getPulse());
            arrayList.add(new HealthItem(listBean.getX(), jSONObject2));
        }
        return new HealthData(config.getStartTime(), config.getType(), "", jSONObject, null, 2, arrayList, 16, null);
    }

    public final HealthData dealWakeMetData(HealthConfig config, HealthMetStatistics data) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(data, "data");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(HealthData.STATISTICS_AVG_MET, data.getAvgMet());
        jSONObject.put(HealthData.STATISTICS_GOAL_MET, data.getGoalMet());
        jSONObject.put(HealthData.STATISTICS_SUM_MET, data.getSumMet());
        if (data.getAvgMet() == 0 && data.getGoalMet() == 0 && data.getSumMet() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        List<HealthMetStatistics.ListBean> list = data.getList();
        Intrinsics.checkNotNullExpressionValue(list, "getList(...)");
        for (HealthMetStatistics.ListBean listBean : list) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("y", listBean.getY());
            arrayList.add(new HealthItem(listBean.getX(), jSONObject2));
        }
        return new HealthData(config.getStartTime(), config.getType(), "", jSONObject, null, 2, arrayList, 16, null);
    }

    public final HealthData dealWakeCommonData(HealthConfig config, HealthCommonStatistics data) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(data, "data");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(HealthData.STATISTICS_AVERAGE, data.getAverage());
        jSONObject.put(HealthData.STATISTICS_MAXIMUM, data.getMaximum());
        jSONObject.put(HealthData.STATISTICS_MINIMUM, data.getMinimum());
        jSONObject.put(HealthData.STATISTICS_RECENTLY, data.getRecently());
        ArrayList arrayList = new ArrayList();
        List<HealthCommonStatistics.ListBean> list = data.getList();
        Intrinsics.checkNotNullExpressionValue(list, "getList(...)");
        for (HealthCommonStatistics.ListBean listBean : list) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(HealthItem.TYPE_MAX_Y, listBean.getMaxY());
            jSONObject2.put(HealthItem.TYPE_MIN_Y, listBean.getMinY());
            arrayList.add(new HealthItem(listBean.getX(), jSONObject2));
        }
        return new HealthData(config.getStartTime(), config.getType(), "", jSONObject, null, 2, arrayList, 16, null);
    }

    public final HealthData dealWakeCommonFloatData(HealthConfig config, HealthCommonFloatStatistics data) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(data, "data");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(HealthData.STATISTICS_AVERAGE, Float.valueOf(data.getAverage()));
        jSONObject.put(HealthData.STATISTICS_MAXIMUM, Float.valueOf(data.getMaximum()));
        jSONObject.put(HealthData.STATISTICS_MINIMUM, Float.valueOf(data.getMinimum()));
        jSONObject.put(HealthData.STATISTICS_RECENTLY, Float.valueOf(data.getRecently()));
        ArrayList arrayList = new ArrayList();
        List<HealthCommonFloatStatistics.ListBean> list = data.getList();
        Intrinsics.checkNotNullExpressionValue(list, "getList(...)");
        for (HealthCommonFloatStatistics.ListBean listBean : list) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(HealthItem.TYPE_MAX_Y, Float.valueOf(listBean.getMaxY()));
            jSONObject2.put(HealthItem.TYPE_MIN_Y, Float.valueOf(listBean.getMinY()));
            arrayList.add(new HealthItem(listBean.getX(), jSONObject2));
        }
        return new HealthData(config.getStartTime(), config.getType(), "", jSONObject, null, 2, arrayList, 16, null);
    }

    public final HealthData dealWakeWeightData(HealthConfig config, HealthWeightStatistics data) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(data, "data");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(HealthData.STATISTICS_AVG_WEIGHT, Float.valueOf(data.getAvgWeight()));
        jSONObject.put(HealthData.STATISTICS_BMI, Float.valueOf(data.getAvgBmi()));
        jSONObject.put(HealthData.STATISTICS_LAST_WEIGHT, Float.valueOf(data.getLastWeight()));
        jSONObject.put("weight", Float.valueOf(data.getWeight()));
        ArrayList arrayList = new ArrayList();
        List<HealthWeightStatistics.ListBean> list = data.getList();
        Intrinsics.checkNotNullExpressionValue(list, "getList(...)");
        for (HealthWeightStatistics.ListBean listBean : list) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("y", Float.valueOf(listBean.getY()));
            arrayList.add(new HealthItem(listBean.getX(), jSONObject2));
        }
        return new HealthData(config.getStartTime(), config.getType(), "", jSONObject, null, 2, arrayList, 16, null);
    }

    public final HealthData dealWakeBloodSugarData(HealthConfig config, HealthBloodGlucoseStatistics data) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(data, "data");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(HealthData.STATISTICS_AVERAGE, Float.valueOf(data.getAverage()));
        jSONObject.put(HealthData.STATISTICS_MAXIMUM, Float.valueOf(data.getMaximum()));
        jSONObject.put(HealthData.STATISTICS_MINIMUM, Float.valueOf(data.getMinimum()));
        jSONObject.put(HealthData.STATISTICS_RECENTLY, Float.valueOf(data.getRecently()));
        ArrayList arrayList = new ArrayList();
        List<HealthBloodGlucoseStatistics.ListBean> list = data.getList();
        Intrinsics.checkNotNullExpressionValue(list, "getList(...)");
        for (HealthBloodGlucoseStatistics.ListBean listBean : list) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(HealthItem.TYPE_MIN_Y, Float.valueOf(listBean.getMinY()));
            jSONObject2.put(HealthItem.TYPE_MAX_Y, Float.valueOf(listBean.getMaxY()));
            jSONObject2.put(HealthItem.TYPE_BS_MAX_TYPE, listBean.getMaxType());
            jSONObject2.put(HealthItem.TYPE_BS_MIN_TYPE, listBean.getMinType());
            arrayList.add(new HealthItem(listBean.getX(), jSONObject2));
        }
        return new HealthData(config.getStartTime(), config.getType(), "", jSONObject, null, 2, arrayList, 16, null);
    }

    public final HealthData dealWakeActiveStrengthData(HealthConfig config, ActiveStrengthStatistics data) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(data, "data");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(HealthData.STATISTICS_CYCLE_PERCENT, data.getCyclePercent());
        jSONObject.put(HealthData.STATISTICS_RUN_PERCENT, data.getRunPercent());
        jSONObject.put(HealthData.STATISTICS_WALK_PERCENT, data.getWalkPercent());
        jSONObject.put(HealthData.STATISTICS_TRAIN_PERCENT, data.getExercisePercent());
        jSONObject.put(HealthData.STATISTICS_OTHER_PERCENT, data.getOtherPercent());
        jSONObject.put("total", data.getTotal());
        jSONObject.put(HealthData.STATISTICS_AVG, data.getAvg());
        ArrayList arrayList = new ArrayList();
        List<ActiveStrengthStatistics.ListBean> list = data.getList();
        Intrinsics.checkNotNullExpressionValue(list, "getList(...)");
        for (ActiveStrengthStatistics.ListBean listBean : list) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("y", listBean.getY());
            arrayList.add(new HealthItem(listBean.getX(), jSONObject2));
        }
        return new HealthData(config.getStartTime(), config.getType(), "", jSONObject, null, 2, arrayList, 16, null);
    }

    public final HealthData dealWakeActiveTimeData(HealthConfig config, ActiveTimeStatistics data) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(data, "data");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("total", data.getTotal());
        jSONObject.put(HealthData.STATISTICS_AVG, data.getAvg());
        ArrayList arrayList = new ArrayList();
        List<ActiveTimeStatistics.ListBean> list = data.getList();
        Intrinsics.checkNotNullExpressionValue(list, "getList(...)");
        for (ActiveTimeStatistics.ListBean listBean : list) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("y", listBean.getY());
            arrayList.add(new HealthItem(listBean.getX(), jSONObject2));
        }
        return new HealthData(config.getStartTime(), config.getType(), "", jSONObject, null, 2, arrayList, 16, null);
    }

    public final HealthData dealWakeActiveHeatData(HealthConfig config, ActiveHeatStatistics data) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(data, "data");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(HealthData.STATISTICS_CYCLE_PERCENT, data.getCyclePercent());
        jSONObject.put(HealthData.STATISTICS_RUN_PERCENT, data.getRunPercent());
        jSONObject.put(HealthData.STATISTICS_WALK_PERCENT, data.getWalkPercent());
        jSONObject.put(HealthData.STATISTICS_TRAIN_PERCENT, data.getExercisePercent());
        jSONObject.put(HealthData.STATISTICS_OTHER_PERCENT, data.getOtherPercent());
        jSONObject.put("total", data.getTotal());
        jSONObject.put(HealthData.STATISTICS_AVG, data.getAvg());
        ArrayList arrayList = new ArrayList();
        List<ActiveHeatStatistics.ListBean> list = data.getList();
        Intrinsics.checkNotNullExpressionValue(list, "getList(...)");
        for (ActiveHeatStatistics.ListBean listBean : list) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("y", listBean.getY());
            arrayList.add(new HealthItem(listBean.getX(), jSONObject2));
        }
        return new HealthData(config.getStartTime(), config.getType(), "", jSONObject, null, 2, arrayList, 16, null);
    }

    public final HealthData dealWakeSleepApneaData(HealthConfig config, HealthSleepApneaStatistics data) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(data, "data");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(HealthData.STATISTICS_AVG, data.getAvg());
        jSONObject.put("total", data.getTotal());
        ArrayList arrayList = new ArrayList();
        List<HealthSleepApneaStatistics.ListBean> list = data.getList();
        Intrinsics.checkNotNullExpressionValue(list, "getList(...)");
        for (HealthSleepApneaStatistics.ListBean listBean : list) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("y", listBean.getY());
            arrayList.add(new HealthItem(listBean.getX(), jSONObject2));
        }
        return new HealthData(config.getStartTime(), config.getType(), "", jSONObject, null, 2, arrayList, 16, null);
    }
}
