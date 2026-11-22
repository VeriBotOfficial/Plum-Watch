package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* loaded from: classes6.dex */
public abstract class Yg implements Zg {

    /* renamed from: a, reason: collision with root package name */
    protected final DataSendingRestrictionController f18156a;

    public Yg(DataSendingRestrictionController dataSendingRestrictionController) {
        this.f18156a = dataSendingRestrictionController;
    }

    @Override // io.appmetrica.analytics.impl.Zg
    public boolean a(Boolean bool) {
        return ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
