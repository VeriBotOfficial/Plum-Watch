package com.baidu.ar;

import java.util.HashMap;

/* loaded from: classes12.dex */
public class l0 {

    /* renamed from: a, reason: collision with root package name */
    public String f7057a = "animation_operation";
    public a b = new a();

    public static class a {
        public String c;

        /* renamed from: a, reason: collision with root package name */
        public String f7058a = "avatar";
        public int b = 0;
        public String d = "play";
        public int e = 1;

        public int a() {
            return this.e;
        }

        public void a(int i) {
            this.e = i;
        }

        public void a(String str) {
            this.c = str;
        }

        public String b() {
            return this.c;
        }

        public void b(int i) {
            this.b = i;
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

    public l0 a(int i) {
        this.b.a(i);
        return this;
    }

    public l0 a(String str) {
        this.b.a(str);
        return this;
    }

    public HashMap<String, Object> a() {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(com.anythink.expressad.foundation.g.g.a.b.aS, this.f7057a);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("node", this.b.c());
        hashMap2.put("repeat_count", Integer.valueOf(this.b.e()));
        hashMap2.put("chip", this.b.b());
        hashMap2.put("operation", this.b.d());
        hashMap2.put("anim_or_emotion", Integer.valueOf(this.b.a()));
        hashMap.put("event_data", hashMap2);
        return hashMap;
    }

    public l0 b(int i) {
        this.b.b(i);
        return this;
    }

    public l0 b(String str) {
        this.b.b(str);
        return this;
    }
}
