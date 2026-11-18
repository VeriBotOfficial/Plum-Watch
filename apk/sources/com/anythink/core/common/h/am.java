package com.anythink.core.common.h;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class am {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3849a;
    private Map<String, List<a>> b;
    private Map<String, Integer> c;

    public am(String str) {
        this.f3849a = str;
    }

    private String c() {
        return this.f3849a;
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

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f3850a;
        private final int b;

        public a(String str, int r2) {
            this.f3850a = str;
            this.b = r2;
        }

        public final String a() {
            return this.f3850a;
        }

        public final int b() {
            return this.b;
        }
    }
}
