package com.wakeup.common.base;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: BaseModel.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0094\u0001\u0010\u0004\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u00052\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00072\u001e\u0010\n\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00050\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00072\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u0001H\u0005\u0012\u0004\u0012\u00020\u000f0\u0007H\u0086@¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\r¨\u0006\u0012"}, d2 = {"Lcom/wakeup/common/base/BaseModel;", "", "<init>", "()V", "cacheNetCall", "T", "remoto", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lcom/wakeup/common/network/IBaseResponse;", "local", "save", "Lkotlin/Function2;", "", "isUseCache", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCleared", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BaseModel {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean cacheNetCall$lambda$0(Object obj) {
        return true;
    }

    public final void onCleared() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0064, code lost:
    
        if (r12 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object cacheNetCall(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super com.wakeup.common.network.IBaseResponse<T>>, ? extends java.lang.Object> r8, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r9, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r10, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r11, kotlin.coroutines.Continuation<? super T> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof com.wakeup.common.base.BaseModel$cacheNetCall$1
            if (r0 == 0) goto L14
            r0 = r12
            com.wakeup.common.base.BaseModel$cacheNetCall$1 r0 = (com.wakeup.common.base.BaseModel$cacheNetCall$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r12 = r0.label
            int r12 = r12 - r2
            r0.label = r12
            goto L19
        L14:
            com.wakeup.common.base.BaseModel$cacheNetCall$1 r0 = new com.wakeup.common.base.BaseModel$cacheNetCall$1
            r0.<init>(r7, r12)
        L19:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 3
            r4 = 1
            r5 = 2
            r6 = 0
            if (r2 == 0) goto L55
            if (r2 == r4) goto L43
            if (r2 == r5) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r8 = r0.L$0
            kotlin.ResultKt.throwOnFailure(r12)
            return r8
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.L$0
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            kotlin.ResultKt.throwOnFailure(r12)
            goto L86
        L43:
            java.lang.Object r8 = r0.L$2
            r11 = r8
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
            java.lang.Object r8 = r0.L$1
            r10 = r8
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            java.lang.Object r8 = r0.L$0
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            kotlin.ResultKt.throwOnFailure(r12)
            goto L67
        L55:
            kotlin.ResultKt.throwOnFailure(r12)
            r0.L$0 = r8
            r0.L$1 = r10
            r0.L$2 = r11
            r0.label = r4
            java.lang.Object r12 = r9.invoke(r0)
            if (r12 != r1) goto L67
            goto L9e
        L67:
            java.lang.Object r9 = r11.invoke(r12)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L76
            if (r12 == 0) goto L76
            return r12
        L76:
            r0.L$0 = r10
            r0.L$1 = r6
            r0.L$2 = r6
            r0.label = r5
            java.lang.Object r12 = r8.invoke(r0)
            if (r12 != r1) goto L85
            goto L9e
        L85:
            r8 = r10
        L86:
            com.wakeup.common.network.IBaseResponse r12 = (com.wakeup.common.network.IBaseResponse) r12
            boolean r9 = r12.isSuccess()
            if (r9 == 0) goto La0
            java.lang.Object r9 = r12.data()
            if (r9 == 0) goto L9f
            r0.L$0 = r9
            r0.label = r3
            java.lang.Object r8 = r8.invoke(r9, r0)
            if (r8 != r1) goto L9f
        L9e:
            return r1
        L9f:
            return r9
        La0:
            com.wakeup.common.temp.ResponseThrowable r8 = new com.wakeup.common.temp.ResponseThrowable
            r8.<init>(r12, r6, r5, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.common.base.BaseModel.cacheNetCall(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object cacheNetCall$default(BaseModel baseModel, Function1 function1, Function1 function12, Function2 function2, Function1 function13, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cacheNetCall");
        }
        if ((i & 8) != 0) {
            function13 = new Function1() { // from class: com.wakeup.common.base.BaseModel$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    boolean cacheNetCall$lambda$0;
                    cacheNetCall$lambda$0 = BaseModel.cacheNetCall$lambda$0(obj2);
                    return Boolean.valueOf(cacheNetCall$lambda$0);
                }
            };
        }
        return baseModel.cacheNetCall(function1, function12, function2, function13, continuation);
    }
}
