package com.xiaomi.push;

/* loaded from: classes4.dex */
public enum gm {
    MISC_CONFIG(1),
    PLUGIN_CONFIG(2);


    /* renamed from: a, reason: collision with other field name */
    private final int f600a;

    gm(int i) {
        this.f600a = i;
    }

    public int a() {
        return this.f600a;
    }

    public static gm a(int i) {
        if (i == 1) {
            return MISC_CONFIG;
        }
        if (i != 2) {
            return null;
        }
        return PLUGIN_CONFIG;
    }
}
