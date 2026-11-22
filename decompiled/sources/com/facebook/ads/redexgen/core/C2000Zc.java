package com.facebook.ads.redexgen.core;

import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Zc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2000Zc extends RelativeLayout {
    public static InterfaceC1959Xn A05;
    public static byte[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public AbstractC2389fy A00;
    public C2228dL A01;
    public C0K A02;
    public LE A03;
    public C2041aJ A04;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 60);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{2, 32, BuiltinOptions.TileOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.ScatterNdOptions, 15, 32, BuiltinOptions.EqualOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ScatterNdOptions, 32, BuiltinOptions.CastOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.EqualOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.TileOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.SelectOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.EqualOptions, BuiltinOptions.ScatterNdOptions, 34, BuiltinOptions.TileOptions, BuiltinOptions.LogSoftmaxOptions, 32, BuiltinOptions.EqualOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.CastOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.TileOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.TileOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.PowOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.RankOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions};
    }

    static {
        A02();
        A08 = (int) (AbstractC1931Wl.A02 * 8.0f);
        A07 = A08 * 10;
        A09 = (int) (AbstractC1931Wl.A02 * 15.0f);
        A05 = new LD();
    }

    public C2000Zc(C2228dL c2228dL) {
        super(c2228dL);
        this.A01 = c2228dL;
        this.A02 = new C0K(c2228dL);
        XP.A0I(this.A02);
        this.A00 = new C12766h();
        this.A00.A0G(this.A02);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
    }

    private ArrayList<C2195cn> A01(AbstractC2503hy abstractC2503hy) {
        if (abstractC2503hy == null) {
            return new ArrayList<>();
        }
        List<C1682Mp> A27 = abstractC2503hy.A27();
        ArrayList<C2195cn> arrayList = new ArrayList<>(A27.size());
        for (int i = 0; i < A27.size(); i++) {
            arrayList.add(new C2195cn(i, A27.size(), A27.get(i)));
        }
        return arrayList;
    }

    public final void A04() {
        this.A02.setAdapter(null);
    }

    public final void A05(C1771Qc c1771Qc, int i) {
        ArrayList<C2195cn> A01 = A01(c1771Qc.A10());
        this.A02.setCardsInfo(A01);
        this.A03 = new LE(this.A01, A01, c1771Qc.A10(), this.A01.A02().A0A(), c1771Qc, A05, c1771Qc.A10().A25(), this.A02.getCarouselCardBehaviorHelper(), null);
        this.A02.setAdapter(this.A03);
        if (i == 0) {
            i = AbstractC1931Wl.A04.widthPixels;
        }
        this.A03.A0O(i - A07, 16, 0);
        this.A03.A0G();
        setupDotsLayout(c1771Qc, A01);
    }

    public final void A06(C2301eX c2301eX) {
        if (this.A03 != null) {
            this.A03.A0P(c2301eX);
        } else {
            this.A01.A08().AAy(A00(51, 7, 24), AbstractC1841Sv.A1v, new C1842Sw(A00(0, 51, 125)));
        }
        this.A02.A20(c2301eX);
    }

    public static InterfaceC1959Xn getDummyListener() {
        return A05;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z && this.A03 != null) {
            this.A03.A0O((i3 - i) - A07, 16, 0);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpLayoutForCardAtIndex(int i) {
        if (this.A04 != null) {
            this.A04.A00(i);
        }
    }

    private void setupDotsLayout(C1771Qc c1771Qc, ArrayList<C2195cn> arrayList) {
        this.A02.getCarouselCardBehaviorHelper().A0Y(new L5(this));
        this.A04 = new C2041aJ(this.A01, c1771Qc.A10().A1z().A01(), arrayList.size());
        XP.A0I(this.A04);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, this.A02.getId());
        layoutParams.setMargins(0, A09, 0, 0);
        addView(this.A04, layoutParams);
    }
}
