package com.anythink.core.common.h;

import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public class am {

    /* renamed from: a, reason: collision with root package name */
    private final String f3847a;
    private Map<String, List<a>> b;
    private Map<String, Integer> c;

    public am(String str) {
        this.f3847a = str;
    }

    private String c() {
        return this.f3847a;
    }

    public final Map<String, List<a>> a() {
        return this.b;
    }

    public final void a(Map<String, List<a>> map) {
        this.b = map;
    }

    public final Map<String, Integer> b() {
        return this.c;
    }

    public final void b(Map<String, Integer> map) {
        this.c = map;
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f3848a;
        private final int b;

        public a(String str, int i) {
            this.f3848a = str;
            this.b = i;
        }

        public final String a() {
            return this.f3848a;
        }

        public final int b() {
            return this.b;
        }
    }
}
