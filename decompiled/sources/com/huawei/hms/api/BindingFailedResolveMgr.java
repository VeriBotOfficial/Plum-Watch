package com.huawei.hms.api;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
class BindingFailedResolveMgr {
    static final BindingFailedResolveMgr b = new BindingFailedResolveMgr();
    private static final Object c = new Object();

    /* renamed from: a, reason: collision with root package name */
    List<Activity> f10253a = new ArrayList(1);

    BindingFailedResolveMgr() {
    }

    void a(Activity activity) {
        synchronized (c) {
            for (Activity activity2 : this.f10253a) {
                if (activity2 != null && activity2 != activity && !activity2.isFinishing()) {
                    activity2.finish();
                }
            }
            this.f10253a.add(activity);
        }
    }

    void b(Activity activity) {
        synchronized (c) {
            this.f10253a.remove(activity);
        }
    }
}
