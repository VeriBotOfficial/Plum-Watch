package com.baidu.platform.comapi.wnplatform.e;

import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: RoutePlanSearchParams.java */
/* loaded from: classes13.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private String f8895a;
    private HashMap<String, String> b = new LinkedHashMap(32);
    private HashMap<String, String> c = new LinkedHashMap(32);
    private int d = -1;
    private boolean e = true;
    private b f = b.GET;
    private a g = a.PROTOBUF;
    private int h = -1;
    private boolean i = true;
    private boolean j = true;
    private boolean k = true;
    private boolean l = false;
    private boolean m = false;
    private boolean n = false;
    private int o;

    /* compiled from: RoutePlanSearchParams.java */
    public enum a {
        PROTOBUF(com.anythink.expressad.f.a.b.av),
        JSON(BodyData.TYPE_JSON),
        UNKNOWN("unknown");

        private String e;

        a(String str) {
            this.e = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.e;
        }
    }

    /* compiled from: RoutePlanSearchParams.java */
    public enum b {
        GET("get"),
        POST("post");

        private String d;

        b(String str) {
            this.d = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.d;
        }
    }

    public e() {
        this.f8895a = "";
        this.f8895a = "https://newclient.map.baidu.com/client/phpui2/";
    }

    public e a(String str, String str2) {
        this.b.put(str, str2);
        return this;
    }

    public e b(int i) {
        this.d = i;
        return this;
    }

    public String toString() {
        com.baidu.platform.comapi.wnplatform.e.f.a aVar = new com.baidu.platform.comapi.wnplatform.e.f.a();
        aVar.f();
        int indexOf = this.f8895a.indexOf(63);
        if (indexOf != -1) {
            String[] split = this.f8895a.substring(indexOf + 1).split("&");
            if (split != null) {
                int length = split.length;
                for (int i = 0; i < length; i++) {
                    int indexOf2 = split[i].indexOf(61);
                    if (indexOf2 != -1) {
                        a(split[i].substring(0, indexOf2), split[i].substring(indexOf2 + 1));
                    }
                }
            }
            this.f8895a = this.f8895a.substring(0, indexOf);
        }
        aVar.a("domain").b(this.f8895a);
        if (this.m) {
            aVar.a("OFFLINE_SEARCH").a(1);
        }
        if (this.b.size() > 0 || (this.f == b.GET && this.c.size() > 0)) {
            aVar.a("uri_param").f();
            for (Map.Entry<String, String> entry : this.b.entrySet()) {
                aVar.a(entry.getKey()).b(entry.getValue());
            }
            if (this.f == b.GET && this.c.size() > 0) {
                for (Map.Entry<String, String> entry2 : this.c.entrySet()) {
                    aVar.a(entry2.getKey()).b(entry2.getValue());
                }
            }
            aVar.d();
        }
        if (this.f == b.POST && this.c.size() > 0) {
            aVar.a("query_param").f();
            for (Map.Entry<String, String> entry3 : this.c.entrySet()) {
                aVar.a(entry3.getKey()).b(entry3.getValue());
            }
            aVar.d();
        }
        aVar.a("ext_param").f();
        aVar.a("data_format").a(this.g);
        aVar.a("b_cache").a(this.e);
        aVar.a("method").a(this.f);
        aVar.a("businessid").a(this.o);
        aVar.a("b_user_param").a(this.i);
        aVar.a("b_sign").a(this.j);
        aVar.a("b_encode").a(this.k);
        aVar.d();
        aVar.d();
        return aVar.toString();
    }

    public e a(String str, int i) {
        return a(str, String.valueOf(i));
    }

    public void b(boolean z) {
        this.l = z;
    }

    public e a(boolean z) {
        this.e = z;
        return this;
    }

    public e a(a aVar) {
        if (aVar == null) {
            return this;
        }
        this.g = aVar;
        return this;
    }

    public e a(b bVar) {
        if (bVar == null) {
            return this;
        }
        this.f = bVar;
        return this;
    }

    public void a(int i) {
        this.o = i;
    }
}
