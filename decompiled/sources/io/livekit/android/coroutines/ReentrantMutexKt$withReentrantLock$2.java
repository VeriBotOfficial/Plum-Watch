package io.livekit.android.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: ReentrantMutex.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "io.livekit.android.coroutines.ReentrantMutexKt$withReentrantLock$2", f = "ReentrantMutex.kt", i = {0, 1}, l = {61, 44}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
/* loaded from: classes6.dex */
final class ReentrantMutexKt$withReentrantLock$2<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
    final /* synthetic */ Function1<Continuation<? super T>, Object> $block;
    final /* synthetic */ Mutex $this_withReentrantLock;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReentrantMutexKt$withReentrantLock$2(Mutex mutex, Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super ReentrantMutexKt$withReentrantLock$2> continuation) {
        super(2, continuation);
        this.$this_withReentrantLock = mutex;
        this.$block = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReentrantMutexKt$withReentrantLock$2(this.$this_withReentrantLock, this.$block, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
        return ((ReentrantMutexKt$withReentrantLock$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0042, code lost:
    
        if (r8.lock(null, r7) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L2e
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            java.lang.Object r0 = r7.L$0
            kotlinx.coroutines.sync.Mutex r0 = (kotlinx.coroutines.sync.Mutex) r0
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L17
            goto L54
        L17:
            r8 = move-exception
            goto L5c
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L21:
            java.lang.Object r1 = r7.L$1
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            java.lang.Object r3 = r7.L$0
            kotlinx.coroutines.sync.Mutex r3 = (kotlinx.coroutines.sync.Mutex) r3
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = r3
            goto L45
        L2e:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlinx.coroutines.sync.Mutex r8 = r7.$this_withReentrantLock
            kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super T>, java.lang.Object> r1 = r7.$block
            r5 = r7
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            r7.L$0 = r8
            r7.L$1 = r1
            r7.label = r3
            java.lang.Object r3 = r8.lock(r4, r5)
            if (r3 != r0) goto L45
            goto L51
        L45:
            r7.L$0 = r8     // Catch: java.lang.Throwable -> L58
            r7.L$1 = r4     // Catch: java.lang.Throwable -> L58
            r7.label = r2     // Catch: java.lang.Throwable -> L58
            java.lang.Object r1 = r1.invoke(r7)     // Catch: java.lang.Throwable -> L58
            if (r1 != r0) goto L52
        L51:
            return r0
        L52:
            r0 = r8
            r8 = r1
        L54:
            r0.unlock(r4)
            return r8
        L58:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L5c:
            r0.unlock(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.livekit.android.coroutines.ReentrantMutexKt$withReentrantLock$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
