package io.livekit.android.util;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: MutexEx.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
@DebugMetadata(c = "io.livekit.android.util.MutexExKt", f = "MutexEx.kt", i = {0, 0, 0}, l = {38}, m = "withCheckLock", n = {"check", "action", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes6.dex */
final class MutexExKt$withCheckLock$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    MutexExKt$withCheckLock$1(Continuation<? super MutexExKt$withCheckLock$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return MutexExKt.withCheckLock(null, null, null, this);
    }
}
