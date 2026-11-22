package com.facebook.ads.redexgen.core;

import com.wakeup.common.DeviceFeatures;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.tensorflow.lite.schema.BuiltinOptions;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/facebook/video/heroplayer/exocustom/ImfSpecParser;", "", "<init>", "()V", "parseImfSpec", "", "Lcom/facebook/video/heroplayer/exocustom/ImfDataTrack;", "imfInlineSpec", "", "fbandroid.java.com.facebook.video.heroplayer.exocustom.exocustom"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.hf, reason: from Kotlin metadata */
/* loaded from: assets/audience_network.dex */
public final class ImfSpecParser {
    public static byte[] A00;
    public static final ImfSpecParser A01;

    static {
        A02();
        A01 = new ImfSpecParser();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 122);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{23, 29, 26, BuiltinOptions.GreaterEqualOptions, 26, 12, 30, 32, BuiltinOptions.DequantizeOptions, 30, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.GreaterOptions, 8, 5, 24, 5, -8, 22, 5, 7, 15, 61, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, 61, BuiltinOptions.FloorModOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.FillOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.FillOptions, BuiltinOptions.SquareOptions, 15, 2, 9, -2, 17, 6, 19, 2, -27, 2, 6, 4, 5, 17, BuiltinOptions.SelectOptions, 34, BuiltinOptions.LessOptions, 30, BuiltinOptions.TransposeConvOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.TileOptions, 34, 20, BuiltinOptions.DequantizeOptions, BuiltinOptions.ExpOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.CastOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.WhereOptions, BuiltinOptions.IfOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.SegmentSumOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.WhereOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.LessOptions, 28, 35, 24, BuiltinOptions.PadV2Options, 32, BuiltinOptions.GreaterEqualOptions, 28, 16, 15, 12, 17, -2, 17, 6, 12, 11, -31, 2, 4, 15, 2, 2, 16, 58, BuiltinOptions.GreaterOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.EqualOptions, BuiltinOptions.PackOptions, 11, BuiltinOptions.ArgMaxOptions, BuiltinOptions.PackOptions, BuiltinOptions.ArgMaxOptions, 17, 58, BuiltinOptions.NotEqualOptions, BuiltinOptions.EqualOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.CumsumOptions, BuiltinOptions.DepthToSpaceOptions, 23, 24, 13, 7, 15, 9, 22, -27, 23, 23, 9, 24, -19, 8, 20, 21, 10, 4, 12, 6, 19, -11, 26, 17, 6, BuiltinOptions.BroadcastToOptions, BuiltinOptions.WhileOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.WhereOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.HardSwishOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.DensifyOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.HashtableOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.RankOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.PowOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.SliceOptions, BuiltinOptions.LessEqualOptions, 29, 31, BuiltinOptions.MaximumMinimumOptions, 0, 29, BuiltinOptions.SliceOptions, 29, 6, BuiltinOptions.SelectOptions, BuiltinOptions.PadV2Options, BuiltinOptions.NegOptions, -12, -14, -31, -29, -21, -50, -31, -19, -27};
    }

    @JvmStatic
    public static final List<ImfDataTrack> A01(String str) throws JSONException {
        C2919p6.A09(str, A00(29, 13, 101));
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONObject(str).getJSONObject(A00(169, 17, 123)).getJSONArray(A00(0, 1, 105));
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject imfTrack = jSONArray.getJSONObject(i).getJSONObject(A00(13, 9, 42));
            String string = imfTrack.getString(A00(199, 9, 6));
            JSONObject jSONObject = new JSONObject(imfTrack.getString(A00(DeviceFeatures.CONFIG_SLEEP, 13, 66)));
            String string2 = jSONObject.getString(A00(140, 11, 39));
            String string3 = jSONObject.getString(A00(126, 14, 42));
            C2919p6.A06(string2);
            C2919p6.A06(string3);
            C2487hd c2487hd = new C2487hd(string2, string3);
            JSONArray jSONArray2 = imfTrack.getJSONArray(A00(1, 12, 63));
            int length2 = jSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                JSONObject dataTrack = jSONArray2.getJSONObject(i2);
                String A002 = A00(151, 9, 122);
                JSONObject jSONObject2 = dataTrack.getJSONObject(A002).getJSONObject(A00(117, 9, 127));
                String A003 = A00(160, 9, 124);
                long j = jSONObject2.getLong(A003);
                long j2 = dataTrack.getJSONObject(A002).getJSONObject(A00(22, 7, 94)).getLong(A003);
                JSONObject jSONObject3 = new JSONObject(dataTrack.getString(A00(102, 15, 77)));
                C2919p6.A06(string);
                arrayList.add(new ImfDataTrack(string, j, j2, c2487hd, new C2486hc(jSONObject3.getDouble(A00(69, 9, 118)), jSONObject3.getDouble(A00(78, 9, 61)), jSONObject3.getDouble(A00(56, 13, 67)), jSONObject3.getDouble(A00(42, 14, 35)), jSONObject3.getDouble(A00(87, 15, 35)))));
            }
        }
        return arrayList;
    }
}
