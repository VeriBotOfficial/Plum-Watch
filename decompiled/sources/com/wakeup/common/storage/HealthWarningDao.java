package com.wakeup.common.storage;

import com.wakeup.common.network.entity.healthwarning.HealthWarningModel;

/* loaded from: classes2.dex */
public class HealthWarningDao {
    private static final String CACHE_KEY = "cache_heal_warning";

    public static HealthWarningModel getHealthWarningModel() {
        return (HealthWarningModel) CacheManager.INSTANCE.getData(CACHE_KEY, HealthWarningModel.class);
    }

    public static int openState() {
        HealthWarningModel healthWarningModel = getHealthWarningModel();
        if (healthWarningModel == null) {
            return 0;
        }
        return healthWarningModel.getState();
    }

    public static void saveHealthWarning(HealthWarningModel HealthWarningModel) {
        removeHealthWarning();
        CacheManager.INSTANCE.saveData(CACHE_KEY, HealthWarningModel);
    }

    public static void editHealthWarning(HealthWarningModel HealthWarningModel) {
        CacheManager.INSTANCE.saveData(CACHE_KEY, HealthWarningModel);
    }

    public static HealthWarningModel saveHealthWarningInfo(HealthWarningModel model) {
        HealthWarningModel healthWarningModel = getHealthWarningModel();
        if (healthWarningModel == null) {
            saveHealthWarning(model);
            return model;
        }
        healthWarningModel.setAppTime(model.getAppTime());
        healthWarningModel.setContactNumber(model.getContactNumber());
        healthWarningModel.setContactType(model.getContactType());
        healthWarningModel.setDays(model.getDays());
        healthWarningModel.setLeftBuyTimes(model.getLeftBuyTimes());
        healthWarningModel.setLeftFreeTimes(model.getLeftFreeTimes());
        healthWarningModel.setState(model.getState());
        healthWarningModel.setUsedBuyTimes(model.getUsedBuyTimes());
        healthWarningModel.setUsedFreeTimes(model.getUsedFreeTimes());
        healthWarningModel.setUserBuyTimes(model.getUserBuyTimes());
        healthWarningModel.setUserFreeTimes(model.getUserFreeTimes());
        CacheManager.INSTANCE.saveData(CACHE_KEY, healthWarningModel);
        return healthWarningModel;
    }

    public static void removeHealthWarning() {
        CacheManager.INSTANCE.remove(CACHE_KEY);
    }
}
