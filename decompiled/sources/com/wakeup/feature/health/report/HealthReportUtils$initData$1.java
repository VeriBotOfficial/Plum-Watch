package com.wakeup.feature.health.report;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HealthReportUtils.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.feature.health.report.HealthReportUtils", f = "HealthReportUtils.kt", i = {0, 0, 0, 0}, l = {80}, m = "initData", n = {"arrayListOf", "dataType", "startTodayTime", "endTodayTime"}, s = {"L$0", "I$0", "J$0", "J$1"})
/* loaded from: classes3.dex */
final class HealthReportUtils$initData$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    long J$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HealthReportUtils this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HealthReportUtils$initData$1(HealthReportUtils healthReportUtils, Continuation<? super HealthReportUtils$initData$1> continuation) {
        super(continuation);
        this.this$0 = healthReportUtils;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object initData;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        initData = this.this$0.initData(0, this);
        return initData;
    }
}
