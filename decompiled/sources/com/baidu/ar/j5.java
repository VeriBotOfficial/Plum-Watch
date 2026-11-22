package com.baidu.ar;

import java.net.URL;
import java.nio.charset.Charset;
import java.util.Map;

/* loaded from: classes12.dex */
public class j5 {

    /* renamed from: a, reason: collision with root package name */
    public URL f7002a;
    public String b;
    public Charset c;
    public k5 d;
    public Map<String, String> e;
    public r5 f;
    public StringBuilder g = new StringBuilder();

    public String a() {
        return this.g.toString();
    }

    public void a(String str) {
        this.g.append(str + "\r\n");
    }

    public boolean b() {
        return this.g.length() > 0;
    }
}
