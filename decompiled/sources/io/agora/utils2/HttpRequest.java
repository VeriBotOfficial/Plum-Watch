package io.agora.utils2;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class HttpRequest {
    private HashMap<String, String> headers = new HashMap<>();
    private Proxy httpProxy;
    private HttpAsyncTask httpTask;

    public HttpRequest(long nativeHandle, String proxy, int proxyPort) {
        this.httpTask = null;
        this.httpProxy = null;
        if (!proxy.isEmpty()) {
            this.httpProxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxy, proxyPort));
        }
        this.httpTask = new HttpAsyncTask(nativeHandle);
    }

    public void addHeader(String key, String value) {
        this.headers.put(key, value);
    }

    public boolean send(String fullUrl, String method, String user, String pass, String agent, byte[] body, int timeout_millsec) {
        HttpAsyncTaskParam httpAsyncTaskParam = new HttpAsyncTaskParam();
        httpAsyncTaskParam.fullUrl = fullUrl;
        httpAsyncTaskParam.method = method;
        httpAsyncTaskParam.user = user;
        httpAsyncTaskParam.pass = pass;
        httpAsyncTaskParam.agent = agent;
        httpAsyncTaskParam.body = body;
        httpAsyncTaskParam.httpProxy = this.httpProxy;
        httpAsyncTaskParam.headers = this.headers;
        httpAsyncTaskParam.timeout_millsec = timeout_millsec;
        this.httpTask.execute(httpAsyncTaskParam);
        return true;
    }
}
