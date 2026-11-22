package com.facebook.ads.redexgen.core;

import android.content.SharedPreferences;

/* renamed from: com.facebook.ads.redexgen.X.gf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2429gf implements O8 {
    public final SharedPreferences A00;

    public C2429gf(SharedPreferences sharedPreferences) {
        this.A00 = sharedPreferences;
    }

    @Override // com.facebook.ads.redexgen.core.O8
    public final C2430gg A6A() {
        return new C2430gg(this.A00.edit());
    }

    @Override // com.facebook.ads.redexgen.core.O8
    public final long A8I(String str, long j) {
        return this.A00.getLong(str, j);
    }

    @Override // com.facebook.ads.redexgen.core.O8
    public final String A96(String str, String str2) {
        return this.A00.getString(str, str2);
    }
}
