package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public final class VM implements InterfaceC1711Ns {
    public static VM A01;
    public static byte[] A02;
    public static String[] A03 = {"JA9mFndCctStcDzVBolZEhplBWXHl3GV", "NcYgt8CJQWeZTs6r7gmN4DT79HnpXepC", "3XxDtH0VTaUV7XfCs333UHSSC4s6Co3p", "GzYduKaWaeKhPeumV22hkK4VttJt2TZR", "1SSiXu0qt70LSSG", "DSz0vhavMIehNnnYUsD24XzaqUk6jyxA", "cWkBnlzylFFk2PvMzvfAX6O9wvYh3tUg", "DdhgMLh6mU1KSfIF9B7woVtLM"};
    public static final String A04;
    public final LinkedHashMap<String, UK> A00 = new LinkedHashMap<>();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 124);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.WhileOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.FillOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.IfOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.RangeOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ReverseV2Options, 6, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.SliceOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.PackOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.SelectV2Options, 3, BuiltinOptions.DequantizeOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.ReadVariableOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.CallOnceOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.ATan2Options};
    }

    static {
        A02();
        A04 = VM.class.getSimpleName();
    }

    public static VM A00() {
        if (A01 == null) {
            A01 = new VM();
        }
        return A01;
    }

    public final InterfaceC1695Nc A03(String str) {
        UK adRecord = this.A00.get(str);
        if (adRecord != null) {
            return adRecord.A00;
        }
        String[] strArr = A03;
        if (strArr[1].charAt(31) == strArr[2].charAt(31)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[3] = "XrwELTKduoHwTv5Xe9Ueh6lc6nYoGsk4";
        strArr2[0] = "dmw4t0heQzRKMH67OrdKuJovyCEl55Ve";
        return null;
    }

    public final UK A04(String str) {
        return this.A00.get(str);
    }

    public final UK A05(String str, Messenger messenger, String str2) {
        UK uk = new UK(str, messenger, str2);
        this.A00.put(str, uk);
        return uk;
    }

    public final void A06() {
        Iterator<Map.Entry<String, UK>> it = this.A00.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A03;
            if (strArr[5].charAt(17) == strArr[6].charAt(17)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "uaiMeFYOk8P5CT6awQd5iZTKLUhraaN2";
            strArr2[6] = "RG3ipiEhElKk8ivC3FwrEM9mKg3mEr0b";
            if (hasNext) {
                InterfaceC1695Nc interfaceC1695Nc = it.next().getValue().A00;
                if (interfaceC1695Nc != null) {
                    interfaceC1695Nc.destroy();
                }
                it.remove();
            } else {
                return;
            }
        }
    }

    public final void A07(int i, String str, Bundle bundle, Messenger messenger) {
        try {
            Message obtain = Message.obtain((Handler) null, i);
            if (str != null) {
                obtain.getData().putString(A01(30, 13, 95), str);
            }
            if (bundle != null) {
                obtain.getData().putBundle(A01(0, 17, 116), bundle);
            }
            messenger.send(obtain);
        } catch (RemoteException unused) {
            if (str != null) {
                A08(str);
            }
        }
    }

    public final void A08(String str) {
        UK uk = this.A00.get(str);
        if (uk != null && uk.A00 != null) {
            String str2 = A01(17, 13, 62) + str;
            uk.A00.destroy();
            this.A00.remove(str);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1711Ns
    public final void AED(int i, String str, Bundle bundle) {
        UK adRecord = A04(str);
        if (adRecord != null) {
            A07(i, str, bundle, adRecord.A02);
        }
        HashSet hashSet = new HashSet();
        Iterator<Map.Entry<String, UK>> it = this.A00.entrySet().iterator();
        while (it.hasNext()) {
            UK value = it.next().getValue();
            try {
                value.A02.send(Message.obtain((Handler) null, 3));
            } catch (RemoteException unused) {
                hashSet.add(value.A03);
            }
        }
        Iterator it2 = hashSet.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            String[] strArr = A03;
            if (strArr[4].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "oay5V0mz6qjd0xRXPgrRbPRiLoP0UxTC";
            strArr2[6] = "83Bq2rwwej5lQl4xIjWhMW1frgDiuUFT";
            if (hasNext) {
                A08((String) it2.next());
            } else {
                return;
            }
        }
    }
}
