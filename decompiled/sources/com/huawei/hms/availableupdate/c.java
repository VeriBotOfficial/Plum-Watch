package com.huawei.hms.availableupdate;

import android.app.Activity;
import com.huawei.hms.support.log.HMSLog;
import com.yandex.div.core.timer.TimerController;
import java.lang.ref.WeakReference;

/* compiled from: UpdateAdapterMgr.java */
/* loaded from: classes14.dex */
public class c {
    public static final c b = new c();

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f10269a;

    public boolean a(Activity activity) {
        HMSLog.i("UpdateAdapterMgr", "onActivityCreate");
        Activity a2 = a();
        if (a2 == null || a2.isFinishing()) {
            this.f10269a = new WeakReference<>(activity);
            return true;
        }
        activity.finish();
        HMSLog.i("UpdateAdapterMgr", "finish one");
        return false;
    }

    public void b(Activity activity) {
        HMSLog.i("UpdateAdapterMgr", "onActivityDestroy");
        Activity a2 = a();
        if (activity == null || !activity.equals(a2)) {
            return;
        }
        HMSLog.i("UpdateAdapterMgr", TimerController.RESET_COMMAND);
        this.f10269a = null;
    }

    private Activity a() {
        WeakReference<Activity> weakReference = this.f10269a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }
}
