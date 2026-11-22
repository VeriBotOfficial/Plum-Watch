package com.xiaomi.push;

import android.gov.nist.core.Separators;
import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes4.dex */
public class fo extends fp {

    /* renamed from: a, reason: collision with root package name */
    private boolean f14595a;
    private String b;

    /* renamed from: b, reason: collision with other field name */
    private boolean f543b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;

    public fo() {
        this.b = null;
        this.c = null;
        this.f14595a = false;
        this.i = "";
        this.j = "";
        this.k = "";
        this.l = "";
        this.f543b = false;
    }

    public fo(Bundle bundle) {
        super(bundle);
        this.b = null;
        this.c = null;
        this.f14595a = false;
        this.i = "";
        this.j = "";
        this.k = "";
        this.l = "";
        this.f543b = false;
        this.b = bundle.getString("ext_msg_type");
        this.d = bundle.getString("ext_msg_lang");
        this.c = bundle.getString("ext_msg_thread");
        this.e = bundle.getString("ext_msg_sub");
        this.f = bundle.getString("ext_msg_body");
        this.g = bundle.getString("ext_body_encode");
        this.h = bundle.getString("ext_msg_appid");
        this.f14595a = bundle.getBoolean("ext_msg_trans", false);
        this.f543b = bundle.getBoolean("ext_msg_encrypt", false);
        this.i = bundle.getString("ext_msg_seq");
        this.j = bundle.getString("ext_msg_mseq");
        this.k = bundle.getString("ext_msg_fseq");
        this.l = bundle.getString("ext_msg_status");
    }

    public String b() {
        return this.b;
    }

    public void a(boolean z) {
        this.f14595a = z;
    }

    public String c() {
        return this.h;
    }

    public void a(String str) {
        this.h = str;
    }

    public String d() {
        return this.i;
    }

    public void b(String str) {
        this.i = str;
    }

    public String e() {
        return this.j;
    }

    public void c(String str) {
        this.j = str;
    }

    public String f() {
        return this.k;
    }

    public void d(String str) {
        this.k = str;
    }

    public String g() {
        return this.l;
    }

    public void e(String str) {
        this.l = str;
    }

    public void f(String str) {
        this.b = str;
    }

    public void b(boolean z) {
        this.f543b = z;
    }

    public void g(String str) {
        this.e = str;
    }

    public void h(String str) {
        this.f = str;
    }

    public void a(String str, String str2) {
        this.f = str;
        this.g = str2;
    }

    public void i(String str) {
        this.c = str;
    }

    public String h() {
        return this.d;
    }

    public void j(String str) {
        this.d = str;
    }

    @Override // com.xiaomi.push.fp
    public Bundle a() {
        Bundle a2 = super.a();
        if (!TextUtils.isEmpty(this.b)) {
            a2.putString("ext_msg_type", this.b);
        }
        String str = this.d;
        if (str != null) {
            a2.putString("ext_msg_lang", str);
        }
        String str2 = this.e;
        if (str2 != null) {
            a2.putString("ext_msg_sub", str2);
        }
        String str3 = this.f;
        if (str3 != null) {
            a2.putString("ext_msg_body", str3);
        }
        if (!TextUtils.isEmpty(this.g)) {
            a2.putString("ext_body_encode", this.g);
        }
        String str4 = this.c;
        if (str4 != null) {
            a2.putString("ext_msg_thread", str4);
        }
        String str5 = this.h;
        if (str5 != null) {
            a2.putString("ext_msg_appid", str5);
        }
        if (this.f14595a) {
            a2.putBoolean("ext_msg_trans", true);
        }
        if (!TextUtils.isEmpty(this.i)) {
            a2.putString("ext_msg_seq", this.i);
        }
        if (!TextUtils.isEmpty(this.j)) {
            a2.putString("ext_msg_mseq", this.j);
        }
        if (!TextUtils.isEmpty(this.k)) {
            a2.putString("ext_msg_fseq", this.k);
        }
        if (this.f543b) {
            a2.putBoolean("ext_msg_encrypt", true);
        }
        if (!TextUtils.isEmpty(this.l)) {
            a2.putString("ext_msg_status", this.l);
        }
        return a2;
    }

    @Override // com.xiaomi.push.fp
    /* renamed from: a */
    public String mo12164a() {
        ft a2;
        StringBuilder sb = new StringBuilder("<message");
        if (p() != null) {
            sb.append(" xmlns=\"").append(p()).append("\"");
        }
        if (this.d != null) {
            sb.append(" xml:lang=\"").append(h()).append("\"");
        }
        if (j() != null) {
            sb.append(" id=\"").append(j()).append("\"");
        }
        if (l() != null) {
            sb.append(" to=\"").append(fy.a(l())).append("\"");
        }
        if (!TextUtils.isEmpty(d())) {
            sb.append(" seq=\"").append(d()).append("\"");
        }
        if (!TextUtils.isEmpty(e())) {
            sb.append(" mseq=\"").append(e()).append("\"");
        }
        if (!TextUtils.isEmpty(f())) {
            sb.append(" fseq=\"").append(f()).append("\"");
        }
        if (!TextUtils.isEmpty(g())) {
            sb.append(" status=\"").append(g()).append("\"");
        }
        if (m() != null) {
            sb.append(" from=\"").append(fy.a(m())).append("\"");
        }
        if (k() != null) {
            sb.append(" chid=\"").append(fy.a(k())).append("\"");
        }
        if (this.f14595a) {
            sb.append(" transient=\"true\"");
        }
        if (!TextUtils.isEmpty(this.h)) {
            sb.append(" appid=\"").append(c()).append("\"");
        }
        if (!TextUtils.isEmpty(this.b)) {
            sb.append(" type=\"").append(this.b).append("\"");
        }
        if (this.f543b) {
            sb.append(" s=\"1\"");
        }
        sb.append(Separators.GREATER_THAN);
        if (this.e != null) {
            sb.append("<subject>").append(fy.a(this.e));
            sb.append("</subject>");
        }
        if (this.f != null) {
            sb.append("<body");
            if (!TextUtils.isEmpty(this.g)) {
                sb.append(" encode=\"").append(this.g).append("\"");
            }
            sb.append(Separators.GREATER_THAN).append(fy.a(this.f)).append("</body>");
        }
        if (this.c != null) {
            sb.append("<thread>").append(this.c).append("</thread>");
        }
        if ("error".equalsIgnoreCase(this.b) && (a2 = a()) != null) {
            sb.append(a2.m12168a());
        }
        sb.append(o());
        sb.append("</message>");
        return sb.toString();
    }

    @Override // com.xiaomi.push.fp
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fo foVar = (fo) obj;
            if (!super.equals(foVar)) {
                return false;
            }
            String str = this.f;
            if (str == null ? foVar.f != null : !str.equals(foVar.f)) {
                return false;
            }
            String str2 = this.d;
            if (str2 == null ? foVar.d != null : !str2.equals(foVar.d)) {
                return false;
            }
            String str3 = this.e;
            if (str3 == null ? foVar.e != null : !str3.equals(foVar.e)) {
                return false;
            }
            String str4 = this.c;
            if (str4 == null ? foVar.c != null : !str4.equals(foVar.c)) {
                return false;
            }
            if (this.b == foVar.b) {
                return true;
            }
        }
        return false;
    }

    @Override // com.xiaomi.push.fp
    public int hashCode() {
        String str = this.b;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
