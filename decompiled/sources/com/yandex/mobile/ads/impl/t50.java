package com.yandex.mobile.ads.impl;

import android.javax.sip.message.Request;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class t50 {
    public static final a c;
    public static final t50 d;
    public static final t50 e;
    public static final t50 f;
    public static final t50 g;
    public static final t50 h;
    public static final t50 i;
    private static final /* synthetic */ t50[] j;
    private final int b;

    static {
        t50 t50Var = new t50(0, 0, "NO_ERROR");
        d = t50Var;
        t50 t50Var2 = new t50(1, 1, "PROTOCOL_ERROR");
        e = t50Var2;
        t50 t50Var3 = new t50(2, 2, "INTERNAL_ERROR");
        f = t50Var3;
        t50 t50Var4 = new t50(3, 3, "FLOW_CONTROL_ERROR");
        g = t50Var4;
        t50 t50Var5 = new t50(4, 4, "SETTINGS_TIMEOUT");
        t50 t50Var6 = new t50(5, 5, "STREAM_CLOSED");
        t50 t50Var7 = new t50(6, 6, "FRAME_SIZE_ERROR");
        t50 t50Var8 = new t50(7, 7, "REFUSED_STREAM");
        h = t50Var8;
        t50 t50Var9 = new t50(8, 8, Request.CANCEL);
        i = t50Var9;
        t50[] t50VarArr = {t50Var, t50Var2, t50Var3, t50Var4, t50Var5, t50Var6, t50Var7, t50Var8, t50Var9, new t50(9, 9, "COMPRESSION_ERROR"), new t50(10, 10, "CONNECT_ERROR"), new t50(11, 11, "ENHANCE_YOUR_CALM"), new t50(12, 12, "INADEQUATE_SECURITY"), new t50(13, 13, "HTTP_1_1_REQUIRED")};
        j = t50VarArr;
        EnumEntriesKt.enumEntries(t50VarArr);
        c = new a(0);
    }

    public static t50 valueOf(String str) {
        return (t50) Enum.valueOf(t50.class, str);
    }

    public static t50[] values() {
        return (t50[]) j.clone();
    }

    private t50(int i2, int i3, String str) {
        this.b = i3;
    }

    public final int a() {
        return this.b;
    }

    public static final class a {
        public static t50 a(int i) {
            for (t50 t50Var : t50.values()) {
                if (t50Var.a() == i) {
                    return t50Var;
                }
            }
            return null;
        }

        private a() {
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }
}
