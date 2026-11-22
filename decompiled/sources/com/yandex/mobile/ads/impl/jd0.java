package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.zd0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class jd0<T extends zd0<T>> extends pg0 {
    private final sg0 A;
    private final ed0 B;
    private cd0<T> C;
    private cd0<T> D;
    private T E;
    private final kd0<T> y;
    private final td0<T> z;

    protected abstract cd0<T> a(dd0 dd0Var);

    @Override // com.yandex.mobile.ads.impl.ck
    protected final void a(w3 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.y.a(error);
    }

    public /* synthetic */ jd0(Context context, o3 o3Var, bv1 bv1Var, kd0 kd0Var, g5 g5Var, td0 td0Var, sg0 sg0Var) {
        this(context, o3Var, bv1Var, kd0Var, g5Var, td0Var, sg0Var, new ed0(bv1Var));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd0(Context context, o3 adConfiguration, bv1 sdkEnvironmentModule, kd0<T> fullScreenLoadEventListener, g5 adLoadingPhasesManager, td0<T> fullscreenAdContentFactory, sg0 htmlAdResponseReportManager, ed0 adResponseControllerFactoryCreator) {
        super(context, adConfiguration, adLoadingPhasesManager);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(fullScreenLoadEventListener, "fullScreenLoadEventListener");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(fullscreenAdContentFactory, "fullscreenAdContentFactory");
        Intrinsics.checkNotNullParameter(htmlAdResponseReportManager, "htmlAdResponseReportManager");
        Intrinsics.checkNotNullParameter(adResponseControllerFactoryCreator, "adResponseControllerFactoryCreator");
        this.y = fullScreenLoadEventListener;
        this.z = fullscreenAdContentFactory;
        this.A = htmlAdResponseReportManager;
        this.B = adResponseControllerFactoryCreator;
        a(i9.f15790a.a());
    }

    @Override // com.yandex.mobile.ads.impl.ck
    public final void e() {
        if (oa.a((ro) this)) {
            return;
        }
        Context l = l();
        cd0[] cd0VarArr = {this.D, this.C};
        for (int i = 0; i < 2; i++) {
            cd0 cd0Var = cd0VarArr[i];
            if (cd0Var != null) {
                cd0Var.a(l);
            }
        }
        super.e();
    }

    @Override // com.yandex.mobile.ads.impl.ck
    protected final void s() {
        T t = this.E;
        if (t != null) {
            this.y.a(t);
        } else {
            this.y.a(w7.m());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.ck, com.yandex.mobile.ads.impl.xq1.b
    public void a(o8<String> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        super.a((o8) adResponse);
        this.A.a(adResponse);
        this.A.a(f());
        cd0<T> a2 = a(this.B.a(adResponse));
        this.D = this.C;
        this.C = a2;
        this.E = this.z.a(adResponse, f(), a2);
        Context a3 = p0.a();
        if (a3 != null) {
            sp0.a(new Object[0]);
        }
        if (a3 == null) {
            a3 = l();
        }
        a2.a(a3, adResponse);
    }

    @Override // com.yandex.mobile.ads.impl.ck
    protected final void r() {
        w3 error = w7.q();
        Intrinsics.checkNotNullParameter(error, "error");
        this.y.a(error);
    }
}
