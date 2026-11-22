package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import androidx.media3.common.C;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.6H, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6H extends OD implements View.OnClickListener, View.OnTouchListener {
    public static int A09;
    public static int A0A;
    public static int A0B;
    public static int A0C;
    public static int A0D;
    public static byte[] A0E;
    public static String[] A0F = {"KCgVVt0Ap7UjFwdZVPwtujaSBd4wOGh", "pwlBzpehZvT0dx09nfsqJf3x9Ohs0th5", "vfZ4vr2K2y2ARDvqPAWs6IAB7KSzcYkK", "bFCbuQIkoS9nYpv83ewRiG67IWanvmGf", "GLbAB0S4L", "VAKU94yPMVJGstkAs9GlkzAfXtUrDcQU", "ELeO8zIeBErz", "BBoYkiBeDILGrcaYIrD29JxsdoJmJVn4"};
    public int A00;
    public int A01;
    public C1871Ua A02;
    public boolean A03;
    public final int A04;
    public final Handler A05;
    public final InputMethodManager A06;
    public final Runnable A07;
    public final String A08;

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0F[6].length() != 12) {
                throw new RuntimeException();
            }
            A0F[6] = "rGUQ6sPwqM0P";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 26);
            i4++;
        }
    }

    public static void A09() {
        A0E = new byte[]{BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.CosOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.RankOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.AbsOptions, BuiltinOptions.AddNOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.NegOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.ExpOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.LogSoftmaxOptions, 34, BuiltinOptions.CastOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.DequantizeOptions, 35, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.CastOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.LessOptions, BuiltinOptions.LessOptions, 34, BuiltinOptions.EqualOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.PadV2Options, BuiltinOptions.LessEqualOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.GreaterOptions, 34, 35, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.ATan2Options, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.PackOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.GeluOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.ATan2Options, BuiltinOptions.ATan2Options, BuiltinOptions.RightShiftOptions, BuiltinOptions.PackOptions, BuiltinOptions.GeluOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.PackOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.SignOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.GeluOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.PackOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.AssignVariableOptions, 2, 14, 12, BuiltinOptions.SplitVOptions, 7, 0, 2, 4, 3, 14, 14, 10, BuiltinOptions.SplitVOptions, 0, 5, 18, BuiltinOptions.SplitVOptions, 15, 0, 21, 8, 23, 4, BuiltinOptions.SplitVOptions, 0, 5, BuiltinOptions.LogicalAndOptions, 2, 13, 8, 2, 10, BuiltinOptions.EqualOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.LessOptions, BuiltinOptions.ArgMaxOptions, 3, BuiltinOptions.TransposeConvOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.TileOptions, BuiltinOptions.PowOptions, 30, 24, 14, 25, BuiltinOptions.ExpandDimsOptions, 9, 30, 13, 13, 14, 25, 14, 15, BuiltinOptions.ExpandDimsOptions, 8, 7, 2, 8, 0, BuiltinOptions.ExpandDimsOptions, 2, 10, 9, BuiltinOptions.ExpandDimsOptions, 8, 7, 2, 8, 0, 24, BuiltinOptions.ReverseV2Options, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.RankOptions, BuiltinOptions.SignOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.SquareOptions, BuiltinOptions.SquareOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.RankOptions, BuiltinOptions.FloorDivOptions, 64, BuiltinOptions.SignOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.SignOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.SignOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.WhileOptions, BuiltinOptions.CosOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.ZerosLikeOptions};
    }

    static {
        A09();
        A0B = 450;
        A09 = 500;
        A0A = 50;
        A0D = 450;
        A0C = 150;
    }

    public C6H(R0 r0, C2228dL c2228dL, US us, InterfaceC1959Xn interfaceC1959Xn, String str, int i) {
        super(r0, c2228dL, us, interfaceC1959Xn);
        this.A00 = 0;
        this.A01 = 0;
        this.A03 = false;
        this.A07 = new RunnableC1962Xq(this);
        this.A08 = str;
        this.A05 = new Handler(Looper.getMainLooper());
        this.A06 = (InputMethodManager) c2228dL.getSystemService(A05(112, 12, 70));
        this.A04 = i;
    }

    public static /* synthetic */ int A02(C6H c6h) {
        int i = c6h.A00;
        c6h.A00 = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06() {
        XP.A0K(this, C.ENCODING_PCM_32BIT_BIG_ENDIAN);
    }

    private void A07() {
        if (this.A08 == null) {
            return;
        }
        if (AdPlacementType.BANNER.name().equals(this.A08)) {
            super.A07.A0E(A05(12, 31, 93), null);
            return;
        }
        if (AdPlacementType.NATIVE.name().equals(this.A08)) {
            super.A07.A0E(A05(80, 32, 123), null);
        } else if (AdPlacementType.INTERSTITIAL.name().equals(this.A08)) {
            super.A07.A0E(A05(43, 37, 15), null);
        } else {
            if (!AdPlacementType.REWARDED_VIDEO.name().equals(this.A08)) {
                return;
            }
            super.A07.A0E(EnumC2250dh.A04.A03(), null);
        }
    }

    private void A08() {
        XP.A0K(this, 0);
    }

    public static /* synthetic */ boolean A0B(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.OD
    public final ZY A0E() {
        return new C1727Ok(this);
    }

    @Override // com.facebook.ads.redexgen.core.OD
    public final void A0F() {
        XP.A0K(this, C.ENCODING_PCM_32BIT_BIG_ENDIAN);
        setPadding(getResources().getConfiguration().orientation);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadii(new float[]{A0A, A0A, A0A, A0A, 0.0f, 0.0f, 0.0f, 0.0f});
        gradientDrawable.setColor(-1);
        this.A0B.setBackground(gradientDrawable);
        this.A0B.setOnTouchListener(new View.OnTouchListener() { // from class: com.facebook.ads.redexgen.X.Xp
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C6H.A0B(view, motionEvent);
            }
        });
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        addView(this.A0B, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(3, this.A0B.getId());
        layoutParams2.addRule(12);
        this.A0E.setBackgroundColor(-1);
        addView(this.A0E, layoutParams2);
        this.A0E.setOnTouchListener(this);
        setOnClickListener(this);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, (int) (AbstractC1931Wl.A02 * 2.0f));
        layoutParams3.addRule(3, this.A0B.getId());
        this.A0C.setProgress(0);
        addView(this.A0C, layoutParams3);
        A06();
        this.A0A.A3x(this, new RelativeLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.core.OD
    public final void A0G() {
        A08();
        super.A07.A05().overridePendingTransition(0, 0);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, Resources.getSystem().getDisplayMetrics().heightPixels);
        translateAnimation.setDuration(A09);
        translateAnimation.setFillAfter(true);
        translateAnimation.setAnimationListener(new AnimationAnimationListenerC1964Xs(this));
        startAnimation(translateAnimation);
    }

    @Override // com.facebook.ads.redexgen.core.OD
    public final void A0H(String str) {
        if (this.A04 > 0 && !this.A03) {
            this.A03 = true;
            this.A05.removeCallbacksAndMessages(null);
            Map<String, String> A05 = new C2013Zp().A03(null).A02(null).A05();
            A05.put(A05(0, 12, 39), str);
            if (this.A02 != null) {
                this.A02.A04(UZ.A0J, A05);
            }
            A07();
            this.A09.AB8(super.A04, A05);
            if (U7.A2N(super.A08)) {
                HashMap hashMap = new HashMap();
                hashMap.put(AbstractC2547im.A04, Boolean.TRUE.toString());
                hashMap.put(AbstractC2547im.A05, Boolean.TRUE.toString());
                hashMap.put(AbstractC2547im.A06, Boolean.TRUE.toString());
                this.A09.ABH(super.A04, hashMap);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.OD, com.facebook.ads.redexgen.core.InterfaceC1960Xo
    public final void AAl(Intent intent, Bundle bundle, R0 r0) {
        super.AAl(intent, bundle, r0);
        this.A02 = new C1871Ua(super.A04, this.A09);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        A08();
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, Resources.getSystem().getDisplayMetrics().heightPixels, 0.0f);
        translateAnimation.setDuration(A0B);
        translateAnimation.setFillAfter(true);
        translateAnimation.setAnimationListener(new AnimationAnimationListenerC1963Xr(this));
        startAnimation(translateAnimation);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC1907Vl.A02(this)) {
            return;
        }
        try {
            A0G();
        } catch (Throwable th) {
            AbstractC1907Vl.A00(th, this);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setPadding(configuration.orientation);
    }

    @Override // com.facebook.ads.redexgen.core.OD, com.facebook.ads.redexgen.core.InterfaceC1960Xo
    public final void onDestroy() {
        super.onDestroy();
        this.A05.removeCallbacksAndMessages(null);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getActionMasked()) {
            case 0:
                if (this.A06 == null) {
                    return false;
                }
                InputMethodManager inputMethodManager = this.A06;
                if (A0F[1].charAt(4) != 'z') {
                    throw new RuntimeException();
                }
                A0F[6] = "wSSlTu5XSXtb";
                if (!inputMethodManager.isAcceptingText()) {
                    return false;
                }
                A0H(A05(154, 30, 62));
                return false;
            case 1:
                this.A01++;
                if (this.A01 < 5) {
                    return false;
                }
                A0H(A05(124, 30, 113));
                return false;
            default:
                return false;
        }
    }

    private void setPadding(int i) {
        if (i == 2) {
            setPadding(0, A0C, 0, 0);
        } else {
            setPadding(0, A0D, 0, 0);
        }
    }
}
