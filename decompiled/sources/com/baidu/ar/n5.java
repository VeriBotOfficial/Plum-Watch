package com.baidu.ar;

import com.baidu.ar.ihttp.HttpFactory;
import com.baidu.ar.ihttp.IHttpRequest;
import com.baidu.ar.ihttp.IHttpResponse;

/* loaded from: classes12.dex */
public class n5 {
    public static String a(IHttpRequest iHttpRequest) {
        if (iHttpRequest == null) {
            return null;
        }
        try {
            IHttpResponse execute = iHttpRequest.execute();
            if (execute.isSuccess()) {
                return execute.getContent();
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String a(String str) {
        IHttpRequest newRequest = HttpFactory.newRequest();
        if (newRequest == null) {
            return null;
        }
        newRequest.setMethod("GET").setUrl(str);
        return a(newRequest);
    }

    public static String a(String str, String str2) {
        IHttpRequest newRequest = HttpFactory.newRequest();
        if (newRequest == null) {
            return null;
        }
        newRequest.setMethod("POST").setUrl(str).addHeader("Content-Type: application/x-www-form-urlencoded").setBody(str2);
        return a(newRequest);
    }
}
