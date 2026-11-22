package io.appmetrica.analytics.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class Hd extends FunctionReferenceImpl implements Function1 {
    public Hd(Id id2) {
        super(1, id2, Id.class, "markCrashCompletedAndDeleteCompletedCrashes", "markCrashCompletedAndDeleteCompletedCrashes(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Id id2 = (Id) this.receiver;
        id2.f17906a.markCrashCompleted((String) obj);
        id2.f17906a.deleteCompletedCrashes();
        return Unit.INSTANCE;
    }
}
