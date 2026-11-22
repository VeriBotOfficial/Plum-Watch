package com.wakeup.common.network.logger;

import com.google.android.gms.stats.CodePackage;
import com.wakeup.common.logger.core.GLogExcutor;
import com.wakeup.common.logger.core.entity.GLogEntity;

/* loaded from: classes2.dex */
public class CommonNetworkLogger extends GLogExcutor {
    private CommonNetworkLogger(GLogEntity entity) {
        super(entity);
    }

    public static CommonNetworkLogger getInstance() {
        return CommonNetworkLoggerInstance.instance;
    }

    public static class CommonNetworkLoggerInstance {
        public static CommonNetworkLogger instance = new CommonNetworkLogger(initGLogEntity());

        private static GLogEntity initGLogEntity() {
            GLogEntity gLogEntity = new GLogEntity();
            gLogEntity.initClassName("CommonNetworkLogger");
            gLogEntity.initModuleName(CodePackage.COMMON);
            gLogEntity.initTypeName("NET");
            gLogEntity.initDefaultLevel(1);
            gLogEntity.initJsonLevel(1);
            gLogEntity.initFormatJson(true);
            gLogEntity.initTraceCount(0);
            gLogEntity.initForceShow(false);
            gLogEntity.initShowDivide(false);
            gLogEntity.initShowAll(true);
            gLogEntity.initMaxLengthCount(3);
            return gLogEntity;
        }
    }
}
