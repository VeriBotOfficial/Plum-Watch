package com.wakeup.feature.sport.manager;

import com.wakeup.common.storage.CacheManager;
import kotlin.Metadata;

/* compiled from: BroadcastManager.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fJ\u0006\u0010\u0010\u001a\u00020\tJ\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\tJ\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/wakeup/feature/sport/manager/BroadcastManager;", "", "<init>", "()V", "BROADCAST_FREQUENCY_SWITCH", "", "BROADCAST_FREQUENCY_TYPE", "BROADCAST_FREQUENCY_DATA", "TYPE_BROADCAST_DISTANCE", "", "TYPE_BROADCAST_DURATION", "getBroadcastFrequencySwitch", "", "saveBroadcastFrequencySwitch", "", "switch", "getBroadcastFrequencyType", "saveBroadcastFrequencyType", "type", "getBroadcastFrequencyData", "", "saveBroadcastFrequencyData", "data", "feature-sport_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BroadcastManager {
    private static final String BROADCAST_FREQUENCY_DATA = "broadcast_frequency_data";
    private static final String BROADCAST_FREQUENCY_SWITCH = "broadcast_frequency_switch";
    private static final String BROADCAST_FREQUENCY_TYPE = "broadcast_frequency_type";
    public static final BroadcastManager INSTANCE = new BroadcastManager();
    public static final int TYPE_BROADCAST_DISTANCE = 0;
    public static final int TYPE_BROADCAST_DURATION = 1;

    private BroadcastManager() {
    }

    public final boolean getBroadcastFrequencySwitch() {
        return CacheManager.getBoolean(BROADCAST_FREQUENCY_SWITCH, true);
    }

    public final void saveBroadcastFrequencySwitch(boolean r2) {
        CacheManager.saveBoolean(BROADCAST_FREQUENCY_SWITCH, r2);
    }

    public final int getBroadcastFrequencyType() {
        return CacheManager.INSTANCE.getInt(BROADCAST_FREQUENCY_TYPE);
    }

    public final void saveBroadcastFrequencyType(int type) {
        CacheManager.INSTANCE.saveInt(BROADCAST_FREQUENCY_TYPE, type);
    }

    public final float getBroadcastFrequencyData() {
        return CacheManager.INSTANCE.getFloat(BROADCAST_FREQUENCY_DATA);
    }

    public final void saveBroadcastFrequencyData(float data) {
        CacheManager.INSTANCE.saveFloat(BROADCAST_FREQUENCY_DATA, data);
    }
}
