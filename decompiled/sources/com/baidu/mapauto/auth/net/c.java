package com.baidu.mapauto.auth.net;

import com.baidu.mapauto.auth.AuthCore;
import com.wakeup.commponent.module.baidu.BaiduMapToolManager;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;

/* loaded from: classes13.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f8251a;
    public String b;
    public Map<String, Object> c;
    public HostnameVerifier d;

    public static final class a {
        public String b;
        public HostnameVerifier d;

        /* renamed from: a, reason: collision with root package name */
        public int f8252a = 5000;
        public final HashMap c = new HashMap();

        public final a a(AuthCore.a aVar) {
            this.d = aVar;
            return this;
        }

        public final a a(HashMap hashMap) {
            this.c.clear();
            this.c.putAll(hashMap);
            return this;
        }

        public final c a() {
            return new c(this.b, this.f8252a, this.c, this.d);
        }

        public final a b() {
            this.b = BaiduMapToolManager.searchHost;
            return this;
        }

        public final a c() {
            this.f8252a = 10000;
            return this;
        }

        public final a d() {
            return this;
        }
    }

    public c(String str, int i, HashMap hashMap, HostnameVerifier hostnameVerifier) {
        this.b = str;
        this.f8251a = i;
        this.c = hashMap;
        this.d = hostnameVerifier;
    }
}
