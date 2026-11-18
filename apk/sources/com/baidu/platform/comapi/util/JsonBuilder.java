package com.baidu.platform.comapi.util;

import com.autonavi.aps.amapapi.config.Const;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public class JsonBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private StringBuilder f8667a = new StringBuilder();
    private boolean b = false;

    private void a() {
        if (this.b) {
            this.f8667a.append(",");
        }
    }

    private void b() {
        this.b = true;
    }

    private void c() {
        this.b = false;
    }

    public JsonBuilder arrayValue() {
        a();
        this.f8667a.append("[");
        c();
        return this;
    }

    public JsonBuilder endArrayValue() {
        this.f8667a.append("]");
        b();
        return this;
    }

    public JsonBuilder endObject() {
        this.f8667a.append("}");
        b();
        return this;
    }

    public String getJson() {
        return this.f8667a.toString();
    }

    public JsonBuilder key(String str) {
        a();
        this.f8667a.append(JSONObject.quote(str));
        this.f8667a.append(":");
        c();
        return this;
    }

    public JsonBuilder object() {
        a();
        this.f8667a.append(Const.STR_MART_JSON_BEGIN);
        c();
        return this;
    }

    public JsonBuilder objectValue(String str) {
        a();
        this.f8667a.append(str);
        b();
        return this;
    }

    public JsonBuilder putObjectValue(String str, String str2) {
        if (str2 != null) {
            key(str).objectValue(str2);
        }
        return this;
    }

    public JsonBuilder putStringValue(String str, String str2) {
        if (str2 != null) {
            key(str).value(str2);
        }
        return this;
    }

    public void reset() {
        this.f8667a.setLength(0);
        this.b = false;
    }

    public String toString() {
        return getJson();
    }

    public JsonBuilder value(boolean z) {
        a();
        this.f8667a.append(z);
        b();
        return this;
    }

    public JsonBuilder valueDirect(String str) {
        a();
        this.f8667a.append(str);
        b();
        return this;
    }

    public JsonBuilder value(int r2) {
        a();
        this.f8667a.append(r2);
        b();
        return this;
    }

    public JsonBuilder value(long j) {
        a();
        this.f8667a.append(j);
        b();
        return this;
    }

    public JsonBuilder value(double d) {
        a();
        this.f8667a.append(String.valueOf(d));
        b();
        return this;
    }

    public JsonBuilder value(String str) {
        a();
        this.f8667a.append(JSONObject.quote(str));
        b();
        return this;
    }

    public JsonBuilder value(Object obj) {
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if (obj instanceof Byte) {
                return value((int) number.byteValue());
            }
            if (obj instanceof Short) {
                return value((int) number.shortValue());
            }
            if (obj instanceof Integer) {
                return value(number.intValue());
            }
            if (obj instanceof Long) {
                return value(number.longValue());
            }
            if (obj instanceof Float) {
                return value(number.floatValue());
            }
            if (obj instanceof Double) {
                return value(number.doubleValue());
            }
        }
        return value(obj.toString());
    }
}
