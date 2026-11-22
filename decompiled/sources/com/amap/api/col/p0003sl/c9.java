package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.security.PublicKey;

/* compiled from: ClientInfo.java */
/* loaded from: classes11.dex */
public class c9 {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f1591a = true;
    private static boolean b = true;

    /* compiled from: ClientInfo.java */
    private static class a {
        String A;

        /* renamed from: a, reason: collision with root package name */
        String f1592a;
        String b;
        String c;
        String d;
        String e;
        String f;
        String g;
        String h;
        String i;
        String j;
        String k;
        String l;
        String m;
        String n;
        String o;
        String p;

        /* renamed from: q, reason: collision with root package name */
        String f1593q;
        String r;
        String s;
        String t;
        String u;
        String v;
        String w;
        String x;
        String y;
        String z;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    public static void a(boolean z) {
        b = z;
    }

    public static void b(boolean z) {
        f1591a = z;
    }

    public static String a(Context context, String str, String str2) {
        try {
            return i9.c(z8.g(context) + ":" + str.substring(0, str.length() - 3) + ":" + str2);
        } catch (Throwable th) {
            fa.a(th, "CI", "Sco");
            return null;
        }
    }

    public static String a() {
        try {
            String valueOf = String.valueOf(System.currentTimeMillis());
            String str = !z8.a() ? "0" : "1";
            int length = valueOf.length();
            return valueOf.substring(0, length - 2) + str + valueOf.substring(length - 1);
        } catch (Throwable th) {
            fa.a(th, "CI", "TS");
            return null;
        }
    }

    public static byte[] a(Context context, boolean z, boolean z2) {
        try {
            return a(context, a(context, z, z2, false));
        } catch (Throwable th) {
            fa.a(th, "CI", "gz");
            return null;
        }
    }

    public static String a(Context context) {
        try {
            return f9.c(a(context, a(context, false, false, false)));
        } catch (Throwable th) {
            fa.a(th, "CI", "gCXi");
            return null;
        }
    }

    private static byte[] a(Context context, a aVar) {
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] a2;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                a(byteArrayOutputStream, aVar.f1592a);
                a(byteArrayOutputStream, aVar.b);
                a(byteArrayOutputStream, aVar.c);
                a(byteArrayOutputStream, aVar.d);
                a(byteArrayOutputStream, aVar.e);
                a(byteArrayOutputStream, aVar.f);
                a(byteArrayOutputStream, aVar.g);
                a(byteArrayOutputStream, aVar.h);
                a(byteArrayOutputStream, aVar.i);
                a(byteArrayOutputStream, aVar.j);
                a(byteArrayOutputStream, aVar.k);
                a(byteArrayOutputStream, aVar.l);
                a(byteArrayOutputStream, aVar.m);
                a(byteArrayOutputStream, aVar.n);
                a(byteArrayOutputStream, aVar.o);
                a(byteArrayOutputStream, aVar.p);
                a(byteArrayOutputStream, aVar.f1593q);
                a(byteArrayOutputStream, aVar.r);
                a(byteArrayOutputStream, aVar.s);
                a(byteArrayOutputStream, aVar.t);
                a(byteArrayOutputStream, (String) null);
                a(byteArrayOutputStream, (String) null);
                a(byteArrayOutputStream, aVar.u);
                a(byteArrayOutputStream, aVar.v);
                a(byteArrayOutputStream, aVar.w);
                a(byteArrayOutputStream, aVar.x);
                a(byteArrayOutputStream, aVar.y);
                a(byteArrayOutputStream, aVar.z);
                a(byteArrayOutputStream, aVar.A);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                new String(byteArray);
                byte[] f = m9.f(byteArray);
                PublicKey a3 = m9.a();
                if (f.length > 117) {
                    byte[] bArr = new byte[117];
                    System.arraycopy(f, 0, bArr, 0, 117);
                    byte[] a4 = f9.a(bArr, a3);
                    a2 = new byte[f.length + 11];
                    System.arraycopy(a4, 0, a2, 0, 128);
                    System.arraycopy(f, 117, a2, 128, f.length - 117);
                } else {
                    a2 = f9.a(f, a3);
                }
                try {
                    byteArrayOutputStream.close();
                    return a2;
                } catch (Throwable th) {
                    th.printStackTrace();
                    return a2;
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    fa.a(th, "CI", "gzx");
                    return null;
                } finally {
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th3) {
                            th3.printStackTrace();
                        }
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
        }
    }

    public static void a(ByteArrayOutputStream byteArrayOutputStream, String str) {
        if (!TextUtils.isEmpty(str)) {
            m9.a(byteArrayOutputStream, str.getBytes().length > 255 ? (byte) -1 : (byte) str.getBytes().length, m9.e(str));
        } else {
            m9.a(byteArrayOutputStream, (byte) 0, new byte[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.amap.api.col.3sl.c9.a a(android.content.Context r5, boolean r6, boolean r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.c9.a(android.content.Context, boolean, boolean, boolean):com.amap.api.col.3sl.c9$a");
    }
}
