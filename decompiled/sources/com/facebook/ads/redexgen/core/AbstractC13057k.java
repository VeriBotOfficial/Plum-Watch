package com.facebook.ads.redexgen.core;

import java.nio.ByteBuffer;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.7k, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC13057k extends AbstractC2825nW<C13047j, AbstractC13037i, C2643kM> implements InterfaceC2644kN {
    public static byte[] A01;
    public static String[] A02 = {"gN8", "v0q6HziqC5r28rLi1ZsQmD2OK0fgspik", "XftI4eRfVNg33Op0jQPz8O6PbCkMHbWE", "SdzNGuU6dc81VqISrLBD", "AmzsDcSyCxTNGO", "BjhKb3Az99p878kvj1gxEmyEzdFIjRD", "VkdZ1nUYKY17rCLbk1Npuh3A0WHSXOLE", "WDjquUi0atGhsKhHWhKEDeyGOzHRt12i"};
    public final String A00;

    public static String A0L(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] - i3) - 100);
            if (A02[0].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[2] = "7OO3CpMfw2stGNBOXFHDwltwdlKTQaUN";
            strArr[7] = "XdJDd6VP529P2X7c3MAKusUlyNrjc2WF";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A0M() {
        if (A02[0].length() != 3) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[5] = "V56IsTeJwH5mFHCmn3IS5snx7jCRlGG";
        strArr[4] = "owU73l6HwKvTqc";
        A01 = new byte[]{28, BuiltinOptions.EqualOptions, BuiltinOptions.GreaterOptions, 63, BuiltinOptions.ShapeOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.NegOptions, BuiltinOptions.PackOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.PadV2Options, -25, BuiltinOptions.PadV2Options, BuiltinOptions.GreaterOptions, BuiltinOptions.NegOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.PadV2Options, BuiltinOptions.GreaterOptions, -25, BuiltinOptions.GreaterOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ArgMinOptions};
    }

    public abstract J7 A0g(byte[] bArr, int i, boolean z) throws C2643kM;

    static {
        A0M();
    }

    public AbstractC13057k(String str) {
        super(new C13047j[2], new AbstractC13037i[2]);
        this.A00 = str;
        A0d(1024);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.0w] */
    @Override // com.facebook.ads.redexgen.core.AbstractC2825nW
    /* renamed from: A0H, reason: merged with bridge method [inline-methods] */
    public final C11370w A0c() {
        return new AbstractC13037i(this) { // from class: com.facebook.ads.redexgen.X.0w
            public final AbstractC13057k A00;

            {
                this.A00 = this;
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC13037i, com.facebook.ads.redexgen.core.AbstractC2826nX
            public final void A0B() {
                this.A00.A0h(this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC2825nW
    /* renamed from: A0I, reason: merged with bridge method [inline-methods] */
    public final C2643kM A0Y(C13047j c13047j, AbstractC13037i abstractC13037i, boolean z) {
        try {
            ByteBuffer inputData = (ByteBuffer) C3M.A01(c13047j.A02);
            abstractC13037i.A0C(c13047j.A01, A0g(inputData.array(), inputData.limit(), z), c13047j.A00);
            abstractC13037i.A01(Integer.MIN_VALUE);
            return null;
        } catch (C2643kM e) {
            return e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC2825nW
    /* renamed from: A0J, reason: merged with bridge method [inline-methods] */
    public final C2643kM A0Z(Throwable th) {
        return new C2643kM(A0L(0, 23, 99), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC2825nW
    /* renamed from: A0K, reason: merged with bridge method [inline-methods] */
    public final C13047j A0a() {
        return new C13047j();
    }

    public final void A0h(AbstractC13037i abstractC13037i) {
        super.A0f(abstractC13037i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2644kN
    public final void AIx(long j) {
    }
}
