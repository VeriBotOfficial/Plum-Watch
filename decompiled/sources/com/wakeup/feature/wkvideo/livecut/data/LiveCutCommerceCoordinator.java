package com.wakeup.feature.wkvideo.livecut.data;

import kotlin.Metadata;

/* compiled from: LiveCutCommerceCoordinator.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0086@¢\u0006\u0002\u0010\u0006J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/wakeup/feature/wkvideo/livecut/data/LiveCutCommerceCoordinator;", "", "<init>", "()V", "checkoutCurrentCart", "Lcom/wakeup/feature/wkvideo/livecut/model/LiveCutOrder;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshProduct", "Lcom/wakeup/feature/wkvideo/livecut/model/LiveCutProduct;", "clipId", "", "title", "buyPath", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-wkvideo_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LiveCutCommerceCoordinator {
    public static final LiveCutCommerceCoordinator INSTANCE = new LiveCutCommerceCoordinator();

    private LiveCutCommerceCoordinator() {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object checkoutCurrentCart(kotlin.coroutines.Continuation<? super com.wakeup.feature.wkvideo.livecut.model.LiveCutOrder> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.wakeup.feature.wkvideo.livecut.data.LiveCutCommerceCoordinator$checkoutCurrentCart$1
            if (r0 == 0) goto L14
            r0 = r5
            com.wakeup.feature.wkvideo.livecut.data.LiveCutCommerceCoordinator$checkoutCurrentCart$1 r0 = (com.wakeup.feature.wkvideo.livecut.data.LiveCutCommerceCoordinator$checkoutCurrentCart$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.label
            int r5 = r5 - r2
            r0.label = r5
            goto L19
        L14:
            com.wakeup.feature.wkvideo.livecut.data.LiveCutCommerceCoordinator$checkoutCurrentCart$1 r0 = new com.wakeup.feature.wkvideo.livecut.data.LiveCutCommerceCoordinator$checkoutCurrentCart$1
            r0.<init>(r4, r5)
        L19:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r5)
            goto L56
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L32:
            kotlin.ResultKt.throwOnFailure(r5)
            com.wakeup.feature.wkvideo.livecut.data.LiveCutCommerceStore r5 = com.wakeup.feature.wkvideo.livecut.data.LiveCutCommerceStore.INSTANCE
            java.util.List r5 = r5.getCartItems()
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto L43
            r5 = 0
            return r5
        L43:
            com.wakeup.feature.wkvideo.livecut.api.LiveCutCommerceApiHolder r2 = com.wakeup.feature.wkvideo.livecut.api.LiveCutCommerceApiHolder.INSTANCE
            boolean r2 = r2.isRemoteEnabled()
            if (r2 == 0) goto L60
            com.wakeup.feature.wkvideo.livecut.data.LiveCutCommerceRemote r2 = com.wakeup.feature.wkvideo.livecut.data.LiveCutCommerceRemote.INSTANCE
            r0.label = r3
            java.lang.Object r5 = r2.createOrder(r5, r0)
            if (r5 != r1) goto L56
            return r1
        L56:
            com.wakeup.feature.wkvideo.livecut.model.LiveCutOrder r5 = (com.wakeup.feature.wkvideo.livecut.model.LiveCutOrder) r5
            if (r5 == 0) goto L60
            com.wakeup.feature.wkvideo.livecut.data.LiveCutCommerceStore r0 = com.wakeup.feature.wkvideo.livecut.data.LiveCutCommerceStore.INSTANCE
            r0.clearCart()
            return r5
        L60:
            com.wakeup.feature.wkvideo.livecut.data.LiveCutCommerceStore r5 = com.wakeup.feature.wkvideo.livecut.data.LiveCutCommerceStore.INSTANCE
            com.wakeup.feature.wkvideo.livecut.model.LiveCutOrder r5 = r5.checkout()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.wkvideo.livecut.data.LiveCutCommerceCoordinator.checkoutCurrentCart(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refreshProduct(java.lang.String r6, java.lang.String r7, java.lang.String r8, kotlin.coroutines.Continuation<? super com.wakeup.feature.wkvideo.livecut.model.LiveCutProduct> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.wakeup.feature.wkvideo.livecut.data.LiveCutCommerceCoordinator$refreshProduct$1
            if (r0 == 0) goto L14
            r0 = r9
            com.wakeup.feature.wkvideo.livecut.data.LiveCutCommerceCoordinator$refreshProduct$1 r0 = (com.wakeup.feature.wkvideo.livecut.data.LiveCutCommerceCoordinator$refreshProduct$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L19
        L14:
            com.wakeup.feature.wkvideo.livecut.data.LiveCutCommerceCoordinator$refreshProduct$1 r0 = new com.wakeup.feature.wkvideo.livecut.data.LiveCutCommerceCoordinator$refreshProduct$1
            r0.<init>(r5, r9)
        L19:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.L$0
            com.wakeup.feature.wkvideo.livecut.model.LiveCutProduct r6 = (com.wakeup.feature.wkvideo.livecut.model.LiveCutProduct) r6
            kotlin.ResultKt.throwOnFailure(r9)
            goto L4f
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.ResultKt.throwOnFailure(r9)
            com.wakeup.feature.wkvideo.livecut.data.LiveCutCommerceStore r9 = com.wakeup.feature.wkvideo.livecut.data.LiveCutCommerceStore.INSTANCE
            com.wakeup.feature.wkvideo.livecut.model.LiveCutProduct r9 = r9.buildProduct(r6, r7, r8)
            com.wakeup.feature.wkvideo.livecut.data.LiveCutCommerceRemote r2 = com.wakeup.feature.wkvideo.livecut.data.LiveCutCommerceRemote.INSTANCE
            r0.L$0 = r9
            r0.label = r3
            java.lang.Object r6 = r2.fetchProduct(r6, r7, r8, r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r4 = r9
            r9 = r6
            r6 = r4
        L4f:
            com.wakeup.feature.wkvideo.livecut.model.LiveCutProduct r9 = (com.wakeup.feature.wkvideo.livecut.model.LiveCutProduct) r9
            if (r9 != 0) goto L54
            return r6
        L54:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.wkvideo.livecut.data.LiveCutCommerceCoordinator.refreshProduct(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
