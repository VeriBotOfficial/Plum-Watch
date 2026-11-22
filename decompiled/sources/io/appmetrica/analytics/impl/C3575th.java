package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ICrashTransformer;

/* renamed from: io.appmetrica.analytics.impl.th, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3575th extends AbstractC3564t6 {
    public final AbstractC3581tn d;

    public C3575th(Context context, AbstractC3581tn abstractC3581tn, InterfaceC3539s6 interfaceC3539s6, ICrashTransformer iCrashTransformer) {
        this(abstractC3581tn, interfaceC3539s6, iCrashTransformer, new T9(context));
    }

    public final AbstractC3581tn c() {
        return this.d;
    }

    public C3575th(AbstractC3581tn abstractC3581tn, InterfaceC3539s6 interfaceC3539s6, ICrashTransformer iCrashTransformer, T9 t9) {
        super(interfaceC3539s6, iCrashTransformer, t9);
        this.d = abstractC3581tn;
    }
}
