package com.anythink.expressad.video.bt.a;

import android.text.TextUtils;
import android.util.Base64;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.video.bt.a.a;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class b {
    private static final String c = "HandlerH5MessageManager";

    /* renamed from: a, reason: collision with root package name */
    int f5167a;
    int b;
    private String d;

    /* synthetic */ b(byte b) {
        this();
    }

    private b() {
        this.d = "handlerNativeResult";
        this.f5167a = 0;
        this.b = 1;
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static b f5168a = new b(0);

        private a() {
        }
    }

    public static b a() {
        return a.f5168a;
    }

    public final void a(Object obj, JSONObject jSONObject) {
        try {
            if (TextUtils.isEmpty(jSONObject.toString())) {
                a(this.b, "params is null", obj);
                return;
            }
            String optString = jSONObject.optString("uniqueIdentifier");
            String optString2 = jSONObject.optString("name");
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                jSONObject.optJSONArray("parameters");
                JSONObject optJSONObject = jSONObject.optJSONObject("result");
                if (optJSONObject != null && !TextUtils.isEmpty(optJSONObject.toString())) {
                    optJSONObject.optInt("type", 0);
                }
                a(this.f5167a, "receivedMessage", obj);
                if (optString.equalsIgnoreCase("reporter") || !optString.equalsIgnoreCase("MediaPlayer")) {
                    return;
                }
                com.anythink.expressad.video.bt.a.a unused = a.C0249a.f5166a;
                return;
            }
            a(this.b, "module or method is null", obj);
        } catch (Exception e) {
            e.getMessage();
            a(this.b, e.getMessage(), obj);
        } catch (Throwable th) {
            th.getMessage();
            a(this.b, th.getMessage(), obj);
        }
    }

    private static void a(int i, String str, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            jSONObject.put("message", str);
            h.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (JSONException e) {
            e.getMessage();
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
