package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.HashSet;

/* loaded from: classes6.dex */
public final class L6 implements DataSendingRestrictionController {

    /* renamed from: a, reason: collision with root package name */
    public final J6 f17952a;
    public Boolean b;
    public final HashSet c = new HashSet();
    public final HashSet d = new HashSet();

    public L6(J6 j6) {
        this.f17952a = j6;
        this.b = ((K6) j6).a();
    }

    public final synchronized void a(Boolean bool) {
        if (In.a(bool) || this.b == null) {
            Boolean valueOf = Boolean.valueOf(Boolean.FALSE.equals(bool));
            this.b = valueOf;
            J6 j6 = this.f17952a;
            ((K6) j6).f17932a.c(valueOf.booleanValue()).b();
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final boolean isRestrictedForBackgroundDataCollection() {
        Boolean bool = this.b;
        return bool == null ? !this.c.isEmpty() || this.d.isEmpty() : bool.booleanValue();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForReporter() {
        Boolean bool;
        bool = this.b;
        return bool == null ? this.d.isEmpty() && this.c.isEmpty() : bool.booleanValue();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForSdk() {
        Boolean bool;
        bool = this.b;
        return bool == null ? this.d.isEmpty() : bool.booleanValue();
    }

    public final synchronized void a(String str, Boolean bool) {
        if (In.a(bool) || (!this.d.contains(str) && !this.c.contains(str))) {
            if (((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue()) {
                this.d.add(str);
                this.c.remove(str);
            } else {
                this.c.add(str);
                this.d.remove(str);
            }
        }
    }
}
