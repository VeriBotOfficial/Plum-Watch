package com.wakeup.module.ai.port;

import com.wakeup.common.log.LogUtils;
import com.wakeup.common.network.BaseObserver;
import com.wakeup.common.network.NetworkScheduler;
import com.wakeup.common.network.RetrofitManager;
import com.wakeup.common.network.entity.ai.AiLanguage;
import com.wakeup.common.network.entity.ai.TransferLang;
import com.wakeup.commponent.module.ai.DeviceChannel;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TSPort.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086@¢\u0006\u0002\u0010\nJB\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u001a\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\f0\u0013J.\u0010\u0015\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/wakeup/module/ai/port/TSPort;", "", "<init>", "()V", "TAG", "", "langList", "", "Lcom/wakeup/common/network/entity/ai/AiLanguage;", "getLangList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startTransferSync", "", "fromLang", "toLang", "text", "projectId", "", "callback", "Lkotlin/Function2;", "Lcom/wakeup/common/network/entity/ai/TransferLang$Response;", "startTransfer", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TSPort {
    private final String TAG = "TSPort";
    private List<AiLanguage> langList = CollectionsKt.emptyList();

    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getLangList(kotlin.coroutines.Continuation<? super java.util.List<com.wakeup.common.network.entity.ai.AiLanguage>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.wakeup.module.ai.port.TSPort$getLangList$1
            if (r0 == 0) goto L14
            r0 = r7
            com.wakeup.module.ai.port.TSPort$getLangList$1 r0 = (com.wakeup.module.ai.port.TSPort$getLangList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            com.wakeup.module.ai.port.TSPort$getLangList$1 r0 = new com.wakeup.module.ai.port.TSPort$getLangList$1
            r0.<init>(r6, r7)
        L19:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.L$0
            com.wakeup.module.ai.port.TSPort r0 = (com.wakeup.module.ai.port.TSPort) r0
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Exception -> L2e
            goto L8c
        L2e:
            r7 = move-exception
            goto L9d
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            kotlin.ResultKt.throwOnFailure(r7)
            java.util.List<com.wakeup.common.network.entity.ai.AiLanguage> r7 = r6.langList
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L62
            java.lang.String r7 = r6.TAG
            java.util.List<com.wakeup.common.network.entity.ai.AiLanguage> r0 = r6.langList
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getLangList have cache: "
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            com.wakeup.common.log.LogUtils.i(r7, r0)
            java.util.List<com.wakeup.common.network.entity.ai.AiLanguage> r7 = r6.langList
            return r7
        L62:
            com.wakeup.commponent.module.ai.DeviceChannel r7 = com.wakeup.commponent.module.ai.DeviceChannel.INSTANCE     // Catch: java.lang.Exception -> L9b
            r2 = 25
            java.util.Map r7 = r7.getHeads(r2)     // Catch: java.lang.Exception -> L9b
            java.util.Map r7 = kotlin.collections.MapsKt.toMutableMap(r7)     // Catch: java.lang.Exception -> L9b
            com.wakeup.commponent.module.ai.DeviceChannel r2 = com.wakeup.commponent.module.ai.DeviceChannel.INSTANCE     // Catch: java.lang.Exception -> L9b
            java.lang.String r2 = r2.getTsListUrl()     // Catch: java.lang.Exception -> L9b
            com.wakeup.common.network.RetrofitManager$Companion r4 = com.wakeup.common.network.RetrofitManager.INSTANCE     // Catch: java.lang.Exception -> L9b
            com.wakeup.common.network.RetrofitManager r4 = r4.getInstance()     // Catch: java.lang.Exception -> L9b
            com.wakeup.common.network.api.WKAiSignService r4 = r4.getApiWkAiSign()     // Catch: java.lang.Exception -> L9b
            java.lang.String r5 = "1"
            r0.L$0 = r6     // Catch: java.lang.Exception -> L9b
            r0.label = r3     // Catch: java.lang.Exception -> L9b
            java.lang.Object r7 = r4.transferLangList(r2, r7, r5, r0)     // Catch: java.lang.Exception -> L9b
            if (r7 != r1) goto L8b
            return r1
        L8b:
            r0 = r6
        L8c:
            com.wakeup.common.network.BaseResult r7 = (com.wakeup.common.network.BaseResult) r7     // Catch: java.lang.Exception -> L2e
            java.lang.Object r7 = r7.getData()     // Catch: java.lang.Exception -> L2e
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch: java.lang.Exception -> L2e
            java.util.List r7 = kotlin.collections.CollectionsKt.toList(r7)     // Catch: java.lang.Exception -> L2e
            r0.langList = r7     // Catch: java.lang.Exception -> L2e
            return r7
        L9b:
            r7 = move-exception
            r0 = r6
        L9d:
            java.lang.String r1 = r0.TAG
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            java.lang.String r7 = com.blankj.utilcode.util.ThrowableUtils.getFullStackTrace(r7)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "getLangList onFail: "
            r2.<init>(r3)
            java.lang.StringBuilder r7 = r2.append(r7)
            java.lang.String r7 = r7.toString()
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            com.wakeup.common.log.LogUtils.i(r1, r7)
            java.util.List<com.wakeup.common.network.entity.ai.AiLanguage> r7 = r0.langList
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.module.ai.port.TSPort.getLangList(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void startTransferSync(String fromLang, String toLang, String text, int projectId, final Function2<? super Integer, ? super TransferLang.Response, Unit> callback) {
        Intrinsics.checkNotNullParameter(fromLang, "fromLang");
        Intrinsics.checkNotNullParameter(toLang, "toLang");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Map<String, String> mutableMap = MapsKt.toMutableMap(DeviceChannel.INSTANCE.getHeads(projectId));
        RetrofitManager.INSTANCE.getInstance().getApiWkAiSign().transferLangSync(DeviceChannel.INSTANCE.getTsUrl(), mutableMap, new TransferLang.Request(fromLang, toLang, text)).compose(NetworkScheduler.INSTANCE.compose()).subscribe(new BaseObserver<TransferLang.Response>() { // from class: com.wakeup.module.ai.port.TSPort$startTransferSync$1
            @Override // com.wakeup.common.network.BaseObserver
            public void onSuccess(TransferLang.Response data) {
                String str;
                Intrinsics.checkNotNullParameter(data, "data");
                str = TSPort.this.TAG;
                LogUtils.i(str, "getLangList onSuccess");
                callback.invoke(0, data);
            }

            @Override // com.wakeup.common.network.BaseObserver
            public void onFail(int code, String msg) {
                String str;
                Intrinsics.checkNotNullParameter(msg, "msg");
                str = TSPort.this.TAG;
                LogUtils.i(str, "getLangList onFail code:" + code + ", msg: " + msg);
                callback.invoke(-1, null);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object startTransfer(java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, kotlin.coroutines.Continuation<? super java.lang.String> r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof com.wakeup.module.ai.port.TSPort$startTransfer$1
            if (r0 == 0) goto L14
            r0 = r11
            com.wakeup.module.ai.port.TSPort$startTransfer$1 r0 = (com.wakeup.module.ai.port.TSPort$startTransfer$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r11 = r0.label
            int r11 = r11 - r2
            r0.label = r11
            goto L19
        L14:
            com.wakeup.module.ai.port.TSPort$startTransfer$1 r0 = new com.wakeup.module.ai.port.TSPort$startTransfer$1
            r0.<init>(r6, r11)
        L19:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r0.L$0
            com.wakeup.module.ai.port.TSPort r8 = (com.wakeup.module.ai.port.TSPort) r8
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Exception -> L32
            goto L71
        L32:
            r9 = move-exception
            goto L81
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.String r11 = ""
            com.wakeup.commponent.module.ai.DeviceChannel r2 = com.wakeup.commponent.module.ai.DeviceChannel.INSTANCE     // Catch: java.lang.Exception -> L7e
            java.util.Map r10 = r2.getHeads(r10)     // Catch: java.lang.Exception -> L7e
            java.util.Map r10 = kotlin.collections.MapsKt.toMutableMap(r10)     // Catch: java.lang.Exception -> L7e
            com.wakeup.commponent.module.ai.DeviceChannel r2 = com.wakeup.commponent.module.ai.DeviceChannel.INSTANCE     // Catch: java.lang.Exception -> L7e
            java.lang.String r2 = r2.getTsUrl()     // Catch: java.lang.Exception -> L7e
            com.wakeup.common.network.RetrofitManager$Companion r4 = com.wakeup.common.network.RetrofitManager.INSTANCE     // Catch: java.lang.Exception -> L7e
            com.wakeup.common.network.RetrofitManager r4 = r4.getInstance()     // Catch: java.lang.Exception -> L7e
            com.wakeup.common.network.api.WKAiSignService r4 = r4.getApiWkAiSign()     // Catch: java.lang.Exception -> L7e
            com.wakeup.common.network.entity.ai.TransferLang$Request r5 = new com.wakeup.common.network.entity.ai.TransferLang$Request     // Catch: java.lang.Exception -> L7e
            r5.<init>(r7, r8, r9)     // Catch: java.lang.Exception -> L7e
            r0.L$0 = r6     // Catch: java.lang.Exception -> L7e
            r0.L$1 = r11     // Catch: java.lang.Exception -> L7e
            r0.label = r3     // Catch: java.lang.Exception -> L7e
            java.lang.Object r7 = r4.transferLang(r2, r10, r5, r0)     // Catch: java.lang.Exception -> L7e
            if (r7 != r1) goto L6d
            return r1
        L6d:
            r8 = r11
            r11 = r7
            r7 = r8
            r8 = r6
        L71:
            com.wakeup.common.network.BaseResult r11 = (com.wakeup.common.network.BaseResult) r11     // Catch: java.lang.Exception -> L32
            java.lang.Object r9 = r11.getData()     // Catch: java.lang.Exception -> L32
            com.wakeup.common.network.entity.ai.TransferLang$Response r9 = (com.wakeup.common.network.entity.ai.TransferLang.Response) r9     // Catch: java.lang.Exception -> L32
            java.lang.String r7 = r9.getTransContent()     // Catch: java.lang.Exception -> L32
            return r7
        L7e:
            r9 = move-exception
            r8 = r6
            r7 = r11
        L81:
            java.lang.String r8 = r8.TAG
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            java.lang.String r9 = com.blankj.utilcode.util.ThrowableUtils.getFullStackTrace(r9)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "startTransfer onFail:  "
            r10.<init>(r11)
            java.lang.StringBuilder r9 = r10.append(r9)
            java.lang.String r9 = r9.toString()
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            com.wakeup.common.log.LogUtils.i(r8, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.module.ai.port.TSPort.startTransfer(java.lang.String, java.lang.String, java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
