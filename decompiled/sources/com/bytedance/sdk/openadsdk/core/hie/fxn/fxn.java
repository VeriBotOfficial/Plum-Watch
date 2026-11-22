package com.bytedance.sdk.openadsdk.core.hie.fxn;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes14.dex */
public class fxn implements Application.ActivityLifecycleCallbacks {
    private static volatile fxn fxn;
    private final kg kg;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    private fxn(Application application) {
        this.kg = kg.fxn(application);
    }

    public static fxn fxn(Application application) {
        if (fxn == null) {
            synchronized (fxn.class) {
                if (fxn == null) {
                    fxn = new fxn(application);
                    application.registerActivityLifecycleCallbacks(fxn);
                }
            }
        }
        return fxn;
    }

    public String fxn(String str, long j, int i) {
        kg kgVar = this.kg;
        if (kgVar != null) {
            return kgVar.fxn(str, j, i);
        }
        return AbstractJsonLexerKt.NULL;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        kg kgVar = this.kg;
        if (kgVar != null) {
            kgVar.fxn(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        kg kgVar = this.kg;
        if (kgVar != null) {
            kgVar.kg(activity);
        }
    }
}
