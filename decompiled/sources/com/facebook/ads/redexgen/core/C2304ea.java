package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.ea, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2304ea implements InterfaceC1804Rj {
    public static byte[] A03;
    public static String[] A04 = {"1hpByTARN6eOnQ", "46DvCO0dFj9d90pc7Bl3Va1pW3afVu0G", "LtfSHnVMNf9jD1VPw2QJdb6akNXb3KRw", "UXeRQ2HNaneiXsHAoGvRBzblNiVPPyfq", "WcHPi3i27m6LdaHLnkH9ENRpFxyJu3g8", "FTcDokCppzFM6olvGfJVNXVubstDZ8VZ", "v3Z7C81p3UBYKX6nY0MAEeka3DNz7RKw", "vwYfKziuTy1RLYscQHjTEDI4uYjWuvBq"};
    public final InterfaceC2332f2 A01;
    public Set<InterfaceC1807Rm> A00 = new HashSet();
    public final List<InterfaceC1806Rl> A02 = new ArrayList();

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 81);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{BuiltinOptions.LeakyReluOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.AbsOptions, 24, BuiltinOptions.ReverseV2Options, BuiltinOptions.LeakyReluOptions, BuiltinOptions.AbsOptions, 24, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.EqualOptions, BuiltinOptions.EqualOptions, 35, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.EqualOptions};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public synchronized void A03() {
        if (!this.A01.AAV()) {
            BuildConfigApi.isDebug();
            return;
        }
        Set<InterfaceC1807Rm> A01 = A01(this.A01.A7a());
        if (!this.A00.equals(A01) && A01 != null) {
            this.A00 = A01;
            Iterator<InterfaceC1806Rl> it = this.A02.iterator();
            while (it.hasNext()) {
                it.next().A4B();
            }
        }
        if (BuildConfigApi.isDebug()) {
            for (InterfaceC1807Rm interfaceC1807Rm : this.A00) {
                String.format(Locale.US, A00(0, 8, 58), interfaceC1807Rm.A9G(), interfaceC1807Rm.getUrl());
            }
        }
    }

    static {
        A02();
    }

    public C2304ea(InterfaceC1398Bn interfaceC1398Bn) {
        this.A01 = interfaceC1398Bn.A5M(EnumC2333f3.A0B);
        this.A01.A3t(new C2351fM(this));
        A03();
    }

    public static Set<InterfaceC1807Rm> A01(JSONObject jSONObject) {
        C2297eT A00;
        HashSet hashSet = new HashSet();
        JSONArray optJSONArray = jSONObject.optJSONArray(A00(8, 6, 23));
        if (optJSONArray == null) {
            return null;
        }
        int i = 0;
        while (true) {
            int i2 = optJSONArray.length();
            if (A04[2].charAt(7) != 'M') {
                throw new RuntimeException();
            }
            A04[0] = "HjevAVNXdTQxpc55Yqf8Zim5Y";
            if (i < i2) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject == null || (A00 = C2297eT.A00(optJSONObject)) == null) {
                    return null;
                }
                hashSet.add(A00);
                i++;
            } else {
                return hashSet;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1804Rj
    public final void A3s(InterfaceC1806Rl interfaceC1806Rl) {
        this.A02.add(interfaceC1806Rl);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1804Rj
    public final synchronized Set<InterfaceC1807Rm> A6p() {
        return new HashSet(this.A00);
    }
}
