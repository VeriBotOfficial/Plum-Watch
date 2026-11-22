package com.xiaomi.push;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private Context f14825a;

    /* renamed from: a, reason: collision with other field name */
    private File f1123a;

    /* renamed from: a, reason: collision with other field name */
    private Runnable f1124a;

    protected abstract void a(Context context);

    private v(Context context, File file) {
        this.f14825a = context;
        this.f1123a = file;
    }

    public static void a(Context context, File file, final Runnable runnable) {
        new v(context, file) { // from class: com.xiaomi.push.v.1
            @Override // com.xiaomi.push.v
            protected void a(Context context2) {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        }.run();
    }

    @Override // java.lang.Runnable
    public final void run() {
        u uVar = null;
        try {
            try {
                if (this.f1123a == null) {
                    this.f1123a = new File(this.f14825a.getFilesDir(), "default_locker");
                }
                uVar = u.a(this.f14825a, this.f1123a);
                Runnable runnable = this.f1124a;
                if (runnable != null) {
                    runnable.run();
                }
                a(this.f14825a);
                if (uVar != null) {
                    uVar.a();
                }
            } catch (IOException e) {
                e.printStackTrace();
                if (uVar != null) {
                    uVar.a();
                }
            }
        } catch (Throwable th) {
            if (uVar != null) {
                uVar.a();
            }
            throw th;
        }
    }
}
