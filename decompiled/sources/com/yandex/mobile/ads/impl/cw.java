package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class cw {
    public static final cw c;
    public static final cw d;
    public static final cw e;
    public static final cw f;
    private static final /* synthetic */ cw[] g;
    private final String b;

    static {
        cw cwVar = new cw(0, "CROSS_CLICKED", "cross_clicked");
        c = cwVar;
        cw cwVar2 = new cw(1, "CROSS_TIMER_START", "cross_timer_start");
        d = cwVar2;
        cw cwVar3 = new cw(2, "CROSS_TIMER_END", "cross_timer_end");
        e = cwVar3;
        cw cwVar4 = new cw(3, "FAILED_TO_CREATE_DOWNLOAD_MANAGER", "failed_to_create_download_manager");
        f = cwVar4;
        cw[] cwVarArr = {cwVar, cwVar2, cwVar3, cwVar4, new cw(4, "LISTENER_IS_NULL_ON_LOADING_FINISHED", "listener_is_null_on_loading_finished")};
        g = cwVarArr;
        EnumEntriesKt.enumEntries(cwVarArr);
    }

    public static cw valueOf(String str) {
        return (cw) Enum.valueOf(cw.class, str);
    }

    public static cw[] values() {
        return (cw[]) g.clone();
    }

    private cw(int i, String str, String str2) {
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }
}
