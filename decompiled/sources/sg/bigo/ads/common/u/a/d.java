package sg.bigo.ads.common.u.a;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import sg.bigo.ads.common.utils.h;

/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    final HttpURLConnection f19700a;
    final int b;
    final h<List<String>> c;
    private final c d;
    private final String e;
    private final boolean f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final URL f19701a;
        public final String b;
        public final int c;
        public final String d;
        public final int e;

        private a(URL url, String str, int i, String str2, int i2) {
            this.f19701a = url;
            this.b = str;
            this.c = i;
            this.d = str2;
            this.e = i2;
        }

        /* synthetic */ a(URL url, String str, int i, String str2, int i2, byte b) {
            this(url, str, i, str2, i2);
        }
    }

    public d(c cVar) {
        this.d = cVar;
        HttpURLConnection a2 = cVar.a();
        this.f19700a = a2;
        this.b = a2.getResponseCode();
        this.e = a2.getRequestMethod();
        h<List<String>> hVar = new h<>();
        this.c = hVar;
        Map<String, List<String>> headerFields = a2.getHeaderFields();
        if (headerFields != null) {
            hVar.a(headerFields);
        }
        boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(a2.getContentEncoding());
        this.f = equalsIgnoreCase;
        if (equalsIgnoreCase && cVar.c) {
            hVar.b("Content-Encoding");
            hVar.b("Content-Length");
        }
    }

    private String a(String str) {
        List<String> a2 = this.c.a(str);
        int size = a2 != null ? a2.size() : 0;
        String str2 = "";
        while (TextUtils.isEmpty(str2) && size > 0) {
            str2 = a2.get(0);
        }
        return str2;
    }

    public final InputStream a() {
        InputStream inputStream = this.f19700a.getInputStream();
        return (this.f && this.d.c) ? new GZIPInputStream(inputStream) : inputStream;
    }

    public final a b() {
        int i = this.b;
        if (i == 307 || i == 308) {
            String a2 = a("Location");
            if (!this.e.equalsIgnoreCase("GET") && !this.e.equalsIgnoreCase("HEAD")) {
                return new a(null, a2, TypedValues.TransitionType.TYPE_STAGGERED, "redirect code(" + this.b + ") is only available for GET or HEAD method, current request method is " + this.e, this.b, (byte) 0);
            }
            return new a(null, a2, 0, "", this.b, (byte) 0);
        }
        switch (i) {
            case 300:
            case 301:
            case 302:
            case 303:
                String a3 = a("Location");
                if (TextUtils.isEmpty(a3)) {
                    return new a(null, a3, TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, "empty location.", this.b, (byte) 0);
                }
                try {
                    URL url = new URL(this.f19700a.getURL(), a3);
                    String url2 = url.toString();
                    if (TextUtils.equals(url2, this.f19700a.getURL().toString())) {
                        return new a(url, a3, TypedValues.TransitionType.TYPE_INTERPOLATOR, "redirect to the same url, location is " + a3 + ", redirectURL is " + url2, this.b, (byte) 0);
                    }
                    URL url3 = this.d.b;
                    if (url3 != null && TextUtils.equals(url2, url3.toString())) {
                        return new a(url, a3, 704, "redirect to origin url, location is " + a3 + ", redirectURL is " + url2, this.b, (byte) 0);
                    }
                    return new a(url, a3, 0, "", this.b, (byte) 0);
                } catch (Exception unused) {
                    return new a(null, a3, 708, "location->\"" + a3 + "\" is not a network url.", this.b, (byte) 0);
                }
            default:
                return null;
        }
    }
}
