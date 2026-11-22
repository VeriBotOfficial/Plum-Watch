package com.wakeup.module.ai.port;

import com.huawei.hms.support.api.entity.core.CommonCode;
import kotlin.Metadata;

/* compiled from: IRPort2.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/wakeup/module/ai/port/IRPort2;", "", "<init>", "()V", "TAG", "", "start", "Lcom/wakeup/common/network/entity/ai/AiIntent;", "projectId", "", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IRPort2 {
    private final String TAG = "IRPort2";

    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object start(int r7, java.lang.String r8, kotlin.coroutines.Continuation<? super com.wakeup.common.network.entity.ai.AiIntent> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.wakeup.module.ai.port.IRPort2$start$1
            if (r0 == 0) goto L14
            r0 = r9
            com.wakeup.module.ai.port.IRPort2$start$1 r0 = (com.wakeup.module.ai.port.IRPort2$start$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L19
        L14:
            com.wakeup.module.ai.port.IRPort2$start$1 r0 = new com.wakeup.module.ai.port.IRPort2$start$1
            r0.<init>(r6, r9)
        L19:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r7 = r0.L$0
            com.wakeup.module.ai.port.IRPort2 r7 = (com.wakeup.module.ai.port.IRPort2) r7
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Exception -> L2f
            goto L65
        L2f:
            r8 = move-exception
            goto L6e
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            kotlin.ResultKt.throwOnFailure(r9)
            com.wakeup.commponent.module.ai.DeviceChannel r9 = com.wakeup.commponent.module.ai.DeviceChannel.INSTANCE
            java.util.Map r7 = r9.getHeads(r7)
            java.util.Map r7 = kotlin.collections.MapsKt.toMutableMap(r7)
            com.wakeup.commponent.module.ai.DeviceChannel r9 = com.wakeup.commponent.module.ai.DeviceChannel.INSTANCE
            java.lang.String r9 = r9.getIRUrl()
            kotlinx.coroutines.CoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.getIO()     // Catch: java.lang.Exception -> L6c
            kotlin.coroutines.CoroutineContext r2 = (kotlin.coroutines.CoroutineContext) r2     // Catch: java.lang.Exception -> L6c
            com.wakeup.module.ai.port.IRPort2$start$result$1 r5 = new com.wakeup.module.ai.port.IRPort2$start$result$1     // Catch: java.lang.Exception -> L6c
            r5.<init>(r9, r7, r8, r3)     // Catch: java.lang.Exception -> L6c
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5     // Catch: java.lang.Exception -> L6c
            r0.L$0 = r6     // Catch: java.lang.Exception -> L6c
            r0.label = r4     // Catch: java.lang.Exception -> L6c
            java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r2, r5, r0)     // Catch: java.lang.Exception -> L6c
            if (r9 != r1) goto L64
            return r1
        L64:
            r7 = r6
        L65:
            com.wakeup.common.network.BaseResult r9 = (com.wakeup.common.network.BaseResult) r9     // Catch: java.lang.Exception -> L2f
            java.lang.Object r7 = r9.getData()     // Catch: java.lang.Exception -> L2f
            return r7
        L6c:
            r8 = move-exception
            r7 = r6
        L6e:
            java.lang.String r7 = r7.TAG
            java.lang.String r9 = "startIR error: "
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            com.wakeup.common.log.LogUtils.e(r7, r9, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.module.ai.port.IRPort2.start(int, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
