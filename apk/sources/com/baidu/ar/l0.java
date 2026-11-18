package com.baidu.ar;

import java.util.HashMap;

/* JADX INFO: loaded from: classes16.dex */
public class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7057a = "animation_operation";
    public a b = new a();

    public static class a {
        public String c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f7058a = "avatar";
        public int b = 0;
        public String d = "play";
        public int e = 1;

        public int a() {
            return this.e;
        }

        public void a(int r1) {
            this.e = r1;
        }

        public void a(String str) {
            this.c = str;
        }

        public String b() {
            return this.c;
        }

        public void b(int r1) {
            this.b = r1;
        }

        public void b(String str) {
            this.d = str;
        }

        public String c() {
            return this.f7058a;
        }

        public String d() {
            return this.d;
        }

        public int e() {
            return this.b;
        }
    }

    public l0 a(int r2) {
        this.b.a(r2);
        return this;
    }

    public l0 a(String str) {
        this.b.a(str);
        return this;
    }

    public HashMap<String, Object> a() {
        HashMap<String, Object> map = new HashMap<>();
        map.put(com.anythink.expressad.foundation.g.g.a.b.aS, this.f7057a);
        HashMap map2 = new HashMap();
        map2.put("node", this.b.c());
        map2.put("repeat_count", Integer.valueOf(this.b.e()));
        map2.put("chip", this.b.b());
        map2.put("operation", this.b.d());
        map2.put("anim_or_emotion", Integer.valueOf(this.b.a()));
        map.put("event_data", map2);
        return map;
    }

    public l0 b(int r2) {
        this.b.b(r2);
        return this;
    }

    public l0 b(String str) {
        this.b.b(str);
        return this;
    }
}
