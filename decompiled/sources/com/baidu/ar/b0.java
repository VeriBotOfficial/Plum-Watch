package com.baidu.ar;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.baidu.ar.callback.ICallbackWith;
import com.baidu.ar.constants.HttpConstants;
import com.baidu.ar.ihttp.HttpException;
import com.baidu.ar.ihttp.HttpFactory;
import com.baidu.ar.ihttp.IHttpRequest;
import com.baidu.ar.ihttp.IHttpResponse;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class b0 {
    public static final String c = "b0";

    /* renamed from: a, reason: collision with root package name */
    public IHttpRequest f6800a;
    public ICallbackWith<String> b;

    public class a implements c6 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ICallbackWith f6801a;

        public a(ICallbackWith iCallbackWith) {
            this.f6801a = iCallbackWith;
        }

        @Override // com.baidu.ar.c6
        public void a(HttpException httpException) {
            h.a(b0.c, "" + httpException.getMessage());
        }

        @Override // com.baidu.ar.c6
        public void a(IHttpResponse iHttpResponse) {
            if (!iHttpResponse.isSuccess() || this.f6801a == null) {
                return;
            }
            try {
                String content = iHttpResponse.getContent();
                h.a(b0.c, "response: " + content);
                x b = b0.this.b(content);
                if (b != null) {
                    this.f6801a.run(b);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public final JSONObject a(Context context, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            gb.a(jSONObject);
            gb.b(context, jSONObject);
            gb.a(context, jSONObject);
            jSONObject.put("device_platform", "");
            jSONObject.put("os_version", Build.VERSION.SDK_INT);
            jSONObject.put("device_type", Build.BRAND);
            jSONObject.put("device_id", gb.a(context));
            jSONObject.put("app_version", o.a());
            jSONObject.put("manufacture", Build.MANUFACTURER);
            jSONObject.put(HttpConstants.HTTP_HARDWARE, Build.HARDWARE);
            jSONObject.put(HttpConstants.HTTP_BOARD, Build.BOARD);
            jSONObject.put("classification_id", str);
            h.a(c, "params: " + jSONObject.toString());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public void a(Context context, String str, ICallbackWith<x> iCallbackWith) {
        IHttpRequest newRequest = HttpFactory.newRequest();
        if (newRequest == null) {
            return;
        }
        newRequest.setMethod("POST").setUrl(id.a()).setBody(a(context, str));
        newRequest.enqueue(new a(iCallbackWith));
        this.f6800a = newRequest;
    }

    public void a(ICallbackWith<String> iCallbackWith) {
        this.b = iCallbackWith;
    }

    public final void a(String str) {
        this.b.run("fetch ability scheme config fail. " + str);
    }

    public final boolean a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject != null && jSONObject.has("common") && (optJSONObject = jSONObject.optJSONObject("common")) != null && optJSONObject.has("cpu_score")) {
            Object opt = optJSONObject.opt("cpu_score");
            if (opt instanceof String) {
                return Integer.parseInt((String) opt) > 0;
            }
            if ((opt instanceof Number) && Integer.parseInt(opt.toString()) > 0) {
                return true;
            }
        }
        return false;
    }

    public final x b(String str) {
        if (TextUtils.isEmpty(str)) {
            if (this.b != null) {
                a("response is empty");
            }
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("err_num", -1);
            if (optInt == 0 && jSONObject.has("data")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (optJSONObject != null && optJSONObject.has("classification")) {
                    x xVar = new x();
                    xVar.b = optJSONObject.getJSONObject("classification");
                    xVar.f7311a = optJSONObject.optString("classification_id", "default");
                    if (!a(xVar.b) && this.b != null) {
                        String str2 = c;
                        h.b(str2, str);
                        a("config format is error. see Logcat filter: " + str2);
                    }
                    return xVar;
                }
            } else if (this.b != null) {
                a("err_num: " + optInt + " " + (jSONObject.has("err_msg") ? jSONObject.getString("err_msg") : ""));
            }
        } catch (JSONException e) {
            if (this.b != null) {
                a(e.getMessage());
            }
            e.printStackTrace();
        }
        return null;
    }

    public void b() {
        this.b = null;
        IHttpRequest iHttpRequest = this.f6800a;
        if (iHttpRequest != null) {
            iHttpRequest.cancel();
            this.f6800a = null;
        }
    }
}
