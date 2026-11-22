package com.baidu.ar;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.baidu.ar.arplay.core.engine.ARPScriptEnvironment;
import com.baidu.ar.ihttp.HttpFactory;
import com.baidu.ar.ihttp.IHttpRequest;
import com.baidu.ar.obr.OBRConfig;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes12.dex */
public class p9 {
    public OBRConfig b;
    public final r3 d;
    public s3 e;
    public String f;
    public String g;
    public long h = 0;
    public HashMap<String, Long> i = new HashMap<>();
    public p6 j = new b();

    /* renamed from: a, reason: collision with root package name */
    public o6 f7114a = o9.b();
    public n6 c = o9.a();

    public class a implements s3 {
        public a() {
        }

        @Override // com.baidu.ar.s3
        public List<Integer> a() {
            return Arrays.asList(8200);
        }

        @Override // com.baidu.ar.s3
        public void a(int i, int i2, HashMap<String, Object> hashMap) {
            if (i == 8200) {
                p9.this.c("OBRModule receive msg : 8200");
                p9.this.a(hashMap);
            }
        }
    }

    public class b implements p6 {
        public b() {
        }

        @Override // com.baidu.ar.p6
        public void a(String str) {
            String str2 = p9.this.g + p9.this.b(str);
            p9.this.c("OBRDownloader download success result : " + str);
            if (p9.this.c != null) {
                p9.this.c.c(str);
            }
            if (p9.this.i.get(str) != null) {
                long currentTimeMillis = System.currentTimeMillis() - ((Long) p9.this.i.get(str)).longValue();
                long j = currentTimeMillis / 1000;
                long j2 = (j / 60) % 60;
                long j3 = j % 60;
                p9.this.i.put(str, Long.valueOf(currentTimeMillis));
            }
            p9.this.a("response_obr_path", "obr_path", str2, str);
        }
    }

    public p9(Context context, r3 r3Var, OBRConfig oBRConfig) {
        this.f = null;
        this.d = r3Var;
        f();
        if (oBRConfig != null) {
            this.b = oBRConfig;
            this.f = oBRConfig.getBaseUrl();
            this.g = oBRConfig.getDirectory();
            o6 o6Var = this.f7114a;
            if (o6Var != null) {
                o6Var.a(context);
                if (oBRConfig.isLogEnable()) {
                    h.a("OBRModule", "OBRDownloader open Success");
                }
                try {
                    this.c.a(oBRConfig.getBaseUrl(), oBRConfig.getDirectory(), oBRConfig.getMaxSize());
                    if (oBRConfig.isLogEnable()) {
                        h.a("OBRModule", "OBRCache open Success");
                        this.f7114a.a(true);
                        this.c.a(true);
                    }
                } catch (Exception e) {
                    if (oBRConfig.isLogEnable()) {
                        h.a("OBRModule", "OBRCache open failed : " + e.getMessage());
                    }
                }
            }
        }
    }

    public final String a(String str) {
        return (this.b == null || this.f == null) ? str : this.f + str;
    }

    public void a() {
        o6 o6Var = this.f7114a;
        if (o6Var != null) {
            o6Var.pause();
        }
    }

    public void a(String str, p6 p6Var) {
        String b2 = b(str);
        n6 n6Var = this.c;
        if (n6Var == null || this.f7114a == null) {
            return;
        }
        if (!n6Var.a(b2)) {
            this.f7114a.a(str, this.g + b2, p6Var);
            return;
        }
        c("OBRModule download check file exist");
        if (!d(str)) {
            c("OBRModule download check file is fresh");
            p6Var.a(str);
        } else {
            c("OBRModule download check file is expired");
            this.c.b(str);
            this.f7114a.a(str, this.g + b2, p6Var);
        }
    }

