package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.bn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2133bn implements InterfaceC1827Sh {
    public static byte[] A04;
    public Context A00;
    public final InterfaceC1826Sg A02;
    public final AtomicBoolean A03 = new AtomicBoolean(false);
    public C1824Se A01 = A00();

    static {
        A03();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 81);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{BuiltinOptions.AssignVariableOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.ATan2Options, BuiltinOptions.Conv3DOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.SignOptions, BuiltinOptions.RandomOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.HashtableFindOptions};
    }

    public C2133bn(Context context, InterfaceC1826Sg interfaceC1826Sg) {
        this.A00 = context;
        this.A02 = interfaceC1826Sg;
    }

    private C1824Se A00() {
        return C1824Se.A00(AbstractC1900Ve.A00(this.A00).getString(A01(0, 16, 100), null));
    }

    private void A02() {
        this.A02.ABw(new C2190ci(this));
    }

    public final void A04(String[] strArr, Integer num, Integer num2) {
        C1824Se c1824Se = new C1824Se(strArr, num, num2);
        C1824Se newSettings = this.A01;
        if (c1824Se.equals(newSettings)) {
            return;
        }
        this.A01 = c1824Se;
        this.A03.set(true);
        SharedPreferences.Editor edit = AbstractC1900Ve.A00(this.A00).edit();
        C1824Se newSettings2 = this.A01;
        edit.putString(A01(0, 16, 100), newSettings2.A07()).apply();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1827Sh
    public final C1824Se A7c() {
        A02();
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1827Sh
    public final boolean AAY() {
        A02();
        if (this.A01 == null) {
            return false;
        }
        Set<String> A0a = U7.A0a(this.A00);
        String identifier = this.A01.A07();
        Iterator<String> it = A0a.iterator();
        while (it.hasNext()) {
            if (identifier.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1827Sh
    public final boolean AJC() {
        A02();
        return this.A03.getAndSet(false);
    }
}
