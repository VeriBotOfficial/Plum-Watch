package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class s21 {
    public static final a c;
    public static final s21 d;
    private static final /* synthetic */ s21[] e;
    private final String b;

    static {
        s21 s21Var = new s21(0, "AD_VIDEO_COMPLETE", "advideocomplete");
        s21 s21Var2 = new s21(1, "IMPRESSION_TRACKING_START", "impressionTrackingStart");
        s21 s21Var3 = new s21(2, "IMPRESSION_TRACKING_SUCCESS", "impressionTrackingSuccess");
        s21 s21Var4 = new s21(3, "CLOSE", "close");
        s21 s21Var5 = new s21(4, "OPEN", "open");
        s21 s21Var6 = new s21(5, "REWARDED_AD_COMPLETE", "rewardedAdComplete");
        s21 s21Var7 = new s21(6, "USE_CUSTOM_CLOSE", "usecustomclose");
        s21 s21Var8 = new s21(7, "UNSPECIFIED", "");
        d = s21Var8;
        s21[] s21VarArr = {s21Var, s21Var2, s21Var3, s21Var4, s21Var5, s21Var6, s21Var7, s21Var8, new s21(8, "AD_RENDERED", "adRendered")};
        e = s21VarArr;
        EnumEntriesKt.enumEntries(s21VarArr);
        c = new a(0);
    }

    public static s21 valueOf(String str) {
        return (s21) Enum.valueOf(s21.class, str);
    }

    public static s21[] values() {
        return (s21[]) e.clone();
    }

    private s21(int i, String str, String str2) {
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public static final class a {
        public static s21 a(String str) {
            for (s21 s21Var : s21.values()) {
                if (Intrinsics.areEqual(s21Var.a(), str)) {
                    return s21Var;
                }
            }
            return s21.d;
        }

        private a() {
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }
}
