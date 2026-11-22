package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.wakeup.commponent.constant.PagePath;
import com.wakeup.commponent.constant.ServicePathKt;
import com.wakeup.feature.health.HealthServiceImpl;
import com.wakeup.feature.health.bloodGlucose.BloodGlucoseAddActivity;
import com.wakeup.feature.health.bloodOxygen.BloodOxygenActivity;
import com.wakeup.feature.health.bloodPressure.BloodPressureActivity;
import com.wakeup.feature.health.bloodPressure.BloodPressureAddActivity;
import com.wakeup.feature.health.bodyindex.RecordSleepActivity;
import com.wakeup.feature.health.bodyindex.RecoveryIndexActivity;
import com.wakeup.feature.health.bodyindex.StrainIndexActivity;
import com.wakeup.feature.health.dashboard.HealthDashboardActivity;
import com.wakeup.feature.health.fatigue.FatigueActivity;
import com.wakeup.feature.health.fatigue.activity.BreathMusicActivity;
import com.wakeup.feature.health.heart.HeartActivity;
import com.wakeup.feature.health.rainbow.ActiveHeatActivity;
import com.wakeup.feature.health.rainbow.ActiveStrengthActivity;
import com.wakeup.feature.health.rainbow.ActiveTimeActivity;
import com.wakeup.feature.health.rainbow.DailySportActivity;
import com.wakeup.feature.health.rainbow.RainbowActivity;
import com.wakeup.feature.health.sleep.SleepActivity;
import com.wakeup.feature.health.sleep.SleepDetailActivity;
import com.wakeup.feature.health.sleep.SleepMusicActivity;
import com.wakeup.feature.health.sleep.WriteNoiseActivity;
import com.wakeup.feature.health.sleep.lenovo.LenovoSleepActivity;
import com.wakeup.feature.health.sleepapnea.SleepApneaActivity;
import com.wakeup.feature.health.step.StepActivity;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Group$$health implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(PagePath.PAGE_HEALTH_ACTIVE, RouteMeta.build(RouteType.ACTIVITY, ActiveTimeActivity.class, PagePath.PAGE_HEALTH_ACTIVE, "health", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_HEALTH_ADD_BG, RouteMeta.build(RouteType.ACTIVITY, BloodGlucoseAddActivity.class, "/health/addbg", "health", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_HEALTH_ADD_BP, RouteMeta.build(RouteType.ACTIVITY, BloodPressureAddActivity.class, "/health/addbp", "health", null, -1, Integer.MIN_VALUE));
        map.put(ServicePathKt.HEALTH_SERVICE, RouteMeta.build(RouteType.PROVIDER, HealthServiceImpl.class, ServicePathKt.HEALTH_SERVICE, "health", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_HEALTH_BO, RouteMeta.build(RouteType.ACTIVITY, BloodOxygenActivity.class, PagePath.PAGE_HEALTH_BO, "health", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_HEALTH_BP, RouteMeta.build(RouteType.ACTIVITY, BloodPressureActivity.class, PagePath.PAGE_HEALTH_BP, "health", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_HEALTH_DAILY, RouteMeta.build(RouteType.ACTIVITY, DailySportActivity.class, PagePath.PAGE_HEALTH_DAILY, "health", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_HEALTH_DASHBOARD, RouteMeta.build(RouteType.ACTIVITY, HealthDashboardActivity.class, PagePath.PAGE_HEALTH_DASHBOARD, "health", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_HEALTH_EXERCISE, RouteMeta.build(RouteType.ACTIVITY, ActiveStrengthActivity.class, PagePath.PAGE_HEALTH_EXERCISE, "health", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_HEALTH_FATIGUE, RouteMeta.build(RouteType.ACTIVITY, FatigueActivity.class, PagePath.PAGE_HEALTH_FATIGUE, "health", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_HEALTH_HEART, RouteMeta.build(RouteType.ACTIVITY, HeartActivity.class, PagePath.PAGE_HEALTH_HEART, "health", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_HEALTH_KCAL, RouteMeta.build(RouteType.ACTIVITY, ActiveHeatActivity.class, PagePath.PAGE_HEALTH_KCAL, "health", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.LENOVO_PAGE_HEALTH_SLEEP, RouteMeta.build(RouteType.ACTIVITY, LenovoSleepActivity.class, "/health/lenovosleep", "health", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_HEALTH_RAINBOW, RouteMeta.build(RouteType.ACTIVITY, RainbowActivity.class, PagePath.PAGE_HEALTH_RAINBOW, "health", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_HEALTH_RECORD_SLEEP, RouteMeta.build(RouteType.ACTIVITY, RecordSleepActivity.class, "/health/recordsleep", "health", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_HEALTH_RECOVERY_INDEX, RouteMeta.build(RouteType.ACTIVITY, RecoveryIndexActivity.class, "/health/recoveryindex", "health", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_HEALTH_SLEEP, RouteMeta.build(RouteType.ACTIVITY, SleepActivity.class, PagePath.PAGE_HEALTH_SLEEP, "health", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_SLEEP_APNEA, RouteMeta.build(RouteType.ACTIVITY, SleepApneaActivity.class, "/health/sleepapnea", "health", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_HEALTH_SLEEP_DETAIL, RouteMeta.build(RouteType.ACTIVITY, SleepDetailActivity.class, "/health/sleepdetail", "health", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_SLEEP_MUSIC, RouteMeta.build(RouteType.ACTIVITY, SleepMusicActivity.class, "/health/sleepmusic", "health", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_HEALTH_STEP, RouteMeta.build(RouteType.ACTIVITY, StepActivity.class, PagePath.PAGE_HEALTH_STEP, "health", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_HEALTH_STRAIN_INDEX, RouteMeta.build(RouteType.ACTIVITY, StrainIndexActivity.class, "/health/strainindex", "health", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_WRITE_NOISE, RouteMeta.build(RouteType.ACTIVITY, WriteNoiseActivity.class, "/health/writenoise", "health", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_WRITE_NOISE_DETAILS, RouteMeta.build(RouteType.ACTIVITY, BreathMusicActivity.class, "/health/writenoised", "health", null, -1, Integer.MIN_VALUE));
    }
}
