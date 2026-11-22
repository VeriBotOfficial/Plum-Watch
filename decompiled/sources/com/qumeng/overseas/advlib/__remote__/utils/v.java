package com.qumeng.overseas.advlib.__remote__.utils;

import android.gov.nist.core.Separators;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

/* loaded from: classes17.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private String f13252a;
    private StringBuilder b;
    private ArrayMap<String, Object> c = new ArrayMap<>();

    public v(String str) {
        this.f13252a = str;
    }

    public v a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.c.put(str, null);
        }
        return this;
    }

    public void b(String str) {
        this.f13252a = str;
    }

    public String toString() {
        int length = this.f13252a.length() - 1;
        char charAt = this.f13252a.charAt(length);
        if (charAt == '?' || charAt == '&') {
            this.f13252a = this.f13252a.substring(0, length);
        }
        StringBuilder sb = new StringBuilder();
        this.b = sb;
        sb.append(this.f13252a);
        boolean z = !this.f13252a.contains(Separators.QUESTION);
        for (String str : this.c.keySet()) {
            this.b.append(z ? Separators.QUESTION : "&").append(str);
            Object obj = this.c.get(str);
            if (obj != null) {
                this.b.append("=");
                if (obj instanceof String) {
                    try {
                        this.b.append(URLEncoder.encode((String) obj, "UTF-8"));
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                } else {
                    this.b.append(obj);
                }
            }
            z = false;
        }
        return this.b.toString();
    }

    public StringBuilder b() {
        return this.b;
    }

    public v a(String str, Object obj) {
        if (obj != null) {
            if (obj instanceof String) {
                if (!TextUtils.isEmpty((String) obj)) {
                    this.c.put(str, obj);
                    return this;
                }
            } else {
                this.c.put(str, obj);
            }
        }
        return this;
    }

    public v a(Map<String, Object> map) {
        if (!map.isEmpty()) {
            this.c.putAll(map);
        }
        return this;
    }

    public String a() {
        return this.f13252a;
    }

    public void a(StringBuilder sb) {
        this.b = sb;
    }
}
