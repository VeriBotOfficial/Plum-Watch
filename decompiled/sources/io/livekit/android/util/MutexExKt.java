package io.livekit.android.util;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.sync.Mutex;

/* compiled from: MutexEx.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a4\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0004H\u0086H¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"withCheckLock", "T", "Lkotlinx/coroutines/sync/Mutex;", "check", "Lkotlin/Function0;", "", "action", "(Lkotlinx/coroutines/sync/Mutex;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MutexExKt {
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object withCheckLock(kotlinx.coroutines.sync.Mutex r5, kotlin.jvm.functions.Function0<kotlin.Unit> r6, kotlin.jvm.functions.Function0<? extends T> r7, kotlin.coroutines.Continuation<? super T> r8) {
        /*
            boolean r0 = r8 instanceof io.livekit.android.util.MutexExKt$withCheckLock$1
            if (r0 == 0) goto L14
            r0 = r8
            io.livekit.android.util.MutexExKt$withCheckLock$1 r0 = (io.livekit.android.util.MutexExKt$withCheckLock$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            io.livekit.android.util.MutexExKt$withCheckLock$1 r0 = new io.livekit.android.util.MutexExKt$withCheckLock$1
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 != r4) goto L38
            java.lang.Object r5 = r0.L$2
            kotlinx.coroutines.sync.Mutex r5 = (kotlinx.coroutines.sync.Mutex) r5
            java.lang.Object r6 = r0.L$1
            r7 = r6
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            java.lang.Object r6 = r0.L$0
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            kotlin.ResultKt.throwOnFailure(r8)
            goto L55
        L38:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L40:
            kotlin.ResultKt.throwOnFailure(r8)
            r6.invoke()
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r5
            r0.label = r4
            java.lang.Object r8 = r5.lock(r3, r0)
            if (r8 != r1) goto L55
            return r1
        L55:
            r6.invoke()     // Catch: java.lang.Throwable -> L60
            java.lang.Object r6 = r7.invoke()     // Catch: java.lang.Throwable -> L60
            r5.unlock(r3)
            return r6
        L60:
            r6 = move-exception
            r5.unlock(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.livekit.android.util.MutexExKt.withCheckLock(kotlinx.coroutines.sync.Mutex, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private static final <T> Object withCheckLock$$forInline(Mutex mutex, Function0<Unit> function0, Function0<? extends T> function02, Continuation<? super T> continuation) {
        function0.invoke();
        mutex.lock(null, continuation);
        try {
            function0.invoke();
            return function02.invoke();
        } finally {
            mutex.unlock(null);
        }
    }
}
