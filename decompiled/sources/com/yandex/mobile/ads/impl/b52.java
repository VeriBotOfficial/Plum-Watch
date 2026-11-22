package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;
import org.apache.commons.net.ntp.NtpV3Packet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b52 {
    public static final b52 b;
    public static final b52 c;
    public static final b52 d;
    public static final b52 e;
    public static final b52 f;
    private static final /* synthetic */ b52[] g;

    static {
        b52 b52Var = new b52(0, NtpV3Packet.TYPE_TIME);
        b = b52Var;
        b52 b52Var2 = new b52(1, "PERCENTAGE");
        c = b52Var2;
        b52 b52Var3 = new b52(2, "START");
        d = b52Var3;
        b52 b52Var4 = new b52(3, "END");
        e = b52Var4;
        b52 b52Var5 = new b52(4, "POSITION");
        f = b52Var5;
        b52[] b52VarArr = {b52Var, b52Var2, b52Var3, b52Var4, b52Var5};
        g = b52VarArr;
        EnumEntriesKt.enumEntries(b52VarArr);
    }

    public static b52 valueOf(String str) {
        return (b52) Enum.valueOf(b52.class, str);
    }

    public static b52[] values() {
        return (b52[]) g.clone();
    }

    private b52(int i, String str) {
    }
}
