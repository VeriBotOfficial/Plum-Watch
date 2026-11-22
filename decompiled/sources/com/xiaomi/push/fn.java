package com.xiaomi.push;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class fn extends fp {

    /* renamed from: a, reason: collision with root package name */
    private a f14593a;

    /* renamed from: a, reason: collision with other field name */
    private final Map<String, String> f541a;

    public String b() {
        return null;
    }

    public fn() {
        this.f14593a = a.f14594a;
        this.f541a = new HashMap();
    }

    public fn(Bundle bundle) {
        super(bundle);
        this.f14593a = a.f14594a;
        this.f541a = new HashMap();
        if (bundle.containsKey("ext_iq_type")) {
            this.f14593a = a.a(bundle.getString("ext_iq_type"));
        }
    }

    public synchronized void a(Map<String, String> map) {
        this.f541a.putAll(map);
    }

    /* renamed from: a, reason: collision with other method in class */
    public a m12163a() {
        return this.f14593a;
    }

    public void a(a aVar) {
        if (aVar == null) {
            this.f14593a = a.f14594a;
        } else {
            this.f14593a = aVar;
        }
    }

    @Override // com.xiaomi.push.fp
    public Bundle a() {
        Bundle a2 = super.a();
        a aVar = this.f14593a;
        if (aVar != null) {
            a2.putString("ext_iq_type", aVar.toString());
        }
        return a2;
    }

    @Override // com.xiaomi.push.fp
    /* renamed from: a, reason: collision with other method in class */
    public String mo12164a() {
        StringBuilder sb = new StringBuilder("<iq ");
        if (j() != null) {
            sb.append("id=\"" + j() + "\" ");
        }
        if (l() != null) {
            sb.append("to=\"").append(fy.a(l())).append("\" ");
        }
        if (m() != null) {
            sb.append("from=\"").append(fy.a(m())).append("\" ");
        }
        if (k() != null) {
            sb.append("chid=\"").append(fy.a(k())).append("\" ");
        }
        for (Map.Entry<String, String> entry : this.f541a.entrySet()) {
            sb.append(fy.a(entry.getKey())).append("=\"");
            sb.append(fy.a(entry.getValue())).append("\" ");
        }
        if (this.f14593a == null) {
            sb.append("type=\"get\">");
        } else {
            sb.append("type=\"").append(m12163a()).append("\">");
        }
        String b = b();
        if (b != null) {
            sb.append(b);
        }
        sb.append(o());
        ft a2 = a();
        if (a2 != null) {
            sb.append(a2.m12168a());
        }
        sb.append("</iq>");
        return sb.toString();
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f14594a = new a("get");
        public static final a b = new a("set");
        public static final a c = new a("result");
        public static final a d = new a("error");
        public static final a e = new a(com.heytap.mcssdk.constant.b.y);

        /* renamed from: a, reason: collision with other field name */
        private String f542a;

        public static a a(String str) {
            if (str == null) {
                return null;
            }
            String lowerCase = str.toLowerCase();
            a aVar = f14594a;
            if (aVar.toString().equals(lowerCase)) {
                return aVar;
            }
            a aVar2 = b;
            if (aVar2.toString().equals(lowerCase)) {
                return aVar2;
            }
            a aVar3 = d;
            if (aVar3.toString().equals(lowerCase)) {
                return aVar3;
            }
            a aVar4 = c;
            if (aVar4.toString().equals(lowerCase)) {
                return aVar4;
            }
            a aVar5 = e;
            if (aVar5.toString().equals(lowerCase)) {
                return aVar5;
            }
            return null;
        }

        private a(String str) {
            this.f542a = str;
        }

        public String toString() {
            return this.f542a;
        }
    }
}
