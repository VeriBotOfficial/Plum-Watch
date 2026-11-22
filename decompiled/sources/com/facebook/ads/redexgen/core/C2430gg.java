package com.facebook.ads.redexgen.core;

import android.content.SharedPreferences;

/* renamed from: com.facebook.ads.redexgen.X.gg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2430gg implements O7 {
    public final SharedPreferences.Editor A00;

    public C2430gg(SharedPreferences.Editor editor) {
        this.A00 = editor;
    }

    public final C2430gg A00(String str, long j) {
        this.A00.putLong(str, j);
        return this;
    }

    public final C2430gg A01(String str, String str2) {
        this.A00.putString(str, str2);
        return this;
    }

    public final void A02() {
        this.A00.apply();
    }
}
