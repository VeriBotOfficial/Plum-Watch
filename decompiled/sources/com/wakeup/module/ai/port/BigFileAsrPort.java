package com.wakeup.module.ai.port;

import com.wakeup.common.Constants;
import com.wakeup.common.base.BaseCallback;
import kotlin.Metadata;

/* compiled from: BigFileAsrPort.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u0010\u0018J(\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0005H\u0082@¢\u0006\u0002\u0010\u001bJ,\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001d2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001aH\u0086@¢\u0006\u0002\u0010\u001fJ,\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001d2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001aH\u0082@¢\u0006\u0002\u0010\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\""}, d2 = {"Lcom/wakeup/module/ai/port/BigFileAsrPort;", "", "<init>", "()V", "TAG", "", "taskCancel", "", "getTaskCancel", "()Z", "setTaskCancel", "(Z)V", "callback", "Lcom/wakeup/common/base/BaseCallback;", "getCallback", "()Lcom/wakeup/common/base/BaseCallback;", "setCallback", "(Lcom/wakeup/common/base/BaseCallback;)V", "submitFile", "", "projectId", "", "filePath", "languageId", "(ILjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "audioFileToText", "Lcom/wakeup/common/network/entity/ai/FileToTextBean2;", "(IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryTask", "Lkotlin/Pair;", Constants.BundleKey.BEAN, "(ILcom/wakeup/common/network/entity/ai/FileToTextBean2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryFileToTextStatus", "Companion", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BigFileAsrPort {
    public static final int FILE_UP_STATUS_ARREARS = 100012;
    public static final int FILE_UP_STATUS_CANCEL = 2;
    public static final int FILE_UP_STATUS_COMPLETE = 5;
    public static final int FILE_UP_STATUS_ERR = 1;
    public static final int FILE_UP_STATUS_SUCCESS = 0;
    private final String TAG = "BigFileAsrPort";
    private BaseCallback<String> callback;
    private volatile boolean taskCancel;

    public final boolean getTaskCancel() {
        return this.taskCancel;
    }

    public final void setTaskCancel(boolean z) {
        this.taskCancel = z;
    }

    public final BaseCallback<String> getCallback() {
        return this.callback;
    }

    public final void setCallback(BaseCallback<String> baseCallback) {
        this.callback = baseCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        if (r10 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object submitFile(int r7, java.lang.String r8, int r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.wakeup.module.ai.port.BigFileAsrPort$submitFile$1
            if (r0 == 0) goto L14
            r0 = r10
            com.wakeup.module.ai.port.BigFileAsrPort$submitFile$1 r0 = (com.wakeup.module.ai.port.BigFileAsrPort$submitFile$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r10 = r0.label
            int r10 = r10 - r2
            r0.label = r10
            goto L19
        L14:
            com.wakeup.module.ai.port.BigFileAsrPort$submitFile$1 r0 = new com.wakeup.module.ai.port.BigFileAsrPort$submitFile$1
            r0.<init>(r6, r10)
        L19:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r7 = r0.L$0
            com.wakeup.module.ai.port.BigFileAsrPort r7 = (com.wakeup.module.ai.port.BigFileAsrPort) r7
            kotlin.ResultKt.throwOnFailure(r10)
            goto L7c
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            int r7 = r0.I$0
            java.lang.Object r8 = r0.L$0
            com.wakeup.module.ai.port.BigFileAsrPort r8 = (com.wakeup.module.ai.port.BigFileAsrPort) r8
            kotlin.ResultKt.throwOnFailure(r10)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L58
        L46:
            kotlin.ResultKt.throwOnFailure(r10)
            r0.L$0 = r6
            r0.I$0 = r7
            r0.label = r4
            java.lang.Object r10 = r6.audioFileToText(r7, r9, r8, r0)
            if (r10 != r1) goto L56
            goto L7b
        L56:
            r8 = r7
            r7 = r6
        L58:
            com.wakeup.common.network.entity.ai.FileToTextBean2 r10 = (com.wakeup.common.network.entity.ai.FileToTextBean2) r10
            if (r10 != 0) goto L67
            com.wakeup.common.base.BaseCallback<java.lang.String> r7 = r7.callback
            if (r7 == 0) goto L64
            r8 = 0
            r7.callback(r4, r8)
        L64:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L67:
            com.wakeup.common.base.BaseCallback<java.lang.String> r9 = r7.callback
            if (r9 == 0) goto L71
            r2 = 0
            java.lang.String r4 = ""
            r9.callback(r2, r4)
        L71:
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r10 = r7.queryTask(r8, r10, r0)
            if (r10 != r1) goto L7c
        L7b:
            return r1
        L7c:
            kotlin.Pair r10 = (kotlin.Pair) r10
            java.lang.Object r8 = r10.component1()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            java.lang.Object r9 = r10.component2()
            java.lang.String r9 = (java.lang.String) r9
            com.wakeup.common.base.BaseCallback<java.lang.String> r7 = r7.callback
            if (r7 == 0) goto L95
            r7.callback(r8, r9)
        L95:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.module.ai.port.BigFileAsrPort.submitFile(int, java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0094 A[Catch: Exception -> 0x0032, TRY_LEAVE, TryCatch #1 {Exception -> 0x0032, blocks: (B:11:0x002e, B:12:0x0088, B:16:0x0094), top: B:10:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object audioFileToText(int r10, int r11, java.lang.String r12, kotlin.coroutines.Continuation<? super com.wakeup.common.network.entity.ai.FileToTextBean2> r13) {
        /*
            r9 = this;
            java.lang.String r0 = "audioFileToText success traceId: "
            boolean r1 = r13 instanceof com.wakeup.module.ai.port.BigFileAsrPort$audioFileToText$1
            if (r1 == 0) goto L16
            r1 = r13
            com.wakeup.module.ai.port.BigFileAsrPort$audioFileToText$1 r1 = (com.wakeup.module.ai.port.BigFileAsrPort$audioFileToText$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L16
            int r13 = r1.label
            int r13 = r13 - r3
            r1.label = r13
            goto L1b
        L16:
            com.wakeup.module.ai.port.BigFileAsrPort$audioFileToText$1 r1 = new com.wakeup.module.ai.port.BigFileAsrPort$audioFileToText$1
            r1.<init>(r9, r13)
        L1b:
            r7 = r1
            java.lang.Object r13 = r7.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r7.label
            r8 = 0
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r10 = r7.L$0
            com.wakeup.module.ai.port.BigFileAsrPort r10 = (com.wakeup.module.ai.port.BigFileAsrPort) r10
            kotlin.ResultKt.throwOnFailure(r13)     // Catch: java.lang.Exception -> L32
            goto L88
        L32:
            r0 = move-exception
            r11 = r0
            goto Ld0
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3e:
            kotlin.ResultKt.throwOnFailure(r13)
            com.wakeup.commponent.module.ai.DeviceChannel r13 = com.wakeup.commponent.module.ai.DeviceChannel.INSTANCE     // Catch: java.lang.Exception -> Lcd
            java.lang.String r13 = r13.postBigFileAsrUrl()     // Catch: java.lang.Exception -> Lcd
            com.wakeup.commponent.module.ai.DeviceChannel r2 = com.wakeup.commponent.module.ai.DeviceChannel.INSTANCE     // Catch: java.lang.Exception -> Lcd
            java.util.Map r10 = r2.getHeads(r10)     // Catch: java.lang.Exception -> Lcd
            java.util.Map r4 = kotlin.collections.MapsKt.toMutableMap(r10)     // Catch: java.lang.Exception -> Lcd
            java.io.File r10 = new java.io.File     // Catch: java.lang.Exception -> Lcd
            r10.<init>(r12)     // Catch: java.lang.Exception -> Lcd
            okhttp3.RequestBody$Companion r12 = okhttp3.RequestBody.INSTANCE     // Catch: java.lang.Exception -> Lcd
            okhttp3.MediaType$Companion r2 = okhttp3.MediaType.INSTANCE     // Catch: java.lang.Exception -> Lcd
            java.lang.String r5 = "multipart/form-data"
            okhttp3.MediaType r2 = r2.parse(r5)     // Catch: java.lang.Exception -> Lcd
            okhttp3.RequestBody r12 = r12.create(r2, r10)     // Catch: java.lang.Exception -> Lcd
            okhttp3.MultipartBody$Part$Companion r2 = okhttp3.MultipartBody.Part.INSTANCE     // Catch: java.lang.Exception -> Lcd
            java.lang.String r5 = "file"
            java.lang.String r10 = r10.getName()     // Catch: java.lang.Exception -> Lcd
            okhttp3.MultipartBody$Part r6 = r2.createFormData(r5, r10, r12)     // Catch: java.lang.Exception -> Lcd
            com.wakeup.common.network.RetrofitManager$Companion r10 = com.wakeup.common.network.RetrofitManager.INSTANCE     // Catch: java.lang.Exception -> Lcd
            com.wakeup.common.network.RetrofitManager r10 = r10.getInstance()     // Catch: java.lang.Exception -> Lcd
            com.wakeup.common.network.api.WKAiSignService r2 = r10.getApiWkAiSign()     // Catch: java.lang.Exception -> Lcd
            r7.L$0 = r9     // Catch: java.lang.Exception -> Lcd
            r7.label = r3     // Catch: java.lang.Exception -> Lcd
            r5 = r11
            r3 = r13
            java.lang.Object r13 = r2.speechBigFileToText2(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> Lcd
            if (r13 != r1) goto L87
            return r1
        L87:
            r10 = r9
        L88:
            com.wakeup.common.network.BaseResult r13 = (com.wakeup.common.network.BaseResult) r13     // Catch: java.lang.Exception -> L32
            int r11 = r13.getCode()     // Catch: java.lang.Exception -> L32
            r12 = 100012(0x186ac, float:1.40147E-40)
            if (r11 != r12) goto L94
            return r8
        L94:
            java.lang.Object r11 = r13.getData()     // Catch: java.lang.Exception -> L32
            com.wakeup.common.network.entity.ai.FileToTextBean2 r11 = (com.wakeup.common.network.entity.ai.FileToTextBean2) r11     // Catch: java.lang.Exception -> L32
            java.lang.String r11 = r11.getTraceId()     // Catch: java.lang.Exception -> L32
            java.lang.Object r12 = r13.getData()     // Catch: java.lang.Exception -> L32
            com.wakeup.common.network.entity.ai.FileToTextBean2 r12 = (com.wakeup.common.network.entity.ai.FileToTextBean2) r12     // Catch: java.lang.Exception -> L32
            java.lang.String r12 = r12.getBigFileSpeechTaskId()     // Catch: java.lang.Exception -> L32
            java.lang.String r1 = r10.TAG     // Catch: java.lang.Exception -> L32
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L32
            r2.<init>(r0)     // Catch: java.lang.Exception -> L32
            java.lang.StringBuilder r11 = r2.append(r11)     // Catch: java.lang.Exception -> L32
            java.lang.String r0 = ", taskId: "
            java.lang.StringBuilder r11 = r11.append(r0)     // Catch: java.lang.Exception -> L32
            java.lang.StringBuilder r11 = r11.append(r12)     // Catch: java.lang.Exception -> L32
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Exception -> L32
            java.lang.Object[] r11 = new java.lang.Object[]{r11}     // Catch: java.lang.Exception -> L32
            com.wakeup.common.log.LogUtils.i(r1, r11)     // Catch: java.lang.Exception -> L32
            java.lang.Object r10 = r13.getData()     // Catch: java.lang.Exception -> L32
            return r10
        Lcd:
            r0 = move-exception
            r11 = r0
            r10 = r9
        Ld0:
            java.lang.String r10 = r10.TAG
            java.lang.String r11 = r11.getMessage()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "audioFileToText err "
            r12.<init>(r13)
            java.lang.StringBuilder r11 = r12.append(r11)
            java.lang.String r11 = r11.toString()
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            com.wakeup.common.log.LogUtils.i(r10, r11)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.module.ai.port.BigFileAsrPort.audioFileToText(int, int, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b1, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(10000, r0) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object queryTask(int r9, com.wakeup.common.network.entity.ai.FileToTextBean2 r10, kotlin.coroutines.Continuation<? super kotlin.Pair<java.lang.Integer, java.lang.String>> r11) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.module.ai.port.BigFileAsrPort.queryTask(int, com.wakeup.common.network.entity.ai.FileToTextBean2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:11:0x002c, B:12:0x0063, B:14:0x006d, B:17:0x0082, B:19:0x008b, B:21:0x0095), top: B:10:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082 A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:11:0x002c, B:12:0x0063, B:14:0x006d, B:17:0x0082, B:19:0x008b, B:21:0x0095), top: B:10:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object queryFileToTextStatus(int r7, com.wakeup.common.network.entity.ai.FileToTextBean2 r8, kotlin.coroutines.Continuation<? super kotlin.Pair<java.lang.Integer, java.lang.String>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.wakeup.module.ai.port.BigFileAsrPort$queryFileToTextStatus$1
            if (r0 == 0) goto L14
            r0 = r9
            com.wakeup.module.ai.port.BigFileAsrPort$queryFileToTextStatus$1 r0 = (com.wakeup.module.ai.port.BigFileAsrPort$queryFileToTextStatus$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L19
        L14:
            com.wakeup.module.ai.port.BigFileAsrPort$queryFileToTextStatus$1 r0 = new com.wakeup.module.ai.port.BigFileAsrPort$queryFileToTextStatus$1
            r0.<init>(r6, r9)
        L19:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = -1
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 != r5) goto L32
            java.lang.Object r7 = r0.L$0
            com.wakeup.module.ai.port.BigFileAsrPort r7 = (com.wakeup.module.ai.port.BigFileAsrPort) r7
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Exception -> L30
            goto L63
        L30:
            r8 = move-exception
            goto La1
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            kotlin.ResultKt.throwOnFailure(r9)
            com.wakeup.commponent.module.ai.DeviceChannel r9 = com.wakeup.commponent.module.ai.DeviceChannel.INSTANCE     // Catch: java.lang.Exception -> L9f
            java.lang.String r9 = r9.getBigFileAsrResult()     // Catch: java.lang.Exception -> L9f
            com.wakeup.commponent.module.ai.DeviceChannel r2 = com.wakeup.commponent.module.ai.DeviceChannel.INSTANCE     // Catch: java.lang.Exception -> L9f
            java.util.Map r7 = r2.getHeads(r7)     // Catch: java.lang.Exception -> L9f
            java.util.Map r7 = kotlin.collections.MapsKt.toMutableMap(r7)     // Catch: java.lang.Exception -> L9f
            com.wakeup.common.network.RetrofitManager$Companion r2 = com.wakeup.common.network.RetrofitManager.INSTANCE     // Catch: java.lang.Exception -> L9f
            com.wakeup.common.network.RetrofitManager r2 = r2.getInstance()     // Catch: java.lang.Exception -> L9f
            com.wakeup.common.network.api.WKAiSignService r2 = r2.getApiWkAiSign()     // Catch: java.lang.Exception -> L9f
            r0.L$0 = r6     // Catch: java.lang.Exception -> L9f
            r0.label = r5     // Catch: java.lang.Exception -> L9f
            java.lang.Object r9 = r2.getBigFileAsrResult(r9, r7, r8, r0)     // Catch: java.lang.Exception -> L9f
            if (r9 != r1) goto L62
            return r1
        L62:
            r7 = r6
        L63:
            com.wakeup.common.network.BaseResult r9 = (com.wakeup.common.network.BaseResult) r9     // Catch: java.lang.Exception -> L30
            int r8 = r9.getCode()     // Catch: java.lang.Exception -> L30
            r0 = 200(0xc8, float:2.8E-43)
            if (r8 != r0) goto L82
            kotlin.Pair r8 = new kotlin.Pair     // Catch: java.lang.Exception -> L30
            r0 = 0
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)     // Catch: java.lang.Exception -> L30
            java.lang.Object r9 = r9.getData()     // Catch: java.lang.Exception -> L30
            com.wakeup.common.network.entity.ai.FileToTextResultBean2 r9 = (com.wakeup.common.network.entity.ai.FileToTextResultBean2) r9     // Catch: java.lang.Exception -> L30
            java.lang.String r9 = r9.getFullText()     // Catch: java.lang.Exception -> L30
            r8.<init>(r0, r9)     // Catch: java.lang.Exception -> L30
            return r8
        L82:
            int r8 = r9.getCode()     // Catch: java.lang.Exception -> L30
            r9 = 100013(0x186ad, float:1.40148E-40)
            if (r8 != r9) goto L95
            kotlin.Pair r8 = new kotlin.Pair     // Catch: java.lang.Exception -> L30
            java.lang.Integer r9 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r5)     // Catch: java.lang.Exception -> L30
            r8.<init>(r9, r4)     // Catch: java.lang.Exception -> L30
            return r8
        L95:
            kotlin.Pair r8 = new kotlin.Pair     // Catch: java.lang.Exception -> L30
            java.lang.Integer r9 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r3)     // Catch: java.lang.Exception -> L30
            r8.<init>(r9, r4)     // Catch: java.lang.Exception -> L30
            return r8
        L9f:
            r8 = move-exception
            r7 = r6
        La1:
            java.lang.String r7 = r7.TAG
            java.lang.String r8 = r8.getMessage()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "queryTask fail e "
            r9.<init>(r0)
            java.lang.StringBuilder r8 = r9.append(r8)
            java.lang.String r8 = r8.toString()
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            com.wakeup.common.log.LogUtils.i(r7, r8)
            kotlin.Pair r7 = new kotlin.Pair
            java.lang.Integer r8 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r3)
            r7.<init>(r8, r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.module.ai.port.BigFileAsrPort.queryFileToTextStatus(int, com.wakeup.common.network.entity.ai.FileToTextBean2, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