    public final void a(String str, String str2, String str3, String str4) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(com.anythink.expressad.foundation.g.g.a.b.aS, str);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(str2, str3);
        hashMap2.put("url", a(str4));
        hashMap.put("event_data", hashMap2);
        c("OBRModule send message to engine : " + hashMap.toString());
        this.d.a(8100, hashMap);
    }

    public final void a(HashMap<String, Object> hashMap) {
        if (hashMap != null) {
            String str = (String) hashMap.get(com.anythink.expressad.foundation.g.g.a.b.aS);
            c("OBRModule receive msg : " + str);
            HashMap hashMap2 = (HashMap) hashMap.get("event_data");
            if (hashMap2 != null) {
                if (!TextUtils.equals(str, "engine_request_download")) {
                    TextUtils.equals(str, "engine_request_json");
                    return;
                }
                String str2 = (String) hashMap2.get("url");
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                if (TextUtils.isEmpty(str2)) {
                    c("obr empty url received form engine");
                    return;
                }
                if (str2.startsWith("icon")) {
                    return;
                }
                c("OBRModule receive download msg : " + str2);
                if (this.i.keySet().size() == 0) {
                    this.h = System.currentTimeMillis();
                }
                this.i.put(str2, Long.valueOf(System.currentTimeMillis()));
                a(str2, this.j);
            }
        }
    }

    public final boolean a(String str, String str2) {
        try {
            IHttpRequest newRequest = HttpFactory.newRequest();
            if (newRequest == null) {
                return false;
            }
            return this.c.a(newRequest.setUrl(str).setMethod("HEAD").execute().getHeader("Last-Modified"), str2);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public final String b(String str) {
        Uri parse = Uri.parse(str);
        parse.getScheme();
        parse.getAuthority();
        return parse.getPath();
    }

    public void b() {
        o9.e();
        this.b = null;
        this.f7114a = null;
        this.c = null;
        this.i.clear();
    }

    public void c() {
        o6 o6Var = this.f7114a;
        if (o6Var != null) {
            o6Var.resume();
        }
    }

    public final void c(String str) {
        OBRConfig oBRConfig = this.b;
        if (oBRConfig == null || !oBRConfig.isLogEnable()) {
            return;
        }
        h.a("OBRModule", str);
    }

    public void d() {
        int i = 0;
        long j = 0;
        for (String str : this.i.keySet()) {
            i++;
            long longValue = this.i.get(str).longValue();
            j += longValue;
            long j2 = longValue / 1000;
            c("下载（" + str + "）所需时间：" + ((int) ((j2 / 60) % 60)) + ":" + ((int) (j2 % 60)) + "." + (longValue % 1000));
        }
        long j3 = j / i;
        long j4 = j3 / 1000;
        c("下载（" + i + "）个模型所需平均时间：" + ((int) ((j4 / 60) % 60)) + ":" + ((int) (j4 % 60)) + "." + (j3 % 1000));
        if (this.h != 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.h;
            long j5 = currentTimeMillis / 1000;
            c("下载（" + i + "）个模型总共需要时间：" + ((int) ((j5 / 60) % 60)) + ":" + ((int) (j5 % 60)) + "." + (currentTimeMillis % 1000));
        }
        this.i.clear();
    }

    public final boolean d(String str) {
        if (this.c.d(str)) {
            String a2 = a(str);
            if (!TextUtils.isEmpty(a2)) {
                return a(a2, str);
            }
        }
        return false;
    }

    public void e() {
        HashMap hashMap = new HashMap();
        hashMap.put("gesture_scroll", "interaction_obr_move");
        hashMap.put("gesture_two_finger_scroll", "interaction_obr_rotate");
        hashMap.put("gesture_two_finger_rotate", "interaction_obr_rotate");
        hashMap.put("gesture_two_finger_pinch", "interaction_obr_scale_down");
        hashMap.put("gesture_two_finger_unpinch", "interaction_obr_scale_up");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("continuous_mapping", hashMap);
        ARPScriptEnvironment.getInstance().setSharedEnvironmentKV("interactioninfo", hashMap2);
    }

    public final void f() {
        a aVar = new a();
        this.e = aVar;
        r3 r3Var = this.d;
        if (r3Var != null) {
            r3Var.a(aVar);
        }
    }
}
