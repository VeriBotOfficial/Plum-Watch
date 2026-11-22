package com.anythink.expressad.videocommon.b;

import android.text.TextUtils;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.foundation.h.z;
import com.anythink.expressad.videocommon.b.h;
import java.io.File;

/* loaded from: classes12.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final int f5524a = 259200000;
    private static final String b = "HTMLResourceManager";
    private String c;

    /* synthetic */ j(byte b2) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        public static j f5526a = new j(0);

        private a() {
        }
    }

    private j() {
        this.c = com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_700_HTML);
    }

    public static j a() {
        return a.f5526a;
    }

    private void c() {
        this.c = com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_700_HTML);
    }

    public final void b() {
        try {
            if (TextUtils.isEmpty(this.c)) {
                return;
            }
            h.a.f5520a.a(new com.anythink.expressad.foundation.g.h.a() { // from class: com.anythink.expressad.videocommon.b.j.1
                @Override // com.anythink.expressad.foundation.g.h.a
                public final void b() {
                }

                @Override // com.anythink.expressad.foundation.g.h.a
                public final void c() {
                }

                @Override // com.anythink.expressad.foundation.g.h.a
                public final void a() {
                    com.anythink.expressad.foundation.h.p.c(j.this.c);
                }
            });
        } catch (Exception e) {
            if (com.anythink.expressad.a.f4564a) {
                e.printStackTrace();
            }
        }
    }

    public final String a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.c + "/" + s.a(z.b(str)) + ".html";
        }
        return "";
    }

    public final boolean a(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2)) {
                return false;
            }
            return new File(new StringBuilder().append(this.c).append("/").append(s.a(z.b(str))).append(".html").toString()).exists();
        } catch (Exception e) {
            if (!com.anythink.expressad.a.f4564a) {
                return false;
            }
            e.printStackTrace();
            return false;
        }
    }

    public final String b(String str) {
        try {
            String str2 = this.c + "/" + s.a(z.b(str)) + ".html";
            if (new File(str2).exists()) {
                return "file:////".concat(String.valueOf(str2));
            }
            return null;
        } catch (Throwable th) {
            if (!com.anythink.expressad.a.f4564a) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    public final String c(String str) {
        try {
            File file = new File(this.c + "/" + s.a(z.b(str)) + ".html");
            if (file.length() > 0) {
                return com.anythink.expressad.foundation.h.p.a(file);
            }
            return null;
        } catch (Throwable th) {
            if (!com.anythink.expressad.a.f4564a) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }
}
