package com.facebook.ads.redexgen.core;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Wn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1933Wn implements InvocationHandler {
    public static byte[] A03;
    public final /* synthetic */ int A00;
    public final /* synthetic */ SQ A01;
    public final /* synthetic */ LinkedBlockingQueue A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 52);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{BuiltinOptions.ArgMaxOptions, BuiltinOptions.NegOptions, BuiltinOptions.ExpOptions, BuiltinOptions.NegOptions, 61, BuiltinOptions.DequantizeOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.PadV2Options, BuiltinOptions.LessOptions, BuiltinOptions.PowOptions, 31, BuiltinOptions.LogicalOrOptions, 32, BuiltinOptions.CastOptions, BuiltinOptions.PowOptions, 2, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.ExpOptions, BuiltinOptions.LessOptions, BuiltinOptions.PadV2Options, BuiltinOptions.LessOptions, BuiltinOptions.PowOptions, 24, BuiltinOptions.EqualOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.LessOptions, BuiltinOptions.RangeOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.SquareOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.LeakyReluOptions, 29, 28, BuiltinOptions.TransposeConvOptions, 26, 23, 17, 25, 1, 7, 31, 1, 32, 23, 19, 22, 11};
    }

    public C1933Wn(int i, LinkedBlockingQueue linkedBlockingQueue, SQ sq) {
        this.A00 = i;
        this.A02 = linkedBlockingQueue;
        this.A01 = sq;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        try {
            if (method.getName().equals(A00(34, 16, 70)) && objArr.length == 1 && (objArr[0] instanceof List)) {
                for (Object c : (List) objArr[0]) {
                    String str = (String) c.getClass().getMethod(A00(7, 12, 120), new Class[0]).invoke(c, new Object[0]);
                    int intValue = ((Integer) c.getClass().getMethod(A00(19, 7, 120), new Class[0]).invoke(c, new Object[0])).intValue();
                    if (str == null && intValue == this.A00) {
                        byte[] value = (byte[]) c.getClass().getMethod(A00(26, 8, 26), new Class[0]).invoke(c, new Object[0]);
                        this.A02.put(value);
                        return null;
                    }
                }
                this.A02.put(null);
            }
        } catch (Throwable t) {
            this.A01.A08().AAy(A00(0, 7, 123), AbstractC1841Sv.A1G, new C1842Sw(t));
        }
        return null;
    }
}
