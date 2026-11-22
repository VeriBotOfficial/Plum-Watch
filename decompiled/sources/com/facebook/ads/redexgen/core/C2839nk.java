package com.facebook.ads.redexgen.core;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Base64;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.apache.commons.net.nntp.NNTPReply;
import org.apache.commons.net.telnet.TelnetCommand;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.tensorflow.lite.schema.BuiltinOptions;

@Deprecated
/* renamed from: com.facebook.ads.redexgen.X.nk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2839nk implements InterfaceC12394w {
    public final Context A00;
    public final InterfaceC12394w A01;
    public final C5H A02;

    public C2839nk(Context context, C5H c5h, InterfaceC12394w interfaceC12394w) {
        this.A00 = context.getApplicationContext();
        this.A02 = c5h;
        this.A01 = interfaceC12394w;
    }

    public C2839nk(Context context, String str, C5H c5h) {
        this(context, c5h, new C13439j().A01(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.9k] */
    @Override // com.facebook.ads.redexgen.core.InterfaceC12394w
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C13449k A5A() {
        final Context context = this.A00;
        final InterfaceC2840nl A5A = this.A01.A5A();
        ?? r1 = new InterfaceC2840nl(context, A5A) { // from class: com.facebook.ads.redexgen.X.9k
            public static byte[] A0B;
            public static String[] A0C = {"tGdrGbTKqUAyZjAtECCaXso437TIFtay", "xasvTmVCH4LeG7al8p8ObQF4UIpko", "linuVDi59rGKxPba8cSgrQfx0g5xcZS0", "EsZJycHVVsXuEv", "at8NLtJKkPgo1aJyGFOZsbSRJOLI96cu", "TOIRSmJtL8rNzzbss9LVqHyYWtEEJZpF", "R6ga9urJMlxgk01j3rMsq3yEpAD", "8pNo6y0"};
            public InterfaceC2840nl A00;
            public InterfaceC2840nl A01;
            public InterfaceC2840nl A02;
            public InterfaceC2840nl A03;
            public InterfaceC2840nl A04;
            public InterfaceC2840nl A05;
            public InterfaceC2840nl A06;

            @MetaExoPlayerCustomization("OculusDefaultDataSource accesses this field directly")
            public InterfaceC2840nl A07;
            public final InterfaceC2840nl A08;

            @MetaExoPlayerCustomization("OculusDefaultDataSource accesses this field directly")
            public final Context A09;

            @MetaExoPlayerCustomization("OculusDefaultDataSource accesses this field directly")
            public final List<C5H> A0A = new ArrayList();

            public static String A07(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 6);
                }
                return new String(copyOfRange);
            }

            public static void A08() {
                A0B = new byte[]{24, BuiltinOptions.RankOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.RankOptions, BuiltinOptions.FillOptions, BuiltinOptions.FillOptions, BuiltinOptions.AddNOptions, BuiltinOptions.ZerosLikeOptions, 24, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.GeluOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.QuantizeOptions, 64, BuiltinOptions.WhileOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.UnsortedSegmentSumOptions, Byte.MAX_VALUE, BuiltinOptions.BroadcastToOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.ATan2Options, BuiltinOptions.SegmentSumOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DensifyOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.QuantizeOptions, 64, BuiltinOptions.WhileOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DensifyOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.RandomOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.SignOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.FillOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.GeluOptions, BuiltinOptions.RandomOptions, 7, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.PadV2Options, BuiltinOptions.GreaterOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.NotEqualOptions, 35, BuiltinOptions.GreaterOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.PadV2Options, 35, BuiltinOptions.NotEqualOptions, BuiltinOptions.PadV2Options, BuiltinOptions.GreaterOptions, BuiltinOptions.CastOptions, BuiltinOptions.SelectV2Options, 16, 22, 15, 18, BuiltinOptions.SelectV2Options, BuiltinOptions.MaximumMinimumOptions, 58, BuiltinOptions.NotEqualOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.PadV2Options, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.RangeOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.WhereOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.AbsOptions, BuiltinOptions.ZerosLikeOptions, 9, BuiltinOptions.WhereOptions, BuiltinOptions.SquareOptions, BuiltinOptions.CosOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.AddNOptions, BuiltinOptions.WhereOptions, BuiltinOptions.FillOptions, BuiltinOptions.SquareOptions, BuiltinOptions.SliceOptions, 34, 34, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.CastOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.NegOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.HashtableOptions, 35, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.DequantizeOptions, 32, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.NegOptions, BuiltinOptions.NegOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.ExpOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.HashtableOptions, 34, BuiltinOptions.NegOptions, BuiltinOptions.NegOptions, 34, BuiltinOptions.LessOptions, 32, BuiltinOptions.HashtableOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.PadV2Options, BuiltinOptions.ExpOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.NegOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.ExpOptions, BuiltinOptions.HashtableOptions, 32, 61, BuiltinOptions.NegOptions, BuiltinOptions.EqualOptions, BuiltinOptions.LessOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.LogicalOrOptions, 32, BuiltinOptions.ShapeOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.HashtableOptions, 32, 61, BuiltinOptions.TransposeConvOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.EqualOptions, BuiltinOptions.HashtableOptions, 23, BuiltinOptions.TransposeConvOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.EqualOptions, 1, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.LogSoftmaxOptions, 22, BuiltinOptions.NegOptions, BuiltinOptions.SliceOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.DequantizeOptions, 32, 12, 0, 1, 27, 10, 1, 27, 63, 58, BuiltinOptions.SelectOptions, 58, BuiltinOptions.TileOptions, 32, BuiltinOptions.NotEqualOptions, BuiltinOptions.TileOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.TileOptions, 34, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.CosOptions, BuiltinOptions.RangeOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.ZerosLikeOptions};
            }

            static {
                A08();
            }

            {
                this.A09 = context.getApplicationContext();
                this.A08 = (InterfaceC2840nl) C3M.A01(A5A);
            }

            private InterfaceC2840nl A00() {
                if (this.A00 == null) {
                    this.A00 = new AbstractC13459l(this.A09) { // from class: com.facebook.ads.redexgen.X.1B
                        public static byte[] A05;
                        public static String[] A06 = {"PTz87XAKzq7jvDXOa", "sgpUZ", "Bde9N92B9PLOW1wkk", "DRZuAIPcc", "gakZC5ePxUI2GDKV9", "pz9vQcEWFJbuREE6smExYo368tZlwkrG", "j43UPSzsV7IrH", "51Zh85ddLdY4jrUIDlK8L"};
                        public long A00;
                        public Uri A01;
                        public InputStream A02;
                        public boolean A03;
                        public final AssetManager A04;

                        public static String A00(int i, int i2, int i3) {
                            byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
                            for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                                int i5 = (copyOfRange[i4] ^ i3) ^ 113;
                                String[] strArr = A06;
                                if (strArr[2].length() != strArr[4].length()) {
                                    throw new RuntimeException();
                                }
                                A06[1] = "rCVU";
                                copyOfRange[i4] = (byte) i5;
                            }
                            return new String(copyOfRange);
                        }

                        public static void A01() {
                            A05 = new byte[]{BuiltinOptions.BitcastOptions, BuiltinOptions.GeluOptions, 58, BuiltinOptions.EqualOptions, 63, BuiltinOptions.LessOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.SparseToDenseOptions, 63, 4, 58, BuiltinOptions.ArgMaxOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.SelectOptions, BuiltinOptions.GeluOptions};
                        }

                        /* JADX WARN: Failed to parse debug info
                        java.lang.ArrayIndexOutOfBoundsException
                         */
                        @Override // com.facebook.ads.redexgen.core.InterfaceC2840nl
                        public final long AFy(AnonymousClass56 anonymousClass56) throws C2842nn {
                            try {
                                this.A01 = anonymousClass56.A06;
                                String str = (String) C3M.A01(this.A01.getPath());
                                boolean startsWith = str.startsWith(A00(1, 15, 42));
                                String[] strArr = A06;
                                if (strArr[2].length() == strArr[4].length()) {
                                    String[] strArr2 = A06;
                                    strArr2[2] = "3xdRIl55zUe0UeQhp";
                                    strArr2[4] = "pS29hwepCfn47vExr";
                                    if (startsWith) {
                                        str = str.substring(15);
                                    } else if (str.startsWith(A00(0, 1, 34))) {
                                        str = str.substring(1);
                                    }
                                    A0G(anonymousClass56);
                                    this.A02 = this.A04.open(str, 1);
                                    if (this.A02.skip(anonymousClass56.A04) < anonymousClass56.A04) {
                                        throw new C2842nn(null, 2008);
                                    }
                                    if (anonymousClass56.A03 != -1) {
                                        this.A00 = anonymousClass56.A03;
                                    } else {
                                        this.A00 = this.A02.available();
                                        if (this.A00 == 2147483647L) {
                                            this.A00 = -1L;
                                        }
                                    }
                                    this.A03 = true;
                                    A0H(anonymousClass56);
                                    return this.A00;
                                }
                            } catch (C2842nn e) {
                                throw e;
                            } catch (IOException e2) {
                                boolean z = e2 instanceof FileNotFoundException;
                                if (A06[6].length() == 13) {
                                    A06[6] = "P3wDYI6sXfUMf";
                                    throw new C2842nn(e2, z ? 2005 : 2000);
                                }
                            }
                            throw new RuntimeException();
                        }

                        static {
                            A01();
                        }

                        {
                            super(false);
                            this.A04 = r2.getAssets();
                        }

                        @Override // com.facebook.ads.redexgen.core.InterfaceC2840nl
                        public final Uri A9H() {
                            return this.A01;
                        }

                        @Override // com.facebook.ads.redexgen.core.InterfaceC2840nl
                        public final void close() throws C2842nn {
                            this.A01 = null;
                            try {
                                try {
                                    if (this.A02 != null) {
                                        this.A02.close();
                                    }
                                } catch (IOException e) {
                                    throw new C2842nn(e, 2000);
                                }
                            } finally {
                                this.A02 = null;
                                if (this.A03) {
                                    this.A03 = false;
                                    A0E();
                                }
                            }
                        }

                        @Override // com.facebook.ads.redexgen.core.AnonymousClass20
                        public final int read(byte[] bArr, int i, int i2) throws C2842nn {
                            if (i2 == 0) {
                                return 0;
                            }
                            if (this.A00 == 0) {
                                return -1;
                            }
                            try {
                                if (this.A00 != -1) {
                                    i2 = (int) Math.min(this.A00, i2);
                                }
                                int read = ((InputStream) AbstractC12174a.A0f(this.A02)).read(bArr, i, i2);
                                if (read == -1) {
                                    return -1;
                                }
                                long j = this.A00;
                                if (A06[6].length() != 13) {
                                    throw new RuntimeException();
                                }
                                A06[6] = "7Z6S4bUZVA19c";
                                if (j != -1) {
                                    this.A00 -= read;
                                }
                                A0F(read);
                                return read;
                            } catch (IOException e) {
                                throw new C2842nn(e, 2000);
                            }
                        }
                    };
                    A09(this.A00);
                }
                return this.A00;
            }

            private InterfaceC2840nl A01() {
                if (this.A01 == null) {
                    this.A01 = new AbstractC13459l(this.A09) { // from class: com.facebook.ads.redexgen.X.1A
                        public static byte[] A06;
                        public static String[] A07 = {"2ftN4rqyMzReasXlS0Bd7yvXq4Z2w8Rd", "SB3v1XRSpovCjfjTdx7anKa7xqXJKcRT", "XVjCn6r7eDTGJtLvngTS2wgt8nCOhnB8", "1Z3zzaFrxDlwod4BzGavHrSG6vNvtkR5", "UgcL11Y1AQOJlkVRTNTymNMOAMwNhJW2", "NkTGPgJcqOjwrAzhjPkYXMY7OTNaeVTG", "UuxCrg9I54LtW8vlxqROWB7HyIfBI135", "4rxicH75x32fMwhdD1obBcUBdLwTm4oP"};
                        public long A00;
                        public AssetFileDescriptor A01;
                        public Uri A02;
                        public FileInputStream A03;
                        public boolean A04;
                        public final ContentResolver A05;

                        public static String A00(int i, int i2, int i3) {
                            byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
                            for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                                copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 87);
                            }
                            return new String(copyOfRange);
                        }

                        public static void A01() {
                            A06 = new byte[]{-76, -71, -76, 10, BuiltinOptions.NotEqualOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.TileOptions, BuiltinOptions.PadV2Options, -25, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.PackOptions, -25, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.EqualOptions, -25, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.SliceOptions, BuiltinOptions.TileOptions, BuiltinOptions.GreaterOptions, -25, BuiltinOptions.PadV2Options, BuiltinOptions.GreaterOptions, 58, BuiltinOptions.NegOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.SliceOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PackOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ArgMinOptions, -25, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ArgMinOptions, 1, -25, 12, 25, 15, 29, 26, 20, 15, -39, 27, 29, 26, BuiltinOptions.ExpOptions, 20, 15, 16, 29, -39, 16, 35, 31, 29, 12, -39, -20, -18, -18, TransmissionUnpacked.HD_VAL_MAGIC_HB, -5, -1, 10, -6, -3, -12, -14, -12, -7, -20, -9, 10, -8, TransmissionUnpacked.HD_VAL_MAGIC_HB, -17, -12, -20, 10, -15, -6, -3, -8, -20, -1, -70, -58, -59, -53, PSSSigner.TRAILER_IMPLICIT, -59, -53, 1};
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:46:0x010e, code lost:
                        
                            if (r0 >= 0) goto L39;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:48:0x016d, code lost:
                        
                            throw new com.facebook.ads.redexgen.core.C2841nm(null, 2008);
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:50:0x012a, code lost:
                        
                            if (r0 >= 0) goto L39;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:55:0x00e4, code lost:
                        
                            if (r0 >= 0) goto L39;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:57:0x0176, code lost:
                        
                            throw new com.facebook.ads.redexgen.core.C2841nm(null, 2008);
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:59:0x00ee, code lost:
                        
                            if (r0 >= 0) goto L39;
                         */
                        /* JADX WARN: Failed to parse debug info
                        java.lang.ArrayIndexOutOfBoundsException: Index 23 out of bounds for length 15
                        	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
                        	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
                        	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
                        	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
                        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
                         */
                        @Override // com.facebook.ads.redexgen.core.InterfaceC2840nl
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final long AFy(com.facebook.ads.redexgen.core.AnonymousClass56 r14) throws com.facebook.ads.redexgen.core.C2841nm {
                            /*
                                Method dump skipped, instructions count: 449
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1A.AFy(com.facebook.ads.redexgen.X.56):long");
                        }

                        static {
                            A01();
                        }

                        {
                            super(false);
                            this.A05 = r2.getContentResolver();
                        }

                        @Override // com.facebook.ads.redexgen.core.InterfaceC2840nl
                        public final Uri A9H() {
                            return this.A02;
                        }

                        @Override // com.facebook.ads.redexgen.core.InterfaceC2840nl
                        public final void close() throws C2841nm {
                            this.A02 = null;
                            try {
                                try {
                                    if (this.A03 != null) {
                                        this.A03.close();
                                    }
                                    this.A03 = null;
                                    try {
                                        try {
                                            if (this.A01 != null) {
                                                this.A01.close();
                                            }
                                        } catch (IOException e) {
                                            throw new C2841nm(e, 2000);
                                        }
                                    } finally {
                                        this.A01 = null;
                                        if (this.A04) {
                                            this.A04 = false;
                                            A0E();
                                        }
                                    }
                                } catch (IOException e2) {
                                    throw new C2841nm(e2, 2000);
                                }
                            } catch (Throwable th) {
                                this.A03 = null;
                                try {
                                    try {
                                        if (this.A01 != null) {
                                            this.A01.close();
                                        }
                                        this.A01 = null;
                                        if (this.A04) {
                                            this.A04 = false;
                                            A0E();
                                        }
                                        throw th;
                                    } catch (IOException e3) {
                                        throw new C2841nm(e3, 2000);
                                    }
                                } finally {
                                    this.A01 = null;
                                    if (this.A04) {
                                        this.A04 = false;
                                        A0E();
                                    }
                                }
                            }
                        }

                        @Override // com.facebook.ads.redexgen.core.AnonymousClass20
                        public final int read(byte[] bArr, int i, int i2) throws C2841nm {
                            if (i2 == 0) {
                                return 0;
                            }
                            long j = this.A00;
                            if (A07[1].charAt(15) != 'T') {
                                throw new RuntimeException();
                            }
                            String[] strArr = A07;
                            strArr[0] = "xrRDl1n0HP8M9562uVsbLDb97IGJJORF";
                            strArr[3] = "BxGqKYmJPgWUa88HGr5IfMWzChfrhfRY";
                            if (j == 0) {
                                return -1;
                            }
                            try {
                                if (this.A00 != -1) {
                                    i2 = (int) Math.min(this.A00, i2);
                                }
                                int read = ((FileInputStream) AbstractC12174a.A0f(this.A03)).read(bArr, i, i2);
                                if (read == -1) {
                                    return -1;
                                }
                                if (this.A00 != -1) {
                                    this.A00 -= read;
                                }
                                A0F(read);
                                return read;
                            } catch (IOException e) {
                                throw new C2841nm(e, 2000);
                            }
                        }
                    };
                    A09(this.A01);
                }
                return this.A01;
            }

            private InterfaceC2840nl A02() {
                if (this.A02 == null) {
                    this.A02 = new AbstractC13459l() { // from class: com.facebook.ads.redexgen.X.19
                        public static byte[] A04;
                        public int A00;
                        public int A01;
                        public AnonymousClass56 A02;
                        public byte[] A03;

                        static {
                            A01();
                        }

                        public static String A00(int i, int i2, int i3) {
                            byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
                            for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                                copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 120);
                            }
                            return new String(copyOfRange);
                        }

                        public static void A01() {
                            A04 = new byte[]{-17, BuiltinOptions.SliceOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.RankOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.PadV2Options, BuiltinOptions.LessOptions, 58, BuiltinOptions.CallOnceOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.CallOnceOptions, 21, BuiltinOptions.HashtableFindOptions, BuiltinOptions.WhileOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.MatrixSetDiagOptions, 21, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.RankOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.IfOptions, 21, BuiltinOptions.ShapeOptions, BuiltinOptions.RankOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.PadV2Options, BuiltinOptions.LessOptions, 21, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.QuantizeOptions, 21, BuiltinOptions.BroadcastToOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.IfOptions, BuiltinOptions.SelectOptions, 21, -23, 2, -7, 12, 4, -7, -9, 8, -7, -8, -76, -23, -26, -35, -76, -6, 3, 6, 1, -11, 8, -50, -76, BuiltinOptions.LogicalOrOptions, BuiltinOptions.WhereOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.IfOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.RankOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.LeakyReluOptions, 7, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.CosOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.ExpOptions, 7, 25, 22, BuiltinOptions.LessOptions, 22};
                        }

                        @Override // com.facebook.ads.redexgen.core.InterfaceC2840nl
                        public final Uri A9H() {
                            if (this.A02 != null) {
                                return this.A02.A06;
                            }
                            return null;
                        }

                        @Override // com.facebook.ads.redexgen.core.InterfaceC2840nl
                        public final long AFy(AnonymousClass56 anonymousClass56) throws IOException {
                            A0G(anonymousClass56);
                            this.A02 = anonymousClass56;
                            Uri uri = anonymousClass56.A06;
                            String scheme = uri.getScheme();
                            C3M.A09(A00(94, 4, 61).equals(scheme), A00(74, 20, 111) + scheme);
                            String[] uriParts = AbstractC12174a.A1O(uri.getSchemeSpecificPart(), A00(0, 1, 75));
                            if (uriParts.length == 2) {
                                String str = uriParts[1];
                                String dataString = uriParts[0];
                                if (dataString.contains(A00(1, 7, 125))) {
                                    try {
                                        this.A03 = Base64.decode(str, 0);
                                    } catch (IllegalArgumentException e) {
                                        throw C11732i.A02(A00(8, 43, 125) + str, e);
                                    }
                                } else {
                                    this.A03 = AbstractC12174a.A1G(URLDecoder.decode(str, AbstractC2537ia.A02.name()));
                                }
                                if (anonymousClass56.A04 <= this.A03.length) {
                                    this.A01 = (int) anonymousClass56.A04;
                                    this.A00 = this.A03.length - this.A01;
                                    if (anonymousClass56.A03 != -1) {
                                        this.A00 = (int) Math.min(this.A00, anonymousClass56.A03);
                                    }
                                    A0H(anonymousClass56);
                                    return anonymousClass56.A03 != -1 ? anonymousClass56.A03 : this.A00;
                                }
                                this.A03 = null;
                                throw new C12424z(2008);
                            }
                            throw C11732i.A02(A00(51, 23, 28) + uri, null);
                        }

                        @Override // com.facebook.ads.redexgen.core.InterfaceC2840nl
                        public final void close() {
                            if (this.A03 != null) {
                                this.A03 = null;
                                A0E();
                            }
                            this.A02 = null;
                        }

                        @Override // com.facebook.ads.redexgen.core.AnonymousClass20
                        public final int read(byte[] bArr, int i, int i2) {
                            if (i2 == 0) {
                                return 0;
                            }
                            if (this.A00 == 0) {
                                return -1;
                            }
                            int min = Math.min(i2, this.A00);
                            System.arraycopy(AbstractC12174a.A0f(this.A03), this.A01, bArr, i, min);
                            this.A01 += min;
                            this.A00 -= min;
                            A0F(min);
                            return min;
                        }
                    };
                    A09(this.A02);
                }
                return this.A02;
            }

            private InterfaceC2840nl A03() {
                if (this.A03 == null) {
                    this.A03 = new AnonymousClass17();
                    A09(this.A03);
                }
                return this.A03;
            }

            private InterfaceC2840nl A04() {
                if (this.A04 == null) {
                    this.A04 = new AbstractC13459l(this.A09) { // from class: com.facebook.ads.redexgen.X.16
                        public static byte[] A07;
                        public static String[] A08 = {"QLuP8Pt4KiB", "RgtlFkBshe2uzsEMObMvf6GLE9oju0kX", "TTP1lITjIL7gpSd4kE", "ZIRCIqgztw3RRTH34yg2MmGGdHBG3Sqw", "W8lxrl5W", "1BP9Supp2XIZ7aBeV", "CPoLKetsO3XScG5XHhoA5", "r"};
                        public long A00;
                        public AssetFileDescriptor A01;
                        public Uri A02;
                        public InputStream A03;
                        public boolean A04;
                        public final Resources A05;
                        public final String A06;

                        public static String A00(int i, int i2, int i3) {
                            byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
                            for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                                copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 127);
                            }
                            return new String(copyOfRange);
                        }

                        public static void A01() {
                            A07 = new byte[]{BuiltinOptions.Rfft2dOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.HashtableOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.UnsortedSegmentSumOptions, Byte.MAX_VALUE, BuiltinOptions.BroadcastToOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.GreaterEqualOptions, Byte.MAX_VALUE, BuiltinOptions.BroadcastToOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.SignOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.GreaterEqualOptions, Byte.MAX_VALUE, BuiltinOptions.BroadcastToOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.HashtableFindOptions, 35, BuiltinOptions.ATan2Options, BuiltinOptions.MirrorPadOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.WhileOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.MirrorPadOptions, 8, BuiltinOptions.FloorDivOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.IfOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.AbsOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.MatrixSetDiagOptions, 8, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.WhileOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.IfOptions, 8, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.MirrorPadOptions, 8, BuiltinOptions.RangeOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, 8, BuiltinOptions.FloorDivOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.IfOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.MatrixSetDiagOptions, 6, 27, BuiltinOptions.GreaterOptions, 58, BuiltinOptions.DequantizeOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.PackOptions, BuiltinOptions.NegOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.Rfft2dOptions, 32, 58, BuiltinOptions.Rfft2dOptions, BuiltinOptions.NegOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.PackOptions, BuiltinOptions.GreaterOptions, 58, 58, BuiltinOptions.GreaterOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.SparseToDenseOptions, 5, 19, 15, 21, 18, 3, 5, 64, 14, 15, 20, 64, 6, 15, 21, 14, 4, BuiltinOptions.AbsOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.GeluOptions, BuiltinOptions.VarHandleOptions, 6, BuiltinOptions.LeakyReluOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.WhereOptions, BuiltinOptions.AddNOptions, 6, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.AddNOptions, BuiltinOptions.AbsOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.CosOptions, 6, BuiltinOptions.GatherNdOptions, BuiltinOptions.WhereOptions, BuiltinOptions.ZerosLikeOptions, 6, BuiltinOptions.WhereOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.AbsOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.ZerosLikeOptions, 6, BuiltinOptions.CosOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.CosOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.WhereOptions, BuiltinOptions.RangeOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.CosOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.ZerosLikeOptions, 6, BuiltinOptions.RangeOptions, BuiltinOptions.CosOptions, 6, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.SquareOptions, BuiltinOptions.CosOptions, BuiltinOptions.RangeOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.SquareOptions, 8, BuiltinOptions.CosOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.WhereOptions, BuiltinOptions.RangeOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.CosOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.RandomOptions, BuiltinOptions.ResizeNearestNeighborOptions, 5, BuiltinOptions.SelectV2Options, BuiltinOptions.HashtableImportOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.CumsumOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.RankOptions, 64, BuiltinOptions.IfOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.IfOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.WhileOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.IfOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.LeakyReluOptions};
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:101:0x0116, code lost:
                        
                            if (r1 != 0) goto L25;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:22:0x00f7, code lost:
                        
                            if (r1 != 0) goto L25;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:99:0x0260, code lost:
                        
                            throw new com.facebook.ads.redexgen.core.C2829na(A00(119, 19, 31), null, 2005);
                         */
                        /* JADX WARN: Failed to parse debug info
                        java.lang.ArrayIndexOutOfBoundsException
                         */
                        @Override // com.facebook.ads.redexgen.core.InterfaceC2840nl
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final long AFy(com.facebook.ads.redexgen.core.AnonymousClass56 r14) throws com.facebook.ads.redexgen.core.C2829na {
                            /*
                                Method dump skipped, instructions count: 641
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AnonymousClass16.AFy(com.facebook.ads.redexgen.X.56):long");
                        }

                        static {
                            A01();
                        }

                        {
                            super(false);
                            this.A05 = r2.getResources();
                            this.A06 = r2.getPackageName();
                        }

                        @Override // com.facebook.ads.redexgen.core.InterfaceC2840nl
                        public final Uri A9H() {
                            return this.A02;
                        }

                        @Override // com.facebook.ads.redexgen.core.InterfaceC2840nl
                        public final void close() throws C2829na {
                            this.A02 = null;
                            try {
                                try {
                                    if (this.A03 != null) {
                                        this.A03.close();
                                    }
                                    this.A03 = null;
                                    try {
                                        try {
                                            if (this.A01 != null) {
                                                this.A01.close();
                                            }
                                        } catch (IOException e) {
                                            throw new C2829na(null, e, 2000);
                                        }
                                    } catch (Throwable th) {
                                        this.A01 = null;
                                        String[] strArr = A08;
                                        if (strArr[1].charAt(14) == strArr[3].charAt(14)) {
                                            throw new RuntimeException();
                                        }
                                        A08[6] = "iC26zNxzLLnB2GH7qyOIGlAQhGgRPuU";
                                        if (this.A04) {
                                            this.A04 = false;
                                            A0E();
                                        }
                                        throw th;
                                    }
                                } catch (IOException e2) {
                                    throw new C2829na(null, e2, 2000);
                                }
                            } catch (Throwable th2) {
                                this.A03 = null;
                                try {
                                    try {
                                        if (this.A01 != null) {
                                            this.A01.close();
                                        }
                                        this.A01 = null;
                                        if (this.A04) {
                                            this.A04 = false;
                                            A0E();
                                        }
                                        throw th2;
                                    } catch (IOException e3) {
                                        throw new C2829na(null, e3, 2000);
                                    }
                                } finally {
                                    this.A01 = null;
                                    if (this.A04) {
                                        this.A04 = false;
                                        A0E();
                                    }
                                }
                            }
                        }

                        @Override // com.facebook.ads.redexgen.core.AnonymousClass20
                        public final int read(byte[] bArr, int i, int i2) throws C2829na {
                            if (i2 == 0) {
                                return 0;
                            }
                            if (this.A00 == 0) {
                                return -1;
                            }
                            try {
                                if (this.A00 != -1) {
                                    i2 = (int) Math.min(this.A00, i2);
                                }
                                int read = ((InputStream) AbstractC12174a.A0f(this.A03)).read(bArr, i, i2);
                                if (read == -1) {
                                    if (this.A00 == -1) {
                                        return -1;
                                    }
                                    throw new C2829na(A00(2, 54, 114), new EOFException(), 2000);
                                }
                                if (this.A00 != -1) {
                                    this.A00 -= read;
                                }
                                A0F(read);
                                return read;
                            } catch (IOException e) {
                                throw new C2829na(null, e, 2000);
                            }
                        }
                    };
                    A09(this.A04);
                }
                return this.A04;
            }

            private InterfaceC2840nl A05() {
                if (this.A05 == null) {
                    try {
                        this.A05 = (InterfaceC2840nl) Class.forName(A07(157, 66, 67)).getConstructor(new Class[0]).newInstance(new Object[0]);
                        A09(this.A05);
                    } catch (ClassNotFoundException unused) {
                        AnonymousClass44.A07(A07(85, 17, 17), A07(15, 70, 11));
                    } catch (Exception e) {
                        throw new RuntimeException(A07(102, 34, 68), e);
                    }
                    if (this.A05 == null) {
                        this.A05 = this.A08;
                    }
                }
                return this.A05;
            }

            private InterfaceC2840nl A06() {
                if (this.A06 == null) {
                    this.A06 = new AnonymousClass15();
                    A09(this.A06);
                }
                return this.A06;
            }

            /* JADX WARN: Incorrect condition in loop: B:3:0x0007 */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private void A09(com.facebook.ads.redexgen.core.InterfaceC2840nl r3) {
                /*
                    r2 = this;
                    r1 = 0
                L1:
                    java.util.List<com.facebook.ads.redexgen.X.5H> r0 = r2.A0A
                    int r0 = r0.size()
                    if (r1 >= r0) goto L17
                    java.util.List<com.facebook.ads.redexgen.X.5H> r0 = r2.A0A
                    java.lang.Object r0 = r0.get(r1)
                    com.facebook.ads.redexgen.X.5H r0 = (com.facebook.ads.redexgen.core.C5H) r0
                    r3.A3v(r0)
                    int r1 = r1 + 1
                    goto L1
                L17:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C13449k.A09(com.facebook.ads.redexgen.X.nl):void");
            }

            private void A0A(InterfaceC2840nl interfaceC2840nl, C5H c5h) {
                if (interfaceC2840nl != null) {
                    interfaceC2840nl.A3v(c5h);
                }
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC2840nl
            public final void A3v(C5H c5h) {
                C3M.A01(c5h);
                this.A08.A3v(c5h);
                this.A0A.add(c5h);
                A0A(this.A03, c5h);
                A0A(this.A00, c5h);
                A0A(this.A01, c5h);
                A0A(this.A05, c5h);
                A0A(this.A06, c5h);
                A0A(this.A02, c5h);
                A0A(this.A04, c5h);
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC2840nl
            public final Map<String, List<String>> A8l() {
                return this.A07 == null ? Collections.emptyMap() : this.A07.A8l();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC2840nl
            public final Uri A9H() {
                if (this.A07 == null) {
                    return null;
                }
                return this.A07.A9H();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC2840nl
            public final long AFy(AnonymousClass56 anonymousClass56) throws IOException {
                C3M.A08(this.A07 == null);
                String scheme = anonymousClass56.A06.getScheme();
                if (AbstractC12174a.A1A(anonymousClass56.A06)) {
                    String path = anonymousClass56.A06.getPath();
                    if (path != null) {
                        String[] strArr = A0C;
                        String uriPath = strArr[4];
                        if (uriPath.charAt(27) != strArr[0].charAt(27)) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A0C;
                        strArr2[4] = "woaZ3GsQ3DbiayOrUPjNVqqq8n8IT0aY";
                        strArr2[0] = "klzvMTRWbU3yZvxB9bRoGsioUmbI9kjx";
                        String scheme2 = A07(0, 15, 49);
                        if (path.startsWith(scheme2)) {
                            InterfaceC2840nl A00 = A00();
                            String[] strArr3 = A0C;
                            String uriPath2 = strArr3[4];
                            if (uriPath2.charAt(27) != strArr3[0].charAt(27)) {
                                String[] strArr4 = A0C;
                                strArr4[1] = "PIVfyqk1Etrv0Wbxq4vDpVOoMCV7O";
                                strArr4[7] = "Bsp2dR1";
                                this.A07 = A00;
                            } else {
                                String[] strArr5 = A0C;
                                strArr5[1] = "maZBVk5L4nnlZEqCNC7SxmxFjkMbb";
                                strArr5[7] = "XTvzFpJ";
                                this.A07 = A00;
                            }
                        }
                    }
                    this.A07 = A03();
                } else {
                    String scheme3 = A07(152, 5, 87);
                    if (scheme3.equals(scheme)) {
                        this.A07 = A00();
                    } else {
                        String scheme4 = A07(NNTPReply.ARTICLE_RETRIEVED_REQUEST_TEXT_SEPARATELY, 7, 105);
                        if (scheme4.equals(scheme)) {
                            this.A07 = A01();
                        } else {
                            String scheme5 = A07(TelnetCommand.AO, 4, 63);
                            if (scheme5.equals(scheme)) {
                                this.A07 = A05();
                            } else {
                                String scheme6 = A07(TelnetCommand.GA, 3, 53);
                                if (scheme6.equals(scheme)) {
                                    this.A07 = A06();
                                } else {
                                    String scheme7 = A07(230, 4, 93);
                                    if (scheme7.equals(scheme)) {
                                        this.A07 = A02();
                                    } else {
                                        String scheme8 = A07(234, 11, 71);
                                        if (!scheme8.equals(scheme)) {
                                            String scheme9 = A07(136, 16, 33);
                                            if (!scheme9.equals(scheme)) {
                                                this.A07 = this.A08;
                                            }
                                        }
                                        this.A07 = A04();
                                    }
                                }
                            }
                        }
                    }
                }
                return this.A07.AFy(anonymousClass56);
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC2840nl
            public final void close() throws IOException {
                if (this.A07 != null) {
                    try {
                        this.A07.close();
                    } finally {
                        this.A07 = null;
                    }
                }
            }

            @Override // com.facebook.ads.redexgen.core.AnonymousClass20
            public final int read(byte[] bArr, int i, int i2) throws IOException {
                return ((InterfaceC2840nl) C3M.A01(this.A07)).read(bArr, i, i2);
            }
        };
        if (this.A02 != null) {
            r1.A3v(this.A02);
        }
        return r1;
    }
}
