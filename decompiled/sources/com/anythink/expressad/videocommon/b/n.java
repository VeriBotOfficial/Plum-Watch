package com.anythink.expressad.videocommon.b;

import android.gov.nist.core.Separators;
import android.net.Uri;
import android.text.TextUtils;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.foundation.h.z;
import com.anythink.expressad.videocommon.b.h;
import com.phancy.mini.utils.MiniStorage;
import java.io.File;
import java.util.List;

/* loaded from: classes12.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5529a = "foldername";
    public static final String b = "md5filename";
    public static final String c = "nc";
    public static final int d = 259200000;
    private static String e = "ResourceManager";
    private String f;

    /* synthetic */ n(byte b2) {
        this();
    }

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        public static n f5531a = new n(0);

        private a() {
        }
    }

    private n() {
        this.f = com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_700_RES);
    }

    public static n a() {
        return a.f5531a;
    }

    private void c() {
        this.f = com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_700_RES);
    }

    public final void b() {
        try {
            if (TextUtils.isEmpty(this.f)) {
                return;
            }
            h.a.f5520a.a(new com.anythink.expressad.foundation.g.h.a() { // from class: com.anythink.expressad.videocommon.b.n.1
                @Override // com.anythink.expressad.foundation.g.h.a
                public final void b() {
                }

                @Override // com.anythink.expressad.foundation.g.h.a
                public final void c() {
                }

                @Override // com.anythink.expressad.foundation.g.h.a
                public final void a() {
                    com.anythink.expressad.foundation.h.p.c(n.this.f);
                }
            });
        } catch (Exception e2) {
            if (com.anythink.expressad.a.f4564a) {
                e2.printStackTrace();
            }
        }
    }

    public final String a(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return this.f + "/" + s.a(z.b(str)) + ".zip";
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public final synchronized String a(String str, String str2) {
        String str3;
        str3 = "unknow exception ";
        try {
            if (!TextUtils.isEmpty(str2)) {
                File file = new File(str2);
                if (file.exists()) {
                    Uri parse = Uri.parse(str);
                    List<String> queryParameters = parse.getQueryParameters("nc");
                    if (queryParameters != null && queryParameters.size() != 0) {
                        str3 = a(str, str2, file);
                    }
                    List<String> queryParameters2 = parse.getQueryParameters("md5filename");
                    if (queryParameters2 != null && queryParameters2.size() > 0) {
                        String str4 = queryParameters2.get(0);
                        if (!TextUtils.isEmpty(str4) && str4.equals(com.anythink.expressad.foundation.h.o.a(file))) {
                            str3 = a(str, str2, file);
                        }
                    }
                }
                if (!TextUtils.isEmpty(str3)) {
                    com.anythink.expressad.foundation.h.p.b(file);
                }
            }
        } catch (Exception e2) {
            if (com.anythink.expressad.a.f4564a) {
                e2.printStackTrace();
            }
            str3 = e2.getMessage();
        }
        return str3;
    }

    private String a(String str, String str2, File file) {
        String a2 = com.anythink.expressad.foundation.h.p.a(str2, this.f + "/" + s.a(z.b(str)));
        return TextUtils.isEmpty(a2) ? com.anythink.expressad.foundation.h.p.b(file) : a2;
    }

    public final String b(String str) {
        String str2;
        try {
            String str3 = this.f + "/" + s.a(z.b(str));
            List<String> queryParameters = Uri.parse(str).getQueryParameters("foldername");
            if (queryParameters == null || queryParameters.size() <= 0) {
                return null;
            }
            String str4 = queryParameters.get(0);
            if (TextUtils.isEmpty(str4)) {
                return null;
            }
            String str5 = str3 + "/" + str4 + "/" + str4 + ".html";
            if (!com.anythink.expressad.foundation.h.p.a(str5)) {
                return null;
            }
            try {
                str2 = str.substring(str.indexOf(Separators.QUESTION) + 1);
            } catch (Exception unused) {
                str2 = "";
            }
            return MiniStorage.SCHEME_FILE + str5 + (TextUtils.isEmpty(str2) ? "" : Separators.QUESTION.concat(String.valueOf(str2)));
        } catch (Exception e2) {
            if (!com.anythink.expressad.a.f4564a) {
                return null;
            }
            e2.printStackTrace();
            return null;
        }
    }
}
