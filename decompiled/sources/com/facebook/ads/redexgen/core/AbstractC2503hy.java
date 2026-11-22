package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.adapters.datamodels.AdInfo;
import com.wakeup.common.DeviceFeatures;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.net.nntp.NNTPReply;
import org.apache.commons.net.telnet.TelnetCommand;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.opencv.videoio.Videoio;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.hy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2503hy extends AbstractC1681Mo implements Serializable {
    public static JSONObject A0N = null;
    public static byte[] A0O = null;
    public static String[] A0P = {"MTFiGS2hyLPfirnVlCyKu8FL5ydCU71a", "6CtUdYtPnHS0iwt", "3FBcQYGRSJhXKbj7ODsddhFyR1abGnGF", "UQ7LtGE24TX4QkAlsGDlXXS4Vcev", "JcPJu", "s3C", "M3uL5ar3Pz1QrNsTamNzt8iOeyqnSnZC", "bpoJK"};
    public static final LinkedHashMap<String, String> A0Q;
    public static final long serialVersionUID = -5352540727250859603L;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C1679Ml A06;
    public N3 A07;
    public N6 A08;
    public N9 A09;
    public NF A0A;
    public String A0B;
    public boolean A0D;
    public final List<C1682Mp> A0L;
    public boolean A0C = false;
    public boolean A0E = false;
    public boolean A0K = false;
    public boolean A0J = false;
    public boolean A0G = false;
    public boolean A0H = false;
    public boolean A0F = false;
    public boolean A0I = false;
    public final Map<String, String> A0M = new HashMap();
    public int A05 = 5000;

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0O, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 112);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A0O = new byte[]{BuiltinOptions.ReverseV2Options, BuiltinOptions.CosOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.QuantizeOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.WhereOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.IfOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.SquareOptions, BuiltinOptions.IfOptions, BuiltinOptions.ATan2Options, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.FillOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.GeluOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.GeluOptions, BuiltinOptions.FillOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.HashtableOptions, BuiltinOptions.RightShiftOptions, 29, 18, 21, 17, 29, 8, 25, 35, 31, 14, 25, 24, 21, 8, 35, 16, 21, 18, 25, BuiltinOptions.EqualOptions, 58, 61, BuiltinOptions.ArgMinOptions, BuiltinOptions.EqualOptions, 32, BuiltinOptions.TransposeConvOptions, 11, BuiltinOptions.ShapeOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SliceOptions, 61, 32, 11, BuiltinOptions.PowOptions, 61, 58, BuiltinOptions.TransposeConvOptions, 11, BuiltinOptions.EqualOptions, BuiltinOptions.ExpOptions, 32, BuiltinOptions.PackOptions, 11, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.PackOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.TransposeConvOptions, 11, BuiltinOptions.ArgMinOptions, 61, BuiltinOptions.PowOptions, BuiltinOptions.PowOptions, 61, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.SquareOptions, BuiltinOptions.AbsOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.FillOptions, BuiltinOptions.AbsOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.RandomOptions, BuiltinOptions.AbsOptions, BuiltinOptions.SquareOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.RangeOptions, BuiltinOptions.SquareOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.RandomOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.FillOptions, 64, BuiltinOptions.FloorModOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.SquareOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.WhereOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.WhereOptions, BuiltinOptions.WhileOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.WhereOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.SquareOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.HardSwishOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.SelectOptions, BuiltinOptions.PackOptions, 58, BuiltinOptions.ExpOptions, BuiltinOptions.GreaterEqualOptions, 34, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.CastOptions, 17, BuiltinOptions.ArgMaxOptions, 34, BuiltinOptions.SelectOptions, BuiltinOptions.PowOptions, BuiltinOptions.ExpOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.PackOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.PackOptions, BuiltinOptions.SliceOptions, 61, 7, BuiltinOptions.ArgMinOptions, BuiltinOptions.PadV2Options, BuiltinOptions.PadV2Options, 61, BuiltinOptions.GreaterOptions, BuiltinOptions.PadV2Options, 15, 13, 30, 3, 25, 31, 9, 0, 6, 13, 4, 12, 11, 58, 4, 1, 22, 58, 3, 23, 0, 20, 16, 0, 11, 6, 28, BuiltinOptions.IfOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.AddNOptions, 17, BuiltinOptions.QuantizeOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.IfOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.WhileOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.CosOptions, 17, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.SquaredDifferenceOptions, 17, BuiltinOptions.RankOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.LeakyReluOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.RankOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.RankOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.GatherNdOptions, 17, BuiltinOptions.QuantizeOptions, BuiltinOptions.RankOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.RankOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.IfOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.RankOptions, BuiltinOptions.RangeOptions, BuiltinOptions.RankOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ExpOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.BroadcastToOptions, Byte.MAX_VALUE, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.GatherNdOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.BroadcastToOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.NonMaxSuppressionV5Options, Byte.MAX_VALUE, BuiltinOptions.HardSwishOptions, BuiltinOptions.NonMaxSuppressionV4Options, 9, BuiltinOptions.IfOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.AddNOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.IfOptions, BuiltinOptions.FillOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.AbsOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.RangeOptions, BuiltinOptions.AddNOptions, BuiltinOptions.RankOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.RandomOptions, BuiltinOptions.RightShiftOptions, Byte.MAX_VALUE, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.IfOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.AbsOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.WhileOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.RangeOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.WhileOptions, BuiltinOptions.WhileOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.WhileOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.CosOptions, BuiltinOptions.AbsOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.FloorModOptions, BuiltinOptions.RangeOptions, BuiltinOptions.AbsOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.AbsOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.RankOptions, BuiltinOptions.RangeOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.AddNOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.RankOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.RankOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.RankOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.RankOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.AbsOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.RangeOptions, 1, 12, 3, 9, 30, 14, 12, 29, 8, BuiltinOptions.HardSwishOptions, BuiltinOptions.RankOptions, BuiltinOptions.AbsOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.ATan2Options, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.RightShiftOptions, 10, 29, 15, 25, 10, 28, 29, 28, BuiltinOptions.MaximumMinimumOptions, 14, 17, 28, 29, 23, BuiltinOptions.NegOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.EqualOptions, 61, 6, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.LogicalAndOptions, 6, BuiltinOptions.PowOptions, BuiltinOptions.ShapeOptions, 32, 6, BuiltinOptions.SliceOptions, BuiltinOptions.PowOptions, BuiltinOptions.PackOptions, 6, 58, BuiltinOptions.EqualOptions, BuiltinOptions.SliceOptions, 58, BuiltinOptions.SparseToDenseOptions, 6, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, 58, BuiltinOptions.LogicalOrOptions, 58, BuiltinOptions.ExpOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.LogicalAndOptions, 22, BuiltinOptions.NegOptions, BuiltinOptions.PackOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.GreaterEqualOptions, 32, 61, 22, BuiltinOptions.CastOptions, 32, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.LessOptions, 1, 61, BuiltinOptions.GreaterOptions, BuiltinOptions.PackOptions, 58, BuiltinOptions.ShapeOptions, BuiltinOptions.NegOptions, 1, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.SliceOptions, BuiltinOptions.PackOptions, 1, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SliceOptions, 1, BuiltinOptions.GreaterOptions, 61, 1, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.PadV2Options, 61, 61, BuiltinOptions.PackOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.GreaterEqualOptions, 1, BuiltinOptions.GreaterEqualOptions, 61, BuiltinOptions.GreaterOptions, BuiltinOptions.PackOptions, BuiltinOptions.PackOptions, BuiltinOptions.SliceOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.SliceOptions, BuiltinOptions.ArgMaxOptions, 0, BuiltinOptions.TileOptions, BuiltinOptions.SliceOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.PackOptions, 58, BuiltinOptions.GreaterEqualOptions, 0, BuiltinOptions.TransposeConvOptions, BuiltinOptions.PadV2Options, BuiltinOptions.PackOptions, BuiltinOptions.PowOptions, 35, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.LogicalOrOptions, 20, BuiltinOptions.CastOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.TileOptions, 63, 20, BuiltinOptions.ArgMaxOptions, 63, BuiltinOptions.NegOptions, 20, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.CastOptions, 20, BuiltinOptions.LessEqualOptions, BuiltinOptions.CastOptions, BuiltinOptions.SelectOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.NegOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.SelectOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.PadV2Options, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.TileOptions, 61, BuiltinOptions.LogicalAndOptions, BuiltinOptions.GreaterEqualOptions, 0, BuiltinOptions.LogicalAndOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.PadV2Options, 0, BuiltinOptions.LogicalAndOptions, BuiltinOptions.GreaterOptions, 0, BuiltinOptions.LogicalOrOptions, BuiltinOptions.PadV2Options, BuiltinOptions.LogicalAndOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.SignOptions};
    }

    static {
        A09();
        A0Q = new LinkedHashMap<>(10, 0.75f, false);
    }

    public AbstractC2503hy(List<C1682Mp> list) {
        this.A0L = list;
    }

    public static String A06(String str) {
        return A0Q.get(str);
    }

    private HashMap<String, String> A07(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A05(230, 18, 124));
        HashMap<String, String> hashMap = new HashMap<>();
        if (optJSONObject == null) {
            return hashMap;
        }
        Iterator<String> nameItr = optJSONObject.keys();
        while (nameItr.hasNext()) {
            try {
                String next = nameItr.next();
                hashMap.put(next, optJSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        return hashMap;
    }

    public static List<C1682Mp> A08(JSONObject jSONObject, C2228dL c2228dL, N1 n1) {
        JSONArray optJSONArray = jSONObject.optJSONArray(A05(156, 8, 28));
        if (optJSONArray != null && optJSONArray.length() > 0) {
            return AbstractC1690Mx.A01(optJSONArray, jSONObject, c2228dL, n1);
        }
        List<AdInfo> adInfoList = new ArrayList<>();
        C1682Mp A00 = C1682Mp.A00(jSONObject);
        n1.A3q(A00, jSONObject);
        adInfoList.add(A00);
        return adInfoList;
    }

    private void A0A(int i) {
        this.A00 = i;
    }

    private final void A0B(int i) {
        this.A04 = i;
    }

    private void A0C(C1679Ml c1679Ml) {
        this.A06 = c1679Ml;
    }

    private final void A0D(N3 n3) {
        this.A07 = n3;
    }

    private void A0E(N6 n6) {
        this.A08 = n6;
    }

    private final void A0F(N9 n9) {
        this.A09 = n9;
    }

    private void A0G(NF nf) {
        this.A0A = nf;
    }

    private void A0H(String str) {
        this.A0B = str;
    }

    public final int A1t() {
        return this.A00;
    }

    public final int A1u() {
        return this.A01;
    }

    public final int A1v() {
        return this.A02;
    }

    public final int A1w() {
        return this.A03;
    }

    public final int A1x() {
        return this.A04;
    }

    public final int A1y() {
        return this.A05;
    }

    public final C1679Ml A1z() {
        return this.A06;
    }

    public final C1682Mp A20() {
        return this.A0L.get(0);
    }

    public final N3 A21() {
        return this.A07;
    }

    public final N6 A22() {
        return this.A08;
    }

    public final N9 A23() {
        return this.A09;
    }

    public final NF A24() {
        return this.A0A;
    }

    public final String A25() {
        return this.A0B;
    }

    public final String A26(String str) {
        return this.A0M.get(str);
    }

    public final List<C1682Mp> A27() {
        return Collections.unmodifiableList(this.A0L);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void A28(InterfaceC1959Xn interfaceC1959Xn) {
        char c;
        String A0v = A0v();
        switch (A0v.hashCode()) {
            case -1364000502:
                if (A0v.equals(A05(363, 14, 8))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 604727084:
                if (A0v.equals(A05(296, 12, 74))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                interfaceC1959Xn.A4b(A05(183, 45, 79));
                break;
            case 1:
                break;
            default:
                return;
        }
        interfaceC1959Xn.A4b(EnumC2250dh.A08.A03());
    }

    public final void A29(JSONObject jSONObject) {
        String A05;
        A0D(N3.A00(jSONObject.optJSONObject(A05(280, 16, 95))));
        A0N = jSONObject.optJSONObject(A05(144, 12, 40));
        N8 A06 = new N8().A06(jSONObject.optString(A05(Videoio.CAP_PROP_XI_TRG_SELECTOR, 5, 121)));
        String A052 = A05(276, 4, 97);
        if (jSONObject.optJSONObject(A052) != null) {
            A05 = jSONObject.optJSONObject(A052).optString(A05(521, 3, 103));
        } else {
            A05 = A05(0, 0, 15);
        }
        A0F(A06.A05(A05).A04(jSONObject.optString(A05(0, 19, 64))).A07(NA.A03(jSONObject)).A08());
        JSONObject optJSONObject = jSONObject.optJSONObject(A05(349, 6, 71));
        JSONObject layoutObject = optJSONObject != null ? optJSONObject.optJSONObject(A05(355, 8, 122)) : null;
        C1691My A01 = C1691My.A01(layoutObject);
        String[] strArr = A0P;
        if (strArr[1].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0P;
        strArr2[2] = "MaJS3iOjDVpkOvzQIu4XnTvkYtI43ENf";
        strArr2[6] = "dcadpZfpRdAwhtf1LK3imqQWfZ9Fu8JJ";
        A0C(new C1679Ml(A01, C1691My.A01(optJSONObject != null ? optJSONObject.optJSONObject(A05(NNTPReply.SEND_ARTICLE_TO_POST, 9, 29)) : null)));
        A0G(NA.A01(jSONObject));
        A0E(NA.A00(jSONObject));
        A0A(jSONObject.optInt(A05(19, 12, 107), 0));
        A0B(jSONObject.optInt(A05(DeviceFeatures.CAMERA_PREVIEW, 19, 21), -1));
        this.A0M.putAll(A07(jSONObject));
        this.A03 = jSONObject.optInt(A05(110, 18, 70), 0);
        this.A01 = jSONObject.optInt(A05(128, 16, 62), 1);
        this.A0K = jSONObject.optBoolean(A05(503, 18, 47), false);
        this.A0J = jSONObject.optBoolean(A05(Videoio.CAP_PROP_XI_LIMIT_BANDWIDTH, 15, 47), false);
        this.A0G = jSONObject.optBoolean(A05(Videoio.CAP_PROP_XI_IMAGE_IS_COLOR, 24, 59), false);
        this.A0H = jSONObject.optBoolean(A05(406, 16, 57), false);
        this.A0F = jSONObject.optBoolean(A05(31, 19, 12), false);
        this.A05 = jSONObject.optInt(A05(50, 36, 36), 5000);
        this.A0I = jSONObject.optBoolean(A05(422, 37, 46), false);
        this.A0E = jSONObject.optBoolean(A05(377, 29, 41), false);
        this.A0D = jSONObject.optBoolean(A05(308, 32, 82), false);
        this.A02 = jSONObject.optInt(A05(86, 24, 93), this.A03);
        String optString = jSONObject.optString(A05(228, 2, 50));
        A0H(optString);
        A0Q.put(optString, jSONObject.optString(A05(TelnetCommand.EL, 28, 77)));
        A1K(jSONObject);
    }

    public final void A2A(boolean z) {
        this.A0C = z;
    }

    public final void A2B(boolean z) {
        this.A0G = z;
    }

    public final boolean A2C() {
        return this.A0C;
    }

    public final boolean A2D() {
        return this.A0D;
    }

    public final boolean A2E() {
        return this.A0E;
    }

    public final boolean A2F() {
        return this.A0F;
    }

    public final boolean A2G() {
        return this.A0G;
    }

    public final boolean A2H() {
        return this.A0H;
    }

    public final boolean A2I() {
        return this.A0I;
    }

    public final boolean A2J() {
        return this.A0J;
    }

    public final boolean A2K() {
        return this.A0K;
    }
}
