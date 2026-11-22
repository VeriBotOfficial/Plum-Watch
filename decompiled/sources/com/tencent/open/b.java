package com.tencent.open;

import android.gov.nist.core.Separators;
import android.net.Uri;
import android.webkit.WebView;
import com.tencent.open.log.SLog;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    protected HashMap<String, C0895b> f13630a = new HashMap<>();

    /* compiled from: ProGuard */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        protected WeakReference<WebView> f13632a;
        protected long b;
        protected String c;

        public a(WebView webView, long j, String str) {
            this.f13632a = new WeakReference<>(webView);
            this.b = j;
            this.c = str;
        }

        public void a(Object obj) {
            String obj2;
            WebView webView = this.f13632a.get();
            if (webView == null) {
                return;
            }
            if (obj instanceof String) {
                obj2 = Separators.QUOTE + ((Object) ((String) obj).replace("\\", "\\\\").replace(Separators.QUOTE, "\\'")) + Separators.QUOTE;
            } else if ((obj instanceof Number) || (obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Double) || (obj instanceof Float)) {
                obj2 = obj.toString();
            } else if (!(obj instanceof Boolean)) {
                obj2 = "'undefined'";
            } else {
                obj2 = obj.toString();
            }
            webView.loadUrl("javascript:window.JsBridge&&JsBridge.callback(" + this.b + ",{'r':0,'result':" + obj2 + "});");
        }

        public void a() {
            WebView webView = this.f13632a.get();
            if (webView == null) {
                return;
            }
            webView.loadUrl("javascript:window.JsBridge&&JsBridge.callback(" + this.b + ",{'r':1,'result':'no such method'})");
        }

        public void a(String str) {
            WebView webView = this.f13632a.get();
            if (webView != null) {
                webView.loadUrl("javascript:" + str);
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.open.b$b, reason: collision with other inner class name */
    public static class C0895b {
        public boolean customCallback() {
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x012a, code lost:
        
            r22.a((java.lang.Object) null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x012d, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void call(java.lang.String r20, java.util.List<java.lang.String> r21, com.tencent.open.b.a r22) {
            /*
                Method dump skipped, instructions count: 333
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.open.b.C0895b.call(java.lang.String, java.util.List, com.tencent.open.b$a):void");
        }
    }

    public void a(C0895b c0895b, String str) {
        this.f13630a.put(str, c0895b);
    }

    public void a(String str, String str2, List<String> list, a aVar) {
        SLog.v("openSDK_LOG.JsBridge", "getResult---objName = " + str + " methodName = " + str2);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                list.set(i, URLDecoder.decode(list.get(i), "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        C0895b c0895b = this.f13630a.get(str);
        if (c0895b != null) {
            SLog.d("openSDK_LOG.JsBridge", "call----");
            c0895b.call(str2, list, aVar);
        } else {
            SLog.d("openSDK_LOG.JsBridge", "not call----objName NOT FIND");
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public boolean a(WebView webView, String str) {
        SLog.v("openSDK_LOG.JsBridge", "-->canHandleUrl---url = " + str);
        if (str == null || !Uri.parse(str).getScheme().equals("jsbridge")) {
            return false;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList((str + "/#").split("/")));
        if (arrayList.size() < 6) {
            return false;
        }
        String str2 = (String) arrayList.get(2);
        String str3 = (String) arrayList.get(3);
        List<String> subList = arrayList.subList(4, arrayList.size() - 1);
        a aVar = new a(webView, 4L, str);
        webView.getUrl();
        a(str2, str3, subList, aVar);
        return true;
    }
}
