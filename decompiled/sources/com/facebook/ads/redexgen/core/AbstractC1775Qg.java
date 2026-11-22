package com.facebook.ads.redexgen.core;

import android.util.Log;
import android.view.View;
import com.wakeup.common.DeviceFeatures;
import com.wakeup.commponent.module.sport.SportTypeConstant;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Qg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1775Qg {
    public static byte[] A0I;
    public static String[] A0J = {"elFBINX9KCZeeh3GuBtXNkrnzvQO2EpS", "90eRnITlqXrODLYCktUoA3f94MaN8E2n", "frZa4xykTTwKCwTkBfcIIin", "72h0olRZUROZW521vLa1lYqHWLi1sRbG", "kk2D46k9ZSS3Lo8lOZQg", "QRz6bzRDBRAzmbOrrZDxPPvKGEinNos5", "9IkI3xtzDHMbybABrSkeOgSSTxMSP2eR", "o2K5Iq3zbWnsvhRLVQUneLMfyrath7l2"};
    public static final List<Object> A0K;
    public C12756g A08;
    public WeakReference<C12756g> A09;
    public int A0C;
    public final View A0H;
    public int A03 = -1;
    public int A01 = -1;
    public long A05 = -1;
    public int A00 = -1;
    public int A04 = -1;
    public AbstractC1775Qg A06 = null;
    public AbstractC1775Qg A07 = null;
    public List<Object> A0A = null;
    public List<Object> A0B = null;
    public int A0D = 0;
    public QW A0F = null;
    public boolean A0G = false;
    public int A0E = 0;
    public int A02 = -1;

    public static String A08(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0I, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] ^ i3) ^ 54);
            String[] strArr = A0J;
            if (strArr[6].charAt(16) != strArr[5].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0J;
            strArr2[0] = "UeRrU6VIZhMUvjXaMrLT2TysGAtdmGOb";
            strArr2[1] = "zACgjBXCZF9ewGg4NUIKbeNCvKdUEEL0";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A0I = new byte[]{3, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 30, BuiltinOptions.RightShiftOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.PackOptions, 58, BuiltinOptions.RankOptions, 31, 24, 0, 23, 26, 31, 18, 25, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.RankOptions, 25, BuiltinOptions.RangeOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.IfOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.UnsortedSegmentSumOptions, Byte.MAX_VALUE, BuiltinOptions.BatchMatMulOptions, Byte.MAX_VALUE, BuiltinOptions.ReadVariableOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ExpandDimsOptions, 24, BuiltinOptions.FloorModOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.RankOptions, 5, BuiltinOptions.ExpOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.WhereOptions, 6, 22, 7, 20, 5, BuiltinOptions.WhereOptions, 18, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.SquareOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.RankOptions, BuiltinOptions.ATan2Options, BuiltinOptions.SelectOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.PowOptions, BuiltinOptions.EqualOptions, BuiltinOptions.SelectOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.LogicalAndOptions, 26, BuiltinOptions.SplitVOptions, BuiltinOptions.CosOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.IfOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.CosOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.DepthToSpaceOptions, 26, BuiltinOptions.HardSwishOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.AbsOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.FloorModOptions, 26, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.WhereOptions, BuiltinOptions.RangeOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.AbsOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.WhereOptions, BuiltinOptions.CosOptions, 2, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.AddNOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.RankOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.SparseToDenseOptions, 32, BuiltinOptions.GreaterOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.BroadcastToOptions, BuiltinOptions.IfOptions, BuiltinOptions.DensifyOptions, Byte.MAX_VALUE, BuiltinOptions.TransposeConvOptions, 27, 23, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.SignOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.FillOptions, 13, 34, 29, 17, 3, BuiltinOptions.DequantizeOptions, 25, 21, 7, BuiltinOptions.PowOptions, 31, 28, 20, 21, 2, 11, 61, 7, 18, 18, 7, 5, 14, 3, 2, BuiltinOptions.EqualOptions, 5, 20, 7, 22, BuiltinOptions.PackOptions, 58, 2, 9, 0, 15, 6, 4, BuiltinOptions.SparseToDenseOptions, 2, 19, 0, 17, BuiltinOptions.LogicalOrOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.ExpandDimsOptions, 21, 34, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.PadV2Options, BuiltinOptions.DequantizeOptions, BuiltinOptions.CastOptions, BuiltinOptions.PadV2Options, 34, BuiltinOptions.CallOnceOptions, 35, 34, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.EqualOptions, 34, BuiltinOptions.NegOptions, 34, BuiltinOptions.LessOptions, BuiltinOptions.TileOptions, 34, 35, BuiltinOptions.CallOnceOptions, BuiltinOptions.CastOptions, 34, BuiltinOptions.PadV2Options, BuiltinOptions.ArgMaxOptions, BuiltinOptions.SliceOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.LessOptions, BuiltinOptions.NegOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.TileOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.SelectOptions, 34, 35, BuiltinOptions.CallOnceOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.EqualOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.ExpOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.ExpandDimsOptions, 34, BuiltinOptions.TileOptions, 14, BuiltinOptions.ExpandDimsOptions, 21, 34, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.CastOptions, BuiltinOptions.PadV2Options, 34, BuiltinOptions.VarHandleOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.PadV2Options, BuiltinOptions.PadV2Options, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.ExpOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.EqualOptions, BuiltinOptions.CallOnceOptions, 29, 0, 17, 25, 34, 29, 17, 3, BuiltinOptions.CosOptions, 25, 21, 13, BuiltinOptions.CosOptions, 26, 27, 0, BuiltinOptions.CosOptions, 22, 17, BuiltinOptions.CosOptions, 26, 1, 24, 24, BuiltinOptions.SignOptions};
    }

    static {
        A0A();
        A0K = Collections.EMPTY_LIST;
    }

    public AbstractC1775Qg(View view) {
        if (view != null) {
            this.A0H = view;
            return;
        }
        throw new IllegalArgumentException(A08(SportTypeConstant.Course_chest_intermediate, 24, 66));
    }

    private void A09() {
        if (this.A0A == null) {
            this.A0A = new ArrayList();
            this.A0B = Collections.unmodifiableList(this.A0A);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(C12756g c12756g) {
        this.A0E = P3.A00(this.A0H);
        c12756g.A1z(this, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(C12756g c12756g) {
        c12756g.A1z(this, this.A0E);
        this.A0E = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0F() {
        return (this.A0C & 16) == 0 && P3.A0G(this.A0H);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0G() {
        return (this.A0C & 16) != 0;
    }

    private final boolean A0H() {
        if ((this.A0C & 512) == 0) {
            boolean A0f = A0f();
            if (A0J[2].length() != 23) {
                throw new RuntimeException();
            }
            A0J[4] = "dSQQEa0elVuDjjqhtuiH";
            if (!A0f) {
                return false;
            }
        }
        return true;
    }

    public final int A0M() {
        if (this.A08 == null) {
            return -1;
        }
        int A1C = this.A08.A1C(this);
        String[] strArr = A0J;
        if (strArr[7].charAt(1) != strArr[3].charAt(1)) {
            throw new RuntimeException();
        }
        A0J[2] = "FYB2N4b61bNhg9cwpN00hgm";
        return A1C;
    }

    public final int A0N() {
        return this.A00;
    }

    public final int A0O() {
        return this.A04 == -1 ? this.A03 : this.A04;
    }

    public final int A0P() {
        return this.A01;
    }

    public final long A0Q() {
        return this.A05;
    }

    public final List<Object> A0R() {
        if ((this.A0C & 1024) == 0) {
            if (this.A0A == null || this.A0A.size() == 0) {
                List<Object> list = A0K;
                String[] strArr = A0J;
                if (strArr[6].charAt(16) != strArr[5].charAt(16)) {
                    throw new RuntimeException();
                }
                A0J[2] = "hQ1JLXyYGxOkcwlW4dXhMkD";
                return list;
            }
            List<Object> list2 = this.A0B;
            String[] strArr2 = A0J;
            if (strArr2[0].charAt(4) == strArr2[1].charAt(4)) {
                return list2;
            }
            String[] strArr3 = A0J;
            strArr3[7] = "12FReyGhr0Gy9SAr2o7QhiY2oo1Ever4";
            strArr3[3] = "Q2P3QGMLTw8PDNq5VpeXaAuVADEzryB4";
            return list2;
        }
        return A0K;
    }

    public final void A0S() {
        this.A01 = -1;
        this.A04 = -1;
    }

    public final void A0T() {
        if (this.A0A != null) {
            this.A0A.clear();
        }
        this.A0C &= -1025;
        String[] strArr = A0J;
        if (strArr[6].charAt(16) != strArr[5].charAt(16)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0J;
        strArr2[0] = "zfgIUpP6NOwkKkp2713xr48Icx9i2htm";
        strArr2[1] = "7toV51THczyutnu9dsZIYiPQpALa8FIp";
    }

    public final void A0U() {
        this.A0C &= -33;
    }

    public final void A0V() {
        this.A0C &= -257;
    }

    public final void A0W() {
        this.A0C = 0;
        this.A03 = -1;
        this.A01 = -1;
        this.A05 = -1L;
        this.A04 = -1;
        this.A0D = 0;
        this.A06 = null;
        this.A07 = null;
        A0T();
        this.A0E = 0;
        this.A02 = -1;
        C12756g.A0s(this);
    }

    public final void A0X() {
        if (this.A01 == -1) {
            int i = this.A03;
            if (A0J[4].length() != 20) {
                throw new RuntimeException();
            }
            String[] strArr = A0J;
            strArr[6] = "ZtNXNLZ2mB5tglrdrkplF8NneRyyOdxT";
            strArr[5] = "cQ2wGPgO9l4ITB75rCj9hGEnqQmfMy7J";
            this.A01 = i;
        }
    }

    public final void A0Y() {
        this.A0F.A0Y(this);
    }

    public final void A0Z(int i) {
        this.A0C |= i;
    }

    public final void A0a(int i, int i2) {
        this.A0C = (this.A0C & (~i2)) | (i & i2);
    }

    public final void A0b(QW qw, boolean z) {
        this.A0F = qw;
        this.A0G = z;
    }

    public final void A0c(Object obj) {
        if (obj != null) {
            if ((1024 & this.A0C) != 0) {
                return;
            }
            A09();
            this.A0A.add(obj);
            return;
        }
        A0Z(1024);
    }

    public final void A0d(boolean z) {
        int i;
        int i2 = this.A0D;
        if (z) {
            i = i2 - 1;
        } else {
            i = i2 + 1;
        }
        this.A0D = i;
        int i3 = this.A0D;
        if (A0J[2].length() != 23) {
            throw new RuntimeException();
        }
        A0J[2] = "rX8ZXsodik0buiwUD3KFOeS";
        if (i3 < 0) {
            this.A0D = 0;
            Log.e(A08(143, 4, 66), A08(DeviceFeatures.CONFIG_SLEEP, 78, 113) + this);
        } else if (!z && this.A0D == 1) {
            this.A0C |= 16;
        } else {
            if (!z || this.A0D != 0) {
                return;
            }
            this.A0C &= -17;
        }
    }

    public final boolean A0e() {
        return (this.A0C & 1) != 0;
    }

    public final boolean A0f() {
        return (this.A0C & 4) != 0;
    }

    public final boolean A0g() {
        return (this.A0C & 8) != 0;
    }

    public final boolean A0h() {
        return this.A0F != null;
    }

    public final boolean A0i() {
        return (this.A0C & 256) != 0;
    }

    public final boolean A0j() {
        return (this.A0C & 2) != 0;
    }

    public final boolean A0k() {
        return (this.A0C & 2) != 0;
    }

    public final boolean A0l() {
        return (this.A0C & 128) != 0;
    }

    public final boolean A0m() {
        return (this.A0C & 32) != 0;
    }

    public final boolean A0n() {
        if ((this.A0C & 16) == 0) {
            View view = this.A0H;
            String[] strArr = A0J;
            if (strArr[7].charAt(1) != strArr[3].charAt(1)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0J;
            strArr2[6] = "oGhVpGrwcoPRlkZsrOks4DxLuVnWzLrQ";
            strArr2[5] = "RzFlIrJ9otd57SLzr7ci506FuBBONCMw";
            if (!P3.A0G(view)) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0o(int i) {
        return (this.A0C & i) != 0;
    }

    public final String toString() {
        String A08;
        StringBuilder sb = new StringBuilder(A08(147, 11, 70) + Integer.toHexString(hashCode()) + A08(46, 10, 14) + this.A03 + A08(0, 4, 21) + this.A05 + A08(126, 9, 58) + this.A01 + A08(135, 8, 1) + this.A04);
        if (A0h()) {
            StringBuilder append = sb.append(A08(64, 7, 67));
            boolean z = this.A0G;
            if (A0J[2].length() != 23) {
                throw new RuntimeException();
            }
            A0J[2] = "PPawOVKlLlIRUbnpb4vzMoP";
            if (z) {
                String[] strArr = A0J;
                if (strArr[6].charAt(16) != strArr[5].charAt(16)) {
                    throw new RuntimeException();
                }
                A0J[4] = "lFbF3LZCiVqyeVLEGjED";
                A08 = A08(DeviceFeatures.E_BOOK, 13, 87);
            } else {
                A08 = A08(158, 15, 80);
            }
            append.append(A08);
        }
        if (A0f()) {
            sb.append(A08(12, 8, 64));
        }
        if (!A0e()) {
            sb.append(A08(83, 8, 108));
        }
        if (A0k()) {
            sb.append(A08(118, 7, 20));
        }
        if (A0g()) {
            sb.append(A08(56, 8, 55));
        }
        if (A0l()) {
            sb.append(A08(4, 8, 104));
        }
        if (A0i()) {
            sb.append(A08(71, 12, 4));
        }
        if (!A0n()) {
            StringBuilder sb2 = new StringBuilder().append(A08(30, 16, 42)).append(this.A0D).append(A08(125, 1, 45));
            sb.append(sb2.toString());
        }
        if (A0H()) {
            sb.append(A08(91, 27, 12));
        }
        if (this.A0H.getParent() == null) {
            sb.append(A08(20, 10, 15));
        }
        sb.append(A08(288, 1, 48));
        return sb.toString();
    }
}
