package com.anythink.expressad.atsignalcommon.windvane;

import android.text.TextUtils;
import android.webkit.WebView;

/* loaded from: classes12.dex */
public abstract class a implements com.anythink.core.express.d.b {
    @Override // com.anythink.core.express.d.b
    public final void a(Object obj, String str, String str2) {
        String format;
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (TextUtils.isEmpty(str2)) {
                format = String.format("javascript:window.MvBridge.fireEvent('%s', '');", str);
            } else {
                format = String.format("javascript:window.MvBridge.fireEvent('%s','%s');", str, com.anythink.core.express.d.d.c(str2));
            }
            if (bVar.f4693a != null) {
                try {
                    bVar.f4693a.loadUrl(format);
                } catch (Exception e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    private static void a(WebView webView, String str, String str2) {
        String format;
        if (TextUtils.isEmpty(str2)) {
            format = String.format("javascript:window.MvBridge.fireEvent('%s', '');", str);
        } else {
            format = String.format("javascript:window.MvBridge.fireEvent('%s','%s');", str, com.anythink.core.express.d.d.c(str2));
        }
        if (webView != null) {
            try {
                webView.loadUrl(format);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.anythink.core.express.d.b
    public final void b(Object obj, String str) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (TextUtils.isEmpty(str)) {
                String.format("javascript:window.MvBridge.onFailure(%s,'');", bVar.g);
            } else {
                str = com.anythink.core.express.d.d.c(str);
            }
            String format = String.format("javascript:window.MvBridge.onFailure(%s,'%s');", bVar.g, str);
            if (bVar.f4693a != null) {
                try {
                    bVar.f4693a.loadUrl(format);
                } catch (Exception e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }
}
