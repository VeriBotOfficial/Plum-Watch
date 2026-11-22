package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.wakeup.common.DeviceFeatures;
import java.lang.reflect.Method;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Rx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1817Rx {
    public static String A00;
    public static byte[] A01;
    public static String[] A02 = {"jP5DLqFPT2uLfDhjwGtyJ", "b2Kf1V0V33xxSFNxYAUwKzTnuvA5CTmH", "utws2CXgYjyIi4p9N5JN7AtJgUuBwVKL", "iHkd", "J1QCfiNfulUMnwHMV72QByuh5OrpyBC4", "Ilbx2HAT56j3G7gTz5Evg9nZeC6mk12l", "SrkakodA8D", "LiqB"};
    public static final String A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C1810Rp A02(SQ sq) {
        Object A002;
        Method A022;
        Object A003;
        Method A023 = AbstractC1818Ry.A02(A00, A04(257, 29, 2), Context.class);
        if (A023 == null || (A002 = AbstractC1818Ry.A00(null, A023, sq)) == null || ((Integer) A002).intValue() != 0 || (A022 = AbstractC1818Ry.A02(A04(65, 57, 83), A04(DeviceFeatures.HEADSET_KEY_CALL, 20, 98), Context.class)) == null || (A003 = AbstractC1818Ry.A00(null, A022, sq)) == null) {
            return null;
        }
        Method A012 = AbstractC1818Ry.A01(A003.getClass(), A04(252, 5, 124), new Class[0]);
        Method A013 = AbstractC1818Ry.A01(A003.getClass(), A04(286, 24, 126), new Class[0]);
        if (A012 == null || A013 == null) {
            return null;
        }
        String str = (String) AbstractC1818Ry.A00(A003, A012, new Object[0]);
        Boolean bool = (Boolean) AbstractC1818Ry.A00(A003, A013, new Object[0]);
        if (str != null) {
            return new C1810Rp(str, bool != null && bool.booleanValue(), EnumC1809Ro.A06);
        }
        return null;
    }

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 90);
            if (A02[7].length() != 4) {
                throw new RuntimeException();
            }
            A02[0] = "KHgMerLXVce8bYpnKoYEO";
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A01 = new byte[]{BuiltinOptions.CumsumOptions, BuiltinOptions.FillOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.ReverseV2Options, 5, BuiltinOptions.SquareOptions, 64, BuiltinOptions.ReverseV2Options, 5, BuiltinOptions.FillOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.GatherNdOptions, 64, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.RankOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.SquareOptions, 5, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.ResizeNearestNeighborOptions, 5, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.LeakyReluOptions, 5, BuiltinOptions.FloorModOptions, BuiltinOptions.FillOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.LeakyReluOptions, 5, BuiltinOptions.ReverseV2Options, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ReverseSequenceOptions, 64, BuiltinOptions.FillOptions, BuiltinOptions.FloorDivOptions, 11, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.CosOptions, BuiltinOptions.RankOptions, 21, BuiltinOptions.IfOptions, BuiltinOptions.CosOptions, BuiltinOptions.CosOptions, BuiltinOptions.IfOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.DepthToSpaceOptions, 21, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.WhereOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.RangeOptions, BuiltinOptions.CosOptions, BuiltinOptions.AddNOptions, BuiltinOptions.NonMaxSuppressionV4Options, 21, BuiltinOptions.IfOptions, BuiltinOptions.RankOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.SignOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.HashtableImportOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.ATan2Options, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.ATan2Options, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.VarHandleOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.HashtableFindOptions, BuiltinOptions.SignOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.HashtableImportOptions, Byte.MAX_VALUE, BuiltinOptions.HashtableFindOptions, BuiltinOptions.SignOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.ATan2Options, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.CallOnceOptions, BuiltinOptions.HashtableSizeOptions, 64, BuiltinOptions.HashtableImportOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.HashtableFindOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.NegOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.HashtableOptions, 34, BuiltinOptions.NegOptions, BuiltinOptions.NegOptions, 34, BuiltinOptions.LessOptions, 32, BuiltinOptions.HashtableOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.PadV2Options, BuiltinOptions.ExpOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.NegOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.ExpOptions, BuiltinOptions.HashtableOptions, 34, BuiltinOptions.ArgMaxOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.ExpOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.ExpOptions, 32, BuiltinOptions.PadV2Options, BuiltinOptions.TransposeConvOptions, BuiltinOptions.GreaterOptions, 35, BuiltinOptions.GreaterOptions, 32, BuiltinOptions.ShapeOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.NotEqualOptions, 32, BuiltinOptions.ShapeOptions, BuiltinOptions.TileOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.DequantizeOptions, 32, BuiltinOptions.HashtableOptions, 22, 17, 4, 23, 17, BuiltinOptions.EqualOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.PackOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.TransposeConvOptions, 58, BuiltinOptions.TileOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.ArgMinOptions, 63, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.PackOptions, BuiltinOptions.CastOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.EqualOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.PackOptions, BuiltinOptions.PackOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.PowOptions, BuiltinOptions.UnsortedSegmentMinOptions, 17, BuiltinOptions.ArgMinOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.TransposeConvOptions, 58, BuiltinOptions.TileOptions, 6, 58, BuiltinOptions.ShapeOptions, BuiltinOptions.SelectOptions, 5, BuiltinOptions.TileOptions, BuiltinOptions.LogSoftmaxOptions, 32, 63, BuiltinOptions.EqualOptions, BuiltinOptions.TileOptions, BuiltinOptions.CastOptions, 3, 34, 63, 58, BuiltinOptions.GeluOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.ATan2Options, BuiltinOptions.ReadVariableOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.WhileOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.IfOptions, BuiltinOptions.AbsOptions, BuiltinOptions.WhileOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.LeakyReluOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.RankOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.AssignVariableOptions, BuiltinOptions.IfOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.RankOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.AddNOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.SquareOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.PadV2Options, 31, BuiltinOptions.ShapeOptions, BuiltinOptions.ShapeOptions, 63, BuiltinOptions.ExpandDimsOptions, 61, 8, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ExpOptions, 11, 61, BuiltinOptions.NegOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.PackOptions, 61, BuiltinOptions.PadV2Options, 25, BuiltinOptions.LessEqualOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.ArgMinOptions, 58, BuiltinOptions.ExpandDimsOptions, 61, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.RangeOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.BatchMatMulOptions, 64, BuiltinOptions.ReadVariableOptions, BuiltinOptions.RankOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.FloorDivOptions, 64};
    }

    static {
        A05();
        A03 = C1810Rp.class.getSimpleName();
        A00 = A04(DeviceFeatures.E_BOOK, 52, 12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (r3 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.core.C1810Rp A00(com.facebook.ads.redexgen.core.SQ r5) {
        /*
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            if (r1 == r0) goto L4a
            com.facebook.ads.redexgen.X.Rp r4 = A01(r5)
            if (r4 == 0) goto L35
            java.lang.String r0 = r4.A03()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.AbstractC1817Rx.A02
            r0 = 5
            r1 = r1[r0]
            r0 = 3
            char r1 = r1.charAt(r0)
            r0 = 120(0x78, float:1.68E-43)
            if (r1 == r0) goto L2c
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L2c:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.AbstractC1817Rx.A02
            java.lang.String r1 = "hh0RZKDdPPlAkARzc3g59"
            r0 = 0
            r2[r0] = r1
            if (r3 == 0) goto L39
        L35:
            com.facebook.ads.redexgen.X.Rp r4 = A02(r5)
        L39:
            if (r4 == 0) goto L45
            java.lang.String r0 = r4.A03()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L49
        L45:
            com.facebook.ads.redexgen.X.Rp r4 = A03(r5)
        L49:
            return r4
        L4a:
            r2 = 0
            r1 = 43
            r0 = 127(0x7f, float:1.78E-43)
            java.lang.String r1 = A04(r2, r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AbstractC1817Rx.A00(com.facebook.ads.redexgen.X.SQ):com.facebook.ads.redexgen.X.Rp");
    }

    public static C1810Rp A01(SQ sq) {
        SU adId = sq.A05().A8p();
        if (adId != null) {
            return new C1810Rp(adId.getId(), adId.AAO(), EnumC1809Ro.A02);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.facebook.ads.internal.attribution.GmsAttributionProvider$GoogleAdInfo] */
    public static C1810Rp A03(SQ sq) {
        ServiceConnectionC1816Rw serviceConnectionC1816Rw = new ServiceConnectionC1816Rw();
        Intent intent = new Intent(A04(122, 51, 31));
        intent.setPackage(A04(43, 22, 97));
        if (sq.bindService(intent, serviceConnectionC1816Rw, 1)) {
            try {
                final IBinder A022 = serviceConnectionC1816Rw.A02();
                ?? r0 = new IInterface(A022) { // from class: com.facebook.ads.internal.attribution.GmsAttributionProvider$GoogleAdInfo
                    public static byte[] A01;
                    public static String[] A02 = {"CGAQp5QWLLSg2Up0KS3Xu0sm6KBD8ljy", "Yp64XCOUL3mdw2EQzsnOwJCP4iXogchF", "0bXbaFV76JbdIHYzvJ", "7kYBXtp0pJ6J2QiQOtBXkhx4Mjb4MhNb", "Pqj6DcWbIXVdg5nys55lljt7m2mFJmbz", "gqs8Z9zjV1B", "yb2LGnYLr1jAVzG6", "kQWFHy19WQfgSFrPEiRm4PYEBX"};
                    public IBinder A00;

                    public static String A00(int i, int i2, int i3) {
                        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 103);
                        }
                        return new String(copyOfRange);
                    }

                    public static void A01() {
                        A01 = new byte[]{BuiltinOptions.SegmentSumOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.LessOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.BroadcastToOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.HashtableOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.LessOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.LessOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.Conv3DOptions, BuiltinOptions.GeluOptions, BuiltinOptions.LessOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.GeluOptions, BuiltinOptions.LessOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.Rfft2dOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.LessOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.LessOptions, BuiltinOptions.AbsOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.GeluOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.AbsOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.CosOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.SelectV2Options};
                    }

                    static {
                        A01();
                    }

                    {
                        this.A00 = A022;
                    }

                    public final String A02() throws RemoteException {
                        Parcel obtain = Parcel.obtain();
                        Parcel obtain2 = Parcel.obtain();
                        try {
                            obtain.writeInterfaceToken(A00(0, 68, 96));
                            this.A00.transact(1, obtain, obtain2, 0);
                            obtain2.readException();
                            String readString = obtain2.readString();
                            if (readString != null) {
                                return readString;
                            }
                            if (A02[2].length() == 16) {
                                throw new RuntimeException();
                            }
                            A02[3] = "0APG8T86KeB7s6esCzOnlOcV6mb8f0OX";
                            return A00(0, 0, 82);
                        } finally {
                            obtain2.recycle();
                            obtain.recycle();
                        }
                    }

                    public final boolean A03() throws RemoteException {
                        Parcel obtain = Parcel.obtain();
                        Parcel obtain2 = Parcel.obtain();
                        try {
                            obtain.writeInterfaceToken(A00(0, 68, 96));
                            boolean z = true;
                            obtain.writeInt(1);
                            this.A00.transact(2, obtain, obtain2, 0);
                            obtain2.readException();
                            if (obtain2.readInt() == 0) {
                                z = false;
                            }
                            return z;
                        } finally {
                            obtain2.recycle();
                            obtain.recycle();
                        }
                    }

                    @Override // android.os.IInterface
                    public final IBinder asBinder() {
                        return this.A00;
                    }
                };
                return new C1810Rp(r0.A02(), r0.A03(), EnumC1809Ro.A07);
            } catch (Throwable th) {
                try {
                    sq.A08().AAy(A04(225, 7, 73), AbstractC1841Sv.A1Q, new C1842Sw(th));
                } finally {
                    sq.unbindService(serviceConnectionC1816Rw);
                }
            }
        }
        return null;
    }
}
