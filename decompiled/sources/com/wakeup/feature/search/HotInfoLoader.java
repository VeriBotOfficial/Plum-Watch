package com.wakeup.feature.search;

import kotlin.Metadata;

/* compiled from: AiSearchLoader.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u0005H\u0094@¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u0005H\u0094@¢\u0006\u0002\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/wakeup/feature/search/HotInfoLoader;", "Lcom/wakeup/feature/search/AiSearchLoader;", "<init>", "()V", "pullUpLoad", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadMore", "feature-search_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class HotInfoLoader extends AiSearchLoader {
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f A[Catch: Exception -> 0x007e, TRY_LEAVE, TryCatch #0 {Exception -> 0x007e, blocks: (B:17:0x003a, B:18:0x0067, B:20:0x006f), top: B:16:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.wakeup.feature.search.AiSearchLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.Object pullUpLoad(kotlin.coroutines.Continuation<? super kotlin.Unit> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.wakeup.feature.search.HotInfoLoader$pullUpLoad$1
            if (r0 == 0) goto L14
            r0 = r13
            com.wakeup.feature.search.HotInfoLoader$pullUpLoad$1 r0 = (com.wakeup.feature.search.HotInfoLoader$pullUpLoad$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r13 = r0.label
            int r13 = r13 - r2
            r0.label = r13
            goto L19
        L14:
            com.wakeup.feature.search.HotInfoLoader$pullUpLoad$1 r0 = new com.wakeup.feature.search.HotInfoLoader$pullUpLoad$1
            r0.<init>(r12, r13)
        L19:
            r8 = r0
            java.lang.Object r13 = r8.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.label
            r11 = 2
            r2 = 1
            if (r1 == 0) goto L3e
            if (r1 == r2) goto L36
            if (r1 != r11) goto L2e
            kotlin.ResultKt.throwOnFailure(r13)
            return r13
        L2e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L36:
            java.lang.Object r1 = r8.L$0
            com.wakeup.feature.search.HotInfoLoader r1 = (com.wakeup.feature.search.HotInfoLoader) r1
            kotlin.ResultKt.throwOnFailure(r13)     // Catch: java.lang.Exception -> L7e
            goto L67
        L3e:
            kotlin.ResultKt.throwOnFailure(r13)
            java.util.List r13 = r12.getHotInfoList()
            r13.clear()
            com.wakeup.common.network.RetrofitManager$Companion r13 = com.wakeup.common.network.RetrofitManager.INSTANCE     // Catch: java.lang.Exception -> L7d
            com.wakeup.common.network.RetrofitManager r13 = r13.getInstance()     // Catch: java.lang.Exception -> L7d
            com.wakeup.common.network.api.VideoService r1 = r13.getApiVideoFieed()     // Catch: java.lang.Exception -> L7d
            r8.L$0 = r12     // Catch: java.lang.Exception -> L7d
            r8.label = r2     // Catch: java.lang.Exception -> L7d
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 63
            r10 = 0
            java.lang.Object r13 = com.wakeup.common.network.api.VideoService.DefaultImpls.getHotInfoList$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L7d
            if (r13 != r0) goto L66
            goto L96
        L66:
            r1 = r12
        L67:
            com.wakeup.common.network.BaseResult r13 = (com.wakeup.common.network.BaseResult) r13     // Catch: java.lang.Exception -> L7e
            boolean r2 = r13.isSuccess()     // Catch: java.lang.Exception -> L7e
            if (r2 == 0) goto L7e
            java.util.List r2 = r1.getHotInfoList()     // Catch: java.lang.Exception -> L7e
            java.lang.Object r13 = r13.getData()     // Catch: java.lang.Exception -> L7e
            java.util.Collection r13 = (java.util.Collection) r13     // Catch: java.lang.Exception -> L7e
            r2.addAll(r13)     // Catch: java.lang.Exception -> L7e
            goto L7e
        L7d:
            r1 = r12
        L7e:
            kotlinx.coroutines.MainCoroutineDispatcher r13 = kotlinx.coroutines.Dispatchers.getMain()
            kotlin.coroutines.CoroutineContext r13 = (kotlin.coroutines.CoroutineContext) r13
            com.wakeup.feature.search.HotInfoLoader$pullUpLoad$2 r2 = new com.wakeup.feature.search.HotInfoLoader$pullUpLoad$2
            r3 = 0
            r2.<init>(r1, r3)
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            r8.L$0 = r3
            r8.label = r11
            java.lang.Object r13 = kotlinx.coroutines.BuildersKt.withContext(r13, r2, r8)
            if (r13 != r0) goto L97
        L96:
            return r0
        L97:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.search.HotInfoLoader.pullUpLoad(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[Catch: Exception -> 0x0077, TRY_LEAVE, TryCatch #0 {Exception -> 0x0077, blocks: (B:17:0x003a, B:18:0x0060, B:20:0x0068), top: B:16:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.wakeup.feature.search.AiSearchLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.Object loadMore(kotlin.coroutines.Continuation<? super kotlin.Unit> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.wakeup.feature.search.HotInfoLoader$loadMore$1
            if (r0 == 0) goto L14
            r0 = r13
            com.wakeup.feature.search.HotInfoLoader$loadMore$1 r0 = (com.wakeup.feature.search.HotInfoLoader$loadMore$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r13 = r0.label
            int r13 = r13 - r2
            r0.label = r13
            goto L19
        L14:
            com.wakeup.feature.search.HotInfoLoader$loadMore$1 r0 = new com.wakeup.feature.search.HotInfoLoader$loadMore$1
            r0.<init>(r12, r13)
        L19:
            r8 = r0
            java.lang.Object r13 = r8.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.label
            r11 = 2
            r2 = 1
            if (r1 == 0) goto L3e
            if (r1 == r2) goto L36
            if (r1 != r11) goto L2e
            kotlin.ResultKt.throwOnFailure(r13)
            return r13
        L2e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L36:
            java.lang.Object r1 = r8.L$0
            com.wakeup.feature.search.HotInfoLoader r1 = (com.wakeup.feature.search.HotInfoLoader) r1
            kotlin.ResultKt.throwOnFailure(r13)     // Catch: java.lang.Exception -> L77
            goto L60
        L3e:
            kotlin.ResultKt.throwOnFailure(r13)
            com.wakeup.common.network.RetrofitManager$Companion r13 = com.wakeup.common.network.RetrofitManager.INSTANCE     // Catch: java.lang.Exception -> L76
            com.wakeup.common.network.RetrofitManager r13 = r13.getInstance()     // Catch: java.lang.Exception -> L76
            com.wakeup.common.network.api.VideoService r1 = r13.getApiVideoFieed()     // Catch: java.lang.Exception -> L76
            r8.L$0 = r12     // Catch: java.lang.Exception -> L76
            r8.label = r2     // Catch: java.lang.Exception -> L76
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 63
            r10 = 0
            java.lang.Object r13 = com.wakeup.common.network.api.VideoService.DefaultImpls.getHotInfoList$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L76
            if (r13 != r0) goto L5f
            goto L8f
        L5f:
            r1 = r12
        L60:
            com.wakeup.common.network.BaseResult r13 = (com.wakeup.common.network.BaseResult) r13     // Catch: java.lang.Exception -> L77
            boolean r2 = r13.isSuccess()     // Catch: java.lang.Exception -> L77
            if (r2 == 0) goto L77
            java.util.List r2 = r1.getHotInfoList()     // Catch: java.lang.Exception -> L77
            java.lang.Object r13 = r13.getData()     // Catch: java.lang.Exception -> L77
            java.util.Collection r13 = (java.util.Collection) r13     // Catch: java.lang.Exception -> L77
            r2.addAll(r13)     // Catch: java.lang.Exception -> L77
            goto L77
        L76:
            r1 = r12
        L77:
            kotlinx.coroutines.MainCoroutineDispatcher r13 = kotlinx.coroutines.Dispatchers.getMain()
            kotlin.coroutines.CoroutineContext r13 = (kotlin.coroutines.CoroutineContext) r13
            com.wakeup.feature.search.HotInfoLoader$loadMore$2 r2 = new com.wakeup.feature.search.HotInfoLoader$loadMore$2
            r3 = 0
            r2.<init>(r1, r3)
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            r8.L$0 = r3
            r8.label = r11
            java.lang.Object r13 = kotlinx.coroutines.BuildersKt.withContext(r13, r2, r8)
            if (r13 != r0) goto L90
        L8f:
            return r0
        L90:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.search.HotInfoLoader.loadMore(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
