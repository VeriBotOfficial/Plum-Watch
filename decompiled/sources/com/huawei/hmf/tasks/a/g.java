package com.huawei.hmf.tasks.a;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.util.Log;
import com.huawei.hmf.tasks.ExecuteResult;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes12.dex */
public final class g extends Fragment {
    private static final WeakHashMap<Activity, WeakReference<g>> b = new WeakHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    private final List<WeakReference<ExecuteResult<?>>> f10201a = new ArrayList();

    private static g a(Activity activity) {
        WeakHashMap<Activity, WeakReference<g>> weakHashMap = b;
        WeakReference<g> weakReference = weakHashMap.get(activity);
        if (weakReference != null && weakReference.get() != null) {
            return weakReference.get();
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        g gVar = null;
        try {
            g gVar2 = (g) fragmentManager.findFragmentByTag("com.huawei.hmf.tasks.lifecycle_fragment_tag");
            if (gVar2 == null) {
                try {
                    gVar = a(fragmentManager);
                } catch (ClassCastException e) {
                    e = e;
                    gVar = gVar2;
                    Log.e("LifecycleCallbackFrg", "found LifecycleCallbackFragment but the type do not match. " + e.getMessage());
                    return gVar;
                }
            } else {
                gVar = gVar2;
            }
            weakHashMap.put(activity, new WeakReference<>(gVar));
            return gVar;
        } catch (ClassCastException e2) {
            e = e2;
        }
    }

    private static g a(FragmentManager fragmentManager) {
        g gVar;
        g gVar2 = null;
        try {
            gVar = new g();
        } catch (Exception e) {
            e = e;
        }
        try {
            fragmentManager.beginTransaction().add(gVar, "com.huawei.hmf.tasks.lifecycle_fragment_tag").commitAllowingStateLoss();
            return gVar;
        } catch (Exception e2) {
            e = e2;
            gVar2 = gVar;
            Log.e("LifecycleCallbackFrg", "create fragment failed." + e.getMessage());
            return gVar2;
        }
    }

    public static void a(Activity activity, ExecuteResult executeResult) {
        g a2 = a(activity);
        if (a2 != null) {
            synchronized (a2.f10201a) {
                a2.f10201a.add(new WeakReference<>(executeResult));
            }
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        synchronized (this.f10201a) {
            Iterator<WeakReference<ExecuteResult<?>>> it = this.f10201a.iterator();
            while (it.hasNext()) {
                ExecuteResult<?> executeResult = it.next().get();
                if (executeResult != null) {
                    executeResult.cancel();
                }
            }
            this.f10201a.clear();
        }
    }
}
