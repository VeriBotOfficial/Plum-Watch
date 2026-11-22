package com.baidu.ar;

import android.text.TextUtils;
import com.baidu.mapapi.http.HttpClient;
import com.luck.picture.lib.config.PictureMimeType;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public class c9 implements r5 {
    public Charset b;
    public int f = 0;

    /* renamed from: a, reason: collision with root package name */
    public String f6839a = g5.b;
    public StringBuilder c = new StringBuilder();
    public Map<String, byte[]> e = new HashMap();
    public Map<String, String> d = new HashMap();

    public final InputStream a(String str, String str2, String str3, String str4, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(str).append(HttpClient.ENDFLAG).append(this.f6839a).append("\r\n").append(String.format(HttpClient.FILE_TEMPLATE, m5.a(str2, this.b), m5.a(str3, this.b))).append("\r\nContent-Type:").append(str4).append(";");
        if (z) {
            sb.append("charset=").append(this.b.name());
        }
        sb.append("\r\n\r\n");
        return new ByteArrayInputStream(sb.toString().getBytes(this.b));
    }

    public void a(String str) {
        this.f6839a = str;
    }

    public void a(String str, String str2) {
        File file = new File(str2);
        if (file.exists()) {
            this.f = (int) (this.f + file.length());
        }
        this.d.put(str, str2);
    }

    public void a(String str, byte[] bArr) {
        if (bArr != null) {
            this.f += bArr.length;
        }
        this.e.put(str, bArr);
    }

    @Override // com.baidu.ar.r5
    public InputStream[] a() {
        ArrayList arrayList = new ArrayList();
        if (this.c.length() > 0) {
            arrayList.add(new ByteArrayInputStream(this.c.toString().getBytes(this.b)));
        }
        String str = "";
        if (!this.d.isEmpty()) {
            String str2 = "";
            for (Map.Entry<String, String> entry : this.d.entrySet()) {
                arrayList.add(a(str2, entry.getKey(), new File(entry.getValue()).getName(), m5.b(entry.getValue()), false));
                arrayList.add(new FileInputStream(entry.getValue()));
                str2 = "\r\n";
            }
            str = str2;
        }
        c9 c9Var = this;
        if (!c9Var.e.isEmpty()) {
            String valueOf = String.valueOf(System.currentTimeMillis());
            int i = 1;
            String str3 = str;
            for (Map.Entry<String, byte[]> entry2 : c9Var.e.entrySet()) {
                int i2 = i + 1;
                String str4 = valueOf + i + PictureMimeType.JPG;
                c9 c9Var2 = c9Var;
                arrayList.add(c9Var2.a(str3, entry2.getKey(), str4, "application/octet-stream", true));
                arrayList.add(new ByteArrayInputStream(entry2.getValue()));
                str3 = "\r\n";
                c9Var = c9Var2;
                i = i2;
            }
            str = str3;
        }
        c9 c9Var3 = c9Var;
        if (!c9Var3.d.isEmpty() || !c9Var3.e.isEmpty()) {
            arrayList.add(new ByteArrayInputStream((str + HttpClient.ENDFLAG + c9Var3.f6839a + "--\r\n").getBytes(c9Var3.b)));
        }
        return (InputStream[]) arrayList.toArray(new InputStream[arrayList.size()]);
    }

    @Override // com.baidu.ar.r5
    public String b() {
        return "multipart/form-data;boundary=" + d();
    }

    public void b(String str, String str2) {
        if (TextUtils.isEmpty(str) || str2 == null) {
            return;
        }
        this.c.append(HttpClient.ENDFLAG).append(this.f6839a).append("\r\n");
        this.c.append("Content-Disposition: form-data; name=\"").append(m5.a(str, this.b)).append("\"\r\n");
        this.c.append("\r\n");
        this.c.append(m5.a(str2, this.b));
        this.c.append("\r\n");
    }

    @Override // com.baidu.ar.r5
    public int c() {
        return this.f;
    }

    public String d() {
        return this.f6839a;
    }

    public boolean e() {
        return this.c.length() == 0 && this.e.isEmpty() && this.d.isEmpty();
    }

    @Override // com.baidu.ar.r5
    public void setCharset(Charset charset) {
        this.b = charset;
    }
}
