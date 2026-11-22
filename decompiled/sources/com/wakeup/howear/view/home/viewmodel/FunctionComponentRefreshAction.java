package com.wakeup.howear.view.home.viewmodel;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FunctionComponentRefreshPolicy.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/wakeup/howear/view/home/viewmodel/FunctionComponentRefreshAction;", "", "<init>", "(Ljava/lang/String;I)V", "RETAIN_CACHE", "RENDER_EMPTY_FALLBACK", "RENDER_REMOTE", "MARK_REMOTE", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FunctionComponentRefreshAction {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FunctionComponentRefreshAction[] $VALUES;
    public static final FunctionComponentRefreshAction RETAIN_CACHE = new FunctionComponentRefreshAction("RETAIN_CACHE", 0);
    public static final FunctionComponentRefreshAction RENDER_EMPTY_FALLBACK = new FunctionComponentRefreshAction("RENDER_EMPTY_FALLBACK", 1);
    public static final FunctionComponentRefreshAction RENDER_REMOTE = new FunctionComponentRefreshAction("RENDER_REMOTE", 2);
    public static final FunctionComponentRefreshAction MARK_REMOTE = new FunctionComponentRefreshAction("MARK_REMOTE", 3);

    private static final /* synthetic */ FunctionComponentRefreshAction[] $values() {
        return new FunctionComponentRefreshAction[]{RETAIN_CACHE, RENDER_EMPTY_FALLBACK, RENDER_REMOTE, MARK_REMOTE};
    }

    public static EnumEntries<FunctionComponentRefreshAction> getEntries() {
        return $ENTRIES;
    }

    private FunctionComponentRefreshAction(String str, int i) {
    }

    static {
        FunctionComponentRefreshAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static FunctionComponentRefreshAction valueOf(String str) {
        return (FunctionComponentRefreshAction) Enum.valueOf(FunctionComponentRefreshAction.class, str);
    }

    public static FunctionComponentRefreshAction[] values() {
        return (FunctionComponentRefreshAction[]) $VALUES.clone();
    }
}
