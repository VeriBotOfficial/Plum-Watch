package com.facebook.ads.redexgen.core;

import android.app.Activity;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Ze, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2002Ze extends WebView {
    public static byte[] A01;
    public static final String A02;
    public boolean A00;

    public static String A0B(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 96);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A01 = new byte[]{-31, -4, 4, 7, 0, -1, -69, 15, 10, -69, 4, 9, 4, 15, 4, -4, 7, 4, 21, 0, -69, -34, 10, 10, 6, 4, 0, -24, -4, 9, -4, 2, 0, 13, -55, -70, -71, -125, -58, TransmissionUnpacked.HD_VAL_MAGIC_LB, -60, -42, -53, -56, -57, 63, BuiltinOptions.NotEqualOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.PowOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.RangeOptions, 15, -4, -22, -25, -28, -5, -18, -22, -4};
    }

    public abstract WebChromeClient A0G();

    public abstract WebViewClient A0H();

    static {
        A0C();
        A02 = AbstractC2002Ze.class.getSimpleName();
    }

    public AbstractC2002Ze(Activity activity, C2228dL c2228dL) {
        super(activity);
        A0E(c2228dL);
    }

    public AbstractC2002Ze(C2228dL c2228dL) {
        super(c2228dL);
        A0E(c2228dL);
    }

    public static void A0D(int i) {
        C2202cu context = SP.A00();
        if (context != null) {
            context.A08().AAy(A0B(56, 8, 37), i, new C1842Sw(A0B(35, 10, 3)));
        }
    }

    private void A0E(SQ sq) {
        setWebChromeClient(A0G());
        setWebViewClient(A0H());
        AbstractC2008Zk.A04(this);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(true);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        if (sq.A05().AAF()) {
            setWebContentsDebuggingEnabled(true);
        }
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        try {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this, true);
        } catch (Exception unused) {
            Log.w(A02, A0B(0, 35, 59));
        }
    }

    private void A0F(String str) {
        loadUrl(A0B(45, 11, 117) + str);
    }

    public final void A0I(String str) {
        try {
            evaluateJavascript(str, null);
        } catch (IllegalStateException unused) {
            A0F(str);
        }
    }

    public final boolean A0J() {
        return this.A00;
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.A00 = true;
        super.destroy();
    }
}
