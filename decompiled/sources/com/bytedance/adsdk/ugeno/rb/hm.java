package com.bytedance.adsdk.ugeno.rb;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes13.dex */
class hm {
    static final /* synthetic */ boolean gff = true;
    private long[] bh;
    int[] fxn;
    private final com.bytedance.adsdk.ugeno.rb.fxn hm;
    long[] kg;
    private boolean[] rb;

    int fxn(long j) {
        return (int) j;
    }

    int kg(long j) {
        return (int) (j >> 32);
    }

    long kg(int i, int i2) {
        return (i & BodyPartID.bodyIdMax) | (i2 << 32);
    }

    hm(com.bytedance.adsdk.ugeno.rb.fxn fxnVar) {
        this.hm = fxnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    int[] fxn(View view, int i, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.hm.getFlexItemCount();
        List<kg> kg2 = kg(flexItemCount);
        kg kgVar = new kg();
        if (view != null && (layoutParams instanceof com.bytedance.adsdk.ugeno.rb.kg)) {
            kgVar.kg = ((com.bytedance.adsdk.ugeno.rb.kg) layoutParams).gff();
        } else {
            kgVar.kg = 1;
        }
        if (i == -1 || i == flexItemCount) {
            kgVar.fxn = flexItemCount;
        } else if (i < this.hm.getFlexItemCount()) {
            kgVar.fxn = i;
            while (i < flexItemCount) {
                kg2.get(i).fxn++;
                i++;
            }
        } else {
            kgVar.fxn = flexItemCount;
        }
        kg2.add(kgVar);
        return fxn(flexItemCount + 1, kg2, sparseIntArray);
    }

    int[] fxn(SparseIntArray sparseIntArray) {
        int flexItemCount = this.hm.getFlexItemCount();
        return fxn(flexItemCount, kg(flexItemCount), sparseIntArray);
    }

    private List<kg> kg(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            com.bytedance.adsdk.ugeno.rb.kg kgVar = (com.bytedance.adsdk.ugeno.rb.kg) this.hm.fxn(i2).getLayoutParams();
            kg kgVar2 = new kg();
            kgVar2.kg = kgVar.gff();
            kgVar2.fxn = i2;
            arrayList.add(kgVar2);
        }
        return arrayList;
    }

