package sg.bigo.ads.api.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f19528a;
    private final List<WeakReference<InterfaceC1066a>> b;

    /* renamed from: sg.bigo.ads.api.core.a$a, reason: collision with other inner class name */
    public interface InterfaceC1066a {
        void a();

        void b();
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final a f19530a = new a(0);
    }

    private a() {
        this.b = new ArrayList();
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    public static a a() {
        return b.f19530a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Iterator<WeakReference<InterfaceC1066a>> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().get();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Iterator<WeakReference<InterfaceC1066a>> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().get();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Iterator<WeakReference<InterfaceC1066a>> it = this.b.iterator();
        while (it.hasNext()) {
            InterfaceC1066a interfaceC1066a = it.next().get();
            if (interfaceC1066a != null) {
                interfaceC1066a.b();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f19528a = new WeakReference<>(activity);
        Iterator<WeakReference<InterfaceC1066a>> it = this.b.iterator();
        while (it.hasNext()) {
            InterfaceC1066a interfaceC1066a = it.next().get();
            if (interfaceC1066a != null) {
                interfaceC1066a.a();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
