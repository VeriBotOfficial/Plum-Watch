package com.facebook.ads.redexgen.core;

import android.graphics.Rect;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.hispark.crashdump.protocol.ProtocolBytes;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Vector;
import javax.annotation.Nullable;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.json.JSONObject;
import org.opencv.videoio.Videoio;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.eX, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2301eX {
    public static byte[] A0G;
    public static String[] A0H = {"YuGvtiviQVR", "ZhJp0z4dUN", "YWv4zGcwogafSGFsXYmLIXL4tbjSTGT", "UM7SABu2ufM", "2gPy2hJr9M", "yZRmnvTn4zHntgpYIACfXRb3ExDVKnv", "qUSRIBeTtwG", "WSvVNugGHbUgKJE0aBRLXmETVgvdQ"};
    public static final String A0I;
    public int A00;
    public int A01;
    public int A02;
    public long A03;

    @Nullable
    public AbstractRunnableC1915Vt A04;
    public C2302eY A05;
    public Map<String, Integer> A06;
    public boolean A07;
    public boolean A08;
    public final int A09;
    public final int A0A;
    public final Handler A0B;
    public final View A0C;
    public final C2228dL A0D;
    public final WeakReference<AbstractC2300eW> A0E;
    public final boolean A0F;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 17 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static int A08(Vector<Rect> vector) {
        int size = vector.size();
        int[] iArr = new int[size * 2];
        int[] iArr2 = new int[size * 2];
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, size * 2, size * 2);
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Rect elementAt = vector.elementAt(i3);
            int i4 = i + 1;
            iArr[i] = elementAt.left;
            int i5 = i2 + 1;
            iArr2[i2] = elementAt.bottom;
            i = i4 + 1;
            iArr[i4] = elementAt.right;
            i2 = i5 + 1;
            iArr2[i5] = elementAt.top;
        }
        Arrays.sort(iArr);
        Arrays.sort(iArr2);
        for (int i6 = 0; i6 < size; i6++) {
            Rect elementAt2 = vector.elementAt(i6);
            int A09 = A09(iArr, elementAt2.left);
            int A092 = A09(iArr, elementAt2.right);
            int A093 = A09(iArr2, elementAt2.top);
            int A094 = A09(iArr2, elementAt2.bottom);
            for (int i7 = A09 + 1; i7 <= A092; i7++) {
                for (int i8 = A093 + 1; i8 <= A094; i8++) {
                    zArr[i7][i8] = true;
                }
            }
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size * 2; i10++) {
            for (int i11 = 0; i11 < size * 2; i11++) {
                i9 += zArr[i10][i11] ? (iArr[i10] - iArr[i10 - 1]) * (iArr2[i11] - iArr2[i11 - 1]) : 0;
            }
        }
        return i9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0097, code lost:
    
        if (r5 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0099, code lost:
    
        A0N(r7, false, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00a3, code lost:
    
        return new com.facebook.ads.redexgen.core.C2302eY(com.facebook.ads.redexgen.core.LF.A0G);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00b0, code lost:
    
        if (r5 == false) goto L26;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ads.redexgen.core.C2302eY A0E(android.view.View r7, int r8, com.facebook.ads.redexgen.core.C2228dL r9) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2301eX.A0E(android.view.View, int, com.facebook.ads.redexgen.X.dL):com.facebook.ads.redexgen.X.eY");
    }

    public static String A0H(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0G, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 32);
        }
        return new String(copyOfRange);
    }

    public static void A0M() {
        A0G = new byte[]{BuiltinOptions.HashtableSizeOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.BitcastOptions, Byte.MAX_VALUE, -76, BuiltinOptions.BucketizeOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.HashtableSizeOptions, -73, -63, BuiltinOptions.HashtableSizeOptions, -121, -34, -48, -37, -49, -121, -39, -52, -56, -38, -42, TransmissionUnpacked.HD_VAL_MAGIC_LB, -95, -121, -69, ProtocolBytes.SOF, -9, -52, BuiltinOptions.RightShiftOptions, -95, BuiltinOptions.WhileOptions, -90, -80, BuiltinOptions.WhileOptions, -84, -85, BuiltinOptions.WhileOptions, -79, -84, -83, BuiltinOptions.WhileOptions, -84, -93, BuiltinOptions.WhileOptions, -79, -91, -94, BuiltinOptions.WhileOptions, -119, -84, OtaCommandGenerator.CMD_OTA_INFO, -88, -80, OtaCommandGenerator.CMD_OTA_INFO, ProtocolBytes.SOF, -94, -94, -85, BuiltinOptions.HashtableOptions, -54, -24, -11, -11, -10, -5, -89, -18, -20, -5, -89, -13, -10, -22, -24, -5, TransmissionUnpacked.HD_VAL_MAGIC_HB, -10, -11, -89, -10, -11, -89, -6, -22, -7, -20, -20, -11, -75, -46, -3, -13, 1, -4, -75, 2, -82, -5, -17, -7, -13, -82, 1, -13, -4, 1, -13, -82, 2, -3, -82, 1, -13, 2, -82, -15, -10, -13, -15, -7, -82, -9, -4, 2, -13, 0, 4, -17, -6, -82, -12, -3, 0, -82, -4, -3, -4, -69, 0, -13, -2, -13, -17, 2, -82, -15, -10, -13, -15, -7, -13, 0, PSSSigner.TRAILER_IMPLICIT, -60, -34, -14, -32, -18, -38, -21, -35, -103, -30, -20, -103, -24, -37, -20, -19, -21, -18, -36, -19, -30, -25, -32, -103, -17, -30, -34, TransmissionUnpacked.HD_VAL_MAGIC_HB, -89, -70, -54, -39, -52, -52, TransmissionUnpacked.HD_VAL_MAGIC_LB, -121, -48, -38, -121, TransmissionUnpacked.HD_VAL_MAGIC_LB, -42, -37, -121, -48, TransmissionUnpacked.HD_VAL_MAGIC_LB, -37, -52, -39, -56, -54, -37, -48, -35, -52, -107, -120, -100, -103, BuiltinOptions.CosOptions, -88, -99, -105, -97, -103, -90, BuiltinOptions.CosOptions, -105, -107, -94, -94, -93, -88, BuiltinOptions.CosOptions, -106, -103, BuiltinOptions.CosOptions, -94, -103, -101, -107, -88, -99, -86, -103, -103, -84, -88, -70, BuiltinOptions.DensifyOptions, TransmissionUnpacked.HD_VAL_MAGIC_HB, -4, -6, -69, -13, -18, TransmissionUnpacked.HD_VAL_MAGIC_HB, -14, -17, -4, -4, -8, -69, -18, -15, 0, -69, -10, -5, 1, -14, -1, -5, -18, -7, -69, 3, -10, -14, 4, -69, -45, 2, -7, -7, -32, TransmissionUnpacked.HD_VAL_MAGIC_HB, -1, -14, -14, -5, -50, -15, -31, -4, -4, -7, -17, -18, -1, -3, -47, -12, -26, -7, -11, 7, -80, -8, -15, 3, -80, -7, -2, 6, -7, 3, -7, -14, -4, -11, -80, -12, -7, -3, -11, -2, 3, -7, -1, -2, 3, -80, -72, 7, -51, -40, -84, -49, -63, -44, -48, -30, -117, -45, -52, -34, -117, -39, -38, -117, -37, -52, -35, -48, -39, -33, -103, -86, BuiltinOptions.RightShiftOptions, -95, -109, -90, -94, -76, BuiltinOptions.WhileOptions, -90, -80, BuiltinOptions.WhileOptions, -85, -78, -87, -87, BuiltinOptions.HashtableOptions, -87, BuiltinOptions.BitwiseXorOptions, OtaCommandGenerator.CMD_OTA_INFO, OtaCommandGenerator.CMD_GET_INFO_TLV, -91, -95, -77, BuiltinOptions.IfOptions, -91, ProtocolBytes.SOF, BuiltinOptions.IfOptions, -80, -85, -85, BuiltinOptions.IfOptions, -80, -82, -99, -86, ProtocolBytes.SOF, -84, -99, -82, -95, -86, -80, BuiltinOptions.Conv3DOptions, -67, OtaCommandGenerator.CMD_GET_INFO, -76, -90, -71, -75, -57, BuiltinOptions.ReadVariableOptions, -71, -61, BuiltinOptions.ReadVariableOptions, -58, -71, -61, -71, -78, PSSSigner.TRAILER_IMPLICIT, -75, BuiltinOptions.RightShiftOptions, 10, -34, 1, -13, 6, 2, 20, -67, 13, -2, 15, 2, 11, 17, -67, 6, 16, -67, 11, 12, 17, -67, 16, 2, 17, -67, 17, 12, -67, -13, -26, TransmissionUnpacked.HD_VAL_MAGIC_HB, -26, -33, -23, -30, -53, -84, Byte.MIN_VALUE, -93, -107, -88, -92, -74, BuiltinOptions.NonMaxSuppressionV4Options, -75, -88, -78, -88, -95, -85, -92, BuiltinOptions.NonMaxSuppressionV4Options, OtaCommandGenerator.CMD_OTA_INFO, -79, -92, OtaCommandGenerator.CMD_OTA_INFO, BuiltinOptions.NonMaxSuppressionV4Options, -88, -78, BuiltinOptions.NonMaxSuppressionV4Options, -77, -82, -82, BuiltinOptions.NonMaxSuppressionV4Options, -78, -84, OtaCommandGenerator.CMD_OTA_INFO, -85, -85, BuiltinOptions.NonMaxSuppressionV4Options, -102, BuiltinOptions.SegmentSumOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.AssignVariableOptions, -91, BuiltinOptions.SegmentSumOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.NonMaxSuppressionV4Options, -75, -88, -78, -88, -95, -85, -92, BuiltinOptions.HashtableOptions, BuiltinOptions.NonMaxSuppressionV4Options, -94, -76, -79, -79, -92, -83, -77, BuiltinOptions.NonMaxSuppressionV4Options, -77, -89, -79, -92, -78, -89, -82, -85, -93, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.SegmentSumOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.AssignVariableOptions, -91, BuiltinOptions.SegmentSumOptions, BuiltinOptions.SegmentSumOptions, -100, -94, BuiltinOptions.UnsortedSegmentProdOptions, -103, -117, -98, -102, -84, BuiltinOptions.WhereOptions, -84, -98, -93, -103, -92, -84, BuiltinOptions.WhereOptions, -98, -88, BuiltinOptions.WhereOptions, -93, -92, -87, BuiltinOptions.WhereOptions, -88, -102, -87, BuiltinOptions.WhereOptions, -87, -92, BuiltinOptions.WhereOptions, -117, BuiltinOptions.RightShiftOptions, -120, BuiltinOptions.RightShiftOptions, BuiltinOptions.UnsortedSegmentMaxOptions, -127, BuiltinOptions.ATan2Options, BuiltinOptions.DensifyOptions, OtaCommandGenerator.CMD_GET_INFO_TLV, -109, -104, BuiltinOptions.FillOptions, -102, -115, -119, -101, -123, -122, OtaCommandGenerator.CMD_NOTIFY_STATUS, -119, -32, -46, OtaCommandGenerator.CMD_OTA_INFO, -109, -113, -95, -117, -116, -106, -113, -13, -19, 21, 17, 2, -93, -95, -56, -70, -65, -75, -64, -56};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final synchronized String A0R() {
        return LF.values()[this.A05.A01()].toString() + String.format(Locale.US, A0H(0, 9, 46), Float.valueOf(this.A05.A00() * 100.0f));
    }

    static {
        A0M();
        A0I = C2301eX.class.getSimpleName();
    }

    public C2301eX(View view, int i, int i2, boolean z, WeakReference<AbstractC2300eW> weakReference, C2228dL c2228dL) {
        this.A0B = new Handler();
        this.A01 = 0;
        this.A02 = 1000;
        this.A08 = true;
        this.A05 = new C2302eY(LF.A0L);
        this.A06 = new HashMap();
        this.A03 = 0L;
        this.A00 = 0;
        this.A07 = true;
        this.A0D = c2228dL;
        this.A0C = view;
        if (this.A0C.getId() == -1) {
            XP.A0I(this.A0C);
        }
        this.A0A = i;
        this.A0E = weakReference;
        this.A0F = z;
        if (i2 < 0) {
            if (BuildConfigApi.isDebug()) {
                Log.w(A0I, A0H(211, 29, 20));
            }
            i2 = 0;
        }
        this.A09 = i2;
    }

    public C2301eX(View view, int i, WeakReference<AbstractC2300eW> weakReference, C2228dL c2228dL) {
        this(view, i, 0, false, weakReference, c2228dL);
    }

    public C2301eX(View view, int i, boolean z, WeakReference<AbstractC2300eW> weakReference, C2228dL c2228dL) {
        this(view, i, 0, z, weakReference, c2228dL);
    }

    public static float A00(View view) {
        float alpha = view.getAlpha();
        while (view.getParent() instanceof ViewGroup) {
            view = (View) view.getParent();
            float alpha2 = view.getAlpha();
            if (alpha2 < 0.0f) {
                alpha2 = 0.0f;
            }
            if (alpha2 > 1.0f) {
                alpha2 = 1.0f;
            }
            alpha *= alpha2;
        }
        return alpha;
    }

    public static int A01(int i, View view) {
        int width = view.getWidth() * view.getHeight();
        float onePixelPercentage = width > 0 ? 100.0f / width : 100.0f;
        int viewArea = (int) Math.max(i, Math.ceil(onePixelPercentage));
        return viewArea;
    }

    public static /* synthetic */ int A05(C2301eX c2301eX) {
        int i = c2301eX.A00;
        c2301eX.A00 = i + 1;
        return i;
    }

    public static int A09(int[] iArr, int i) {
        int i2 = 0;
        int mid = iArr.length;
        while (i2 < mid) {
            int low = mid - i2;
            int high = (low / 2) + i2;
            int low2 = iArr[high];
            if (low2 == i) {
                return high;
            }
            int low3 = iArr[high];
            if (low3 > i) {
                mid = high;
            } else {
                i2 = high + 1;
            }
        }
        return -1;
    }

    public static Vector<Rect> A0K(View view) {
        Vector<Rect> vector = new Vector<>();
        if (!(view.getParent() instanceof ViewGroup)) {
            return vector;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        for (int indexOfChild = viewGroup.indexOfChild(view) + 1; indexOfChild < viewGroup.getChildCount(); indexOfChild++) {
            View childAt = viewGroup.getChildAt(indexOfChild);
            if (A0H[0].length() == 13) {
                throw new RuntimeException();
            }
            String[] strArr = A0H;
            strArr[5] = "k1JcZ1wpbQO9ikEolBidSsMChjYk4Sl";
            strArr[2] = "tjbQFFO1F8PkdaxFL56rw4qlI30x63G";
            int childIndex = 1;
            boolean z = !(childAt instanceof C2204cw);
            if ((childAt instanceof I5) && AbstractC2303eZ.A00(childAt)) {
                childIndex = 0;
            }
            if (z && childIndex != 0) {
                Vector<Rect> rectVector = A0L(childAt);
                vector.addAll(rectVector);
            }
        }
        Vector<Rect> rectVector2 = A0K(viewGroup);
        vector.addAll(rectVector2);
        return vector;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Vector<android.graphics.Rect> A0L(android.view.View r5) {
        /*
            java.util.Vector r3 = new java.util.Vector
            r3.<init>()
            boolean r0 = r5.isShown()
            if (r0 == 0) goto L14
            float r1 = r5.getAlpha()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L15
        L14:
            return r3
        L15:
            java.lang.Class r0 = r5.getClass()
            java.lang.String r4 = r0.getName()
            r2 = 245(0xf5, float:3.43E-43)
            r1 = 50
            r0 = 109(0x6d, float:1.53E-43)
            java.lang.String r0 = A0H(r2, r1, r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L73
            android.graphics.drawable.Drawable r4 = r5.getBackground()
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C2301eX.A0H
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 13
            if (r1 == r0) goto L85
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2301eX.A0H
            java.lang.String r1 = "wSIkE0lymuYwIsZPrnhj"
            r0 = 7
            r2[r0] = r1
            if (r4 == 0) goto L73
            android.graphics.drawable.Drawable r0 = r5.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.GradientDrawable
            if (r0 == 0) goto L73
            r1 = 1
        L50:
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L76
            boolean r0 = com.facebook.ads.redexgen.core.AbstractC2303eZ.A00(r5)
            if (r0 != 0) goto L5c
            if (r1 == 0) goto L76
        L5c:
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r1 = 0
        L5f:
            int r0 = r5.getChildCount()
            if (r1 >= r0) goto L75
            android.view.View r0 = r5.getChildAt(r1)
            java.util.Vector r0 = A0L(r0)
            r3.addAll(r0)
            int r1 = r1 + 1
            goto L5f
        L73:
            r1 = 0
            goto L50
        L75:
            return r3
        L76:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            boolean r0 = r5.getGlobalVisibleRect(r1)
            if (r0 == 0) goto L84
            r3.add(r1)
        L84:
            return r3
        L85:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2301eX.A0L(android.view.View):java.util.Vector");
    }

    public static void A0N(View view, boolean z, String str) {
        if (BuildConfigApi.isDebug()) {
            String str2 = A0H(240, 5, 35) + view + A0H(9, 4, 46) + (z ? A0H(579, 8, 10) : A0H(Videoio.CAP_PROP_XI_IMAGE_BLACK_LEVEL, 12, 4)) + A0H(13, 14, 71) + str;
        }
    }

    public final synchronized Map<String, String> A0S() {
        HashMap hashMap;
        hashMap = new HashMap();
        hashMap.put(A0H(Videoio.CAP_PROP_XI_REGION_SELECTOR, 3, 127), String.valueOf(this.A05.A01()));
        hashMap.put(A0H(Videoio.CAP_PROP_XI_TEST_PATTERN_GENERATOR_SELECTOR, 2, 93), String.valueOf(this.A05.A00()));
        hashMap.put(A0H(577, 2, 74), new JSONObject(this.A06).toString());
        hashMap.put(A0H(592, 2, 13), XG.A06(this.A03));
        Map<String, String> viewabilityData = this.A05.A03();
        hashMap.putAll(viewabilityData);
        return hashMap;
    }

    public final synchronized void A0T() {
        this.A05 = new C2302eY(LF.A0L);
    }

    public final synchronized void A0U() {
        if (this.A04 != null) {
            A0V();
        }
        if (this.A07) {
            this.A0D.A0F().A3k();
        }
        this.A04 = new AnonymousClass26(this, this.A0D);
        this.A0B.postDelayed(this.A04, this.A01);
        this.A08 = false;
        this.A00 = 0;
        this.A05 = new C2302eY(LF.A0L);
        this.A06 = new HashMap();
    }

    public final synchronized void A0V() {
        if (this.A07) {
            this.A0D.A0F().A3l();
        }
        this.A0B.removeCallbacks(this.A04);
        this.A04 = null;
        this.A08 = true;
        this.A00 = 0;
    }

    public final void A0W(int i) {
        this.A01 = i;
    }

    public final void A0X(int i) {
        if (BuildConfigApi.isDebug() && !this.A0F) {
            Log.w(A0I, A0H(92, 64, 110));
        }
        this.A02 = i;
    }

    public final void A0Y(boolean z) {
        this.A07 = z;
    }

    public final synchronized boolean A0Z() {
        return this.A08;
    }
}
