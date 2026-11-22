package io.livekit.android.util;

import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;

/* compiled from: CoroutineUtil.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a[\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH\u0000¢\u0006\u0002\u0010\r\u001a\u001e\u0010\u000e\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00040\u0001H\u0000¨\u0006\u000f"}, d2 = {"debounce", "Lkotlin/Function1;", "T", "", TokenNames.R, "waitMs", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "destinationFunction", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(JLkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function2;)Lkotlin/jvm/functions/Function1;", "invoke", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CoroutineUtilKt {
    public static /* synthetic */ Function1 debounce$default(long j, CoroutineScope coroutineScope, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        return debounce(j, coroutineScope, function2);
    }

    public static final <T, R> Function1<T, Unit> debounce(final long j, final CoroutineScope coroutineScope, final Function2<? super T, ? super Continuation<? super R>, ? extends Object> destinationFunction) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(destinationFunction, "destinationFunction");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        return new Function1<T, Unit>() { // from class: io.livekit.android.util.CoroutineUtilKt$debounce$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2((CoroutineUtilKt$debounce$1<T>) obj);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Add missing generic type declarations: [R] */
            /* compiled from: CoroutineUtil.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", TokenNames.R, "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "io.livekit.android.util.CoroutineUtilKt$debounce$1$1", f = "CoroutineUtil.kt", i = {}, l = {30, 31}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: io.livekit.android.util.CoroutineUtilKt$debounce$1$1, reason: invalid class name */
            static final class AnonymousClass1<R> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super R>, Object> {
                final /* synthetic */ Function2<T, Continuation<? super R>, Object> $destinationFunction;
                final /* synthetic */ T $param;
                final /* synthetic */ long $waitMs;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(long j, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, T t, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$waitMs = j;
                    this.$destinationFunction = function2;
                    this.$param = t;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$waitMs, this.$destinationFunction, this.$param, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super R> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
                
                    if (kotlinx.coroutines.DelayKt.delay(r6.$waitMs, r6) == r0) goto L16;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                    /*
                        r6 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r1 = r6.label
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L1e
                        if (r1 == r3) goto L1a
                        if (r1 != r2) goto L12
                        kotlin.ResultKt.throwOnFailure(r7)
                        return r7
                    L12:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r0)
                        throw r7
                    L1a:
                        kotlin.ResultKt.throwOnFailure(r7)
                        goto L2f
                    L1e:
                        kotlin.ResultKt.throwOnFailure(r7)
                        long r4 = r6.$waitMs
                        r7 = r6
                        kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
                        r6.label = r3
                        java.lang.Object r7 = kotlinx.coroutines.DelayKt.delay(r4, r7)
                        if (r7 != r0) goto L2f
                        goto L3b
                    L2f:
                        kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r7 = r6.$destinationFunction
                        T r1 = r6.$param
                        r6.label = r2
                        java.lang.Object r7 = r7.invoke(r1, r6)
                        if (r7 != r0) goto L3c
                    L3b:
                        return r0
                    L3c:
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: io.livekit.android.util.CoroutineUtilKt$debounce$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(T t) {
                Deferred async$default;
                Deferred deferred = (Deferred) objectRef.element;
                if (deferred != null) {
                    Job.DefaultImpls.cancel$default((Job) deferred, (CancellationException) null, 1, (Object) null);
                }
                Ref.ObjectRef<Deferred<R>> objectRef2 = objectRef;
                async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new AnonymousClass1(j, destinationFunction, t, null), 3, null);
                objectRef2.element = (T) async$default;
            }
        };
    }

    public static final <R> void invoke(Function1<? super Unit, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(function1, "<this>");
        function1.invoke(Unit.INSTANCE);
    }
}
