package com.wakeup.howear.view.home;

import com.wakeup.feature.health.dashboard.HdContent;
import com.wakeup.howear.view.home.NewDeviceHomePageFragmentV2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NewDeviceHomePageFragmentV2.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/wakeup/howear/view/home/NewDeviceHomePageFragmentV2$HomeV2BoardSnapshot;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.wakeup.howear.view.home.NewDeviceHomePageFragmentV2$refreshHomeV2HealthBoard$1$board$1", f = "NewDeviceHomePageFragmentV2.kt", i = {1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4}, l = {651, 652, 653, 659, 660}, m = "invokeSuspend", n = {"heart", "heart", "bloodOxygen", "heart", "bloodOxygen", "systolic", "diastolic", "heart", "bloodOxygen", "systolic", "diastolic", HdContent.LINK}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4"})
/* loaded from: classes4.dex */
final class NewDeviceHomePageFragmentV2$refreshHomeV2HealthBoard$1$board$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super NewDeviceHomePageFragmentV2.HomeV2BoardSnapshot>, Object> {
    final /* synthetic */ boolean $useFahrenheit;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NewDeviceHomePageFragmentV2$refreshHomeV2HealthBoard$1$board$1(boolean z, Continuation<? super NewDeviceHomePageFragmentV2$refreshHomeV2HealthBoard$1$board$1> continuation) {
        super(2, continuation);
        this.$useFahrenheit = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NewDeviceHomePageFragmentV2$refreshHomeV2HealthBoard$1$board$1(this.$useFahrenheit, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super NewDeviceHomePageFragmentV2.HomeV2BoardSnapshot> continuation) {
        return ((NewDeviceHomePageFragmentV2$refreshHomeV2HealthBoard$1$board$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0176, code lost:
    
        if (r1.floatValue() > 0.0f) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x013d, code lost:
    
        if (r4.intValue() > 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c7, code lost:
    
        if (r6.intValue() > 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x009f, code lost:
    
        if (r2.intValue() > 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00b0, code lost:
    
        if (r6 == r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0088, code lost:
    
        if (r2 == r1) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ef  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.howear.view.home.NewDeviceHomePageFragmentV2$refreshHomeV2HealthBoard$1$board$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:29|30))(3:31|32|(1:34))|11|12|(1:14)(4:16|(2:20|(3:21|(1:23)|24))|18|19)))|38|6|7|(0)(0)|11|12|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0097, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0098, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0059, code lost:
    
        r7 = kotlin.collections.CollectionsKt.emptyList();
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invokeSuspend$latest(int r6, kotlin.coroutines.Continuation<? super com.wakeup.commponent.module.data.HealthData> r7) {
        /*
            boolean r0 = r7 instanceof com.wakeup.howear.view.home.NewDeviceHomePageFragmentV2$refreshHomeV2HealthBoard$1$board$1$latest$1
            if (r0 == 0) goto L14
            r0 = r7
            com.wakeup.howear.view.home.NewDeviceHomePageFragmentV2$refreshHomeV2HealthBoard$1$board$1$latest$1 r0 = (com.wakeup.howear.view.home.NewDeviceHomePageFragmentV2$refreshHomeV2HealthBoard$1$board$1$latest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            com.wakeup.howear.view.home.NewDeviceHomePageFragmentV2$refreshHomeV2HealthBoard$1$board$1$latest$1 r0 = new com.wakeup.howear.view.home.NewDeviceHomePageFragmentV2$refreshHomeV2HealthBoard$1$board$1$latest$1
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L97
            goto L56
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            kotlin.ResultKt.throwOnFailure(r7)
            com.wakeup.commponent.module.data.HiDataManager r7 = com.wakeup.commponent.module.data.HiDataManager.INSTANCE     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L97
            com.wakeup.commponent.module.data.HealthConfig$Builder r2 = new com.wakeup.commponent.module.data.HealthConfig$Builder     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L97
            r2.<init>(r6)     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L97
            com.wakeup.commponent.module.data.HealthConfig$Builder r6 = r2.setIsDesc(r3)     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L97
            com.wakeup.commponent.module.data.HealthConfig$Builder r6 = r6.setLimit(r3)     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L97
            com.wakeup.commponent.module.data.HealthConfig r6 = r6.build()     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L97
            java.lang.String r2 = "build(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L97
            r0.label = r3     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L97
            java.lang.Object r7 = r7.queryData(r6, r0)     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L97
            if (r7 != r1) goto L56
            return r1
        L56:
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Exception -> L59 java.util.concurrent.CancellationException -> L97
            goto L5d
        L59:
            java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
        L5d:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r6 = r7.iterator()
            boolean r7 = r6.hasNext()
            if (r7 != 0) goto L6b
            r6 = 0
            goto L96
        L6b:
            java.lang.Object r7 = r6.next()
            boolean r0 = r6.hasNext()
            if (r0 != 0) goto L77
        L75:
            r6 = r7
            goto L96
        L77:
            r0 = r7
            com.wakeup.commponent.module.data.HealthData r0 = (com.wakeup.commponent.module.data.HealthData) r0
            long r0 = r0.getTime()
        L7e:
            java.lang.Object r2 = r6.next()
            r3 = r2
            com.wakeup.commponent.module.data.HealthData r3 = (com.wakeup.commponent.module.data.HealthData) r3
            long r3 = r3.getTime()
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 >= 0) goto L8f
            r7 = r2
            r0 = r3
        L8f:
            boolean r2 = r6.hasNext()
            if (r2 != 0) goto L7e
            goto L75
        L96:
            return r6
        L97:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.howear.view.home.NewDeviceHomePageFragmentV2$refreshHomeV2HealthBoard$1$board$1.invokeSuspend$latest(int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
