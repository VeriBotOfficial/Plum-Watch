package sg.bigo.ads.common.u.a;

import android.net.Uri;
import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import java.io.BufferedOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import sg.bigo.ads.common.g;
import sg.bigo.ads.common.u.f;
import sg.bigo.ads.common.utils.k;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    final sg.bigo.ads.common.u.b.c<? extends sg.bigo.ads.common.u.a> f19699a;
    URL b;
    boolean c;
    private final b d;
    private final g e;
    private final URL f;
    private int g;
    private HttpURLConnection h;

    private c(sg.bigo.ads.common.u.b.c cVar, URL url, URL url2, b bVar, g gVar) {
        this.c = false;
        this.f19699a = cVar;
        this.b = url;
        this.f = url2;
        this.d = bVar;
        this.e = gVar;
        sg.bigo.ads.common.t.a.a(0, 3, "HttpRequest", "request, " + cVar + ", redirectURL= " + url2 + ", content=" + cVar.d());
    }

    public c(sg.bigo.ads.common.u.b.c cVar, b bVar, g gVar) {
        this(cVar, null, null, bVar, gVar);
    }

    private URL a(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (this.e == null || !this.f19699a.n) {
            return new URL(uri.toString());
        }
        Uri.Builder buildUpon = Uri.parse(uri.toString()).buildUpon();
        a(buildUpon, "sdk_ver", this.e.y());
        a(buildUpon, "sdk_vc", "50300");
        a(buildUpon, "country", this.e.U());
        a(buildUpon, "app_key", this.e.a());
        a(buildUpon, "pkg_ver", this.e.c());
        a(buildUpon, "pkg_vc", new StringBuilder().append(this.e.d()).toString());
        a(buildUpon, "os", this.e.i());
        a(buildUpon, "os_ver", this.e.j());
        a(buildUpon, "os_lang", this.e.k());
        a(buildUpon, "vendor", this.e.l());
        a(buildUpon, "model", this.e.m());
        a(buildUpon, "dpi", new StringBuilder().append(this.e.p()).toString());
        a(buildUpon, "dpi_f", this.e.q());
        a(buildUpon, "resolution", this.e.o());
        a(buildUpon, "net", this.e.r());
        a(buildUpon, com.anythink.expressad.foundation.g.a.Z, this.e.s());
        if (this.f19699a.f()) {
            a(buildUpon, "enc", "1");
        }
        return new URL(buildUpon.build().toString());
    }

    private static void a(Uri.Builder builder, String str, String str2) {
        if (builder == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public final HttpURLConnection a() {
        String str;
        URL url = this.f;
        if (url == null) {
            this.f19699a.a("PreHost");
            T t = this.f19699a.j;
            String a2 = t.a();
            String f = t.f();
            String d = t.d();
            if (!TextUtils.isEmpty(f) && !TextUtils.isEmpty(d) && !TextUtils.equals(f, d)) {
                this.f19699a.a("PreHost", f);
            }
            if (t.e()) {
                this.f19699a.a("Host", d);
            }
            this.f19699a.h();
            url = a(Uri.parse(a2));
            this.b = url;
        } else if (url != null && this.e != null && this.f19699a.n) {
            url = a(Uri.parse(url.toString()));
        }
        boolean equalsIgnoreCase = "HTTPS".equalsIgnoreCase(url.getProtocol());
        URLConnection openConnection = url.openConnection();
        this.h = equalsIgnoreCase ? (HttpsURLConnection) openConnection : (HttpURLConnection) openConnection;
        this.h.setInstanceFollowRedirects(false);
        this.h.setDoInput(true);
        this.h.setUseCaches(false);
        this.h.setConnectTimeout((int) this.f19699a.l);
        this.h.setReadTimeout((int) this.f19699a.l);
        this.h.setRequestMethod(this.f19699a.a());
        Map<String, Set<String>> map = this.f19699a.m;
        if (!map.containsKey(HttpHeaders.CONNECTION)) {
            map.put(HttpHeaders.CONNECTION, new HashSet(Collections.singletonList("Keep-Alive")));
        }
        Set<String> set = map.get("Range");
        Set<String> set2 = map.get("Accept-Encoding");
        if (k.a(set) && k.a(set2)) {
            this.c = true;
            map.put("Accept-Encoding", new HashSet(Collections.singletonList("gzip")));
        }
        if (!map.containsKey("Host")) {
            try {
                b bVar = this.d;
                String host = this.h.getURL().getHost();
                str = TextUtils.isEmpty(host) ? "" : bVar.f19698a.get(host);
            } catch (Exception unused) {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                map.put("Host", new HashSet(Collections.singletonList(str)));
            }
        }
        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            Set<String> value = entry.getValue();
            if (!TextUtils.isEmpty(key) && !k.a(value)) {
                for (String str2 : value) {
                    if (!TextUtils.isEmpty(str2)) {
                        this.h.addRequestProperty(key, str2);
                    }
                }
            }
        }
        byte[] c = this.f19699a.c();
        if (c != null && c.length > 0) {
            f b = this.f19699a.b();
            if (b != null) {
                this.h.setRequestProperty("Content-Type", b.toString());
            }
            this.h.setDoOutput(true);
            this.h.setRequestProperty("Content-Length", Long.toString(this.f19699a.e()));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(this.h.getOutputStream());
            bufferedOutputStream.write(c);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
        }
        return this.h;
    }

    public final c a(URL url) {
        c cVar = new c(this.f19699a, this.b, url, this.d, this.e);
        cVar.g = this.g + 1;
        return cVar;
    }

    public final boolean b() {
        return this.f != null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f != null) {
            sb.append("originUrl=").append(this.f19699a.g());
            sb.append(", redirectURL=").append(this.f);
            sb.append(", redirectCount=").append(this.g);
        } else {
            sb.append("requestUrl=").append(this.f19699a.g());
        }
        return sb.toString();
    }
}
