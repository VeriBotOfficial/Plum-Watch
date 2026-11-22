package com.baidu.ar;

import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: classes12.dex */
public class l4 implements r5 {

    /* renamed from: a, reason: collision with root package name */
    public Charset f7060a;
    public StringBuilder b = new StringBuilder();

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || str2 == null) {
            return;
        }
        if (this.b.length() > 0) {
            this.b.append("&");
        }
        this.b.append(m5.a(str, this.f7060a)).append("=").append(m5.a(str2, this.f7060a));
    }

    @Override // com.baidu.ar.r5
    public InputStream[] a() {
        return this.b.length() > 0 ? new InputStream[]{new ByteArrayInputStream(this.b.toString().getBytes(this.f7060a))} : new InputStream[0];
    }

    @Override // com.baidu.ar.r5
    public String b() {
        return "application/x-www-form-urlencoded";
    }

    @Override // com.baidu.ar.r5
    public int c() {
        return 0;
    }

    @Override // com.baidu.ar.r5
    public void setCharset(Charset charset) {
        this.f7060a = charset;
    }
}
