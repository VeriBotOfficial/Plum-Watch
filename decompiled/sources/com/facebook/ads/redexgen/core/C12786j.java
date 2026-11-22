package com.facebook.ads.redexgen.core;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.6j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C12786j extends AbstractC2391g0 {
    public static TimeInterpolator A0B;
    public static String[] A0C = {"5", "w4FteHoxEZNBcBknXysU1QdwgOlgu", "XTfmSewcFvVIPqcU8HiF2JwhBroc2", "gTOT0dcLAsFp3JXaujmr6eSvv", "MioH3rC6822UBFONR3LUPujrkCbYq", "9Rk7JcSITmrZ17kamSQ7i6v9RKdnt", "plmSW6Ql", "PR6dCqey"};
    public ArrayList<AbstractC1775Qg> A0A = new ArrayList<>();
    public ArrayList<AbstractC1775Qg> A07 = new ArrayList<>();
    public ArrayList<C1765Pw> A09 = new ArrayList<>();
    public ArrayList<C1764Pv> A08 = new ArrayList<>();
    public ArrayList<ArrayList<AbstractC1775Qg>> A01 = new ArrayList<>();
    public ArrayList<ArrayList<C1765Pw>> A05 = new ArrayList<>();
    public ArrayList<ArrayList<C1764Pv>> A03 = new ArrayList<>();
    public ArrayList<AbstractC1775Qg> A00 = new ArrayList<>();
    public ArrayList<AbstractC1775Qg> A04 = new ArrayList<>();
    public ArrayList<AbstractC1775Qg> A06 = new ArrayList<>();
    public ArrayList<AbstractC1775Qg> A02 = new ArrayList<>();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.QK
    public final void A0H() {
        int size;
        for (int size2 = this.A09.size() - 1; size2 >= 0; size2--) {
            C1765Pw c1765Pw = this.A09.get(size2);
            View view = c1765Pw.A04.A0H;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            A0U(c1765Pw.A04);
            this.A09.remove(size2);
        }
        for (int size3 = this.A0A.size() - 1; size3 >= 0; size3--) {
            A0V(this.A0A.get(size3));
            this.A0A.remove(size3);
        }
        for (int size4 = this.A07.size() - 1; size4 >= 0; size4--) {
            AbstractC1775Qg abstractC1775Qg = this.A07.get(size4);
            abstractC1775Qg.A0H.setAlpha(1.0f);
            A0T(abstractC1775Qg);
            this.A07.remove(size4);
        }
        for (int size5 = this.A08.size() - 1; size5 >= 0; size5--) {
            ArrayList<C1764Pv> arrayList = this.A08;
            String[] strArr = A0C;
            if (strArr[0].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[4] = "IUveBZzBDFrSzC13ImzzVKkvQDdr2";
            strArr2[5] = "sCoWws78k8eiD0jPt8s7ggXNZv987";
            A00(arrayList.get(size5));
        }
        this.A08.clear();
        if (A0M()) {
            for (int size6 = this.A05.size() - 1; size6 >= 0; size6--) {
                ArrayList<C1765Pw> arrayList2 = this.A05.get(size6);
                for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                    C1765Pw c1765Pw2 = arrayList2.get(size7);
                    View view2 = c1765Pw2.A04.A0H;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    A0U(c1765Pw2.A04);
                    arrayList2.remove(size7);
                    if (arrayList2.isEmpty()) {
                        this.A05.remove(arrayList2);
                    }
                }
            }
            for (int size8 = this.A01.size() - 1; size8 >= 0; size8--) {
                ArrayList<AbstractC1775Qg> arrayList3 = this.A01.get(size8);
                for (int size9 = arrayList3.size() - 1; size9 >= 0; size9--) {
                    AbstractC1775Qg abstractC1775Qg2 = arrayList3.get(size9);
                    abstractC1775Qg2.A0H.setAlpha(1.0f);
                    A0T(abstractC1775Qg2);
                    arrayList3.remove(size9);
                    if (arrayList3.isEmpty()) {
                        ArrayList<ArrayList<AbstractC1775Qg>> arrayList4 = this.A01;
                        String[] strArr3 = A0C;
                        if (strArr3[0].length() != strArr3[3].length()) {
                            String[] strArr4 = A0C;
                            strArr4[7] = "VBPMrKBD";
                            strArr4[6] = "WZFlfD4M";
                            arrayList4.remove(arrayList3);
                        } else {
                            arrayList4.remove(arrayList3);
                        }
                    }
                }
            }
            ArrayList<ArrayList<C1764Pv>> arrayList5 = this.A03;
            String[] strArr5 = A0C;
            if (strArr5[7].length() != strArr5[6].length()) {
                size = arrayList5.size() - 1;
            } else {
                String[] strArr6 = A0C;
                strArr6[2] = "1rfkrkAxI3SWkdgenr27gUX73o6p1";
                strArr6[1] = "SSeA7srmTqf1oxxrlzMYS1BTDHSjo";
                size = arrayList5.size() - 1;
            }
            while (size >= 0) {
                ArrayList<C1764Pv> arrayList6 = this.A03.get(size);
                for (int size10 = arrayList6.size() - 1; size10 >= 0; size10--) {
                    A00(arrayList6.get(size10));
                    if (arrayList6.isEmpty()) {
                        this.A03.remove(arrayList6);
                    }
                }
                size--;
            }
            A03(this.A06);
            A03(this.A04);
            A03(this.A00);
            A03(this.A02);
            A0G();
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.AbstractC2391g0
    public final boolean A0Z(AbstractC1775Qg abstractC1775Qg, int i, int i2, int i3, int i4) {
        View view = abstractC1775Qg.A0H;
        int translationX = i + ((int) abstractC1775Qg.A0H.getTranslationX());
        int translationY = i2 + ((int) abstractC1775Qg.A0H.getTranslationY());
        A02(abstractC1775Qg);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            A0U(abstractC1775Qg);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.A09.add(new C1765Pw(abstractC1775Qg, translationX, translationY, i3, i4));
        return true;
    }

    private void A00(C1764Pv c1764Pv) {
        if (c1764Pv.A05 != null) {
            A05(c1764Pv, c1764Pv.A05);
        }
        if (c1764Pv.A04 != null) {
            A05(c1764Pv, c1764Pv.A04);
        }
    }

    private void A01(AbstractC1775Qg abstractC1775Qg) {
        View view = abstractC1775Qg.A0H;
        ViewPropertyAnimator animate = view.animate();
        this.A06.add(abstractC1775Qg);
        ViewPropertyAnimator animation = animate.setDuration(A0D());
        animation.alpha(0.0f).setListener(new C1759Pq(this, abstractC1775Qg, animate, view)).start();
    }

    private void A02(AbstractC1775Qg abstractC1775Qg) {
        if (A0B == null) {
            A0B = new ValueAnimator().getInterpolator();
        }
        abstractC1775Qg.A0H.animate().setInterpolator(A0B);
        A0L(abstractC1775Qg);
    }

    private final void A03(List<AbstractC1775Qg> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).A0H.animate().cancel();
        }
    }

    private void A04(List<C1764Pv> list, AbstractC1775Qg abstractC1775Qg) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C1764Pv changeInfo = list.get(size);
            if (A05(changeInfo, abstractC1775Qg) && changeInfo.A05 == null && changeInfo.A04 == null) {
                list.remove(changeInfo);
            }
        }
    }

    private boolean A05(C1764Pv c1764Pv, AbstractC1775Qg abstractC1775Qg) {
        boolean z = false;
        if (c1764Pv.A04 == abstractC1775Qg) {
            c1764Pv.A04 = null;
        } else {
            AbstractC1775Qg abstractC1775Qg2 = c1764Pv.A05;
            String[] strArr = A0C;
            if (strArr[2].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[0] = TokenNames.F;
            strArr2[3] = "q2hYYatvKRTsdUwOPBYP5pb4s";
            if (abstractC1775Qg2 == abstractC1775Qg) {
                c1764Pv.A05 = null;
                z = true;
            } else {
                return false;
            }
        }
        abstractC1775Qg.A0H.setAlpha(1.0f);
        abstractC1775Qg.A0H.setTranslationX(0.0f);
        abstractC1775Qg.A0H.setTranslationY(0.0f);
        A0W(abstractC1775Qg, z);
        return true;
    }

    /* JADX WARN: Incorrect condition in loop: B:10:0x0033 */
    @Override // com.facebook.ads.redexgen.core.QK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0I() {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C12786j.A0I():void");
    }

    @Override // com.facebook.ads.redexgen.core.QK
    public final void A0L(AbstractC1775Qg abstractC1775Qg) {
        View view = abstractC1775Qg.A0H;
        view.animate().cancel();
        for (int i = this.A09.size() - 1; i >= 0; i--) {
            if (this.A09.get(i).A04 == abstractC1775Qg) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                A0U(abstractC1775Qg);
                this.A09.remove(i);
            }
        }
        A04(this.A08, abstractC1775Qg);
        if (this.A0A.remove(abstractC1775Qg)) {
            view.setAlpha(1.0f);
            A0V(abstractC1775Qg);
        }
        if (this.A07.remove(abstractC1775Qg)) {
            view.setAlpha(1.0f);
            String[] strArr = A0C;
            if (strArr[2].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[4] = "yxRUaByjpu2evyevZXzo5CX3I8dRP";
            strArr2[5] = "IuT2zeZcrCaCkdpAEhiSgQgKuQzMH";
            A0T(abstractC1775Qg);
        }
        for (int i2 = this.A03.size() - 1; i2 >= 0; i2--) {
            ArrayList<C1764Pv> arrayList = this.A03.get(i2);
            A04(arrayList, abstractC1775Qg);
            if (arrayList.isEmpty()) {
                this.A03.remove(i2);
            }
        }
        for (int size = this.A05.size() - 1; size >= 0; size--) {
            ArrayList<C1765Pw> arrayList2 = this.A05.get(size);
            int i3 = arrayList2.size() - 1;
            while (true) {
                if (i3 < 0) {
                    break;
                }
                if (arrayList2.get(i3).A04 == abstractC1775Qg) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    A0U(abstractC1775Qg);
                    arrayList2.remove(i3);
                    if (arrayList2.isEmpty()) {
                        this.A05.remove(size);
                    }
                } else {
                    i3--;
                }
            }
        }
        for (int size2 = this.A01.size() - 1; size2 >= 0; size2--) {
            ArrayList<AbstractC1775Qg> arrayList3 = this.A01.get(size2);
            if (arrayList3.remove(abstractC1775Qg)) {
                view.setAlpha(1.0f);
                A0T(abstractC1775Qg);
                if (arrayList3.isEmpty()) {
                    this.A01.remove(size2);
                }
            }
        }
        this.A06.remove(abstractC1775Qg);
        this.A00.remove(abstractC1775Qg);
        this.A02.remove(abstractC1775Qg);
        this.A04.remove(abstractC1775Qg);
        A0b();
    }

    @Override // com.facebook.ads.redexgen.core.QK
    public final boolean A0M() {
        return (this.A07.isEmpty() && this.A08.isEmpty() && this.A09.isEmpty() && this.A0A.isEmpty() && this.A04.isEmpty() && this.A06.isEmpty() && this.A00.isEmpty() && this.A02.isEmpty() && this.A05.isEmpty() && this.A01.isEmpty() && this.A03.isEmpty()) ? false : true;
    }

    @Override // com.facebook.ads.redexgen.core.QK
    public final boolean A0S(AbstractC1775Qg abstractC1775Qg, List<Object> payloads) {
        return !payloads.isEmpty() || super.A0S(abstractC1775Qg, payloads);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2391g0
    public final boolean A0X(AbstractC1775Qg abstractC1775Qg) {
        A02(abstractC1775Qg);
        abstractC1775Qg.A0H.setAlpha(0.0f);
        this.A07.add(abstractC1775Qg);
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2391g0
    public final boolean A0Y(AbstractC1775Qg abstractC1775Qg) {
        A02(abstractC1775Qg);
        this.A0A.add(abstractC1775Qg);
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2391g0
    public final boolean A0a(AbstractC1775Qg abstractC1775Qg, AbstractC1775Qg abstractC1775Qg2, int i, int i2, int i3, int i4) {
        if (abstractC1775Qg == abstractC1775Qg2) {
            return A0Z(abstractC1775Qg, i, i2, i3, i4);
        }
        float translationX = abstractC1775Qg.A0H.getTranslationX();
        float translationY = abstractC1775Qg.A0H.getTranslationY();
        float prevTranslationY = abstractC1775Qg.A0H.getAlpha();
        A02(abstractC1775Qg);
        float prevTranslationX = i3 - i;
        int deltaY = (int) (prevTranslationX - translationX);
        float prevTranslationX2 = i4 - i2;
        int deltaX = (int) (prevTranslationX2 - translationY);
        abstractC1775Qg.A0H.setTranslationX(translationX);
        abstractC1775Qg.A0H.setTranslationY(translationY);
        abstractC1775Qg.A0H.setAlpha(prevTranslationY);
        if (abstractC1775Qg2 != null) {
            A02(abstractC1775Qg2);
            float prevTranslationX3 = -deltaY;
            abstractC1775Qg2.A0H.setTranslationX(prevTranslationX3);
            float prevTranslationX4 = -deltaX;
            abstractC1775Qg2.A0H.setTranslationY(prevTranslationX4);
            abstractC1775Qg2.A0H.setAlpha(0.0f);
        }
        this.A08.add(new C1764Pv(abstractC1775Qg, abstractC1775Qg2, i, i2, i3, i4));
        return true;
    }

    public final void A0b() {
        if (!A0M()) {
            A0G();
        }
    }

    public final void A0c(C1764Pv c1764Pv) {
        View view;
        AbstractC1775Qg holder = c1764Pv.A05;
        if (holder == null) {
            view = null;
        } else {
            view = holder.A0H;
        }
        AbstractC1775Qg holder2 = c1764Pv.A04;
        View view2 = holder2 != null ? holder2.A0H : null;
        if (view != null) {
            ViewPropertyAnimator oldViewAnim = view.animate().setDuration(A0B());
            this.A02.add(c1764Pv.A05);
            oldViewAnim.translationX(c1764Pv.A02 - c1764Pv.A00);
            oldViewAnim.translationY(c1764Pv.A03 - c1764Pv.A01);
            oldViewAnim.alpha(0.0f).setListener(new C1762Pt(this, c1764Pv, oldViewAnim, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.A02.add(c1764Pv.A04);
            animate.translationX(0.0f).translationY(0.0f).setDuration(A0B()).alpha(1.0f).setListener(new C1763Pu(this, c1764Pv, animate, view2)).start();
        }
    }

    public final void A0d(AbstractC1775Qg abstractC1775Qg) {
        View view = abstractC1775Qg.A0H;
        ViewPropertyAnimator animate = view.animate();
        this.A00.add(abstractC1775Qg);
        ViewPropertyAnimator animation = animate.alpha(1.0f).setDuration(A0A());
        animation.setListener(new C1760Pr(this, abstractC1775Qg, view, animate)).start();
    }

    public final void A0e(AbstractC1775Qg abstractC1775Qg, int i, int i2, int i3, int i4) {
        View view = abstractC1775Qg.A0H;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.A04.add(abstractC1775Qg);
        animate.setDuration(A0C()).setListener(new C1761Ps(this, abstractC1775Qg, i5, view, i6, animate)).start();
    }
}
