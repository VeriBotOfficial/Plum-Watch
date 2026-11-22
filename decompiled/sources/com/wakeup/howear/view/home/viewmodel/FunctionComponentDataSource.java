package com.wakeup.howear.view.home.viewmodel;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DeviceHomePageViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/wakeup/howear/view/home/viewmodel/FunctionComponentDataSource;", "", "<init>", "(Ljava/lang/String;I)V", "CACHE", "REMOTE", "EMPTY_FALLBACK", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FunctionComponentDataSource {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FunctionComponentDataSource[] $VALUES;
    public static final FunctionComponentDataSource CACHE = new FunctionComponentDataSource("CACHE", 0);
    public static final FunctionComponentDataSource REMOTE = new FunctionComponentDataSource("REMOTE", 1);
    public static final FunctionComponentDataSource EMPTY_FALLBACK = new FunctionComponentDataSource("EMPTY_FALLBACK", 2);

    private static final /* synthetic */ FunctionComponentDataSource[] $values() {
        return new FunctionComponentDataSource[]{CACHE, REMOTE, EMPTY_FALLBACK};
    }

    public static EnumEntries<FunctionComponentDataSource> getEntries() {
        return $ENTRIES;
    }

    private FunctionComponentDataSource(String str, int i) {
    }

    static {
        FunctionComponentDataSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static FunctionComponentDataSource valueOf(String str) {
        return (FunctionComponentDataSource) Enum.valueOf(FunctionComponentDataSource.class, str);
    }

    public static FunctionComponentDataSource[] values() {
        return (FunctionComponentDataSource[]) $VALUES.clone();
    }
}
