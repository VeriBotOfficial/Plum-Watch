package com.wakeup.feature.health.dashboard;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HealthDashboardViewModel.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.feature.health.dashboard.HealthDashboardViewModel", f = "HealthDashboardViewModel.kt", i = {0, 0, 0}, l = {56, 58}, m = "publish", n = {"this", "config", "emitRoute"}, s = {"L$0", "L$1", "Z$0"})
/* loaded from: classes3.dex */
final class HealthDashboardViewModel$publish$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HealthDashboardViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HealthDashboardViewModel$publish$1(HealthDashboardViewModel healthDashboardViewModel, Continuation<? super HealthDashboardViewModel$publish$1> continuation) {
        super(continuation);
        this.this$0 = healthDashboardViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object publish;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        publish = this.this$0.publish(false, this);
        return publish;
    }
}
