package com.umeng.analytics.pro;

import com.umeng.analytics.pro.bm;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* compiled from: TSerializer.java */
/* loaded from: classes2.dex */
public class bc {

    /* renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f13801a;
    private final ce b;
    private bs c;

    public bc() {
        this(new bm.a());
    }

    public bc(bu buVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f13801a = byteArrayOutputStream;
        ce ceVar = new ce(byteArrayOutputStream);
        this.b = ceVar;
        this.c = buVar.a(ceVar);
    }

    public byte[] a(at atVar) throws az {
        this.f13801a.reset();
        atVar.write(this.c);
        return this.f13801a.toByteArray();
    }

    public String a(at atVar, String str) throws az {
        try {
            return new String(a(atVar), str);
        } catch (UnsupportedEncodingException unused) {
            throw new az("JVM DOES NOT SUPPORT ENCODING: " + str);
        }
    }

    public String b(at atVar) throws az {
        return new String(a(atVar));
    }
}