    boolean kg(SparseIntArray sparseIntArray) {
        int flexItemCount = this.hm.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i = 0; i < flexItemCount; i++) {
            View fxn2 = this.hm.fxn(i);
            if (fxn2 != null && ((com.bytedance.adsdk.ugeno.rb.kg) fxn2.getLayoutParams()).gff() != sparseIntArray.get(i)) {
                return true;
            }
        }
        return false;
    }

    private int[] fxn(int i, List<kg> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int i2 = 0;
        for (kg kgVar : list) {
            iArr[i2] = kgVar.fxn;
            sparseIntArray.append(kgVar.fxn, kgVar.kg);
            i2++;
        }
        return iArr;
    }

    void fxn(fxn fxnVar, int i, int i2) {
        fxn(fxnVar, i, i2, Integer.MAX_VALUE, 0, -1, (List<gff>) null);
    }

    void kg(fxn fxnVar, int i, int i2) {
        fxn(fxnVar, i2, i, Integer.MAX_VALUE, 0, -1, (List<gff>) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void fxn(fxn fxnVar, int i, int i2, int i3, int i4, int i5, List<gff> list) {
        int i6;
        fxn fxnVar2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        gff gffVar;
        int i16;
        int i17;
        boolean z;
        int i18;
        boolean z2;
        int i19;
        int i20 = i;
        boolean fxn2 = this.hm.fxn();
        int mode = View.MeasureSpec.getMode(i20);
        int size = View.MeasureSpec.getSize(i20);
        List<gff> arrayList = list == null ? new ArrayList() : list;
        fxnVar.fxn = arrayList;
        boolean z3 = i5 == -1;
        int fxn3 = fxn(fxn2);
        int kg2 = kg(fxn2);
        int gff2 = gff(fxn2);
        int hm = hm(fxn2);
        gff gffVar2 = new gff();
        int i21 = i4;
        gffVar2.ckl = i21;
        int i22 = fxn3 + kg2;
        gffVar2.rb = i22;
        int flexItemCount = this.hm.getFlexItemCount();
        boolean z4 = z3;
        gff gffVar3 = gffVar2;
        int i23 = Integer.MIN_VALUE;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        while (true) {
            if (i21 >= flexItemCount) {
                i6 = i25;
                fxnVar2 = fxnVar;
                break;
            }
            View kg3 = this.hm.kg(i21);
            if (kg3 == null) {
                if (fxn(i21, flexItemCount, gffVar3)) {
                    fxn(arrayList, gffVar3, i21, i24);
                }
                i7 = i22;
            } else {
                i7 = i22;
                if (kg3.getVisibility() == 8) {
                    gffVar3.jq++;
                    gffVar3.tw++;
                    if (fxn(i21, flexItemCount, gffVar3)) {
                        fxn(arrayList, gffVar3, i21, i24);
                    }
                } else {
                    if (kg3 instanceof CompoundButton) {
                        fxn((CompoundButton) kg3);
                    }
                    com.bytedance.adsdk.ugeno.rb.kg kgVar = (com.bytedance.adsdk.ugeno.rb.kg) kg3.getLayoutParams();
                    int i27 = flexItemCount;
                    if (kgVar.bh() == 4) {
                        gffVar3.zu.add(Integer.valueOf(i21));
                    }
                    int fxn4 = fxn(kgVar, fxn2);
                    if (kgVar.mvp() != -1.0f && mode == 1073741824) {
                        fxn4 = Math.round(size * kgVar.mvp());
                    }
                    if (fxn2) {
                        i9 = mode;
                        i12 = this.hm.fxn(i20, i7 + gff(kgVar, true) + hm(kgVar, true), fxn4);
                        i8 = size;
                        i10 = i24;
                        int kg4 = this.hm.kg(i2, gff2 + hm + rb(kgVar, true) + bh(kgVar, true) + i24, kg(kgVar, true));
                        kg3.measure(i12, kg4);
                        fxn(i21, i12, kg4, kg3);
                        i11 = 0;
                    } else {
                        i8 = size;
                        i9 = mode;
                        i10 = i24;
                        i11 = 0;
                        int fxn5 = this.hm.fxn(i2, gff2 + hm + rb(kgVar, false) + bh(kgVar, false) + i10, kg(kgVar, false));
                        int kg5 = this.hm.kg(i20, i7 + gff(kgVar, false) + hm(kgVar, false), fxn4);
                        kg3.measure(fxn5, kg5);
                        fxn(i21, fxn5, kg5, kg3);
                        i12 = kg5;
                    }
                    fxn(kg3, i21);
                    i25 = View.combineMeasuredStates(i25, kg3.getMeasuredState());
                    int i28 = i11;
                    i13 = i21;
                    int i29 = i12;
                    gff gffVar4 = gffVar3;
                    int i30 = i26;
                    i14 = i7;
                    i15 = i10;
                    boolean z5 = fxn2;
                    size = i8;
                    if (fxn(kg3, i9, size, gffVar3.rb, fxn(kg3, fxn2) + gff(kgVar, fxn2) + hm(kgVar, fxn2), kgVar, i13, i30, arrayList.size())) {
                        if (gffVar4.kg() > 0) {
                            fxn(arrayList, gffVar4, i13 > 0 ? i13 - 1 : i28, i15);
                            i19 = i15 + gffVar4.f9298sg;
                        } else {
                            i19 = i15;
                        }
                        if (z5) {
                            if (kgVar.kg() == -1) {
                                com.bytedance.adsdk.ugeno.rb.fxn fxnVar3 = this.hm;
                                kg3.measure(i29, fxnVar3.kg(i2, fxnVar3.getPaddingTop() + this.hm.getPaddingBottom() + kgVar.zu() + kgVar.xdg() + i19, kgVar.kg()));
                                fxn(kg3, i13);
                            }
                        } else if (kgVar.fxn() == -1) {
                            com.bytedance.adsdk.ugeno.rb.fxn fxnVar4 = this.hm;
                            kg3.measure(fxnVar4.fxn(i2, fxnVar4.getPaddingLeft() + this.hm.getPaddingRight() + kgVar.rlu() + kgVar.ckl() + i19, kgVar.fxn()), i29);
                            fxn(kg3, i13);
                        }
                        gff gffVar5 = new gff();
                        gffVar5.tw = 1;
                        gffVar5.rb = i14;
                        gffVar5.ckl = i13;
                        i15 = i19;
                        i16 = i28;
                        gffVar = gffVar5;
                        i17 = Integer.MIN_VALUE;
                    } else {
                        gffVar = gffVar4;
                        gffVar.tw++;
                        i16 = i30 + 1;
                        i17 = i23;
                    }
                    gffVar.rmu = (gffVar.rmu ? 1 : 0) | (kgVar.hm() != 0.0f ? 1 : i28);
                    gffVar.je = (gffVar.je ? 1 : 0) | (kgVar.rb() != 0.0f ? 1 : i28);
                    int[] iArr = this.fxn;
                    if (iArr != null) {
                        iArr[i13] = arrayList.size();
                    }
                    z = z5;
                    gffVar.rb += fxn(kg3, z) + gff(kgVar, z) + hm(kgVar, z);
                    gffVar.hie += kgVar.hm();
                    gffVar.dgx += kgVar.rb();
                    this.hm.fxn(kg3, i13, i16, gffVar);
                    int max = Math.max(i17, kg(kg3, z) + rb(kgVar, z) + bh(kgVar, z) + this.hm.fxn(kg3));
                    gffVar.f9298sg = Math.max(gffVar.f9298sg, max);
                    if (z) {
                        if (this.hm.getFlexWrap() != 2) {
                            gffVar.mvp = Math.max(gffVar.mvp, kg3.getBaseline() + kgVar.zu());
                        } else {
                            gffVar.mvp = Math.max(gffVar.mvp, (kg3.getMeasuredHeight() - kg3.getBaseline()) + kgVar.xdg());
                        }
                    }
                    i18 = i27;
                    if (fxn(i13, i18, gffVar)) {
                        fxn(arrayList, gffVar, i13, i15);
                        i15 += gffVar.f9298sg;
                    }
                    if (i5 != -1 && arrayList.size() > 0) {
                        if (arrayList.get(arrayList.size() - 1).xdg >= i5 && i13 >= i5 && !z4) {
                            i15 = -gffVar.fxn();
                            z2 = true;
                            if (i15 <= i3 && z2) {
                                fxnVar2 = fxnVar;
                                i6 = i25;
                                break;
                            }
                            i23 = max;
                            z4 = z2;
                            i26 = i16;
                            int i31 = i13 + 1;
                            fxn2 = z;
                            gffVar3 = gffVar;
                            i22 = i14;
                            i24 = i15;
                            i20 = i;
                            flexItemCount = i18;
                            i21 = i31;
                            mode = i9;
                        }
                    }
                    z2 = z4;
                    if (i15 <= i3) {
                    }
                    i23 = max;
                    z4 = z2;
                    i26 = i16;
                    int i312 = i13 + 1;
                    fxn2 = z;
                    gffVar3 = gffVar;
                    i22 = i14;
                    i24 = i15;
                    i20 = i;
                    flexItemCount = i18;
                    i21 = i312;
                    mode = i9;
                }
            }
            i13 = i21;
            i9 = mode;
            i18 = flexItemCount;
            i15 = i24;
            z = fxn2;
            i14 = i7;
            gffVar = gffVar3;
            int i3122 = i13 + 1;
            fxn2 = z;
            gffVar3 = gffVar;
            i22 = i14;
            i24 = i15;
            i20 = i;
            flexItemCount = i18;
            i21 = i3122;
            mode = i9;
        }
        fxnVar2.kg = i6;
    }

    private void fxn(CompoundButton compoundButton) {
        com.bytedance.adsdk.ugeno.rb.kg kgVar = (com.bytedance.adsdk.ugeno.rb.kg) compoundButton.getLayoutParams();
        int sg2 = kgVar.sg();
        int tw = kgVar.tw();
        Drawable fxn2 = com.bytedance.adsdk.ugeno.sg.rb.fxn(compoundButton);
        int minimumWidth = fxn2 == null ? 0 : fxn2.getMinimumWidth();
        int minimumHeight = fxn2 != null ? fxn2.getMinimumHeight() : 0;
        if (sg2 == -1) {
            sg2 = minimumWidth;
        }
        kgVar.fxn(sg2);
        if (tw == -1) {
            tw = minimumHeight;
        }
        kgVar.kg(tw);
    }

    private int fxn(boolean z) {
        if (z) {
            return this.hm.getPaddingStart();
        }
        return this.hm.getPaddingTop();
    }

    private int kg(boolean z) {
        if (z) {
            return this.hm.getPaddingEnd();
        }
        return this.hm.getPaddingBottom();
    }

    private int gff(boolean z) {
        if (z) {
            return this.hm.getPaddingTop();
        }
        return this.hm.getPaddingStart();
    }

    private int hm(boolean z) {
        if (z) {
            return this.hm.getPaddingBottom();
        }
        return this.hm.getPaddingEnd();
    }

    private int fxn(View view, boolean z) {
        if (z) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    private int kg(View view, boolean z) {
        if (z) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    private int fxn(com.bytedance.adsdk.ugeno.rb.kg kgVar, boolean z) {
        if (z) {
            return kgVar.fxn();
        }
        return kgVar.kg();
    }

    private int kg(com.bytedance.adsdk.ugeno.rb.kg kgVar, boolean z) {
        if (z) {
            return kgVar.kg();
        }
        return kgVar.fxn();
    }

    private int gff(com.bytedance.adsdk.ugeno.rb.kg kgVar, boolean z) {
        if (z) {
            return kgVar.rlu();
        }
        return kgVar.zu();
    }

    private int hm(com.bytedance.adsdk.ugeno.rb.kg kgVar, boolean z) {
        if (z) {
            return kgVar.ckl();
        }
        return kgVar.xdg();
    }

    private int rb(com.bytedance.adsdk.ugeno.rb.kg kgVar, boolean z) {
        if (z) {
            return kgVar.zu();
        }
        return kgVar.rlu();
    }

    private int bh(com.bytedance.adsdk.ugeno.rb.kg kgVar, boolean z) {
        if (z) {
            return kgVar.xdg();
        }
        return kgVar.ckl();
    }

    private boolean fxn(View view, int i, int i2, int i3, int i4, com.bytedance.adsdk.ugeno.rb.kg kgVar, int i5, int i6, int i7) {
        if (this.hm.getFlexWrap() == 0) {
            return false;
        }
        if (kgVar.dgx()) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        int maxLine = this.hm.getMaxLine();
        if (maxLine != -1 && maxLine <= i7 + 1) {
            return false;
        }
        int fxn2 = this.hm.fxn(view, i5, i6);
        if (fxn2 > 0) {
            i4 += fxn2;
        }
        return i2 < i3 + i4;
    }

    private boolean fxn(int i, int i2, gff gffVar) {
        return i == i2 - 1 && gffVar.kg() != 0;
    }

    private void fxn(List<gff> list, gff gffVar, int i, int i2) {
        gffVar.rlu = i2;
        this.hm.fxn(gffVar);
        gffVar.xdg = i;
        list.add(gffVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void fxn(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.bytedance.adsdk.ugeno.rb.kg r0 = (com.bytedance.adsdk.ugeno.rb.kg) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.sg()
            r4 = 1
            if (r1 >= r3) goto L1b
            int r1 = r0.sg()
        L19:
            r3 = r4
            goto L27
        L1b:
            int r3 = r0.jq()
            if (r1 <= r3) goto L26
            int r1 = r0.jq()
            goto L19
        L26:
            r3 = 0
        L27:
            int r5 = r0.tw()
            if (r2 >= r5) goto L32
            int r2 = r0.tw()
            goto L3e
        L32:
            int r5 = r0.hie()
            if (r2 <= r5) goto L3d
            int r2 = r0.hie()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L50
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.fxn(r8, r1, r0, r7)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.rb.hm.fxn(android.view.View, int):void");
    }

    void fxn(int i, int i2) {
        fxn(i, i2, 0);
    }

    void fxn(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        int i4;
        int i5;
        gff(this.hm.getFlexItemCount());
        if (i3 >= this.hm.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.hm.getFlexDirection();
        int flexDirection2 = this.hm.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int largestMainSize = this.hm.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = this.hm.getPaddingLeft();
            paddingRight = this.hm.getPaddingRight();
        } else if (flexDirection2 == 2 || flexDirection2 == 3) {
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = this.hm.getLargestMainSize();
            }
            paddingLeft = this.hm.getPaddingTop();
            paddingRight = this.hm.getPaddingBottom();
        } else {
            throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
        }
        int i6 = paddingLeft + paddingRight;
        int i7 = size;
        int[] iArr = this.fxn;
        int i8 = iArr != null ? iArr[i3] : 0;
        List<gff> flexLinesInternal = this.hm.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i8 < size2) {
            gff gffVar = flexLinesInternal.get(i8);
            if (gffVar.rb < i7 && gffVar.rmu) {
                i4 = i;
                i5 = i2;
                fxn(i4, i5, gffVar, i7, i6, false);
            } else {
                i4 = i;
                i5 = i2;
                if (gffVar.rb > i7 && gffVar.je) {
                    kg(i4, i5, gffVar, i7, i6, false);
                }
            }
            i8++;
            i = i4;
            i2 = i5;
        }
    }

    private void gff(int i) {
        boolean[] zArr = this.rb;
        if (zArr == null) {
            this.rb = new boolean[Math.max(i, 10)];
        } else if (zArr.length < i) {
            this.rb = new boolean[Math.max(zArr.length * 2, i)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    private void fxn(int i, int i2, gff gffVar, int i3, int i4, boolean z) {
        float f;
        float f2;
        int i5;
        double d;
        double d2;
        float f3 = 0.0f;
        if (gffVar.hie <= 0.0f || i3 < gffVar.rb) {
            return;
        }
        int i6 = gffVar.rb;
        float f4 = (i3 - gffVar.rb) / gffVar.hie;
        gffVar.rb = i4 + gffVar.bh;
        if (!z) {
            gffVar.f9298sg = Integer.MIN_VALUE;
        }
        int i7 = 0;
        float f5 = 0.0f;
        boolean z2 = false;
        int i8 = 0;
        while (i7 < gffVar.tw) {
            int i9 = gffVar.ckl + i7;
            View kg2 = this.hm.kg(i9);
            if (kg2 == null || kg2.getVisibility() == 8) {
                f = f3;
                f2 = f4;
            } else {
                com.bytedance.adsdk.ugeno.rb.kg kgVar = (com.bytedance.adsdk.ugeno.rb.kg) kg2.getLayoutParams();
                int flexDirection = this.hm.getFlexDirection();
                f = f3;
                if (flexDirection == 0 || flexDirection == 1) {
                    f2 = f4;
                    int measuredWidth = kg2.getMeasuredWidth();
                    long[] jArr = this.bh;
                    if (jArr != null) {
                        measuredWidth = fxn(jArr[i9]);
                    }
                    int measuredHeight = kg2.getMeasuredHeight();
                    long[] jArr2 = this.bh;
                    if (jArr2 != null) {
                        measuredHeight = kg(jArr2[i9]);
                    }
                    if (!this.rb[i9] && kgVar.hm() > f) {
                        float hm = measuredWidth + (f2 * kgVar.hm());
                        if (i7 == gffVar.tw - 1) {
                            hm += f5;
                            f5 = f;
                        }
                        int round = Math.round(hm);
                        if (round > kgVar.jq()) {
                            round = kgVar.jq();
                            this.rb[i9] = true;
                            gffVar.hie -= kgVar.hm();
                            z2 = true;
                        } else {
                            f5 += hm - round;
                            double d3 = f5;
                            if (d3 > 1.0d) {
                                round++;
                                d = d3 - 1.0d;
                            } else if (d3 < -1.0d) {
                                round--;
                                d = d3 + 1.0d;
                            }
                            f5 = (float) d;
                        }
                        int kg3 = kg(i2, kgVar, gffVar.rlu);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        kg2.measure(makeMeasureSpec, kg3);
                        int measuredWidth2 = kg2.getMeasuredWidth();
                        int measuredHeight2 = kg2.getMeasuredHeight();
                        fxn(i9, makeMeasureSpec, kg3, kg2);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int max = Math.max(i8, measuredHeight + kgVar.zu() + kgVar.xdg() + this.hm.fxn(kg2));
                    gffVar.rb += measuredWidth + kgVar.rlu() + kgVar.ckl();
                    i5 = max;
                } else {
                    int measuredHeight3 = kg2.getMeasuredHeight();
                    long[] jArr3 = this.bh;
                    if (jArr3 != null) {
                        measuredHeight3 = kg(jArr3[i9]);
                    }
                    int measuredWidth3 = kg2.getMeasuredWidth();
                    long[] jArr4 = this.bh;
                    f2 = f4;
                    if (jArr4 != null) {
                        measuredWidth3 = fxn(jArr4[i9]);
                    }
                    if (!this.rb[i9] && kgVar.hm() > f) {
                        float hm2 = measuredHeight3 + (f2 * kgVar.hm());
                        if (i7 == gffVar.tw - 1) {
                            hm2 += f5;
                            f5 = f;
                        }
                        int round2 = Math.round(hm2);
                        if (round2 > kgVar.hie()) {
                            round2 = kgVar.hie();
                            this.rb[i9] = true;
                            gffVar.hie -= kgVar.hm();
                            z2 = true;
                        } else {
                            f5 += hm2 - round2;
                            double d4 = f5;
                            if (d4 > 1.0d) {
                                round2++;
                                d2 = d4 - 1.0d;
                            } else if (d4 < -1.0d) {
                                round2--;
                                d2 = d4 + 1.0d;
                            }
                            f5 = (float) d2;
                        }
                        int fxn2 = fxn(i, kgVar, gffVar.rlu);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        kg2.measure(fxn2, makeMeasureSpec2);
                        int measuredWidth4 = kg2.getMeasuredWidth();
                        int measuredHeight4 = kg2.getMeasuredHeight();
                        fxn(i9, fxn2, makeMeasureSpec2, kg2);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    i5 = Math.max(i8, measuredWidth3 + kgVar.rlu() + kgVar.ckl() + this.hm.fxn(kg2));
                    gffVar.rb += measuredHeight3 + kgVar.zu() + kgVar.xdg();
                }
                gffVar.f9298sg = Math.max(gffVar.f9298sg, i5);
                i8 = i5;
            }
            i7++;
            f4 = f2;
            f3 = f;
        }
        if (!z2 || i6 == gffVar.rb) {
            return;
        }
        fxn(i, i2, gffVar, i3, i4, true);
    }

    private void kg(int i, int i2, gff gffVar, int i3, int i4, boolean z) {
        float f;
        int i5;
        int i6 = gffVar.rb;
        float f2 = 0.0f;
        if (gffVar.dgx <= 0.0f || i3 > gffVar.rb) {
            return;
        }
        float f3 = (gffVar.rb - i3) / gffVar.dgx;
        gffVar.rb = i4 + gffVar.bh;
        if (!z) {
            gffVar.f9298sg = Integer.MIN_VALUE;
        }
        int i7 = 0;
        float f4 = 0.0f;
        boolean z2 = false;
        int i8 = 0;
        while (i7 < gffVar.tw) {
            int i9 = gffVar.ckl + i7;
            View kg2 = this.hm.kg(i9);
            if (kg2 == null || kg2.getVisibility() == 8) {
                f = f2;
            } else {
                com.bytedance.adsdk.ugeno.rb.kg kgVar = (com.bytedance.adsdk.ugeno.rb.kg) kg2.getLayoutParams();
                int flexDirection = this.hm.getFlexDirection();
                f = f2;
                if (flexDirection == 0 || flexDirection == 1) {
                    int measuredWidth = kg2.getMeasuredWidth();
                    long[] jArr = this.bh;
                    if (jArr != null) {
                        measuredWidth = fxn(jArr[i9]);
                    }
                    int measuredHeight = kg2.getMeasuredHeight();
                    long[] jArr2 = this.bh;
                    if (jArr2 != null) {
                        measuredHeight = kg(jArr2[i9]);
                    }
                    if (!this.rb[i9] && kgVar.rb() > f) {
                        float rb = measuredWidth - (kgVar.rb() * f3);
                        if (i7 == gffVar.tw - 1) {
                            rb += f4;
                            f4 = f;
                        }
                        int round = Math.round(rb);
                        if (round < kgVar.sg()) {
                            round = kgVar.sg();
                            this.rb[i9] = true;
                            gffVar.dgx -= kgVar.rb();
                            z2 = true;
                        } else {
                            f4 += rb - round;
                            double d = f4;
                            if (d > 1.0d) {
                                round++;
                                f4 -= 1.0f;
                            } else if (d < -1.0d) {
                                round--;
                                f4 += 1.0f;
                            }
                        }
                        int kg3 = kg(i2, kgVar, gffVar.rlu);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        kg2.measure(makeMeasureSpec, kg3);
                        int measuredWidth2 = kg2.getMeasuredWidth();
                        int measuredHeight2 = kg2.getMeasuredHeight();
                        fxn(i9, makeMeasureSpec, kg3, kg2);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int max = Math.max(i8, measuredHeight + kgVar.zu() + kgVar.xdg() + this.hm.fxn(kg2));
                    gffVar.rb += measuredWidth + kgVar.rlu() + kgVar.ckl();
                    i5 = max;
                } else {
                    int measuredHeight3 = kg2.getMeasuredHeight();
                    long[] jArr3 = this.bh;
                    if (jArr3 != null) {
                        measuredHeight3 = kg(jArr3[i9]);
                    }
                    int measuredWidth3 = kg2.getMeasuredWidth();
                    long[] jArr4 = this.bh;
                    if (jArr4 != null) {
                        measuredWidth3 = fxn(jArr4[i9]);
                    }
                    if (!this.rb[i9] && kgVar.rb() > f) {
                        float rb2 = measuredHeight3 - (kgVar.rb() * f3);
                        if (i7 == gffVar.tw - 1) {
                            rb2 += f4;
                            f4 = f;
                        }
                        int round2 = Math.round(rb2);
                        if (round2 < kgVar.tw()) {
                            round2 = kgVar.tw();
                            this.rb[i9] = true;
                            gffVar.dgx -= kgVar.rb();
                            z2 = true;
                        } else {
                            f4 += rb2 - round2;
                            double d2 = f4;
                            if (d2 > 1.0d) {
                                round2++;
                                f4 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                round2--;
                                f4 += 1.0f;
                            }
                        }
                        int fxn2 = fxn(i, kgVar, gffVar.rlu);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        kg2.measure(fxn2, makeMeasureSpec2);
                        int measuredWidth4 = kg2.getMeasuredWidth();
                        int measuredHeight4 = kg2.getMeasuredHeight();
                        fxn(i9, fxn2, makeMeasureSpec2, kg2);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    i5 = Math.max(i8, measuredWidth3 + kgVar.rlu() + kgVar.ckl() + this.hm.fxn(kg2));
                    gffVar.rb += measuredHeight3 + kgVar.zu() + kgVar.xdg();
                }
                gffVar.f9298sg = Math.max(gffVar.f9298sg, i5);
                i8 = i5;
            }
            i7++;
            f2 = f;
        }
        if (!z2 || i6 == gffVar.rb) {
            return;
        }
        kg(i, i2, gffVar, i3, i4, true);
    }

    private int fxn(int i, com.bytedance.adsdk.ugeno.rb.kg kgVar, int i2) {
        com.bytedance.adsdk.ugeno.rb.fxn fxnVar = this.hm;
        int fxn2 = fxnVar.fxn(i, fxnVar.getPaddingLeft() + this.hm.getPaddingRight() + kgVar.rlu() + kgVar.ckl() + i2, kgVar.fxn());
        int size = View.MeasureSpec.getSize(fxn2);
        if (size > kgVar.jq()) {
            return View.MeasureSpec.makeMeasureSpec(kgVar.jq(), View.MeasureSpec.getMode(fxn2));
        }
        return size < kgVar.sg() ? View.MeasureSpec.makeMeasureSpec(kgVar.sg(), View.MeasureSpec.getMode(fxn2)) : fxn2;
    }

    private int kg(int i, com.bytedance.adsdk.ugeno.rb.kg kgVar, int i2) {
        com.bytedance.adsdk.ugeno.rb.fxn fxnVar = this.hm;
        int kg2 = fxnVar.kg(i, fxnVar.getPaddingTop() + this.hm.getPaddingBottom() + kgVar.zu() + kgVar.xdg() + i2, kgVar.kg());
        int size = View.MeasureSpec.getSize(kg2);
        if (size > kgVar.hie()) {
            return View.MeasureSpec.makeMeasureSpec(kgVar.hie(), View.MeasureSpec.getMode(kg2));
        }
        return size < kgVar.tw() ? View.MeasureSpec.makeMeasureSpec(kgVar.tw(), View.MeasureSpec.getMode(kg2)) : kg2;
    }

    void kg(int i, int i2, int i3) {
        int i4;
        int i5;
        int flexDirection = this.hm.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            i4 = mode;
            i5 = size;
        } else if (flexDirection == 2 || flexDirection == 3) {
            i4 = View.MeasureSpec.getMode(i);
            i5 = View.MeasureSpec.getSize(i);
        } else {
            throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
        }
        List<gff> flexLinesInternal = this.hm.getFlexLinesInternal();
        if (i4 == 1073741824) {
            int sumOfCrossSize = this.hm.getSumOfCrossSize() + i3;
            int i6 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).f9298sg = i5 - i3;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.hm.getAlignContent();
                if (alignContent == 1) {
                    int i7 = i5 - sumOfCrossSize;
                    gff gffVar = new gff();
                    gffVar.f9298sg = i7;
                    flexLinesInternal.add(0, gffVar);
                    return;
                }
                if (alignContent == 2) {
                    this.hm.setFlexLines(fxn(flexLinesInternal, i5, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize < i5) {
                        float size2 = (i5 - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                        ArrayList arrayList = new ArrayList();
                        int size3 = flexLinesInternal.size();
                        float f = 0.0f;
                        while (i6 < size3) {
                            arrayList.add(flexLinesInternal.get(i6));
                            if (i6 != flexLinesInternal.size() - 1) {
                                gff gffVar2 = new gff();
                                if (i6 == flexLinesInternal.size() - 2) {
                                    gffVar2.f9298sg = Math.round(f + size2);
                                    f = 0.0f;
                                } else {
                                    gffVar2.f9298sg = Math.round(size2);
                                }
                                f += size2 - gffVar2.f9298sg;
                                if (f > 1.0f) {
                                    gffVar2.f9298sg++;
                                    f -= 1.0f;
                                } else if (f < -1.0f) {
                                    gffVar2.f9298sg--;
                                    f += 1.0f;
                                }
                                arrayList.add(gffVar2);
                            }
                            i6++;
                        }
                        this.hm.setFlexLines(arrayList);
                        return;
                    }
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= i5) {
                        this.hm.setFlexLines(fxn(flexLinesInternal, i5, sumOfCrossSize));
                        return;
                    }
                    int size4 = (i5 - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    gff gffVar3 = new gff();
                    gffVar3.f9298sg = size4;
                    for (gff gffVar4 : flexLinesInternal) {
                        arrayList2.add(gffVar3);
                        arrayList2.add(gffVar4);
                        arrayList2.add(gffVar3);
                    }
                    this.hm.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < i5) {
                    float size5 = (i5 - sumOfCrossSize) / flexLinesInternal.size();
                    int size6 = flexLinesInternal.size();
                    float f2 = 0.0f;
                    while (i6 < size6) {
                        gff gffVar5 = flexLinesInternal.get(i6);
                        float f3 = gffVar5.f9298sg + size5;
                        if (i6 == flexLinesInternal.size() - 1) {
                            f3 += f2;
                            f2 = 0.0f;
                        }
                        int round = Math.round(f3);
                        f2 += f3 - round;
                        if (f2 > 1.0f) {
                            round++;
                            f2 -= 1.0f;
                        } else if (f2 < -1.0f) {
                            round--;
                            f2 += 1.0f;
                        }
                        gffVar5.f9298sg = round;
                        i6++;
                    }
                }
            }
        }
    }

    private List<gff> fxn(List<gff> list, int i, int i2) {
        int i3 = (i - i2) / 2;
        ArrayList arrayList = new ArrayList();
        gff gffVar = new gff();
        gffVar.f9298sg = i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == 0) {
                arrayList.add(gffVar);
            }
            arrayList.add(list.get(i4));
            if (i4 == list.size() - 1) {
                arrayList.add(gffVar);
            }
        }
        return arrayList;
    }

    void fxn() {
        fxn(0);
    }

    void fxn(int i) {
        View kg2;
        if (i >= this.hm.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.hm.getFlexDirection();
        if (this.hm.getAlignItems() == 4) {
            int[] iArr = this.fxn;
            List<gff> flexLinesInternal = this.hm.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
                gff gffVar = flexLinesInternal.get(i2);
                int i3 = gffVar.tw;
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = gffVar.ckl + i4;
                    if (i4 < this.hm.getFlexItemCount() && (kg2 = this.hm.kg(i5)) != null && kg2.getVisibility() != 8) {
                        com.bytedance.adsdk.ugeno.rb.kg kgVar = (com.bytedance.adsdk.ugeno.rb.kg) kg2.getLayoutParams();
                        if (kgVar.bh() == -1 || kgVar.bh() == 4) {
                            if (flexDirection == 0 || flexDirection == 1) {
                                fxn(kg2, gffVar.f9298sg, i5);
                            } else if (flexDirection == 2 || flexDirection == 3) {
                                kg(kg2, gffVar.f9298sg, i5);
                            } else {
                                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                            }
                        }
                    }
                }
            }
            return;
        }
        for (gff gffVar2 : this.hm.getFlexLinesInternal()) {
            for (Integer num : gffVar2.zu) {
                View kg3 = this.hm.kg(num.intValue());
                if (flexDirection == 0 || flexDirection == 1) {
                    fxn(kg3, gffVar2.f9298sg, num.intValue());
                } else if (flexDirection == 2 || flexDirection == 3) {
                    kg(kg3, gffVar2.f9298sg, num.intValue());
                } else {
                    throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                }
            }
        }
    }

    private void fxn(View view, int i, int i2) {
        int measuredWidth;
        com.bytedance.adsdk.ugeno.rb.kg kgVar = (com.bytedance.adsdk.ugeno.rb.kg) view.getLayoutParams();
        int min = Math.min(Math.max(((i - kgVar.zu()) - kgVar.xdg()) - this.hm.fxn(view), kgVar.tw()), kgVar.hie());
        long[] jArr = this.bh;
        if (jArr != null) {
            measuredWidth = fxn(jArr[i2]);
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        fxn(i2, makeMeasureSpec, makeMeasureSpec2, view);
    }

    private void kg(View view, int i, int i2) {
        int measuredHeight;
        com.bytedance.adsdk.ugeno.rb.kg kgVar = (com.bytedance.adsdk.ugeno.rb.kg) view.getLayoutParams();
        int min = Math.min(Math.max(((i - kgVar.rlu()) - kgVar.ckl()) - this.hm.fxn(view), kgVar.sg()), kgVar.jq());
        long[] jArr = this.bh;
        if (jArr != null) {
            measuredHeight = kg(jArr[i2]);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        fxn(i2, makeMeasureSpec2, makeMeasureSpec, view);
    }

    void fxn(View view, gff gffVar, int i, int i2, int i3, int i4) {
        com.bytedance.adsdk.ugeno.rb.kg kgVar = (com.bytedance.adsdk.ugeno.rb.kg) view.getLayoutParams();
        int alignItems = this.hm.getAlignItems();
        if (kgVar.bh() != -1) {
            alignItems = kgVar.bh();
        }
        int i5 = gffVar.f9298sg;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.hm.getFlexWrap() != 2) {
                    int i6 = i2 + i5;
                    view.layout(i, (i6 - view.getMeasuredHeight()) - kgVar.xdg(), i3, i6 - kgVar.xdg());
                    return;
                } else {
                    view.layout(i, (i2 - i5) + view.getMeasuredHeight() + kgVar.zu(), i3, (i4 - i5) + view.getMeasuredHeight() + kgVar.zu());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i5 - view.getMeasuredHeight()) + kgVar.zu()) - kgVar.xdg()) / 2;
                if (this.hm.getFlexWrap() != 2) {
                    int i7 = i2 + measuredHeight;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else {
                    int i8 = i2 - measuredHeight;
                    view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
                    return;
                }
            }
            if (alignItems == 3) {
                if (this.hm.getFlexWrap() != 2) {
                    int max = Math.max(gffVar.mvp - view.getBaseline(), kgVar.zu());
                    view.layout(i, i2 + max, i3, i4 + max);
                    return;
                } else {
                    int max2 = Math.max((gffVar.mvp - view.getMeasuredHeight()) + view.getBaseline(), kgVar.xdg());
                    view.layout(i, i2 - max2, i3, i4 - max2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (this.hm.getFlexWrap() != 2) {
            view.layout(i, i2 + kgVar.zu(), i3, i4 + kgVar.zu());
        } else {
            view.layout(i, i2 - kgVar.xdg(), i3, i4 - kgVar.xdg());
        }
    }

    void fxn(View view, gff gffVar, boolean z, int i, int i2, int i3, int i4) {
        com.bytedance.adsdk.ugeno.rb.kg kgVar = (com.bytedance.adsdk.ugeno.rb.kg) view.getLayoutParams();
        int alignItems = this.hm.getAlignItems();
        if (kgVar.bh() != -1) {
            alignItems = kgVar.bh();
        }
        int i5 = gffVar.f9298sg;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z) {
                    view.layout(((i + i5) - view.getMeasuredWidth()) - kgVar.ckl(), i2, ((i3 + i5) - view.getMeasuredWidth()) - kgVar.ckl(), i4);
                    return;
                } else {
                    view.layout((i - i5) + view.getMeasuredWidth() + kgVar.rlu(), i2, (i3 - i5) + view.getMeasuredWidth() + kgVar.rlu(), i4);
                    return;
                }
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int measuredWidth = (((i5 - view.getMeasuredWidth()) + com.bytedance.adsdk.ugeno.sg.bh.fxn(marginLayoutParams)) - com.bytedance.adsdk.ugeno.sg.bh.kg(marginLayoutParams)) / 2;
                if (!z) {
                    view.layout(i + measuredWidth, i2, i3 + measuredWidth, i4);
                    return;
                } else {
                    view.layout(i - measuredWidth, i2, i3 - measuredWidth, i4);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (!z) {
            view.layout(i + kgVar.rlu(), i2, i3 + kgVar.rlu(), i4);
        } else {
            view.layout(i - kgVar.ckl(), i2, i3 - kgVar.ckl(), i4);
        }
    }

    private void fxn(int i, int i2, int i3, View view) {
        long[] jArr = this.kg;
        if (jArr != null) {
            jArr[i] = kg(i2, i3);
        }
        long[] jArr2 = this.bh;
        if (jArr2 != null) {
            jArr2[i] = kg(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    private static class kg implements Comparable<kg> {
        int fxn;
        int kg;

        private kg() {
        }

        @Override // java.lang.Comparable
        /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
        public int compareTo(kg kgVar) {
            int i = this.kg;
            int i2 = kgVar.kg;
            return i != i2 ? i - i2 : this.fxn - kgVar.fxn;
        }

        public String toString() {
            return "Order{order=" + this.kg + ", index=" + this.fxn + AbstractJsonLexerKt.END_OBJ;
        }
    }

    static class fxn {
        List<gff> fxn;
        int kg;

        fxn() {
        }

        void fxn() {
            this.fxn = null;
            this.kg = 0;
        }
    }
}
