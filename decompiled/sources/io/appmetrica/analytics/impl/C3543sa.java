package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.BiFunction;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.sa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3543sa implements BiFunction {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.BiFunction
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Tm apply(Thread thread, StackTraceElement[] stackTraceElementArr) {
        String name = thread.getName();
        int priority = thread.getPriority();
        long id2 = thread.getId();
        ThreadGroup threadGroup = thread.getThreadGroup();
        return new Tm(name, priority, id2, threadGroup != null ? threadGroup.getName() : "", Integer.valueOf(thread.getState().ordinal()), stackTraceElementArr == null ? null : Arrays.asList(stackTraceElementArr));
    }
}
