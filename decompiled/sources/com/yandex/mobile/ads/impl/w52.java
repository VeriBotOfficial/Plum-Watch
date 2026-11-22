package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.a62;

/* loaded from: classes5.dex */
public final class w52 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f17221a;
    public final String b;
    public final a62.a c;
    public final int d;
    public final byte[] e;

    public w52(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        hg.a((bArr2 == null) ^ (i == 0));
        this.f17221a = z;
        this.b = str;
        this.d = i;
        this.e = bArr2;
        this.c = new a62.a(a(str), i2, i3, bArr);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static int a(String str) {
        if (str == null) {
            return 1;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return 2;
            default:
                et0.d("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
