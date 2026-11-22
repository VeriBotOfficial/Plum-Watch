package com.anythink.basead.mraid;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class a implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    Context f2912a;
    MraidBaseWebView c;
    protected Pattern d;
    protected String e;
    List<String> f = new ArrayList(Arrays.asList("open", "close", "unload", "useCustomClose", "expand"));
    Handler b = new Handler(Looper.getMainLooper(), this);

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        return false;
    }

    public a(Context context) {
        this.f2912a = context;
    }

    private void a(Pattern pattern) {
        this.d = pattern;
    }

    private void c(String str) {
        this.e = str;
    }

    private void a(MraidBaseWebView mraidBaseWebView) {
        this.c = mraidBaseWebView;
    }

    public final boolean a(String str) {
        if (!com.anythink.core.express.d.d.a(str)) {
            return false;
        }
        this.d = com.anythink.core.express.d.d.b(str);
        this.e = str;
        return true;
    }

    private String a() {
        return this.e;
    }

    public final void b(String str) {
        C0160a d;
        Object jsObject;
        char c;
        if (TextUtils.isEmpty(str) || (d = d(str)) == null || (jsObject = this.c.getJsObject(d.b)) == null || !(jsObject instanceof h)) {
            return;
        }
        try {
            String str2 = d.c;
            switch (str2.hashCode()) {
                case -1289167206:
                    if (str2.equals("expand")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -840442113:
                    if (str2.equals("unload")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3417674:
                    if (str2.equals("open")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 94756344:
                    if (str2.equals("close")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1614272768:
                    if (str2.equals("useCustomClose")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            String str3 = "{}";
            if (c == 0) {
                h hVar = (h) jsObject;
                if (!TextUtils.isEmpty(d.d)) {
                    str3 = d.d;
                }
                hVar.a(str3);
                return;
            }
            if (c == 1) {
                TextUtils.isEmpty(d.d);
                ((h) jsObject).a();
                return;
            }
            if (c == 2) {
                TextUtils.isEmpty(d.d);
                ((h) jsObject).b();
                return;
            }
            if (c == 3) {
                h hVar2 = (h) jsObject;
                if (!TextUtils.isEmpty(d.d)) {
                    str3 = d.d;
                }
                hVar2.b(str3);
                return;
            }
            if (c != 4) {
                return;
            }
            h hVar3 = (h) jsObject;
            if (!TextUtils.isEmpty(d.d)) {
                str3 = d.d;
            }
            hVar3.c(str3);
        } catch (Throwable unused) {
        }
    }

    private C0160a d(String str) {
        Set<String> unmodifiableSet;
        if (str == null) {
            return null;
        }
        C0160a c0160a = new C0160a();
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (TextUtils.isEmpty(scheme) || !scheme.contains("mraid")) {
            return null;
        }
        String host = parse.getHost();
        c0160a.c = host;
        if (!this.f.contains(host) && this.c != null) {
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(this.c, host);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(this.c, host, "Specified command is not implemented");
            return null;
        }
        String encodedQuery = parse.getEncodedQuery();
        if (encodedQuery == null) {
            unmodifiableSet = Collections.emptySet();
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            do {
                int indexOf = encodedQuery.indexOf(38, i);
                if (indexOf == -1) {
                    indexOf = encodedQuery.length();
                }
                int indexOf2 = encodedQuery.indexOf(61, i);
                if (indexOf2 > indexOf || indexOf2 == -1) {
                    indexOf2 = indexOf;
                }
                linkedHashSet.add(Uri.decode(encodedQuery.substring(i, indexOf2)));
                i = indexOf + 1;
            } while (i < encodedQuery.length());
            unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str2 : unmodifiableSet) {
                jSONObject.put(str2, parse.getQueryParameter(str2));
            }
            c0160a.d = jSONObject.toString();
            return c0160a;
        } catch (Exception e) {
            e.printStackTrace();
            return c0160a;
        }
    }

    private static Set<String> a(Uri uri) {
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        do {
            int indexOf = encodedQuery.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = encodedQuery.length();
            }
            int indexOf2 = encodedQuery.indexOf(61, i);
            if (indexOf2 > indexOf || indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            linkedHashSet.add(Uri.decode(encodedQuery.substring(i, indexOf2)));
            i = indexOf + 1;
        } while (i < encodedQuery.length());
        return Collections.unmodifiableSet(linkedHashSet);
    }

    private void a(C0160a c0160a) {
        char c;
        Object jsObject = this.c.getJsObject(c0160a.b);
        if (jsObject != null && (jsObject instanceof h)) {
            try {
                String str = c0160a.c;
                switch (str.hashCode()) {
                    case -1289167206:
                        if (str.equals("expand")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -840442113:
                        if (str.equals("unload")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3417674:
                        if (str.equals("open")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 94756344:
                        if (str.equals("close")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1614272768:
                        if (str.equals("useCustomClose")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                String str2 = "{}";
                if (c == 0) {
                    h hVar = (h) jsObject;
                    if (!TextUtils.isEmpty(c0160a.d)) {
                        str2 = c0160a.d;
                    }
                    hVar.a(str2);
                    return;
                }
                if (c == 1) {
                    TextUtils.isEmpty(c0160a.d);
                    ((h) jsObject).a();
                    return;
                }
                if (c == 2) {
                    TextUtils.isEmpty(c0160a.d);
                    ((h) jsObject).b();
                    return;
                }
                if (c == 3) {
                    h hVar2 = (h) jsObject;
                    if (!TextUtils.isEmpty(c0160a.d)) {
                        str2 = c0160a.d;
                    }
                    hVar2.b(str2);
                    return;
                }
                if (c != 4) {
                    return;
                }
                h hVar3 = (h) jsObject;
                if (!TextUtils.isEmpty(c0160a.d)) {
                    str2 = c0160a.d;
                }
                hVar3.c(str2);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.anythink.basead.mraid.a$a, reason: collision with other inner class name */
    public class C0160a {

        /* renamed from: a, reason: collision with root package name */
        public Object f2913a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;

        public C0160a() {
        }
    }
}
