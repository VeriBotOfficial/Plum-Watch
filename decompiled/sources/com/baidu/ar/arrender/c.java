package com.baidu.ar.arrender;

import com.baidu.ar.u;

/* loaded from: classes12.dex */
public class c extends u {
    public String f;
    public String g;
    public Object h;
    public a i;

    public enum a {
        INT,
        FLOAT,
        FLOAT_ARRAY,
        STRING
    }

    public void a(Object obj) {
        this.h = obj;
        b(obj);
    }

    public final void b(Object obj) {
        a aVar;
        if ((obj instanceof Float) || (obj instanceof Double)) {
            aVar = a.FLOAT;
        } else if (obj instanceof String) {
            aVar = a.STRING;
        } else if (obj instanceof Integer) {
            aVar = a.INT;
        } else if (!(obj instanceof float[])) {
            return;
        } else {
            aVar = a.FLOAT_ARRAY;
        }
        this.i = aVar;
    }

    public void b(String str) {
        this.g = str;
    }

    public void c(String str) {
        this.f = str;
    }

    public String f() {
        return this.g;
    }

    public Object g() {
        return this.h;
    }

    public a h() {
        return this.i;
    }

    public String i() {
        return this.f;
    }
}
