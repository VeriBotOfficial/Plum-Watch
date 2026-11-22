package com.baidu.location.b;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.location.GnssNavigationMessage;
import android.text.TextUtils;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    private b f7595a;
    private long b = 0;
    private long c = 0;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static y f7596a = new y();
    }

    class b extends com.baidu.location.h.g {
        private boolean d = false;
        private String e = null;

        /* renamed from: a, reason: collision with root package name */
        public boolean f7597a = false;
        public long b = 0;

        public b() {
            this.el = new HashMap();
        }

        public void a(String str, long j) {
            if (this.d) {
                return;
            }
            this.d = true;
            this.e = str;
            this.b = j;
            ExecutorService c = x.a().c();
            if (c != null) {
                a(c, com.baidu.location.h.d.p);
            } else {
                e(com.baidu.location.h.d.p);
            }
        }

        @Override // com.baidu.location.h.g
        public void a(boolean z) {
            if (z && this.ej != null) {
                try {
                    new JSONObject(this.ej);
                    this.f7597a = true;
                } catch (Throwable unused) {
                }
            }
            if (this.el != null) {
                this.el.clear();
            }
            this.d = false;
        }

        public boolean a() {
            return this.d;
        }

        @Override // com.baidu.location.h.g
        public void b() {
            String d = com.baidu.location.h.b.a().d();
            if (d != null) {
                d = d + "&gnsst=" + this.b;
            }
            String a2 = n.a().a(d);
            boolean isEmpty = TextUtils.isEmpty(a2);
            String str = AbstractJsonLexerKt.NULL;
            String replaceAll = !isEmpty ? a2.trim().replaceAll("\r|\n", "") : AbstractJsonLexerKt.NULL;
            String a3 = n.a().a(this.e);
            if (!TextUtils.isEmpty(a3)) {
                str = a3.trim().replaceAll("\r|\n", "");
            }
            try {
                this.el.put(ParameterNames.INFO, URLEncoder.encode(replaceAll, "utf-8"));
                this.el.put("enl", URLEncoder.encode(str, "utf-8"));
            } catch (Exception unused) {
            }
        }
    }

    public static y a() {
        return a.f7596a;
    }

    public void a(GnssNavigationMessage gnssNavigationMessage, long j) {
        t.a().a(gnssNavigationMessage, j);
        this.b = System.currentTimeMillis();
        this.c = j;
    }

    public void b() {
        ArrayList<String> b2;
        if (this.b == 0 || Math.abs(System.currentTimeMillis() - this.b) >= 20000) {
            return;
        }
        if (this.f7595a == null) {
            this.f7595a = new b();
        }
        b bVar = this.f7595a;
        if (bVar == null || bVar.a() || (b2 = t.a().b()) == null || b2.size() <= 0) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<String> it = b2.iterator();
        int i = 0;
        while (it.hasNext()) {
            stringBuffer.append(it.next());
            i++;
            if (i != b2.size()) {
                stringBuffer.append(";");
            }
        }
        this.f7595a.a(stringBuffer.toString(), this.c);
    }
}
