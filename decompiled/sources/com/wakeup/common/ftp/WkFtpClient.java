package com.wakeup.common.ftp;

import android.gov.nist.core.Separators;
import com.wakeup.common.log.LogUtils;
import com.wakeup.module.device.work.BleFailStage;
import java.time.Duration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.apache.commons.net.ftp.FTPClient;

/* compiled from: WkFtpClient.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u000fJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0086@¢\u0006\u0002\u0010\u0014J8\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00052\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u001aH\u0086@¢\u0006\u0002\u0010\u001bJ\u0016\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u001dJ@\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00052\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00160\u001aH\u0086@¢\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0005H\u0002J\u0006\u0010#\u001a\u00020\u0016J\u0006\u0010$\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/wakeup/common/ftp/WkFtpClient;", "", "<init>", "()V", "TAG", "", "BUFFER_SIZE", "", "ftpClient", "Lorg/apache/commons/net/ftp/FTPClient;", BleFailStage.CONNECT, "", "host", "user", "pwd", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFileList", "", "Lcom/wakeup/common/ftp/RemoteFile;", "dirPath", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadFile", "", "remoteFile", "localPath", "callback", "Lkotlin/Function2;", "(Lcom/wakeup/common/ftp/RemoteFile;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFile", "(Lcom/wakeup/common/ftp/RemoteFile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadFile", "fileName", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fixFileName", "disconnect", "isConnected", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WkFtpClient {
    private final FTPClient ftpClient;
    private final String TAG = "WkFtpClient";
    private final int BUFFER_SIZE = 8192;

    public WkFtpClient() {
        FTPClient fTPClient = new FTPClient();
        fTPClient.setControlEncoding("UTF-8");
        fTPClient.setConnectTimeout(15000);
        fTPClient.setDefaultTimeout(30000);
        fTPClient.setDataTimeout(Duration.ofSeconds(30L));
        this.ftpClient = fTPClient;
    }

    public final Object connect(String str, String str2, String str3, Continuation<? super Boolean> continuation) {
        if (this.ftpClient.isConnected()) {
            return Boxing.boxBoolean(true);
        }
        LogUtils.i(this.TAG, "connect start");
        return BuildersKt.withContext(Dispatchers.getIO(), new WkFtpClient$connect$2(this, str, str2, str3, null), continuation);
    }

    public static /* synthetic */ Object getFileList$default(WkFtpClient wkFtpClient, String str, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return wkFtpClient.getFileList(str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getFileList(java.lang.String r6, kotlin.coroutines.Continuation<? super java.util.List<com.wakeup.common.ftp.RemoteFile>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.wakeup.common.ftp.WkFtpClient$getFileList$1
            if (r0 == 0) goto L14
            r0 = r7
            com.wakeup.common.ftp.WkFtpClient$getFileList$1 r0 = (com.wakeup.common.ftp.WkFtpClient$getFileList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            com.wakeup.common.ftp.WkFtpClient$getFileList$1 r0 = new com.wakeup.common.ftp.WkFtpClient$getFileList$1
            r0.<init>(r5, r7)
        L19:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.L$0
            com.wakeup.common.ftp.WkFtpClient r6 = (com.wakeup.common.ftp.WkFtpClient) r6
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Exception -> L2e
            return r7
        L2e:
            r7 = move-exception
            goto L7a
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.String r7 = r5.TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "getFileList dirPath: "
            r2.<init>(r4)
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            com.wakeup.common.log.LogUtils.i(r7, r2)
            boolean r7 = r5.isConnected()
            if (r7 != 0) goto L5e
            java.util.List r6 = kotlin.collections.CollectionsKt.emptyList()
            return r6
        L5e:
            kotlinx.coroutines.CoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getIO()     // Catch: java.lang.Exception -> L78
            kotlin.coroutines.CoroutineContext r7 = (kotlin.coroutines.CoroutineContext) r7     // Catch: java.lang.Exception -> L78
            com.wakeup.common.ftp.WkFtpClient$getFileList$2 r2 = new com.wakeup.common.ftp.WkFtpClient$getFileList$2     // Catch: java.lang.Exception -> L78
            r4 = 0
            r2.<init>(r5, r6, r4)     // Catch: java.lang.Exception -> L78
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2     // Catch: java.lang.Exception -> L78
            r0.L$0 = r5     // Catch: java.lang.Exception -> L78
            r0.label = r3     // Catch: java.lang.Exception -> L78
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r7, r2, r0)     // Catch: java.lang.Exception -> L78
            if (r6 != r1) goto L77
            return r1
        L77:
            return r6
        L78:
            r7 = move-exception
            r6 = r5
        L7a:
            java.lang.String r6 = r6.TAG
            java.lang.String r0 = "getFileList error: "
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            com.wakeup.common.log.LogUtils.e(r6, r0, r7)
            java.util.List r6 = kotlin.collections.CollectionsKt.emptyList()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.common.ftp.WkFtpClient.getFileList(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object downloadFile(RemoteFile remoteFile, String str, Function2<? super Integer, ? super String, Unit> function2, Continuation<? super Unit> continuation) {
        if (!isConnected()) {
            return Unit.INSTANCE;
        }
        LogUtils.i(this.TAG, "downloadFile remoteFile: " + remoteFile.getFileName() + " ,fileSize: " + remoteFile.getFileSize() + " start");
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new WkFtpClient$downloadFile$2(remoteFile, str, this, function2, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public final Object deleteFile(RemoteFile remoteFile, Continuation<? super Boolean> continuation) {
        if (!isConnected()) {
            return Boxing.boxBoolean(false);
        }
        LogUtils.i(this.TAG, "deleteFile remoteFile: " + remoteFile.getFileName());
        return BuildersKt.withContext(Dispatchers.getIO(), new WkFtpClient$deleteFile$2(this, remoteFile, null), continuation);
    }

    public final Object uploadFile(String str, String str2, String str3, Function2<? super Integer, ? super Long, Unit> function2, Continuation<? super Unit> continuation) {
        if (!isConnected()) {
            LogUtils.i(this.TAG, "uploadFile is not Connected");
            function2.invoke(Boxing.boxInt(-1), Boxing.boxLong(0L));
            return Unit.INSTANCE;
        }
        LogUtils.i(this.TAG, "uploadFile dir: " + str2 + ", fileName:" + str3);
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new WkFtpClient$uploadFile$2(this, str2, function2, str3, str, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String fixFileName(String fileName) {
        return StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(fileName, " ", "", false, 4, (Object) null), "[", "", false, 4, (Object) null), "]", "", false, 4, (Object) null), Separators.LESS_THAN, "", false, 4, (Object) null), Separators.GREATER_THAN, "", false, 4, (Object) null), "《", "", false, 4, (Object) null), "》", "", false, 4, (Object) null), "》", "", false, 4, (Object) null);
    }

    public final void disconnect() {
        LogUtils.i(this.TAG, "disconnect");
        try {
            if (this.ftpClient.isConnected()) {
                this.ftpClient.disconnect();
            }
        } catch (Exception e) {
            LogUtils.e(this.TAG, "disconnect error: ", e);
        }
    }

    public final boolean isConnected() {
        return this.ftpClient.isConnected();
    }
}
