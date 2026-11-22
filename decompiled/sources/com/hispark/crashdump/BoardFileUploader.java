package com.hispark.crashdump;

import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* compiled from: CrashDumpModels.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J>\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nH¦@¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/hispark/crashdump/BoardFileUploader;", "", "uploadFile", "", "deviceId", "", "localFile", "Ljava/io/File;", "remoteDirPath", "onProgress", "Lkotlin/Function1;", "Lcom/hispark/crashdump/DumpFileTransferProgress;", "", "(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BoardFileUploader {
    Object uploadFile(String str, File file, String str2, Function1<? super DumpFileTransferProgress, Unit> function1, Continuation<? super Boolean> continuation);

    /* compiled from: CrashDumpModels.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object uploadFile$default(BoardFileUploader boardFileUploader, String str, File file, String str2, Function1 function1, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadFile");
            }
            if ((i & 8) != 0) {
                function1 = null;
            }
            return boardFileUploader.uploadFile(str, file, str2, function1, continuation);
        }
    }
}
