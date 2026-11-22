package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* renamed from: io.appmetrica.analytics.impl.lj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3378lj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserProfile f18383a;

    public C3378lj(UserProfile userProfile) {
        this.f18383a = userProfile;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.reportUserProfile(this.f18383a);
    }
}
