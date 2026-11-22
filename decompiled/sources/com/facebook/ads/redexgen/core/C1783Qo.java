package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Qo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1783Qo {
    public static byte[] A02;
    public static String[] A03 = {"TTkBeT", "dgqPpyxawDBTokVKz6usds7DGGljbLlG", "Om", "1", "lOfLhIubd0jJyTpTkNltmpZf14oHCLV9", "yX0qRkYxaN2cv8t3SuJSwpxSeia", "n9D4XHOOTGgVdLWa6Wuko3wZCERnKgc", "NKR9b6EIrIhl49GaATLNKeLdYiLud"};
    public final C2425gb<AbstractC1775Qg, C1781Qm> A00 = new C2425gb<>();
    public final OS<AbstractC1775Qg> A01 = new OS<>();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 13);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {BuiltinOptions.AbsOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.UnsortedSegmentMaxOptions, 35, BuiltinOptions.BucketizeOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.CumsumOptions, 35, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.SegmentSumOptions, 35, BuiltinOptions.GatherNdOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.BidirectionalSequenceRNNOptions, 35, BuiltinOptions.HashtableFindOptions, BuiltinOptions.AssignVariableOptions, 35, BuiltinOptions.GatherNdOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ReverseSequenceOptions};
        if (A03[1].charAt(27) != 'j') {
            throw new RuntimeException();
        }
        A03[0] = "DMTuNl";
        A02 = bArr;
    }

    static {
        A02();
    }

    private QJ A00(AbstractC1775Qg abstractC1775Qg, int i) {
        C1781Qm A0B;
        QJ info;
        int A08 = this.A00.A08(abstractC1775Qg);
        if (A08 >= 0 && (A0B = this.A00.A0B(A08)) != null) {
            int i2 = A0B.A00;
            if (A03[2].length() != 2) {
                throw new RuntimeException();
            }
            A03[2] = "6x";
            if ((i2 & i) != 0) {
                int i3 = A0B.A00;
                int index = ~i;
                A0B.A00 = i3 & index;
                if (i == 4) {
                    info = A0B.A02;
                } else if (i == 8) {
                    info = A0B.A01;
                } else {
                    throw new IllegalArgumentException(A01(0, 29, 14));
                }
                int index2 = A0B.A00;
                if ((index2 & 12) == 0) {
                    this.A00.A0A(A08);
                    C1781Qm.A02(A0B);
                }
                return info;
            }
        }
        return null;
    }

    public final QJ A03(AbstractC1775Qg abstractC1775Qg) {
        return A00(abstractC1775Qg, 8);
    }

    public final QJ A04(AbstractC1775Qg abstractC1775Qg) {
        return A00(abstractC1775Qg, 4);
    }

    public final AbstractC1775Qg A05(long j) {
        return this.A01.A08(j);
    }

    public final void A06() {
        this.A00.clear();
        this.A01.A09();
    }

    public final void A07() {
        C1781Qm.A01();
    }

    public final void A08(long j, AbstractC1775Qg abstractC1775Qg) {
        this.A01.A0B(j, abstractC1775Qg);
    }

    public final void A09(AbstractC1775Qg abstractC1775Qg) {
        C1781Qm c1781Qm = this.A00.get(abstractC1775Qg);
        if (c1781Qm == null) {
            c1781Qm = C1781Qm.A00();
            this.A00.put(abstractC1775Qg, c1781Qm);
        }
        c1781Qm.A00 |= 1;
    }

    public final void A0A(AbstractC1775Qg abstractC1775Qg) {
        C1781Qm c1781Qm = this.A00.get(abstractC1775Qg);
        if (c1781Qm == null) {
            return;
        }
        c1781Qm.A00 &= -2;
    }

    public final void A0B(AbstractC1775Qg abstractC1775Qg) {
        int A06 = this.A01.A06() - 1;
        while (true) {
            if (A06 < 0) {
                break;
            }
            if (abstractC1775Qg == this.A01.A07(A06)) {
                this.A01.A0A(A06);
                break;
            }
            A06--;
        }
        C1781Qm info = this.A00.remove(abstractC1775Qg);
        if (info != null) {
            C1781Qm.A02(info);
        }
    }

    public final void A0C(AbstractC1775Qg abstractC1775Qg) {
        A0A(abstractC1775Qg);
    }

    public final void A0D(AbstractC1775Qg abstractC1775Qg, QJ qj) {
        C1781Qm c1781Qm = this.A00.get(abstractC1775Qg);
        if (c1781Qm == null) {
            c1781Qm = C1781Qm.A00();
            this.A00.put(abstractC1775Qg, c1781Qm);
        }
        c1781Qm.A00 |= 2;
        c1781Qm.A02 = qj;
    }

    public final void A0E(AbstractC1775Qg abstractC1775Qg, QJ qj) {
        C1781Qm c1781Qm = this.A00.get(abstractC1775Qg);
        if (c1781Qm == null) {
            c1781Qm = C1781Qm.A00();
            this.A00.put(abstractC1775Qg, c1781Qm);
        }
        c1781Qm.A01 = qj;
        c1781Qm.A00 |= 8;
    }

    public final void A0F(AbstractC1775Qg abstractC1775Qg, QJ qj) {
        C1781Qm c1781Qm = this.A00.get(abstractC1775Qg);
        if (c1781Qm == null) {
            c1781Qm = C1781Qm.A00();
            this.A00.put(abstractC1775Qg, c1781Qm);
        }
        c1781Qm.A02 = qj;
        c1781Qm.A00 |= 4;
    }

    public final void A0G(InterfaceC1782Qn interfaceC1782Qn) {
        for (int size = this.A00.size() - 1; size >= 0; size--) {
            AbstractC1775Qg A09 = this.A00.A09(size);
            C1781Qm A0A = this.A00.A0A(size);
            if ((A0A.A00 & 3) == 3) {
                interfaceC1782Qn.AJo(A09);
            } else {
                int index = A0A.A00;
                if ((index & 1) != 0) {
                    if (A0A.A02 == null) {
                        interfaceC1782Qn.AJo(A09);
                    } else {
                        interfaceC1782Qn.AGR(A09, A0A.A02, A0A.A01);
                    }
                } else if ((A0A.A00 & 14) == 14) {
                    interfaceC1782Qn.AGP(A09, A0A.A02, A0A.A01);
                } else if ((A0A.A00 & 12) == 12) {
                    interfaceC1782Qn.AGT(A09, A0A.A02, A0A.A01);
                } else {
                    int index2 = A0A.A00;
                    if ((index2 & 4) != 0) {
                        interfaceC1782Qn.AGR(A09, A0A.A02, null);
                    } else {
                        int index3 = A0A.A00;
                        if ((index3 & 8) != 0) {
                            QJ qj = A0A.A02;
                            if (A03[4].charAt(6) == 'y') {
                                throw new RuntimeException();
                            }
                            A03[7] = "pRTOxDzzIVV0VuKMKqyuKOShfW9n8";
                            interfaceC1782Qn.AGP(A09, qj, A0A.A01);
                        } else {
                            continue;
                        }
                    }
                }
            }
            C1781Qm.A02(A0A);
        }
    }

    public final boolean A0H(AbstractC1775Qg abstractC1775Qg) {
        C1781Qm record = this.A00.get(abstractC1775Qg);
        return (record == null || (record.A00 & 1) == 0) ? false : true;
    }

    public final boolean A0I(AbstractC1775Qg abstractC1775Qg) {
        C1781Qm record = this.A00.get(abstractC1775Qg);
        return (record == null || (record.A00 & 4) == 0) ? false : true;
    }
}
