package io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo;

/* loaded from: classes6.dex */
public class BatteryInfo {
    public final Integer batteryLevel;
    public final ChargeType chargeType;

    public BatteryInfo(Integer num, ChargeType chargeType) {
        this.batteryLevel = num;
        this.chargeType = chargeType;
    }
}
