package com.vivo.push.restructure.b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.vivo.push.PushConfig;
import com.vivo.push.util.aa;
import com.vivo.push.util.g;
import com.vivo.push.util.t;
import com.vivo.push.util.z;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: PushRelyImpl.java */
/* loaded from: classes2.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    private static Map<String, c> f14125a = new ConcurrentHashMap();
    private String b;
    private z c;
    private volatile PushConfig d;

    @Override // com.vivo.push.restructure.b.a
    public final int l() {
        return 31;
    }

    public d(z zVar) {
        this.c = zVar;
    }

    @Override // com.vivo.push.restructure.b.a
    public final String a(Context context, String str) {
        if (!TextUtils.isEmpty(this.b)) {
            return this.b;
        }
        if (context == null || TextUtils.isEmpty(str)) {
            t.a("PushRelyImpl", "getReceiverClassName() params error, context = " + context + ", action = " + str);
            return "";
        }
        String packageName = context.getPackageName();
        String a2 = a(context, packageName, str);
        this.b = a2;
        if (TextUtils.isEmpty(a2)) {
            t.d("PushRelyImpl", " reflectReceiver error: receiver for: " + str + " not found, package: " + packageName);
        }
        return this.b;
    }

    private static String a(Context context, String str, String str2) {
        List<ResolveInfo> queryBroadcastReceivers;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Intent intent = new Intent(str2);
            intent.setPackage(str);
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 64)) != null && queryBroadcastReceivers.size() > 0) {
                    return queryBroadcastReceivers.get(0).activityInfo.name;
                }
            } catch (Exception e) {
                t.a("PushRelyImpl", "error  " + e.getMessage());
            }
        }
        return null;
    }

    @Override // com.vivo.push.restructure.b.a
    public final String a() {
        c cVar = f14125a.get(com.vivo.push.restructure.a.a().b().getPackageName());
        if (cVar != null) {
            String a2 = cVar.a();
            if (!TextUtils.isEmpty(a2)) {
                return a2;
            }
        }
        String c = this.c.c();
        if (!TextUtils.isEmpty(c)) {
            if (cVar == null) {
                cVar = new c();
            }
            cVar.a(c);
            f14125a.put(com.vivo.push.restructure.a.a().b().getPackageName(), cVar);
        }
        return c;
    }

    @Override // com.vivo.push.restructure.b.a
    public final void b() {
        a("");
    }

    @Override // com.vivo.push.restructure.b.a
    public final String c() {
        c cVar = f14125a.get(com.vivo.push.restructure.a.a().b().getPackageName());
        if (cVar != null) {
            String b = cVar.b();
            if (!TextUtils.isEmpty(b)) {
                return b;
            }
        }
        String d = this.c.d();
        if (!TextUtils.isEmpty(d)) {
            if (cVar == null) {
                cVar = new c();
            }
            cVar.b(d);
            f14125a.put(com.vivo.push.restructure.a.a().b().getPackageName(), cVar);
        }
        return d;
    }

    @Override // com.vivo.push.restructure.b.a
    public final void a(String str) {
        this.c.a("APP_APPID", str);
        c cVar = f14125a.get(com.vivo.push.restructure.a.a().b().getPackageName());
        if (cVar == null) {
            cVar = new c();
        }
        cVar.a(str);
        f14125a.put(com.vivo.push.restructure.a.a().b().getPackageName(), cVar);
    }

    @Override // com.vivo.push.restructure.b.a
    public final void b(String str) {
        this.c.a("APP_APIKEY", str);
        c cVar = f14125a.get(com.vivo.push.restructure.a.a().b().getPackageName());
        if (cVar == null) {
            cVar = new c();
        }
        cVar.b(str);
        f14125a.put(com.vivo.push.restructure.a.a().b().getPackageName(), cVar);
    }

    @Override // com.vivo.push.restructure.b.a
    public final void d() {
        b("");
    }

    @Override // com.vivo.push.restructure.b.a
    public final void e() {
        this.c.b();
        f14125a.clear();
    }

    @Override // com.vivo.push.restructure.b.a
    public final String f() {
        return this.c.b("APP_TOKEN", (String) null);
    }

    @Override // com.vivo.push.restructure.b.a
    public final void c(String str) {
        this.c.a("APP_TOKEN", str);
    }

    @Override // com.vivo.push.restructure.b.a
    public final String g() {
        return this.c.b("APP_TAGS", (String) null);
    }

    @Override // com.vivo.push.restructure.b.a
    public final void d(String str) {
        this.c.a("APP_TAGS", str);
    }

    @Override // com.vivo.push.restructure.b.a
    public final void h() {
        this.c.c("APP_TAGS");
    }

    @Override // com.vivo.push.restructure.b.a
    public final String i() {
        return this.c.b("APP_ALIAS", (String) null);
    }

    @Override // com.vivo.push.restructure.b.a
    public final void e(String str) {
        this.c.a("APP_ALIAS", str);
    }

    @Override // com.vivo.push.restructure.b.a
    public final void j() {
        this.c.c("APP_ALIAS");
    }

    @Override // com.vivo.push.restructure.b.a
    public final String k() {
        com.vivo.push.model.a a2 = aa.a(com.vivo.push.restructure.a.a().b(), com.vivo.push.restructure.a.a().f());
        if (a2 == null || a2.c()) {
            return null;
        }
        return a2.a();
    }

    @Override // com.vivo.push.restructure.b.a
    public final PushConfig m() {
        if (this.d != null) {
            return this.d;
        }
        int b = this.c.b("PUSH_CLIENT_CONFIG", 1);
        return new PushConfig.Builder().agreePrivacyStatement((b & 1) != 0).openMultiUserMode((b & 2) != 0).build();
    }

    @Override // com.vivo.push.restructure.b.a
    public final void a(PushConfig pushConfig) {
        int i;
        if (pushConfig == null) {
            return;
        }
        this.d = pushConfig;
        Context b = com.vivo.push.restructure.a.a().b();
        if (pushConfig == null) {
            i = 1;
        } else {
            i = (pushConfig.isAgreePrivacyStatement() ? 1 : 0) | (pushConfig.isOpenMultiUser() ? 2 : 0);
        }
        this.c.a("PUSH_CLIENT_CONFIG", i);
        g.a().execute(new e(this, b, pushConfig));
    }
}
