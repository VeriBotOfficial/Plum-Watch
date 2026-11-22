package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.BiConsumer;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class Y2 implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z2 f18146a;

    public Y2(Z2 z2) {
        this.f18146a = z2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.BiConsumer
    public final void consume(Object obj, Object obj2) {
        Intent intent = (Intent) obj2;
        synchronized (this.f18146a) {
            Z2 z2 = this.f18146a;
            z2.b = intent;
            Iterator it = z2.f18163a.iterator();
            while (it.hasNext()) {
                ((Consumer) it.next()).consume(intent);
            }
        }
    }
}
