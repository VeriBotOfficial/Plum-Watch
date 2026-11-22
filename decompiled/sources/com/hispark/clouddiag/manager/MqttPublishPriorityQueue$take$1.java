package com.hispark.clouddiag.manager;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: MqttPublishPriorityQueue.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.hispark.clouddiag.manager.MqttPublishPriorityQueue", f = "MqttPublishPriorityQueue.kt", i = {0}, l = {65}, m = "take", n = {"this"}, s = {"L$0"})
/* loaded from: classes11.dex */
final class MqttPublishPriorityQueue$take$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MqttPublishPriorityQueue this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MqttPublishPriorityQueue$take$1(MqttPublishPriorityQueue mqttPublishPriorityQueue, Continuation<? super MqttPublishPriorityQueue$take$1> continuation) {
        super(continuation);
        this.this$0 = mqttPublishPriorityQueue;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.take(this);
    }
}
