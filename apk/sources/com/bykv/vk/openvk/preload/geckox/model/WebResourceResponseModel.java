package com.bykv.vk.openvk.preload.geckox.model;

import android.webkit.WebResourceResponse;

/* JADX INFO: loaded from: classes15.dex */
public class WebResourceResponseModel {
    public static final int ERROR_DEFAULT = -1;
    public static final int ERROR_INTERCEPT = 1;
    public static final int ERROR_NOT_FIND_BY_RESOURCE = 2;
    int errorType;
    WebResourceResponse webResourceResponse;

    public WebResourceResponseModel(int r1, WebResourceResponse webResourceResponse) {
        this.errorType = r1;
        this.webResourceResponse = webResourceResponse;
    }

    public int getMsg() {
        return this.errorType;
    }

    public void setMsg(int r1) {
        this.errorType = r1;
    }

    public WebResourceResponse getWebResourceResponse() {
        return this.webResourceResponse;
    }

    public void setWebResourceResponse(WebResourceResponse webResourceResponse) {
        this.webResourceResponse = webResourceResponse;
    }
}
