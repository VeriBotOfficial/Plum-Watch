package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.LinearLayout;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Nr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1710Nr extends AbstractC1958Xm {
    public static byte[] A03;
    public C2228dL A00;
    public InterfaceC1957Xl A01;
    public final YQ A02;

    static {
        A05();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 75);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{-75, -34, -31, -27, -41, OtaCommandGenerator.CMD_GET_INFO_TLV, -77, -42};
    }

    public C1710Nr(C2228dL c2228dL, InterfaceC1959Xn interfaceC1959Xn, C1871Ua c1871Ua, int i) {
        super(c2228dL);
        this.A00 = c2228dL;
        setGravity(16);
        A04();
        this.A02 = new YQ(this.A00, i);
        A03();
    }

    private void A03() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        this.A02.setContentDescription(A02(0, 8, 39));
        this.A02.setActionClickListener(new ViewOnClickListenerC1969Xx(this));
        addView(this.A02, layoutParams);
    }

    private void A04() {
        View view = new View(this.A00);
        view.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        addView(view);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1958Xm
    public final void A06() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1958Xm
    public final void A07() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1958Xm
    public final void A08() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1958Xm
    public final void A09(float f, int i) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1958Xm
    public final void A0A(C1691My c1691My, boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1958Xm
    public final boolean A0B() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1958Xm
    public int getToolbarActionMode() {
        return this.A02.getToolbarActionMode();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1958Xm
    public int getToolbarHeight() {
        return AbstractC1958Xm.A01;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1958Xm
    public InterfaceC1957Xl getToolbarListener() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1958Xm
    public void setAdReportingVisible(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1958Xm
    public void setCTAClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1958Xm
    public void setCTAClickListener(KE ke) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1958Xm
    public void setFullscreen(boolean z) {
    }

    public void setInitialUnskippableSeconds(int i) {
        this.A02.setInitialUnskippableSeconds(i);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1958Xm
    public void setPageDetails(N9 n9, String str, int i, NF nf) {
        this.A02.setInitialUnskippableSeconds(i);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1958Xm
    public void setPageDetailsVisible(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1958Xm
    public void setProgress(float f) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1958Xm
    public void setProgressClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1958Xm
    public void setProgressImage(XX xx) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1958Xm
    public void setProgressImmediate(float f) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1958Xm
    public void setProgressSpinnerInvisible(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1958Xm
    public void setToolbarActionMessage(String str) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1958Xm
    public void setToolbarActionMode(int i) {
        this.A02.setToolbarActionMode(i);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1958Xm
    public void setToolbarListener(InterfaceC1957Xl interfaceC1957Xl) {
        this.A01 = interfaceC1957Xl;
    }
}
