package com.wakeup.howear.view.home.viewmodel;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FunctionComponentRefreshPolicy.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/wakeup/howear/view/home/viewmodel/DeviceListRefreshFailureAction;", "", "<init>", "(Ljava/lang/String;I)V", "RETAIN_LOCAL", "RENDER_EMPTY", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeviceListRefreshFailureAction {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DeviceListRefreshFailureAction[] $VALUES;
    public static final DeviceListRefreshFailureAction RETAIN_LOCAL = new DeviceListRefreshFailureAction("RETAIN_LOCAL", 0);
    public static final DeviceListRefreshFailureAction RENDER_EMPTY = new DeviceListRefreshFailureAction("RENDER_EMPTY", 1);

    private static final /* synthetic */ DeviceListRefreshFailureAction[] $values() {
        return new DeviceListRefreshFailureAction[]{RETAIN_LOCAL, RENDER_EMPTY};
    }

    public static EnumEntries<DeviceListRefreshFailureAction> getEntries() {
        return $ENTRIES;
    }

    private DeviceListRefreshFailureAction(String str, int i) {
    }

    static {
        DeviceListRefreshFailureAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static DeviceListRefreshFailureAction valueOf(String str) {
        return (DeviceListRefreshFailureAction) Enum.valueOf(DeviceListRefreshFailureAction.class, str);
    }

    public static DeviceListRefreshFailureAction[] values() {
        return (DeviceListRefreshFailureAction[]) $VALUES.clone();
    }
}
