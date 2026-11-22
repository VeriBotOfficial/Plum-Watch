package com.wakeup.feature.wkvideo.model.implloader;

import com.wakeup.feature.wkvideo.model.VideoLoader;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CollectLoader.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u000e\u0010\u000e\u001a\u00020\nH\u0094@¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u0010\u001a\u00020\nH\u0094@¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/wakeup/feature/wkvideo/model/implloader/CollectLoader;", "Lcom/wakeup/feature/wkvideo/model/VideoLoader;", "<init>", "()V", "page", "", "maxPage", "collectId", "", "setArgs", "", "args", "", "", "pullUpLoad", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadMore", "feature-wkvideo_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CollectLoader extends VideoLoader {
    private String collectId = "";
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
        Object obj3 = args.get("collectId");
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
        this.collectId = (String) obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0077 A[Catch: Exception -> 0x003f, TRY_LEAVE, TryCatch #0 {Exception -> 0x003f, blocks: (B:17:0x003b, B:18:0x006f, B:20:0x0077), top: B:16:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.wakeup.feature.wkvideo.model.VideoLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.Object pullUpLoad(kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.wakeup.feature.wkvideo.model.implloader.CollectLoader$pullUpLoad$1
            if (r0 == 0) goto L14
            r0 = r11
            com.wakeup.feature.wkvideo.model.implloader.CollectLoader$pullUpLoad$1 r0 = (com.wakeup.feature.wkvideo.model.implloader.CollectLoader$pullUpLoad$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r11 = r0.label
            int r11 = r11 - r2
            r0.label = r11
            goto L19
        L14:
            com.wakeup.feature.wkvideo.model.implloader.CollectLoader$pullUpLoad$1 r0 = new com.wakeup.feature.wkvideo.model.implloader.CollectLoader$pullUpLoad$1
            r0.<init>(r10, r11)
        L19:
            r5 = r0
            java.lang.Object r11 = r5.result
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            r9 = 2
            r1 = 1
            if (r0 == 0) goto L42
            if (r0 == r1) goto L36
            if (r0 != r9) goto L2e
            kotlin.ResultKt.throwOnFailure(r11)
            return r11
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L36:
            java.lang.Object r0 = r5.L$0
            r1 = r0
            com.wakeup.feature.wkvideo.model.implloader.CollectLoader r1 = (com.wakeup.feature.wkvideo.model.implloader.CollectLoader) r1
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Exception -> L3f
            goto L6f
        L3f:
            r0 = move-exception
            r11 = r0
            goto L9b
        L42:
            kotlin.ResultKt.throwOnFailure(r11)
            int r11 = r10.page
            if (r11 != r1) goto L4c
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        L4c:
            com.wakeup.common.network.RetrofitManager$Companion r11 = com.wakeup.common.network.RetrofitManager.INSTANCE     // Catch: java.lang.Exception -> L98
            com.wakeup.common.network.RetrofitManager r11 = r11.getInstance()     // Catch: java.lang.Exception -> L98
            com.wakeup.common.network.api.VideoService r11 = r11.getApiVideo()     // Catch: java.lang.Exception -> L98
            java.lang.String r2 = r10.collectId     // Catch: java.lang.Exception -> L98
            int r0 = r10.page     // Catch: java.lang.Exception -> L98
            int r0 = r0 - r1
            java.lang.Integer r3 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)     // Catch: java.lang.Exception -> L98
            r5.L$0 = r10     // Catch: java.lang.Exception -> L98
            r5.label = r1     // Catch: java.lang.Exception -> L98
            r4 = 0
            r6 = 4
            r7 = 0
            r1 = r11
            java.lang.Object r11 = com.wakeup.common.network.api.VideoService.DefaultImpls.getVideoByCid$default(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L98
            if (r11 != r8) goto L6e
            goto Lb6
        L6e:
            r1 = r10
        L6f:
            com.wakeup.common.network.BaseResult r11 = (com.wakeup.common.network.BaseResult) r11     // Catch: java.lang.Exception -> L3f
            boolean r0 = r11.isSuccess()     // Catch: java.lang.Exception -> L3f
            if (r0 == 0) goto L9e
            java.lang.Object r0 = r11.getData()     // Catch: java.lang.Exception -> L3f
            com.wakeup.common.network.entity.video.VideoPage r0 = (com.wakeup.common.network.entity.video.VideoPage) r0     // Catch: java.lang.Exception -> L3f
            int r0 = r0.getCurrent()     // Catch: java.lang.Exception -> L3f
            r1.page = r0     // Catch: java.lang.Exception -> L3f
            java.util.List r0 = r1.getVideoList()     // Catch: java.lang.Exception -> L3f
            java.lang.Object r11 = r11.getData()     // Catch: java.lang.Exception -> L3f
            com.wakeup.common.network.entity.video.VideoPage r11 = (com.wakeup.common.network.entity.video.VideoPage) r11     // Catch: java.lang.Exception -> L3f
            java.util.List r11 = r11.getRecords()     // Catch: java.lang.Exception -> L3f
            java.util.Collection r11 = (java.util.Collection) r11     // Catch: java.lang.Exception -> L3f
            r2 = 0
            r0.addAll(r2, r11)     // Catch: java.lang.Exception -> L3f
            goto L9e
        L98:
            r0 = move-exception
            r11 = r0
            r1 = r10
        L9b:
            r11.printStackTrace()
        L9e:
            kotlinx.coroutines.MainCoroutineDispatcher r11 = kotlinx.coroutines.Dispatchers.getMain()
            kotlin.coroutines.CoroutineContext r11 = (kotlin.coroutines.CoroutineContext) r11
            com.wakeup.feature.wkvideo.model.implloader.CollectLoader$pullUpLoad$2 r0 = new com.wakeup.feature.wkvideo.model.implloader.CollectLoader$pullUpLoad$2
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r5.L$0 = r2
            r5.label = r9
            java.lang.Object r11 = kotlinx.coroutines.BuildersKt.withContext(r11, r0, r5)
            if (r11 != r8) goto Lb7
        Lb6:
            return r8
        Lb7:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.wkvideo.model.implloader.CollectLoader.pullUpLoad(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0067, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r12, r0, r5) == r8) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a A[Catch: Exception -> 0x0043, TRY_LEAVE, TryCatch #1 {Exception -> 0x0043, blocks: (B:18:0x003f, B:19:0x0092, B:21:0x009a), top: B:17:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.wakeup.feature.wkvideo.model.VideoLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.Object loadMore(kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.wkvideo.model.implloader.CollectLoader.loadMore(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
