package com.huawei.hms.push;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.support.log.HMSLog;

/* compiled from: SelfShowType.java */
/* loaded from: classes14.dex */
public class s {
    private static final String[] c = {"url", "app", "cosa", "rp"};

    /* renamed from: a, reason: collision with root package name */
    private Context f10487a;
    private m b;

    public s(Context context, m mVar) {
        this.f10487a = context;
        this.b = mVar;
    }

    public static boolean a(String str) {
        for (String str2 : c) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private void b() {
        HMSLog.i("PushSelfShowLog", "run into launchCosaApp");
        try {
            HMSLog.i("PushSelfShowLog", "enter launchExistApp cosa, appPackageName =" + this.b.d() + ",and msg.intentUri is " + this.b.n());
            Intent b = d.b(this.f10487a, this.b.d());
            boolean z = false;
            if (this.b.n() != null) {
                try {
                    Intent parseUri = Intent.parseUri(this.b.n(), 0);
                    parseUri.setSelector(null);
                    if (parseUri.getClipData() == null) {
                        parseUri.setClipData(ClipData.newPlainText("avoid intent add read permission flags", "avoid"));
                    }
                    HMSLog.i("PushSelfShowLog", "Intent.parseUri(msg.intentUri, 0), action:" + parseUri.getAction());
                    z = d.a(this.f10487a, this.b.d(), parseUri).booleanValue();
                    if (z) {
                        b = parseUri;
                    }
                } catch (Exception e) {
                    HMSLog.w("PushSelfShowLog", "intentUri error." + e.toString());
                }
            } else if (this.b.a() != null) {
                Intent intent = new Intent(this.b.a());
                if (d.a(this.f10487a, this.b.d(), intent).booleanValue()) {
                    b = intent;
                }
            }
            if (b == null) {
                HMSLog.i("PushSelfShowLog", "launchCosaApp,intent == null");
                return;
            }
            b.setPackage(this.b.d());
            if (z) {
                b.addFlags(268435456);
            } else {
                b.setFlags(805437440);
            }
            this.f10487a.startActivity(b);
        } catch (Exception e2) {
            HMSLog.e("PushSelfShowLog", "launch Cosa App exception." + e2.toString());
        }
    }

    public void c() {
        m mVar;
        HMSLog.d("PushSelfShowLog", "enter launchNotify()");
        if (this.f10487a == null || (mVar = this.b) == null) {
            HMSLog.d("PushSelfShowLog", "launchNotify  context or msg is null");
            return;
        }
        if ("app".equals(mVar.i())) {
            a();
            return;
        }
        if ("cosa".equals(this.b.i())) {
            b();
            return;
        }
        if ("rp".equals(this.b.i())) {
            HMSLog.w("PushSelfShowLog", this.b.i() + " not support rich message.");
        } else if ("url".equals(this.b.i())) {
            HMSLog.w("PushSelfShowLog", this.b.i() + " not support URL.");
        } else {
            HMSLog.d("PushSelfShowLog", this.b.i() + " is not exist in hShowType");
        }
    }

    private void a() {
        try {
            HMSLog.i("PushSelfShowLog", "enter launchApp, appPackageName =" + this.b.d());
            if (d.c(this.f10487a, this.b.d())) {
                b();
            }
        } catch (Exception e) {
            HMSLog.e("PushSelfShowLog", "launchApp error:" + e.toString());
        }
    }
}
