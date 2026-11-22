package com.amap.api.col.p0003sl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import android.text.TextUtils;
import java.lang.ref.WeakReference;

/* compiled from: AdiuStorageModel.java */
/* loaded from: classes11.dex */
public final class v9 {
    public static final String c = m9.b("SU2hhcmVkUHJlZmVyZW5jZUFkaXU");
    private static v9 d;

    /* renamed from: a, reason: collision with root package name */
    private String f1934a;
    private final Context b;

    /* compiled from: AdiuStorageModel.java */
    final class a extends Thread {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1935a;
        final /* synthetic */ int b;

        a(String str, int i) {
            this.f1935a = str;
            this.b = i;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            String b = aa.b(this.f1935a);
            if (TextUtils.isEmpty(b)) {
                return;
            }
            if ((this.b & 1) > 0) {
                try {
                    if (Settings.System.canWrite(v9.this.b)) {
                        Settings.System.putString(v9.this.b.getContentResolver(), v9.this.f1934a, b);
                    }
                } catch (Exception unused) {
                }
            }
            if ((this.b & 16) > 0) {
                x9.a(v9.this.b, v9.this.f1934a, b);
            }
            if ((this.b & 256) > 0) {
                SharedPreferences.Editor edit = v9.this.b.getSharedPreferences(v9.c, 0).edit();
                edit.putString(v9.this.f1934a, b);
                edit.apply();
            }
        }
    }

    private v9(Context context) {
        this.b = context.getApplicationContext();
        if (Looper.myLooper() == null) {
            new b(Looper.getMainLooper(), this);
        } else {
            new b(this);
        }
    }

    /* compiled from: AdiuStorageModel.java */
    private static final class b extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<v9> f1936a;

        b(v9 v9Var) {
            this.f1936a = new WeakReference<>(v9Var);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object obj;
            v9 v9Var = this.f1936a.get();
            if (v9Var == null || message == null || (obj = message.obj) == null) {
                return;
            }
            v9Var.a((String) obj, message.what);
        }

        b(Looper looper, v9 v9Var) {
            super(looper);
            this.f1936a = new WeakReference<>(v9Var);
        }
    }

    public final void b(String str) {
        a(str, 272);
    }

    public static v9 a(Context context) {
        if (d == null) {
            synchronized (v9.class) {
                if (d == null) {
                    d = new v9(context);
                }
            }
        }
        return d;
    }

    public final void a(String str) {
        this.f1934a = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(String str, int i) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            new a(str, i).start();
            return;
        }
        String b2 = aa.b(str);
        if (!TextUtils.isEmpty(b2)) {
            if ((i & 1) > 0) {
                try {
                    Settings.System.putString(this.b.getContentResolver(), this.f1934a, b2);
                } catch (Exception unused) {
                }
            }
            if ((i & 16) > 0) {
                x9.a(this.b, this.f1934a, b2);
            }
            if ((i & 256) > 0) {
                SharedPreferences.Editor edit = this.b.getSharedPreferences(c, 0).edit();
                edit.putString(this.f1934a, b2);
                edit.apply();
            }
        }
    }
}
