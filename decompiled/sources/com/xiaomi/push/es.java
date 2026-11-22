package com.xiaomi.push;

import android.gov.nist.core.Separators;
import android.text.TextUtils;
import com.phancy.mini.api.file.FileSystemManager;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.dq;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class es {

    /* renamed from: a, reason: collision with other field name */
    int f479a;

    /* renamed from: a, reason: collision with other field name */
    private dq.a f480a;

    /* renamed from: a, reason: collision with other field name */
    String f481a;

    /* renamed from: a, reason: collision with other field name */
    private short f482a;

    /* renamed from: b, reason: collision with other field name */
    private final long f483b;

    /* renamed from: b, reason: collision with other field name */
    private byte[] f484b;
    private static String b = fy.a(5) + Constants.ACCEPT_TIME_SEPARATOR_SERVER;

    /* renamed from: a, reason: collision with root package name */
    private static long f14570a = 0;

    /* renamed from: a, reason: collision with other field name */
    private static final byte[] f478a = new byte[0];

    public es() {
        this.f482a = (short) 2;
        this.f484b = f478a;
        this.f481a = null;
        this.f483b = System.currentTimeMillis();
        this.f480a = new dq.a();
        this.f479a = 1;
    }

    es(dq.a aVar, short s, byte[] bArr) {
        this.f482a = (short) 2;
        this.f484b = f478a;
        this.f481a = null;
        this.f483b = System.currentTimeMillis();
        this.f480a = aVar;
        this.f482a = s;
        this.f484b = bArr;
        this.f479a = 2;
    }

    /* renamed from: a, reason: collision with other method in class */
    public long m12122a() {
        return this.f483b;
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("command should not be empty");
        }
        this.f480a.c(str);
        this.f480a.m12015a();
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f480a.d(str2);
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m12123a() {
        return this.f480a.m12022c();
    }

    /* renamed from: b, reason: collision with other method in class */
    public String m12130b() {
        return this.f480a.m12024d();
    }

    public void a(int i) {
        this.f480a.a(i);
    }

    public int a() {
        return this.f480a.c();
    }

    public void a(String str) {
        this.f480a.e(str);
    }

    public void a(long j) {
        this.f480a.a(j);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12126a() {
        return this.f480a.j();
    }

    public int b() {
        return this.f480a.f();
    }

    /* renamed from: c, reason: collision with other method in class */
    public String m12133c() {
        return this.f480a.m12028f();
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m12131b() {
        return this.f480a.l();
    }

    public void b(long j) {
        this.f480a.b(j);
    }

    public void c(long j) {
        this.f480a.c(j);
    }

    /* renamed from: b, reason: collision with other method in class */
    public long m12129b() {
        return this.f480a.m12018b();
    }

    /* renamed from: c, reason: collision with other method in class */
    public long m12132c() {
        return this.f480a.m12014a();
    }

    public static synchronized String d() {
        String sb;
        synchronized (es.class) {
            StringBuilder append = new StringBuilder().append(b);
            long j = f14570a;
            f14570a = 1 + j;
            sb = append.append(Long.toString(j)).toString();
        }
        return sb;
    }

    public String e() {
        String m12026e = this.f480a.m12026e();
        if ("ID_NOT_AVAILABLE".equals(m12026e)) {
            return null;
        }
        if (this.f480a.g()) {
            return m12026e;
        }
        String d = d();
        this.f480a.e(d);
        return d;
    }

    public void b(String str) {
        this.f481a = str;
    }

    public String f() {
        return this.f481a;
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int indexOf = str.indexOf(Separators.AT);
        try {
            long parseLong = Long.parseLong(str.substring(0, indexOf));
            int indexOf2 = str.indexOf("/", indexOf);
            String substring = str.substring(indexOf + 1, indexOf2);
            String substring2 = str.substring(indexOf2 + 1);
            this.f480a.a(parseLong);
            this.f480a.a(substring);
            this.f480a.b(substring2);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("Blob parse user err " + e.getMessage());
        }
    }

    public void a(long j, String str, String str2) {
        if (j != 0) {
            this.f480a.a(j);
        }
        if (!TextUtils.isEmpty(str)) {
            this.f480a.a(str);
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f480a.b(str2);
    }

    public String g() {
        if (this.f480a.m12020b()) {
            return Long.toString(this.f480a.m12014a()) + Separators.AT + this.f480a.m12016a() + "/" + this.f480a.m12019b();
        }
        return null;
    }

    public void a(byte[] bArr, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f480a.c(1);
            this.f484b = com.xiaomi.push.service.ar.a(com.xiaomi.push.service.ar.a(str, e()), bArr);
        } else {
            this.f480a.c(0);
            this.f484b = bArr;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public byte[] m12127a() {
        return et.a(this, this.f484b);
    }

    /* renamed from: a, reason: collision with other method in class */
    public byte[] m12128a(String str) {
        if (this.f480a.e() == 1) {
            return et.a(this, com.xiaomi.push.service.ar.a(com.xiaomi.push.service.ar.a(str, e()), this.f484b));
        }
        if (this.f480a.e() == 0) {
            return et.a(this, this.f484b);
        }
        com.xiaomi.channel.commonutils.logger.b.m11781a("unknow cipher = " + this.f480a.e());
        return et.a(this, this.f484b);
    }

    @Deprecated
    public static es a(fp fpVar, String str) {
        int i;
        es esVar = new es();
        try {
            i = Integer.parseInt(fpVar.k());
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("Blob parse chid err " + e.getMessage());
            i = 1;
        }
        esVar.a(i);
        esVar.a(fpVar.j());
        esVar.c(fpVar.m());
        esVar.b(fpVar.n());
        esVar.a("XMLMSG", (String) null);
        try {
            esVar.a(fpVar.mo12164a().getBytes(FileSystemManager.ENCODING_UTF8), str);
            if (TextUtils.isEmpty(str)) {
                esVar.a((short) 3);
            } else {
                esVar.a((short) 2);
                esVar.a("SECMSG", (String) null);
            }
        } catch (UnsupportedEncodingException e2) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("Blob setPayload err： " + e2.getMessage());
        }
        return esVar;
    }

    public int c() {
        return this.f480a.b() + 8 + this.f484b.length;
    }

    /* renamed from: a, reason: collision with other method in class */
    ByteBuffer mo12124a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            byteBuffer = ByteBuffer.allocate(c());
        }
        byteBuffer.putShort(this.f482a);
        byteBuffer.putShort((short) this.f480a.a());
        byteBuffer.putInt(this.f484b.length);
        int position = byteBuffer.position();
        this.f480a.a(byteBuffer.array(), byteBuffer.arrayOffset() + position, this.f480a.a());
        byteBuffer.position(position + this.f480a.a());
        byteBuffer.put(this.f484b);
        return byteBuffer;
    }

    static es a(ByteBuffer byteBuffer) {
        try {
            ByteBuffer slice = byteBuffer.slice();
            short s = slice.getShort(0);
            short s2 = slice.getShort(2);
            int i = slice.getInt(4);
            dq.a aVar = new dq.a();
            aVar.a(slice.array(), slice.arrayOffset() + 8, (int) s2);
            byte[] bArr = new byte[i];
            slice.position(s2 + 8);
            slice.get(bArr, 0, i);
            return new es(aVar, s, bArr);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("read Blob err :" + e.getMessage());
            throw new IOException("Malformed Input");
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public short m12125a() {
        return this.f482a;
    }

    public void a(short s) {
        this.f482a = s;
    }

    public String toString() {
        return "Blob [chid=" + a() + "; Id=" + com.xiaomi.push.service.aj.a(e()) + "; cmd=" + m12123a() + "; type=" + ((int) m12125a()) + "; from=" + g() + " ]";
    }
}
