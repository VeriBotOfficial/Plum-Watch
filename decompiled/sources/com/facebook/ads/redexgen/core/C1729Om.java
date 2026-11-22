package com.facebook.ads.redexgen.core;

import android.app.Activity;
import android.app.AlertDialog;
import android.widget.EditText;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.wakeup.common.DeviceFeatures;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Executor;
import org.apache.commons.net.telnet.TelnetCommand;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Om, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1729Om implements InterfaceC1950Xe {
    public static byte[] A04;
    public C2202cu A00;
    public TE A01;
    public InterfaceC2307ed A02;
    public final Executor A03;

    static {
        A06();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 53);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A04 = new byte[]{BuiltinOptions.SelectV2Options, BuiltinOptions.CallOnceOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DensifyOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.CallOnceOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.IfOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.WhileOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.IfOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.RankOptions, BuiltinOptions.RankOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.WhileOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.UniqueOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.IfOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.WhileOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixDiagOptions, 21, BuiltinOptions.UniqueOptions, 11, 15, BuiltinOptions.HardSwishOptions, BuiltinOptions.UniqueOptions, 8, BuiltinOptions.MatrixDiagOptions, 15, BuiltinOptions.HardSwishOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.WhileOptions, BuiltinOptions.IfOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.WhileOptions, BuiltinOptions.NonMaxSuppressionV4Options, 8, BuiltinOptions.NonMaxSuppressionV4Options, 10, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.QuantizeOptions, 13, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.DepthToSpaceOptions, 15, BuiltinOptions.IfOptions, 11, 10, BuiltinOptions.HardSwishOptions, BuiltinOptions.MatrixSetDiagOptions, 10, BuiltinOptions.HardSwishOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.QuantizeOptions, 0, BuiltinOptions.SplitVOptions, BuiltinOptions.CosOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.AddNOptions, BuiltinOptions.GatherNdOptions, 0, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.RangeOptions, BuiltinOptions.AbsOptions, 0, BuiltinOptions.FloorDivOptions, BuiltinOptions.GatherNdOptions, 0, BuiltinOptions.QuantizeOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.WhereOptions, 0, BuiltinOptions.CosOptions, BuiltinOptions.SplitVOptions, 0, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.SquareOptions, BuiltinOptions.WhereOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 31, 0, BuiltinOptions.BroadcastToOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.ReverseSequenceOptions, 0, BuiltinOptions.FillOptions, BuiltinOptions.SplitVOptions, 0, BuiltinOptions.QuantizeOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.WhereOptions, 0, BuiltinOptions.AddNOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.AddNOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.FillOptions, BuiltinOptions.WhereOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, 0, BuiltinOptions.CosOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, 0, BuiltinOptions.RangeOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.WhereOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, 31, BuiltinOptions.EqualOptions, 3, 8, 2, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ExpandDimsOptions, 3, 22, 9, 20, 18, BuiltinOptions.LogicalAndOptions, 1, 8, 29, BuiltinOptions.RangeOptions, BuiltinOptions.ExpOptions, 8, 25, 25, 12, 7, 12, 13, BuiltinOptions.RankOptions, 27, 25, 25, 31, 9, 9, BuiltinOptions.CastOptions, 14, 21, 17, 31, 20, 25, 27, 14, 31, 29, 21, 8, 3, BuiltinOptions.CastOptions, 19, 30, BuiltinOptions.SelectOptions, 32, BuiltinOptions.CastOptions, BuiltinOptions.LessOptions, 34, BuiltinOptions.PowOptions, 19, BuiltinOptions.PowOptions, BuiltinOptions.CastOptions, BuiltinOptions.ExpOptions, BuiltinOptions.LessOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.GeluOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.GeluOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.WhereOptions, BuiltinOptions.CosOptions, BuiltinOptions.IfOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.WhileOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.DepthToSpaceOptions, 1, 0, 22, 6, 23, 12, 21, 17, 12, 10, 11, BuiltinOptions.SelectOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.NotEqualOptions, 35, BuiltinOptions.DequantizeOptions, 35, BuiltinOptions.NotEqualOptions, 35, BuiltinOptions.ArgMinOptions, 61, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ShapeOptions, 11, 61, 58, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.PackOptions, BuiltinOptions.GeluOptions, BuiltinOptions.RandomOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BucketizeOptions};
    }

    public C1729Om(Executor executor, TE te, C2228dL c2228dL) {
        this.A00 = c2228dL.A02();
        this.A02 = C2325ev.A01(this.A00);
        this.A03 = executor;
        this.A01 = te;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A02(String str) {
        C2321er c2321er = new C2321er();
        C2321er c2321er2 = new C2321er();
        C2321er c2321er3 = new C2321er();
        c2321er.put(A03(257, 15, 52), AbstractC1812Rr.A00().A03());
        c2321er.put(A03(220, 9, 15), A03(15, 15, 91));
        c2321er.put(A03(DeviceFeatures.CONFIG_SLEEP, 11, 79), A03(0, 15, 101));
        c2321er.put(A03(174, 12, 79), A03(30, 48, 92));
        c2321er.put(A03(DeviceFeatures.NETWORK_SHARE, 11, 121), (System.currentTimeMillis() / 1000) + A03(0, 0, 108));
        String A09 = this.A01.A09();
        if (A09 != null) {
            c2321er3.put(A03(208, 12, 53), A09);
        }
        c2321er2.put(A03(229, 11, 80), str);
        c2321er2.put(A03(TelnetCommand.EL, 9, 97), AbstractC1937Wr.A01(c2321er3));
        c2321er.A04(A03(240, 8, 119), AbstractC1937Wr.A01(c2321er2));
        return c2321er;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(TE te) {
        this.A01 = te;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1950Xe
    public final void AFD() {
        Activity A00 = ActivityUtils.A00();
        if (A00 == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(A00);
        builder.setTitle(A03(160, 14, 92));
        EditText editText = new EditText(A00);
        editText.setSingleLine(false);
        editText.setImeOptions(1073741824);
        editText.setHint(A03(84, 65, 21));
        editText.setMaxLines(2);
        editText.setMinLines(2);
        builder.setView(editText);
        builder.setNegativeButton(A03(78, 6, 40), new DialogInterfaceOnClickListenerC1947Xb(this));
        builder.setPositiveButton(A03(149, 11, 83), new DialogInterfaceOnClickListenerC1948Xc(this, editText));
        builder.create().show();
    }
}
