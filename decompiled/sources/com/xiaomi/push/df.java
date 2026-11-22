package com.xiaomi.push;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes4.dex */
public class df implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private Context f14522a;

    /* renamed from: a, reason: collision with other field name */
    private String f342a;
    private String b;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    public df(Context context, String str) {
        this.f14522a = context;
        this.f342a = str;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (TextUtils.isEmpty(this.b)) {
            this.b = activity.getLocalClassName();
        }
        this.f342a = String.valueOf(System.currentTimeMillis() / 1000);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (TextUtils.isEmpty(this.f342a) || TextUtils.isEmpty(localClassName)) {
            return;
        }
        this.b = "";
        if (!TextUtils.isEmpty("") && !TextUtils.equals(this.b, localClassName)) {
            this.f342a = "";
            return;
        }
        a(this.f14522a.getPackageName() + "|" + localClassName + ":" + this.f342a + "," + String.valueOf(System.currentTimeMillis() / 1000));
        this.f342a = "";
        this.b = "";
    }

    private void a(String str) {
        go goVar = new go();
        goVar.a(str);
        goVar.a(System.currentTimeMillis());
        goVar.a(gi.ActivityActiveTimeStamp);
        dm.a(this.f14522a, goVar);
    }
}
