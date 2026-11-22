package com.yandex.mobile.ads.impl;

import com.unity3d.ads.core.data.model.exception.GatewayException;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class gl0 {
    public static final gl0 c;
    public static final gl0 d;
    public static final gl0 e;
    public static final gl0 f;
    private static final /* synthetic */ gl0[] g;
    private final String b;

    static {
        gl0 gl0Var = new gl0(0, "INITIALIZATION", GatewayException.GATEWAY_RESPONSE_DEPTH_INITIALIZATION);
        c = gl0Var;
        gl0 gl0Var2 = new gl0(1, "AD", "ad");
        d = gl0Var2;
        gl0 gl0Var3 = new gl0(2, "INSTREAM", "instream");
        e = gl0Var3;
        gl0 gl0Var4 = new gl0(3, "BIDDER_TOKEN", "bidder_token");
        f = gl0Var4;
        gl0[] gl0VarArr = {gl0Var, gl0Var2, gl0Var3, gl0Var4};
        g = gl0VarArr;
        EnumEntriesKt.enumEntries(gl0VarArr);
    }

    public static gl0 valueOf(String str) {
        return (gl0) Enum.valueOf(gl0.class, str);
    }

    public static gl0[] values() {
        return (gl0[]) g.clone();
    }

    private gl0(int i, String str, String str2) {
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }
}
