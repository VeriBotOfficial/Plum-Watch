package com.baidu.ar;

import android.gov.nist.core.Separators;
import android.text.TextUtils;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes12.dex */
public class hd {

    /* renamed from: a, reason: collision with root package name */
    public String f6971a;
    public StringBuilder b;
    public Charset c = StandardCharsets.UTF_8;

    public URL a() {
        String str = this.f6971a;
        if (str == null) {
            str = "";
        }
        StringBuilder sb = this.b;
        if (sb != null && sb.length() > 0) {
            String str2 = Separators.QUESTION;
            if (str.contains(Separators.QUESTION)) {
                str2 = "&";
            }
            str = str + str2 + this.b.toString();
        }
        return new URL(str);
    }

    public void a(String str) {
        this.f6971a = str;
    }

    public void a(String str, String str2) {
        if (str2 == null || TextUtils.isEmpty(str)) {
            return;
        }
        StringBuilder sb = this.b;
        if (sb == null) {
            this.b = new StringBuilder();
        } else if (sb.length() > 0) {
            this.b.append("&");
        }
        this.b.append(m5.a(str, this.c));
        this.b.append("=");
        this.b.append(m5.a(str2, this.c));
    }

    public void a(Charset charset) {
        this.c = charset;
    }
}
