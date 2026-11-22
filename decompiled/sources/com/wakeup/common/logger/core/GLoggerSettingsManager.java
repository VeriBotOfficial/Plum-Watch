package com.wakeup.common.logger.core;

import com.wakeup.common.logger.core.entity.GLogEntity;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class GLoggerSettingsManager {
    public static List<GLogEntity> entities = new ArrayList();

    public static List<GLogEntity> getEntities() {
        return entities;
    }
}
