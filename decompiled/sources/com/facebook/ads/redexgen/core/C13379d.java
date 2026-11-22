package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.9d, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C13379d implements InterfaceC2840nl {
    public static byte[] A00;
    public static final InterfaceC12394w A01;
    public static final C13379d A02;

    public static /* synthetic */ C13379d A00() {
        return new C13379d();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{23, BuiltinOptions.PadV2Options, BuiltinOptions.DequantizeOptions, BuiltinOptions.LogSoftmaxOptions, 34, BuiltinOptions.SelectOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.PadV2Options, 35, 34, BuiltinOptions.EqualOptions, 3, BuiltinOptions.DequantizeOptions, BuiltinOptions.TileOptions, BuiltinOptions.DequantizeOptions, 20, BuiltinOptions.ArgMaxOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.EqualOptions, BuiltinOptions.LogSoftmaxOptions, 34, BuiltinOptions.CallOnceOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.LessOptions, BuiltinOptions.LessOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.TileOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.CastOptions, 34, BuiltinOptions.CallOnceOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.ShapeOptions, 34, BuiltinOptions.LessOptions, 34, 35};
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2840nl
    public final /* synthetic */ Map A8l() {
        return AbstractC12384v.A00(this);
    }

    static {
        A02();
        A02 = new C13379d();
        A01 = new InterfaceC12394w() { // from class: com.facebook.ads.redexgen.X.nb
            @Override // com.facebook.ads.redexgen.core.InterfaceC12394w
            public final InterfaceC2840nl A5A() {
                return C13379d.A00();
            }
        };
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2840nl
    public final void A3v(C5H c5h) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2840nl
    public final Uri A9H() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2840nl
    public final long AFy(AnonymousClass56 anonymousClass56) throws IOException {
        throw new IOException(A01(0, 38, 57));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2840nl
    public final void close() {
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass20
    public final int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }
}
