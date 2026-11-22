package com.yandex.mobile.ads.impl;

import java.io.IOException;
import kotlin.Deprecated;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class mm1 {
    public static final a c;
    public static final mm1 d;
    public static final mm1 e;

    @Deprecated(message = "OkHttp has dropped support for SPDY. Prefer {@link #HTTP_2}.")
    public static final mm1 f;
    public static final mm1 g;
    public static final mm1 h;
    public static final mm1 i;
    private static final /* synthetic */ mm1[] j;
    private final String b;

    static {
        mm1 mm1Var = new mm1(0, "HTTP_1_0", "http/1.0");
        d = mm1Var;
        mm1 mm1Var2 = new mm1(1, "HTTP_1_1", "http/1.1");
        e = mm1Var2;
        mm1 mm1Var3 = new mm1(2, "SPDY_3", "spdy/3.1");
        f = mm1Var3;
        mm1 mm1Var4 = new mm1(3, "HTTP_2", "h2");
        g = mm1Var4;
        mm1 mm1Var5 = new mm1(4, "H2_PRIOR_KNOWLEDGE", "h2_prior_knowledge");
        h = mm1Var5;
        mm1 mm1Var6 = new mm1(5, "QUIC", "quic");
        i = mm1Var6;
        mm1[] mm1VarArr = {mm1Var, mm1Var2, mm1Var3, mm1Var4, mm1Var5, mm1Var6};
        j = mm1VarArr;
        EnumEntriesKt.enumEntries(mm1VarArr);
        c = new a(0);
    }

    public static mm1 valueOf(String str) {
        return (mm1) Enum.valueOf(mm1.class, str);
    }

    public static mm1[] values() {
        return (mm1[]) j.clone();
    }

    private mm1(int i2, String str, String str2) {
        this.b = str2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.b;
    }

    public static final class a {
        @JvmStatic
        public static mm1 a(String protocol) throws IOException {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            mm1 mm1Var = mm1.d;
            if (Intrinsics.areEqual(protocol, mm1Var.b)) {
                return mm1Var;
            }
            mm1 mm1Var2 = mm1.e;
            if (Intrinsics.areEqual(protocol, mm1Var2.b)) {
                return mm1Var2;
            }
            mm1 mm1Var3 = mm1.h;
            if (Intrinsics.areEqual(protocol, mm1Var3.b)) {
                return mm1Var3;
            }
            mm1 mm1Var4 = mm1.g;
            if (Intrinsics.areEqual(protocol, mm1Var4.b)) {
                return mm1Var4;
            }
            mm1 mm1Var5 = mm1.f;
            if (Intrinsics.areEqual(protocol, mm1Var5.b)) {
                return mm1Var5;
            }
            mm1 mm1Var6 = mm1.i;
            if (Intrinsics.areEqual(protocol, mm1Var6.b)) {
                return mm1Var6;
            }
            throw new IOException("Unexpected protocol: " + protocol);
        }

        private a() {
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }
}
