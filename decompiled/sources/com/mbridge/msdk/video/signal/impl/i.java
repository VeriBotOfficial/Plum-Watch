package com.mbridge.msdk.video.signal.impl;

import android.content.res.Configuration;
import android.util.Base64;
import android.webkit.WebView;
import com.anythink.expressad.splash.js.SplashJsUtils;
import com.phancy.mini.core.app.meta.MiniAppJson;
import org.json.JSONObject;

/* compiled from: JSActivityProxy.java */
/* loaded from: classes17.dex */
public class i extends b {

    /* renamed from: a, reason: collision with root package name */
    private WebView f12625a;
    private int b = 0;

    public i(WebView webView) {
        this.f12625a = webView;
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void a(Configuration configuration) {
        super.a(configuration);
        try {
            JSONObject jSONObject = new JSONObject();
            if (configuration.orientation == 2) {
                jSONObject.put("orientation", MiniAppJson.LANDSCAPE);
            } else {
                jSONObject.put("orientation", MiniAppJson.PORTRAIT);
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f12625a, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void b() {
        super.b();
        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f12625a, "onSystemDestory", "");
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void d() {
        super.d();
        this.b = 0;
        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f12625a, SplashJsUtils.b, "");
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void e() {
        super.e();
        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f12625a, "onSystemBackPressed", "");
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void g() {
        super.g();
        this.b = 1;
        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f12625a, SplashJsUtils.f5128a, "");
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void a(int i) {
        super.a(i);
        this.b = i;
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public int a() {
        return this.b;
    }
}
