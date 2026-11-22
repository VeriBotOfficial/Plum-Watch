package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.za, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3718za extends M2 {
    public C3718za(int i) {
        super(i);
    }

    @Override // io.appmetrica.analytics.impl.M2, io.appmetrica.analytics.impl.Aa
    public final C3332jn a(String str) {
        int i = 0;
        if (str != null) {
            int length = str.length();
            int i2 = this.f17968a;
            if (length > i2) {
                String substring = str.substring(0, i2);
                i = str.getBytes().length - substring.getBytes().length;
                str = substring;
            }
        }
        return new C3332jn(str, new C3586u3(i));
    }
}
