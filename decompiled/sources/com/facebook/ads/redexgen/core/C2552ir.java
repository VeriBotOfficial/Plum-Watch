package com.facebook.ads.redexgen.core;

import android.os.ConditionVariable;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.wakeup.common.DeviceFeatures;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Random;
import java.util.TreeSet;
import org.apache.commons.net.telnet.TelnetCommand;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.ir, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2552ir implements InterfaceC1655Ln {
    public static byte[] A0B;
    public static String[] A0C = {"", "bCiwVY89t3fNm3gVh5Cta1r1ex617UD6", "2pbQHFWCVx6Uhmp9EyO9uCwpcu4x9Dl0", "32tJ4jyYWOzcf72n5Wgg62", "i6oCPG91V", "KagoX429g1hrk2zqYLocuLLyf0lslURo", "DhZpyS71VRHuUy7Qk1AUkZm91VAyIgrZ", "oeCQOWeJcqbtbEq5qioytyhoePvaJg5Z"};
    public static final HashSet<File> A0D;
    public long A00;
    public long A01;
    public C1652Lk A02;
    public boolean A03;
    public final InterfaceC2557iw A04;
    public final C1661Lt A05;
    public final M6 A06;
    public final File A07;
    public final HashMap<String, ArrayList<InterfaceC1654Lm>> A08;
    public final Random A09;
    public final boolean A0A;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0C;
            if (strArr[3].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[6] = "f7QnNjNC08rjnWmNVHuGYagSWe5Lcp9o";
            strArr2[7] = "r0Bisby3rM4igG5oRpf6tXDb0tjiDQ2I";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 43);
            i4++;
        }
    }

    public static void A07() {
        A0B = new byte[]{BuiltinOptions.HashtableSizeOptions, BuiltinOptions.EqualOptions, BuiltinOptions.LessOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.RankOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.UniqueOptions, 2, BuiltinOptions.AssignVariableOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.AddNOptions, BuiltinOptions.AbsOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 2, BuiltinOptions.LeakyReluOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.RankOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 2, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.ReverseV2Options, 2, BuiltinOptions.RankOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 2, BuiltinOptions.FillOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.AbsOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.UniqueOptions, 24, 2, BuiltinOptions.RandomOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.RankOptions, BuiltinOptions.AbsOptions, BuiltinOptions.AddNOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, 13, BuiltinOptions.SegmentSumOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.AddNOptions, BuiltinOptions.GeluOptions, BuiltinOptions.RankOptions, BuiltinOptions.CosOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.AddNOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.ZerosLikeOptions, 35, 4, 12, 9, 0, 1, BuiltinOptions.BidirectionalSequenceLSTMOptions, 17, 10, BuiltinOptions.BidirectionalSequenceLSTMOptions, 6, 23, 0, 4, 17, 0, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.SliceOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.ExpOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, 3, 12, 9, 0, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.BidirectionalSequenceLSTMOptions, 31, BuiltinOptions.PowOptions, BuiltinOptions.SliceOptions, BuiltinOptions.EqualOptions, BuiltinOptions.LogicalOrOptions, 61, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.UnsortedSegmentSumOptions, 58, BuiltinOptions.PadV2Options, BuiltinOptions.LogicalOrOptions, BuiltinOptions.PowOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.UnsortedSegmentSumOptions, 58, BuiltinOptions.PowOptions, 58, BuiltinOptions.TransposeConvOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.UnsortedSegmentSumOptions, 12, 16, 29, BuiltinOptions.DensifyOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.AbsOptions, 10, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, 10, BuiltinOptions.RangeOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.SplitVOptions, 10, BuiltinOptions.RangeOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.RangeOptions, BuiltinOptions.SquareOptions, BuiltinOptions.SplitVOptions, 10, BuiltinOptions.AbsOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.RangeOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.GatherNdOptions, 16, 10, BuiltinOptions.ReadVariableOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.AddNOptions, 22, BuiltinOptions.SquareOptions, BuiltinOptions.QuantizeOptions, 22, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.SquareOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.GatherNdOptions, 22, BuiltinOptions.WhereOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.WhereOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.GatherNdOptions, 22, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.AddNOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.WhereOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, 12, 22, BuiltinOptions.PadV2Options, 12, 4, 1, 8, 9, BuiltinOptions.MirrorPadOptions, 25, 2, BuiltinOptions.MirrorPadOptions, 1, 4, 30, 25, BuiltinOptions.MirrorPadOptions, 14, 12, 14, 5, 8, BuiltinOptions.MirrorPadOptions, 9, 4, 31, 8, 14, 25, 2, 31, 20, BuiltinOptions.MirrorPadOptions, 11, 4, 1, 8, 30, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.SliceOptions, 23, 31, 26, 19, 18, BuiltinOptions.RankOptions, 2, 25, BuiltinOptions.RankOptions, 4, 19, 27, 25, 0, 19, BuiltinOptions.RankOptions, 16, 31, 26, 19, BuiltinOptions.RankOptions, 31, 24, 18, 19, 14, BuiltinOptions.RankOptions, 19, 24, 2, 4, 15, BuiltinOptions.RankOptions, 16, 25, 4, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.RankOptions, BuiltinOptions.PowOptions, 20, 25, 19, 26, 7, 24, 16, 17, BuiltinOptions.WhereOptions, 32, BuiltinOptions.LogicalOrOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.WhereOptions, 19, 28, 25, 16, BuiltinOptions.SplitVOptions, BuiltinOptions.WhereOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.IfOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.CosOptions, BuiltinOptions.RankOptions, BuiltinOptions.WhileOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.WhileOptions, 64, BuiltinOptions.HardSwishOptions, BuiltinOptions.IfOptions, BuiltinOptions.WhereOptions, 18, BuiltinOptions.HardSwishOptions, BuiltinOptions.IfOptions, BuiltinOptions.RankOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.ResizeNearestNeighborOptions, 18, BuiltinOptions.CosOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.ReverseSequenceOptions, 18, BuiltinOptions.CosOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.RankOptions};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0G(File file, boolean z, File[] fileArr, Map<String, C1660Ls> map) {
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            if (A0C[2].charAt(26) != '8') {
                String[] strArr = A0C;
                strArr[6] = "8aOt5QXsfRNGpIpRxoAxSAZDoaRpec1S";
                strArr[7] = "wFGX3oecQoVuPclALoyOBFGO19d1hLj7";
                String name = file2.getName();
                if (z && name.indexOf(46) == -1) {
                    A0G(file2, false, file2.listFiles(), map);
                } else {
                    if (z) {
                        boolean A0A = M6.A0A(name);
                        if (A0C[0].length() != 2) {
                            String[] strArr2 = A0C;
                            strArr2[3] = "SjNVVRrUmgTFjXqPeyNmbh";
                            strArr2[4] = "SAWP83LvD";
                            if (!A0A) {
                                if (name.endsWith(A04(0, 4, 107))) {
                                }
                            }
                        }
                    }
                    long j = -1;
                    long j2 = -9223372036854775807L;
                    C1660Ls remove = map != null ? map.remove(name) : null;
                    if (remove != null) {
                        j = remove.A01;
                        j2 = remove.A00;
                    }
                    C2551iq A01 = C2551iq.A01(file2, j, j2, this.A06);
                    if (A01 != null) {
                        A0C(A01);
                    } else {
                        file2.delete();
                    }
                }
            }
            throw new RuntimeException();
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized NavigableSet<C1665Lx> A0I(String str) {
        M4 A0C2;
        C3M.A08(!this.A03);
        A0C2 = this.A06.A0C(str);
        return (A0C2 == null || A0C2.A09()) ? new TreeSet() : new TreeSet((Collection) A0C2.A06());
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1655Ln
    public final synchronized long A73(String str, long j, long j2) {
        long j3;
        long j4 = j;
        synchronized (this) {
            long j5 = j2 == -1 ? Long.MAX_VALUE : j4 + j2;
            if (j5 < 0) {
                j5 = Long.MAX_VALUE;
            }
            j3 = 0;
            while (j4 < j5) {
                long A74 = A74(str, j4, j5 - j4);
                if (A74 > 0) {
                    j3 += A74;
                } else {
                    A74 = -A74;
                }
                j4 += A74;
            }
        }
        return j3;
    }

    static {
        A07();
        A0D = new HashSet<>();
    }

    @Deprecated
    public C2552ir(File file, InterfaceC2557iw interfaceC2557iw) {
        this(file, interfaceC2557iw, (byte[]) null, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2552ir(java.io.File r8, com.facebook.ads.redexgen.core.InterfaceC2557iw r9, com.facebook.ads.redexgen.core.InterfaceC12294m r10, byte[] r11, boolean r12, boolean r13) {
        /*
            r7 = this;
            com.facebook.ads.redexgen.X.M6 r1 = new com.facebook.ads.redexgen.X.M6
            r5 = r12
            r4 = r11
            r2 = r10
            r6 = r13
            r3 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            if (r2 == 0) goto L17
            if (r6 != 0) goto L17
            com.facebook.ads.redexgen.X.Lt r0 = new com.facebook.ads.redexgen.X.Lt
            r0.<init>(r2)
        L13:
            r7.<init>(r3, r9, r1, r0)
            return
        L17:
            r0 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2552ir.<init>(java.io.File, com.facebook.ads.redexgen.X.iw, com.facebook.ads.redexgen.X.4m, byte[], boolean, boolean):void");
    }

    public C2552ir(File file, InterfaceC2557iw interfaceC2557iw, M6 m6, C1661Lt c1661Lt) {
        if (A0H(file)) {
            this.A07 = file;
            this.A04 = interfaceC2557iw;
            this.A06 = m6;
            this.A05 = c1661Lt;
            this.A08 = new HashMap<>();
            this.A09 = new Random();
            this.A0A = interfaceC2557iw.AHz();
            this.A01 = -1L;
            ConditionVariable conditionVariable = new ConditionVariable();
            new MD(this, A04(50, 25, 28), conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException(A04(4, 46, 9) + file);
    }

    @Deprecated
    public C2552ir(File file, InterfaceC2557iw interfaceC2557iw, byte[] bArr, boolean z) {
        this(file, interfaceC2557iw, null, bArr, z, true);
    }

    public static long A00(File file) throws IOException {
        long nextLong = new SecureRandom().nextLong();
        long abs = nextLong == Long.MIN_VALUE ? 0L : Math.abs(nextLong);
        File file2 = new File(file, Long.toString(abs, 16) + A04(0, 4, 107));
        if (file2.createNewFile()) {
            return abs;
        }
        throw new IOException(A04(75, 27, 78) + file2);
    }

    public static long A01(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    public static long A02(File[] fileArr) {
        for (File file : fileArr) {
            String fileName = file.getName();
            if (fileName.endsWith(A04(0, 4, 107))) {
                try {
                    return A01(fileName);
                } catch (NumberFormatException unused) {
                    AnonymousClass44.A05(A04(297, 11, 30), A04(277, 20, 94) + file);
                    file.delete();
                }
            }
        }
        return -1L;
    }

    private C2551iq A03(String str, long j, long j2) {
        C2551iq A04;
        M4 A0C2 = this.A06.A0C(str);
        if (A0C2 == null) {
            return C2551iq.A04(str, j, j2);
        }
        while (true) {
            A04 = A0C2.A04(j, j2);
            if (!A04.A05 || A04.A03.length() == A04.A01) {
                break;
            }
            A06();
        }
        return A04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (!this.A07.exists()) {
            try {
                A0F(this.A07);
            } catch (C1652Lk e) {
                this.A02 = e;
                return;
            }
        }
        File file = this.A07;
        String[] strArr = A0C;
        if (strArr[6].charAt(20) == strArr[7].charAt(20)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0C;
        strArr2[1] = "a7bsaZYeTJGewaTpvlEBtyxkDQTMEU8W";
        strArr2[5] = "kn4PmWwOChlyCy8qyQNRjkcz1fm49U24";
        File[] listFiles = file.listFiles();
        String A04 = A04(297, 11, 30);
        if (listFiles == null) {
            String str = A04(200, 38, 70) + this.A07;
            AnonymousClass44.A05(A04, str);
            this.A02 = new C1652Lk(str);
            return;
        }
        this.A01 = A02(listFiles);
        if (this.A01 == -1) {
            try {
                this.A01 = A00(this.A07);
            } catch (IOException e2) {
                String str2 = A04(102, 28, 114) + this.A07;
                AnonymousClass44.A08(A04, str2, e2);
                this.A02 = new C1652Lk(str2, e2);
                return;
            }
        }
        try {
            this.A06.A0J(this.A01);
            if (this.A05 != null) {
                this.A05.A06(this.A01);
                Map<String, C1660Ls> A05 = this.A05.A05();
                A0G(this.A07, true, listFiles, A05);
                this.A05.A09(A05.keySet());
            } else {
                A0G(this.A07, true, listFiles, null);
            }
            this.A06.A0H();
            try {
                this.A06.A0I();
            } catch (IOException e3) {
                AnonymousClass44.A08(A04, A04(308, 25, 25), e3);
            }
        } catch (IOException e4) {
            String str3 = A04(DeviceFeatures.CAMERA_PREVIEW, 36, 29) + this.A07;
            AnonymousClass44.A08(A04, str3, e4);
            this.A02 = new C1652Lk(str3, e4);
        }
    }

    private void A06() {
        ArrayList arrayList = new ArrayList();
        Iterator<M4> it = this.A06.A0G().iterator();
        while (it.hasNext()) {
            Iterator<C2551iq> it2 = it.next().A06().iterator();
            while (it2.hasNext()) {
                C2551iq next = it2.next();
                if (next.A03.length() != next.A01) {
                    arrayList.add(next);
                }
            }
        }
        int i = 0;
        while (true) {
            int size = arrayList.size();
            String[] strArr = A0C;
            String str = strArr[1];
            String str2 = strArr[5];
            int i2 = str.charAt(29);
            if (i2 != str2.charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[1] = "aqjjwslhzF6rAKukFAflKhlVTVCMUUBi";
            strArr2[5] = "oi6ATHfePUfqMvf6S7GQLdSJgMPLAUWw";
            if (i < size) {
                A0A((C1665Lx) arrayList.get(i));
                i++;
            } else {
                return;
            }
        }
    }

    private final synchronized void A08() throws C1652Lk {
        if (this.A02 != null) {
            throw this.A02;
        }
    }

    private void A09(C1665Lx c1665Lx) {
        ArrayList<InterfaceC1654Lm> arrayList = this.A08.get(c1665Lx.A04);
        if (arrayList != null) {
            for (int i = arrayList.size() - 1; i >= 0; i--) {
                arrayList.get(i).AFK(this, c1665Lx);
            }
        }
        this.A04.AFK(this, c1665Lx);
    }

    private void A0A(C1665Lx c1665Lx) {
        M4 A0C2 = this.A06.A0C(c1665Lx.A04);
        if (A0C2 == null || !A0C2.A0D(c1665Lx)) {
            return;
        }
        this.A00 -= c1665Lx.A01;
        if (this.A05 != null) {
            String name = c1665Lx.A03.getName();
            try {
                this.A05.A07(name);
            } catch (IOException unused) {
                AnonymousClass44.A07(A04(297, 11, 30), A04(TelnetCommand.ABORT, 39, 93) + name);
            }
        }
        this.A06.A0K(A0C2.A02);
        A09(c1665Lx);
    }

    private void A0C(C2551iq c2551iq) {
        this.A06.A0D(c2551iq.A04).A08(c2551iq);
        this.A00 += c2551iq.A01;
        A0D(c2551iq);
    }

    private void A0D(C2551iq c2551iq) {
        ArrayList<InterfaceC1654Lm> arrayList = this.A08.get(c2551iq.A04);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                InterfaceC1654Lm interfaceC1654Lm = arrayList.get(size);
                int i = A0C[0].length();
                if (i == 2) {
                    throw new RuntimeException();
                }
                A0C[0] = "Z81vyiSZneiyPRnyPjjjzGlAG4UB";
                interfaceC1654Lm.AFJ(this, c2551iq);
            }
        }
        this.A04.AFJ(this, c2551iq);
    }

    private void A0E(C2551iq c2551iq, C1665Lx c1665Lx) {
        ArrayList<InterfaceC1654Lm> arrayList = this.A08.get(c2551iq.A04);
        if (arrayList != null) {
            for (int i = arrayList.size() - 1; i >= 0; i--) {
                arrayList.get(i).AFL(this, c2551iq, c1665Lx);
            }
        }
        this.A04.AFL(this, c2551iq, c1665Lx);
    }

    public static void A0F(File file) throws C1652Lk {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = A04(130, 34, 1) + file;
        String message = A04(297, 11, 30);
        AnonymousClass44.A05(message, str);
        throw new C1652Lk(str);
    }

    public static synchronized boolean A0H(File file) {
        boolean add;
        synchronized (C2552ir.class) {
            add = A0D.add(file.getAbsoluteFile());
        }
        return add;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1655Ln
    public final synchronized void A46(String str, M9 m9) throws C1652Lk {
        C3M.A08(!this.A03);
        A08();
        this.A06.A0L(str, m9);
        try {
            this.A06.A0I();
        } catch (IOException e) {
            throw new C1652Lk(e);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1655Ln
    public final synchronized void A4x(File file, long j) throws C1652Lk {
        C3M.A08(!this.A03);
        if (file.exists()) {
            if (j == 0) {
                file.delete();
                return;
            }
            C2551iq c2551iq = (C2551iq) C3M.A01(C2551iq.A02(file, j, this.A06));
            M4 m4 = (M4) C3M.A01(this.A06.A0C(c2551iq.A04));
            C3M.A08(m4.A0B(c2551iq.A02, c2551iq.A01));
            long A00 = M7.A00(m4.A03());
            if (A00 != -1) {
                C3M.A08(c2551iq.A02 + c2551iq.A01 <= A00);
            }
            if (this.A05 != null) {
                try {
                    this.A05.A08(file.getName(), c2551iq.A01, c2551iq.A00);
                } catch (IOException e) {
                    throw new C1652Lk(e);
                }
            }
            A0C(c2551iq);
            try {
                this.A06.A0I();
                notifyAll();
            } catch (IOException e2) {
                throw new C1652Lk(e2);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1655Ln
    public final synchronized long A72() {
        C3M.A08(!this.A03);
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1655Ln
    @MetaExoPlayerCustomization
    public final synchronized long A74(String str, long j, long j2) {
        M4 cachedContent;
        C3M.A08(!this.A03);
        if (j2 == -1) {
            j2 = Long.MAX_VALUE;
        }
        cachedContent = this.A06.A0C(str);
        return cachedContent != null ? cachedContent.A02(j, j2) : -j2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1655Ln
    public final synchronized M8 A7K(String str) {
        C3M.A08(!this.A03);
        return this.A06.A0E(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1655Ln
    public final synchronized void AGw(C1665Lx c1665Lx) {
        C3M.A08(!this.A03);
        M4 m4 = (M4) C3M.A01(this.A06.A0C(c1665Lx.A04));
        m4.A07(c1665Lx.A02);
        this.A06.A0K(m4.A02);
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1655Ln
    public final synchronized void AHk(String str) {
        C3M.A08(!this.A03);
        Iterator<C1665Lx> it = A0I(str).iterator();
        while (it.hasNext()) {
            A0A(it.next());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1655Ln
    public final synchronized void AHl(C1665Lx c1665Lx) {
        C3M.A08(!this.A03);
        A0A(c1665Lx);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1655Ln
    public final synchronized File AJN(String str, long lastTouchTimestamp, long j) throws C1652Lk {
        M4 A0C2;
        File file;
        C3M.A08(!this.A03);
        A08();
        A0C2 = this.A06.A0C(str);
        C3M.A01(A0C2);
        C3M.A08(A0C2.A0B(lastTouchTimestamp, j));
        if (!this.A07.exists()) {
            A0F(this.A07);
            A06();
        }
        this.A04.AFM(this, str, lastTouchTimestamp, j);
        file = new File(this.A07, Integer.toString(this.A09.nextInt(10)));
        if (!file.exists()) {
            A0F(file);
        }
        return C2551iq.A05(file, A0C2.A01, lastTouchTimestamp, System.currentTimeMillis());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1655Ln
    public final synchronized C1665Lx AJP(String str, long j, long j2, EnumC1653Ll enumC1653Ll) throws InterruptedException, C1652Lk {
        C1665Lx span;
        C3M.A08(!this.A03);
        A08();
        while (true) {
            span = AJQ(str, j, j2, enumC1653Ll);
            if (span == null) {
                wait();
            }
        }
        return span;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1655Ln
    public final synchronized C2551iq AJQ(String str, long j, long j2, EnumC1653Ll enumC1653Ll) throws C1652Lk {
        C3M.A08(!this.A03);
        A08();
        C2551iq A03 = A03(str, j, j2);
        if (A03.A05) {
            C2551iq span = this.A06.A0C(str).A05(A03, A03.A00, false);
            A0E(A03, span);
            return span;
        }
        if (this.A06.A0D(str).A0C(j, A03.A01)) {
            return A03;
        }
        return null;
    }
}
