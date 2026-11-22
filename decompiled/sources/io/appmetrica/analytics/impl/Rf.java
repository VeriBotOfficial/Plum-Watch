package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Rf {

    /* renamed from: a, reason: collision with root package name */
    public final C3101ag f18049a;
    public final Ga b;
    public final C3375lg c;
    public final Lazy d = LazyKt.lazy(new Of(this));
    public final Lazy e = LazyKt.lazy(new Mf(this));
    public final Lazy f = LazyKt.lazy(new Qf(this));
    public final ArrayList g = new ArrayList();

    public Rf(C3101ag c3101ag, C3350kg c3350kg, Ga ga, C3375lg c3375lg) {
        this.f18049a = c3101ag;
        this.b = ga;
        this.c = c3375lg;
    }

    public static final Jf a(Rf rf) {
        return (Jf) rf.d.getValue();
    }

    public static final void a(Rf rf, C3151cg c3151cg, Jf jf) {
        boolean areEqual;
        rf.g.add(c3151cg);
        C3375lg c3375lg = rf.c;
        if (c3151cg == null) {
            c3375lg.getClass();
        } else {
            SafePackageManager safePackageManager = c3375lg.b;
            Context context = c3375lg.f18380a;
            String installerPackageName = safePackageManager.getInstallerPackageName(context, context.getPackageName());
            int ordinal = c3151cg.d.ordinal();
            if (ordinal == 1) {
                areEqual = Intrinsics.areEqual(c3375lg.f, installerPackageName);
            } else if (ordinal == 2) {
                areEqual = Intrinsics.areEqual(c3375lg.g, installerPackageName);
            }
            if (areEqual) {
                rf.a(c3151cg);
                return;
            }
        }
        jf.a();
    }

    public final void a(C3151cg c3151cg) {
        C3101ag c3101ag = this.f18049a;
        synchronized (c3101ag) {
            c3101ag.b = c3151cg;
            c3101ag.c = true;
            c3101ag.d.a(c3151cg);
            c3101ag.d.d();
            c3101ag.a(c3101ag.b);
        }
    }
}
