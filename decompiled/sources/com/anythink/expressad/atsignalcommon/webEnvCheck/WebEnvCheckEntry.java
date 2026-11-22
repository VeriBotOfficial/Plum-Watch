package com.anythink.expressad.atsignalcommon.webEnvCheck;

import android.content.Context;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.f.b.a;
import com.phancy.mini.utils.MimeExtKt;

/* loaded from: classes12.dex */
public class WebEnvCheckEntry {
    public void check(Context context) {
        try {
            WindVaneWebView windVaneWebView = new WindVaneWebView(context);
            StringBuilder sb = new StringBuilder("<html><script>");
            a.a();
            windVaneWebView.loadDataWithBaseURL(null, sb.append(a.b()).append("</script></html>").toString(), MimeExtKt.MIME_TYPE_HTML, "utf-8", null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
