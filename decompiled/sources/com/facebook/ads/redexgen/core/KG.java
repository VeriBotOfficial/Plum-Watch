package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public final class KG implements InterfaceC1924Wc {
    public static byte[] A0B;
    public int A00;
    public int A01;
    public int A02;
    public AbstractC1958Xm A03;
    public String A04;
    public String A05;
    public KE A06;
    public boolean A0A = false;
    public boolean A09 = false;
    public boolean A08 = false;
    public Integer A07 = null;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 113);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0B = new byte[]{BuiltinOptions.AbsOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.SignOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.UnsortedSegmentMaxOptions, Byte.MAX_VALUE};
    }

    public KG(int i, int i2, int i3, String str, String str2, AbstractC1958Xm abstractC1958Xm, KE ke) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
        this.A05 = str;
        this.A04 = str2;
        this.A03 = abstractC1958Xm;
        this.A06 = ke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A02() {
        if (this.A08) {
            A04();
        }
    }

    public final synchronized void A04() {
        if (this.A09) {
            return;
        }
        this.A09 = true;
        if (this.A01 == 1 && this.A03 != null) {
            this.A03.setProgressImage(null);
            this.A03.setProgressClickListener(null);
            this.A03.setToolbarActionMessage(A00(0, 0, 66));
            this.A03.A07();
            if (this.A07 != null) {
                this.A03.setToolbarActionMode(this.A07.intValue());
            }
            if (this.A06.getColorInfo() != null) {
                this.A03.A0A(this.A06.getColorInfo(), false);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1924Wc
    public final synchronized void ACp() {
        if (!this.A09) {
            this.A06.A0E(A00(6, 9, 101));
        }
        A04();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1924Wc
    public final synchronized void AEn(float f) {
        if (!this.A09 && this.A03 != null) {
            if (this.A01 == 1) {
                if (!this.A0A) {
                    this.A07 = Integer.valueOf(this.A03.getToolbarActionMode());
                    this.A03.setProgressClickListener(new ViewOnClickListenerC2027a3(this));
                    this.A03.A08();
                    this.A03.setToolbarListener(new KH(this));
                    this.A0A = true;
                    if (this.A07 == null || this.A07.intValue() == 4) {
                        this.A03.setToolbarActionMode(5);
                    } else {
                        this.A03.setToolbarActionMode(6);
                    }
                }
                if (f <= this.A02) {
                    if (!this.A08) {
                        this.A08 = true;
                        if (this.A07 == null || this.A07.intValue() == 4) {
                            this.A03.setToolbarActionMode(7);
                        } else {
                            this.A03.setProgressImage(XX.CROSS);
                            this.A03.setToolbarActionMode(6);
                        }
                    }
                    this.A03.setToolbarActionMessage(this.A04.replace(A00(0, 6, 100), String.valueOf((int) Math.ceil(f))));
                } else {
                    this.A03.setToolbarActionMessage(this.A05);
                }
            }
        }
    }
}
