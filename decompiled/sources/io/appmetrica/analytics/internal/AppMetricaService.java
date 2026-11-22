package io.appmetrica.analytics.internal;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import io.appmetrica.analytics.impl.A1;
import io.appmetrica.analytics.impl.B1;
import io.appmetrica.analytics.impl.BinderC3534s1;
import io.appmetrica.analytics.impl.C3154cj;
import io.appmetrica.analytics.impl.C3179dj;
import io.appmetrica.analytics.impl.C3509r1;
import io.appmetrica.analytics.impl.C3538s5;
import io.appmetrica.analytics.impl.C3593ua;
import io.appmetrica.analytics.impl.C3609v1;
import io.appmetrica.analytics.impl.C3659x1;
import io.appmetrica.analytics.impl.C3684y1;
import io.appmetrica.analytics.impl.C3709z1;
import io.appmetrica.analytics.impl.F1;
import io.appmetrica.analytics.impl.I1;
import io.appmetrica.analytics.impl.L1;
import io.appmetrica.analytics.impl.Pj;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes6.dex */
public class AppMetricaService extends Service {
    private static F1 c;

    /* renamed from: a, reason: collision with root package name */
    private final C3509r1 f18620a = new C3509r1(this);
    private final a b = new a();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        String action = intent.getAction();
        IBinder binderC3534s1 = (action == null || !action.startsWith("io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK")) ? this.b : new BinderC3534s1();
        F1 f1 = c;
        f1.f17841a.execute(new C3709z1(f1, intent));
        return binderC3534s1;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        F1 f1 = c;
        f1.f17841a.execute(new C3609v1(f1, configuration));
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        C3593ua.a(getApplicationContext());
        PublicLogger.init(getApplicationContext());
        F1 f1 = c;
        if (f1 == null) {
            Context applicationContext = getApplicationContext();
            I1 i1 = new I1(applicationContext, this.f18620a, new C3538s5(applicationContext));
            Pj pj = C3593ua.E.v;
            L1 l1 = new L1(i1);
            LinkedHashMap linkedHashMap = pj.f18015a;
            Object obj = linkedHashMap.get(1);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(1, obj);
            }
            ((List) obj).add(l1);
            c = new F1(C3593ua.E.d.b(), i1);
        } else {
            f1.b.a(this.f18620a);
        }
        C3593ua c3593ua = C3593ua.E;
        C3179dj c3179dj = new C3179dj(c);
        synchronized (c3593ua) {
            c3593ua.f = new C3154cj(c3593ua.f18531a, c3179dj);
        }
        c.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        c.onDestroy();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        super.onRebind(intent);
        F1 f1 = c;
        f1.f17841a.execute(new A1(f1, intent));
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i) {
        F1 f1 = c;
        f1.f17841a.execute(new C3659x1(f1, intent, i));
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        F1 f1 = c;
        f1.f17841a.execute(new C3684y1(f1, intent, i, i2));
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        F1 f1 = c;
        f1.f17841a.execute(new B1(f1, intent));
        String action = intent.getAction();
        return (action == null || !action.startsWith("io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK")) && intent.getData() != null;
    }
}
