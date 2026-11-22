package com.baidu.ar;

import android.content.Context;
import com.baidu.ar.rb;

/* loaded from: classes12.dex */
public class sb {
    public static sb c;

    /* renamed from: a, reason: collision with root package name */
    public rb f7191a;
    public boolean b = false;

    public sb(Context context) {
        this.f7191a = new rb(context);
    }

    public static synchronized sb a(Context context) {
        sb sbVar;
        synchronized (sb.class) {
            if (c == null) {
                c = new sb(context);
            }
            sbVar = c;
        }
        return sbVar;
    }

    public void a() {
        try {
            b();
        } catch (Throwable unused) {
        }
        if (this.f7191a != null) {
            this.f7191a = null;
        }
        if (c != null) {
            c = null;
        }
        this.b = false;
    }

    public void a(rb.a aVar) {
        rb rbVar = this.f7191a;
        if (rbVar != null) {
            rbVar.a(aVar);
            if (this.b) {
                return;
            }
            try {
                this.f7191a.a();
                this.b = true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void a(boolean z) {
        rb rbVar = this.f7191a;
        if (rbVar != null) {
            rbVar.a(z);
        }
    }

    public void b() {
        rb rbVar = this.f7191a;
        if (rbVar != null) {
            rbVar.b();
            this.b = false;
        }
    }
}
