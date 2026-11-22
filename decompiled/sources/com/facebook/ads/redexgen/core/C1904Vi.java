package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.json.JSONException;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Vi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1904Vi implements InterfaceC2334f4 {
    public static byte[] A02;
    public static String[] A03 = {"11yowYa9SjobATSyd4jbcYQKUh4edG44", "bHv0W2DtzV8d9jrYb9gmoc8MmzdN0fpB", "oW", "tKoi6cKGljbVocPn31APtwXZRyGd7igq", "ywmFCSl3Vn78B2eGXobUvwrScWlSo3bc", "aFROHHWcme9RokkBpAaOqFeveGyJeM2s", "QLtd5uCJprXFRqzwd31bhpzpUHhxzcVz", "aKhknuldK0UVZxwEW2ZbTGmFeUx0ymlu"};
    public final /* synthetic */ C2202cu A00;
    public final /* synthetic */ InterfaceC2332f2 A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] ^ i3) ^ 80);
            if (A03[0].charAt(21) == 'R') {
                throw new RuntimeException();
            }
            A03[0] = "rnyHoYqJfuEUpW7gm8XbWdjDtWL8fGmk";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.IfOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.SegmentSumOptions};
    }

    static {
        A01();
    }

    public C1904Vi(InterfaceC2332f2 interfaceC2332f2, C2202cu c2202cu) {
        this.A01 = interfaceC2332f2;
        this.A00 = c2202cu;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2334f4
    public final void A4e() {
        try {
            U7.A0V(this.A00).A2z(this.A01.A7a().optJSONObject(A00(0, 14, 83)));
        } catch (JSONException e) {
            this.A00.A08().A4A(e);
        }
    }
}
