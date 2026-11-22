package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.StartupParamsItem;
import io.appmetrica.analytics.StartupParamsItemStatus;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* renamed from: io.appmetrica.analytics.impl.vl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3629vl {

    /* renamed from: a, reason: collision with root package name */
    public final C3679xl f18555a = new C3679xl();

    public final StartupParamsItem a(IdentifiersResult identifiersResult) {
        StartupParamsItemStatus startupParamsItemStatus;
        String str = identifiersResult.f18623id;
        C3679xl c3679xl = this.f18555a;
        IdentifierStatus identifierStatus = identifiersResult.status;
        c3679xl.getClass();
        switch (AbstractC3654wl.f18569a[identifierStatus.ordinal()]) {
            case 1:
                startupParamsItemStatus = StartupParamsItemStatus.OK;
                break;
            case 2:
                startupParamsItemStatus = StartupParamsItemStatus.PROVIDER_UNAVAILABLE;
                break;
            case 3:
                startupParamsItemStatus = StartupParamsItemStatus.INVALID_VALUE_FROM_PROVIDER;
                break;
            case 4:
                startupParamsItemStatus = StartupParamsItemStatus.NETWORK_ERROR;
                break;
            case 5:
                startupParamsItemStatus = StartupParamsItemStatus.FEATURE_DISABLED;
                break;
            case 6:
                startupParamsItemStatus = StartupParamsItemStatus.FORBIDDEN_BY_CLIENT_CONFIG;
                break;
            default:
                startupParamsItemStatus = StartupParamsItemStatus.UNKNOWN_ERROR;
                break;
        }
        return new StartupParamsItem(str, startupParamsItemStatus, identifiersResult.errorExplanation);
    }
}
