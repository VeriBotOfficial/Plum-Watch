package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONObject;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class th2 implements tq0 {
    public static final th2 c;
    public static final th2 d;
    public static final th2 e;
    private static final /* synthetic */ th2[] f;
    private final String b;

    static {
        th2 th2Var = new th2(0, "DEFAULT", "default");
        c = th2Var;
        th2 th2Var2 = new th2(1, "LOADING", com.anythink.core.express.b.a.e);
        d = th2Var2;
        th2 th2Var3 = new th2(2, "HIDDEN", "hidden");
        e = th2Var3;
        th2[] th2VarArr = {th2Var, th2Var2, th2Var3};
        f = th2VarArr;
        EnumEntriesKt.enumEntries(th2VarArr);
    }

    public static th2 valueOf(String str) {
        return (th2) Enum.valueOf(th2.class, str);
    }

    public static th2[] values() {
        return (th2[]) f.clone();
    }

    private th2(int i, String str, String str2) {
        this.b = str2;
    }

    @Override // com.yandex.mobile.ads.impl.tq0
    public final String a() {
        String quote = JSONObject.quote(this.b);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return z0.a(new Object[]{quote}, 1, "state: %s", "format(...)");
    }
}
