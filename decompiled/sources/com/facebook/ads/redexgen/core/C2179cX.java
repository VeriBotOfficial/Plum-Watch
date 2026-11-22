package com.facebook.ads.redexgen.core;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.cX, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2179cX extends LinearLayout {
    public LinearLayout A00;
    public String A01;
    public boolean A02;
    public final int A03;
    public final C2228dL A04;
    public final C2042aK A05;
    public final C2048aQ A06;
    public static String[] A07 = {"mO6OCzz183u1Bigulq5KeRnnu3UhUErY", "M8wuVwCqg47swjluxOTBwYkXCALJOS1f", "isO3a6yeUrEqJHaKmCFaV", "J8y0fQZRtVpgz1Itec1cmA3ue79eN13N", "z6IigVxY2j2waSprQRCf4749VcxJv5uz", "GG3OTiE6t7MwpY", "UBA0QA1YjTXejDlGkh9vREu7YbW4o1hK", "iNB15eFG13fee2"};
    public static final int A0A = (int) (AbstractC1931Wl.A02 * 16.0f);
    public static final int A0B = (int) (AbstractC1931Wl.A02 * 32.0f);
    public static final int A0C = (int) (AbstractC1931Wl.A02 * 16.0f);
    public static final int A09 = (int) (AbstractC1931Wl.A02 * 4.0f);
    public static final int A08 = (int) (AbstractC1931Wl.A02 * 72.0f);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2179cX(com.facebook.ads.redexgen.core.C2177cV r7) {
        /*
            r6 = this;
            com.facebook.ads.redexgen.X.dL r0 = com.facebook.ads.redexgen.core.C2177cV.A04(r7)
            r6.<init>(r0)
            r0 = 0
            r6.A02 = r0
            java.lang.String r0 = ""
            r6.A01 = r0
            com.facebook.ads.redexgen.X.dL r0 = com.facebook.ads.redexgen.core.C2177cV.A04(r7)
            r6.A04 = r0
            com.facebook.ads.redexgen.X.dL r1 = r6.A04
            com.facebook.ads.redexgen.X.aK r0 = new com.facebook.ads.redexgen.X.aK
            r0.<init>(r1)
            r6.A05 = r0
            com.facebook.ads.redexgen.X.aQ r0 = new com.facebook.ads.redexgen.X.aQ
            com.facebook.ads.redexgen.X.dL r1 = r6.A04
            com.facebook.ads.redexgen.X.My r2 = com.facebook.ads.redexgen.core.C2177cV.A02(r7)
            r4 = 0
            r5 = 1
            r3 = 1
            r0.<init>(r1, r2, r3, r4, r5)
            r6.A06 = r0
            int r0 = com.facebook.ads.redexgen.core.C2177cV.A00(r7)
            r6.A03 = r0
            boolean r0 = com.facebook.ads.redexgen.core.C2177cV.A08(r7)
            r6.A02 = r0
            java.lang.String r0 = com.facebook.ads.redexgen.core.C2177cV.A05(r7)
            r6.A01 = r0
            r6.A03(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2179cX.<init>(com.facebook.ads.redexgen.X.cV):void");
    }

    public /* synthetic */ C2179cX(C2177cV c2177cV, C1504Fr c1504Fr) {
        this(c2177cV);
    }

    private void A00() {
        A01(this.A05, 150);
        A01(this.A06, 170);
        if (this.A00 != null) {
            A01(this.A00, 190);
        }
    }

    private void A01(View view, int i) {
        view.setTranslationY(i);
        view.setScaleY(0.75f);
        view.setScaleX(0.75f);
        view.animate().translationYBy(-i).scaleX(1.0f).scaleY(1.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator(2.0f));
    }

    private void A02(C2177cV c2177cV) {
        String str;
        String str2;
        String str3;
        str = c2177cV.A03;
        if (!TextUtils.isEmpty(str)) {
            this.A00 = new LinearLayout(getContext());
            this.A00.setGravity(17);
            int i = A0C / 2;
            if (this.A02) {
                i = 0;
            }
            LinearLayout linearLayout = this.A00;
            int i2 = A0C;
            int i3 = A0C;
            int marginTop = A0C;
            linearLayout.setPadding(i2, i, i3, marginTop / 2);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, i, 0, 0);
            TextView textView = new TextView(getContext());
            textView.setTextColor(-1);
            XP.A0W(textView, false, 16);
            str2 = c2177cV.A03;
            textView.setText(str2);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            ImageView imageView = new ImageView(getContext());
            KZ A04 = new KZ(imageView, this.A04).A04();
            str3 = c2177cV.A02;
            A04.A07(str3);
            int i4 = A0A;
            int marginTop2 = A0A;
            LinearLayout.LayoutParams informativeContainerParams = new LinearLayout.LayoutParams(i4, marginTop2);
            int marginTop3 = A0C;
            informativeContainerParams.setMargins(0, 0, marginTop3 / 2, 0);
            if (this.A02) {
                C2036aE c2036aE = new C2036aE(getContext(), 0, -1, XX.PLAYABLE_ICON);
                c2036aE.setLayoutParams(new LinearLayout.LayoutParams(A0B, A0B));
                this.A00.addView(c2036aE);
            } else {
                this.A00.addView(imageView, informativeContainerParams);
                this.A00.addView(textView, layoutParams2);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(100.0f);
                gradientDrawable.setColor(469762047);
                XP.A0Q(this.A00, gradientDrawable);
            }
            View view = this.A00;
            String[] strArr = A07;
            String str4 = strArr[5];
            String str5 = strArr[7];
            int length = str4.length();
            int marginTop4 = str5.length();
            if (length != marginTop4) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[0] = "6JdK2pyeEPUWkfGuYxPy07w26kgdYt9J";
            strArr2[1] = "5VEwQONd4c8VI19uC0Ib5tVL9YvIxUH6";
            addView(view, layoutParams);
        }
    }

    private void A03(C2177cV c2177cV) {
        C1689Mw c1689Mw;
        N9 n9;
        C1689Mw c1689Mw2;
        N9 n92;
        XP.A0K(this.A05, 0);
        this.A05.setRadius(50);
        if (!this.A02) {
            c1689Mw = c2177cV.A06;
            if (c1689Mw.A00() == EnumC1687Mu.A05) {
                this.A05.setFullCircleCorners(true);
            } else {
                C2042aK c2042aK = this.A05;
                int i = A09;
                String[] strArr = A07;
                if (strArr[5].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                A07[2] = "avcxrBXnTsgV2I5Ie1k2l";
                c2042aK.setRadius(i);
            }
        } else {
            this.A05.setRadius(A09);
        }
        KZ A04 = new KZ(this.A05, this.A04).A04();
        n9 = c2177cV.A07;
        A04.A07(n9.A01());
        C2048aQ c2048aQ = this.A06;
        c1689Mw2 = c2177cV.A06;
        String A0F = c1689Mw2.A0F();
        n92 = c2177cV.A07;
        c2048aQ.A04(A0F, n92.A03(), null, false, true);
        if (!this.A02) {
            this.A06.getDescriptionTextView().setAlpha(0.8f);
        } else {
            this.A06.getDescriptionTextView().setText(this.A01);
        }
        this.A06.setAlignment(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A0C, 0, A0C / 2);
        View view = this.A05;
        ViewGroup.LayoutParams titleAndDescriptionParams = new LinearLayout.LayoutParams(A08, A08);
        addView(view, titleAndDescriptionParams);
        addView(this.A06, layoutParams);
        A02(c2177cV);
        XP.A0K(this, -14473425);
        setGravity(17);
        setOrientation(1);
    }

    public final void A04(InterfaceC2178cW interfaceC2178cW) {
        A00();
        postDelayed(new C1504Fr(this, interfaceC2178cW), this.A03);
    }
}
