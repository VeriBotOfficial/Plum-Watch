package com.anythink.expressad.atsignalcommon.webEnvCheck;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.anythink.core.express.web.b;

/* loaded from: classes12.dex */
public final class MBWebViewChecker {

    /* renamed from: a, reason: collision with root package name */
    private static volatile Boolean f4687a;
    private static volatile Handler b;
    private static Boolean c;

    public static boolean isWebViewAvailable(final Context context) {
        Boolean bool = Boolean.FALSE;
        c = bool;
        if (bool == null || !bool.booleanValue()) {
            return true;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (f4687a == null) {
                try {
                    f4687a = Boolean.valueOf(b(context));
                } catch (Exception unused) {
                    f4687a = Boolean.FALSE;
                }
            }
            if (f4687a == null) {
                f4687a = Boolean.FALSE;
            }
            return f4687a.booleanValue();
        }
        if (f4687a == null && b == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            b = handler;
            handler.post(new Runnable() { // from class: com.anythink.expressad.atsignalcommon.webEnvCheck.MBWebViewChecker.1
                @Override // java.lang.Runnable
                public void run() {
                    if (MBWebViewChecker.f4687a == null) {
                        try {
                            Boolean unused2 = MBWebViewChecker.f4687a = Boolean.valueOf(MBWebViewChecker.b(context));
                        } catch (Exception unused3) {
                            Boolean unused4 = MBWebViewChecker.f4687a = Boolean.FALSE;
                        }
                    }
                }
            });
        }
        if (f4687a == null) {
            return true;
        }
        return f4687a.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Context context) {
        WebView webView;
        try {
            webView = new WebView(context);
            webView.setWebViewClient(new b());
        } catch (Exception unused) {
            webView = null;
        }
        if (webView == null) {
            return false;
        }
        try {
            webView.destroy();
            return true;
        } catch (Exception unused2) {
            return true;
        }
    }

    private static void a(WebView webView) {
        try {
            webView.destroy();
        } catch (Exception unused) {
        }
    }
}
