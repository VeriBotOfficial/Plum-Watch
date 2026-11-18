package com.anythink.core.common.m.a;

import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f3988a;
    public String b;
    public byte[] c;
    public String d;
    public Map<String, String> e;

    /* synthetic */ i(a aVar, byte b) {
        this(aVar);
    }

    private i(a aVar) {
        this.f3988a = aVar.f3989a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f3989a;
        private String b;
        private byte[] c;
        private String d;
        private Map<String, String> e;

        public final a a(String str) {
            this.f3989a = str;
            return this;
        }

        public final a b(String str) {
            this.b = str;
            return this;
        }

        public final a a(byte[] bArr) {
            this.c = bArr;
            return this;
        }

        public final a c(String str) {
            this.d = str;
            return this;
        }

        public final a a(Map<String, String> map) {
            this.e = map;
            return this;
        }

        public final i a() {
            return new i(this, (byte) 0);
        }
    }
}
