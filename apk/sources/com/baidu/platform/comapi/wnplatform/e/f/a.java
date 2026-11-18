package com.baidu.platform.comapi.wnplatform.e.f;

import com.autonavi.aps.amapapi.config.Const;
import org.json.JSONObject;

/* JADX INFO: compiled from: JsonBuilder.java */
/* JADX INFO: loaded from: classes15.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private StringBuilder f8898a = new StringBuilder();
    private boolean b = false;

    private void c() {
        this.b = false;
    }

    public a a(String str) {
        a();
        this.f8898a.append(JSONObject.quote(str));
        this.f8898a.append(":");
        c();
        return this;
    }

    public a b(String str) {
        a();
        this.f8898a.append(JSONObject.quote(str));
        b();
        return this;
    }

    public a d() {
        this.f8898a.append("}");
        b();
        return this;
    }

    public String e() {
        return this.f8898a.toString();
    }

    public a f() {
        a();
        this.f8898a.append(Const.STR_MART_JSON_BEGIN);
        c();
        return this;
    }

    public String toString() {
        return e();
    }

    private void b() {
        this.b = true;
    }

    public a a(boolean z) {
        a();
        this.f8898a.append(z);
        b();
        return this;
    }

    public a a(int r2) {
        a();
        this.f8898a.append(r2);
        b();
        return this;
    }

    public a a(long j) {
        a();
        this.f8898a.append(j);
        b();
        return this;
    }

    public a a(double d) {
        a();
        this.f8898a.append(String.format("%f", Double.valueOf(d)));
        b();
        return this;
    }

    public a a(Object obj) {
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if (obj instanceof Byte) {
                return a((int) number.byteValue());
            }
            if (obj instanceof Short) {
                return a((int) number.shortValue());
            }
            if (obj instanceof Integer) {
                return a(number.intValue());
            }
            if (obj instanceof Long) {
                return a(number.longValue());
            }
            if (obj instanceof Float) {
                return a(number.floatValue());
            }
            if (obj instanceof Double) {
                return a(number.doubleValue());
            }
        }
        return b(obj.toString());
    }

    private void a() {
        if (this.b) {
            this.f8898a.append(",");
        }
    }
}
