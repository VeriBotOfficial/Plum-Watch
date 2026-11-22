package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;

/* loaded from: classes5.dex */
public class jv0 extends qy {
    public final String b;

    public jv0(IllegalStateException illegalStateException, kv0 kv0Var) {
        super("Decoder failed: " + (kv0Var == null ? null : kv0Var.f16054a), illegalStateException);
        this.b = f92.f15466a >= 21 ? a(illegalStateException) : null;
    }

    private static String a(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        return null;
    }
}
