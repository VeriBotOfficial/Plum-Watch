package com.anythink.basead.mraid;

import android.content.Context;
import android.text.TextUtils;
import com.phancy.mini.core.app.meta.MiniAppJson;
import io.livekit.android.room.util.MediaConstraintKeys;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    protected static final String f2923a = "MraidJSBridge";
    public static int d = 1500;
    protected Context b;
    protected MraidBaseWebView c;
    private com.anythink.core.express.b.b e;

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Context context, MraidBaseWebView mraidBaseWebView) {
        this.b = context;
        this.c = mraidBaseWebView;
        try {
            if (context instanceof com.anythink.core.express.b.b) {
                this.e = (com.anythink.core.express.b.b) context;
                return;
            }
            if (mraidBaseWebView.getObject() != null && (mraidBaseWebView.getObject() instanceof com.anythink.core.express.b.b)) {
                this.e = (com.anythink.core.express.b.b) mraidBaseWebView.getObject();
            }
            if (mraidBaseWebView.getMraidObject() == null || !(mraidBaseWebView.getMraidObject() instanceof com.anythink.core.express.b.b)) {
                return;
            }
            this.e = (com.anythink.core.express.b.b) mraidBaseWebView.getMraidObject();
        } catch (Exception unused) {
        }
    }

    public final void a(String str) {
        MraidBaseWebView mraidBaseWebView = this.c;
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.a(mraidBaseWebView, "open");
        try {
            String optString = new JSONObject(str).optString("url");
            if (this.e == null || TextUtils.isEmpty(optString)) {
                return;
            }
            this.e.open(optString);
        } catch (Throwable unused) {
        }
    }

    public final void a() {
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.a(this.c, "close");
        try {
            com.anythink.core.express.b.b bVar = this.e;
            if (bVar != null) {
                bVar.close();
            }
        } catch (Throwable unused) {
        }
    }

    public final void b() {
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.a(this.c, "unload");
        try {
            com.anythink.core.express.b.b bVar = this.e;
            if (bVar != null) {
                bVar.unload();
            }
        } catch (Throwable unused) {
        }
    }

    public final void b(String str) {
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.a(this.c, "useCustomClose");
        try {
            String optString = new JSONObject(str).optString("shouldUseCustomClose");
            if (TextUtils.isEmpty(optString) || this.e == null) {
                return;
            }
            this.e.useCustomClose(optString.toLowerCase().equals(MediaConstraintKeys.TRUE));
        } catch (Throwable unused) {
        }
    }

    public final void c(String str) {
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.a(this.c, "expand");
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("url");
            String optString2 = jSONObject.optString("shouldUseCustomClose");
            if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || this.e == null) {
                return;
            }
            this.e.expand(optString, optString2.toLowerCase().equals(MediaConstraintKeys.TRUE));
        } catch (Throwable unused) {
        }
    }

    private void d(String str) {
        String str2;
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.a(this.c, "setOrientationProperties");
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("allowOrientationChange");
            String optString2 = jSONObject.optString("forceOrientation");
            if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || this.e == null) {
                return;
            }
            optString.toLowerCase().equals(MediaConstraintKeys.TRUE);
            String lowerCase = optString2.toLowerCase();
            int hashCode = lowerCase.hashCode();
            if (hashCode == 729267099) {
                str2 = MiniAppJson.PORTRAIT;
            } else if (hashCode != 1430647483) {
                return;
            } else {
                str2 = MiniAppJson.LANDSCAPE;
            }
            lowerCase.equals(str2);
        } catch (Throwable unused) {
        }
    }
}
