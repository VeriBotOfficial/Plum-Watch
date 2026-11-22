package com.wakeup.feature.wkvideo.model.implloader;

import com.wakeup.feature.wkvideo.model.VideoLoader;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PusherLoader.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u000e\u0010\u000e\u001a\u00020\nH\u0094@¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u0010\u001a\u00020\nH\u0094@¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/wakeup/feature/wkvideo/model/implloader/PusherLoader;", "Lcom/wakeup/feature/wkvideo/model/VideoLoader;", "<init>", "()V", "page", "", "maxPage", "pushId", "", "setArgs", "", "args", "", "", "pullUpLoad", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadMore", "feature-wkvideo_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PusherLoader extends VideoLoader {
    private int maxPage;
    private int page;
    private String pushId = "";

    @Override // com.wakeup.feature.wkvideo.model.VideoLoader
    public void setArgs(Map<String, ? extends Object> args) {
        Intrinsics.checkNotNullParameter(args, "args");
        Object obj = args.get("page");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
        this.page = ((Integer) obj).intValue();
        Object obj2 = args.get("maxPage");
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
        this.maxPage = ((Integer) obj2).intValue();
        Object obj3 = args.get("pushId");
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
        this.pushId = (String) obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006e A[Catch: Exception -> 0x003d, TRY_LEAVE, TryCatch #1 {Exception -> 0x003d, blocks: (B:17:0x0039, B:18:0x0066, B:20:0x006e), top: B:16:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c6 A[RETURN] */
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
            boolean r0 = r7 instanceof com.wakeup.feature.wkvideo.model.implloader.PusherLoader$pullUpLoad$1
            if (r0 == 0) goto L14
            r0 = r7
            com.wakeup.feature.wkvideo.model.implloader.PusherLoader$pullUpLoad$1 r0 = (com.wakeup.feature.wkvideo.model.implloader.PusherLoader$pullUpLoad$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            com.wakeup.feature.wkvideo.model.implloader.PusherLoader$pullUpLoad$1 r0 = new com.wakeup.feature.wkvideo.model.implloader.PusherLoader$pullUpLoad$1
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
            com.wakeup.feature.wkvideo.model.implloader.PusherLoader r2 = (com.wakeup.feature.wkvideo.model.implloader.PusherLoader) r2
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Exception -> L3d
            goto L66
        L3d:
            r7 = move-exception
            goto L91
        L3f:
            kotlin.ResultKt.throwOnFailure(r7)
            int r7 = r6.page
            if (r7 != r4) goto L49
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L49:
            com.wakeup.common.network.RetrofitManager$Companion r7 = com.wakeup.common.network.RetrofitManager.INSTANCE     // Catch: java.lang.Exception -> L8f
            com.wakeup.common.network.RetrofitManager r7 = r7.getInstance()     // Catch: java.lang.Exception -> L8f
            com.wakeup.common.network.api.VideoService r7 = r7.getApiVideo()     // Catch: java.lang.Exception -> L8f
            java.lang.String r2 = r6.pushId     // Catch: java.lang.Exception -> L8f
            int r5 = r6.page     // Catch: java.lang.Exception -> L8f
            int r5 = r5 - r4
            r0.L$0 = r6     // Catch: java.lang.Exception -> L8f
            r0.label = r4     // Catch: java.lang.Exception -> L8f
            r4 = 10
            java.lang.Object r7 = r7.getPusherVideoList(r2, r5, r4, r0)     // Catch: java.lang.Exception -> L8f
            if (r7 != r1) goto L65
            goto Lc5
        L65:
            r2 = r6
        L66:
            com.wakeup.common.network.BaseResult r7 = (com.wakeup.common.network.BaseResult) r7     // Catch: java.lang.Exception -> L3d
            boolean r4 = r7.isSuccess()     // Catch: java.lang.Exception -> L3d
            if (r4 == 0) goto Lad
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
            goto Lad
        L8f:
            r7 = move-exception
            r2 = r6
        L91:
            java.lang.String r7 = r7.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "error = "
            r4.<init>(r5)
            java.lang.StringBuilder r7 = r4.append(r7)
            java.lang.String r7 = r7.toString()
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r4 = "PusherLoader"
            com.wakeup.common.log.LogUtils.e(r4, r7)
        Lad:
            kotlinx.coroutines.MainCoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getMain()
            kotlin.coroutines.CoroutineContext r7 = (kotlin.coroutines.CoroutineContext) r7
            com.wakeup.feature.wkvideo.model.implloader.PusherLoader$pullUpLoad$2 r4 = new com.wakeup.feature.wkvideo.model.implloader.PusherLoader$pullUpLoad$2
            r5 = 0
            r4.<init>(r2, r5)
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r4, r0)
            if (r7 != r1) goto Lc6
        Lc5:
            return r1
        Lc6:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.wkvideo.model.implloader.PusherLoader.pullUpLoad(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0067 A[Catch: Exception -> 0x003d, TRY_LEAVE, TryCatch #0 {Exception -> 0x003d, blocks: (B:17:0x0039, B:18:0x005f, B:20:0x0067), top: B:16:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00be A[RETURN] */
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
            boolean r0 = r7 instanceof com.wakeup.feature.wkvideo.model.implloader.PusherLoader$loadMore$1
            if (r0 == 0) goto L14
            r0 = r7
            com.wakeup.feature.wkvideo.model.implloader.PusherLoader$loadMore$1 r0 = (com.wakeup.feature.wkvideo.model.implloader.PusherLoader$loadMore$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            com.wakeup.feature.wkvideo.model.implloader.PusherLoader$loadMore$1 r0 = new com.wakeup.feature.wkvideo.model.implloader.PusherLoader$loadMore$1
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
            com.wakeup.feature.wkvideo.model.implloader.PusherLoader r2 = (com.wakeup.feature.wkvideo.model.implloader.PusherLoader) r2
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Exception -> L3d
            goto L5f
        L3d:
            r7 = move-exception
            goto L89
        L3f:
            kotlin.ResultKt.throwOnFailure(r7)
            com.wakeup.common.network.RetrofitManager$Companion r7 = com.wakeup.common.network.RetrofitManager.INSTANCE     // Catch: java.lang.Exception -> L87
            com.wakeup.common.network.RetrofitManager r7 = r7.getInstance()     // Catch: java.lang.Exception -> L87
            com.wakeup.common.network.api.VideoService r7 = r7.getApiVideo()     // Catch: java.lang.Exception -> L87
            java.lang.String r2 = r6.pushId     // Catch: java.lang.Exception -> L87
            int r5 = r6.page     // Catch: java.lang.Exception -> L87
            int r5 = r5 + r4
            r0.L$0 = r6     // Catch: java.lang.Exception -> L87
            r0.label = r4     // Catch: java.lang.Exception -> L87
            r4 = 10
            java.lang.Object r7 = r7.getPusherVideoList(r2, r5, r4, r0)     // Catch: java.lang.Exception -> L87
            if (r7 != r1) goto L5e
            goto Lbd
        L5e:
            r2 = r6
        L5f:
            com.wakeup.common.network.BaseResult r7 = (com.wakeup.common.network.BaseResult) r7     // Catch: java.lang.Exception -> L3d
            boolean r4 = r7.isSuccess()     // Catch: java.lang.Exception -> L3d
            if (r4 == 0) goto La5
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
            goto La5
        L87:
            r7 = move-exception
            r2 = r6
        L89:
            java.lang.String r7 = r7.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "error = "
            r4.<init>(r5)
            java.lang.StringBuilder r7 = r4.append(r7)
            java.lang.String r7 = r7.toString()
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r4 = "PusherLoader"
            com.wakeup.common.log.LogUtils.e(r4, r7)
        La5:
            kotlinx.coroutines.MainCoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getMain()
            kotlin.coroutines.CoroutineContext r7 = (kotlin.coroutines.CoroutineContext) r7
            com.wakeup.feature.wkvideo.model.implloader.PusherLoader$loadMore$2 r4 = new com.wakeup.feature.wkvideo.model.implloader.PusherLoader$loadMore$2
            r5 = 0
            r4.<init>(r2, r5)
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r4, r0)
            if (r7 != r1) goto Lbe
        Lbd:
            return r1
        Lbe:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.wkvideo.model.implloader.PusherLoader.loadMore(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
