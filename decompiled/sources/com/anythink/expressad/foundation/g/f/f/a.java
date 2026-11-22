package com.anythink.expressad.foundation.g.f.f;

import android.util.Log;
import com.anythink.expressad.foundation.g.f.h;
import com.anythink.expressad.foundation.g.f.j;
import com.anythink.expressad.foundation.g.f.m;
import java.net.URL;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes12.dex */
public class a implements h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4876a = "a";
    private static final int b = 3000;
    private com.anythink.expressad.foundation.g.f.e.a c;
    private com.anythink.expressad.foundation.g.f.c d;

    public a(com.anythink.expressad.foundation.g.f.e.a aVar, com.anythink.expressad.foundation.g.f.c cVar) {
        this.c = aVar;
        this.d = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0231 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0240 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cc  */
    @Override // com.anythink.expressad.foundation.g.f.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.anythink.expressad.foundation.g.f.f.c a(com.anythink.expressad.foundation.g.f.j<?> r21) {
        /*
            Method dump skipped, instructions count: 943
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.g.f.f.a.a(com.anythink.expressad.foundation.g.f.j):com.anythink.expressad.foundation.g.f.f.c");
    }

    private static void a(long j, j<?> jVar, byte[] bArr, int i) {
        if (com.anythink.expressad.a.f4564a) {
            Object obj = AbstractJsonLexerKt.NULL;
            try {
                if (j > 3000) {
                    String d = jVar.d();
                    Integer valueOf = Integer.valueOf(jVar.a());
                    Long valueOf2 = Long.valueOf(j);
                    if (bArr != null) {
                        obj = Integer.valueOf(bArr.length);
                    }
                    String.format("Slow HTTP response for request=<%s> [method=%s] [lifetime=%d], [size=%s], [statusCode=%d], [retryCount=%s]", d, valueOf, valueOf2, obj, Integer.valueOf(i), Integer.valueOf(jVar.l().c()));
                    return;
                }
                String d2 = jVar.d();
                Integer valueOf3 = Integer.valueOf(jVar.a());
                Long valueOf4 = Long.valueOf(j);
                if (bArr != null) {
                    obj = Integer.valueOf(bArr.length);
                }
                String.format("Normal HTTP response for request=<%s> [method=%s] [lifetime=%d], [size=%s], [statusCode=%d], [retryCount=%s]", d2, valueOf3, valueOf4, obj, Integer.valueOf(i), Integer.valueOf(jVar.l().c()));
            } catch (Exception unused) {
            }
        }
    }

    private static void a(String str, long j, j<?> jVar) {
        if (com.anythink.expressad.a.f4564a) {
            try {
                URL url = new URL(jVar.d());
                String str2 = f4876a;
                String str3 = url.getHost() + url.getPath();
                Long valueOf = Long.valueOf(j);
                if (str == null) {
                    str = AbstractJsonLexerKt.NULL;
                }
                Log.i(str2, String.format("HTTP exception for request=<%s> [lifetime=%d], [exception=%s], [retryCount=%s-%s]", str3, valueOf, str, Integer.valueOf(jVar.l().c()), Integer.valueOf(jVar.l().a())));
            } catch (Exception unused) {
            }
        }
    }

    private void a(j<?> jVar, com.anythink.expressad.foundation.g.f.a.a aVar, long j) {
        if (jVar == null) {
            throw new com.anythink.expressad.foundation.g.f.a.a(4, null);
        }
        try {
            m l = jVar.l();
            if (l != null) {
                long h = l.h();
                if (!l.d()) {
                    throw aVar;
                }
                if (j < h) {
                    this.d.e(jVar);
                    return;
                }
                throw aVar;
            }
            throw aVar;
        } catch (Exception unused) {
            throw aVar;
        }
    }
}
