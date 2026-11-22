package com.wakeup.feature.wkvideo.model.implloader;

import com.wakeup.feature.wkvideo.model.VideoLoader;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserLikesLoader.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0016J\u000e\u0010\r\u001a\u00020\bH\u0094@¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\bH\u0094@¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/wakeup/feature/wkvideo/model/implloader/UserLikesLoader;", "Lcom/wakeup/feature/wkvideo/model/VideoLoader;", "<init>", "()V", "page", "", "maxPage", "setArgs", "", "args", "", "", "", "pullUpLoad", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadMore", "feature-wkvideo_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UserLikesLoader extends VideoLoader {
    private int maxPage;
    private int page;

    @Override // com.wakeup.feature.wkvideo.model.VideoLoader
    public void setArgs(Map<String, ? extends Object> args) {
        Intrinsics.checkNotNullParameter(args, "args");
        Object obj = args.get("page");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
        this.page = ((Integer) obj).intValue();
        Object obj2 = args.get("maxPage");
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
        this.maxPage = ((Integer) obj2).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006c A[Catch: Exception -> 0x003d, TRY_LEAVE, TryCatch #1 {Exception -> 0x003d, blocks: (B:17:0x0039, B:18:0x0064, B:20:0x006c), top: B:16:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.wakeup.feature.wkvideo.model.VideoLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.Object pullUpLoad(kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.wakeup.feature.wkvideo.model.implloader.UserLikesLoader$pullUpLoad$1
            if (r0 == 0) goto L14
            r0 = r7
            com.wakeup.feature.wkvideo.model.implloader.UserLikesLoader$pullUpLoad$1 r0 = (com.wakeup.feature.wkvideo.model.implloader.UserLikesLoader$pullUpLoad$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            com.wakeup.feature.wkvideo.model.implloader.UserLikesLoader$pullUpLoad$1 r0 = new com.wakeup.feature.wkvideo.model.implloader.UserLikesLoader$pullUpLoad$1
            r0.<init>(r6, r7)
        L19:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.throwOnFailure(r7)
            return r7
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.L$0
            com.wakeup.feature.wkvideo.model.implloader.UserLikesLoader r2 = (com.wakeup.feature.wkvideo.model.implloader.UserLikesLoader) r2
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Exception -> L3d
            goto L64
        L3d:
            r7 = move-exception
            goto L8f
        L3f:
            kotlin.ResultKt.throwOnFailure(r7)
            int r7 = r6.page
            if (r7 != r4) goto L49
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L49:
            com.wakeup.common.network.RetrofitManager$Companion r7 = com.wakeup.common.network.RetrofitManager.INSTANCE     // Catch: java.lang.Exception -> L8d
            com.wakeup.common.network.RetrofitManager r7 = r7.getInstance()     // Catch: java.lang.Exception -> L8d
            com.wakeup.common.network.api.VideoService r7 = r7.getApiVideo()     // Catch: java.lang.Exception -> L8d
            int r2 = r6.page     // Catch: java.lang.Exception -> L8d
            int r2 = r2 - r4
            r0.L$0 = r6     // Catch: java.lang.Exception -> L8d
            r0.label = r4     // Catch: java.lang.Exception -> L8d
            r4 = 10
            java.lang.Object r7 = r7.getLikeList(r2, r4, r0)     // Catch: java.lang.Exception -> L8d
            if (r7 != r1) goto L63
            goto Lc3
        L63:
            r2 = r6
        L64:
            com.wakeup.common.network.BaseResult r7 = (com.wakeup.common.network.BaseResult) r7     // Catch: java.lang.Exception -> L3d
            boolean r4 = r7.isSuccess()     // Catch: java.lang.Exception -> L3d
            if (r4 == 0) goto Lab
            java.lang.Object r4 = r7.getData()     // Catch: java.lang.Exception -> L3d
            com.wakeup.common.network.entity.video.VideoTotalEntity r4 = (com.wakeup.common.network.entity.video.VideoTotalEntity) r4     // Catch: java.lang.Exception -> L3d
            int r4 = r4.getCurrent()     // Catch: java.lang.Exception -> L3d
            r2.page = r4     // Catch: java.lang.Exception -> L3d
            java.util.List r4 = r2.getVideoList()     // Catch: java.lang.Exception -> L3d
            java.lang.Object r7 = r7.getData()     // Catch: java.lang.Exception -> L3d
            com.wakeup.common.network.entity.video.VideoTotalEntity r7 = (com.wakeup.common.network.entity.video.VideoTotalEntity) r7     // Catch: java.lang.Exception -> L3d
            java.util.List r7 = r7.getRecords()     // Catch: java.lang.Exception -> L3d
            java.util.Collection r7 = (java.util.Collection) r7     // Catch: java.lang.Exception -> L3d
            r5 = 0
            r4.addAll(r5, r7)     // Catch: java.lang.Exception -> L3d
            goto Lab
        L8d:
            r7 = move-exception
            r2 = r6
        L8f:
            java.lang.String r7 = r7.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "error = "
            r4.<init>(r5)
            java.lang.StringBuilder r7 = r4.append(r7)
            java.lang.String r7 = r7.toString()
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r4 = "UserLikesLoader"
            com.wakeup.common.log.LogUtils.e(r4, r7)
        Lab:
            kotlinx.coroutines.MainCoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getMain()
            kotlin.coroutines.CoroutineContext r7 = (kotlin.coroutines.CoroutineContext) r7
            com.wakeup.feature.wkvideo.model.implloader.UserLikesLoader$pullUpLoad$2 r4 = new com.wakeup.feature.wkvideo.model.implloader.UserLikesLoader$pullUpLoad$2
            r5 = 0
            r4.<init>(r2, r5)
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r4, r0)
            if (r7 != r1) goto Lc4
        Lc3:
            return r1
        Lc4:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.wkvideo.model.implloader.UserLikesLoader.pullUpLoad(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006c A[Catch: Exception -> 0x003d, TRY_LEAVE, TryCatch #0 {Exception -> 0x003d, blocks: (B:17:0x0039, B:18:0x0064, B:20:0x006c), top: B:16:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.wakeup.feature.wkvideo.model.VideoLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.Object loadMore(kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.wakeup.feature.wkvideo.model.implloader.UserLikesLoader$loadMore$1
            if (r0 == 0) goto L14
            r0 = r7
            com.wakeup.feature.wkvideo.model.implloader.UserLikesLoader$loadMore$1 r0 = (com.wakeup.feature.wkvideo.model.implloader.UserLikesLoader$loadMore$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            com.wakeup.feature.wkvideo.model.implloader.UserLikesLoader$loadMore$1 r0 = new com.wakeup.feature.wkvideo.model.implloader.UserLikesLoader$loadMore$1
            r0.<init>(r6, r7)
        L19:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.throwOnFailure(r7)
            return r7
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.L$0
            com.wakeup.feature.wkvideo.model.implloader.UserLikesLoader r2 = (com.wakeup.feature.wkvideo.model.implloader.UserLikesLoader) r2
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Exception -> L3d
            goto L64
        L3d:
            r7 = move-exception
            goto L8e
        L3f:
            kotlin.ResultKt.throwOnFailure(r7)
            int r7 = r6.page
            if (r7 != r4) goto L49
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L49:
            com.wakeup.common.network.RetrofitManager$Companion r7 = com.wakeup.common.network.RetrofitManager.INSTANCE     // Catch: java.lang.Exception -> L8c
            com.wakeup.common.network.RetrofitManager r7 = r7.getInstance()     // Catch: java.lang.Exception -> L8c
            com.wakeup.common.network.api.VideoService r7 = r7.getApiVideo()     // Catch: java.lang.Exception -> L8c
            int r2 = r6.page     // Catch: java.lang.Exception -> L8c
            int r2 = r2 + r4
            r0.L$0 = r6     // Catch: java.lang.Exception -> L8c
            r0.label = r4     // Catch: java.lang.Exception -> L8c
            r4 = 10
            java.lang.Object r7 = r7.getLikeList(r2, r4, r0)     // Catch: java.lang.Exception -> L8c
            if (r7 != r1) goto L63
            goto Lc2
        L63:
            r2 = r6
        L64:
            com.wakeup.common.network.BaseResult r7 = (com.wakeup.common.network.BaseResult) r7     // Catch: java.lang.Exception -> L3d
            boolean r4 = r7.isSuccess()     // Catch: java.lang.Exception -> L3d
            if (r4 == 0) goto Laa
            java.lang.Object r4 = r7.getData()     // Catch: java.lang.Exception -> L3d
            com.wakeup.common.network.entity.video.VideoTotalEntity r4 = (com.wakeup.common.network.entity.video.VideoTotalEntity) r4     // Catch: java.lang.Exception -> L3d
            int r4 = r4.getCurrent()     // Catch: java.lang.Exception -> L3d
            r2.page = r4     // Catch: java.lang.Exception -> L3d
            java.util.List r4 = r2.getVideoList()     // Catch: java.lang.Exception -> L3d
            java.lang.Object r7 = r7.getData()     // Catch: java.lang.Exception -> L3d
            com.wakeup.common.network.entity.video.VideoTotalEntity r7 = (com.wakeup.common.network.entity.video.VideoTotalEntity) r7     // Catch: java.lang.Exception -> L3d
            java.util.List r7 = r7.getRecords()     // Catch: java.lang.Exception -> L3d
            java.util.Collection r7 = (java.util.Collection) r7     // Catch: java.lang.Exception -> L3d
            r4.addAll(r7)     // Catch: java.lang.Exception -> L3d
            goto Laa
        L8c:
            r7 = move-exception
            r2 = r6
        L8e:
            java.lang.String r7 = r7.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "error = "
            r4.<init>(r5)
            java.lang.StringBuilder r7 = r4.append(r7)
            java.lang.String r7 = r7.toString()
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r4 = "UserLikesLoader"
            com.wakeup.common.log.LogUtils.e(r4, r7)
        Laa:
            kotlinx.coroutines.MainCoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getMain()
            kotlin.coroutines.CoroutineContext r7 = (kotlin.coroutines.CoroutineContext) r7
            com.wakeup.feature.wkvideo.model.implloader.UserLikesLoader$loadMore$2 r4 = new com.wakeup.feature.wkvideo.model.implloader.UserLikesLoader$loadMore$2
            r5 = 0
            r4.<init>(r2, r5)
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r4, r0)
            if (r7 != r1) goto Lc3
        Lc2:
            return r1
        Lc3:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.wkvideo.model.implloader.UserLikesLoader.loadMore(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
