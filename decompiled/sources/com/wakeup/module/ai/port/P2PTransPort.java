package com.wakeup.module.ai.port;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.io.File;
import kotlin.Metadata;

/* compiled from: P2PTransPort.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/wakeup/module/ai/port/P2PTransPort;", "", "<init>", "()V", "TAG", "", "startOcr", "Landroid/graphics/Bitmap;", "projectId", "", "toLanguageId", "file", "Ljava/io/File;", "(IILjava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMimeType", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class P2PTransPort {
    private final String TAG = "P2PTransPort";

    /* JADX WARN: Removed duplicated region for block: B:14:0x0091 A[Catch: Exception -> 0x0030, TRY_LEAVE, TryCatch #0 {Exception -> 0x0030, blocks: (B:11:0x002c, B:12:0x0087, B:14:0x0091), top: B:10:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object startOcr(int r9, int r10, java.io.File r11, kotlin.coroutines.Continuation<? super android.graphics.Bitmap> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.wakeup.module.ai.port.P2PTransPort$startOcr$1
            if (r0 == 0) goto L14
            r0 = r12
            com.wakeup.module.ai.port.P2PTransPort$startOcr$1 r0 = (com.wakeup.module.ai.port.P2PTransPort$startOcr$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r12 = r0.label
            int r12 = r12 - r2
            r0.label = r12
            goto L19
        L14:
            com.wakeup.module.ai.port.P2PTransPort$startOcr$1 r0 = new com.wakeup.module.ai.port.P2PTransPort$startOcr$1
            r0.<init>(r8, r12)
        L19:
            r6 = r0
            java.lang.Object r12 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r2 = 1
            r7 = 0
            if (r1 == 0) goto L3c
            if (r1 != r2) goto L34
            java.lang.Object r9 = r6.L$0
            com.wakeup.module.ai.port.P2PTransPort r9 = (com.wakeup.module.ai.port.P2PTransPort) r9
            kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Exception -> L30
            goto L87
        L30:
            r0 = move-exception
            r10 = r0
            goto La7
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.String r12 = r8.getMimeType(r11)
            okhttp3.RequestBody$Companion r1 = okhttp3.RequestBody.INSTANCE
            if (r12 == 0) goto L4e
            okhttp3.MediaType$Companion r3 = okhttp3.MediaType.INSTANCE
            okhttp3.MediaType r12 = r3.parse(r12)
            goto L4f
        L4e:
            r12 = r7
        L4f:
            okhttp3.RequestBody r12 = r1.create(r12, r11)
            okhttp3.MultipartBody$Part$Companion r1 = okhttp3.MultipartBody.Part.INSTANCE
            java.lang.String r3 = "file"
            java.lang.String r11 = r11.getName()
            okhttp3.MultipartBody$Part r4 = r1.createFormData(r3, r11, r12)
            com.wakeup.commponent.module.ai.DeviceChannel r11 = com.wakeup.commponent.module.ai.DeviceChannel.INSTANCE
            java.lang.String r11 = r11.getImageTransUrl()
            com.wakeup.commponent.module.ai.DeviceChannel r12 = com.wakeup.commponent.module.ai.DeviceChannel.INSTANCE
            java.util.Map r9 = r12.getHeads(r9)
            java.util.Map r3 = kotlin.collections.MapsKt.toMutableMap(r9)
            com.wakeup.common.network.RetrofitManager$Companion r9 = com.wakeup.common.network.RetrofitManager.INSTANCE     // Catch: java.lang.Exception -> La4
            com.wakeup.common.network.RetrofitManager r9 = r9.getInstance()     // Catch: java.lang.Exception -> La4
            com.wakeup.common.network.api.WKAiSignService r1 = r9.getApiWkAiSign()     // Catch: java.lang.Exception -> La4
            r6.L$0 = r8     // Catch: java.lang.Exception -> La4
            r6.label = r2     // Catch: java.lang.Exception -> La4
            r5 = r10
            r2 = r11
            java.lang.Object r12 = r1.imageTrans(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> La4
            if (r12 != r0) goto L86
            return r0
        L86:
            r9 = r8
        L87:
            retrofit2.Response r12 = (retrofit2.Response) r12     // Catch: java.lang.Exception -> L30
            int r10 = r12.code()     // Catch: java.lang.Exception -> L30
            r11 = 200(0xc8, float:2.8E-43)
            if (r10 != r11) goto La3
            java.lang.Object r10 = r12.body()     // Catch: java.lang.Exception -> L30
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)     // Catch: java.lang.Exception -> L30
            okhttp3.ResponseBody r10 = (okhttp3.ResponseBody) r10     // Catch: java.lang.Exception -> L30
            java.io.InputStream r10 = r10.byteStream()     // Catch: java.lang.Exception -> L30
            android.graphics.Bitmap r9 = android.graphics.BitmapFactory.decodeStream(r10)     // Catch: java.lang.Exception -> L30
            return r9
        La3:
            return r7
        La4:
            r0 = move-exception
            r10 = r0
            r9 = r8
        La7:
            java.lang.String r9 = r9.TAG
            java.lang.String r10 = r10.getMessage()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "startOcr error: "
            r11.<init>(r12)
            java.lang.StringBuilder r10 = r11.append(r10)
            java.lang.String r10 = r10.toString()
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            com.wakeup.common.log.LogUtils.e(r9, r10)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.module.ai.port.P2PTransPort.startOcr(int, int, java.io.File, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final String getMimeType(File file) {
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(file).toString()));
    }
}
