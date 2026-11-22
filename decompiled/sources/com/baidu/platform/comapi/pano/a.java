package com.baidu.platform.comapi.pano;

import android.net.Uri;
import android.text.TextUtils;
import com.baidu.mapapi.http.AsyncHttpClient;
import com.baidu.mapapi.http.HttpClient;
import com.baidu.mapsdkplatform.comjni.util.AppMD5;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PanoHttpUtil.java */
/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    AsyncHttpClient f8662a = new AsyncHttpClient();

    /* compiled from: PanoHttpUtil.java */
    /* renamed from: com.baidu.platform.comapi.pano.a$a, reason: collision with other inner class name */
    class C0402a extends HttpClient.ProtoResultCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f8663a;

        C0402a(b bVar) {
            this.f8663a = bVar;
        }

        @Override // com.baidu.mapapi.http.HttpClient.ProtoResultCallback
        public void onFailed(HttpClient.HttpStateError httpStateError) {
            this.f8663a.a(httpStateError);
        }

        @Override // com.baidu.mapapi.http.HttpClient.ProtoResultCallback
        public void onSuccess(String str) {
            this.f8663a.a((b) a.this.a(str));
        }
    }

    /* compiled from: PanoHttpUtil.java */
    public interface b<T> {
        void a(HttpClient.HttpStateError httpStateError);

        void a(T t);
    }

    public void a(String str, b<com.baidu.platform.comapi.pano.b> bVar) {
        Uri.Builder builder = new Uri.Builder();
        if (HttpClient.isHttpsEnable) {
            builder.scheme("https");
        } else {
            builder.scheme("http");
        }
        builder.encodedAuthority("api.map.baidu.com");
        builder.path("/sdkproxy/lbs_androidsdk/pano/v1/");
        a(builder, DownloadCommon.DOWNLOAD_REPORT_QUERY_TIMEOUT, "poi");
        a(builder, "uid", str);
        a(builder, "action", "0");
        String authToken = HttpClient.getAuthToken();
        if (authToken == null) {
            bVar.a((b<com.baidu.platform.comapi.pano.b>) new com.baidu.platform.comapi.pano.b(PanoStateError.PANO_NO_TOKEN));
            return;
        }
        a(builder, "token", authToken);
        this.f8662a.get(a(builder), new C0402a(bVar));
    }

    private void a(Uri.Builder builder, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    private String a(Uri.Builder builder) {
        Uri.Builder buildUpon = Uri.parse(builder.build().toString() + HttpClient.getPhoneInfo()).buildUpon();
        buildUpon.appendQueryParameter("sign", AppMD5.getSignMD5String(buildUpon.build().getEncodedQuery()));
        return buildUpon.build().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.baidu.platform.comapi.pano.b a(String str) {
        if (str != null && !str.equals("")) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject optJSONObject = jSONObject.optJSONObject("result");
                if (optJSONObject == null) {
                    return new com.baidu.platform.comapi.pano.b(PanoStateError.PANO_NOT_FOUND);
                }
                if (optJSONObject.optInt("error") == 0) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("content");
                    if (optJSONArray == null) {
                        return new com.baidu.platform.comapi.pano.b(PanoStateError.PANO_NOT_FOUND);
                    }
                    com.baidu.platform.comapi.pano.b bVar = null;
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject2 = optJSONArray.optJSONObject(i).optJSONObject("poiinfo");
                        if (optJSONObject2 != null) {
                            bVar = new com.baidu.platform.comapi.pano.b(PanoStateError.PANO_NO_ERROR);
                            bVar.a(optJSONObject2.optString("PID"));
                            bVar.a(optJSONObject2.optInt("hasstreet"));
                        }
                    }
                    return bVar;
                }
                return new com.baidu.platform.comapi.pano.b(PanoStateError.PANO_UID_ERROR);
            } catch (JSONException e) {
                e.printStackTrace();
                return new com.baidu.platform.comapi.pano.b(PanoStateError.PANO_NOT_FOUND);
            }
        }
        return new com.baidu.platform.comapi.pano.b(PanoStateError.PANO_NOT_FOUND);
    }
}
