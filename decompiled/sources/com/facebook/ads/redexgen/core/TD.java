package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public final class TD extends R8 implements DefaultMediaViewVideoRendererApi {
    public static byte[] A0F;
    public static String[] A0G = {"gicLODNc4Ss02ASp0SH6jYH1jReGCf7D", "ud1g41PfTpgHVgN2zMRJY9l5AGp7t", "qgXpVhlOa1wHLevNk8n", "YvRZAMwcrsdunGxdPmTtNWzK4vSRpQc4", "eiRiwAROr6ki2Hau4nBgoUP0cJGv3yGG", "AknM7mKZVSENDtzyALrGWQlwPvra0WAt", "RqySj6gASebQYnIOdgQzgXbIWVvFlmni", "rcToBCOkHOudlFUS35924ELLk4KD1"};
    public static final String A0H;
    public MediaViewVideoRenderer A00;
    public C2228dL A01;
    public InterfaceC1881Uk A02;
    public AnonymousClass64 A04;
    public C11802p A05;
    public C2Z A06;
    public AbstractC2300eW A07;
    public C2301eX A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final InterfaceC2240dX A0C = new UW(this);
    public final AtomicBoolean A0D = new AtomicBoolean(false);
    public final AtomicBoolean A0E = new AtomicBoolean(false);
    public EnumC1891Uu A03 = EnumC1891Uu.A03;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 77);
        }
        return new String(copyOfRange);
    }

    public static void A0E() {
        A0F = new byte[]{11, BuiltinOptions.GreaterOptions, BuiltinOptions.ExpandDimsOptions, 35, BuiltinOptions.LessEqualOptions, BuiltinOptions.PadV2Options, BuiltinOptions.DequantizeOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.SliceOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.SliceOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.ExpOptions, BuiltinOptions.NegOptions, BuiltinOptions.PadV2Options, BuiltinOptions.LessEqualOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.ExpOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.PadV2Options, BuiltinOptions.CastOptions, BuiltinOptions.HashtableFindOptions, 7, BuiltinOptions.SelectOptions, BuiltinOptions.LessEqualOptions, 35, BuiltinOptions.PadV2Options, 28, 35, BuiltinOptions.SelectOptions, 61, 28, 35, BuiltinOptions.LessEqualOptions, BuiltinOptions.SelectOptions, BuiltinOptions.CastOptions, BuiltinOptions.Conv3DOptions, 35, BuiltinOptions.ArgMinOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.LogSoftmaxOptions, 63, BuiltinOptions.DequantizeOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.Conv3DOptions, 63, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.PadV2Options, BuiltinOptions.ArgMaxOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.SelectOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.CastOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.GreaterOptions, 35, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.Conv3DOptions, 35, BuiltinOptions.LogicalAndOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.ATan2Options, BuiltinOptions.FloorDivOptions, BuiltinOptions.AbsOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.ResizeNearestNeighborOptions, 15, BuiltinOptions.HardSwishOptions, 64, 15, BuiltinOptions.RangeOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.LeakyReluOptions, 15, BuiltinOptions.SelectV2Options, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.AbsOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.ResizeNearestNeighborOptions, 64, 15, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.LeakyReluOptions, 1};
    }

    static {
        A0E();
        A0H = TD.class.getSimpleName();
    }

    private UD A00(MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        return new UD(this, mediaViewVideoRendererApi);
    }

    private U2 A01(MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        return new U2(this, mediaViewVideoRendererApi);
    }

    private C1861Tq A02() {
        return new C1861Tq(this);
    }

    private C2301eX A05() {
        return new C2301eX(this.A00, 50, true, new WeakReference(this.A07), this.A01);
    }

    private void A09() {
        if (this.A04 != null) {
            AnonymousClass64 anonymousClass64 = this.A04;
            if (A0G[6].charAt(16) != 'd') {
                throw new RuntimeException();
            }
            A0G[5] = "Ntv0Vby76dSesAjQjgB6ptCIElpzOEzL";
            ((C2241dY) anonymousClass64.getVideoView()).setViewImplInflationListener(this.A0C);
        }
    }

    private void A0A() {
        if (this.A04 != null) {
            this.A04.getVideoView().setOnTouchListener(new ViewOnTouchListenerC1880Uj(this));
        }
    }

    private void A0B() {
        if (this.A04 != null) {
            ((C2241dY) this.A04.getVideoView()).setViewImplInflationListener(null);
        }
    }

    private void A0C() {
        if (this.A00.getVisibility() == 0 && this.A09 && this.A00.hasWindowFocus()) {
            this.A08.A0U();
            return;
        }
        if (this.A04 != null) {
            EnumC2298eU state = this.A04.getState();
            String[] strArr = A0G;
            if (strArr[7].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A0G[4] = "z79LrkWpr7afRwAllWq14kp6jWBswbkV";
            if (state == EnumC2298eU.A05) {
                this.A0B = true;
            }
        }
        this.A08.A0V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D() {
        this.A03 = EnumC1891Uu.A03;
        A0B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(C1771Qc c1771Qc, InterfaceC1881Uk interfaceC1881Uk) {
        String str;
        this.A0A = false;
        this.A0B = false;
        this.A02 = interfaceC1881Uk;
        A09();
        C11802p c11802p = this.A05;
        if (c1771Qc != null && c1771Qc.getAdCoverImage() != null) {
            C1886Up adCoverImage = c1771Qc.getAdCoverImage();
            String[] strArr = A0G;
            if (strArr[0].charAt(7) != strArr[3].charAt(7)) {
                throw new RuntimeException();
            }
            A0G[5] = "TnDtOWvYiNMfLmp09Wf7ctnD5adJ0dsa";
            str = adCoverImage.getUrl();
        } else {
            str = null;
        }
        c11802p.setImage(str, new C1866Tv(this));
        this.A03 = c1771Qc.A19();
        this.A06.setPlayAccessibilityLabel(c1771Qc.A1F());
        this.A06.setPauseAccessibilityLabel(c1771Qc.A1E());
        this.A08.A0U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0J(EnumC2244db enumC2244db) {
        if (this.A04 != null) {
            this.A04.A0h(enumC2244db, 24);
        } else {
            if (!AdInternalSettings.isDebugBuild()) {
                return;
            }
            Log.e(A0H, A06(30, 42, 7));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0K() {
        if (this.A04 == null || this.A04.getState() == EnumC2298eU.A06) {
            return false;
        }
        return this.A03 == EnumC1891Uu.A05 || this.A03 == EnumC1891Uu.A03;
    }

    @Override // com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi
    public final void initialize(Context context, MediaViewVideoRenderer mediaViewVideoRenderer, MediaViewVideoRendererApi mediaViewVideoRendererApi, int i) {
        InterfaceC1883Um A01;
        ((R8) mediaViewVideoRendererApi.getAdComponentViewApi()).A00(this);
        switch (i) {
            case 0:
                A01 = A01(mediaViewVideoRendererApi);
                break;
            case 1:
                A01 = A00(mediaViewVideoRendererApi);
                break;
            default:
                throw new IllegalArgumentException(A06(0, 30, 15));
        }
        ((RH) mediaViewVideoRendererApi).A06(A01);
        this.A01 = RB.A03(context);
        this.A00 = mediaViewVideoRenderer;
        this.A05 = new C11802p(this.A01);
        this.A07 = A02();
        this.A08 = A05();
        float density = AbstractC1931Wl.A02;
        int bigPadding = (int) (2.0f * density);
        int smallPadding = (int) (25.0f * density);
        this.A06 = new C2Z(this.A01);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9);
        layoutParams.addRule(12);
        this.A06.setPadding(bigPadding, smallPadding, smallPadding, bigPadding);
        this.A06.setLayoutParams(layoutParams);
        int i2 = 0;
        while (true) {
            int i3 = this.A00.getChildCount();
            if (A0G[2].length() == 26) {
                throw new RuntimeException();
            }
            A0G[6] = "7BCad5LO6te39ERddnjUHTKJR8zzbght";
            if (i2 < i3) {
                View childAt = this.A00.getChildAt(0);
                if (childAt instanceof AnonymousClass64) {
                    this.A04 = (AnonymousClass64) childAt;
                } else {
                    i2++;
                }
            }
        }
        if (this.A04 == null) {
            if (AdInternalSettings.isDebugBuild()) {
                Log.e(A0H, A06(72, 36, 98));
            }
        } else {
            this.A04.A0i(this.A05);
            AnonymousClass64 anonymousClass64 = this.A04;
            C2Z c2z = this.A06;
            String[] strArr = A0G;
            if (strArr[0].charAt(7) != strArr[3].charAt(7)) {
                anonymousClass64.A0i(c2z);
            } else {
                A0G[5] = "Z21owOXIiAfqNY46KReygSjUmuqXSFx4";
                anonymousClass64.A0i(c2z);
            }
        }
        this.A08.A0W(0);
        this.A08.A0X(250);
        A01.AIk();
    }

    @Override // com.facebook.ads.redexgen.core.R8, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A09 = true;
        A0C();
    }

    @Override // com.facebook.ads.redexgen.core.R8, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A09 = false;
        A0C();
    }

    @Override // com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi
    public final void onPrepared() {
        boolean A0s = U7.A0s(this.A01);
        this.A00.setOnTouchListener(new ViewOnTouchListenerC1879Ui(this, A0s));
        if (!A0s) {
            A0A();
        }
    }

    @Override // com.facebook.ads.redexgen.core.R8, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        A0C();
    }

    @Override // com.facebook.ads.redexgen.core.R8, com.facebook.ads.internal.api.AdComponentView
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        A0C();
    }
}
