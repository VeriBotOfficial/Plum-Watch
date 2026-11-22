package com.wakeup.feature.wkvideo.model.implloader;

import com.wakeup.feature.wkvideo.model.VideoLoader;
import kotlin.Metadata;

/* compiled from: SportsLoader.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u0005H\u0094@¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u0005H\u0094@¢\u0006\u0002\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/wakeup/feature/wkvideo/model/implloader/SportsLoader;", "Lcom/wakeup/feature/wkvideo/model/VideoLoader;", "<init>", "()V", "pullUpLoad", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadMore", "feature-wkvideo_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SportsLoader extends VideoLoader {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075 A[Catch: Exception -> 0x003f, TRY_LEAVE, TryCatch #0 {Exception -> 0x003f, blocks: (B:17:0x003b, B:18:0x006d, B:20:0x0075), top: B:16:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.wakeup.feature.wkvideo.model.VideoLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.Object pullUpLoad(kotlin.coroutines.Continuation<? super kotlin.Unit> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.wakeup.feature.wkvideo.model.implloader.SportsLoader$pullUpLoad$1
            if (r0 == 0) goto L14
            r0 = r15
            com.wakeup.feature.wkvideo.model.implloader.SportsLoader$pullUpLoad$1 r0 = (com.wakeup.feature.wkvideo.model.implloader.SportsLoader$pullUpLoad$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r15 = r0.label
            int r15 = r15 - r2
            r0.label = r15
            goto L19
        L14:
            com.wakeup.feature.wkvideo.model.implloader.SportsLoader$pullUpLoad$1 r0 = new com.wakeup.feature.wkvideo.model.implloader.SportsLoader$pullUpLoad$1
            r0.<init>(r14, r15)
        L19:
            r9 = r0
            java.lang.Object r15 = r9.result
            java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r9.label
            r13 = 2
            r1 = 1
            if (r0 == 0) goto L42
            if (r0 == r1) goto L36
            if (r0 != r13) goto L2e
            kotlin.ResultKt.throwOnFailure(r15)
            return r15
        L2e:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L36:
            java.lang.Object r0 = r9.L$0
            r1 = r0
            com.wakeup.feature.wkvideo.model.implloader.SportsLoader r1 = (com.wakeup.feature.wkvideo.model.implloader.SportsLoader) r1
            kotlin.ResultKt.throwOnFailure(r15)     // Catch: java.lang.Exception -> L3f
            goto L6d
        L3f:
            r0 = move-exception
            r15 = r0
            goto L86
        L42:
            kotlin.ResultKt.throwOnFailure(r15)
            java.util.List r15 = r14.getVideoList()
            r15.clear()
            com.wakeup.common.network.RetrofitManager$Companion r15 = com.wakeup.common.network.RetrofitManager.INSTANCE     // Catch: java.lang.Exception -> L83
            com.wakeup.common.network.RetrofitManager r15 = r15.getInstance()     // Catch: java.lang.Exception -> L83
            com.wakeup.common.network.api.VideoService r15 = r15.getApiVideo()     // Catch: java.lang.Exception -> L83
            r9.L$0 = r14     // Catch: java.lang.Exception -> L83
            r9.label = r1     // Catch: java.lang.Exception -> L83
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 127(0x7f, float:1.78E-43)
            r11 = 0
            r1 = r15
            java.lang.Object r15 = com.wakeup.common.network.api.VideoService.DefaultImpls.getSportVideo$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L83
            if (r15 != r12) goto L6c
            goto La1
        L6c:
            r1 = r14
        L6d:
            com.wakeup.common.network.BaseResult r15 = (com.wakeup.common.network.BaseResult) r15     // Catch: java.lang.Exception -> L3f
            boolean r0 = r15.isSuccess()     // Catch: java.lang.Exception -> L3f
            if (r0 == 0) goto L89
            java.util.List r0 = r1.getVideoList()     // Catch: java.lang.Exception -> L3f
            java.lang.Object r15 = r15.getData()     // Catch: java.lang.Exception -> L3f
            java.util.Collection r15 = (java.util.Collection) r15     // Catch: java.lang.Exception -> L3f
            r0.addAll(r15)     // Catch: java.lang.Exception -> L3f
            goto L89
        L83:
            r0 = move-exception
            r15 = r0
            r1 = r14
        L86:
            r15.printStackTrace()
        L89:
            kotlinx.coroutines.MainCoroutineDispatcher r15 = kotlinx.coroutines.Dispatchers.getMain()
            kotlin.coroutines.CoroutineContext r15 = (kotlin.coroutines.CoroutineContext) r15
            com.wakeup.feature.wkvideo.model.implloader.SportsLoader$pullUpLoad$2 r0 = new com.wakeup.feature.wkvideo.model.implloader.SportsLoader$pullUpLoad$2
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r9.L$0 = r2
            r9.label = r13
            java.lang.Object r15 = kotlinx.coroutines.BuildersKt.withContext(r15, r0, r9)
            if (r15 != r12) goto La2
        La1:
            return r12
        La2:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.wkvideo.model.implloader.SportsLoader.pullUpLoad(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006e A[Catch: Exception -> 0x003f, TRY_LEAVE, TryCatch #0 {Exception -> 0x003f, blocks: (B:17:0x003b, B:18:0x0066, B:20:0x006e), top: B:16:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.wakeup.feature.wkvideo.model.VideoLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.Object loadMore(kotlin.coroutines.Continuation<? super kotlin.Unit> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.wakeup.feature.wkvideo.model.implloader.SportsLoader$loadMore$1
            if (r0 == 0) goto L14
            r0 = r15
            com.wakeup.feature.wkvideo.model.implloader.SportsLoader$loadMore$1 r0 = (com.wakeup.feature.wkvideo.model.implloader.SportsLoader$loadMore$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r15 = r0.label
            int r15 = r15 - r2
            r0.label = r15
            goto L19
        L14:
            com.wakeup.feature.wkvideo.model.implloader.SportsLoader$loadMore$1 r0 = new com.wakeup.feature.wkvideo.model.implloader.SportsLoader$loadMore$1
            r0.<init>(r14, r15)
        L19:
            r9 = r0
            java.lang.Object r15 = r9.result
            java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r9.label
            r13 = 2
            r1 = 1
            if (r0 == 0) goto L42
            if (r0 == r1) goto L36
            if (r0 != r13) goto L2e
            kotlin.ResultKt.throwOnFailure(r15)
            return r15
        L2e:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L36:
            java.lang.Object r0 = r9.L$0
            r1 = r0
            com.wakeup.feature.wkvideo.model.implloader.SportsLoader r1 = (com.wakeup.feature.wkvideo.model.implloader.SportsLoader) r1
            kotlin.ResultKt.throwOnFailure(r15)     // Catch: java.lang.Exception -> L3f
            goto L66
        L3f:
            r0 = move-exception
            r15 = r0
            goto L7f
        L42:
            kotlin.ResultKt.throwOnFailure(r15)
            com.wakeup.common.network.RetrofitManager$Companion r15 = com.wakeup.common.network.RetrofitManager.INSTANCE     // Catch: java.lang.Exception -> L7c
            com.wakeup.common.network.RetrofitManager r15 = r15.getInstance()     // Catch: java.lang.Exception -> L7c
            com.wakeup.common.network.api.VideoService r15 = r15.getApiVideo()     // Catch: java.lang.Exception -> L7c
            r9.L$0 = r14     // Catch: java.lang.Exception -> L7c
            r9.label = r1     // Catch: java.lang.Exception -> L7c
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 127(0x7f, float:1.78E-43)
            r11 = 0
            r1 = r15
            java.lang.Object r15 = com.wakeup.common.network.api.VideoService.DefaultImpls.getSportVideo$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L7c
            if (r15 != r12) goto L65
            goto L9a
        L65:
            r1 = r14
        L66:
            com.wakeup.common.network.BaseResult r15 = (com.wakeup.common.network.BaseResult) r15     // Catch: java.lang.Exception -> L3f
            boolean r0 = r15.isSuccess()     // Catch: java.lang.Exception -> L3f
            if (r0 == 0) goto L82
            java.util.List r0 = r1.getVideoList()     // Catch: java.lang.Exception -> L3f
            java.lang.Object r15 = r15.getData()     // Catch: java.lang.Exception -> L3f
            java.util.Collection r15 = (java.util.Collection) r15     // Catch: java.lang.Exception -> L3f
            r0.addAll(r15)     // Catch: java.lang.Exception -> L3f
            goto L82
        L7c:
            r0 = move-exception
            r15 = r0
            r1 = r14
        L7f:
            r15.printStackTrace()
        L82:
            kotlinx.coroutines.MainCoroutineDispatcher r15 = kotlinx.coroutines.Dispatchers.getMain()
            kotlin.coroutines.CoroutineContext r15 = (kotlin.coroutines.CoroutineContext) r15
            com.wakeup.feature.wkvideo.model.implloader.SportsLoader$loadMore$2 r0 = new com.wakeup.feature.wkvideo.model.implloader.SportsLoader$loadMore$2
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r9.L$0 = r2
            r9.label = r13
            java.lang.Object r15 = kotlinx.coroutines.BuildersKt.withContext(r15, r0, r9)
            if (r15 != r12) goto L9b
        L9a:
            return r12
        L9b:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.wkvideo.model.implloader.SportsLoader.loadMore(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
