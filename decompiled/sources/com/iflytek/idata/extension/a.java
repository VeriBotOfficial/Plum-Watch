package com.iflytek.idata.extension;

import android.content.Context;
import android.content.SharedPreferences;
import android.gov.nist.javax.sip.header.ims.AuthorizationHeaderIms;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.anythink.basead.c.b;
import com.iflytek.idata.extension.b;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private b.a f11228a = new C0658a();
    protected Context b;
    private boolean c;

    public a(Context context, boolean z) {
        this.b = context;
        this.c = z;
    }

    private boolean b() {
        SharedPreferences b;
        if (this.c || (b = com.iflytek.idata.extension.d.b.b(this.b)) == null) {
            return true;
        }
        return System.currentTimeMillis() - b.getLong("last_check_time", 0L) > 604800000;
    }

    @Override // java.lang.Runnable
    public void run() {
        a();
    }

    private void a() {
        try {
            SystemClock.sleep(10000L);
            if (b() && com.iflytek.idata.extension.d.b.a(this.b)) {
                b bVar = new b();
                bVar.b(20000);
                bVar.a(1);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("appid", IFlyCollectorExt.getInstance(this.b).getAppId());
                jSONObject.put("ver", IFlyCollectorExt.getInstance(this.b).a());
                jSONObject.put("impl", 2);
                jSONObject.put(b.a.A, this.b.getPackageName());
                bVar.a("https://logconf.iflytek.com/hotupdate", null, jSONObject.toString().getBytes("utf-8"));
                bVar.b(this.f11228a);
            }
        } catch (Throwable unused) {
            com.iflytek.idata.extension.d.a.c("Collector", "exception occur while update");
        }
    }

    /* renamed from: com.iflytek.idata.extension.a$a, reason: collision with other inner class name */
    class C0658a implements b.a {
        C0658a() {
        }

        @Override // com.iflytek.idata.extension.b.a
        public void a(b bVar, byte[] bArr) {
            if (bArr != null) {
                try {
                    a.this.a(new JSONObject(new String(bArr, "utf-8")));
                } catch (Exception e) {
                    a(e);
                }
            }
        }

        @Override // com.iflytek.idata.extension.b.a
        public void a(Exception exc) {
            com.iflytek.idata.extension.d.a.b("Collector", "update error:" + exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        if (AuthorizationHeaderIms.YES.equalsIgnoreCase(jSONObject.optString("update"))) {
            String optString = jSONObject.optString("msg");
            if (!TextUtils.isEmpty(optString)) {
                a(Base64.decode(optString, 0));
            }
        } else {
            com.iflytek.idata.extension.d.a.a("Collector", "no need to update");
        }
        SharedPreferences.Editor edit = com.iflytek.idata.extension.d.b.b(this.b).edit();
        edit.putLong("last_check_time", System.currentTimeMillis());
        edit.apply();
    }

    private void a(byte[] bArr) {
        BufferedOutputStream bufferedOutputStream;
        IFlyCollectorExt iFlyCollectorExt = IFlyCollectorExt.getInstance(this.b);
        iFlyCollectorExt.c();
        File file = new File(iFlyCollectorExt.b(), com.iflytek.idata.extension.d.b.a());
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                bufferedOutputStream = new BufferedOutputStream(fileOutputStream2);
                try {
                    bufferedOutputStream.write(bArr);
                    a(bufferedOutputStream);
                    a(fileOutputStream2);
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    try {
                        th.printStackTrace();
                    } finally {
                        a(bufferedOutputStream);
                        a(fileOutputStream);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedOutputStream = null;
        }
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
