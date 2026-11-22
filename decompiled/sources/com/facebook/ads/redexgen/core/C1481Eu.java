package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.Eu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1481Eu {
    public static String[] A07 = {"yeCTR", "vbYpGeRKHwsNyxajpSfuheCIvaYNa3MM", "oEndzsHg4", "8UJlx4orYPxMpFHWptRgD2Ht", "cT5Bq67DmISXhs3jX", "HBUYvmEJLfhzIFqS0furUTPx", "Yflab", "bdcCFsYTxOJVXsfU13RZ00QELBiL0cIH"};
    public static final Comparator<C1480Et> A08 = new Comparator() { // from class: com.facebook.ads.redexgen.X.Eq
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C1481Eu.A00((C1480Et) obj, (C1480Et) obj2);
        }
    };
    public static final Comparator<C1480Et> A09 = new Comparator() { // from class: com.facebook.ads.redexgen.X.Er
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int compare;
            compare = Float.compare(((C1480Et) obj).A00, ((C1480Et) obj2).A00);
            return compare;
        }
    };
    public int A01;
    public int A02;
    public int A03;
    public final int A04;
    public final C1480Et[] A06 = new C1480Et[5];
    public final ArrayList<C1480Et> A05 = new ArrayList<>();
    public int A00 = -1;

    public C1481Eu(int i) {
        this.A04 = i;
    }

    public static /* synthetic */ int A00(C1480Et c1480Et, C1480Et c1480Et2) {
        return c1480Et.A01 - c1480Et2.A01;
    }

    private void A02() {
        if (this.A00 != 1) {
            Collections.sort(this.A05, A08);
            this.A00 = 1;
        }
    }

    private void A03() {
        if (this.A00 != 0) {
            Collections.sort(this.A05, A09);
            this.A00 = 0;
        }
    }

    private final void A04(int i, float f) {
        C1480Et oldestSample;
        A02();
        if (this.A02 > 0) {
            C1480Et[] c1480EtArr = this.A06;
            int i2 = this.A02 - 1;
            this.A02 = i2;
            oldestSample = c1480EtArr[i2];
        } else {
            oldestSample = new C1480Et();
        }
        int i3 = this.A01;
        this.A01 = i3 + 1;
        oldestSample.A01 = i3;
        oldestSample.A02 = i;
        oldestSample.A00 = f;
        this.A05.add(oldestSample);
        this.A03 += i;
        while (this.A03 > this.A04) {
            int excessWeight = this.A03 - this.A04;
            C1480Et c1480Et = this.A05.get(0);
            if (c1480Et.A02 <= excessWeight) {
                this.A03 -= c1480Et.A02;
                this.A05.remove(0);
                if (this.A02 < 5) {
                    C1480Et[] c1480EtArr2 = this.A06;
                    int excessWeight2 = this.A02;
                    this.A02 = excessWeight2 + 1;
                    c1480EtArr2[excessWeight2] = c1480Et;
                }
            } else {
                c1480Et.A02 -= excessWeight;
                this.A03 -= excessWeight;
            }
        }
    }

    public final float A05(float f) {
        A03();
        float f2 = this.A03 * f;
        int i = 0;
        int i2 = 0;
        while (true) {
            int size = this.A05.size();
            int accumulatedWeight = A07[7].charAt(16);
            if (accumulatedWeight != 49) {
                throw new RuntimeException();
            }
            A07[7] = "tMnKu67VMHjg0RGb1V9fdd44wq1tOS9W";
            if (i2 < size) {
                C1480Et c1480Et = this.A05.get(i2);
                i += c1480Et.A02;
                float desiredWeight = i;
                if (desiredWeight >= f2) {
                    float desiredWeight2 = c1480Et.A00;
                    return desiredWeight2;
                }
                i2++;
            } else {
                if (this.A05.isEmpty()) {
                    return Float.NaN;
                }
                float desiredWeight3 = this.A05.get(this.A05.size() - 1).A00;
                return desiredWeight3;
            }
        }
    }

    public final void A06() {
        this.A05.clear();
        this.A00 = -1;
        this.A01 = 0;
        this.A03 = 0;
    }

    @MetaExoPlayerCustomization("D20155618 Samples OutOfBounds Error Check Fix")
    public final void A07(int i, float f) {
        C1480Et oldestSample;
        if (MetaExoPlayerUpgradeConfig.A03(EnumC2504i2.A1G)) {
            A04(i, f);
            return;
        }
        A02();
        if (this.A02 > 0) {
            C1480Et[] c1480EtArr = this.A06;
            int i2 = this.A02 - 1;
            this.A02 = i2;
            oldestSample = c1480EtArr[i2];
        } else {
            oldestSample = new C1480Et();
        }
        int i3 = this.A01;
        this.A01 = i3 + 1;
        oldestSample.A01 = i3;
        oldestSample.A02 = i;
        oldestSample.A00 = f;
        this.A05.add(oldestSample);
        this.A03 += i;
        while (this.A03 > this.A04 && !this.A05.isEmpty()) {
            int excessWeight = this.A03 - this.A04;
            C1480Et c1480Et = this.A05.get(0);
            if (c1480Et.A02 <= excessWeight) {
                this.A03 -= c1480Et.A02;
                String[] strArr = A07;
                if (strArr[3].length() != strArr[5].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A07;
                strArr2[3] = "3KNEloHV0yOGYGtjjhul0kjR";
                strArr2[5] = "CQhg8nP9eAQ7nTj9eI4Xv7HE";
                this.A05.remove(0);
                if (this.A02 < 5) {
                    C1480Et[] c1480EtArr2 = this.A06;
                    String[] strArr3 = A07;
                    if (strArr3[6].length() != strArr3[0].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr4 = A07;
                    strArr4[2] = "1EJuh5GaS";
                    strArr4[4] = "pMRpDkTII4u81yBOo";
                    int excessWeight2 = this.A02;
                    this.A02 = excessWeight2 + 1;
                    c1480EtArr2[excessWeight2] = c1480Et;
                } else {
                    continue;
                }
            } else {
                c1480Et.A02 -= excessWeight;
                this.A03 -= excessWeight;
            }
        }
    }
}
