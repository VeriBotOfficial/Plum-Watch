package com.bytedance.sdk.openadsdk.core.widget.fxn;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.dx;
import java.lang.ref.WeakReference;

/* loaded from: classes14.dex */
public class gff {
    private final WeakReference<Context> fxn;
    private boolean kg = true;
    private final boolean gff = true;
    private final boolean hm = true;
    private final boolean rb = false;
    private final boolean bh = true;

    /* renamed from: sg, reason: collision with root package name */
    private boolean f9531sg = true;

    public static gff fxn(Context context) {
        return new gff(context);
    }

    private gff(Context context) {
        this.fxn = new WeakReference<>(context);
    }

    public gff fxn(boolean z) {
        this.f9531sg = z;
        return this;
    }

    public gff kg(boolean z) {
        this.kg = z;
        return this;
    }

    public void fxn(WebView webView) {
        if (webView == null || this.fxn.get() == null) {
            return;
        }
        kg(webView);
        WebSettings settings = webView.getSettings();
        fxn(settings);
        if (settings == null) {
            return;
        }
        try {
            settings.setJavaScriptEnabled(true);
        } catch (Exception e) {
            dx.gff("SSWebSettings", e.getMessage());
        }
        try {
            if (this.kg) {
                settings.setSupportZoom(true);
                settings.setBuiltInZoomControls(true);
            } else {
                settings.setSupportZoom(false);
            }
        } catch (Throwable th) {
            dx.gff("SSWebSettings", th.getMessage());
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBlockNetworkImage(false);
        settings.setSavePassword(false);
        try {
            if (this.f9531sg) {
                webView.setLayerType(2, null);
            } else {
                webView.setLayerType(0, null);
            }
        } catch (Throwable th2) {
            dx.gff("SSWebSettings", th2.getMessage());
        }
    }

    public static void kg(WebView webView) {
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th) {
            dx.gff(th.toString(), new Object[0]);
        }
    }

    private void fxn(WebSettings webSettings) {
        try {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Throwable th) {
            dx.gff(th.toString(), new Object[0]);
        }
    }

    public static void fxn(com.bytedance.sdk.component.jq.bh bhVar) {
        if (bhVar == null) {
            return;
        }
        int fxn = com.bytedance.sdk.openadsdk.ums.fxn.fxn("clear_web_cache_new", 0);
        if (fxn == 0) {
            bhVar.fxn(true);
        } else if (fxn == 1) {
            bhVar.fxn(false);
        }
    }
}
