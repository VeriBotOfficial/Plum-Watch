package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.alibaba.fastjson.asm.Opcodes;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.imageutils.JfifUtil;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.wakeup.common.DeviceFeatures;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.9X, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9X extends AbstractC2910ox implements InterfaceC2819nQ {
    public static byte[] A0n;
    public static String[] A0o = {"elvUyEpYiUQqaqvwUQo90L33x5mfGGF5", "x3rc7jsIv6nSbJc9JPlcAze5yGxzQZsd", "UU9CG9klJf", "SZBoHO9Iw1qJ", "kHgqOkYqcJ", "2J3DKpzV", "imAdJlgwdHrtl5IWv7XQyaTS97", "KGY40HmMWVqKFUFEVN2bB10ght87eGPu"};
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public C2911oy A09;
    public C2894og A0A;
    public C2894og A0B;
    public C2894og A0C;
    public C2889ob A0D;
    public C2887oZ A0E;
    public C2858o4 A0F;
    public C2854o0 A0G;
    public C4N A0H;
    public C9Y A0I;
    public C12926x A0J;
    public C7I A0K;
    public CL A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final C2887oZ A0T;
    public final long A0U;
    public final long A0V;
    public final long A0W;
    public final Handler A0X;
    public final Handler A0Y;
    public final Looper A0Z;
    public final InterfaceC11902z A0a;
    public final C2876oN A0b;
    public final C3T A0c;
    public final C3W A0d;
    public final C2817nO A0e;
    public final C9W A0f;
    public final InterfaceC2808nF A0g;
    public final EK A0h;
    public final EL A0i;
    public final CopyOnWriteArraySet<InterfaceC12635u> A0j;
    public final CopyOnWriteArraySet<InterfaceC11832s> A0k;
    public final boolean A0l;
    public final InterfaceC2815nM[] A0m;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0n, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0n = new byte[]{BuiltinOptions.CumsumOptions, 29, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.DensifyOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.SelectV2Options, Byte.MAX_VALUE, BuiltinOptions.DensifyOptions, 0, 61, BuiltinOptions.NegOptions, 21, BuiltinOptions.LessOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.LogicalOrOptions, 32, BuiltinOptions.ShapeOptions, 9, BuiltinOptions.GreaterOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.GeluOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.SignOptions, BuiltinOptions.SelectOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.SignOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.GeluOptions, BuiltinOptions.GeluOptions, BuiltinOptions.RandomOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.DensifyOptions, Byte.MAX_VALUE, BuiltinOptions.RandomOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.DensifyOptions, Byte.MAX_VALUE, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.RandomOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.ArgMinOptions, 29, BuiltinOptions.CosOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.RandomOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.DensifyOptions, Byte.MAX_VALUE, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.RandomOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.SliceOptions, 29, BuiltinOptions.AddNOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.RandomOptions, BuiltinOptions.GeluOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.DensifyOptions, Byte.MAX_VALUE, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.RandomOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.SliceOptions, 29, BuiltinOptions.FillOptions, BuiltinOptions.RandomOptions, BuiltinOptions.RandomOptions, BuiltinOptions.ShapeOptions, Byte.MAX_VALUE, BuiltinOptions.DensifyOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.PowOptions, BuiltinOptions.PowOptions, BuiltinOptions.RandomOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.SignOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.RandomOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.PowOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.RandomOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.PowOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.SignOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BatchMatMulOptions, 58, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.GeluOptions, BuiltinOptions.GeluOptions, BuiltinOptions.RandomOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BucketizeOptions, 58, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UnsortedSegmentSumOptions, 58, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ReadVariableOptions, 58, BuiltinOptions.DensifyOptions, Byte.MAX_VALUE, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.RandomOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.BucketizeOptions, 20, 35, BuiltinOptions.NegOptions, 35, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.EqualOptions, 35, BuiltinOptions.CumsumOptions, BuiltinOptions.ATan2Options, BuiltinOptions.RankOptions, BuiltinOptions.PadV2Options, BuiltinOptions.UniqueOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.IfOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.HashtableImportOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.HashtableOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.WhileOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.ATan2Options, BuiltinOptions.FloorDivOptions, 14, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.RangeOptions, 64, BuiltinOptions.FloorDivOptions, BuiltinOptions.IfOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.ResizeNearestNeighborOptions, 14, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.WhileOptions, BuiltinOptions.LeakyReluOptions, 14, BuiltinOptions.SplitVOptions, 64, 14, BuiltinOptions.SplitVOptions, BuiltinOptions.ResizeNearestNeighborOptions, 14, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.WhileOptions, 14, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.SquareOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 64, BuiltinOptions.RangeOptions};
    }

    static {
        A06();
    }

    public C9X(InterfaceC2815nM[] interfaceC2815nMArr, EK ek, C6S c6s, EU eu, C3T c3t) {
        this(interfaceC2815nMArr, ek, c6s, eu, c3t, false, false, false, false, false, false, 0L, false, 0, false, false, false, false, false, false, false, null);
    }

    public C9X(@MetaExoPlayerCustomization("qe_android_video_exoplayer2.update_loading_priority_exo2 is consistently false. We do not need to port this in the upgrade") InterfaceC2815nM[] interfaceC2815nMArr, @MetaExoPlayerCustomization("Introduced in D13513334 and also used in loop playing for IG: D38285740") EK ek, @MetaExoPlayerCustomization("Currently used to load chunks while seeking on pause D13827150") C6S c6s, @MetaExoPlayerCustomization("D40987428 Brought in for clippingmediasource") EU eu, @MetaExoPlayerCustomization("D45597293 for Oculus - allowing the start renderer offset to not be 0; Eventually changed in Exo: https://github.com/google/ExoPlayer/commit/9f352434c72da527d1fa7963447c3cf680db884f") C3T c3t, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, long j, boolean z7, int i, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, InterfaceC11902z interfaceC11902z) {
        InterfaceC11902z interfaceC11902z2 = interfaceC11902z;
        Log.i(A04(2, 13, 30), A04(33, 5, 30) + Integer.toHexString(System.identityHashCode(this)) + A04(0, 2, 87) + A04(15, 18, 84) + A04(DeviceFeatures.SLEEP_APNEA, 3, 26) + AbstractC12174a.A04 + A04(193, 1, 54));
        this.A0d = new C3W();
        try {
            this.A0M = z13;
            C3M.A08(interfaceC2815nMArr.length > 0);
            this.A0m = (InterfaceC2815nM[]) C3M.A01(interfaceC2815nMArr);
            this.A0h = (EK) C3M.A01(ek);
            this.A0Q = false;
            this.A00 = 1.0f;
            this.A05 = 0;
            this.A0A = C2894og.A0Z;
            this.A0B = C2894og.A0Z;
            this.A0C = C2894og.A0Z;
            this.A0S = false;
            this.A0V = 0L;
            this.A09 = C2911oy.A07;
            this.A0W = 0L;
            this.A0k = new CopyOnWriteArraySet<>();
            this.A0U = 0L;
            InterfaceC2808nF analyticsCollector = InterfaceC2808nF.A00;
            this.A0g = analyticsCollector;
            this.A0K = C7I.A03;
            this.A06 = 1;
            this.A0e = new C2817nO();
            this.A0i = new EL(new C7G[interfaceC2815nMArr.length], new InterfaceC2715lj[interfaceC2815nMArr.length], C2860o6.A03, null);
            this.A0b = new C2876oN();
            this.A0T = new C11782n().A03(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28).A01(29, ek.A0Y()).A04();
            this.A0E = new C11782n().A02(this.A0T).A00(4).A00(10).A04();
            this.A0G = C2854o0.A03;
            this.A0D = C2889ob.A06;
            this.A0Z = Looper.myLooper();
            final Looper myLooper = Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper();
            this.A0X = new Handler(myLooper) { // from class: com.facebook.ads.redexgen.X.60
                @Override // android.os.Handler
                public final void handleMessage(Message msg) {
                    if (AbstractC1907Vl.A02(this)) {
                        return;
                    }
                    try {
                        C9X.this.A0N(msg);
                    } catch (Throwable th) {
                        AbstractC1907Vl.A00(th, this);
                    }
                }
            };
            this.A0c = c3t;
            this.A0a = interfaceC11902z2 == null ? this : interfaceC11902z2;
            this.A0J = new C12926x(Timeline.A02, 0L, C2742mA.A06, this.A0i);
            this.A0f = new C9W(interfaceC2815nMArr, ek, this.A0i, c6s, eu, this.A0Q, this.A05, this.A0S, this.A0X, c3t, z, z2, z3, z4, z5, z6, j, z7, i, z8, z9, z10, z11, z12, z14, C13077m.A03);
            this.A0F = C2858o4.A06;
            this.A0H = C4N.A03;
            this.A0Y = new Handler(this.A0f.A1B());
            this.A0j = new CopyOnWriteArraySet<>();
        } finally {
            this.A0d.A04();
        }
    }

    private long A00(long j) {
        long A01 = AbstractC11631w.A01(j);
        if (!this.A0J.A05.A00()) {
            this.A0J.A03.A0J(this.A0J.A05.A04, this.A0b);
            long positionMs = this.A0b.A0B();
            return A01 + positionMs;
        }
        return A01;
    }

    private long A01(Timeline timeline, C2752mL c2752mL, long j) {
        timeline.A0J(c2752mL.A04, this.A0b);
        return j + this.A0b.A0C();
    }

    private C12926x A02(boolean z, boolean z2, int i) {
        EL el;
        if (z) {
            this.A02 = 0;
            this.A01 = 0;
            this.A08 = 0L;
            this.A07 = 0L;
        } else {
            this.A02 = A7Z();
            this.A01 = A7U();
            this.A08 = A7W();
            this.A07 = A0J();
        }
        Timeline timeline = z2 ? Timeline.A02 : this.A0J.A03;
        C2752mL c2752mL = this.A0J.A05;
        long j = this.A0J.A02;
        long j2 = this.A0J.A01;
        C2742mA c2742mA = z2 ? C2742mA.A06 : this.A0J.A06;
        if (z2) {
            el = this.A0i;
        } else {
            C12926x c12926x = this.A0J;
            String[] strArr = A0o;
            if (strArr[7].charAt(29) != strArr[0].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0o;
            strArr2[3] = "Omd19LzmWdt3";
            strArr2[5] = "slTdP4Xe";
            el = c12926x.A07;
        }
        return new C12926x(timeline, c2752mL, j, j2, i, false, c2742mA, el, this.A0J.A05, this.A0J.A02, 0L, this.A0J.A02);
    }

    private AnonymousClass71 A03(AnonymousClass70 anonymousClass70) {
        int A7Z = A7Z();
        C9W c9w = this.A0f;
        Timeline timeline = this.A0J.A03;
        if (A7Z == -1) {
            A7Z = 0;
        }
        return new AnonymousClass71(c9w, anonymousClass70, timeline, A7Z, this.A0c, this.A0f.A1B());
    }

    private void A05() {
        if (!this.A0M) {
            return;
        }
        this.A0d.A01();
        if (Thread.currentThread() != A0K().getThread()) {
            String A0n2 = AbstractC12174a.A0n(A04(38, 147, 6), Thread.currentThread().getName(), A0K().getThread().getName());
            if (!this.A0l) {
                Log.w(A04(2, 13, 30), A0n2, this.A0N ? null : new IllegalStateException());
                if (A0o[6].length() == 12) {
                    throw new RuntimeException();
                }
                A0o[6] = "OHv4LuNWT";
                this.A0N = true;
                return;
            }
            throw new IllegalStateException(A0n2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
    
        if (r5 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A07(com.facebook.ads.redexgen.core.C12926x r15, int r16, boolean r17, int r18) {
        /*
            r14 = this;
            r6 = r15
            r3 = r14
            int r0 = r3.A03
            int r0 = r0 - r16
            r3.A03 = r0
            int r0 = r3.A03
            if (r0 != 0) goto L72
            long r4 = r6.A02
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L25
            com.facebook.ads.redexgen.X.mL r7 = r6.A05
            long r10 = r6.A01
            long r0 = r6.A0D
            r8 = 0
            r6 = r6
            r12 = r0
            com.facebook.ads.redexgen.X.6x r6 = r6.A06(r7, r8, r10, r12)
        L25:
            com.facebook.ads.redexgen.X.6x r0 = r3.A0J
            com.facebook.ads.androidx.media3.common.Timeline r0 = r0.A03
            boolean r0 = r0.A0N()
            r4 = 0
            if (r0 == 0) goto L4d
            boolean r5 = r3.A0O
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C9X.A0o
            r0 = 3
            r1 = r2[r0]
            r0 = 5
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L75
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C9X.A0o
            java.lang.String r1 = "E7I7Mej0S3DTzUCwep"
            r0 = 6
            r2[r0] = r1
            if (r5 == 0) goto L5f
        L4d:
            com.facebook.ads.androidx.media3.common.Timeline r0 = r6.A03
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L5f
            r3.A01 = r4
            r3.A02 = r4
            r0 = 0
            r3.A08 = r0
            r3.A07 = r0
        L5f:
            boolean r0 = r3.A0O
            if (r0 == 0) goto L73
            r9 = 0
        L64:
            boolean r10 = r3.A0P
            r3.A0O = r4
            r3.A0P = r4
            r5 = r14
            r8 = r18
            r7 = r17
            r5.A08(r6, r7, r8, r9, r10)
        L72:
            return
        L73:
            r9 = 2
            goto L64
        L75:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C9X.A07(com.facebook.ads.redexgen.X.6x, int, boolean, int):void");
    }

    /* JADX WARN: Incorrect condition in loop: B:23:0x009b */
    /* JADX WARN: Incorrect condition in loop: B:29:0x00b8 */
    /* JADX WARN: Incorrect condition in loop: B:47:0x0121 */
    /* JADX WARN: Incorrect condition in loop: B:54:0x0144 */
    /* JADX WARN: Incorrect condition in loop: B:61:0x0058 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A08(com.facebook.ads.redexgen.core.C12926x r10, boolean r11, int r12, int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C9X.A08(com.facebook.ads.redexgen.X.6x, boolean, int, int, boolean):void");
    }

    @MetaExoPlayerCustomization("D31846300; Custom MediaSessionEventListener")
    private final void A09(boolean z, boolean z2) {
        if (this.A0Q != z) {
            this.A0Q = z;
            this.A04++;
            this.A0f.A1G(z);
            C12926x c12926x = this.A0J;
            if (!z) {
                this.A0R = z;
                Iterator<InterfaceC11832s> it = this.A0k.iterator();
                while (it.hasNext()) {
                    InterfaceC11832s next = it.next();
                    if (0 != 0) {
                        throw new NullPointerException(A04(DeviceFeatures.NETWORK_SHARE, 20, 29));
                    }
                    next.AEf(z, c12926x.A00);
                }
            }
        }
    }

    private boolean A0A() {
        return this.A0J.A03.A0N() || this.A03 > 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2910ox
    public final void A0H(int i, long j) {
        long A00;
        Timeline timeline = this.A0J.A03;
        if (i >= 0) {
            boolean A0N = timeline.A0N();
            if (A0o[6].length() == 12) {
                throw new RuntimeException();
            }
            String[] strArr = A0o;
            strArr[3] = "u5DgO7GwYyET";
            strArr[5] = "hfn3fs8A";
            if (A0N || i < timeline.A07()) {
                this.A0P = true;
                this.A03++;
                if (AAU()) {
                    Log.w(A04(2, 13, 30), A04(JfifUtil.MARKER_EOI, 39, 63));
                    this.A0X.obtainMessage(0, 1, -1, this.A0J).sendToTarget();
                    return;
                }
                this.A02 = i;
                if (timeline.A0N()) {
                    this.A08 = j == -9223372036854775807L ? 0L : j;
                    this.A01 = 0;
                } else {
                    if (j == -9223372036854775807L) {
                        A00 = timeline.A0K(i, super.A00).A05();
                    } else {
                        A00 = AbstractC11631w.A00(j);
                    }
                    Pair<Object, Long> A0D = timeline.A0D(super.A00, this.A0b, i, A00);
                    this.A08 = AbstractC11631w.A01(A00);
                    this.A01 = timeline.A0A(A0D.first);
                }
                this.A0f.A1D(timeline, i, AbstractC11631w.A00(j));
                Iterator<InterfaceC11832s> it = this.A0k.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                return;
            }
        }
        throw new C2E(timeline, i, j);
    }

    public final long A0I() {
        if (A0A()) {
            return this.A08;
        }
        if (this.A0J.A04.A03 != this.A0J.A05.A03) {
            return this.A0J.A03.A0K(A7Z(), super.A00).A06();
        }
        long j = this.A0J.A0B;
        if (this.A0J.A04.A00()) {
            C2876oN A0J = this.A0J.A03.A0J(this.A0J.A04.A04, this.A0b);
            j = A0J.A0D(this.A0J.A04.A00);
            if (j == Long.MIN_VALUE) {
                j = A0J.A01;
            }
        }
        long contentBufferedPositionUs = A01(this.A0J.A03, this.A0J.A04, j);
        return AbstractC12174a.A0P(contentBufferedPositionUs);
    }

    public final long A0J() {
        if (A0A()) {
            long j = this.A07;
            String[] strArr = A0o;
            if (strArr[7].charAt(29) != strArr[0].charAt(29)) {
                throw new RuntimeException();
            }
            A0o[1] = "SWSNQbytnn5JxmoGO3rxXNMtbmar9O4q";
            return j;
        }
        C12926x c12926x = this.A0J;
        if (A0o[1].charAt(28) == 'y') {
            throw new RuntimeException();
        }
        A0o[1] = "VYQpOR71WpATH6H66c6IUhHHWo1qZbHI";
        return AbstractC11631w.A01(c12926x.A0C);
    }

    public final Looper A0K() {
        return this.A0Z;
    }

    public final AnonymousClass71 A0L(AnonymousClass70 anonymousClass70) {
        A05();
        return A03(anonymousClass70);
    }

    public final void A0M() {
        StringBuilder append = new StringBuilder().append(A04(Opcodes.INVOKEINTERFACE, 8, 87)).append(Integer.toHexString(System.identityHashCode(this))).append(A04(0, 2, 87)).append(A04(15, 18, 84));
        String A04 = A04(DeviceFeatures.SLEEP_APNEA, 3, 26);
        Log.i(A04(2, 13, 30), append.append(A04).append(AbstractC12174a.A04).append(A04).append(C2T.A00()).append(A04(193, 1, 54)).toString());
        this.A0L = null;
        this.A0f.A1C();
        this.A0X.removeCallbacksAndMessages(null);
        this.A0J = A02(false, false, 1);
        this.A0G = C2854o0.A03;
    }

    public final void A0N(Message message) {
        switch (message.what) {
            case 0:
                A07((C12926x) message.obj, message.arg1, message.arg2 != -1, message.arg2);
                return;
            case 1:
                C2889ob c2889ob = (C2889ob) message.obj;
                C2889ob c2889ob2 = this.A0D;
                String[] strArr = A0o;
                if (strArr[2].length() == strArr[4].length()) {
                    String[] strArr2 = A0o;
                    strArr2[2] = "M5Fz4bo4aU";
                    strArr2[4] = "jAP48pK2xI";
                    if (!c2889ob2.equals(c2889ob)) {
                        this.A0D = c2889ob;
                        Iterator<InterfaceC11832s> it = this.A0k.iterator();
                        while (it.hasNext()) {
                            it.next().AEb(c2889ob);
                        }
                        return;
                    }
                    return;
                }
                break;
            case 2:
                C9Y c9y = (C9Y) message.obj;
                this.A0I = c9y;
                CopyOnWriteArraySet<InterfaceC11832s> copyOnWriteArraySet = this.A0k;
                String[] strArr3 = A0o;
                if (strArr3[7].charAt(29) != strArr3[0].charAt(29)) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A0o;
                strArr4[3] = "qauhWK691fBn";
                strArr4[5] = "FsOQ1ovS";
                Iterator<InterfaceC11832s> it2 = copyOnWriteArraySet.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    String[] strArr5 = A0o;
                    if (strArr5[3].length() != strArr5[5].length()) {
                        A0o[6] = "DbAY1NxOkLRBmNTAZlCZyxXxDbYRxJk";
                        if (!hasNext) {
                            return;
                        }
                    } else if (!hasNext) {
                        return;
                    }
                    it2.next().AEd(c9y);
                }
            case 3:
                this.A04--;
                if (this.A04 == 0) {
                    this.A0R = ((Boolean) message.obj).booleanValue();
                    CopyOnWriteArraySet<InterfaceC11832s> copyOnWriteArraySet2 = this.A0k;
                    if (A0o[1].charAt(28) == 'y') {
                        throw new RuntimeException();
                    }
                    String[] strArr6 = A0o;
                    strArr6[3] = "yizDUJeCRugc";
                    strArr6[5] = "UffiDbl9";
                    Iterator<InterfaceC11832s> it3 = copyOnWriteArraySet2.iterator();
                    while (it3.hasNext()) {
                        InterfaceC11832s next = it3.next();
                        if (this.A0R) {
                            next.AEf(this.A0R, this.A0J.A00);
                        }
                    }
                    return;
                }
                return;
            case 4:
                Iterator<InterfaceC11832s> it4 = this.A0k.iterator();
                while (it4.hasNext()) {
                    it4.next();
                }
                return;
            case 5:
                CopyOnWriteArraySet<InterfaceC11832s> copyOnWriteArraySet3 = this.A0k;
                String[] strArr7 = A0o;
                if (strArr7[7].charAt(29) == strArr7[0].charAt(29)) {
                    String[] strArr8 = A0o;
                    strArr8[3] = "QQxFLYRHq8rv";
                    strArr8[5] = "zDzShVZM";
                    Iterator<InterfaceC11832s> it5 = copyOnWriteArraySet3.iterator();
                    while (it5.hasNext()) {
                        it5.next();
                    }
                    return;
                }
                break;
            default:
                throw new IllegalStateException();
        }
        throw new RuntimeException();
    }

    public final void A0O(InterfaceC11832s interfaceC11832s) {
        this.A0k.add(interfaceC11832s);
    }

    public final void A0P(CL cl, boolean z, boolean z2) {
        this.A0I = null;
        this.A0L = cl;
        C12926x A02 = A02(z, z2, 2);
        this.A0O = true;
        this.A03++;
        this.A0f.A1F(cl, z, z2);
        A08(A02, false, 4, 1, false);
    }

    public final void A0Q(boolean z) {
        A09(z, false);
    }

    public final boolean A0R() {
        return this.A0Q;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC11902z
    public final long A6z() {
        if (AAU()) {
            if (this.A0J.A04.equals(this.A0J.A05)) {
                return AbstractC11631w.A01(this.A0J.A0B);
            }
            return A7k();
        }
        return A0I();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC11902z
    public final long A7L() {
        if (AAU()) {
            this.A0J.A03.A0J(this.A0J.A05.A04, this.A0b);
            return this.A0b.A0B() + AbstractC11631w.A01(this.A0J.A01);
        }
        return A7W();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC11902z
    public final int A7Q() {
        if (AAU()) {
            return this.A0J.A05.A00;
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC11902z
    public final int A7R() {
        if (AAU()) {
            return this.A0J.A05.A01;
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC11902z
    @MetaExoPlayerCustomization("getCurrentWindowIndex needs to be upgraded to getCurrentWindowIndexInternal")
    public final int A7T() {
        A05();
        int A7Z = A7Z();
        if (A7Z == -1) {
            return 0;
        }
        return A7Z;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC11902z
    public final int A7U() {
        if (A0A()) {
            return this.A01;
        }
        Timeline timeline = this.A0J.A03;
        C2752mL c2752mL = this.A0J.A05;
        String[] strArr = A0o;
        if (strArr[3].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        A0o[1] = "6o1scJ9TwXJl7WSt7vZ9WMBcl2tfzHGN";
        return timeline.A0A(c2752mL.A04);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC11902z
    public final long A7W() {
        if (A0A()) {
            return this.A08;
        }
        if (this.A0J.A05.A00()) {
            return AbstractC11631w.A01(this.A0J.A0C);
        }
        return A00(this.A0J.A0C);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC11902z
    public final Timeline A7Y() {
        return this.A0J.A03;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC11902z
    public final int A7Z() {
        if (A0A()) {
            int i = this.A02;
            String[] strArr = A0o;
            if (strArr[7].charAt(29) != strArr[0].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0o;
            strArr2[3] = "0i1iYNlUg7j9";
            strArr2[5] = "Koyujpdg";
            return i;
        }
        return this.A0J.A03.A0J(this.A0J.A05.A04, this.A0b).A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC11902z
    public final long A7k() {
        Timeline timeline = this.A0J.A03;
        if (timeline.A0N()) {
            return -9223372036854775807L;
        }
        if (AAU()) {
            C2752mL c2752mL = this.A0J.A05;
            timeline.A0J(c2752mL.A04, this.A0b);
            return AbstractC11631w.A01(this.A0b.A0E(c2752mL.A00, c2752mL.A01));
        }
        return timeline.A0K(A7Z(), super.A00).A06();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC11902z
    public final long A9B() {
        return Math.max(0L, AbstractC11631w.A01(this.A0J.A0D));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC11902z
    public final boolean AAU() {
        return !A0A() && this.A0J.A05.A00();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC11902z
    public final void AJV(boolean z) {
        if (z) {
            this.A0I = null;
            this.A0L = null;
        }
        C12926x A02 = A02(z, z, 1);
        this.A03++;
        this.A0f.A1H(z);
        A08(A02, false, 4, 1, false);
        this.A0G = new C2854o0(MetaExoPlayerCustomizedCollections.A01(), A02.A0C);
    }
}
