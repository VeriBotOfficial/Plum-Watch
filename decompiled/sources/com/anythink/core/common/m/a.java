package com.anythink.core.common.m;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.d.j;
import com.anythink.core.common.m.a.f;
import com.anythink.core.common.m.a.i;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.SSLException;
import org.apache.http.conn.ConnectTimeoutException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3975a = "http.loader";
    public static final int m = 699;
    public static final int n = 700;
    public static final int o = 200;
    public static final String p = "Content-Type";

    /* renamed from: q, reason: collision with root package name */
    public static final String f3976q = "application/json";
    private final com.anythink.core.common.m.c.i b = com.anythink.core.common.d.t.b().X();
    private com.anythink.core.common.m.b.d c;
    private com.anythink.core.common.m.a.b d;
    private long e;
    private boolean f;
    private com.anythink.core.common.m.a.a.a g;
    protected q r;
    protected boolean s;
    protected String t;

    protected abstract int a();

    protected abstract Object a(Object obj);

    protected void a(int i) {
    }

    protected abstract void a(AdError adError);

    protected abstract String b();

    protected abstract void b(AdError adError);

    protected boolean b(int i) {
        return false;
    }

    protected abstract Map<String, String> c();

    protected abstract byte[] d();

    protected boolean d_() {
        return false;
    }

    protected abstract String h();

    protected abstract Context i();

    protected abstract String j();

    protected abstract Map<String, Object> k();

    @Deprecated
    protected int l() {
        return 0;
    }

    protected com.anythink.core.common.m.b.d m() {
        return null;
    }

    protected boolean p() {
        return false;
    }

    protected List<String> q() {
        return null;
    }

    protected boolean r() {
        return false;
    }

    static /* synthetic */ boolean a(a aVar) {
        aVar.f = false;
        return false;
    }

    public void a(int i, q qVar) {
        this.s = false;
        this.r = qVar;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(i);
        if (p()) {
            com.anythink.core.common.v.b.b.a().a((com.anythink.core.common.v.b.d) anonymousClass1, 1);
        } else {
            com.anythink.core.common.v.b.b.a().a((com.anythink.core.common.v.b.d) anonymousClass1, 10);
        }
    }

    private void s() {
        this.s = true;
        com.anythink.core.common.m.a.b bVar = this.d;
        if (bVar != null) {
            bVar.a();
        }
    }

    protected String o() {
        return "1.0";
    }

    protected JSONObject e() {
        return e.a(l());
    }

    protected JSONObject f() {
        return e.a(l(), q());
    }

    protected String g() {
        HashMap hashMap = new HashMap();
        String a2 = com.anythink.core.common.v.k.a(e().toString());
        String a3 = com.anythink.core.common.v.k.a(f().toString());
        hashMap.put(e.P, o());
        hashMap.put("p", a2);
        hashMap.put(e.W, a3);
        ArrayList<String> arrayList = new ArrayList(hashMap.size());
        arrayList.addAll(hashMap.keySet());
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (String str : arrayList) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(str);
            sb.append("=");
            sb.append(hashMap.get(str));
        }
        hashMap.put("sign", com.anythink.core.common.v.o.c(j() + sb.toString()));
        if (k() != null) {
            hashMap.putAll(k());
        }
        Set<String> keySet = hashMap.keySet();
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str2 : keySet) {
                jSONObject.put(str2, String.valueOf(hashMap.get(str2)));
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        } catch (OutOfMemoryError unused2) {
            System.gc();
            return null;
        }
    }

    private String t() {
        int a2 = a();
        if (a2 != 1 && a2 != 2) {
            a2 = 2;
        }
        if (a2 == 2) {
            return "GET";
        }
        return "POST";
    }

    /* renamed from: com.anythink.core.common.m.a$1, reason: invalid class name */
    final class AnonymousClass1 extends com.anythink.core.common.v.b.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f3977a;

        AnonymousClass1(int i) {
            this.f3977a = i;
        }

        @Override // com.anythink.core.common.v.b.d
        public final void a() {
            com.anythink.core.common.m.b.f a2;
            try {
                if (a.this.s) {
                    a.this.c(this.f3977a);
                    return;
                }
                a.a(a.this);
                com.anythink.core.common.d.t.b().T();
                a aVar = a.this;
                aVar.t = aVar.b();
                int aT = com.anythink.core.d.d.a().aT();
                String b = a.b(a.this);
                new Object[]{a.this.getClass().getSimpleName(), b, a.this.t, Integer.valueOf(aT)};
                if (a.this.r != null) {
                    a.this.r.onLoadStart(this.f3977a);
                }
                if (a.this.c == null) {
                    a aVar2 = a.this;
                    aVar2.c = aVar2.m();
                }
                if (a.this.c == null || a.this.b == null || (a2 = a.this.b.a(a.this.c)) == null || !a2.e()) {
                    com.anythink.core.common.m.a.b bVar = a.this.d;
                    if (bVar == null) {
                        if (a.this.g == null) {
                            a.this.g = new com.anythink.core.common.m.a.a.a(a.this.getClass().getName(), a.this.t);
                        }
                        com.anythink.core.common.m.a.f a3 = new f.a().a(com.anythink.core.common.v.b.b.a().d()).a(TimeUnit.MILLISECONDS).c(TimeUnit.MILLISECONDS).b(TimeUnit.MILLISECONDS).a(a.this.g.a(a.this.c)).a(aT).a();
                        bVar = com.anythink.core.d.b.b(a3.j) ? new com.anythink.core.common.m.a.a.e(a3) : new com.anythink.core.common.m.a.a.b(a3);
                        new Object[]{bVar};
                        a.this.d = bVar;
                    }
                    com.anythink.core.common.m.a.j a4 = bVar.a(new i.a().a(a.this.t).b(b).c(a.h(a.this)).a(a.this.d()).a(a.g(a.this)).a());
                    if (a4.b != 200 && a4.b != 201 && a4.b != 204 && !a.this.b(a4.b)) {
                        a.b(a.this, a4, this.f3977a);
                        return;
                    }
                    a.a(a.this, a4, this.f3977a);
                    return;
                }
                int f = a2.f();
                String valueOf = String.valueOf(f);
                if (f == 200) {
                    a.this.a(this.f3977a, a2.g(), false);
                } else {
                    a.this.a(this.f3977a, f, "", ErrorCode.getErrorCode(ErrorCode.statuError, valueOf, ""), false);
                }
            } catch (Throwable th) {
                a.this.a(0, 0, th.getMessage(), ErrorCode.getErrorCode(ErrorCode.httpStatuException, "0", th.getMessage()));
            }
        }
    }

    private void d(int i) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(i);
        if (p()) {
            com.anythink.core.common.v.b.b.a().a((com.anythink.core.common.v.b.d) anonymousClass1, 1);
        } else {
            com.anythink.core.common.v.b.b.a().a((com.anythink.core.common.v.b.d) anonymousClass1, 10);
        }
    }

    private Map<String, String> u() {
        Map<String, String> c = c();
        if (c == null) {
            c = new HashMap<>();
        }
        if (com.anythink.core.common.d.t.b().c("ua")) {
            c.put("User-Agent", com.anythink.core.common.v.p.a());
        }
        return c;
    }

    private String v() {
        Map<String, String> c = c();
        if (c != null && c.containsKey("Content-Type")) {
            return c.get("Content-Type");
        }
        return f3976q;
    }

    protected void a(int i, int i2, String str, AdError adError) {
        a(i, i2, str, adError, true);
    }

    protected final void a(int i, int i2, String str, AdError adError, boolean z) {
        a(i, i2, str, adError, z, false, false);
    }

    private void a(int i, int i2, String str, AdError adError, boolean z, boolean z2, boolean z3) {
        new Object[]{getClass().getSimpleName(), Integer.valueOf(i), Integer.valueOf(i2), str, adError, this.t};
        if (this.f) {
            return;
        }
        this.f = true;
        q qVar = this.r;
        if (qVar != null) {
            qVar.onLoadError(i, str, adError);
        }
        if (z3) {
            a(i2, str);
        }
        a(i2);
        if (z) {
            b(i2, (Object) null);
        }
        if (z2) {
            a(adError);
        }
        b(adError);
        w();
    }

    protected final void c(int i) {
        q qVar = this.r;
        if (qVar != null) {
            qVar.onLoadCanceled(i);
        }
    }

    protected void a(int i, Object obj) {
        a(i, obj, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, Object obj, boolean z) {
        new Object[]{getClass().getSimpleName(), Integer.valueOf(i), this.t};
        if (this.f) {
            return;
        }
        this.f = true;
        q qVar = this.r;
        if (qVar != null) {
            qVar.onLoadFinish(i, obj);
        }
        if (z) {
            b(200, obj);
            w();
        }
    }

    protected static byte[] b(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes("utf-8"));
            gZIPOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    private void a(int i, String str) {
        int l = l();
        if (ATSDK.isCnSDK() || (l & 8) != 8) {
            return;
        }
        com.anythink.core.common.g.c.a().a(this.t, i, str, new com.anythink.core.common.g.d() { // from class: com.anythink.core.common.m.a.2
            @Override // com.anythink.core.common.g.d
            public final void a(String str2) {
            }
        });
    }

    private void b(int i, Object obj) {
        com.anythink.core.common.m.b.d dVar;
        if (this.b == null || (dVar = this.c) == null) {
            return;
        }
        String a2 = dVar.a();
        String b = this.c.b();
        com.anythink.core.common.m.b.f a3 = com.anythink.core.common.m.b.f.a();
        if (obj != null && (com.anythink.core.common.m.b.g.c.equals(b) || com.anythink.core.common.m.b.g.d.equals(b))) {
            a3.a(obj);
        }
        long j = this.e;
        if (j > 0) {
            a3.a(j);
        }
        a3.a(i);
        a3.a(a2);
        this.b.a(a3, this.c);
    }

    private void a(com.anythink.core.common.m.a.j jVar) {
        Map<String, List<String>> map = jVar.f;
        if (map == null || map.isEmpty() || jVar.b != 699) {
            return;
        }
        try {
            List<String> list = map.get("Req-Next-Time");
            String str = (list == null || list.isEmpty()) ? "" : list.get(0);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.e = Long.parseLong(str) * 1000;
        } catch (Throwable unused) {
        }
    }

    private void a(com.anythink.core.common.m.a.j jVar, int i) {
        String str;
        int i2;
        boolean z;
        boolean z2;
        Throwable th = jVar.d;
        int i3 = jVar.b;
        String str2 = "";
        String message = th != null ? th.getMessage() : "";
        if (th instanceof UnknownHostException) {
            str = "UnknownHostException: ".concat(String.valueOf(message));
            i2 = -1000;
            z = true;
            z2 = false;
        } else {
            if (th instanceof ConnectException) {
                str = "ConnectException: ".concat(String.valueOf(message));
                i2 = -1001;
                z = true;
            } else {
                if (th instanceof SSLException) {
                    str = "SSLException: ".concat(String.valueOf(message));
                    i2 = -1006;
                } else if (th instanceof SocketException) {
                    str = "SocketException: ".concat(String.valueOf(message));
                    i2 = -1007;
                } else if (th instanceof SocketTimeoutException) {
                    str = "SocketTimeoutException: ".concat(String.valueOf(message));
                    i2 = -1002;
                } else if (th instanceof ConnectTimeoutException) {
                    str = "ConnectTimeoutException: ".concat(String.valueOf(message));
                    i2 = -1003;
                } else {
                    if (th instanceof IOException) {
                        str = "IOException: ".concat(String.valueOf(message));
                        i2 = o.i;
                    } else {
                        if (th == null) {
                            str = jVar.c;
                        } else if (!TextUtils.isEmpty(jVar.c)) {
                            str = "Msg: " + jVar.c + "Exception: " + th + ", Message: " + message;
                        } else {
                            str = "Exception: " + th + ", Message: " + message;
                        }
                        i2 = -9998;
                    }
                    z = false;
                }
                z2 = true;
                z = false;
            }
            z2 = z;
        }
        if (x()) {
            str = "cus-dns,".concat(String.valueOf(str));
        }
        String str3 = str;
        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.httpStatuException, String.valueOf(i2), str3);
        Map<String, List<String>> map = jVar.f;
        if (map != null && !map.isEmpty() && jVar.b == 699) {
            try {
                List<String> list = map.get("Req-Next-Time");
                if (list != null && !list.isEmpty()) {
                    str2 = list.get(0);
                }
                if (!TextUtils.isEmpty(str2)) {
                    this.e = Long.parseLong(str2) * 1000;
                }
            } catch (Throwable unused) {
            }
        }
        a(i, i3, str3, errorCode, true, z, z2);
    }

    private void b(com.anythink.core.common.m.a.j jVar, int i) {
        String str;
        JSONObject jSONObject;
        int i2 = jVar.b;
        try {
            com.anythink.core.common.m.a.k kVar = jVar.e;
            String str2 = "";
            if (kVar == null) {
                str = "";
            } else if (r()) {
                str = kVar.c();
            } else {
                str = kVar.b();
            }
            if (!b(i2) && (i2 == 201 || i2 == 204)) {
                a(i, a((Object) null));
                return;
            }
            if (d_()) {
                if (!TextUtils.isEmpty(str)) {
                    str2 = str.trim();
                    try {
                        jSONObject = new JSONObject(str2);
                    } catch (Throwable unused) {
                        jSONObject = new JSONObject();
                    }
                } else {
                    jSONObject = new JSONObject();
                }
                int optInt = jSONObject.optInt("code", 0);
                if (optInt == 0) {
                    JSONObject optJSONObject = jSONObject.optJSONObject(j.e.e);
                    if (optJSONObject == null) {
                        optJSONObject = new JSONObject();
                    }
                    a(i, a(optJSONObject));
                    return;
                }
                a(i, o.l, str2, ErrorCode.getErrorCode(ErrorCode.statuError, String.valueOf(optInt), str2));
                return;
            }
            a(i, a(str != null ? str.trim() : null));
        } catch (Throwable th) {
            a(i, i2, th.getMessage(), ErrorCode.getErrorCode(ErrorCode.httpStatuException, String.valueOf(i2), th.getMessage()));
        }
    }

    private void w() {
        com.anythink.core.common.m.a.a.a aVar;
        if (!x() || (aVar = this.g) == null) {
            return;
        }
        com.anythink.core.common.u.e.a(aVar.a());
    }

    private boolean x() {
        com.anythink.core.common.m.a.a.a aVar = this.g;
        com.anythink.core.common.m.b.a a2 = aVar != null ? aVar.a() : null;
        return a2 != null && a2.o();
    }

    static /* synthetic */ String b(a aVar) {
        int a2 = aVar.a();
        if (a2 != 1 && a2 != 2) {
            a2 = 2;
        }
        if (a2 == 2) {
            return "GET";
        }
        return "POST";
    }

    static /* synthetic */ Map g(a aVar) {
        Map<String, String> c = aVar.c();
        if (c == null) {
            c = new HashMap<>();
        }
        if (com.anythink.core.common.d.t.b().c("ua")) {
            c.put("User-Agent", com.anythink.core.common.v.p.a());
        }
        return c;
    }

    static /* synthetic */ String h(a aVar) {
        Map<String, String> c = aVar.c();
        if (c == null || !c.containsKey("Content-Type")) {
            return f3976q;
        }
        return c.get("Content-Type");
    }

    static /* synthetic */ void a(a aVar, com.anythink.core.common.m.a.j jVar, int i) {
        String str;
        JSONObject jSONObject;
        int i2 = jVar.b;
        try {
            com.anythink.core.common.m.a.k kVar = jVar.e;
            String str2 = "";
            if (kVar == null) {
                str = "";
            } else if (aVar.r()) {
                str = kVar.c();
            } else {
                str = kVar.b();
            }
            if (!aVar.b(i2) && (i2 == 201 || i2 == 204)) {
                aVar.a(i, aVar.a((Object) null));
                return;
            }
            if (aVar.d_()) {
                if (!TextUtils.isEmpty(str)) {
                    str2 = str.trim();
                    try {
                        jSONObject = new JSONObject(str2);
                    } catch (Throwable unused) {
                        jSONObject = new JSONObject();
                    }
                } else {
                    jSONObject = new JSONObject();
                }
                int optInt = jSONObject.optInt("code", 0);
                if (optInt == 0) {
                    JSONObject optJSONObject = jSONObject.optJSONObject(j.e.e);
                    if (optJSONObject == null) {
                        optJSONObject = new JSONObject();
                    }
                    aVar.a(i, aVar.a(optJSONObject));
                    return;
                }
                aVar.a(i, o.l, str2, ErrorCode.getErrorCode(ErrorCode.statuError, String.valueOf(optInt), str2));
                return;
            }
            aVar.a(i, aVar.a(str != null ? str.trim() : null));
        } catch (Throwable th) {
            aVar.a(i, i2, th.getMessage(), ErrorCode.getErrorCode(ErrorCode.httpStatuException, String.valueOf(i2), th.getMessage()));
        }
    }

    static /* synthetic */ void b(a aVar, com.anythink.core.common.m.a.j jVar, int i) {
        String str;
        int i2;
        boolean z;
        boolean z2;
        Throwable th = jVar.d;
        int i3 = jVar.b;
        String str2 = "";
        String message = th != null ? th.getMessage() : "";
        if (th instanceof UnknownHostException) {
            str = "UnknownHostException: ".concat(String.valueOf(message));
            i2 = -1000;
            z = true;
            z2 = false;
        } else {
            if (th instanceof ConnectException) {
                str = "ConnectException: ".concat(String.valueOf(message));
                i2 = -1001;
                z = true;
            } else {
                if (th instanceof SSLException) {
                    str = "SSLException: ".concat(String.valueOf(message));
                    i2 = -1006;
                } else if (th instanceof SocketException) {
                    str = "SocketException: ".concat(String.valueOf(message));
                    i2 = -1007;
                } else if (th instanceof SocketTimeoutException) {
                    str = "SocketTimeoutException: ".concat(String.valueOf(message));
                    i2 = -1002;
                } else if (th instanceof ConnectTimeoutException) {
                    str = "ConnectTimeoutException: ".concat(String.valueOf(message));
                    i2 = -1003;
                } else {
                    if (th instanceof IOException) {
                        str = "IOException: ".concat(String.valueOf(message));
                        i2 = o.i;
                    } else {
                        if (th == null) {
                            str = jVar.c;
                        } else if (!TextUtils.isEmpty(jVar.c)) {
                            str = "Msg: " + jVar.c + "Exception: " + th + ", Message: " + message;
                        } else {
                            str = "Exception: " + th + ", Message: " + message;
                        }
                        i2 = -9998;
                    }
                    z = false;
                }
                z2 = true;
                z = false;
            }
            z2 = z;
        }
        if (aVar.x()) {
            str = "cus-dns,".concat(String.valueOf(str));
        }
        String str3 = str;
        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.httpStatuException, String.valueOf(i2), str3);
        Map<String, List<String>> map = jVar.f;
        if (map != null && !map.isEmpty() && jVar.b == 699) {
            try {
                List<String> list = map.get("Req-Next-Time");
                if (list != null && !list.isEmpty()) {
                    str2 = list.get(0);
                }
                if (!TextUtils.isEmpty(str2)) {
                    aVar.e = Long.parseLong(str2) * 1000;
                }
            } catch (Throwable unused) {
            }
        }
        aVar.a(i, i3, str3, errorCode, true, z, z2);
    }
}
