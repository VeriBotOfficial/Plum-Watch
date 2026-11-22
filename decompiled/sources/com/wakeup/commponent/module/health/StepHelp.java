package com.wakeup.commponent.module.health;

import com.wakeup.common.utils.DateUtil;
import com.wakeup.common.utils.NumberUtils;
import com.wakeup.common.utils.UserDataCalculate;
import com.wakeup.commponent.module.data.HealthData;
import com.wakeup.commponent.module.sport.SportTypeHelp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* compiled from: StepHelp.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ&\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ&\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006¨\u0006\u0011"}, d2 = {"Lcom/wakeup/commponent/module/health/StepHelp;", "", "<init>", "()V", "getStepAllData", "Lkotlin/Triple;", "", "", "list", "", "Lcom/wakeup/commponent/module/data/HealthData;", "getActiveDurationAndTimeAndKcal", "getStrength", "type", "step", "distance", "duration", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StepHelp {
    public static final StepHelp INSTANCE = new StepHelp();

    private StepHelp() {
    }

    public final Triple<Integer, Integer, Float> getStepAllData(List<HealthData> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Integer valueOf = Integer.valueOf(DateUtil.getHour(((HealthData) obj).getTime()));
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = (List) new ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((List) obj2).add(obj);
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Iterator it2 = ((Iterable) ((Map.Entry) it.next()).getValue()).iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            int value = ((HealthData) it2.next()).getValue(HealthData.VALUE_STEP_INTERVAL);
            while (it2.hasNext()) {
                int value2 = ((HealthData) it2.next()).getValue(HealthData.VALUE_STEP_INTERVAL);
                if (value < value2) {
                    value = value2;
                }
            }
            i += value;
        }
        return new Triple<>(Integer.valueOf(i), Integer.valueOf(MathKt.roundToInt(UserDataCalculate.getKcal(i))), Float.valueOf(UserDataCalculate.getMoveDistance(i) / 1000));
    }

    public final Triple<Integer, Integer, Integer> getActiveDurationAndTimeAndKcal(List<HealthData> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Integer valueOf = Integer.valueOf(DateUtil.getHour(((HealthData) obj).getTime()));
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = (List) new ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((List) obj2).add(obj);
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Iterator it = ((Iterable) entry.getValue()).iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            int value = ((HealthData) it.next()).getValue(HealthData.VALUE_TOTAL_STRENGTH);
            while (it.hasNext()) {
                int value2 = ((HealthData) it.next()).getValue(HealthData.VALUE_TOTAL_STRENGTH);
                if (value < value2) {
                    value = value2;
                }
            }
            i += value;
            Iterator it2 = ((Iterable) entry.getValue()).iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            int value3 = ((HealthData) it2.next()).getValue(HealthData.VALUE_IS_ACTIVITY_FINISH);
            while (it2.hasNext()) {
                int value4 = ((HealthData) it2.next()).getValue(HealthData.VALUE_IS_ACTIVITY_FINISH);
                if (value3 < value4) {
                    value3 = value4;
                }
            }
            i2 += value3;
            Iterator it3 = ((Iterable) entry.getValue()).iterator();
            if (!it3.hasNext()) {
                throw new NoSuchElementException();
            }
            int value5 = ((HealthData) it3.next()).getValue(HealthData.VALUE_TOTAL_KCAL);
            while (it3.hasNext()) {
                int value6 = ((HealthData) it3.next()).getValue(HealthData.VALUE_TOTAL_KCAL);
                if (value5 < value6) {
                    value5 = value6;
                }
            }
            i3 += value5;
        }
        return new Triple<>(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public final int getStrength(int type, int step, int distance, int duration) {
        int sportCategoryID = SportTypeHelp.INSTANCE.getSportCategoryID(type);
        if (sportCategoryID != 1006) {
            switch (sportCategoryID) {
                case 1001:
                case 1002:
                    return NumberUtils.formatNumberToInt(step / 238.0f);
                case 1003:
                    return NumberUtils.formatNumberToInt((distance / 0.8f) / 286.0f);
                default:
                    return 0;
            }
        }
        return NumberUtils.formatNumberToInt((duration * 0.403f) / 60);
    }
}
