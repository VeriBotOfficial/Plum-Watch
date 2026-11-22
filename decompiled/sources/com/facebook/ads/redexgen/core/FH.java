package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public class FH extends QT {
    public static byte[] A0H;
    public static String[] A0I = {"oHxG", "", "w7XeyG7wcXlBDThCLG4YobF5JePdGcu8", "IQ8LgqWvoXOpUTXgnww89j6rU6uuZ1nj", "", "WKMwHhIum9", "0nm7H4VWCUBWNiJwCQAonSVvBZFyt", "hLsDwSpuFLAE"};
    public InterfaceC2116bW A02;
    public C2301eX A04;
    public List<C2195cn> A05;
    public boolean A09;
    public final int A0A;
    public final Context A0B;
    public final C2408gI A0C;
    public final AbstractC1770Qb A0D;
    public final Set<Integer> A0G = new HashSet();
    public boolean A08 = true;
    public boolean A06 = true;
    public boolean A07 = true;
    public int A01 = -1;
    public float A00 = 0.0f;
    public final InterfaceC2120ba A0F = new FK(this);
    public InterfaceC2118bY A03 = new FJ(this);
    public final InterfaceC2119bZ A0E = new FI(this);

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 7);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        String[] strArr = A0I;
        if (strArr[0].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0I;
        strArr2[7] = "Cbp585p0FHy9";
        strArr2[6] = "QC7w158vCCR5KGktiGCBodiqPhNZq";
        A0H = new byte[]{-122, -102, -103, -108, -92, -107, OtaCommandGenerator.CMD_GET_INFO, -122, -98, -92, -118, -109, -122, -121, OtaCommandGenerator.CMD_GET_INFO, -118, -119, -92, -107, -122, -105, -122, OtaCommandGenerator.CMD_GET_INFO_TLV, BuiltinOptions.ReverseV2Options, BuiltinOptions.HardSwishOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.AbsOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.IfOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.RangeOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.RangeOptions, BuiltinOptions.WhereOptions, -51, -58, -61, -52, -60, PSSSigner.TRAILER_IMPLICIT, -42, -61, PSSSigner.TRAILER_IMPLICIT, -51, PSSSigner.TRAILER_IMPLICIT, -61, -42, -57, -72, -55, -72, -60};
    }

    static {
        A08();
    }

    public FH(C11220h c11220h, int i, List<C2195cn> list, C2301eX c2301eX, Bundle bundle) {
        this.A0C = c11220h.getLayoutManager();
        this.A0A = i;
        this.A05 = list;
        this.A04 = c2301eX;
        this.A0D = new C2407gH(c11220h.getContext());
        this.A0B = c11220h.getContext();
        c11220h.A1h(this);
        A0D(bundle);
    }

    private AbstractC1581Ir A03(int i, int i2) {
        return A04(i, i2, true);
    }

    private AbstractC1581Ir A04(int i, int i2, boolean z) {
        AbstractC1581Ir abstractC1581Ir = null;
        while (i <= i2) {
            AbstractC1581Ir abstractC1581Ir2 = (AbstractC1581Ir) this.A0C.A1o(i);
            if (abstractC1581Ir2 == null || abstractC1581Ir2.A1S()) {
                return null;
            }
            boolean A0a = A0a(abstractC1581Ir2);
            if (abstractC1581Ir == null && abstractC1581Ir2.A1T() && A0a && !this.A0G.contains(Integer.valueOf(i)) && (!z || A0I(abstractC1581Ir2, this.A0A))) {
                abstractC1581Ir = abstractC1581Ir2;
            }
            if (abstractC1581Ir2.A1T() && !A0a) {
                A0C(i, false);
            }
            i++;
        }
        return abstractC1581Ir;
    }

    private void A06() {
        if (!this.A07) {
            return;
        }
        int lastVisibleItem = this.A0C.A26();
        int firstVisibleItem = this.A0C.A27();
        AbstractC1581Ir A03 = A03(lastVisibleItem, firstVisibleItem);
        if (A03 != null) {
            A03.A1Q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        int A25 = this.A0C.A25();
        if (A25 != -1) {
            int curPos = this.A05.size();
            if (A25 < curPos - 1) {
                int curPos2 = A25 + 1;
                A0U(curPos2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(int i) {
        AbstractC1581Ir A04 = A04(i + 1, this.A0C.A27(), false);
        if (A04 != null) {
            A04.A1Q();
            A0U(((Integer) A04.getTag(-1593835536)).intValue());
        }
    }

    private void A0A(int i, int i2) {
        while (i <= i2) {
            A0T(i);
            i++;
        }
    }

    private final void A0B(int i, int i2) {
        A0S(i);
        A0S(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(int i, boolean z) {
        if (z) {
            this.A0G.add(Integer.valueOf(i));
        } else {
            this.A0G.remove(Integer.valueOf(i));
        }
    }

    private void A0D(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.A00 = bundle.getFloat(A05(43, 18, 112), 0.0f);
        this.A07 = bundle.getBoolean(A05(0, 23, 62), true);
        this.A08 = bundle.getBoolean(A05(23, 20, 1), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0H() {
        return this.A0A == 1;
    }

    public static boolean A0I(AbstractC2062ae abstractC2062ae, int i) {
        int allowedAreaMaxX;
        int furthestX;
        if (i == 2) {
            allowedAreaMaxX = AbstractC1931Wl.A04.widthPixels - 1;
        } else {
            int width = abstractC2062ae.getWidth();
            int allowedAreaMinX = AbstractC1931Wl.A04.widthPixels;
            allowedAreaMaxX = (int) (((width + allowedAreaMinX) * 1.3f) / 2.0f);
        }
        if (i == 2) {
            furthestX = 1;
        } else {
            int i2 = AbstractC1931Wl.A04.widthPixels;
            int allowedAreaMinX2 = abstractC2062ae.getWidth();
            furthestX = (int) (((i2 - allowedAreaMinX2) * 0.7f) / 2.0f);
        }
        float x = abstractC2062ae.getX();
        int allowedAreaMinX3 = abstractC2062ae.getWidth();
        return ((int) (x + ((float) allowedAreaMinX3))) <= allowedAreaMaxX && abstractC2062ae.getX() >= ((float) furthestX);
    }

    private boolean A0J(AbstractC1581Ir abstractC1581Ir) {
        if (!this.A08 || !abstractC1581Ir.A1T()) {
            return false;
        }
        this.A08 = false;
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.QT
    public void A0L(C12756g c12756g, int i) {
        super.A0L(c12756g, i);
        if (i == 0) {
            this.A09 = true;
            A06();
        }
    }

    @Override // com.facebook.ads.redexgen.core.QT
    public void A0M(C12756g c12756g, int i, int i2) {
        super.A0M(c12756g, i, i2);
        this.A09 = false;
        if (this.A06) {
            this.A09 = true;
            A06();
            this.A06 = false;
        }
        int lastVisibleItem = this.A0C.A26();
        int firstVisibleItem = this.A0C.A27();
        A0B(lastVisibleItem, firstVisibleItem);
        A0A(lastVisibleItem, firstVisibleItem);
        A0V(lastVisibleItem, firstVisibleItem, i);
    }

    public final InterfaceC2118bY A0N() {
        return this.A03;
    }

    public final InterfaceC2119bZ A0O() {
        return this.A0E;
    }

    public final InterfaceC2120ba A0P() {
        return this.A0F;
    }

    public final void A0Q() {
        this.A01 = -1;
        int A27 = this.A0C.A27();
        for (int A26 = this.A0C.A26(); A26 <= A27 && A26 >= 0; A26++) {
            AbstractC1581Ir card = (AbstractC1581Ir) this.A0C.A1o(A26);
            String[] strArr = A0I;
            String str = strArr[1];
            String str2 = strArr[4];
            int lastPos = str.length();
            int firstPos = str2.length();
            if (lastPos != firstPos) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[0] = "4n0r";
            strArr2[5] = "UAml839wpr";
            if (card != null && card.A1S()) {
                this.A01 = A26;
                card.A1P();
                return;
            }
        }
    }

    public final void A0R() {
        AbstractC1581Ir abstractC1581Ir = (AbstractC1581Ir) this.A0C.A1o(this.A01);
        if (abstractC1581Ir != null && this.A01 >= 0) {
            abstractC1581Ir.A1Q();
        }
    }

    public final void A0S(int i) {
        AbstractC1581Ir abstractC1581Ir = (AbstractC1581Ir) this.A0C.A1o(i);
        if (abstractC1581Ir != null && !A0a(abstractC1581Ir)) {
            A0Z(abstractC1581Ir, false);
        }
    }

    public final void A0T(int i) {
        AbstractC1581Ir abstractC1581Ir = (AbstractC1581Ir) this.A0C.A1o(i);
        if (abstractC1581Ir == null) {
            return;
        }
        if (A0a(abstractC1581Ir)) {
            A0Z(abstractC1581Ir, true);
        }
        if (A0J(abstractC1581Ir) && this.A05 != null) {
            this.A0F.setVolume(this.A05.get(((Integer) abstractC1581Ir.getTag(-1593835536)).intValue()).A03().A0H().A0A() ? 0.0f : 1.0f);
        }
    }

    public final void A0U(int i) {
        this.A0D.A0A(i);
        this.A0C.A1N(this.A0D);
    }

    public final void A0V(int i, int i2, int i3) {
        if (!A0H() || this.A02 == null) {
            return;
        }
        int recomputeFrom = this.A0C.A25();
        if (recomputeFrom == -1) {
            recomputeFrom = i3 < 0 ? i : i2;
        }
        this.A02.AJp(recomputeFrom);
    }

    public final void A0W(Bundle bundle) {
        bundle.putFloat(A05(43, 18, 112), this.A00);
        bundle.putBoolean(A05(0, 23, 62), this.A07);
        bundle.putBoolean(A05(23, 20, 1), this.A08);
    }

    public void A0X(View view, boolean z) {
        view.setAlpha(z ? 1.0f : 0.5f);
    }

    public final void A0Y(InterfaceC2116bW interfaceC2116bW) {
        this.A02 = interfaceC2116bW;
    }

    public void A0Z(AbstractC1581Ir abstractC1581Ir, boolean z) {
        if (A0H()) {
            A0X(abstractC1581Ir, z);
        }
        if (!z && abstractC1581Ir.A1S()) {
            abstractC1581Ir.A1P();
        }
    }

    public boolean A0a(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.15f;
    }
}
