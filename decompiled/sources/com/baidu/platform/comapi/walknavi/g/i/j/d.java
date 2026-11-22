package com.baidu.platform.comapi.walknavi.g.i.j;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: HttpPostTask.java */
/* loaded from: classes13.dex */
public class d extends AsyncTask<String, Void, String> implements c {

    /* renamed from: a, reason: collision with root package name */
    private String f8742a;
    f<JSONObject> b;

    public d(String str, f<JSONObject> fVar) {
        this.b = fVar;
        this.f8742a = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(String... strArr) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f8742a).openConnection();
            httpURLConnection.setConnectTimeout(20000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty(HttpHeaders.CONNECTION, "Keep-Alive");
            httpURLConnection.setRequestProperty("Content-Type", com.anythink.core.common.m.a.f3976q);
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            com.baidu.platform.comapi.walknavi.g.i.k.a.a("post params = " + strArr[0]);
            dataOutputStream.write(strArr[0].getBytes());
            dataOutputStream.flush();
            dataOutputStream.close();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            httpURLConnection.disconnect();
            return readLine;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        if (TextUtils.isEmpty(str)) {
            f<JSONObject> fVar = this.b;
            if (fVar != null) {
                fVar.a("http error! result is null");
                return;
            }
            return;
        }
        try {
            if (this.b != null) {
                this.b.onResponse(new JSONObject(str));
            }
        } catch (JSONException unused) {
        }
    }

    @Override // com.baidu.platform.comapi.walknavi.g.i.j.c
    public void a() {
        cancel(true);
        this.b = null;
    }
}
