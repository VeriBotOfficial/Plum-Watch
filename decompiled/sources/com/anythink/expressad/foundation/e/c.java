package com.anythink.expressad.foundation.e;

import android.text.TextUtils;
import com.anythink.expressad.foundation.d.d;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class c implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4814a = "FailureReason";
    private int b;
    private int c;
    private String d;
    private Throwable e;
    private d f;
    private String g;
    private String h;
    private boolean i;
    private int j = -1;
    private String k;
    private HashMap<Object, Object> l;
    private int m;
    private String n;
    private String o;
    private String p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f4815q;
    private String r;
    private String s;

    public c(int i) {
        this.b = i;
        this.c = b.b(i);
    }

    public c(int i, String str) {
        this.b = i;
        if (!TextUtils.isEmpty(str)) {
            a(com.anythink.expressad.foundation.g.g.a.b.M, str);
        }
        this.d = str;
        this.c = b.b(i);
    }

    public c(int i, int i2, String str) {
        if (!TextUtils.isEmpty(str)) {
            a(com.anythink.expressad.foundation.g.g.a.b.M, str);
            this.d = str;
        } else {
            this.d = b.a(i2);
        }
        this.m = i;
        this.c = b.b(i2);
    }

    private c(int i, Throwable th, d dVar) {
        this.b = i;
        this.e = th;
        this.f = dVar;
        this.c = b.b(i);
    }

    private c(int i, String str, Throwable th, d dVar) {
        this.b = i;
        this.d = str;
        this.e = th;
        this.f = dVar;
        this.c = b.b(i);
    }

    private int g() {
        return this.b;
    }

    private void a(int i) {
        this.b = i;
    }

    public final String a() {
        String str;
        int i;
        if (TextUtils.isEmpty(this.d)) {
            str = "";
        } else {
            str = this.d;
        }
        if (TextUtils.isEmpty(str) && (i = this.b) != -1) {
            str = b.a(i);
        }
        Throwable th = this.e;
        if (th == null) {
            return str;
        }
        String message = th.getMessage();
        return !TextUtils.isEmpty(message) ? str + " # " + message : str;
    }

    private String d(String str) {
        String str2 = this.b + " # ";
        int i = this.b;
        if (i != -1) {
            str2 = b.a(i);
        }
        if (!TextUtils.isEmpty(this.d)) {
            str2 = str2 + " # " + this.d;
        }
        Throwable th = this.e;
        if (th != null) {
            String message = th.getMessage();
            if (!TextUtils.isEmpty(message)) {
                str2 = str2 + " # " + message;
            }
        }
        return !TextUtils.isEmpty(str) ? str2 + " # " + str : str2;
    }

    public final void a(String str) {
        this.d = str;
    }

    private Throwable h() {
        return this.e;
    }

    public final void a(Throwable th) {
        this.e = th;
    }

    public final d b() {
        return this.f;
    }

    public final void a(d dVar) {
        this.f = dVar;
    }

    public final boolean c() {
        return this.i;
    }

    public final void a(boolean z) {
        this.i = z;
    }

    public final int d() {
        return this.c;
    }

    private void b(int i) {
        this.c = i;
    }

    private String i() {
        if (TextUtils.isEmpty(this.g)) {
            return "";
        }
        return this.g;
    }

    private void e(String str) {
        this.g = str;
    }

    private String j() {
        return this.h;
    }

    private void f(String str) {
        this.h = str;
    }

    private void a(Object obj, Object obj2) {
        if (this.l == null) {
            this.l = new HashMap<>();
        }
        this.l.put(obj, obj2);
    }

    private Object a(Object obj) {
        HashMap<Object, Object> hashMap = this.l;
        if (hashMap != null && hashMap.containsKey(obj)) {
            return this.l.get(obj);
        }
        return null;
    }

    private String k() {
        if (this.l == null) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<Object, Object> entry : this.l.entrySet()) {
                jSONObject.put(entry.getKey().toString(), entry.getValue());
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return "";
    }

    public final int e() {
        return this.j;
    }

    private void c(int i) {
        this.j = i;
    }

    public final String f() {
        return this.k;
    }

    private void g(String str) {
        this.k = str;
    }

    private int l() {
        return this.m;
    }

    private void d(int i) {
        this.m = i;
    }

    private String m() {
        return this.n;
    }

    private void h(String str) {
        this.n = str;
    }

    private String n() {
        return this.o;
    }

    private void i(String str) {
        this.o = str;
    }

    private String o() {
        return this.p;
    }

    private void j(String str) {
        this.p = str;
    }

    private boolean p() {
        return this.f4815q;
    }

    private void b(boolean z) {
        this.f4815q = z;
    }

    public final String toString() {
        return "MBFailureReason{errorCode=" + this.b + ", errorSubType=" + this.c + ", message='" + this.d + "', cause=" + this.e + ", campaign=" + this.f + ", requestId='" + this.g + "', localRequestId='" + this.h + "', isHeaderBidding=" + this.i + ", typeD=" + this.j + ", reasonD='" + this.k + "', extraMap=" + this.l + ", serverErrorCode=" + this.m + ", errorUrl='" + this.n + "', serverErrorResponse='" + this.o + "', unitId='" + this.r + "', placementId='" + this.s + "'}";
    }

    private String q() {
        return this.r;
    }

    public final void b(String str) {
        this.r = str;
    }

    private String r() {
        return this.s;
    }

    public final void c(String str) {
        this.s = str;
    }
}
