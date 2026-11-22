package com.wakeup.module.ai.port;

import com.blankj.utilcode.util.FileUtils;
import com.wakeup.common.network.BaseObserver;
import com.wakeup.common.network.NetworkScheduler;
import com.wakeup.common.network.RetrofitManager;
import com.wakeup.common.network.entity.other.WKAsrResult;
import com.wakeup.commponent.module.ai.DeviceChannel;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* compiled from: ASRSinglePort.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\fJ2\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/wakeup/module/ai/port/ASRSinglePort;", "", "<init>", "()V", "start", "", "languageId", "", "filePath", "", "function", "callback", "Lkotlin/Function2;", "startSync", "Lkotlin/Pair;", "(ILjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ASRSinglePort {
    public final void start(int languageId, String filePath, int function, final Function2<? super Integer, ? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!FileUtils.isFileExists(filePath)) {
            callback.invoke(-1, "onFail file absent");
            return;
        }
        String asrSingleUrl = DeviceChannel.INSTANCE.getAsrSingleUrl(languageId);
        File file = new File(filePath);
        MultipartBody.Part createFormData = MultipartBody.Part.INSTANCE.createFormData("file", file.getName(), RequestBody.INSTANCE.create(MediaType.INSTANCE.parse("multipart/form-data"), file));
        RetrofitManager.INSTANCE.getInstance().getApiWkAiSign().postAudioFile(asrSingleUrl, DeviceChannel.INSTANCE.getHeads(function), createFormData).compose(NetworkScheduler.INSTANCE.compose()).subscribe(new BaseObserver<WKAsrResult>() { // from class: com.wakeup.module.ai.port.ASRSinglePort$start$1
            @Override // com.wakeup.common.network.BaseObserver
            public void onSuccess(WKAsrResult data) {
                Intrinsics.checkNotNullParameter(data, "data");
                callback.invoke(0, data.getResult());
            }

            @Override // com.wakeup.common.network.BaseObserver
            public void onFail(int code, String msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                callback.invoke(-1, "onFail code:" + code + ", msg: " + msg);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008d A[Catch: Exception -> 0x00ae, TryCatch #0 {Exception -> 0x00ae, blocks: (B:10:0x0027, B:11:0x0085, B:13:0x008d, B:16:0x00a1, B:25:0x0072), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a1 A[Catch: Exception -> 0x00ae, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ae, blocks: (B:10:0x0027, B:11:0x0085, B:13:0x008d, B:16:0x00a1, B:25:0x0072), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object startSync(int r7, java.lang.String r8, int r9, kotlin.coroutines.Continuation<? super kotlin.Pair<java.lang.Integer, java.lang.String>> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.wakeup.module.ai.port.ASRSinglePort$startSync$1
            if (r0 == 0) goto L14
            r0 = r10
            com.wakeup.module.ai.port.ASRSinglePort$startSync$1 r0 = (com.wakeup.module.ai.port.ASRSinglePort$startSync$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r10 = r0.label
            int r10 = r10 - r2
            r0.label = r10
            goto L19
        L14:
            com.wakeup.module.ai.port.ASRSinglePort$startSync$1 r0 = new com.wakeup.module.ai.port.ASRSinglePort$startSync$1
            r0.<init>(r6, r10)
        L19:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            r4 = -1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Exception -> Lae
            goto L85
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            kotlin.ResultKt.throwOnFailure(r10)
            boolean r10 = com.blankj.utilcode.util.FileUtils.isFileExists(r8)
            if (r10 != 0) goto L47
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r4)
            java.lang.String r8 = "onFail file absent"
            kotlin.Pair r7 = kotlin.TuplesKt.to(r7, r8)
            return r7
        L47:
            com.wakeup.commponent.module.ai.DeviceChannel r10 = com.wakeup.commponent.module.ai.DeviceChannel.INSTANCE
            java.lang.String r7 = r10.getAsrSingleUrl(r7)
            java.io.File r10 = new java.io.File
            r10.<init>(r8)
            okhttp3.RequestBody$Companion r8 = okhttp3.RequestBody.INSTANCE
            okhttp3.MediaType$Companion r2 = okhttp3.MediaType.INSTANCE
            java.lang.String r5 = "multipart/form-data"
            okhttp3.MediaType r2 = r2.parse(r5)
            okhttp3.RequestBody r8 = r8.create(r2, r10)
            okhttp3.MultipartBody$Part$Companion r2 = okhttp3.MultipartBody.Part.INSTANCE
            java.lang.String r5 = "file"
            java.lang.String r10 = r10.getName()
            okhttp3.MultipartBody$Part r8 = r2.createFormData(r5, r10, r8)
            com.wakeup.commponent.module.ai.DeviceChannel r10 = com.wakeup.commponent.module.ai.DeviceChannel.INSTANCE
            java.util.Map r9 = r10.getHeads(r9)
            com.wakeup.common.network.RetrofitManager$Companion r10 = com.wakeup.common.network.RetrofitManager.INSTANCE     // Catch: java.lang.Exception -> Lae
            com.wakeup.common.network.RetrofitManager r10 = r10.getInstance()     // Catch: java.lang.Exception -> Lae
            com.wakeup.common.network.api.WKAiSignService r10 = r10.getApiWkAiSign()     // Catch: java.lang.Exception -> Lae
            r0.label = r3     // Catch: java.lang.Exception -> Lae
            java.lang.Object r10 = r10.postAudioFileSync(r7, r9, r8, r0)     // Catch: java.lang.Exception -> Lae
            if (r10 != r1) goto L85
            return r1
        L85:
            com.wakeup.common.network.BaseResult r10 = (com.wakeup.common.network.BaseResult) r10     // Catch: java.lang.Exception -> Lae
            boolean r7 = r10.isSuccess()     // Catch: java.lang.Exception -> Lae
            if (r7 == 0) goto La1
            r7 = 0
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r7)     // Catch: java.lang.Exception -> Lae
            java.lang.Object r8 = r10.getData()     // Catch: java.lang.Exception -> Lae
            com.wakeup.common.network.entity.other.WKAsrResult r8 = (com.wakeup.common.network.entity.other.WKAsrResult) r8     // Catch: java.lang.Exception -> Lae
            java.lang.String r8 = r8.getResult()     // Catch: java.lang.Exception -> Lae
            kotlin.Pair r7 = kotlin.TuplesKt.to(r7, r8)     // Catch: java.lang.Exception -> Lae
            return r7
        La1:
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r4)     // Catch: java.lang.Exception -> Lae
            java.lang.String r8 = r10.getMsg()     // Catch: java.lang.Exception -> Lae
            kotlin.Pair r7 = kotlin.TuplesKt.to(r7, r8)     // Catch: java.lang.Exception -> Lae
            return r7
        Lae:
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r4)
            java.lang.String r8 = "error"
            kotlin.Pair r7 = kotlin.TuplesKt.to(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.module.ai.port.ASRSinglePort.startSync(int, java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
