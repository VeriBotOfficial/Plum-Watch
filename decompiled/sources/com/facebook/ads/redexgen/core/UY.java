package com.facebook.ads.redexgen.core;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.pm.PackageManager;
import android.net.Uri;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public final class UY implements InterfaceC1876Uf {
    public static byte[] A01;
    public final C2228dL A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 12);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.CosOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.WhereOptions, BuiltinOptions.WhileOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.WhereOptions, BuiltinOptions.FloorModOptions, 64, BuiltinOptions.SplitVOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.SquareOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.WhereOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.UniqueOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.RandomOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.RandomOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.LessOptions, BuiltinOptions.LessOptions, 5, 2, 31, 24, 13, 0, 0, BuiltinOptions.TileOptions, 30, 9, 10, 9, 30, 30, 9, 30, BuiltinOptions.FillOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.RandomOptions, BuiltinOptions.AbsOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.NegOptions, 34, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.GreaterOptions, 22, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.GreaterOptions};
    }

    public UY(C2228dL c2228dL) {
        this.A00 = c2228dL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A03(String str, boolean z, String str2, String str3, String str4, long j) {
        this.A00.A0F().AB9(str);
        PackageManager packageManager = this.A00.getPackageManager();
        if (packageManager == null) {
            this.A00.A0F().ABE(str);
            return false;
        }
        ContentResolver contentResolver = this.A00.getContentResolver();
        if (contentResolver == null) {
            this.A00.A0F().ABB(str);
            return false;
        }
        if (packageManager.resolveContentProvider(str, 0) == null) {
            this.A00.A0F().ABA(str);
            return false;
        }
        Uri parse = Uri.parse(A00(35, 10, 10) + str + A00(0, 1, 125) + str2);
        ContentValues values = new ContentValues();
        values.put(A00(17, 18, 47), (Integer) 1);
        values.put(A00(61, 5, 33), Boolean.valueOf(z));
        values.put(A00(45, 16, 96), str3);
        values.put(A00(66, 12, 69), str4);
        values.put(A00(1, 16, 52), Long.valueOf(j));
        try {
            contentResolver.insert(parse, values);
            this.A00.A0F().ABG(str);
            return true;
        } catch (UnsupportedOperationException unused) {
            this.A00.A0F().ABD(str);
            return false;
        } catch (Exception unused2) {
            this.A00.A0F().ABC(str);
            return false;
        }
    }

    public final void A04(boolean z, String str, String str2, String str3, long j, boolean z2) {
        this.A00.A0F().ABF();
        XU.A06.execute(new C1884Un(this, z, str, str2, str3, j, z2));
    }
}
