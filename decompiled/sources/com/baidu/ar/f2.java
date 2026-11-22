package com.baidu.ar;

import android.os.Build;
import android.util.Log;
import com.baidu.ar.constants.HttpConstants;
import com.baidu.ar.ihttp.HttpFactory;
import com.baidu.ar.ihttp.IHttpRequest;
import com.baidu.ar.ihttp.IHttpResponse;
import java.util.HashMap;

/* loaded from: classes12.dex */
public class f2 {
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

    public static String a(String str, HashMap hashMap, byte[] bArr) {
        IHttpRequest newRequest = HttpFactory.newRequest();
        if (newRequest == null) {
            return null;
        }
        newRequest.setMethod("POST").setUrl(str).setAsMultipart();
        if (hashMap != null) {
            newRequest.addPartMap(hashMap);
        }
        newRequest.addFile("image", bArr);
        newRequest.setAsMultipart();
        return a(newRequest);
    }

    public static void a(c6 c6Var) {
        HashMap hashMap = new HashMap();
        hashMap.put(HttpConstants.HTTP_ENGINE_VERSION, Integer.valueOf(o.a()));
        hashMap.put("business", "cloud_recognize");
        hashMap.put("os", "android");
        hashMap.put(HttpConstants.OS_CPU_ABI, Build.CPU_ABI);
        String d = id.d();
        Log.e("getLibrary", "http->" + d);
        try {
            HttpFactory.newRequest().setUrl(d).addHeader("Content-Type: application/x-www-form-urlencoded").setMethod("POST").addFormData(hashMap).enqueue(c6Var);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void a(c6 c6Var, byte[] bArr) {
        String e = id.e();
        Log.e("artracker", "http->" + e);
        try {
            HttpFactory.newRequest().setUrl(e).addHeader("Content-Type:application/protobuf").setMethod("POST").setBody(bArr).enqueue(c6Var);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
