package com.wakeup.feature.wkvideo.search.repo;

import kotlin.Metadata;

/* compiled from: RemoteSearchDataSource.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0096@¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/wakeup/feature/wkvideo/search/repo/RemoteSearchDataSource;", "Lcom/wakeup/feature/wkvideo/search/repo/ISearchDataSource;", "<init>", "()V", "searchVideo", "Lcom/wakeup/common/network/entity/video/SearchResultEntity;", "body", "", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-wkvideo_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RemoteSearchDataSource implements ISearchDataSource {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // com.wakeup.feature.wkvideo.search.repo.ISearchDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object searchVideo(java.util.Map<java.lang.String, ? extends java.lang.Object> r6, kotlin.coroutines.Continuation<? super com.wakeup.common.network.entity.video.SearchResultEntity> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.wakeup.feature.wkvideo.search.repo.RemoteSearchDataSource$searchVideo$1
            if (r0 == 0) goto L14
            r0 = r7
            com.wakeup.feature.wkvideo.search.repo.RemoteSearchDataSource$searchVideo$1 r0 = (com.wakeup.feature.wkvideo.search.repo.RemoteSearchDataSource$searchVideo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            com.wakeup.feature.wkvideo.search.repo.RemoteSearchDataSource$searchVideo$1 r0 = new com.wakeup.feature.wkvideo.search.repo.RemoteSearchDataSource$searchVideo$1
            r0.<init>(r5, r7)
        L19:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Exception -> L4f
            goto L4c
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlinx.coroutines.CoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getIO()     // Catch: java.lang.Exception -> L4f
            kotlin.coroutines.CoroutineContext r7 = (kotlin.coroutines.CoroutineContext) r7     // Catch: java.lang.Exception -> L4f
            com.wakeup.feature.wkvideo.search.repo.RemoteSearchDataSource$searchVideo$2 r2 = new com.wakeup.feature.wkvideo.search.repo.RemoteSearchDataSource$searchVideo$2     // Catch: java.lang.Exception -> L4f
            r2.<init>(r6, r3)     // Catch: java.lang.Exception -> L4f
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2     // Catch: java.lang.Exception -> L4f
            r0.label = r4     // Catch: java.lang.Exception -> L4f
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r2, r0)     // Catch: java.lang.Exception -> L4f
            if (r7 != r1) goto L4c
            return r1
        L4c:
            com.wakeup.common.network.entity.video.SearchResultEntity r7 = (com.wakeup.common.network.entity.video.SearchResultEntity) r7     // Catch: java.lang.Exception -> L4f
            return r7
        L4f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.wkvideo.search.repo.RemoteSearchDataSource.searchVideo(java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
