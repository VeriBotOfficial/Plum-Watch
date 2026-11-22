package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.pu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2952pu<ModelType, StateType> {
    public static byte[] A0A;
    public static final C2952pu A0B;
    public EnumC2953pv A00;
    public EnumC2944pl A01;
    public String A02;
    public boolean A03;
    public final boolean A04;
    public final C2952pu A05;
    public final ModelType A06;
    public final StateType A07;
    public final String A08;
    public final List<ViewpointAction<ModelType, StateType>> A09;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 26);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{BuiltinOptions.AbsOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.IfOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.PowOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.GeluOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.PowOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.PowOptions, BuiltinOptions.SignOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.PowOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.PowOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.PowOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.PowOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.GeluOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.SquareOptions, BuiltinOptions.SplitVOptions};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final void A03(InterfaceC2943pk interfaceC2943pk) {
        Iterator<ViewpointAction<ModelType, StateType>> it = this.A09.iterator();
        while (it.hasNext()) {
            it.next().A6J(this, interfaceC2943pk);
        }
        EnumC2944pl A9M = interfaceC2943pk.A9M(this);
        this.A01 = A9M;
        if (A9M == EnumC2944pl.A02) {
            this.A03 = true;
        }
    }

    static {
        A02();
        A0B = new C2952pu(null, null, A01(48, 5, 44), A01(48, 5, 44), Collections.emptyList(), A0B, false);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.pu != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.pw != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2952pu(com.facebook.ads.redexgen.core.C2954pw<ModelType, StateType> r9) {
        /*
            r8 = this;
            java.lang.Object r1 = com.facebook.ads.redexgen.core.C2954pw.A01(r9)
            java.lang.Object r2 = com.facebook.ads.redexgen.core.C2954pw.A02(r9)
            java.lang.String r3 = com.facebook.ads.redexgen.core.C2954pw.A03(r9)
            java.lang.String r4 = com.facebook.ads.redexgen.core.C2954pw.A03(r9)
            java.util.List r0 = com.facebook.ads.redexgen.core.C2954pw.A04(r9)
            if (r0 != 0) goto L27
            java.util.List r5 = java.util.Collections.emptyList()
        L1a:
            com.facebook.ads.redexgen.X.pu r6 = com.facebook.ads.redexgen.core.C2954pw.A00(r9)
            boolean r7 = com.facebook.ads.redexgen.core.C2954pw.A05(r9)
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        L27:
            java.util.List r5 = com.facebook.ads.redexgen.core.C2954pw.A04(r9)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2952pu.<init>(com.facebook.ads.redexgen.X.pw):void");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.pu != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    public C2952pu(ModelType modeltype, StateType statetype, String str, String str2, List<ViewpointAction<ModelType, StateType>> list, C2952pu c2952pu, boolean z) {
        this.A00 = EnumC2953pv.A02;
        if (!(modeltype instanceof View)) {
            this.A06 = modeltype;
            this.A07 = statetype;
            this.A08 = str;
            this.A02 = str2;
            this.A05 = c2952pu;
            this.A03 = false;
            this.A09 = list;
            this.A04 = z;
            return;
        }
        throw new IllegalArgumentException(A01(0, 48, 2));
    }

    public static <ModelType, StateType> C2954pw<ModelType, StateType> A00(ModelType model, StateType state, String str) {
        return new C2954pw<>(model, state, str);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.pu != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    public final boolean A04() {
        return this.A03;
    }
}
