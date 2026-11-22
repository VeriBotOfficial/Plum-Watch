package com.baidu.mapapi.http;

import com.baidu.mapapi.http.HttpClient;
import com.baidu.mapsdkplatform.comapi.util.PermissionCheck;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes13.dex */
public class AsyncHttpClient {

    /* renamed from: a, reason: collision with root package name */
    private int f7849a = 10000;
    private int b = 10000;
    private ExecutorService c = Executors.newCachedThreadPool();

    class a extends b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ HttpClient.ProtoResultCallback f7850a;
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(HttpClient.ProtoResultCallback protoResultCallback, String str) {
            super(null);
            this.f7850a = protoResultCallback;
            this.b = str;
        }

        @Override // com.baidu.mapapi.http.AsyncHttpClient.b
        public void a() {
            HttpClient httpClient = new HttpClient("GET", this.f7850a);
            httpClient.setMaxTimeOut(AsyncHttpClient.this.f7849a);
            httpClient.setReadTimeOut(AsyncHttpClient.this.b);
            httpClient.request(this.b);
        }
    }

    private static abstract class b implements Runnable {
        private b() {
        }

        public abstract void a();

        @Override // java.lang.Runnable
        public void run() {
            a();
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public void get(String str, HttpClient.ProtoResultCallback protoResultCallback) {
        if (str == null) {
            throw new IllegalArgumentException("URI cannot be null");
        }
        this.c.submit(new a(protoResultCallback, str));
    }

    protected boolean isAuthorized() {
        int permissionCheck = PermissionCheck.permissionCheck();
        return permissionCheck == 0 || permissionCheck == 602 || permissionCheck == 601;
    }
}
