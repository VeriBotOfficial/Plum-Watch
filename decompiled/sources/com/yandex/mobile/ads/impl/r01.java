package com.yandex.mobile.ads.impl;

import com.baidu.mapapi.http.wrapper.HttpManager;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class r01 {
    public static final a c;
    public static final r01 d;
    public static final r01 e;
    public static final r01 f;
    public static final r01 g;
    public static final r01 h;
    public static final r01 i;
    public static final r01 j;
    public static final r01 k;
    private static final /* synthetic */ r01[] l;
    private final String b;

    static {
        r01 r01Var = new r01(0, "GET", "GET");
        d = r01Var;
        r01 r01Var2 = new r01(1, "POST", "POST");
        e = r01Var2;
        r01 r01Var3 = new r01(2, HttpManager.HTTP_PUT, HttpManager.HTTP_PUT);
        f = r01Var3;
        r01 r01Var4 = new r01(3, HttpManager.HTTP_DELETE, HttpManager.HTTP_DELETE);
        g = r01Var4;
        r01 r01Var5 = new r01(4, "HEAD", "HEAD");
        h = r01Var5;
        r01 r01Var6 = new r01(5, "OPTIONS", "OPTIONS");
        i = r01Var6;
        r01 r01Var7 = new r01(6, "TRACE", "TRACE");
        j = r01Var7;
        r01 r01Var8 = new r01(7, "PATCH", "PATCH");
        k = r01Var8;
        r01[] r01VarArr = {r01Var, r01Var2, r01Var3, r01Var4, r01Var5, r01Var6, r01Var7, r01Var8};
        l = r01VarArr;
        EnumEntriesKt.enumEntries(r01VarArr);
        c = new a(0);
    }

    public static r01 valueOf(String str) {
        return (r01) Enum.valueOf(r01.class, str);
    }

    public static r01[] values() {
        return (r01[]) l.clone();
    }

    private r01(int i2, String str, String str2) {
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }
}
