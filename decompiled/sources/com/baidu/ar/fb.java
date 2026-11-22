package com.baidu.ar;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.ar.arplay.core.message.ARPMessage;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes12.dex */
public class fb {

    /* renamed from: a, reason: collision with root package name */
    public Context f6924a;

    public fb(Context context) {
        this.f6924a = (Context) new WeakReference(context).get();
    }

    public static void a(String str, int i) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("id", 9002);
        hashMap.put("request_id", str);
        hashMap.put("status", Integer.valueOf(i));
        ARPMessage.getInstance().sendMessage(1902, hashMap);
    }

    public static void a(String str, String str2) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("id", 9003);
        hashMap.put("request_id", str);
        hashMap.put("data", str2);
        ARPMessage.getInstance().sendMessage(1902, hashMap);
    }

    public void a(HashMap<String, Object> hashMap) {
        String str = (String) hashMap.get("request_id");
        if (TextUtils.isEmpty(str)) {
            h.b("requestId can not be null!");
            return;
        }
        String str2 = (String) hashMap.get("request_method");
        String str3 = (String) hashMap.get("url");
        String str4 = (String) hashMap.get("content");
        if (!a()) {
            a(str, 1);
            return;
        }
        if (str3 == null || !str3.contains("https://")) {
            a(str, 2);
            return;
        }
        if (str2 == null) {
            a(str, 2);
            return;
        }
        if ("get".equals(str2) || "GET".equals(str2)) {
            a(str, n5.a(str3));
        } else if ("post".equals(str2) || "POST".equals(str2)) {
            a(str, n5.a(str3, str4));
        } else {
            a(str, 2);
        }
    }

    public boolean a() {
        Context context = this.f6924a;
        if (context != null) {
            return m9.e(context);
        }
        return false;
    }
}
