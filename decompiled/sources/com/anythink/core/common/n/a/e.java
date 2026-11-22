package com.anythink.core.common.n.a;

import io.livekit.android.room.SignalClient;
import java.io.IOException;
import java.net.IDN;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* loaded from: classes12.dex */
final class e extends com.anythink.core.common.n.a.a {
    private long i;
    private int j;
    private String k;
    private com.anythink.core.common.n.a.b l;
    private byte[] m;
    private int n;
    private int o;
    private List<l> p;

    /* renamed from: q, reason: collision with root package name */
    private List<l> f4039q;
    private List<l> r;

    e(String str, com.anythink.core.common.n.a.b bVar, byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            throw new IOException("response data is empty");
        }
        this.k = str;
        this.j = 4;
        this.l = bVar;
        this.m = bArr;
        this.i = new Date().getTime() / 1000;
        if (this.m.length < 12) {
            throw new IOException("response data too small");
        }
        byte b2 = 0;
        this.e = c(0);
        if (this.e != this.l.e) {
            throw new IOException("question id error");
        }
        int b3 = b(2);
        if ((b(2) & 128) == 0) {
            throw new IOException("not a response data");
        }
        this.f = (b3 >> 3) & 7;
        this.n = (b3 >> 2) & 1;
        this.g = b3 & 1;
        int b4 = b(3);
        this.h = (b4 >> 7) & 1;
        this.o = b4 & 15;
        int d = d();
        b bVar2 = new b(SignalClient.SD_TYPE_ANSWER, c(6), d, b2);
        a(bVar2);
        this.p = bVar2.e;
        int i = d + bVar2.d;
        b bVar3 = new b("authority", c(8), i, b2);
        a(bVar3);
        this.f4039q = bVar3.e;
        String str2 = "additional";
        b bVar4 = new b(str2, c(10), i + bVar3.d, b2);
        a(bVar4);
        this.r = bVar4.e;
    }

    private void b() {
        if (this.m.length < 12) {
            throw new IOException("response data too small");
        }
        byte b2 = 0;
        this.e = c(0);
        if (this.e != this.l.e) {
            throw new IOException("question id error");
        }
        int b3 = b(2);
        if ((b(2) & 128) == 0) {
            throw new IOException("not a response data");
        }
        this.f = (b3 >> 3) & 7;
        this.n = (b3 >> 2) & 1;
        this.g = b3 & 1;
        int b4 = b(3);
        this.h = (b4 >> 7) & 1;
        this.o = b4 & 15;
        int d = d();
        b bVar = new b(SignalClient.SD_TYPE_ANSWER, c(6), d, b2);
        a(bVar);
        this.p = bVar.e;
        int i = d + bVar.d;
        b bVar2 = new b("authority", c(8), i, b2);
        a(bVar2);
        this.f4039q = bVar2.e;
        String str = "additional";
        b bVar3 = new b(str, c(10), i + bVar2.d, b2);
        a(bVar3);
        this.r = bVar3.e;
    }

    private void c() {
        this.e = c(0);
        if (this.e != this.l.e) {
            throw new IOException("question id error");
        }
        int b2 = b(2);
        if ((b(2) & 128) == 0) {
            throw new IOException("not a response data");
        }
        this.f = (b2 >> 3) & 7;
        this.n = (b2 >> 2) & 1;
        this.g = b2 & 1;
        int b3 = b(3);
        this.h = (b3 >> 7) & 1;
        this.o = b3 & 15;
    }

    private int d() {
        int i = 12;
        for (int c = c(4); c > 0; c--) {
            a a2 = a(i);
            if (a2 == null) {
                throw new IOException("read Question error");
            }
            i += a2.f4040a + 4;
        }
        return i;
    }

    private void a(b bVar) {
        int i = bVar.c;
        for (int i2 = bVar.b; i2 > 0; i2--) {
            a a2 = a(i);
            if (a2 == null) {
                throw new IOException("read " + bVar.f4041a + " error");
            }
            int i3 = i + a2.f4040a;
            short c = c(i3);
            short c2 = c(i3 + 2);
            int i4 = i3 + 4;
            int i5 = i3 + 7;
            byte[] bArr = this.m;
            if (i5 >= bArr.length) {
                throw new IOException("read response data out of range");
            }
            int i6 = (bArr[i5] & 255) + ((bArr[i4] & 255) << 24) + ((bArr[i3 + 5] & 255) << 16) + ((bArr[i3 + 6] & 255) << 8);
            short c3 = c(i3 + 8);
            int i7 = i3 + 10;
            String a3 = a(c, i7, c3);
            if (c2 == 1 && (c == 5 || c == this.l.a())) {
                b.a(bVar, new l(a3, c, i6, this.i, this.j, this.k));
            }
            i = i7 + c3;
        }
        bVar.d = i - bVar.c;
    }

    private a a(int i) {
        StringBuilder sb = new StringBuilder();
        a aVar = new a((byte) 0);
        int i2 = 128;
        int i3 = i;
        do {
            int b2 = b(i3);
            int i4 = b2 & 192;
            if (i4 == 192) {
                if (aVar.f4040a <= 0) {
                    aVar.f4040a = (i3 + 2) - i;
                }
                i3 = b(i3 + 1) | ((b2 & 63) << 8);
            } else {
                if (i4 > 0) {
                    return null;
                }
                i3++;
                if (b2 > 0) {
                    if (sb.length() > 0) {
                        sb.append(".");
                    }
                    int i5 = i3 + b2;
                    sb.append(IDN.toUnicode(new String(Arrays.copyOfRange(this.m, i3, i5))));
                    i3 = i5;
                }
            }
            if (b2 <= 0) {
                break;
            }
            i2--;
        } while (i2 > 0);
        aVar.b = sb.toString();
        if (aVar.f4040a <= 0) {
            aVar.f4040a = i3 - i;
        }
        return aVar;
    }

    private String a(int i, int i2, int i3) {
        if (i == 1) {
            if (i3 != 4) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(b(i2));
            for (int i4 = 1; i4 < 4; i4++) {
                sb.append(".");
                sb.append(b(i2 + i4));
            }
            return sb.toString();
        }
        if (i == 5) {
            if (i3 > 1) {
                return a(i2).b;
            }
            return null;
        }
        if (i == 16) {
            if (i3 <= 0) {
                return null;
            }
            int i5 = i3 + i2;
            byte[] bArr = this.m;
            if (i5 < bArr.length) {
                return IDN.toUnicode(new String(Arrays.copyOfRange(bArr, i2, i5)));
            }
            return null;
        }
        if (i != 28 || i3 != 16) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        int i6 = 0;
        while (i6 < 16) {
            sb2.append(i6 > 0 ? ":" : "");
            int i7 = i2 + i6;
            sb2.append(b(i7));
            sb2.append(b(i7 + 1));
            i6 += 2;
        }
        return sb2.toString();
    }

    private int b(int i) {
        byte[] bArr = this.m;
        if (i >= bArr.length) {
            throw new IOException("read response data out of range");
        }
        return bArr[i] & 255;
    }

    private short c(int i) {
        int i2 = i + 1;
        byte[] bArr = this.m;
        if (i2 >= bArr.length) {
            throw new IOException("read response data out of range");
        }
        return (short) (((bArr[i] & 255) << 8) + (bArr[i2] & 255));
    }

    private int d(int i) {
        int i2 = i + 3;
        byte[] bArr = this.m;
        if (i2 >= bArr.length) {
            throw new IOException("read response data out of range");
        }
        int i3 = (bArr[i] & 255) << 24;
        int i4 = (bArr[i + 1] & 255) << 16;
        return i3 + i4 + ((bArr[i + 2] & 255) << 8) + (bArr[i2] & 255);
    }

    private int e() {
        return this.n;
    }

    private int f() {
        return this.o;
    }

    final List<l> a() {
        return this.p;
    }

    private List<l> g() {
        return this.r;
    }

    private List<l> h() {
        return this.f4039q;
    }

    public final String toString() {
        return String.format(Locale.getDefault(), "{messageId:%d, rd:%d, ra:%d, aa:%d, rCode:%d, server:%s, request:%s, answerArray:%s, authorityArray:%s, additionalArray:%s}", Short.valueOf(this.e), Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.n), Integer.valueOf(this.o), this.k, this.l, this.p, this.f4039q, this.r);
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f4041a;
        private final int b;
        private final int c;
        private int d;
        private final List<l> e;

        /* synthetic */ b(String str, int i, int i2, byte b) {
            this(str, i, i2);
        }

        private b(String str, int i, int i2) {
            this.f4041a = str;
            this.b = i;
            this.c = i2;
            this.d = 0;
            this.e = new ArrayList();
        }

        private void a(l lVar) {
            if (lVar != null) {
                this.e.add(lVar);
            }
        }

        static /* synthetic */ void a(b bVar, l lVar) {
            bVar.e.add(lVar);
        }
    }

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f4040a;
        private String b;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }
}
