package com.qumeng.overseas.advlib.__remote__.ui.incite;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.qumeng.overseas.advlib.__remote__.utils.n;

/* loaded from: classes17.dex */
public class g extends com.qumeng.overseas.advlib.__remote__.framework.Ch4omeFw.dialog.a implements Application.ActivityLifecycleCallbacks {
    protected Context pAppContext;
    protected int pCurrentComponent;

    public g(Context context) {
        super(context);
        this.pCurrentComponent = 0;
        if (context instanceof Activity) {
            context = ((Activity) context).getWindow().getContext();
            this.pCurrentComponent = context.hashCode();
        }
        Context a2 = com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a();
        this.pAppContext = a2;
        if (a2 == null) {
            n.b("获取Application失败");
            this.pAppContext = context.getApplicationContext();
        }
    }

    @Override // com.qumeng.overseas.advlib.__remote__.framework.Ch4omeFw.dialog.a, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        Context context = this.pAppContext;
        if (context instanceof Application) {
            ((Application) context).unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (activity != null && this.pCurrentComponent == activity.hashCode()) {
            onCurrentActivityDestroyed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (activity != null && this.pCurrentComponent == activity.hashCode()) {
            onCurrentActivityResumed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (activity != null && this.pCurrentComponent == activity.hashCode()) {
            onCurrentActivityStopped(activity);
        }
    }

    protected void onCurrentActivityDestroyed(Activity activity) {
        dismiss();
    }

    protected void onCurrentActivityResumed(Activity activity) {
    }

    protected void onCurrentActivityStopped(Activity activity) {
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        Context context = this.pAppContext;
        if (context instanceof Application) {
            ((Application) context).unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // com.qumeng.overseas.advlib.__remote__.framework.Ch4omeFw.dialog.a, android.app.Dialog
    public void show() {
        super.show();
        Context context = this.pAppContext;
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }
}
