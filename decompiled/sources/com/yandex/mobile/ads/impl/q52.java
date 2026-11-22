package com.yandex.mobile.ads.impl;

import io.nats.client.Options;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class q52 {
    public static final a c;
    public static final q52 d;
    public static final q52 e;
    public static final q52 f;
    public static final q52 g;
    public static final q52 h;
    private static final /* synthetic */ q52[] i;
    private final String b;

    static {
        q52 q52Var = new q52(0, "TLS_1_3", "TLSv1.3");
        d = q52Var;
        q52 q52Var2 = new q52(1, "TLS_1_2", Options.DEFAULT_SSL_PROTOCOL);
        e = q52Var2;
        q52 q52Var3 = new q52(2, "TLS_1_1", "TLSv1.1");
        f = q52Var3;
        q52 q52Var4 = new q52(3, "TLS_1_0", "TLSv1");
        g = q52Var4;
        q52 q52Var5 = new q52(4, "SSL_3_0", "SSLv3");
        h = q52Var5;
        q52[] q52VarArr = {q52Var, q52Var2, q52Var3, q52Var4, q52Var5};
        i = q52VarArr;
        EnumEntriesKt.enumEntries(q52VarArr);
        c = new a(0);
    }

    public static q52 valueOf(String str) {
        return (q52) Enum.valueOf(q52.class, str);
    }

    public static q52[] values() {
        return (q52[]) i.clone();
    }

    private q52(int i2, String str, String str2) {
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public static final class a {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @JvmStatic
        public static q52 a(String javaName) {
            Intrinsics.checkNotNullParameter(javaName, "javaName");
            int hashCode = javaName.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (javaName.equals("TLSv1.1")) {
                                return q52.f;
                            }
                            break;
                        case -503070502:
                            if (javaName.equals(Options.DEFAULT_SSL_PROTOCOL)) {
                                return q52.e;
                            }
                            break;
                        case -503070501:
                            if (javaName.equals("TLSv1.3")) {
                                return q52.d;
                            }
                            break;
                    }
                } else if (javaName.equals("TLSv1")) {
                    return q52.g;
                }
            } else if (javaName.equals("SSLv3")) {
                return q52.h;
            }
            throw new IllegalArgumentException("Unexpected TLS version: " + javaName);
        }

        private a() {
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }
}
