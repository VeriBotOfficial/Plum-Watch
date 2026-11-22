package com.baidu.ar;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.baidu.ar.callback.ICallback;
import com.baidu.ar.callback.ICallbackWith;
import com.baidu.ar.constants.HttpConstants;
import com.baidu.ar.ihttp.Downloader;
import com.baidu.ar.ihttp.HttpException;
import com.baidu.ar.ihttp.HttpFactory;
import com.baidu.ar.ihttp.IHttpRequest;
import com.baidu.ar.ihttp.IHttpResponse;
import com.baidu.ar.ihttp.IProgressCallback;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class hb {

    /* renamed from: a, reason: collision with root package name */
    public File f6966a;
    public File b;
    public ICallbackWith<String> c;
    public IHttpRequest d;

    public class a implements c6 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ICallbackWith f6967a;
        public final /* synthetic */ String[] b;

        public a(ICallbackWith iCallbackWith, String[] strArr) {
            this.f6967a = iCallbackWith;
            this.b = strArr;
        }

        @Override // com.baidu.ar.c6
        public void a(HttpException httpException) {
            if (httpException.getCode() == 1) {
                hb.this.a("网络不给力");
            } else {
                hb.this.a(httpException.getMessage());
            }
        }

        @Override // com.baidu.ar.c6
        public void a(IHttpResponse iHttpResponse) {
            try {
                ICallbackWith iCallbackWith = this.f6967a;
                if (iCallbackWith != null) {
                    iCallbackWith.run(hb.this.a(this.b, iHttpResponse));
                }
            } catch (Exception e) {
                hb.this.a(e.getMessage());
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f6968a;

        public b(String str) {
            this.f6968a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (hb.this.c != null) {
                hb.this.c.run(this.f6968a);
            }
        }
    }

    public class c implements ICallbackWith<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ File f6969a;
        public final /* synthetic */ ICallback b;

        public c(File file, ICallback iCallback) {
            this.f6969a = file;
            this.b = iCallback;
        }

        @Override // com.baidu.ar.callback.ICallbackWith
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void run(Integer num) {
            if (!af.a(this.f6969a, hb.this.f6966a)) {
                hb.this.a("zip res fail");
                return;
            }
            j4.b(hb.this.f6966a);
            ICallback iCallback = this.b;
            if (iCallback != null) {
                iCallback.run();
            }
        }
    }

    public class d implements ICallbackWith<Exception> {
        public d() {
        }

        @Override // com.baidu.ar.callback.ICallbackWith
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void run(Exception exc) {
            hb.this.a(exc.getMessage());
        }
    }

    public hb(Context context, File file) {
        this.f6966a = file;
        this.b = new File(context.getFilesDir(), "tmp");
    }

    public final IHttpRequest a(String str, ICallback iCallback, IProgressCallback iProgressCallback) {
        if (TextUtils.isEmpty(str)) {
            a("资源不存在");
            return null;
        }
        j4.l(this.f6966a);
        j4.e(this.b);
        File file = new File(this.b, k8.b(str) + ".zip");
        if (!file.exists() || !af.a(file, this.f6966a)) {
            return new Downloader(str).downloadAsync(file.getAbsolutePath(), new c(file, iCallback), new d(), iProgressCallback);
        }
        j4.b(this.f6966a);
        if (iCallback != null) {
            iCallback.run();
        }
        return null;
    }

    public final Map<String, String> a(String[] strArr, IHttpResponse iHttpResponse) {
        JSONObject optJSONObject;
        if (!iHttpResponse.isSuccess()) {
            throw new Exception(iHttpResponse.getMessage());
        }
        String content = iHttpResponse.getContent();
        if (TextUtils.isEmpty(content)) {
            throw new Exception("response is empty");
        }
        HashMap hashMap = new HashMap();
        JSONObject jSONObject = new JSONObject(content);
        if (jSONObject.has("data") && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
            for (String str : strArr) {
                JSONObject optJSONObject2 = optJSONObject.optJSONObject(str);
                hashMap.put(str, optJSONObject2 == null ? "" : optJSONObject2.optString("url"));
            }
        }
        return hashMap;
    }

    public void a() {
        IHttpRequest iHttpRequest = this.d;
        if (iHttpRequest != null) {
            iHttpRequest.cancel();
            this.d = null;
        }
    }

    public void a(ICallbackWith<String> iCallbackWith) {
        this.c = iCallbackWith;
    }

    public final void a(String str) {
        h.b("dumixres fail: " + str);
        gd.a(new b(str));
    }

    public void a(String[] strArr, ICallbackWith<Map<String, String>> iCallbackWith) {
        IHttpRequest newRequest = HttpFactory.newRequest();
        if (newRequest == null) {
            a("current dumix sdk is not support http request");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append(strArr[i]);
        }
        newRequest.setMethod("POST").setUrl(id.f6987a + "/ar-client/get_library").addFormField(HttpConstants.HTTP_ENGINE_VERSION, Integer.valueOf(o.a())).addFormField("os", "android").addFormField("business", sb.toString()).addFormField(HttpConstants.OS_CPU_ABI, Build.CPU_ABI);
        newRequest.enqueue(new a(iCallbackWith, strArr));
        this.d = newRequest;
    }

    public void b() {
        this.c = null;
        a();
    }

    public void b(String str, ICallback iCallback, IProgressCallback iProgressCallback) {
        IHttpRequest iHttpRequest = this.d;
        if (iHttpRequest != null) {
            iHttpRequest.cancel();
        }
        this.d = a(str, iCallback, iProgressCallback);
    }
}
