package com.efs.sdk.memleaksdk.monitor.shark;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes14.dex */
public class f implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private static final f f9910a = new f();
    private boolean b = true;
    private String c = "";
    private int d;
    private boolean e;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    private f() {
    }

    public static f a() {
        return f9910a;
    }

    public void a(Application application) {
        application.registerActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.c = "";
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        int i = this.d + 1;
        this.d = i;
        if (i == 1 && !this.e) {
            this.b = true;
            y.b.e();
        }
        this.c = activity.getComponentName().flattenToShortString();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.c = activity.getComponentName().flattenToShortString();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.c = "";
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        boolean isChangingConfigurations = activity.isChangingConfigurations();
        this.e = isChangingConfigurations;
        int i = this.d - 1;
        this.d = i;
        if (i == 0 && !isChangingConfigurations) {
            this.b = false;
            y.b.e();
        }
        this.c = "";
    }

    public String b() {
        return TextUtils.isEmpty(this.c) ? AbstractJsonLexerKt.NULL : this.c;
    }

    public boolean c() {
        return this.b;
    }
}
