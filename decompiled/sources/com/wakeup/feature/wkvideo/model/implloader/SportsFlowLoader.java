package com.wakeup.feature.wkvideo.model.implloader;

import com.wakeup.feature.wkvideo.model.VideoLoader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: SportsFlowLoader.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u0005H\u0094@¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u0005H\u0094@¢\u0006\u0002\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/wakeup/feature/wkvideo/model/implloader/SportsFlowLoader;", "Lcom/wakeup/feature/wkvideo/model/VideoLoader;", "<init>", "()V", "pullUpLoad", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadMore", "feature-wkvideo_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SportsFlowLoader extends VideoLoader {
    @Override // com.wakeup.feature.wkvideo.model.VideoLoader
    protected Object pullUpLoad(Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006f A[Catch: Exception -> 0x003f, TRY_LEAVE, TryCatch #0 {Exception -> 0x003f, blocks: (B:17:0x003b, B:18:0x0067, B:20:0x006f), top: B:16:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c A[RETURN] */
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
            boolean r0 = r15 instanceof com.wakeup.feature.wkvideo.model.implloader.SportsFlowLoader$loadMore$1
            if (r0 == 0) goto L14
            r0 = r15
            com.wakeup.feature.wkvideo.model.implloader.SportsFlowLoader$loadMore$1 r0 = (com.wakeup.feature.wkvideo.model.implloader.SportsFlowLoader$loadMore$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r15 = r0.label
            int r15 = r15 - r2
            r0.label = r15
            goto L19
        L14:
            com.wakeup.feature.wkvideo.model.implloader.SportsFlowLoader$loadMore$1 r0 = new com.wakeup.feature.wkvideo.model.implloader.SportsFlowLoader$loadMore$1
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
            com.wakeup.feature.wkvideo.model.implloader.SportsFlowLoader r1 = (com.wakeup.feature.wkvideo.model.implloader.SportsFlowLoader) r1
            kotlin.ResultKt.throwOnFailure(r15)     // Catch: java.lang.Exception -> L3f
            goto L67
        L3f:
            r0 = move-exception
            r15 = r0
            goto L80
        L42:
            kotlin.ResultKt.throwOnFailure(r15)
            com.wakeup.common.network.RetrofitManager$Companion r15 = com.wakeup.common.network.RetrofitManager.INSTANCE     // Catch: java.lang.Exception -> L7d
            com.wakeup.common.network.RetrofitManager r15 = r15.getInstance()     // Catch: java.lang.Exception -> L7d
            com.wakeup.common.network.api.VideoService r15 = r15.getApiVideo()     // Catch: java.lang.Exception -> L7d
            java.lang.String r2 = "detail"
            r9.L$0 = r14     // Catch: java.lang.Exception -> L7d
            r9.label = r1     // Catch: java.lang.Exception -> L7d
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 126(0x7e, float:1.77E-43)
            r11 = 0
            r1 = r15
            java.lang.Object r15 = com.wakeup.common.network.api.VideoService.DefaultImpls.getSportVideo$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L7d
            if (r15 != r12) goto L66
            goto L9b
        L66:
            r1 = r14
        L67:
            com.wakeup.common.network.BaseResult r15 = (com.wakeup.common.network.BaseResult) r15     // Catch: java.lang.Exception -> L3f
            boolean r0 = r15.isSuccess()     // Catch: java.lang.Exception -> L3f
            if (r0 == 0) goto L83
            java.util.List r0 = r1.getVideoList()     // Catch: java.lang.Exception -> L3f
            java.lang.Object r15 = r15.getData()     // Catch: java.lang.Exception -> L3f
            java.util.Collection r15 = (java.util.Collection) r15     // Catch: java.lang.Exception -> L3f
            r0.addAll(r15)     // Catch: java.lang.Exception -> L3f
            goto L83
        L7d:
            r0 = move-exception
            r15 = r0
            r1 = r14
        L80:
            r15.printStackTrace()
        L83:
            kotlinx.coroutines.MainCoroutineDispatcher r15 = kotlinx.coroutines.Dispatchers.getMain()
            kotlin.coroutines.CoroutineContext r15 = (kotlin.coroutines.CoroutineContext) r15
            com.wakeup.feature.wkvideo.model.implloader.SportsFlowLoader$loadMore$2 r0 = new com.wakeup.feature.wkvideo.model.implloader.SportsFlowLoader$loadMore$2
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r9.L$0 = r2
            r9.label = r13
            java.lang.Object r15 = kotlinx.coroutines.BuildersKt.withContext(r15, r0, r9)
            if (r15 != r12) goto L9c
        L9b:
            return r12
        L9c:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.wkvideo.model.implloader.SportsFlowLoader.loadMore(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
