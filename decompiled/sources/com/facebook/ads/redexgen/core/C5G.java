package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import java.util.Arrays;
import java.util.HashMap;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.5G, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C5G extends FrameLayout implements I3 {
    public static byte[] A0A;
    public static String[] A0B = {"cNW8ZlUzhquZSz6XSi", "gKIjGDOIeaOzZR9qeyStr8duZ", "mQKfIuNnQZgt5ES8sx19fjwTYxycx0Lp", "WvoZHe7VElSdYX15O8PPMcOC5YskUK4l", "BfRVnLJiFu3hDnD", "WxgvJAZOXh", "crPtNK55mSnLeOXFeJGYeBq3ABMrpYK", "K6RBlZSEjGoukPcRXJY4znE0whNpCjIj"};
    public C2301eX A00;
    public final int A01;
    public final AbstractC2503hy A02;
    public final C2228dL A03;
    public final US A04;
    public final XH A05;
    public final InterfaceC2128bi A06;
    public final C2139bt A07;
    public final String A08;
    public final boolean A09;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 14);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{BuiltinOptions.SegmentSumOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.RangeOptions, 0, BuiltinOptions.GatherNdOptions, 7, BuiltinOptions.CosOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.WhereOptions, BuiltinOptions.GatherNdOptions, 7, BuiltinOptions.CumsumOptions, BuiltinOptions.AddNOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.AbsOptions, BuiltinOptions.SquareOptions, BuiltinOptions.RangeOptions, BuiltinOptions.FillOptions, BuiltinOptions.SquareOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.SquareOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.WhereOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.FillOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.AbsOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.AbsOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.DepthToSpaceOptions, 9, 7, BuiltinOptions.Conv3DOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.SquareOptions, 7, BuiltinOptions.CosOptions, BuiltinOptions.AddNOptions, BuiltinOptions.WhereOptions, BuiltinOptions.SquareOptions, 7, BuiltinOptions.GatherNdOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.GatherNdOptions, 7, BuiltinOptions.AbsOptions, BuiltinOptions.GatherNdOptions, 0, BuiltinOptions.CosOptions, 7, BuiltinOptions.AbsOptions, BuiltinOptions.RangeOptions, 7, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.AddNOptions, BuiltinOptions.WhereOptions, 7, BuiltinOptions.CumsumOptions, BuiltinOptions.RangeOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.WhereOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.AbsOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.RangeOptions, BuiltinOptions.AbsOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.SquareOptions, BuiltinOptions.CosOptions, BuiltinOptions.GatherNdOptions, 9, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.LeakyReluOptions, 7, BuiltinOptions.FloorDivOptions, BuiltinOptions.AbsOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.SquareOptions, 9, 24, 28, 31, BuiltinOptions.PadV2Options, 58, BuiltinOptions.ShapeOptions, BuiltinOptions.PackOptions, BuiltinOptions.SliceOptions, 61, BuiltinOptions.PackOptions, 16, BuiltinOptions.PackOptions, BuiltinOptions.NegOptions, BuiltinOptions.LessOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.EqualOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.SignOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.AddNOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.WhileOptions, 4, 11, 14, 4, 12, BuiltinOptions.PowOptions, 20, 8, 18, 21, 4, 2, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.WhereOptions, 64, BuiltinOptions.WhileOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.WhereOptions, 64, BuiltinOptions.WhereOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.ReverseV2Options, 27, 29, 11, 28, 13, 2, 7, 13, 5, 22, 9, 5, 23, BuiltinOptions.ExpandDimsOptions, 25, 16, 5};
    }

    static {
        A02();
    }

    public C5G(C2228dL c2228dL, US us, InterfaceC2128bi interfaceC2128bi, AbstractC2503hy abstractC2503hy, String str, int i, XH xh) {
        super(c2228dL);
        this.A03 = c2228dL;
        this.A04 = us;
        this.A02 = abstractC2503hy;
        this.A08 = str;
        this.A06 = interfaceC2128bi;
        this.A01 = i;
        C2139bt preloadedDynamicWebViewController = AbstractC2140bu.A02(abstractC2503hy.A17());
        if (preloadedDynamicWebViewController != null) {
            this.A07 = preloadedDynamicWebViewController;
            this.A09 = true;
        } else {
            this.A07 = new C2139bt(this.A03, abstractC2503hy, us, i);
            AbstractC2140bu.A03(abstractC2503hy, this.A07);
            this.A09 = false;
        }
        if (xh != null) {
            this.A05 = xh;
            this.A07.A0Z(xh);
        } else {
            this.A05 = this.A07.A0L();
        }
        this.A07.A0c(new IT(this));
        this.A07.A0a(interfaceC2128bi);
        EnumC1936Wq.A04(this, EnumC1936Wq.A0B);
        if (U7.A1u(c2228dL)) {
            c2228dL.A0B().AK4(this.A07.A0O(), abstractC2503hy.A25(), false, false, true);
        }
        A04();
    }

    private final void A03() {
        this.A07.A0d(this);
        if (!this.A09) {
            this.A03.A0F().A5y();
            this.A07.A0X();
        } else {
            this.A03.A0F().A5z();
            if (this.A07.A0k()) {
                if (this.A01 == 4) {
                    if (this.A06 != null) {
                        this.A06.AD8(this);
                    }
                    if (U7.A1u(this.A03)) {
                        InterfaceC1875Ue A0B2 = this.A03.A0B();
                        if (A0B[1].length() != 25) {
                            throw new RuntimeException();
                        }
                        A0B[5] = "";
                        A0B2.ACx();
                    }
                } else {
                    AJS();
                }
            }
        }
        A08();
    }

    private final void A04() {
        C2139bt.A0B().incrementAndGet();
        A03();
        this.A07.A0W();
    }

    private void A05(Intent intent, AbstractC2503hy abstractC2503hy) {
        intent.putExtra(A01(157, 8, 110), EnumC1898Vb.A07);
        intent.putExtra(A01(130, 18, 58), abstractC2503hy);
        intent.addFlags(268435456);
    }

    private final void A06(AbstractC2503hy abstractC2503hy) {
        AdActivityIntent A05 = WB.A05(this.A03);
        A05(A05, abstractC2503hy);
        try {
            WB.A0B(this.A03, A05);
        } catch (Exception e) {
            this.A03.A08().AAy(A01(107, 11, 42), AbstractC1841Sv.A0D, new C1842Sw(e));
            Log.e(A01(90, 17, 80), A01(0, 90, 41), e);
        }
    }

    private void A07(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a5 a5Var = new a5(this.A03, this.A08, this.A00, this.A05, this.A04, this.A02.A21());
        HashMap hashMap = new HashMap();
        hashMap.put(A01(118, 12, 105), A01(148, 9, 96));
        a5Var.A05(this.A02.A25(), str, hashMap);
    }

    public final void A08() {
        XP.A0H(this.A07.A0O());
        addView(this.A07.A0O(), new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.core.I3
    public final void A9X() {
        A07(this.A02.A20().A0J().A05());
    }

    @Override // com.facebook.ads.redexgen.core.I3
    public final void A9Y(String str) {
        A07(str);
    }

    @Override // com.facebook.ads.redexgen.core.I3
    public final void A9c() {
    }

    @Override // com.facebook.ads.redexgen.core.I3
    public final void AAd() {
        new Handler(Looper.getMainLooper()).post(new IH(this));
    }

    @Override // com.facebook.ads.redexgen.core.I3
    public final void ADM() {
        A06(this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.I3
    public final void ADQ() {
    }

    @Override // com.facebook.ads.redexgen.core.I3
    public final void AEF(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.I3
    public final void AFG() {
    }

    @Override // com.facebook.ads.redexgen.core.I3
    public final void AFn(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.I3
    public final void AFp(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.I3
    public final void AG4(String str) {
    }

    @Override // com.facebook.ads.redexgen.core.I3
    public final void AJS() {
        if (this.A06 != null) {
            this.A06.AD8(this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.I3
    public final void close() {
    }

    public US getAdEventManager() {
        return this.A04;
    }

    public C2139bt getDynamicWebViewController() {
        return this.A07;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setAdViewabilityChecker(C2301eX c2301eX) {
        this.A00 = c2301eX;
        this.A07.A0e(c2301eX);
    }
}
