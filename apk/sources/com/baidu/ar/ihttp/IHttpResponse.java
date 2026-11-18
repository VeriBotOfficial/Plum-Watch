package com.baidu.ar.ihttp;

import java.io.InputStream;

/* JADX INFO: loaded from: classes16.dex */
public interface IHttpResponse {
    int getCode();

    String getContent();

    int getContentLength();

    String getHeader(String str);

    String getMessage();

    InputStream getStream();

    boolean isSuccess();
}
