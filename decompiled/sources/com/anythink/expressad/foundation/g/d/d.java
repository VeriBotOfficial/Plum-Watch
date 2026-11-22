package com.anythink.expressad.foundation.g.d;

import android.text.TextUtils;
import com.anythink.expressad.foundation.g.f.f;
import com.anythink.expressad.foundation.g.f.l;
import java.io.File;

/* loaded from: classes12.dex */
public final class d extends com.anythink.expressad.foundation.g.h.a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4850a = "ImageWorker";
    private String b;
    private String c;
    private String g;
    private boolean h = false;
    private a i;

    public interface a {
        void a(String str, String str2);

        void b(String str, String str2);
    }

    private static void m() {
    }

    @Override // com.anythink.expressad.foundation.g.h.a
    public final void b() {
    }

    @Override // com.anythink.expressad.foundation.g.h.a
    public final void c() {
    }

    private String h() {
        return this.b;
    }

    private String i() {
        return this.c;
    }

    private String j() {
        return this.g;
    }

    private boolean k() {
        return this.h;
    }

    public final void a(boolean z) {
        this.h = z;
    }

    private a l() {
        return this.i;
    }

    public final void a(a aVar) {
        this.i = aVar;
    }

    public d(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.g = str3;
    }

    private void n() {
        try {
            File file = new File(this.g);
            if (!file.exists()) {
                file.mkdirs();
            }
            if (file.exists()) {
                file.delete();
            }
            com.anythink.expressad.foundation.g.f.h.a.a(file, this.c, new f<Void>() { // from class: com.anythink.expressad.foundation.g.d.d.1
                @Override // com.anythink.expressad.foundation.g.f.f, com.anythink.expressad.foundation.g.f.e
                public final void a() {
                }

                @Override // com.anythink.expressad.foundation.g.f.f, com.anythink.expressad.foundation.g.f.e
                public final void a(long j, long j2) {
                }

                @Override // com.anythink.expressad.foundation.g.f.f, com.anythink.expressad.foundation.g.f.e
                public final void a(l lVar) {
                    String unused = d.this.g;
                    d.this.d();
                }

                @Override // com.anythink.expressad.foundation.g.f.f, com.anythink.expressad.foundation.g.f.e
                public final void a(com.anythink.expressad.foundation.g.f.a.a aVar) {
                    d dVar = d.this;
                    dVar.b(dVar.c, "load image from http faild because http return code: " + aVar.f4854a + ".image url is " + d.this.c);
                }
            });
        } catch (Exception e) {
            b(this.c, e.getMessage());
            if (com.anythink.expressad.a.f4564a) {
                e.printStackTrace();
            }
        } catch (OutOfMemoryError e2) {
            b(this.c, e2.getMessage());
        }
    }

    protected final void d() {
        if (new File(this.g).length() > 0) {
            String str = this.c;
            String str2 = this.g;
            a aVar = this.i;
            if (aVar != null) {
                aVar.a(str, str2);
                return;
            }
            return;
        }
        b(this.c, "load image faild.because file[" + this.g + "] is not exist!");
    }

    private void a(String str, String str2) {
        a aVar = this.i;
        if (aVar != null) {
            aVar.a(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, String str2) {
        a aVar = this.i;
        if (aVar != null) {
            aVar.b(str, str2);
        }
    }

    @Override // com.anythink.expressad.foundation.g.h.a
    public final void a() {
        if (!this.h) {
            if (TextUtils.isEmpty(this.g)) {
                b(this.c, "save path is null.");
                return;
            }
            File file = new File(this.g);
            if (!file.exists() || file.length() <= 0) {
                n();
                return;
            } else {
                d();
                return;
            }
        }
        n();
    }
}
