package com.wakeup.feature.wkvideo.livecut.data;

import kotlin.Metadata;

/* compiled from: LiveCutCommerceRemote.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\nJ\u001e\u0010\u000b\u001a\u0004\u0018\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0086@¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/wakeup/feature/wkvideo/livecut/data/LiveCutCommerceRemote;", "", "<init>", "()V", "fetchProduct", "Lcom/wakeup/feature/wkvideo/livecut/model/LiveCutProduct;", "clipId", "", "title", "buyPath", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createOrder", "Lcom/wakeup/feature/wkvideo/livecut/model/LiveCutOrder;", "cartItems", "", "Lcom/wakeup/feature/wkvideo/livecut/model/LiveCutCartItem;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-wkvideo_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LiveCutCommerceRemote {
    public static final LiveCutCommerceRemote INSTANCE = new LiveCutCommerceRemote();

    private LiveCutCommerceRemote() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|7|(1:(1:10)(2:26|27))(2:28|(1:30)(2:31|(1:33)))|11|(4:25|14|15|(1:20)(2:17|18))|13|14|15|(0)(0)))|37|6|7|(0)(0)|11|(5:22|25|14|15|(0)(0))|13|14|15|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x002b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0081, code lost:
    
        r13 = kotlin.Result.INSTANCE;
        r12 = kotlin.Result.m14057constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchProduct(java.lang.String r12, java.lang.String r13, java.lang.String r14, kotlin.coroutines.Continuation<? super com.wakeup.feature.wkvideo.livecut.model.LiveCutProduct> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.wakeup.feature.wkvideo.livecut.data.LiveCutCommerceRemote$fetchProduct$1
            if (r0 == 0) goto L14
            r0 = r15
            com.wakeup.feature.wkvideo.livecut.data.LiveCutCommerceRemote$fetchProduct$1 r0 = (com.wakeup.feature.wkvideo.livecut.data.LiveCutCommerceRemote$fetchProduct$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r15 = r0.label
            int r15 = r15 - r2
            r0.label = r15
            goto L19
        L14:
            com.wakeup.feature.wkvideo.livecut.data.LiveCutCommerceRemote$fetchProduct$1 r0 = new com.wakeup.feature.wkvideo.livecut.data.LiveCutCommerceRemote$fetchProduct$1
            r0.<init>(r11, r15)
        L19:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            kotlin.ResultKt.throwOnFailure(r15)     // Catch: java.lang.Throwable -> L2b
            goto L50
        L2b:
            r0 = move-exception
            r12 = r0
            goto L81
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            kotlin.ResultKt.throwOnFailure(r15)
            com.wakeup.feature.wkvideo.livecut.api.LiveCutCommerceApiHolder r15 = com.wakeup.feature.wkvideo.livecut.api.LiveCutCommerceApiHolder.INSTANCE
            com.wakeup.feature.wkvideo.livecut.api.LiveCutCommerceApiService r15 = r15.getService()
            if (r15 != 0) goto L42
            return r4
        L42:
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L2b
            r2 = r11
            com.wakeup.feature.wkvideo.livecut.data.LiveCutCommerceRemote r2 = (com.wakeup.feature.wkvideo.livecut.data.LiveCutCommerceRemote) r2     // Catch: java.lang.Throwable -> L2b
            r0.label = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r15 = r15.getProduct(r12, r13, r14, r0)     // Catch: java.lang.Throwable -> L2b
            if (r15 != r1) goto L50
            return r1
        L50:
            com.wakeup.common.network.BaseResult r15 = (com.wakeup.common.network.BaseResult) r15     // Catch: java.lang.Throwable -> L2b
            boolean r12 = r15.isSuccess()     // Catch: java.lang.Throwable -> L2b
            if (r12 != 0) goto L5a
        L58:
            r5 = r4
            goto L7c
        L5a:
            java.lang.Object r12 = r15.getData()     // Catch: java.lang.Throwable -> L2b
            com.wakeup.feature.wkvideo.livecut.api.LiveCutProductResponseDto r12 = (com.wakeup.feature.wkvideo.livecut.api.LiveCutProductResponseDto) r12     // Catch: java.lang.Throwable -> L2b
            if (r12 != 0) goto L63
            goto L58
        L63:
            com.wakeup.feature.wkvideo.livecut.model.LiveCutProduct r5 = new com.wakeup.feature.wkvideo.livecut.model.LiveCutProduct     // Catch: java.lang.Throwable -> L2b
            java.lang.String r6 = r12.getProductId()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r7 = r12.getClipId()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r8 = r12.getTitle()     // Catch: java.lang.Throwable -> L2b
            int r9 = r12.getPriceFen()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r10 = r12.getBuyPath()     // Catch: java.lang.Throwable -> L2b
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L2b
        L7c:
            java.lang.Object r12 = kotlin.Result.m14057constructorimpl(r5)     // Catch: java.lang.Throwable -> L2b
            goto L8b
        L81:
            kotlin.Result$Companion r13 = kotlin.Result.INSTANCE
            java.lang.Object r12 = kotlin.ResultKt.createFailure(r12)
            java.lang.Object r12 = kotlin.Result.m14057constructorimpl(r12)
        L8b:
            boolean r13 = kotlin.Result.m14063isFailureimpl(r12)
            if (r13 == 0) goto L92
            goto L93
        L92:
            r4 = r12
        L93:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.wkvideo.livecut.data.LiveCutCommerceRemote.fetchProduct(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|7|(1:(2:10|11)(2:37|38))(2:39|(6:45|(2:48|46)|49|50|51|(1:53))(1:44))|12|(10:26|(2:29|27)|30|31|(2:34|32)|35|36|15|16|(1:21)(2:18|19))|14|15|16|(0)(0)))|56|6|7|(0)(0)|12|(11:23|26|(1:27)|30|31|(1:32)|35|36|15|16|(0)(0))|14|15|16|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0038, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0142, code lost:
    
        r2 = kotlin.Result.INSTANCE;
        r0 = kotlin.Result.m14057constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ee A[Catch: all -> 0x0038, LOOP:0: B:27:0x00e8->B:29:0x00ee, LOOP_END, TryCatch #0 {all -> 0x0038, blocks: (B:11:0x0033, B:12:0x00c0, B:15:0x013d, B:23:0x00ca, B:26:0x00d3, B:27:0x00e8, B:29:0x00ee, B:31:0x00fe, B:32:0x0119, B:34:0x011f, B:36:0x0136, B:51:0x00b0), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011f A[Catch: all -> 0x0038, LOOP:1: B:32:0x0119->B:34:0x011f, LOOP_END, TryCatch #0 {all -> 0x0038, blocks: (B:11:0x0033, B:12:0x00c0, B:15:0x013d, B:23:0x00ca, B:26:0x00d3, B:27:0x00e8, B:29:0x00ee, B:31:0x00fe, B:32:0x0119, B:34:0x011f, B:36:0x0136, B:51:0x00b0), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object createOrder(java.util.List<com.wakeup.feature.wkvideo.livecut.model.LiveCutCartItem> r19, kotlin.coroutines.Continuation<? super com.wakeup.feature.wkvideo.livecut.model.LiveCutOrder> r20) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.wkvideo.livecut.data.LiveCutCommerceRemote.createOrder(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
