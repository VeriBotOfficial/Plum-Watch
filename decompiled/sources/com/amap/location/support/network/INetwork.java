package com.amap.location.support.network;

/* loaded from: classes11.dex */
public interface INetwork {

    public interface ICallback {
        void onResponse(HttpResponse httpResponse, HttpRequest httpRequest);
    }

    void cancelRequest(HttpRequest httpRequest);

    HttpResponse get(HttpRequest httpRequest);

    void get(HttpRequest httpRequest, ICallback iCallback);

    HttpResponse post(HttpRequest httpRequest);

    void post(HttpRequest httpRequest, ICallback iCallback);
}
