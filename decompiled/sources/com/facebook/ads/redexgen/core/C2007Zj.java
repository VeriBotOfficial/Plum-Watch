package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.commons.net.nntp.NNTPReply;
import org.apache.commons.net.telnet.TelnetCommand;
import org.json.JSONException;
import org.json.JSONObject;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Zj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2007Zj extends WebViewClient {
    public static byte[] A0B;
    public static String[] A0C = {"zsPwasR1y7408", "ZGgsKLkccpHpwEVEMRkr0P5MO", "FzTF8imkK53ZXE3O7c0sd3pyoR5CtRCL", "JPkvHHHSAaAEWhLae7UVRehZAXg5QbZs", "c", "Jl8ZDZjQ485DOmiNP3uI8E", "DJVtCfMEOJ4BXbKH6y5pb3wK31xmWsao", "K"};
    public Date A00;
    public boolean A01 = false;
    public final C2228dL A02;
    public final WeakReference<C1624Ki> A03;
    public final WeakReference<InterfaceC2005Zh> A04;
    public final WeakReference<AtomicBoolean> A05;
    public final WeakReference<XH> A06;
    public final WeakReference<C2301eX> A07;
    public final AtomicInteger A08;
    public final AtomicReference<String> A09;
    public final boolean A0A;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 118);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {8, BuiltinOptions.DequantizeOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.NegOptions, -14, 8, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.TileOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.TransposeConvOptions, -69, -36, -27, -32, -36, -37, 28, BuiltinOptions.MirrorPadOptions, BuiltinOptions.PowOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.PowOptions, BuiltinOptions.LeakyReluOptions, 64, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.LogicalAndOptions, -9, BuiltinOptions.GreaterOptions, BuiltinOptions.LessOptions, 32, -9, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.PowOptions, BuiltinOptions.LeakyReluOptions, 63, -9, 61, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.RangeOptions, -9, 29, 64, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.LogicalOrOptions, -9, 24, 58, 58, BuiltinOptions.LogicalOrOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.ResizeNearestNeighborOptions, -9, -46, 5, 1, -1, -18, -83, -15, -18, 1, -18, -57, -83, BuiltinOptions.LogicalOrOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.FillOptions, 20, BuiltinOptions.ArgMinOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.PackOptions, BuiltinOptions.CosOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.LeakyReluOptions, 6, BuiltinOptions.PowOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixSetDiagOptions, 6, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.WhereOptions, BuiltinOptions.MatrixDiagOptions, 6, BuiltinOptions.GreaterOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.AddNOptions, BuiltinOptions.LeakyReluOptions, 6, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.RangeOptions, BuiltinOptions.RangeOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.QuantizeOptions, 6, 34, BuiltinOptions.PackOptions, 64, BuiltinOptions.LessEqualOptions, BuiltinOptions.TileOptions, BuiltinOptions.SparseToDenseOptions, -19, 31, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.SquareOptions, BuiltinOptions.SparseToDenseOptions, 64, BuiltinOptions.FloorDivOptions, -19, BuiltinOptions.TileOptions, BuiltinOptions.LogicalOrOptions, 63, -19, 19, BuiltinOptions.NotEqualOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.SparseToDenseOptions, -19, 14, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SparseToDenseOptions, 64, 64, -19, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.PackOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FillOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.FillOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.CosOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.FloorModOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.SplitVOptions, 64, BuiltinOptions.GatherNdOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 63, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.RangeOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.ArgMinOptions, 61, BuiltinOptions.RangeOptions, BuiltinOptions.LogicalAndOptions, 63, BuiltinOptions.ArgMaxOptions, BuiltinOptions.EqualOptions, BuiltinOptions.EqualOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.EqualOptions, 34, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.EqualOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.TileOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TransposeConvOptions, 15, 10, 31, 18, 12, 24, 23, -41, 18, 12, 24, 19, 22, 25, 18, BuiltinOptions.QuantizeOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.WhereOptions, BuiltinOptions.AddNOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.WhereOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.GatherNdOptions, BuiltinOptions.WhereOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.WhereOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.SelectV2Options, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.SelectV2Options, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.RangeOptions, BuiltinOptions.PackOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.AbsOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 63, BuiltinOptions.ArgMinOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.MirrorPadOptions, -3, -12, 3, -55, -55, -44, -31, -31, -18, -44, -36, -33, -29, -24, -18, -31, -44, -30, -33, -34, -35, -30, -44, BuiltinOptions.LessEqualOptions, BuiltinOptions.SelectOptions, -19, BuiltinOptions.TileOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.SelectOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.CastOptions, BuiltinOptions.SquareOptions, BuiltinOptions.EqualOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.EqualOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FillOptions, BuiltinOptions.SelectOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.RankOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.BatchMatMulOptions, 32, BuiltinOptions.ScatterNdOptions, BuiltinOptions.WhileOptions, BuiltinOptions.AddNOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.NonMaxSuppressionV4Options, -8, -29, -18, -21, -26, -31, -14, -29, -10, -22, BuiltinOptions.LogicalAndOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.LessOptions, BuiltinOptions.DequantizeOptions, 61, BuiltinOptions.SliceOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.LogicalAndOptions};
        String[] strArr = A0C;
        if (strArr[0].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0C;
        strArr2[3] = "rhE0g4ovzatryzU62WuE8blUNequGZ6x";
        strArr2[6] = "8iaaY9YuVC21lqcoOxYFj2DPKFldlJdP";
        A0B = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A0A(String str, List<String> list) {
        String lowerCase = str.toLowerCase(Locale.getDefault());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (lowerCase.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    static {
        A02();
    }

    public C2007Zj(C2228dL c2228dL, WeakReference<InterfaceC2005Zh> weakReference, WeakReference<C2301eX> weakReference2, WeakReference<XH> weakReference3, WeakReference<AtomicBoolean> checkAssetsByJavascriptBridge, WeakReference<C1624Ki> weakReference4, AtomicInteger atomicInteger, AtomicReference<String> requestId, boolean z) {
        this.A02 = c2228dL;
        this.A04 = weakReference;
        this.A07 = weakReference2;
        this.A06 = weakReference3;
        this.A05 = checkAssetsByJavascriptBridge;
        this.A03 = weakReference4;
        this.A08 = atomicInteger;
        this.A09 = requestId;
        this.A0A = z;
    }

    private WebResourceResponse A00() {
        return new WebResourceResponse(A01(286, 10, 123), StandardCharsets.UTF_8.name(), 403, A01(13, 6, 1), Collections.singletonMap(A01(0, 13, 79), A01(268, 8, 74)), new ByteArrayInputStream(A01(13, 6, 1).getBytes()));
    }

    private void A03(int i, CharSequence charSequence, long j) {
        JSONObject jSONObject = new JSONObject();
        boolean z = charSequence != null;
        try {
            jSONObject.put(A01(160, 10, 100), i);
            jSONObject.put(A01(170, 17, 77), charSequence);
            jSONObject.put(A01(202, 21, 122), z);
            jSONObject.put(A01(NNTPReply.ARTICLE_RETRIEVED_REQUEST_TEXT_SEPARATELY, 22, 100), j);
            jSONObject.put(A01(276, 10, 90), this.A09.get());
        } catch (JSONException unused) {
        }
        this.A02.A08().AAy(A01(306, 8, 81), AbstractC1841Sv.A2f, new C1842Sw(AdErrorType.WEB_VIEW_FAILED_TO_LOAD.getDefaultErrorMessage(), A01(55, 12, 23) + jSONObject.toString()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(int i, String str) {
        if (A01(TelnetCommand.AO, 23, 25).equals(str)) {
            this.A02.A0F().AKC();
            return;
        }
        this.A02.A0F().AKD(i, str);
        Date finishTime = new Date();
        long time = finishTime.getTime();
        Date finishTime2 = this.A00;
        A03(i, str, time - finishTime2.getTime());
        if (this.A04.get() != null) {
            this.A04.get().ADG(i, str);
        }
    }

    private final void A05(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (webResourceRequest.getUrl().toString().toLowerCase(Locale.US).contains(A01(187, 11, 51))) {
            return;
        }
        this.A02.A0F().AKH(webResourceResponse.getStatusCode(), AbstractC1935Wp.A01(webResourceResponse.getStatusCode(), A01(67, 10, 126), A01(0, 0, 53) + webResourceRequest.getUrl()));
    }

    private void A07(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A01(145, 15, 105), str);
            jSONObject.put(A01(296, 10, 12), str2);
            jSONObject.put(A01(276, 10, 90), this.A09.get());
        } catch (JSONException unused) {
        }
        if (this.A02 != null) {
            this.A02.A08().AAy(A01(306, 8, 81), AbstractC1841Sv.A2c, new C1842Sw(AdErrorType.WEB_VIEW_CACHE_FILE_WAS_DENIED.getDefaultErrorMessage(), A01(55, 12, 23) + jSONObject.toString()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (r4 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        r4 = new java.lang.StringBuilder();
        r0 = A01(19, 36, 97);
        r4.append(r0).append(r3).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006c, code lost:
    
        r5 = com.facebook.ads.redexgen.core.SF.A09(r7.A02);
        r6 = A0A(r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
    
        if (r6 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
    
        if (com.facebook.ads.internal.api.BuildConfigApi.isDebug() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
    
        r4 = new java.lang.StringBuilder();
        r0 = A01(77, 31, 112);
        r4.append(r0).append(r3).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0098, code lost:
    
        r4 = com.facebook.ads.redexgen.core.C1624Ki.A0H;
        r0 = A01(108, 37, 87);
        android.util.Log.w(r4, r0);
        r0 = r5.toString();
        A07(r3, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b0, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b8, code lost:
    
        if (r4 != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A08(android.net.Uri r8) {
        /*
            r7 = this;
            java.lang.String r3 = r8.getPath()
            java.lang.String r4 = r8.getScheme()
            if (r3 == 0) goto Lbb
            if (r4 == 0) goto Lbb
            r5 = 198(0xc6, float:2.77E-43)
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2007Zj.A0C
            r0 = 3
            r1 = r2[r0]
            r0 = 6
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L26
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L26:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2007Zj.A0C
            java.lang.String r1 = "5na5yijD7UxFpHVkXXcSH2RW6Zg"
            r0 = 5
            r2[r0] = r1
            r1 = 4
            r0 = 55
            java.lang.String r0 = A01(r5, r1, r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lbb
            boolean r4 = com.facebook.ads.internal.api.BuildConfigApi.isDebug()
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2007Zj.A0C
            r0 = 3
            r1 = r2[r0]
            r0 = 6
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto Lb1
            if (r4 == 0) goto L6c
        L52:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r2 = 19
            r1 = 36
            r0 = 97
            java.lang.String r0 = A01(r2, r1, r0)
            java.lang.StringBuilder r0 = r4.append(r0)
            java.lang.StringBuilder r0 = r0.append(r3)
            r0.toString()
        L6c:
            com.facebook.ads.redexgen.X.dL r0 = r7.A02
            java.util.List r5 = com.facebook.ads.redexgen.core.SF.A09(r0)
            boolean r6 = A0A(r3, r5)
            if (r6 != 0) goto Lb0
            boolean r0 = com.facebook.ads.internal.api.BuildConfigApi.isDebug()
            if (r0 == 0) goto L98
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r2 = 77
            r1 = 31
            r0 = 112(0x70, float:1.57E-43)
            java.lang.String r0 = A01(r2, r1, r0)
            java.lang.StringBuilder r0 = r4.append(r0)
            java.lang.StringBuilder r0 = r0.append(r3)
            r0.toString()
        L98:
            java.lang.String r4 = com.facebook.ads.redexgen.core.C1624Ki.A01()
            r2 = 108(0x6c, float:1.51E-43)
            r1 = 37
            r0 = 87
            java.lang.String r0 = A01(r2, r1, r0)
            android.util.Log.w(r4, r0)
            java.lang.String r0 = r5.toString()
            r7.A07(r3, r0)
        Lb0:
            return r6
        Lb1:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C2007Zj.A0C
            java.lang.String r1 = "2SO0ZWlaSU1SnxqLnXbiPhTsGSHCmzPH"
            r0 = 5
            r2[r0] = r1
            if (r4 == 0) goto L6c
            goto L52
        Lbb:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2007Zj.A08(android.net.Uri):boolean");
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.A02.A0F().AKE(this.A03.get() != null);
        if (this.A03.get() != null) {
            AtomicBoolean atomicBoolean = this.A05.get();
            String[] strArr = A0C;
            if (strArr[7].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[3] = "U2DnXjrenRRLx1oMUBfcSIJQu5ANNJpT";
            strArr2[6] = "L4ZmgD3GCXt8DfDAt3P3IJDf6GSeHMJn";
            if (atomicBoolean != null && !this.A05.get().get()) {
                this.A03.get().A0K();
            }
        }
        this.A01 = true;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.A02.A0F().AKF();
        this.A00 = new Date();
        new Handler().postDelayed(new C1626Kk(this), this.A08.get());
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.A01 = true;
        A04(i, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        boolean A12 = U7.A12(this.A02);
        String A01 = A01(0, 0, 53);
        if (A12 || webResourceRequest.isForMainFrame()) {
            this.A01 = true;
            A04(webResourceError.getErrorCode(), A01 + ((Object) webResourceError.getDescription()));
        } else {
            this.A02.A0F().AKG(AbstractC1935Wp.A01(webResourceError.getErrorCode(), A01 + ((Object) webResourceError.getDescription()), A01 + webResourceRequest.getUrl()));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        A05(webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.A02.A0F().AKI();
        sslErrorHandler.cancel();
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC2002Ze.A0D(AbstractC1841Sv.A2b);
        InterfaceC2005Zh adWebViewListener = this.A04.get();
        if (adWebViewListener != null) {
            adWebViewListener.AFw();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest.getUrl();
        if (this.A0A && !A08(url)) {
            WebResourceResponse A00 = A00();
            A05(webResourceRequest, A00);
            return A00;
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (this.A04.get() != null) {
            this.A04.get().ACj(str, new C2013Zp().A03(this.A07.get()).A02(this.A06.get()).A05());
        }
        if (A0C[2].charAt(27) != 'C') {
            throw new RuntimeException();
        }
        A0C[5] = "jV60qdj1rgKoRn";
        return true;
    }
}
